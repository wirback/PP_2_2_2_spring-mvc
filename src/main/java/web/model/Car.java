package web.model;

public class Car {
    private final String model;
    private final Integer series;
    private final String color;

    public Car(String model, Integer series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", color=" + color +
                '}';
    }
}
