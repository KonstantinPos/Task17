
public class Main {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 999);
        String s = x + "";
        if (s.charAt(0) > s.charAt(1) && s.charAt(0) > s.charAt(2)) {
            System.out.println("В числе " + x + " наибольшая цифра " + s.charAt(0));
        } else if (s.charAt(1) > s.charAt(0) && s.charAt(1) > s.charAt(2)) {
            System.out.println("В числе " + x + " наибольшая цифра " + s.charAt(1));
        } else if (s.charAt(2) > s.charAt(0) && s.charAt(2) > s.charAt(1)) {
            System.out.println("В числе " + x + " наибольшая цифра " + s.charAt(2));
        }
    }
}
