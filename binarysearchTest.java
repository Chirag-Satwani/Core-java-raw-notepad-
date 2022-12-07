class Test
{
 public static void main(String args[])
 {
  int a[]={10,20,30,40,50,60,70,80,90,100};
  int low=0,high=a.length-1,mid,n=80;
  boolean f=false;
  while(low<=high)
  {
   mid=(low+high)/2;
   if(a[mid]==n)
   {
    f=true;
    break;
   }
   else if(a[mid]<n)
   {
    low=mid+1;
   }
   else
   {
    high=mid-1;
   }
  }
  if(f)
  {
   System.out.println("element found");
  }
  else
  {
   System.out.println("element not found");
  }
 }
}