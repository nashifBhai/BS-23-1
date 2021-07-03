package newproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {


    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.phptravels.net/";
        driver.get(baseUrl);
        driver.findElement(By.id("buttoncheck")).click();
        List<WebElement> elements = driver.findElements(By.name("name"));
            System.out.println("Number of elements:" +elements.size());

         for (int i=0; i<elements.size();i++){
         System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        }
        WebElement destination = driver.findElement(By.id("dest"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement ckin = driver.findElement(By.name("checkin"));							

        email.sendKeys("Legoland Malaysia Day Pass");					
        ckin.sendKeys("09/07/2021");					
         
        Select a = new Select(driver.findElement(By.name("tourtype")));
		drpCountry.selectByVisibleText("Yacht");
        System.out.println("Done");					

        // Find the submit button		
        WebElement book = driver.findElement(By.id("Book"));	
        driver.close();
       
    }

}