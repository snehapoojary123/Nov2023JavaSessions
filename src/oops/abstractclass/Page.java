package oops.abstractclass;

public abstract class Page {
	
	//cannot create an object of abstract class
	//constructor can be created and will be called when creating object of child class
	//1st default const will be called
	//if child and parent both have const.. parent class default const will be given preference
	
	
	public int COUNT = 10;
	public Page() {
		System.out.println("Page Abstract class constructor...");
	}
	
	public Page(int i) {
		System.out.println("Page Abstract class constructor..."+i);
	}
	
	public abstract void url();
	public abstract void title();
	
	public void pageLoad() {
		System.out.println("Page load should be 5 sec");
	}
	
	public final void logoDisplay() {
		System.out.println("logoDisplay..");
	}
	
	public static void footer() {
		System.out.println("footer..");
	}

}
