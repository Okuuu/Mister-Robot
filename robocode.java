package man;
import robocode.*;

public class mrRobot extends Robot {
    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
            setBodyColor (Color.red);
            setBulletColor (Color.black);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(3);
    }

    public void onHitByBullet(hitByBulletEvent e){
        back(200);
    }
}

    //public void onHitWall()