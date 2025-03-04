package designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .model("Civic")
                .color("White")
                .maxSpeed(200)
                .build();
        System.out.println(car);
    }
}
