class Test
{
 void add()
 {
  System.out.println("Hello");
 }
 void add(int p,int q)
 {
  System.out.println(p+q);
 }
 void add(int x,int y,int z)
 {
  System.out.println(x+y+z);
 }
 void add(int a,int b,int c,int d)
 {
  System.out.println(a+b+c+d);
 }
 void add(int x,int y,float z)
 {
  System.out.println(x+y+z);
 }
 public static void main(String args[])
 {
  Test t1=new Test();
  t1.add();
  t1.add(10,20);
  t1.add(100,200,300);
  t1.add(1,2,3,4);
  t1.add(15,25,35.5254f);
 }
} 
