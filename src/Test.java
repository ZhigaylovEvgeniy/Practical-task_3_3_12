import java.util.Scanner;

/**
 * Создайте класс Human
 * с полями возраст (age),
 * имя (name),
 * фамилия (secondName) и
 * любимый вид спорта (favoriteSport).
 *
 * Создайте 3 конструктора в классе Human,
 * 1-ый - пустой,
 * 2-ой, который конструирует Human’a от всех полей
 * и третий, который конструирует Human’a, от всех полей, кроме любимого вида спорта.
 * Для успешного тестирования решения
 * важно объявлять аргументы в конструкторах именно в том порядке, в котором они написаны в данном описании
 * (возраст (age), имя (name), фамилия (secondName) и любимый вид спорта (favoriteSport))
 *
 * В методе main создайте 3 экземпляра человека используя 3 этих разных конструктора.
 * //поля класса должны иметь размерность, не превышающую необходимую.
 * //Класс должен быть объявлен статическим,
 * //метод main не должен находиться в классе,
 * //поля класса должны иметь доступ только внутри класса
 *
 * Требования:
 * 1. Должен быть метод public static void main(String[] args)
 * 2. Должен быть public static class Human
 * 3. У класс Human должны быть поля
 * 4. Класс Human должен иметь 3 конструктора
 * 5. В методе main нужно создать три объекта класса Human тремя способами
 */
public class Test {
    public static void main(String[] args) {
        for (;;) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите возрост:");
            byte a = (byte) (Integer.parseInt(s.nextLine()));

            System.out.println("Введите Имя:");
            String n = s.nextLine();

            System.out.println("Введите Фамилию:");
            String sN = s.nextLine();

            System.out.println("Введите любимый вид спорта:");
            String fS = s.nextLine();

            Human human2 = new Human(a, n, sN, fS);
            System.out.println("\nВЫ ВВЕЛИ:\nВозрост:\t\t\t" + human2.age + "\nИмя:\t\t\t\t"
                    + human2.name + "\nФамилия:\t\t\t"
                    + human2.secondName + "\nЛюбимый вид спорта:\t"
                    + human2.favoriteSport + "\n");
        }
    }

}

class Human{
    byte age;
    String name;
    String secondName;
    String favoriteSport;

    public Human() {

    }

    public Human(byte age, String name, String secondName, String favoriteSport) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.favoriteSport = favoriteSport;
    }

    public Human(byte age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }

}
