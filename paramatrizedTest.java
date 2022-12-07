class Test
{
 int a,b,c;
 void setData(int x, int y, int z)
 {
  a=x;
  b=y;
  c=z;
 }
 void show()
 {
  System.out.println(a+" "+b+" "+c);
 }
 public static void main(String args[])
 {
  Test t1=new Test();
  Test t2=new Test();
  t1.setData(10,20,30);
  t2.setData(100,200,300);
  t1.show();
  t2.show();
 }
}