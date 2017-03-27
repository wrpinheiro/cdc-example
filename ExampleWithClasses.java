public class ExampleWithClasses {
    public static void main(String[] args) {
    	Used used1 = new Used(), used2 = new Used();

    	System.out.println(used1.getString());
    }
}

class NotUsed {
	public int usedMethod() {
		return 2;
	}

	public void notUsedMethod() {
		int x = usedMethod();
	}
}

class Used {
	public String getString() {
		return "This is a String";
	}
}