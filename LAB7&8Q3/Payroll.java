/**
 * CHAI QIANG YUAN
 * 194696
 * LAB7&8 QUESTION 3
 */
import java.util.Scanner;

public class Payroll
{

    private String name; // Employee name
    private int idNumber; // ID number
    private double payRate; // Hourly pay rate
    private double hoursWorked; // Number of hours worked


    PayrollExceptions pe=new PayrollExceptions();

    public Payroll(String n, int i)
    {

        name = n;
        idNumber = i;

    }



    public void setName(String n)
    {try

        {

            PayrollExceptions.checkName(n); //calling method of PayrollExceptions,it will throw error if name is empty
            name = n;

        }

        catch(Exception e)
        {

            System.out.println("Exception occured: "+e);

        }

}


  public void setIdNumber(int i)
  {

      try
      {

          PayrollExceptions.checkID(i);
          idNumber = i;

        }

        catch(Exception e)
        {

            System.out.println("Exception occured: "+e);

        }

    }



  

    public void setPayRate(double p) {

        try
        {

            PayrollExceptions.checkHourlyPayRate(p);
            payRate = p;

        }

        catch(Exception e)
        {

            System.out.println("Exception occured: "+e);

        }

}



    public void setHoursWorked(double h)
    {

        try
        {

            PayrollExceptions.checkHours(h);
            hoursWorked = h;

        }

        catch(Exception e)
        {

            System.out.println("Exception occured: "+e);

        }

    }



    public String getName()
    {

        return name;

    }



  
    public int getIdNumber()
    {

        return idNumber;

    }



    public double getPayRate()
    {

        return payRate;

    }



    public double getHoursWorked()
    {

        return hoursWorked;

    }



    public double getGrossPay()
    {

        return hoursWorked * payRate;

    }
}

