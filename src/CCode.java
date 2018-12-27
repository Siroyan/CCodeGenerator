import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CCode{
    CCode(){

    }
    public void getCCode(String rawData){
        ColorNumber colorNumber = new ColorNumber();
        colorNumber.setRawData(rawData);
        byte[] rgb = colorNumber.getColorNumber();
        try {
            BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_3BYTE_BGR);
            Graphics g = img.getGraphics();
            int cursor = 0;
            for(int i = 0; i < 100; i = i + 10){
                for(int j = 0; j < 100; j = j + 10){
                    if(cursor < rgb.length){
                        g.setColor(new Color((int)rgb[cursor], (int)rgb[cursor+1], (int)rgb[cursor+2]));
                        g.fillRect(j, i, 10, 10);
                        cursor = cursor + 3;
                    }
                }
            }
            g.dispose();
            ImageIO.write(img, "png", new File("../sample.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}