package lsj.basic.day08;

public class Person {
    public static void main(String[] args) {
        PersonInfo pi = new PersonInfo();
        pi.setName("이승준");
        pi.setGender("남");
        pi.setAge(23);
        pi.setHeight(182);
        pi.setWeight(60);

        System.out.println(pi.getName());
        System.out.println(pi.getGender());
        System.out.println(pi.getAge());
        System.out.println(pi.getHeight());
        System.out.println(pi.getWeight());
    }
}

class PersonInfo{
    private String name;
    private String gender;
    private int age;
    private int height;
    private int weight;

    public PersonInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
