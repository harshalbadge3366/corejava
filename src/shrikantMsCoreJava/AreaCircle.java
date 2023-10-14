package shrikantMsCoreJava;

public class AreaCircle {
	double pi=3.14,a,x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCircle ob = new AreaCircle();
		ob.x=Double.parseDouble(args[0]);
		ob.a=ob.x*ob.x+3.14;
		System.out.println("area of circle=="+ob.a);
		

	}

}
