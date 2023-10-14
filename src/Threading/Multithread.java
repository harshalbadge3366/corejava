package Threading;

public class Multithread {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n=8;
		int i;
		for(i=0;i<n;i++)
		{
			Multi o = new Multi();
			o.start();
			
		}

	}

}
