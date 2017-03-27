// ExampleWithClasses is not used
public class ExampleWithClasses {
	//main is not called anywhere
	// parameter args is not used
    public static void main(String[] args) {
    	// used1 is used
    	// used2 is not used
    	Used used1 = new Used(), used2 = new Used();

    	System.out.println(used1.getString());
    }
}

// NotUsed is not used
class NotUsed {
	// usedMethod IS USED
	public int usedMethod() {
		return 2;
	}

	// notUsedMethod is not used
	public void notUsedMethod() {
		// variable x is not used
		int x = usedMethod();
	}
}

// Used is used
class Used {
	// getString is used
	public String getString() {
		return "This is a String";
	}
}