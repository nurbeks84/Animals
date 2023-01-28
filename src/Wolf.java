public class Wolf extends Animal{
    String name;
    int age;

    @Override
    public void Attack() {
        System.out.println("powerful");
    }

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

    public Wolf(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
