package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static Properties prop;
	protected static WebDriver driver;
	private static ChromeOptions opt;

	public BaseClass() {
		prop = new Properties();
		String path = System.getProperty("user.dir") + "//src//main//java//ConfigurationLayer//config.properties";

		try {
			FileInputStream fis = new FileInputStream(path);
			// load Properties file in current class.
			prop.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialization(String browsername) {

		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equals("incognito")) {
			opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		} else if (browsername.equals("--headless")) {
			opt = new ChromeOptions();
			opt.addArguments("--headless");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = prop.getProperty("URL");
		System.out.println(url);
		driver.get(url);
	}
}
