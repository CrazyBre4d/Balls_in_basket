package vlas.entity;

public class BasketballBall extends Ball {

    private boolean isAvailable;
    String material;
    double diameter;

    public BasketballBall(String material, double diameter, boolean isAvailable) {
       this.material = material;
       this.diameter = diameter;
       this.isAvailable = isAvailable;
    }
    @Override
    public String toString() {
        return "BasketballBall{" +
                "isAvailable=" + isAvailable +
                ", material='" + material + '\'' +
                ", diameter=" + diameter +
                '}';
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
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
}
