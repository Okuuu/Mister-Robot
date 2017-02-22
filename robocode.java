package man;
import robocode.*;

public class mrRobot extends Robot {
    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            turnRight(90);
			setBodyColor(new Color(0, 200, 0));
			setGunColor(new Color(0, 150, 50));
			setRadarColor(new Color(0, 100, 100));
			setBulletColor(new Color(255, 255, 100));
			setScanColor(new Color(255, 200, 200));
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
        turnRight(30);
		ahead(50);
    }


    public void onHitByBullet(HitByBulletEvent event) {
        back(200);
    }

    public void onHitWall(HitWallEvent e) {
        turnRight(90);
    }
}