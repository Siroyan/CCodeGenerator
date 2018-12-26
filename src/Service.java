public class Service{
    private String rawData;
    Service(String rawString){
        rawData = rawString;
    }
    public void generate(){
        CCode ccode = new CCode();
        ccode.getCCode(rawData);
    }
}