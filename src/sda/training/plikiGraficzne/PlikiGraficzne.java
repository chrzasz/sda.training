package sda.training.plikiGraficzne;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Grzegorz Chrzaszczyk on 20-10-2018  09:26 AM
 */
public class PlikiGraficzne {

    public static void main(String[] args) throws IOException {
        BufferedImage bufferedImage = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = bufferedImage.createGraphics();

        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, 100, 100);

        g2d.setColor(Color.GRAY);
        g2d.fillRect(100, 100, 100, 100);

        g2d.setColor(Color.blue);
        g2d.fillRect(12, 24, 50, 50);

        g2d.setColor(Color.red);
        g2d.fillOval(50, 50, 40, 50);

        g2d.dispose();

        File file = new File("myimage.png");
        ImageIO.write(bufferedImage, "png", file);
    }

}
