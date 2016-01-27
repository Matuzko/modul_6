package lecture6.second;


public class WrongSizeException extends Exception{
    private int size;

    public WrongSizeException(int size) {
        this.size = size;
    }
}
