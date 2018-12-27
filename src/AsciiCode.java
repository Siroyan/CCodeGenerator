import java.util.*;
import java.nio.charset.StandardCharsets;
public class AsciiCode{
    private String rawData;
    private byte[] asciiCode;
    ColorNumber(){
        
    }
    public void setRawData(String data){
        rawData = data;
    }
public byte[] getAsciiCode(){
        byte[] asciiCodeTemp = rawData.getBytes(StandardCharsets.UTF_8);
        asciiCode = new byte[asciiCodeTemp.length + 3 - asciiCodeTemp.length % 3];
        System.arraycopy(asciiCodeTemp, 0, asciiCode, 0, asciiCodeTemp.length);
        return asciiCode;
    }
}