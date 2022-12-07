class Test
{
 public static void main(String args[])
 { 
  String str[]={"indore","bhopal","dewas","ujjain","dhar","indore","indonesia","bhind"};
  for(String s:str)
  { 
   if(s.indexOf("ind")>=0)
   {
    System.out.println(s);
   }
  }
 }
}