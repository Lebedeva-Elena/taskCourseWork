import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string = "some";

        char[] letters = string.toCharArray();


        char[] firstPart = new char[letters.length / 2];

        char[] secondPart = new char[letters.length / 2];


        for (int i = 0; i < letters.length; i++) {

            if (i < letters.length / 2) {

                firstPart[i] = charArray[i];

            } else {

                secondPart[i - string.length / 2] = charArray[i];

            }

        }
        String first = Arrays.toString(firstPart);

        String second = Arrays.toString(secondPart);
    }

}











