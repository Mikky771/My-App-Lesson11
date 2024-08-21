package app;

public class Main {
    // Головний метод для тестування програми
    public static void main(String[] args) {
        // Створення об'єктів класу Person
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        // Виведення інформації про осіб
        System.out.println("До оновлення:");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        // Створення об'єкта для тестування зміни професії
        Person person4 = new Person("Alice", 28, "Архітектор");

        // Виведення інформації про Alice до оновлення
        System.out.println("\nДо оновлення професії:");
        person4.displayInfo();

        // Оновлення професії
        person4.setProfession("Дизайнер");

        // Виведення інформації про Alice після оновлення
        System.out.println("\nПісля оновлення професії:");
        person4.displayInfo();
    }
}
