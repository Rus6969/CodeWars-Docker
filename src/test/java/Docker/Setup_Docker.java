package Docker;

import org.testng.annotations.Test;

import java.io.IOException;

public class Setup_Docker {

    @Test(priority = 1)
    void startdockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("/Users/ruslansamatov/IdeaProjects/DockerLaunch/GridConfig.sh");
        Thread.sleep(15000);
    }


   @Test(priority = 2)
    void stopDockerGrid() throws IOException, InterruptedException {
       Runtime.getRuntime().exec("/Users/ruslansamatov/IdeaProjects/DockerLaunch/DockerGridDown.sh");
       Thread.sleep(5000);
   }


}
