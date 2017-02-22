package man;
import robocode.*;

public class mrRobot extends Robot {
    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            turnRight(90);
            setBodyColor(Color red);
            setBulletColor(Color black);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(3);
    }


    public void onHitByBullet(HitByBulletEvent event) {
        back(200);
    }

    public void onHitWall(HitWallEvent e) {
        turnRight(90);
    }
}