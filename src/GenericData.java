public abstract class GenericData {

    private final String binaryValue;

    GenericData(String value){
        binaryValue=value;
    }

    public String getBinaryValue() {
        return binaryValue;
    }
}
