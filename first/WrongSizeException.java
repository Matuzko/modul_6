package lecture6.first;


public class WrongSizeException extends Exception {
    private int size; //never accesssed

    public WrongSizeException(int size) {
        this.size = size;
    }
}
