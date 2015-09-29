package HundredDoors;

/**
 * Created by lang on 2015/8/15.
 */
public class HundredDoors {
    public static boolean[] doors=new boolean[100];
    public static void openClose(){
        int i = 0;
        for (i = 0 ; i < 49; i++)
            for ( int k = 0;k <=9; k = k + i+1)
                    doors[k] = !doors[k];
        for(;i <= 99;i++)
            doors[i] = !doors[i];
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
