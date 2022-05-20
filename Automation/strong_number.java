
public class strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scn.nextInt();//145
		//int a=n;
		int sum=0;
		while(n>0);
		{
			int r=n%10;
			int i=1;
			int fact=1;
			
			while(i<=r)
			{
				fact=fact*i;
				i++;
			}
			
			sum=sum+fact;
			n=n/10;
		}
		
		System.out.println(sum);
//		if(a==n)
//		{System.out.println("Strong Number");
//		}else
//		{
//		System.out.println("Not Strong Number");
//		}

	}

}
