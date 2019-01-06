import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class AsciiCode{
    private String rawData = "";
    private byte[] asciiCode;
    public void setRawData(){
        try{
            File file = new File("RawData.txt");
            if(!file.exists()){
                System.out.println("such file is not exist.");
                return;
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while((data = bufferedReader.readLine()) != null){
                rawData = rawData + data;
            }
            bufferedReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public byte[] getAsciiCode(){
        byte[] asciiCodeTemp = rawData.getBytes(StandardCharsets.UTF_8);
        asciiCode = new byte[asciiCodeTemp.length + 3 - asciiCodeTemp.length % 3];
        System.arraycopy(asciiCodeTemp, 0, asciiCode, 0, asciiCodeTemp.length);
        return asciiCode;
    }
}