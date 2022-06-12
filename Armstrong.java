class Armstrong
{
   public static void main(String []args)
   {
       int num=153,sum=0,r,temp=num;
       while(num>0)
       {
        r=num%10;
        r=r*r*r;
        sum=sum+r;
        num=num/10;
       }
       
        if(sum==temp)
        System.out.println("armstrong no.");
        else
        System.out.println("Not armstrong");
     }
}    
    