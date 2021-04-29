package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String text) {
        if (text == null || text.isEmpty()) {
            return -1;
        }
        int counter = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                counter += Integer.parseInt(String.valueOf(c));
            }
        }
        return counter;
    }
}
