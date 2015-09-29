package HundredDoors;

/**
 * Created by lang on 2015/8/15.
 */
public class AnswerHunderDoors {
    public static boolean[] doors=new boolean[101];
    public static void openClose( ) {

            for (int i = 1; i <= 100; i++) {
                for (int j = i; j <= 100; j++) {
                    if(j % i == 0) doors[j] = !doors[j];
                }
            }
            for (int i = 1; i <= 100; i++) {
                System.out.printf("Door %d: %s%n", i, doors[i] ? "open" : "closed");
            }
    }
    public static void iniDoors()
    {

        for(int i=0;i<10;i++)
            doors[i*(i+2)]=true;
        for(int i=0;i<100;i++)
            System.out.println("Door #"+(i+1)+" is"+(doors[i]?"open.":" closed."));
    }
    public static void main(String[] args){
        iniDoors();
        openClose();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=0;i<100;i++)
            System.out.println("Door #"+(i+1)+" is"+(doors[i]?"open.":" closed."));
    }

}
