import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String expTitle="Google";
        String actTitle= driver.getTitle();
        if(actTitle.equals(expTitle))
            System.out.println("Test passed");


    }
}
