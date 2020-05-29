class A{
	void display() {
		System.out.println("class A");
	}
	
	int acccepted() {
		return 0;
	}
	
}

class B extends A{
	void display() {
		System.out.println("class B");
	}
	
	int display(int a) {
		return a;
	}
	
	void acccept() {
		System.out.println("Accept from B");
	}
}



public class Opps_Practice {
	public static void main(String[] args) {
		B a = new B();
		a.display();
		System.out.println(a.display(0));
		System.out.println(a.acccepted());
		a.acccept();
	}

}
