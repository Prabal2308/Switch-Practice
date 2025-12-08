package systemdesign.designpattern.builderpattern;

public class CorrectCode {
    static class Car{
        private String engine;
        private int wheels;
        private int seats;
        private String color;
        private boolean sunroof;
        private boolean navigationSystem;

        private Car(CarBuilder builder){
            this.engine = builder.engine;
            this.wheels = builder.wheels;
            this.seats = builder.seats;
            this.color = builder.color;
            this.sunroof = builder.sunroof;
            this.navigationSystem = builder.navigationSystem;
        }

        static class CarBuilder{
            private String engine;
            private int wheels = 4;
            private int seats = 5;
            private String color = "BLACK";
            private boolean sunroof = false;
            private boolean navigationSystem = false;

            public CarBuilder setEngine(String engine){
                this.engine = engine;
                return this;
            }

            public CarBuilder setWheels(int wheels){
                this.wheels = wheels;
                return this;
            }

            public CarBuilder setSeats(int seats){
                this.seats = seats;
                return this;
            }

            public CarBuilder setColor(String color){
                this.color = color;
                return this;
            }

            public CarBuilder setSunroof(boolean sunroof){
                this.sunroof = sunroof;
                return this;
            }

            public CarBuilder setNavigationSystem(boolean navigationSystem){
                this.navigationSystem = navigationSystem;
                return this;
            }

            public Car build(){
                return new Car(this);
            }
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder()
                .setEngine("V6")
                .setColor("Red")
                .setSunroof(true)
                .build();

        Car car2 = new Car.CarBuilder()
                .setEngine("V8")
                .setSeats(7)
                .setNavigationSystem(true)
                .build();

        Car car3 = new Car.CarBuilder()
                .setEngine("Electric")
                .build();
    }

    //now we can craete car objects with only required fields, without the need to create multiple constructors

    //also new fields can be added in future without affecting existing code
}
