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
        double distance = e.getDistance();

        if(distance<200)
        {
            fire(3.5);
        }
        else if(distance<500)
        {
            fire(2.5);
        }
        else if(distance<800)
        {
            fire(1.5);
        }
        else
        {
            fire(0.5);
        }
    }


    public void onHitByBullet(HitByBulletEvent event) {
        back(200);
    }

    public void onHitWall(HitWallEvent e) {
        turnRight(90);
    }
}