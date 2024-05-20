package gui;

import gui.base.BaseTest;
import org.testng.annotations.Test;

public class VanillaLoginTest extends BaseTest {

    private static final int WAIT = 2000;
    private static final String PAGE_URL = "http://training.skillo-bg.com:4300/posts/all";

    @Test
    public void verifyBasicNavigationWorks() {

        sleepy(WAIT);
        driver.get(PAGE_URL);
        sleepy(WAIT);
    }
}
