package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private final String original;

    public ReversedSequence(String input) {
        this.original = input;
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        return original.charAt(length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new ReversedSequence(original.substring(length() - end, length() - start));
    }

    @Override
    public String toString() {
        return new StringBuilder(original).reverse().toString();
    }
}
// END
