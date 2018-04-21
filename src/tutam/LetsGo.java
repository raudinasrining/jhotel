package tutam;

/**
 *
 * @author Raudina Asrining Putri
 * @version 21-04-2018
 *
 */

import java.util.Random;

public class LetsGo {
    public static int random(){
        int min = 100;
        int max = 500;
        return new Random().nextInt((max-min))+min;
    }

    public static void main(String[] args){
        int a,b,c;
        do {
            a = random();
            b = random();
            c = random();
        }while(!(a>b && b>c));

        RunForYourLife Lionel = new RunForYourLife("Lionel",a);
        Lionel.start();
        RunForYourLife Andres = new RunForYourLife("Andres",b);
        Andres.start();
        RunForYourLife Messi = new RunForYourLife("Messi",c);
        Messi.start();
    }
}
