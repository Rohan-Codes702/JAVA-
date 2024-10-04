public class Strings {

        public static void main(String[] args) {
            String a = "Rohan";
            System.out.println("Lenght is :" + a.length());
            System.out.println("Upper case :" + a.toUpperCase());
            System.out.println("Lower case :" + a.toLowerCase());
            System.out.println("replace :" + a.replace("n", "h"));
            System.out.println("Trim :" + a.trim());
            System.out.println("character: " + a.charAt(3));
            System.out.println("Substring: " + a.substring(0));
            System.out.println("Start with:" + a.startsWith("R"));
            System.out.println("End with : " + a.endsWith("n"));
            System.out.println("index:" + a.indexOf("h"));
        }
}
