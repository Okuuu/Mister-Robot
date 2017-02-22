package man;
import robocode.*;

public class mrRobot extends Robot {
    public void run() {
        while (true) {
            ahead(20);
            turnGunRight(360);
			ahead(20);
			turnGunRight(360);
			ahead(20);
			turnGunRight(360);
			ahead(20);
            turnRight(120);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double distance = e.getDistance();

        if(distance<200)
        {
            fire(3);
			turnGunRight(5);
			fire(3);
			turnGunRight(5);
			fire(3);
        }
        else if(distance<500)
        {
            fire(2.5);
			turnGunRight(5);
			fire(2.5);
			turnGunRight(5);
			fire(2.5);
        }
        else if(distance<800)
        {
            fire(1.5);
			turnGunRight(5);
			fire(1.5);
			turnGunRight(5);
			fire(1.5);
        }
        else
        {
            fire(0.5);
			fire(0.5);
			fire(0.5);
        }
		turnRight(20);
		ahead(30);
    }

    public void onHitByBullet(HitByBulletEvent event){	
		turnRight(20);
		ahead(20);
    }

    public void onHitWall(HitWallEvent e){      
		turnRight(30);
    }
}