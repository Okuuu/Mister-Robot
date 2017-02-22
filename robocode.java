package man;
import robocode.*;

public class mrRobot extends Robot {
    public void run() {
        while (true) {
            ahead(100);
            back(100);

        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }
}