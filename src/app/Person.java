package app;

public class Person {
    private String name;
    private int age;
    private String profession;

    // Конструктор класу
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Метод для виведення інформації про особу
    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }

    // Метод для зміни професії
    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }
}
