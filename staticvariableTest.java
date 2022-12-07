class Test
{
 static int a=10;
 public static void main(String args[])
 {
  Test t1=new Test();
  Test t2=new Test();
  Test t3=new Test();
  t1.a=10;
  t2.a=100;
  t3.a=1000;
  System.out.println(t1.a);
  System.out.println(t2.a);
  System.out.println(t3.a);
  System.out.println(a);
  System.out.println(Test.a);
 }
}