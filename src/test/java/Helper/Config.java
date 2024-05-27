package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static Actions action;
	public static void Confchrome() throws Exception {
		System.setProperty("webdriver.chrome.driver",Utils.getproprety("TestDriverPath"));
	}
public static void configmaximazewindow() {
	driver.manage().window().maximize();
}

}
