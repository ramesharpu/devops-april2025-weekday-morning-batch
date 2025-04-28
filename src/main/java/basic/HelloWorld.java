package basic;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");//from x1 branch + from y1 branch
	}

	//from b1 branch
	public void m1() {
		System.out.println("from method-1");//from c1 branch + from d1 branch code changes
	}
}
