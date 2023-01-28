import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      /*  List<Integer>animal = new LinkedList<>();
        animal.add(new Cat("Tom",9).getAge());
        int sum = 0;
        for (int a:animal) {
            sum+=a;

        }
        System.out.println(sum); */

        Animal wolf = new Wolf("Akella", 20); //is pol
        Animal wolf1 = new Wolf("Akella", 20);
        Animal dolphin = new Dolphin("Jenna", 15);
        Animal bear = new Bear("Balu", 30);
        Animal[] animals = {wolf,dolphin,bear,wolf1};
        for (Animal animal:animals) {
            if (animal.getClass()==Dolphin.class){
                animal.Swimming();
            } else if (animal.getClass()==Wolf.class) {
                animal.Attack();
            }else {
                animal.Eating();
            }
        }
    }

}