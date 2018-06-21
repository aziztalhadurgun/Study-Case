import java.util.Scanner;


public class soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sayi,x;
		Scanner sc = new Scanner (System.in);
		System.out.println("Kökünü almak istediðiniz sayiyi giriniz:");
		sayi = sc.nextDouble();
		
		x=1;
		
		for(int i =0; i<5; i++)
		{
			x=(x+(sayi/x))/2;
			System.out.println(x);
		}
		
		
	}

}
