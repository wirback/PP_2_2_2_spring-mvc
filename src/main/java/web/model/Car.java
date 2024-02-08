package web.model;

public class Car {
    private final String model;
    private final int series;


    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }


    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }
}
