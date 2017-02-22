package man;
import robocode.*;

public class mrRobot extends Robot {
    public void run() {
	
        while (true) {
            if(getOthers != 1){
                ahead(100);
                turnGunRight(360);
                turnRight(120);
                ahead(100);
            }
            else{
             turnGunRight(360);
            }
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

    public void onHitByBullet(HitByBulletEvent event){
		turnRight(30);
		ahead(50);
    }

    public void onHitWall(HitWallEvent e){
        turnRight(90);
    }
}