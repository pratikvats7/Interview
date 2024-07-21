package Java.designpatterns.builderdesignpattern;

import lombok.Data;

@Data
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    private Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    public static class Builder {
        private String make;
        private String model;
        private int year;
        private String color;

        public Builder withMake(String make) {
            this.make = make;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder withYear(int year) {
            this.year = year;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
