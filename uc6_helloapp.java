public class uc6_helloapp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();

            // append all names with ", "
            for (String name : args) {
                names.append(name).append(", ");
            }

            // remove trailing ", "
            String result = names.substring(0, names.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}