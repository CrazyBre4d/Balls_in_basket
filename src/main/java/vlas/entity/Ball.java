package vlas.entity;

public abstract class Ball {

   protected String material;
   protected double diameter;

    public Ball(String material, double diameter) {
        this.material = material;
        this.diameter = diameter;
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

    public abstract void jump();
    public abstract void blowUp();
    public abstract void inflate();
}
