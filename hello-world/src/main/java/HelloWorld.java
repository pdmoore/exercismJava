public class HelloWorld {
    public static String hello(String name) {
        String returnValue = "Hello, ";
        if (null == name || name.isEmpty()) {
            returnValue += "World";
        } else {
            returnValue += name;
        }
        returnValue += "!";
        return returnValue;
    }
}
