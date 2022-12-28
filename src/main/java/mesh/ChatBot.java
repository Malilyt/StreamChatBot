package mesh;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.vdurmont.emoji.EmojiParser;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;


import java.util.Collections;

import static java.lang.Thread.sleep;

public class ChatBot {

    WebDriver browser;
    Message message = new Message();
    RandomHelper rN = new RandomHelper();
    int randomTime;

// Give the values of 5 to the next line

    String videoUrl = "";
    String chatUrl = "";

    String xpathInputChat = "";
    String xpathButClick = "";

    String cacheBrowser = "";
    String driverBrowser = "";


    @Test
    public void chatBot() throws Exception {

        System.setProperty("webdriver.opera.driver", driverBrowser);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));



        options.addArguments("user-data-dir=" + cacheBrowser);

        browser = new OperaDriver(options);
        sleep(10000);


        openTabVideo();
        sleep(10000);


        openTabChat();
        sleep(10000);


        writeChat();

    }

    public void writeChat() throws InterruptedException {
//YT
        browser.findElement(By.xpath(xpathInputChat))
                .sendKeys(EmojiParser.parseToHtmlDecimal(message.mes()));
        sleep(10000);

        browser.findElement(By.xpath(xpathButClick))
                .click();


        randomTime = rN.randomNumbers(150000, 350000);
        sleep(randomTime);

        writeChat();
    }

    public void openTabVideo() {

        ((JavascriptExecutor)browser).executeScript("window.open('" + videoUrl + "')");

    }
    public void openTabChat() {

        ((JavascriptExecutor)browser).executeScript("window.open('" + chatUrl + "')");
        browser.get(chatUrl);

    }


}
