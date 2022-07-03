package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	 public static Robot r;
	 public static Actions a;
	 public static Alert ale;
	 public static TakesScreenshot tk;
	 public static JavascriptExecutor js;
	 public static Select s;

	//1.Launch Chrome Browser
   public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	//2.Launch Firebox Browser

   public static void launchFirebox() {

  	 WebDriverManager.firefoxdriver().setup();
  	 driver = new FirefoxDriver();
	}
	
	//3.Launch url
   public static void loadUrl(String url) {
  
  	 driver.get(url);
		
	}
  //4.print title
   public static void printTitle() {
		System.out.println(driver.getTitle());
	}
   //5.current url
   public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
   //6.maximize
   public static void winMax() {
		driver.manage().window().maximize();
	}
   //7.close
   public static void winClose() {
		driver.close();
	}
   //8.quit
   public static void winQuit() {
		driver.quit();
	}
   //9.SendKeys
   public static void fill(WebElement ele,String value ) {
		ele.sendKeys(value);
	}
   //10.Click
   public static void clickBtn(WebElement ele ) {
		ele.click();
	}
   //11.wait
   public static void waitTimeOut(int value) {

  	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));

  }     
   
   //12.Press Enter
   public static void enterBtn() throws AWTException {
  	 r = new Robot();
  	 r.keyPress(KeyEvent.VK_ENTER);
  	 r.keyRelease(KeyEvent.VK_ENTER);
	}
   //13.Press tab
   public static void tabBtn() throws AWTException {
  	 r = new Robot();
  	 r.keyPress(KeyEvent.VK_TAB);
  	 r.keyRelease(KeyEvent.VK_TAB);

	}
   //14.Press Control+C
   public static void copy() throws AWTException {
  	 r = new Robot();
  	 r.keyPress(KeyEvent.VK_CONTROL);
  	 r.keyPress(KeyEvent.VK_C);

  	 r.keyRelease(KeyEvent.VK_CONTROL);
  	 r.keyRelease(KeyEvent.VK_C);

	}
   //15.Press Control+V
   public static void paste() throws AWTException {
  	 r = new Robot();
  	 r.keyPress(KeyEvent.VK_CONTROL);
  	 r.keyPress(KeyEvent.VK_V);

  	 r.keyRelease(KeyEvent.VK_CONTROL);
  	 r.keyRelease(KeyEvent.VK_V);

	}
   //16.Press Down

   public static void downBtn() throws AWTException {
  	 r = new Robot();
  	 r.keyPress(KeyEvent.VK_DOWN);
  	 r.keyRelease(KeyEvent.VK_DOWN);

}
   //17.Press Control+A

   public static void all() throws AWTException {
  	 r = new Robot();
  	 r.keyPress(KeyEvent.VK_CONTROL);
  	 r.keyPress(KeyEvent.VK_A);

  	 r.keyRelease(KeyEvent.VK_CONTROL);
  	 r.keyRelease(KeyEvent.VK_A);

	}     
   //18.Switch to Alert
   public static void switchAlert() {

  	 ale = driver.switchTo().alert();
	}

   //19.Accept Alert
   public static void acceptAlert() { 
  	 ale.accept();
	}
   
   //20.Alert Dismiss(Cancel)
   public static void cancelAlert() { 
  	 ale.dismiss();
  	 
	}

   //21.SendKeysto Alert
   public static void fillAlert(String value) {

  	 ale.sendKeys(value);

	}

   //22.printAlert
   public static void printAlert() {
  	 System.out.println(ale.getText());

	}


   //23.move to Element
   public static void moveToElement(WebElement ele) {
    
  	 a = new Actions(driver);
  	 a.moveToElement(ele).perform();
	}
   //24.drag and drop
   public static void dragDrop(WebElement src,WebElement des) {
  	 a = new Actions(driver);

  	 a.dragAndDrop(src, des).perform();
	}
   
   //25.Double Click
   public static void dbClick(WebElement ele) {
       
  	 a = new Actions(driver);
  	 a.doubleClick(ele).perform();
	}

   //26.Right Click (Context)
   public static void rClick(WebElement ele) {
       
  	 a = new Actions(driver);
  	 a.contextClick(ele).perform();

   }
   //27.Pressing Shift Button using actions
   public static void pressShift(WebElement ele,String value) {

  	 a = new Actions(driver);
  	 a.keyDown(Keys.SHIFT).perform();
  	 a.sendKeys(ele, value);
  	 a.keyUp(Keys.SHIFT).perform();
	}
  //28. Take Screenshot

   public static void screenshot(String sName) throws IOException {

 	     tk = (TakesScreenshot) driver;
 	     File src =tk.getScreenshotAs(OutputType.FILE);
 	     File des = new File("E:\\Sharmi\\Storage\\MyProject\\target\\screenshot\\"+sName+".jpg");
 	     FileUtils.copyFile(src, des);

   }
   
   
   //29.Send values using Java Script
   public static void jFill(String fill,WebElement ele) {

  	  js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','"+fill+"')",ele);
  }

   //30.GetAttribute in JavaScript
   public static void jsGetAtt(WebElement ele) {
  	 
 	  js = (JavascriptExecutor)driver;

 	  Object o = js.executeScript("return arguments[0].getAttribute('value')", ele);
	
 	  //(Convert Object into String)
 	  String str = (String)o;
	  System.out.println(str);

	}
   //31.Replacement of click
   public static void jsClick(WebElement ele) {
  	 js = (JavascriptExecutor)driver;
  	 js.executeScript("arguments[0].click()", ele);
	}
   
   //32.ScrollTop View
   public static void scrollUp(WebElement ele) {

        js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", ele);
  	  

	}
   //33.ScrollBottom View
   public static void scrollBottom(WebElement ele) {

       js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(false)", ele);
 	  

	}

   //34.SelectByValue
   public static void selectVal(WebElement ele,String value) {

  	  s = new Select(ele);
  	  s.selectByValue(value);
   }
  //35.SelectByVisibleText
   public static void selectText(WebElement ele,String text) {

 	  s = new Select(ele);
 	  s.selectByVisibleText(text);
  }
   //36.SelectByIndex

  public static void selectIndex(WebElement ele,int index) {

 	  s = new Select(ele);
 	  s.selectByIndex(index);
  }
  //37.Is Multiple
  public static void chkMulti(WebElement ele) {
  	s = new Select(ele);
  	System.out.println(s.isMultiple());
  		
	}

   //38.Get All the options from DropDown
   public static void getAllOption(WebElement ele) {
    	  s = new Select(ele);

  	 List<WebElement> options = s.getOptions();
  	 for (int i = 0; i < options.size(); i++) {
			WebElement opt = options.get(i);
			System.out.println(opt.getText());
		}
	}
   //39.Get All Selected Options
   public static void getSelOption(WebElement ele) {
   	  s = new Select(ele);

 	 List<WebElement> options = s.getAllSelectedOptions();

	 for (int i = 0; i < options.size(); i++) {
		WebElement opt = options.get(i);
		System.out.println("Selected Options "+opt.getText());

   }
   }
   
	 //40.Get First Selected Option
   public static void getFirstSel(WebElement ele) {
  	  s = new Select(ele);
  	  WebElement frtSel = s.getFirstSelectedOption();
  	  System.out.println("First Selected Option "+ frtSel.getText());

	}
   
   
   //41.Deselect By Index
   public static void deSelectIndex(WebElement ele,int index) {
 	      s = new Select(ele);
 	      s.deselectByIndex(index);

	}
   //42.Deselect By Value
   public static void deSelectVal(WebElement ele,String value) {
 	      s = new Select(ele);
 	      s.deselectByValue(value);

	}
   //43.Deselect By VisibleText
   public static void deSelectText(WebElement ele,String text) {
 	      s = new Select(ele);
 	      s.deselectByVisibleText(text);

	}
   //44.DeSelectAll
   public static void deSelectAll(WebElement ele) {
	      s = new Select(ele);
	      s.deselectAll();

	}

   //45.Switch into Frame by Id 
   public static void frameId(String id) {

  	 driver.switchTo().frame(id);
	}

   //46.Switch into Frame by name
   public static void frameName(String name) {

  	 driver.switchTo().frame(name);
	}
   //47.Switch into Frame by index
   public static void frameIndex(int index) {

  	 driver.switchTo().frame(index);
	}

   //48.Switch into Frame by WebElement
   public static void frameWebEle(WebElement ele) {

  	 driver.switchTo().frame(ele);
	}

   //49.Switch into Parent Frame
   public static void frameParent() {

  	 driver.switchTo().parentFrame();
	}
   //50.Switch into Main Frame
   public static void frameMain() {

  	 driver.switchTo().defaultContent();
	}

   
   //51.Read Excel
   public static String getData(int rowno,int cellno) throws IOException {
  		File f = new File("E:\\Sharmi\\Storage\\MyProject\\target\\testData\\Data.xlsx");
  		//read file
  		FileInputStream fin = new FileInputStream(f);
  		
  		Workbook w = new XSSFWorkbook(fin);
  		Sheet s = w.getSheet("Login");
  		
  		Row row = s.getRow(rowno);

  		Cell cell = row.getCell(cellno);
  		
  		int cellType = cell.getCellType();
  	 
  		String value="";
  		
  		if (cellType==1) {
			 value = cell.getStringCellValue();
			}
  			else if (DateUtil.isCellDateFormatted(cell)) {
  				Date d = cell.getDateCellValue();
  				SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
  				value = sim.format(d);
  			}
  	    else {
  				double d = cell.getNumericCellValue();
  				long l = (long)d;
  				value = String.valueOf(l);
  			}

			return value;
	}
   //52.Refresh Webpage
   public static void refresh() {

	   driver.navigate().refresh();
}

   //53.GetText
   public static void getText(WebElement ele) {
	   System.out.println(ele.getText());
	   
}
   
}
