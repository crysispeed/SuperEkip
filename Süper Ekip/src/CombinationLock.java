/**
 * Created by çağlar on 7.4.2015.
 */
import java.util.Scanner;

public class CombinationLock {

    public static void main (String [] args){

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Give me numbers which you will create a combination lock.");
        System.out.println("First, give me your limit for lock. In other words give a number which includes that number of numbers a pin can get.");
        System.out.println("Then give me 3 number which aren't bigger than or equal your first number which you gave me.");
        System.out.println("Then I will calculate how many turns you need to unlock the combination lock.");

        int locklimit = keyboard.nextInt();
        int locknumber1 = keyboard.nextInt();
        int locknumber2 = keyboard.nextInt();
        int locknumber3 = keyboard.nextInt();


        int turnnumber;

        while(locknumber1>locklimit|locknumber2>locklimit|locknumber3>locklimit){


            System.out.println("You entered one of your number bigger than your limit. Enter your numbers carefully again");
            locklimit = keyboard.nextInt();
            locknumber1 = keyboard.nextInt();
            locknumber2 = keyboard.nextInt();
            locknumber3 = keyboard.nextInt();

        }

        turnnumber = locklimit*2+locknumber1+locklimit+Math.abs(locknumber1-locknumber2+locklimit)%locklimit+Math.abs(locknumber3-locknumber2+locklimit)%locklimit;


        System.out.println("You need to turn the wheel "+turnnumber+" times.");




    }



}
