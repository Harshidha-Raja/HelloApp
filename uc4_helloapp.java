public class uc4_helloapp {
    public static void main(String[] args) {

        String message;

        if (args.length > 0) {
            message = String.join(", ", args);  // joins all names
        } else {
            message = "World";  // default
        }

        System.out.println("Hello, " + message + "!");
    }
}
