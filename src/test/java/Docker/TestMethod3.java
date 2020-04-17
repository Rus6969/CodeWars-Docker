package Docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class TestMethod3 {
    @Test
    public void test3(){
        URL urlC =null;
        DesiredCapabilities dcC = DesiredCapabilities.chrome();
        try {
             urlC = new URL("http://localhost:4444/wd/hub");
        }catch(MalformedURLException e){
            System.out.println("three");
            }


        List<String> Nadire= new ArrayList<String>();
        List<Integer> Ruslan = new LinkedList<Integer>();
        Nadire.add("Dima");

        System.out.println(Nadire.get(0));

        Set<String> nnur= new HashSet<String>();
        nnur.add("a");
        nnur.add("b");
        nnur.add("a");
        nnur.add("a");
        nnur.add("b");
        System.out.println(nnur);



        RemoteWebDriver driver = new RemoteWebDriver(urlC,dcC);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println("3d class");
        driver.close();


    }
}
