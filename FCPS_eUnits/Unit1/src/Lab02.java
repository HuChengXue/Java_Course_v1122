import edu.fcps.karel2.Display;

public class Lab02 {
    public static void main(String[] args){
        Display.openWorld("maps/maze.map");
        Display.setSize(8, 8);

        Athlete karel = new Athlete();

        karel.putAndMove();
        karel.turnRight();
        karel.putAndMove();
        karel.turnRight();
        karel.putAndMove();
        karel.turnLeft();
        karel.putAndMove();
        karel.turnLeft();
        karel.putAndMove();
        karel.turnRight();
        karel.putAndMove();
        karel.putAndMove();
        karel.turnRight();
        karel.putAndMove();
        karel.turnLeft();
        karel.putAndMove();
        karel.turnLeft();
        karel.putAndMove();
        karel.putAndMove();
        karel.putAndMove();
        karel.putAndMove();
        karel.turnRight();
        karel.putAndMove();
        karel.putAndMove();
    }
}
