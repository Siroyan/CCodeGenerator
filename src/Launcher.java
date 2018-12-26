public class Launcher{
    public static void main(String[] args){
        Service service = new Service(args[0]);
        service.generate();
    }
}