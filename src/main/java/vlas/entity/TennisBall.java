package vlas.entity;

import java.util.Objects;

public class TennisBall extends Ball {

     private String color;

    public TennisBall(String material, double diameter, String color ) {
        super(material,diameter);
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    @Override
    public void jump() {

    }

    @Override
    public void blowUp() {

    }

    @Override
    public void inflate() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TennisBall that = (TennisBall) o;
        return Double.compare(that.diameter, diameter) == 0 && Objects.equals(color, that.color) && Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, material, diameter);
    }

    @Override
    public String toString() {
        return "TennisBall{" +
                "material='" + material + '\'' +
                ", diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }
}
