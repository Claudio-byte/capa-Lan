import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class PruebaUnitaria<driver> {
    String url = "https://www.latamairlines.com/cl/es";

    WebDriver driver;

    System.setProperty ("webdriver.chrome.driver", "lan.com\src\main\chromedriver.exe");
    driver = new ChromeDriver();

    driver.get("url");

    @FindBy

    //driver.findElement(By.id("lblInputOrigin")).click();








}
