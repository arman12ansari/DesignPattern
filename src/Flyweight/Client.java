package Flyweight;

public class Client {
    public static void main(String[] args) {
        BulletRegistry bulletRegistry = new BulletRegistry();

        Bullet nineMM = new Bullet("9mm.png", 9.0, 0.1, BulletType.NINE_MM);
        Bullet elevenMM = new Bullet("11mm.png", 11.0, 0.2, BulletType.ELEVEN_MM);

        bulletRegistry.addBullet(nineMM);
        bulletRegistry.addBullet(elevenMM);

        FlyingBullet flyingBullet1 = new FlyingBullet(0, 0, 0, 0, bulletRegistry.getBullet(BulletType.NINE_MM));
        FlyingBullet flyingBullet2 = new FlyingBullet(67, 87, 98, 6, bulletRegistry.getBullet(BulletType.ELEVEN_MM));

    }
}
