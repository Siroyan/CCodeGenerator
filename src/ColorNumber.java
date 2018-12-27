import java.util.*;
import java.nio.charset.StandardCharsets;
public class ColorNumber{
    private String rawData;
    private byte[] asciiCode;
    ColorNumber(){
        
    }
    public void setRawData(String data){
        rawData = data;
    }
    public byte[] getColorNumber(){
        byte[] asciiCodeTemp = rawData.getBytes(StandardCharsets.UTF_8);
        asciiCode = new byte[asciiCodeTemp.length + 3 - asciiCodeTemp.length % 3];
        System.arraycopy(asciiCodeTemp, 0, asciiCode, 0, asciiCodeTemp.length);
        return asciiCode;
    }
}