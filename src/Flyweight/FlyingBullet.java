package Flyweight;

public class FlyingBullet {
    private double x,y,z;
    private double direction;
    private Bullet bullet;

    public FlyingBullet(double x, double y, double z, double direction, Bullet bullet) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
        this.bullet = bullet;
    }
}
