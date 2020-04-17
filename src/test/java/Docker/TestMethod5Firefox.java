package Docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestMethod5Firefox {
    @Test
    public void test2(){
        URL urlC =null;
        DesiredCapabilities dcC = DesiredCapabilities.firefox();
        try {
             urlC = new URL("http://localhost:4444/wd/hub");
        }catch(MalformedURLException e){
            System.out.println("Second");
            }

        RemoteWebDriver driver = new RemoteWebDriver(urlC,dcC);
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
