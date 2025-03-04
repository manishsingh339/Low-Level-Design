package designpatterns.builder;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;

    private Car(Builder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    public static class Builder {
        private String model;
        private String color;
        private int maxSpeed;

        public Builder() {
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder maxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
