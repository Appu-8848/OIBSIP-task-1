import java.util.Scanner;
import java.util.*;
public class Main {
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;
    void accept()
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=SC.nextLine();
        System.out.print("Enter your coach: ");
        coach=SC.nextLine();
        System.out.print("Enter mobile number: ");
        mobno=SC.nextLong();
        System.out.print("Enter the amount: ");
        amt=SC.nextInt();

    }
    void update()
    {

        if(coach.equals("1"))
        {
            totalamt=amt+700;
        }
        else if(coach.equals("2"))
        {
            totalamt=amt+500;
        }
        else if(coach.equals("3"))
        {
            totalamt=amt+250;
        }
        else if(coach.equals("sleeper"))
        {
            totalamt=amt;
        }
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Coach: "+coach);
        System.out.println("Mobile no: "+mobno);
        System.out.println("Amount: "+ amt);
        System.out.println("Totalamount: "+totalamt);
    }
    public static void main(String[] args)
    {
        Main railwayticket=new Main();
        railwayticket.accept();
        railwayticket.update();
        railwayticket.display();

    }

}