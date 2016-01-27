package lecture6.first;


public class WrongSizeException extends Exception {
    private int size;

    public WrongSizeException(int size) {
        this.size = size;
    }
}
