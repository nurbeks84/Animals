public class Bear extends Animal{
    @Override
    public void Eating() {
        System.out.println("more");
    }

    public Bear(String name, int age) {
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
        return "Bear{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
