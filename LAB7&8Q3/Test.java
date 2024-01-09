
import java.util.Scanner;

class Test
{
    public static void main(String args[]) // i have added main method just to show output so that you can be assure that i implemented the exception correctly, you can remove the main method if you want
    {
    	
    	
        Scanner scan=new Scanner(System.in);
        System.out.print("enter name:");
        String name=scan.nextLine();
        Payroll pr=new Payroll(name, 0);

        System.out.print("enter id:");
        int id=scan.nextInt();
        System.out.print("enter hourly payrate:");
        double p=scan.nextDouble();
        System.out.print("enter number of hours worked:");
        double w=scan.nextDouble();
        pr.setName(name);
        pr.setIdNumber(id);
        pr.setPayRate(p);
        pr.setHoursWorked(w);
        
        System.out.println("\nEmployee Payroll Data");
        System.out.println("Name: " + pr.getName());
        System.out.println("ID Number: " + pr.getIdNumber());
        System.out.println("Hourly pay rate: " + pr.getPayRate());
        System.out.println("Hours worked: " + pr.getHoursWorked());
        System.out.println("Gross pay: $" + pr.getGrossPay());
        
        
        
    }

}