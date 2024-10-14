package topic_practice.WebDriverArch;

public class AmazonTest {

	public static void main(String[] args) {

		
        //ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//SafariDriver driver = new SafariDriver();
		
		String browserName = "chrome";
		
		
		//cross browser logic: top casting
		WebDriver driver = null;
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser name : " + browserName);
			break;
		}
		
		
		driver.get("https://google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.sendKeys("search field", "Naveen automation labs");
		driver.click("searchIcon");
		
		driver.close();
		
		driver.getLogs();
		
	}

}
