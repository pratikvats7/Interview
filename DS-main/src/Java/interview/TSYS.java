package Java.interview;

public final class TSYS {
    private static TSYS instance = null;

    private String address;

    private TSYS(){
            this.address = "address";

    }

    public static TSYS getInstance(){
        if (instance==null) {
            return new TSYS();
        }
        return instance;
    }
}
