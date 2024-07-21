package Java.annotationprocessiong;

public class JsonSerializationException extends Exception {
    private final int statusCode;
    public JsonSerializationException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }
    public int getStatusCode() {
        return statusCode;
    }
}
