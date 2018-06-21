import java.util.Scanner;


public class soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("x1,y1:");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		System.out.print("x2,y2:");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		System.out.print("x3,y3:");
		int x3 = s.nextInt();
		int y3 = s.nextInt();
		System.out.print("x4,y4:");
		int x4 = s.nextInt();
		int y4 = s.nextInt();
		
		float bx = x2-x1;
		float by = y2-y1;
		float cx = x3-x1;
		float cy = y3-y1;
		float X = x4-x1;
		float Y = y4-y1;
		
		float d = (bx*cy)-(cx-by);
		float wa = (X*(by-cy)+Y*(cx-bx)+(bx*cy-cx*by))/d;
		float wb = (X*cy-Y*cx)/d;
		float wc = (Y*bx-X*by)/d;
		
		if(wa>0 && wa<1 && wb>0 && wb<1 && wc>0 && wc<1)
		{
			System.out.println("nokta üçgenin içinde");
		}else{
			System.out.println("üçgenin içinde deðil");
		}
			

	}

}
