package systemdesign.solid.openclose;

public class CorrectCode {

    static abstract class Shape{
        abstract void area();
    }

    static class Circle extends Shape{
        @Override
        void area() {
            System.out.println("Area of circle: πr²");
        }
    }

    static class Rectangle extends Shape{
        @Override
        void area() {
            System.out.println("Area of rectangle: length × breadth");
        }
    }

    static class Triangle extends Shape{
        @Override
        void area() {
            System.out.println("Area of triangle: 0.5 × base × height");
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.area();

        Shape rectangle = new Rectangle();
        rectangle.area();

        Shape triangle = new Triangle();
        triangle.area();
    }

    //To add a new shape like triangle, we can simply create a new class Triangle that extends Shape without modifying existing code but just extending, hence adhering to OCP leading to correct code
}
