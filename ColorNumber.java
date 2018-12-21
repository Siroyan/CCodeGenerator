import java.util.*;
public class ColorNumber{
    List<String> rawData = new ArrayList<String>();
    List<Byte> colorNumber = new ArrayList<Byte>();
    ColorNumber(){
        
    }
    public void setRawData(List<String> data){
        System.arraycopy(data,0,rawData,0,data.size());
    }
    public List<Byte> getColorNumber(){
        byte ascii;
        ascii = rawData.get(i).getBytes("US-ASCII");
        for(int i = 0; i < rawData.size(); i++){
            colorNumber.add(ascii);
        }
        return colorNumber;
    }
}