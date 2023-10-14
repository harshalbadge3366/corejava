package shrikantMsCoreJava;

public class A {
	int a,b,tot;
	public static void main(String args[]) {
		A ob = new A();
		ob.a = Integer.parseInt(args[0]);
		ob.b = Integer.parseInt(args[1]);
		ob.tot=ob.a+ob.b;
		System.out.println("total="+ob.tot);
		
	}

}
