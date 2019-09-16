import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCostco {
    WebDriver driver;

    @Test
    public void costco() {

    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    //driver.navigate().to("https://www.costco.com/vitamins-herbals-dietary-supplements.html?brand=kirkland-signature&refine=ads_fbrand_ntk_cs%253A%2522Kirkland%2BSignature%2522|");

        driver.navigate().to("https://www.foodtown.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);



driver.findElement(By.xpath("//span[@class='fp-user-store-indicator fp-core fp-module fp-user-store-indicator fp-layout-0 fp-no-store']//a[@class='fp-store-locator'][contains(text(),'My Store')]")).click();

//WebElement distance = driver.findElement(By.xpath("//span[contains(text(),'Select Distance')]"));
driver.findElement(By.xpath("//a[contains(text(),'1 mile')]")).click();
//Select select= new Select(distance);
//distance.click();

 //select.selectByVisibleText("1 mile");
driver.findElement(By.xpath("//input[@placeholder='Enter City and State, or Postal Code']")).sendKeys("11423");
driver.findElement(By.xpath("//button[@class='fp-btn fp-btn-search']")).click();

//    String item = "Less than $25";
//    String xpath = "//div[starts-with(@id,'accordion-filter_collapse-')]//label/span[text()='" + item + "']/../..";
//
//    driver.findElement(By.xpath(xpath)).click();



//       List<WebElement> myList=driver.findElements(By.cssSelector(".product-tile-set"));
//        int x  = myList.size();
//        System.out.println(myList.size());
//        Assert.assertEquals(22,x);
//

        //int x= myList.size();
        //System.out.println(x);
        //myList contains all the web elements
        //if you want to get all elements text into array list
     //  List<Integer> all_elements_text=new ArrayList<Integer>();
//
       // for(int i=0; i<myList.size(); i++){
//

//            //loading text of each element in to array all_elements_text
//           all_elements_text.add(myList.get(i).getText());
//
//            //to print directly
            //System.out.println(myList.get(i).getText());
       //     System.out.println(i);
//
      //  }
}

    }



