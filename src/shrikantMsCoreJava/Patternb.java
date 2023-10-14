package shrikantMsCoreJava;

public class Patternb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,k;
		for(r=1;r<=5;r++)
		{
			for(c=5;c>=r;c--) {
				System.out.print(" ");
			}
			for(k=1;k<=r;k++)
			{
					System.out.print("* ");
			}
				
			
			System.out.println();
		}
	}

	

}
