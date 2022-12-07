class Test
{
 int a=10;
 public static void main(String args[])
 {
  Test t1=new Test();
  Test t2=t1;
  System.out.println(t1.a);
  System.out.println(t2.a);
  t1.a++;
  t2.a--;
  System.out.println(t1.a);
  System.out.println(t2.a);
 }
}