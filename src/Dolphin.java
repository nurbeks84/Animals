public class Dolphin extends Animal{
    @Override
    public void Swimming() {
        System.out.println("fast");;
    }

    public Dolphin(String name, int age) {
        this.name = name;
        this.age = age;

    }

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
