package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    private Map<BulletType, Bullet> bullets = new HashMap<>();

    public void addBullet(Bullet bullet) {
        bullets.put(bullet.getBulletType(), bullet);
    }

    public Bullet getBullet(BulletType bulletType) {
        return bullets.get(bulletType);
    }
}
