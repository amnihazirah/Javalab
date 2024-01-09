

public class PayrollExceptions {
// this class defining all the exceptions which you want in your payroll class

    static void checkName(String name)throws MyException{  

        if(name==null || name.isEmpty()) //checking whether the name is empty or not

        throw new MyException("name can't be empty"); //if the name will be empty then it will throw the exception i.e. my exception

  }  

  static void checkID(int id)throws MyException{ //this method will validate id

      if(id<0)  
      {
          throw new MyException("id cant be negative"); //if id=0 or negative then my exception constructor will call

        }
        else if(id==0)
        {

            throw new MyException("id can't be zero");

        }

  

    }  

    static void checkHours(double hours)throws MyException{ // this method will validate number of hours

        if(hours<0 || hours>84)  
        {

            throw new MyException("invalid,please enter the valid number of hours");  

        }

  

    }  

    static void checkHourlyPayRate(double payrate)throws MyException{ //this method will validate payrate

        if(payrate<0 || payrate>25)  
        {

            throw new MyException("invalid,please enter the valid payrate");  

        }

  
    }  

  

}