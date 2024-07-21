package Flyweight;

public class Bullet {
    private String image;
    private double radius;
    private double weight;
    private BulletType bulletType;

    public Bullet(String image, double radius, double weight, BulletType bulletType) {
        this.image = image;
        this.radius = radius;
        this.weight = weight;
        this.bulletType = bulletType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }
}
