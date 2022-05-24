import java.util.Scanner;

/**
 * time dispaly
 */
public class time_dispaly {
    public static void main(String[] args) {
        //a program that shows hours,minutes and seconds
        Scanner number=new Scanner(System.in);
        System.out.println("enter the seconds");// this allows entry of minutes into the system
        int seconds=number.nextInt();
        int hours=seconds/3600;//this computes the hour in the given seconds
       
        int remainder=seconds-hours;
        int minutes=(remainder/60)%60;//this computes the minutes in the given seconds
        int second=seconds%60;//this computes the remaining seconds
        System.out.printf("%d:%d:%d",hours,minutes,second);
    }

    
}