class prime{
 public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the Number");
int a=scn.nextInt();
int count=0;
for(int i=2;i<a;i++)
{
if(i%a==0)
{
	count++;
}

}
if(count>0)
{System.out.println("Prime Number");}
else{System.out.println("Non Prime Number");}
}
}