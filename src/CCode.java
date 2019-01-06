import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CCode{
    public void getCCode(){
        int width = 150;
        int height = 150;
        AsciiCode asciiCode = new AsciiCode();
        asciiCode.setRawData();
        byte[] rgb = asciiCode.getAsciiCode();
        try {
            BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
            Graphics g = img.getGraphics();
            int cursor = 0;
            for(int i = 0; i < width; i = i + 10){
                for(int j = 0; j < height; j = j + 10){
                    if(cursor < rgb.length){
                        g.setColor(new Color((int)rgb[cursor] * 2, (int)rgb[cursor+1] * 2, (int)rgb[cursor+2] * 2));
                        g.fillRect(j, i, 10, 10);
                        cursor = cursor + 3;
                    }
                }
            }
            g.dispose();
            ImageIO.write(img, "png", new File("../data.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
