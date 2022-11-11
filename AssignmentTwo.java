class AssignmentTwo{
  public static void main(String[] args) {
   int num=2763,dig,rev=0,temp;
   temp=num;
if(temp%2==0)
{
    while(temp>0)
      {
           dig=temp%10;
          rev=(rev*10)+dig;
          temp=temp/10;
       }
    if(rev==num)
{
 System.out.println("Palindrome");
}
else
{
 System.out.println("Not a palindrome");
}
}
else
{
 System.out.println("Not an even number");
}

  }
}
