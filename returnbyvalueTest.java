class Test
{
 int add(int a,int b)
 {
  int c;
  c=a+b;
  return(c);
 }
 public static void main(String args[])
 {
  Test t1=new Test();
  int sum=t1.add(10,20);
  System.out.println(sum);
  System.out.println(t1.add(10,20));
 }
}