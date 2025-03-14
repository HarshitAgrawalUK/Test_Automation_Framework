package testBase;


import java.io.IOException;
import java.util.Properties;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	public Properties p;

	@BeforeClass
	@Parameters({ "browser" })
	public void setup(String br) throws IOException {

		//FileReader file = new FileReader("./src//test//resources//config.properties");
		//p = new Properties();

		//p.load(file);

		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home"); // reading url value from config file.
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}
