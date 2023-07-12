package QuestionNumber2;

abstract class Shape {
  abstract double calculateArea();
}

class Rectangle extends Shape {
  private double width, height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  double calculateArea() {
    return width * height;
  }
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double calculateArea() {
    return Math.PI * radius * radius;
  }
}

class Triangle extends Shape {
  private double base, height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  @Override
  double calculateArea() {
    return (base * height) / 2;
  }
}

class ShapeCalculator {
  public void printArea(Shape shape) {
    System.out.println("The area of the shape is " + shape.calculateArea());
  }
}

public class PolymorphismDemo {
  public static void main(String[] args) {
    ShapeCalculator calculator = new ShapeCalculator();

    Rectangle rectangle = new Rectangle(10, 5);
    calculator.printArea(rectangle);

    Circle circle = new Circle(5);
    calculator.printArea(circle);

    Triangle triangle = new Triangle(10, 5);
    calculator.printArea(triangle);
  }
}
