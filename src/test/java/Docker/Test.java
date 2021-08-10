package Docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

    public static void main(String[] args) throws IOException {
//        DesiredCapabilities dcC = DesiredCapabilities.chrome();
//
//        URL urlC = new URL("http://localhost:4444/wd/hub");
//        RemoteWebDriver driverC = new RemoteWebDriver(urlC,dcC);
//
//        driverC.get("https://opensource-demo.orangehrmlive.com");
//        System.out.println(driverC.getTitle());
//        driverC.quit();
        Process p = null;
        ProcessBuilder pb = new ProcessBuilder("GridConfig.sh");
        pb.directory(new File("/Users/ruslansamatov/IdeaProjects/DockerLaunch/GridConfig.sh"));
        p = pb.start();
    }
}