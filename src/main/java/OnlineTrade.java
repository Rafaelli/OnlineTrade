import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineTrade {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onlinetrade.ru/");
        WebElement Search = driver.findElement(By.xpath("//*[@id=\"main_area\"]/div[1]/div[2]/div/div[3]/div[1]/div/form/input[1]"));
        Search.sendKeys("Iphone X");
        WebElement SearchButton = driver.findElement(By.xpath("//*[@id=\"main_area\"]/div[1]/div[2]/div/div[3]/div[1]/div/form/input[2]"));
        SearchButton.click();
        WebElement BuyPhone = driver.findElement(By.xpath("//*[@id=\"main_area\"]/div[2]/div/div[4]/div[2]/div[6]/div[2]/div[1]/a"));
        BuyPhone.click();
        Thread.sleep(2000);
        WebElement BuyPhone2 = driver.findElement(By.xpath("//*[@id=\"js__popup_addedToCart__cartLinkID\"]"));
        BuyPhone2.click();
        WebElement Basket = driver.findElement(By.xpath("//*[@id=\"js__logoline__cartID\"]/div/a[1]"));
        Basket.click();
        WebElement DeletePhone = driver.findElement(By.xpath("//*[@id=\"tabs_cart\"]/form/table/tbody/tr[2]/td[7]/a[1]"));
        DeletePhone.click();
        Thread.sleep(2000);
        WebElement Delete = driver.findElement(By.xpath("//*[@id=\"popup_message\"]/div[2]/a[1]"));
        Delete.click();
        driver.quit();
    }
}
