class Test
{
 public static void main(String args[])
 {
  String str="This is a class of java";
   int a=0,b=0;
   for(int i=0;i<str.length();i++)
   {
    char ch=str.charAt(i);
    if(ch>='A'&& ch<='Z')
    {
     switch(ch)
     {
      case 'A': a++;break;
      case 'E': a++;break;
      case 'I': a++;break;
      case 'O': a++;break;
      case 'U': a++;break;
      default: b++;
      
     }
    }
    else if(ch>='a'&& ch<='z')
    {
     switch(ch)
     {
      case 'a': a++;break;
      case 'e': a++;break;
      case 'i': a++;break;
      case 'o': a++;break;
      case 'u': a++;break;
      default: b++;
     }
    }
   }
   System.out.println("no. of vowels="+a);
   System.out.println("no. of characters="+b); 
   
 }
}