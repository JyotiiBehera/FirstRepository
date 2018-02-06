
  class Parent {
	 public void work() {
		  System.out.println("Parent is under retirement from work.");
		 }
		}
		class ClassOverride extends Parent {
		 public void work() {
		  System.out.println("child has a job");
		  System.out.println(" He is doing it well");
		 }
		 public static void main(String argu[]) {
			 ClassOverride c1 = new ClassOverride ();
		     c1.work();
		     
		   
		 }
		}
