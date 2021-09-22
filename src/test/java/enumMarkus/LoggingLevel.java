package enumMarkus;

public enum LoggingLevel {

    PENDING(1), PROCESSING(2), PROCESSED(3);
    private int anInt;

    /*Constructor*/
    private LoggingLevel(int i){
        this.anInt = i;
    }
    public int code(){
        return anInt;
    }
}
