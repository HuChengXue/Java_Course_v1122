import edu.fcps.karel2.Display;

public class Lab04 {
    public static void takeTheFeild(Athlete arg){
        arg.move();
        arg.move();
        arg.move();
        arg.move();
        arg.turnRight();
        arg.move();
        arg.move();
    }
    public static void main(String[] args){
        Display.openWorld("maps/arena.map");
        Display.setSize(10, 10);
        Display.setSpeed(10);

        Athlete a1 = new Athlete();
        Athlete a2 = new Athlete();
        Athlete a3 = new Athlete();
        Athlete a4 = new Athlete();
        Athlete a5 = new Athlete();
        Athlete a6 = new Athlete();
        
        takeTheFeild(a1);
        a1.move();
        a1.move();
        a1.move();
        a1.turnLeft();
        a1.move();
        a1.move();
        a1.turnAround();
        takeTheFeild(a2);
        a2.move();
        a2.turnLeft();
        a2.move();
        a2.turnAround();
        takeTheFeild(a3);
        a3.move();
        a3.move();
        a3.move();
        a3.move();
        a3.move();
        a3.turnLeft();
        a3.move();
        a3.turnAround();
        takeTheFeild(a4);
        a4.move();
        a4.move();
        a4.move();
        a4.move();
        a4.turnRight();
        takeTheFeild(a5);
        a5.move();
        a5.move();
        a5.move();
        a5.turnRight();
        takeTheFeild(a6);
        a6.move();
        a6.move();
        a6.turnRight();

        Athlete coach = new Athlete(2,7,Display.EAST,0);
    }
    
}
