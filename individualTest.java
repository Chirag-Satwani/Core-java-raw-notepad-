class Test
{
 public static void main(String ags[])
  {
    int n=153,r,sum=0;
    while(n!=0)
    {
     r=n%10;
     sum=sum*10+r;
     n=n/10;
    }
    while(sum!=0)
    {
     r=sum%10;
     switch(r)
     {
      case 0:System.out.println("zero");break;
      case 1:System.out.println("one");break;
      case 2:System.out.println("two");break;
      case 3:System.out.println("three");break;
      case 4:System.out.println("four");break;
      case 5:System.out.println("five");break;
      case 6:System.out.println("six");break;
      case 7:System.out.println("seven");break;
      case 8:System.out.println("eight");break;
      case 9:System.out.println("nine");break;
     }
     sum=sum/10;
    }
  
     
  }
}