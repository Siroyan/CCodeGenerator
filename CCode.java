import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CCode{
    CCode(){

    }
    public void getCCode(){
        ColorNumber colorNumber = new ColorNumber();
        colorNumber.setRawData("I have a pen.");
        byte[][] rgb = colorNumber.getColorNumber();
        try {
            BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_3BYTE_BGR);
            Graphics g = img.getGraphics();
            int cursor = 0;
            for(int i = 0; i < 100; i = i + 10){
                for(int j = 0; j < 100; j = j + 10){
                    if(cursor < rgb.length){
                        g.setColor(new Color((int)rgb[cursor][0], (int)rgb[cursor][1], (int)rgb[cursor][2]));
                        g.fillRect(j, i, 10, 10);
                        cursor++;
                    }
                }
            }
            g.dispose();
            ImageIO.write(img, "png", new File("sample.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}