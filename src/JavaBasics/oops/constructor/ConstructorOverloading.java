package JavaBasics.oops.constructor;

class Box{
    double length, width, height;

    // Constructor with one parameter
    Box(double side) {
        length = width = height = side;
    }

    // Constructor with three parameters
    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(){
        length = width = height = 0; // Default dimensions
    }

    double volume() {
        return length * width * height;
    }

}
public class ConstructorOverloading {

    public static void main(String[] args) {
        Box defaultBox = new Box();
        Box cubeBox = new Box(3);
        Box rectBox = new Box(2, 3, 4);

        System.out.println("Volume of default box: " + defaultBox.volume());
        System.out.println("Volume of cube box: " + cubeBox.volume());
        System.out.println("Volume of rectangular box: " + rectBox.volume());
    }
}
