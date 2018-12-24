import java.util.*;
import java.nio.charset.StandardCharsets;
public class ColorNumber{
    private String rawData;
    private byte[] asciiCode;
    private byte[][] colorNumber;
    ColorNumber(){
        
    }
    public void setRawData(String data){
        rawData = data;
    }
    public byte[][] getColorNumber(){
        byte[] asciiCodeTemp = rawData.getBytes(StandardCharsets.UTF_8);
        asciiCode = new byte[asciiCodeTemp.length + 3 - asciiCodeTemp.length % 3];
        System.arraycopy(asciiCodeTemp, 0, asciiCode, 0, asciiCodeTemp.length);
        colorNumber = new byte[asciiCode.length / 3][3];
        for(int i = 0; i < asciiCode.length / 3; i++){
            for(int j = 0; j < 3; j++){
                colorNumber[i][j] = asciiCode[i * 3 + j];
            }
        }
        return colorNumber;
    }
}