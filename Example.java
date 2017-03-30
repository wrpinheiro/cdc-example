public class Example {
    public void printHiThere() {
        System.out.println(aLoudHiThere(
            "Hi there"), null);
    }

    private String aLoudHiThere(String msg,
        String otherMsg) {
        return msg.toUpperCase();
    }

}