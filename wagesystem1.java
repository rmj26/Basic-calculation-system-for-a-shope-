import java.util.Scanner;
public class wagesystem1 {

    private static Object working;

    public static void main (String [] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your gross sale for the day among all platforms");

        working = new working(input.nextInt());

    }

}
class working
{
    Scanner input= new Scanner(System.in);
    double sale;
    double wagecost;
    double tax;
    double profit;

working(int x)
{
    sale= x;
    double netsale= (x/100)*75;
    System.out.println("Your net sale after deduction is \t" + netsale);

    System.out.println("Enter your hours worked for the day");

    int y= input.nextInt();
     wagecost=y*6*2; // number of hours times hourly rate times number of workers

    System.out.println("Total wagecost for the day is " + wagecost);

    tax = (netsale-wagecost)*1.5/100;

    System.out.println("Tax deduction is " + tax);

    profit= netsale-wagecost-tax;

    System.out.println("Net profit for the day is " + profit);

}

}

