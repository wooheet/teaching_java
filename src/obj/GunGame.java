package obj;

public class GunGame {
    public static void main(String[] args) {
        Gun gun = new ShotGun("S12K");
        // Gun gun = new AssaultRifle("M416");

        gun.fire();
    }
}
