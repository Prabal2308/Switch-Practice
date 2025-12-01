package systemdesign.solid.openclose;

public class IncorrectCode {
    static class Shape{
        private String type;

        Shape(String type){
            this.type = type;
        }

        void area() {
            if (type.equals("circle")) {
                System.out.println("Area of circle: πr²");
            } else if (type.equals("rectangle")) {
                System.out.println("Area of rectangle: length × breadth");
            }
        }
    }

    public static void main(String[] args) {
        Shape circle = new Shape("circle");
        circle.area();

        Shape rectangle = new Shape("rectangle");
        rectangle.area();
    }

    //Now to calculate the area of triangle, we need to modify the existin code of Shape class, which violates OCP, hence incorrect code
}
