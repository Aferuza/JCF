class MainEnum{

    enum EnumExampleTransport {
        PLANE, TRAIN, AUTO
}

public static void main(String[] args){
    EnumExampleTransport allTransports [] = EnumExampleTransport.values();
    for (EnumExampleTransport i: allTransports){
        System.out.println(i);
    }
}
}
