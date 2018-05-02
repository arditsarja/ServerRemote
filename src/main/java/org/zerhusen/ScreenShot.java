package org.zerhusen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShot {
    private String imagepath ="";
    private BufferedImage image;
    public ScreenShot() {

        imagepath = "C:\\Users\\User\\Desktop\\" + new Date().getTime() + "screenshot.png";
        try {
            image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(image, "png", new File(imagepath));
        } catch (HeadlessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String getImagepath() {
        return imagepath;
    }

    public BufferedImage getImage() {
        return image;
    }
}
