

class Multiplys {
	 void mul(int a, int b) {
	  System.out.println("multiply of two numbers=" + (a * b));
	 }

	 void mul(int a, int b, int c) {
	  System.out.println("multiply of three numbers=" + (a * b * c));
	 }
	}
	class Multiply  {
	 public static void main(String args[]) {
		 Multiplys m = new Multiplys ();
	  m.mul(6, 10);
	  m.mul(10, 6, 5);
	 }
	}