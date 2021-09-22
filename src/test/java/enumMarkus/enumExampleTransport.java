package enumMarkus;

class MainEnum{

    enum EnumExampleTransport {
        PLANE, TRAIN, AUTO
}

public static void main(String[] args){
    EnumExampleTransport allTransports [] = EnumExampleTransport.values();


    for (EnumExampleTransport enumIter : EnumExampleTransport.values()){
//        if(enumIter.equals(EnumExampleTransport.AUTO)){
//            callAMethod();
        if(enumIter==EnumExampleTransport.AUTO){
            callAMethod();
        }
        if (enumIter==EnumExampleTransport.PLANE){
            callAMethod();
        }
        if (enumIter==EnumExampleTransport.TRAIN){
            callAMethod();
        }
    }
}

    private static void callAMethod() {

    }
}
