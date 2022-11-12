class AssignmentThree{
  public static void main(string[] args)
  {
    num=59;
    if(num>=10&&num<=150)
    {
      rem=num%23;
      if(rem==0)
      {
        System.out.println("Number is Divisible by 23");
      }
      else
      {
         System.out.println("Number is Not Divisible by 23");
      }
    }
    else
    {
       System.out.println("Number is Either less than 10 or greater than 150");
    }
  }
}
