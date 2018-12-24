public class Service{
    Service(){

    }
    public void generate(){
        CCode ccode = new CCode();
        ccode.getCCode("https://www.google.com/");
    }
}