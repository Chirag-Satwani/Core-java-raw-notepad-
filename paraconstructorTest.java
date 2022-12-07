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
 Test()
 {
 }
 public static void main(String args[])
 {
  Test t1=new Test(10,20,30);
  Test t2= new Test(100,200,300);
  t1.show();
  t2.show();
  Test t3=new Test();
  t3.show();
 }
}