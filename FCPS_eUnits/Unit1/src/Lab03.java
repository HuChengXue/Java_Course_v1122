import edu.fcps.karel2.Display;

public class Lab03 {
    public static void main(String[] args){
        Display.openWorld("maps/mountain.map");
        Display.setSize(16, 16);
        Display.setSpeed(10);

        Climber Robot1 = new Climber(8);
        Climber Robot2 = new Climber(8);

        Robot1.putBeeper();
        Robot2.putBeeper();
        Robot1.turnRight();
        Robot2.turnRight();
        Robot1.move();
        Robot2.move();
        Robot1.climbUpRight();
        Robot2.climbUpRight();
        Robot1.climbUpRight();
        Robot2.climbUpRight();
        Robot1.climbUpRight();
        Robot2.climbUpRight();
        Robot1.climbDownRight();
        Robot2.climbDownRight();
        Robot1.climbDownRight();
        Robot2.climbDownRight();
        Robot1.pickBeeper();
        Robot1.turnAround();
        Robot2.turnAround();
        Robot1.climbUpLeft();
        Robot2.climbUpLeft();
        Robot1.climbUpLeft();
        Robot2.climbUpLeft();
        Robot1.climbDownLeft();
        Robot2.climbDownLeft();
        Robot1.climbDownLeft();
        Robot2.climbDownLeft();
        Robot1.climbDownLeft();
        Robot2.climbDownLeft();
        Robot1.move();
        Robot2.move();
        Robot1.putBeeper();
    }
    
}
