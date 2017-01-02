public class HelloWorld {
    public static String hello(String name) {
        if (null == name || name.isEmpty()) {
            return "Hello, World!";
        } else {
            return "Hello, " + name + "!";
        }
    }
}
