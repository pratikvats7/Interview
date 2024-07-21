package Java.designpatterns.builderdesignpattern;


class CarBuilderTest {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .withMake("Toyota")
                .withModel("Corolla")
                .withYear(2020)
                .withColor("Blue")
                .build();
        System.out.println(car);
    }

}