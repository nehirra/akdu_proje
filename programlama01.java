import java.util.Scanner;

public class programlama01 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        // 1 Program to validate a Date
        
        System.out.println("Enter day:  ");
        int day = inp.nextInt();
        System.out.println("Enter month:  ");
        int month = inp.nextInt();
        System.out.println("Enter year:  ");
        int year = inp.nextInt(); 
        
        int x = 28;
        if((year % 4 == 0)&&(year % 100 != 0)||(year % 400 == 0)){
            x=29;
        }
        int[] aylar = {31,x,31,30,31,30,31,31,30,31,30,31};

        if (aylar[month-1]>= day) {
            System.out.println("This is a valid date.");
        } else {
            System.out.println("Not a valid date.");
        }

        //

    }
}
