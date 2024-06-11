package com.brtest;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Launch {
	
	public static AndroidDriver driver;
	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("deviceName", "ASUS_X00TD");
		cap.setCapability("udid", "J9AAGF12U867H7Z");
		cap.setCapability("appPackage", "com.wt.apkinfo");
		cap.setCapability("activity", "com.wt.apkinfo.activites.StartActivity");
		
				
//			    UiAutomator2Options options =
//		        new UiAutomator2Options()
//		            .setAppPackage("com.wt.apkinfo")
//		            .setAppActivity("com.wt.apkinfo.activites.StartActivity")
//		            .setNewCommandTimeout(Duration.ofSeconds(600))
//		            .setAutoGrantPermissions(Boolean.TRUE)
//		            .setUdid("J9AAGF12U867H7Z");
//		 
				
		    URL url = new URL("https://0.0.0.0:4725/wd/hub");
		
		driver = new AndroidDriver(url,cap);
		
		
		
		//RemoteWebDriver driver1 = new RemoteWebDriver(url, cap);
		
//		 ChromeOptions cap = new ChromeOptions();
//	       // cap.addArguments("--start-maximized");
//		
//		
//		
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platformVersion", "14");
//		cap.setCapability("deviceName", "SM-S908E/DS");
//		cap.setCapability("udid", "RZCT90GNF4B");
//		cap.setCapability("appPackage", "com.mayhem.ugw");
//		cap.setCapability("activity", "com.epicgames.ue4.SplashActivity");
		
       // WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);


     //   WebDriver driver1 = new RemoteWebDriver(new URL("http://127.0.0.1:4724/wd/hub"),cap);
        
//		URL url = new URL("http://0.0.0.0:4725/wd/hub");
//		driver = new AndroidDriver(url, cap);
		
		
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.remote.AutomationName;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import java.net.URL;
//
//public class Launch {
//    public static void main(String[] args) throws Exception {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("MobileCapabilityType.PLATFORM_NAME", "iOS");
//        caps.setCapability("MobileCapabilityType.DEVICE_NAME", "iPhone 12");
//        caps.setCapability("MobileCapabilityType.AUTOMATION_NAME", "AutomationName.IOS_XCUI_TEST");
//        caps.setCapability("appium:bundleId", "com.example.apple-samplecode.UICatalog");
//        
//       
//
//      //  AppiumDriver<MobileElement> driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//        AppiumDriver driv = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//
//        // Your test code here
//
  
    }

			
}


