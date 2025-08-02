class InvalidInputException extends Exception
{
    public InvalidInputException(String message)
    {
        super(message);
    }
}
class NegetiveNumberException extends Exception
{
    public NegativeNumberException(String message) 
    {
        super(message);
    }
}
class invalidOperatorException extends Exception
{
    public invalidOperatorException (String message)
    {
        super(message);
    }
}
class UnsupportedOperatorException extends Exception
{
    public UnsupportedOperatorException (String message)
    {
        super(message);
    }
}
class Calculator
{
    public static double performOperation(double num1,double num2,char operator)
            throws InvalidInputException,NegetiveNumberException,invalidOperatorException,
     UnsupportedOperatorException
    {
      if(num1<0||num2<0)
      {
          throw new NegativeNumberException("Negetive numbers are not alllowed.");
      }
      switch(operator)
      {
          case'+':
              return num1+num2;
          case'-':
              return num1-num2;
          case'*':
              return num1*num2;
          case'/':
            if(num2==0)
            {
                throw new UnsupportedOperationException("cannot divide by zero.");
            }
            return num1/num2;
          default:
              throw new InvalidOperatorException("Invalidoperator:"+operator);
      }
    }
}
public class ExtendedCalculator 
{
 public static void main(String[] args) 
    {
       try
       {
           double result1=Calculator.performOperation(10,2,'+');
           System.out.println("Result1:"+result1);
           double result2=Calculator.performOperation(8,4,'/');
           System.out.println("Result2:"+result2);
       }
       catch(InvalidInputException|NegetiveNumberException|invalidOperatorException|
               UnsupportedOperatorException e)
       {
           System.out.println("Exception:"+e.getMessage());
       }
    }
}

   OUTPUT

Result1:12.0
Result2:2.0
BUILD SUCCESSFUL
