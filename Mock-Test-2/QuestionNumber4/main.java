package QuestionNumber4;

interface  Drawable{
    public  void draw();

}
class Circle implements Drawable{
   public void draw(){
        System.out.println("Draw a Circle");
    }

}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Draw a Rectangle");
    }
}

public class main {
    public static void main(String[] args) {
Circle c= new Circle();
c.draw();
Rectangle r= new Rectangle();
r.draw();

    }
}
