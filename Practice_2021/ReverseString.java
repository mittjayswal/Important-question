package Practice_2021;

public class ReverseString {

    public static void main(String[] args) {
        String s = "abcd";

        reverse(s);

        System.out.println(reverseRecursion(s));
    }

    private static String reverseRecursion(String s) {

        if (s.length() == 1){
            return s;
        }

        return s.charAt(s.length() - 1) + reverseRecursion(s.substring(0, s.length() - 1));
    }

    private static void reverse(String s) {
        char [] array = s.toCharArray();

        for (int i=s.length() -1; i>=0; i--){
            System.out.print(array[i]);
        }
        System.out.println();
    }


}
