package kata.stack;

public class stackOverflowException extends RuntimeException{
    public stackOverflowException(String message) {
        super(message);
    }
}
