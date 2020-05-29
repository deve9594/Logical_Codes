
class parent{
	static void show() {
		System.out.println("Parent called");
	}
}

class child extends parent{
	static void show() {
		System.out.println("child called");
	}
}


public class Program {
	public static void main(String[] args) {
		parent.show();
		//p.show();
	}
}
