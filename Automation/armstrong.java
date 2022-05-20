
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the Number");
int n=scn.nextInt();//153
int sum=0;
while(n>0)
{
	int r=n%10;
	//3
    sum=sum+(r*r*r);
    n=n/10;
}

if(sum==n)
{System.out.println("Armstrong number");
}else
{
	System.out.println("Not a Armstrong number");
}
	}

}
