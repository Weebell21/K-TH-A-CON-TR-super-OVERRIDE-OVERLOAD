
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public void displayInfo() { //cần có cái này ở lớp cha chứ k thì Student đ có cc j để overide
        System.out.println("Name: " + name + ", Age: " + age);
    }

    
}