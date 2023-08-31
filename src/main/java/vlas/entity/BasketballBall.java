package vlas.entity;

import java.util.Objects;

public class BasketballBall extends Ball {

    private boolean isAvailable;

    public BasketballBall(String material, double diameter, boolean isAvailable) {
        super.diameter = diameter;
        super.material = material;
        this.isAvailable = isAvailable;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public void jump() {
        if (diameter != 0) {
            System.out.println("Мяч прыгнул!");
        }
        else throw new RuntimeException("Мяч порван");
    }

    @Override
    public void blowUp(){
        diameter = 0;
        System.out.println("Мяч взорвался!");
    }
    @Override
    public void inflate(){
        System.out.println("fdf");
    }
    @Override
    public String toString() {
        return "BasketballBall{" +
                "material='" + material + '\'' +
                ", diameter=" + diameter +
                ", isAvailable=" + isAvailable +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketballBall that = (BasketballBall) o;
        return isAvailable == that.isAvailable && Double.compare(that.diameter, diameter) == 0 && Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAvailable, material, diameter);
    }
}
