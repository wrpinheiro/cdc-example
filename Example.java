public class Example {
    public void printHiThere() {
        System.out.println(sayHi("Hi there",
            null));
    }

    private String sayHi(String msg,
        String anotherMsg) {
        return msg;
    }

    private String oops() {
        return "";
    }

    public String nonUsedPublicMethod(int x) {
        return null;
    }
}