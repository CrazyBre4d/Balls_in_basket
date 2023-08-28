package vlas.entity;

public class TennisBall extends Ball {
    String color;
    String material;
    double diameter;

    public TennisBall(String color, String material, double diameter) {
        this.color = color;
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "TennisBall{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", diameter=" + diameter +
                '}';
    }

    @Override
    public void blowUp() {

    }
}
