package tutam;
/**
 * @author Raudina Asrining Putri
 * @version 21-04-2018
 */

public class RunForYourLife implements Runnable {
    private int delay;
    private String namathread;
    public static int checkpoints=20;

    public RunForYourLife(String namathread, int delay)
    {
        this.namathread=namathread;
        this.delay=delay;
        System.out.println(namathread + ", ready.");
    }

    public void run()
    {
        System.out.println(namathread + ", go!");
        for(int i = 0;i<checkpoints;i++){
            System.out.println(namathread + "\thas passed checkpoint (" + (i+1) + ")");
            try{
                Thread.sleep(delay);
            } catch(InterruptedException E){
                System.out.println(namathread + " was interrupted");
            }
        }
        System.out.println(namathread + " has finished!");
    }

    public void start(){
        System.out.println(namathread + ", set ...");
        (new Thread(this, namathread)).start();
    }
}
