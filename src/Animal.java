import java.util.Objects;

public class Animal {
    String name = "Васька";
    int age = 45;
    boolean tail = false;

    @Override
    public String toString() {
        return "Ім'я: " + name + ", вік: " + age + ", хвіст: ні";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
        System.out.println(animal.hashCode());
        System.out.println(animal.equals(animal));
    }
}
