public class Service{
    private byte[][] rgb;
    Service(){

    }
    public void generate(){
        CCode ccode = new CCode();
        ccode.getCCode();
    }
}