public class ImmutableClassClient {
    private ImmutableClass immutableClass = new ImmutableClass();
    private String stringModified;

    public ImmutableClassClient() {
        stringModified = immutableClass.getString();
    }


    public void modifyAndPrint() {
        stringModified = "ola";
        System.out.println(stringModified);
    }
}
