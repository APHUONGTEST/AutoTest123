import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) throws InterruptedException {
        AppiumDriver<MobileElement> appiumDriver;

        //desire
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName","uiautomator2");
        desiredCapabilities.setCapability("platform","android");
        desiredCapabilities.setCapability("udid","emulator-5554");
        desiredCapabilities.setCapability("appPackge","com.mwg.eagle");
        desiredCapabilities.setCapability("appActivity","com.mwg.eagle.MainActivity");


        //Send desireCaps into Appium
        try {
            URL appiumServerPath = new URL("http://localhost:4723/wd/hub");
            appiumDriver = new AndroidDriver<>(appiumServerPath, desiredCapabilities);
            appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("ERROR!...");
        }

        appiumDriver.findElement(By.xpath("//android.view.View[@index='5']")).click();



//        //user
//        appiumDriver.findElement(By.xpath("//android.widget.EditText[@text=\"Mã nhân viên\"]")).sendKeys("87328");
//        //pass
//        appiumDriver.findElement(By.xpath("//android.widget.EditText[@text=\"Mật khẩu\"]")).sendKeys("Erp@082021");;
//        //Login
//        appiumDriver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup")).click();

//        //menu
//        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"\uE601\"]")).click();
//
//        //Chọn siêu thị
//        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Chọn siêu thị\"]")).click();
//
//        //Nhập mã siêu thị
//        appiumDriver.findElement(By.xpath("//android.widget.EditText[@text=\"Nhập siêu thị\"]")).sendKeys("888");
//
//        Thread.sleep(3000);
//
//        appiumDriver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();
//
//        appiumDriver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
//
//        Thread.sleep(3000);


//        //nút home
//        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"\uF346\"]")).click();

//        //menu
//        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"\uE601\"]")).click();
//
//       //Bán hàng - tìm sản phẩm
//        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Bán hàng\"]")).click();

        //Nhập sản phẩm
        appiumDriver.findElement(By.xpath("//android.widget.EditText[@text=\"Nhập mã SP, Tên SP, IMEI, SIM\"]")).sendKeys("0160010000002");

        Thread.sleep(3000);

//        //Tab Khuyến mãi
//        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Khuyến mãi\"]")).click();
//
//        //Tab Bán kèm
//        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Bán kèm\"]")).click();

        //Tab Hình thức giao
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Hình thức giao\"]\n")).click();
        Thread.sleep(3000);

        //Button Thêm vào giỏ
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"THÊM VÀO GIỎ HÀNG\"]")).click();
        Thread.sleep(3000);

        appiumDriver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();

        Thread.sleep(3000);

        //Scroll down
        scrollDown(appiumDriver);

        //Chọn Khách hàng cũ
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Khách hàng cũ\"]")).click();

//        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Chị\"]")).click();
//
//        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Số điện thoại:\"]")).sendKeys("0326793893");
//
//        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Họ tên:*\"]")).sendKeys("Phượng");

        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Khách hàng đã đồng ý với chính sách xử lý dữ liệu cá nhân\"]")).click();

        //Mối quan hệ khách hàng
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Đơn hàng của CHÍNH MÌNH\"]\n")).click();

        scrollDown(appiumDriver);

        //Tạo đơn hàng
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"TẠO ĐƠN HÀNG\"]")).click();

        Thread.sleep(3000);

        appiumDriver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();

        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Bỏ qua xác thực\"]")).click();

        appiumDriver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]")).click();

        Thread.sleep(3000);

        System.out.println("Tạo đơn thành công");
//        appiumDriver.notifyAll();
//
//        ((AndroidDriver<MobileElement>) appiumDriver).openNotifications();


        scrollDown(appiumDriver);

        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"OK\"]")).click();

        //nút home
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"\uE601\"]")).click();

        //QL YCXH
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Quản lý yêu cầu xuất hàng\"]")).click();

        Thread.sleep(3000);

        //Nhập đơn hàng
        appiumDriver.findElement(By.xpath("//android.widget.EditText[@text=\"Nhập mã YCX/SĐT/Tên KH/Số HĐ/Mã giỏ hàng\"]")).sendKeys("0326793893");

        //Tìm đơn hàng
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text=\"\uF505\"]")).click();

//        appiumDriver.notify();








//        int rand = (int)(Math.random() * 3);
//        String rdXpath = String.format("(//android.widget.TextView[@text=\"Hủy\"])[%s]", rand);
//        //Hủy
//        appiumDriver.findElement(By.xpath(rdXpath)).click();

//        List<MobileElement> DeleteSO = (List<MobileElement>) appiumDriver.findElement(By.xpath("android.widget.TextView[@index='1']"));
//        MobileElement randomDeleteSO = DeleteSO.get(new SecureRandom().nextInt(DeleteSO.size()));
//        randomDeleteSO.click();


//        List<MobileElement> ListSO = (List<MobileElement>) appiumDriver.findElement(By.xpath("(//android.widget.TextView[@text=\"Hủy\"])[2]"));
//        MobileElement randomListSO = ListSO.get(new SecureRandom().nextInt(ListSO.size()));
//        randomListSO.click();

        //Nhập đơn hàng
//        MobileElement timSO = appiumDriver.findElement(By.xpath("//android.widget.EditText[@text=\"Nhập mã YCX/SĐT/Tên KH/Số HĐ/Mã giỏ hàng\"]"));
//        timSO.sendKeys("04813SO23110004365");
////      AppiumDriver.pressKey(new KeyEvent(AndroidKey.ENTER));

        //wait
        Thread.sleep(3000);

    }

    private static void scrollDown (AppiumDriver < MobileElement > driver) {
        MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
        element.click();
    }
}
