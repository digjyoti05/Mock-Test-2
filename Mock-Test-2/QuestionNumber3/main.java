package QuestionNumber3;

import javax.lang.model.element.Name;

class Person{
    private String Name;
    private  int age;
    private  String Address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

}

public class main {
    public static void main(String[] args) {
        Person p= new Person();
        p.setName("Digjyoti");
        p.setAge(20);
        p.setAddress("Bengaluru");
        System.out.println("My name is " + p.getName());
        System.out.println("My age is " + p.getAge());
        System.out.println("My Address is " + p.getAddress());

    }
}
