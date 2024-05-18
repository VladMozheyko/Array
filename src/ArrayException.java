public class ArrayException extends Exception{
    public ArrayException(String message) {
        super(message);
        System.err.println("Ошибка: " + message);
    }
}
