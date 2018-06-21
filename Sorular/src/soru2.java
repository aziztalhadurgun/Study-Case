import java.util.Scanner;


public class soru2 {
	
	public static void nums(int n)
	{
		int i,j,num=1;
		for(i=0;i<n;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print(num+"!");
				num = num+1;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter a number");
		int n =s.nextInt();
		
		nums(n);

	}

}
