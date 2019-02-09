package gitMaster;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GITMasterTest {

@Test
	public void loginTest() throws IOException{
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("http://www.google.com/");
	File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\Ramraj.S\\workspace\\GITMaster\\Screenshot\\test.png"));
	
	}
}
