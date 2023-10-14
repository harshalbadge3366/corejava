package shrikantMsCoreJava;

public class Dimond {
	public static void main(String args[])
	{
		int r,c,k;
		for(r=1;r<=10;r++)
		{
			for(c=10;c>=r;c--)
			{
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
