package QuestionNumber1;


 class Animal{
    public void makesound(){
        System.out.println("Make sound");
    }

}

class Dog extends Animal{
    public void makesound(){
        System.out.println("Vo Vo Vo");
    }
}

class Cat extends Animal{
    public void makesound(){
        System.out.println("mio mio mio");
    }

}

class Cow extends Animal{
    public void makesound(){
        System.out.println("maaa maaaa");
    }
}
public class  One {
    public static void main(String[] args) {
        Animal a= new Animal();
        a.makesound();
        a = new Dog();
        a.makesound();




    }
}
