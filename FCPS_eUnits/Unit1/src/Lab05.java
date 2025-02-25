import edu.fcps.karel2.Display;

public class Lab05 {
    public static void runTheRace(Racer arg){
        arg.move();
        arg.shuttle(4, 7);
        arg.shuttle(6, 5);
        arg.shuttle(8, 3);
    }
    public static void main(String[] args){
        Display.openWorld("maps/shuttle.map");
        Display.setSize(10, 10);
        Display.setSpeed(10);

        Racer r1 = new Racer(1);
        Racer r2 = new Racer(4);
        Racer r3 = new Racer(7);

        runTheRace(r1);
        runTheRace(r2);
        runTheRace(r3);
    }
}
