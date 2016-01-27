package lecture6.third;


public class WrongStringNumberException extends Exception {
    private int numberOfStrings;

    public WrongStringNumberException(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
