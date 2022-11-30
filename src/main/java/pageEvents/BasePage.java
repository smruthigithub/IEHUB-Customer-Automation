package main.java.pageEvents;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import static test.java.BaseTest.driver;

public class BasePage {
    public void takeScreenShot() throws IOException {
        TakesScreenshot screenshot= (TakesScreenshot) driver;
        File file= screenshot.getScreenshotAs(OutputType.FILE);

       FileHandler.copy(file, new File("./screenshots.png"));
    }
}
