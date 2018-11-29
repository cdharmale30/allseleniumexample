import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RobotScreenShot {

	public static void main(String[] args) throws IOException, HeadlessException, AWTException {
		// TODO Auto-generated method stub
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("I:\\All Eclipse Code3\\SeleniumExamples\\ScreenShotImages\\CurrentScreenshot.png")); 

	}

}
