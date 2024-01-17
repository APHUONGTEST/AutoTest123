import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class driver {
    public static AppiumDriver<MobileElement> getAndroidDriver(String udid){
        AppiumDriver<MobileElement> appiumDriver;

        //desire
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName","uiautomator2");
        desiredCapabilities.setCapability("platform","android");
        desiredCapabilities.setCapability("udid",udid);
        desiredCapabilities.setCapability("app","https://eagle-1b569.web.app/");
        desiredCapabilities.setCapability("appPackge","com.mwg.eagle");
        desiredCapabilities.setCapability("appActivity","com.mwg.eagle.MainActivity");

        //Send desireCaps into Appium
        try {
            URL appiumServerPath = new URL("http://localhost:4723/wd/hub");
            appiumDriver = new AndroidDriver<>(appiumServerPath, desiredCapabilities);
            appiumDriver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("[ERROR]");
        }

        return appiumDriver;
    }


}
