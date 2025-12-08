package systemdesign.designpattern.builderpattern;

//if object to be created has too many fields, some of them optional, then create builder pattern to handle this complexity
public class IncorrectCode {
    static class Car{
        private String engine;
        private int wheels;
        private int seats;
        private String color;
        private boolean sunroof;
        private boolean navigationSystem;

        public Car(String engine, int wheels, int seats, String color, boolean sunroof, boolean navigationSystem){
            this.engine = engine;
            this.wheels = wheels;
            this.seats = seats;
            this.color = color;
            this.sunroof = sunroof;
            this.navigationSystem = navigationSystem;
        }
    }

    public static void main(String[] args) {
        Car car = new Car("V8", 4, 5, "Red", true, true);

        //now lets say we want to create car object, with onky 4 or 5 fields, and we dont want pass optional fields, for that we have
        //to create multiple constructors with different parameters, leading to constructor overloading problem
    }
}
