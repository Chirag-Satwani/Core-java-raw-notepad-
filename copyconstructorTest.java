class Test
{
 int a,b,c;
 Test(int x, int y, int z)
 {
  a=x;
  b=y;
  c=z;
 }
 void show()
 {
  System.out.println(a+" "+b+" "+c);
 }
 Test(Test t)
 {
  a=t.a;
  b=t.b;
  c=t.c;
 }
 public static void main(String args[])
 {
  Test t1=new Test(10,20,30);
  Test t2=new Test(t1);
  t1.show();
  t2.show();
  Test t3=new Test(t2);
  t3.show();
 }
}