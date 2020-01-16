package collections;

import java.util.*;

class Person implements Comparable<Person>{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Name: " + name + "Age: " + age;
    }
}

public class ListSort {
    public static void main(String[] args) {

        List<Person> ints = new ArrayList<>();
        ints.add(new Person("吕雪", 30));
        ints.add(new Person("刘英杰", 13));
        ints.add(new Person("耿宏", 20));
        ints.add(new Person("魏浩冉", 28));
        ints.add(new Person("薛鑫", 68));
        ints.add(new Person("张刚", 10));
        ints.add(new Person("唐傲洋", 80));
        ints.add(new Person("伍航飞", 66));

        Collections.sort(ints);
        System.out.println("Naturing Sorting: " + ints);

        ints.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println("Sorting: " + ints);

    }

}
