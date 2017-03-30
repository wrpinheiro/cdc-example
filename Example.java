public class Example {
    public Example() {
      String value = "Hi there";

      System.out.println(formatValue(value));
    }

    private String formatValue(String value) {
        return value.toUpperCase();
    }
}