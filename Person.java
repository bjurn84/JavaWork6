/*Создать класс Person.
        У класса должны быть поля:
        1. Имя (String)
        2. Фамилия (String)
        3. Возраст (продумать тип)
        4. Пол
        5*. Придумать свои собственные поля

        Для этого класса
        1. Реализовать методы toString, equals и hashCode.
        2*. Придумать собственные методы и реализовать их

        В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
*/

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String occupation;
    private String nationality;
    private boolean hasChildren;

    public Person(String name, String surname, int age, String gender, String occupation, String nationality, boolean hasChildren) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.nationality = nationality;
        this.hasChildren = hasChildren;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean getHasChildren() {
        return hasChildren;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender +
                ", occupation=" + occupation + ", nationality=" + nationality + ", hasChildren=" + hasChildren + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age &&
                hasChildren == person.hasChildren &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(occupation, person.occupation) &&
                Objects.equals(nationality, person.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender, occupation, nationality, hasChildren);
    }

    public void introduce() {
        System.out.println("Привет, меня зовут " + name + " " + surname + ", мне " + age + " лет, я " + gender +
                " и я работаю " + occupation + ". Гражданство - " + nationality + ". Есть ли у меня дети? " + hasChildren);
    }

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Иван", "Иванов", 25, "М", "Программист", "Россия", false);
        people[1] = new Person("Петр", "Петров", 30, "М", "Учитель", "Россия", true);
        people[2] = new Person("Анна", "Сидорова", 18, "Ж", "Студентка", "Украина", false);
        people[3] = new Person("Александра", "Ковалева", 40, "Ж", "Врач", "Россия", true);
        people[4] = new Person("Валерий", "Жмышенко", 22, "М", "Студент", "Россия", false);

        for (Person person : people) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }
    }
}
