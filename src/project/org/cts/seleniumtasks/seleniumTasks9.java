package project.org.cts.seleniumtasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.Select;

public class seleniumTasks9 {
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\intel\\eclipse-workspace\\project.org.cts.seleniumtasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Day09 Task03
	/*	driver.get("https://www.facebook.com/");
		WebElement btnCreate = driver.findElement(By.id("u_0_2"));
		btnCreate.click();
		Thread.sleep(2000);
		WebElement dropDown = driver.findElement(By.id("year"));
		Select cc = new Select(dropDown);
		
		List<WebElement> li = cc.getOptions();
		Thread.sleep(2000);
		for (int i = 0; i <li.size(); i++) {
			WebElement value = li.get(i);
			String str = value.getAttribute("value");  
			System.out.println(str);                           
		}                                                                  */
		//day09 Task04
	/*	driver.get("https://www.facebook.com/");
		WebElement btnCreate = driver.findElement(By.id("u_0_2"));
		btnCreate.click();
		Thread.sleep(2000);
		WebElement dropDown = driver.findElement(By.id("month"));
		Select cc = new Select(dropDown);
		List<WebElement> li = cc.getOptions();
		Thread.sleep(2000);
		for (int i = 0; i <li.size(); i++) {
			WebElement value = li.get(i);
			String str = value.getText();  
			System.out.println(str);                         
	
		}
		}                                           */
		
		//Day09 Task 05
	/*	driver.get("https://www.facebook.com/");
		WebElement btnCreate = driver.findElement(By.id("u_0_2"));
		btnCreate.click();
		Thread.sleep(3000);
		WebElement dateBox = driver.findElement(By.id("day"));
		Thread.sleep(3000);
		Select c  = new Select(dateBox);
		List<WebElement> lis = c.getOptions();
		for (int i = 0; i < lis.size(); i++) {
			if (i%2 !=1) {
			WebElement rtn = lis.get(i);	
			String Day = rtn.getText();
			System.out.println(Day);                                         */
		
		
		//Day09 Task06
	/*	driver.get(" http://demo.guru99.com/test/newtours/register.php");
		WebElement txtcountry = driver.findElement(By.xpath("//select[@name='country']"));
		Select acc = new Select(txtcountry);
		List<WebElement> lic = acc.getOptions();
		for (int i = 0; i < lic.size(); i++) {
			WebElement rcc = lic.get(i);
			String txt = rcc.getText();
			System.out.println(txt);                                       */
		
		
		//Day09 Task07
	/*	driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement txtcountry = driver.findElement(By.xpath("//select[@name='country']"));
		Select acc = new Select(txtcountry);
		List<WebElement> lic = acc.getOptions();
		for (int i = 0; i < lic.size(); i++) {
			WebElement rcc = lic.get(i);
			String txt = rcc.getAttribute("value");
			System.out.println(txt);                            */
		
		//day09 task09
	/*	driver.get("http://adactinhotelapp.com/index.php");
		WebElement txtbox = driver.findElement(By.id("username"));
		txtbox.sendKeys("govindasrini");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("srini123");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		Thread.sleep(3000);
		WebElement dropDown = driver.findElement(By.id("room_type"));
        Select sec = new Select(dropDown);
        List<WebElement> roomType = sec.getOptions();
        for (int i = 1; i < roomType.size(); i++) {
		WebElement printType = roomType.get(i);
		String roomtypes = printType.getText();
		System.out.println(roomtypes);                                   */
		
		//Day09 Task10
/*		driver.get("http://adactinhotelapp.com/index.php");
		WebElement txtbox = driver.findElement(By.id("username"));
		txtbox.sendKeys("govindasrini");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("srini123");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		Thread.sleep(3000);
		WebElement loctionBox = driver.findElement(By.id("location"));
        Select box = new Select(loctionBox);
        List<WebElement> li = box.getOptions();
        for (int i = 1; i < li.size(); i++) {
        	WebElement location = li.get(i);
			String sec = location.getText();
			System.out.println(sec);
        }                                                                        */
		//Day09 Task11
	/*	driver.get("http://adactinhotelapp.com/index.php");
		WebElement txtbox = driver.findElement(By.id("username"));
		txtbox.sendKeys("govindasrini");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("srini123");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		Thread.sleep(3000);
		WebElement adultTxtBox = driver.findElement(By.id("adult_room"));
		Select cc = new Select(adultTxtBox);
		List<WebElement> lis = cc.getOptions();
		for (int i = 1; i < lis.size(); i++) {
			WebElement adult = lis.get(i);
			String rcc = adult.getText();
			System.out.println(rcc);                     
		}                                                           */
		//Day09 Task11
		
/*		driver.get("http://output.jsbin.com/osebed/2");
		WebElement dropDown = driver.findElement(By.id("fruits"));
		Select dd = new Select(dropDown);
		List<WebElement> cee = dd.getOptions();
		for (int i = 0; i < cee.size(); i++) {
		if (i%2==0) {
		dd.selectByIndex(i);
		}
		}
		List<WebElement> option = dd.getAllSelectedOptions();
		System.out.println(cee.size()-option.size());                   */
		
		//Day09 Task12
	/*	driver.get("http://output.jsbin.com/osebed/2");
		WebElement txtFruits = driver.findElement(By.id("fruits"));
		Select ss = new Select(txtFruits);
		List<WebElement> list = ss.getOptions();
		for (int i = 0; i < list.size(); i++) {
		ss.selectByIndex(i);
		WebElement firstSelectedOption = ss.getFirstSelectedOption();
		String string = firstSelectedOption.getAttribute("value");
		System.out.println(string);                                              */
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//	
//		driver.get("https://www.homedepot.com/");
//	  WebElement sorce1 = driver.findElement(By.xpath("(//li[@class='ShoppingLinks__item'])[1]"));
//	 
//		Actions a = new Actions(driver);
//	a.moveToElement(sorce1).perform();
//		Thread.sleep(3000);
//		WebElement sorce2 = driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
//		a.moveToElement(sorce2).perform();
//		Thread.sleep(3000);
//		WebElement sorce3 = driver.findElement(By.xpath("(//a[@href='//www.homedepot.com/b/Heating-Venting-Cooling-Air-Conditioners/N-5yc1vZc4me'])[1]"));
//		a.moveToElement(sorce3).perform();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Day08 Tasks01
	/*	driver.get(" http://demo.automationtesting.in/Alerts.html");
		WebElement btnOk = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		btnOk.click();
		Alert simpleAlert =driver.switchTo().alert();
		simpleAlert.accept();                                                */
		
		//Day08 Tasks02	
	/*	driver.get(" http://demo.automationtesting.in/Alerts.html");
		WebElement btnOk = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		btnOk.click();
		WebElement btnOkCancel = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btnOkCancel.click();
		Alert acc = driver.switchTo().alert();
		acc.accept();                                                            */
		
		//Day08 Tasks03
	/*	driver.get(" http://demo.automationtesting.in/Alerts.html");
		WebElement btnOk = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btnOk.click();
		WebElement btnOkCancel = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnOkCancel.click();
		Alert an =driver.switchTo().alert();
		an.sendKeys("Section End");
		an.accept();                                                                  */
		
		//Day08task04
		
	/*	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		WebElement btnContinue = driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img"));
		btnContinue.click();
		Alert azz = driver.switchTo().alert();
		azz.accept();                                                             */
		
		//Day08 Task05
	/*	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		WebElement btnsign = driver.findElement(By.xpath("//input[@class='btn btn-default']"));
		btnsign.click();
		Alert aa = driver.switchTo().alert();
		String txt = aa.getText();
		System.out.println(txt);
		aa.accept();                                                                  */
		
		
		//Day08 Task06
	/*	driver.get(" https://retail.onlinesbi.com/retail/login.htm");
		WebElement btnContinueLogIn = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		btnContinueLogIn.click();
		WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
		btnLogin.click();
		Alert cc =driver.switchTo().alert();
		cc.accept();                                                                            */
		
		//Day08 task07
	/*	driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement txtbox = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		txtbox.sendKeys("ram123");
		WebElement btnContinue = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
		btnContinue.click();
		WebElement txtBoxPass = driver.findElement(By.xpath("(//input[@class='input_password'])[2]"));
		txtBoxPass.sendKeys("11111");                                                                          */
		
		
		//Day08 Task08
	/*	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement txtBoxId = driver.findElement(By.id("DUMMY1"));
		txtBoxId.sendKeys("hanana");
		WebElement txtBoxclick = driver.findElement(By.id("DUMMY1"));
		txtBoxclick.click();
		WebElement txtBoxpass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		txtBoxpass.sendKeys("123456");
		WebElement btnLogin = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		btnLogin.click();
		Alert as = driver.switchTo().alert();
		as.accept();                                                         */
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Day12 Task04
	/*	driver.get("https://www.facebook.com/\r\n");
		WebElement txtBoxEmail= driver.findElement(By.id("email"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','956658855')",txtBoxEmail);
		
		WebElement element = driver.findElement(By.id("pass"));
	//	JavascriptExecutor executor2= (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','guna123')",element);              */
		
		//Day12 Task05
/*		driver.get("http://adactinhotelapp.com/");
		WebElement element = driver.findElement(By.id("username"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','gunak')",element);
		WebElement element2 = driver.findElement(By.id("password"));
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].setAttribute('value','g123')",element2);
		WebElement element3 = driver.findElement(By.id("login"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()",element3);                                         */
		
		//Day12 Task06
	/*	driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','panasonic')", element);
		WebElement findElement = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		JavascriptExecutor executor2 =(JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].setAttribute('value','pas123')", findElement);
		WebElement findElement2 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click()",findElement2);
		Thread.sleep(2000);
		String string = executor.executeScript("return arguments[0].getAttribute('value')",element).toString();
		String string2 = executor2.executeScript("return arguments[0].getAttribute('value')",findElement).toString();
		System.out.println(string);
		System.out.println(string2);                                         */
		
		//Day12 task01
		/*driver.get("http://www.greenstechnologys.com/");
		WebElement findElement3 = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		JavascriptExecutor executor4= (JavascriptExecutor) driver;
		Object executeScript = executor4.executeScript("arguments[0].scrollIntoView(true)",findElement3);
		String string = findElement3.getText();
		System.out.println(string);                                                      */
		
		//Day12 task02
/*		driver.get("https://www.toolsqa.com/");
		WebElement scrollDown = driver.findElement(By.xpath("//div[@class='single-share-box']"));
		Thread.sleep(5000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		Thread.sleep(5000);
		WebElement scrollUp = driver.findElement(By.xpath("(//h1[@style='text-align:center;'])[1]"));
		JavascriptExecutor executor2 =(JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].scrollIntoView(false)", scrollUp);                         */
		
		//Day12 task02
/*		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement scrollDown = driver.findElement(By.id("heading304"));
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)",scrollDown);         */
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//Day07 Task01  ScreenShot
	/*	driver.get(" http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		TakesScreenshot screen = (TakesScreenshot) driver;
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File f = new File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\Greens.png");
		FileUtils.copyFile(screenshotAs, f);                                                           */
		
		
		//Day07 Task02
	/*	driver.get("http://toolsqa.com/");
		WebElement scrollDown = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)",scrollDown);                             */
		
		//Day07 Task03
	/*	driver.get("http://toolsqa.com/");
		WebElement scrollDown = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].scrollIntoView(true)",scrollDown);
		String selenium = scrollDown.getText();
		System.out.println(selenium);                                                   */
		
		//Day07 Task04
	/*	driver.get("http://www.greenstechnologys.com/");
		WebElement scrollDown = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scrollDown);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File o = new File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\Greens address.png");
		FileUtils.copyFile(screenshotAs, o);                                                    */
		
		//Day07 Task05
	/*	driver.get(" http://greenstech.in/selenium-course-content.html");
		WebElement scrollDown = driver.findElement(By.id("heading2011"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scrollDown);
		TakesScreenshot as = (TakesScreenshot) driver;
		File screenshotAs = as.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File f = new File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\Greens address.png");
		FileUtils.copyFile(screenshotAs, f);
		Thread.sleep(4000);
		WebElement scrollUp = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
		js.executeScript("arguments[0].scrollIntoView(false)",scrollUp);                                        */
		
		//Day07 Task06
	/* 	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement scrollDown = driver.findElement(By.xpath("(//h3[@title=\"Top Selenium Trends In 2020\"])[1]"));
		JavascriptExecutor es = (JavascriptExecutor) driver;
		es.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		TakesScreenshot as = (TakesScreenshot) driver;
		File screenshotAs = as.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File f = new File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\top selenium.png");
		FileUtils.copyFile(screenshotAs, f);                                                                    */
		
		//Day07 Task07
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement scrollDown = driver.findElement(By.id("heading20"));
		JavascriptExecutor vc = (JavascriptExecutor) driver;
		vc.executeScript("arguments[0].scrollIntoView(true)",scrollDown);
		vc.executeScript("arguments[0].click()", scrollDown);
		TakesScreenshot aa = (TakesScreenshot) driver;
		File as = aa.getScreenshotAs(OutputType.FILE);
		System.out.println(as);
		File p = new File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\interview.png");
		FileUtils.copyFile(as, p);                                                                         */
		
		//Day07 Task08
	/*	driver.get(" http://greenstech.in/selenium-course-content.html");
		WebElement scrollDown = driver.findElement(By.id("heading302"));
		JavascriptExecutor bb = (JavascriptExecutor) driver;
		bb.executeScript("arguments[0].scrollIntoView(true)",scrollDown);
		bb.executeScript("arguments[0].click()", scrollDown);
		TakesScreenshot scr = (TakesScreenshot) driver;
		File file = scr.getScreenshotAs(OutputType.FILE);
		System.out.println(file);
		File g = new File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\java interview.png");
		FileUtils.moveFile(file, g);                                                                          */
		
		//Day07 Task09
	/*	driver.get(" https://www.flipkart.com/");
		Robot esc = new Robot();
		esc.keyPress(KeyEvent.VK_ESCAPE);
		WebElement txtBox = driver.findElement(By.xpath("//div[@class='_3OO5Xc']"));
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','iphone')",txtBox);
		WebElement btnClick = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnClick.click();
		TakesScreenshot b = (TakesScreenshot) driver;
		File file = b.getScreenshotAs(OutputType.FILE);
		File x = new File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\iphone.png");
		FileUtils.moveFile(file, x);                                                                             */
		
		//Day07 Task10
/*		driver.get("https://www.amazon.in/");
		WebElement txtBoxSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','motorola')", txtBoxSearch);
		WebElement btnSearch = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		js.executeScript("arguments[0].click()", btnSearch);
		TakesScreenshot motoPhone = (TakesScreenshot) driver;
		File moto = motoPhone.getScreenshotAs(OutputType.FILE);
		File l = new  File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\motoPhone.png");
		FileUtils.moveFile(moto, l);                                                                         */
		
	//	Day07 Task11
	/*	driver.get("https://www.flipkart.com/");
		Robot btnEsc = new Robot();
		btnEsc.keyPress(KeyEvent.VK_ESCAPE);
		WebElement womenMouseOver = driver.findElement(By.xpath("//*[text()='Women']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(womenMouseOver).perform();
		TakesScreenshot womenProduct = (TakesScreenshot) driver;
		File screenshotAsWomenProduct = womenProduct.getScreenshotAs(OutputType.FILE);
		File location = new File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\womensproduct.png");
		FileUtils.moveFile(screenshotAsWomenProduct, location);                                                  */    
		
		//Day07 Task12
	/*	driver.get("https://www.flipkart.com/");
		Robot btnEsc = new Robot();
		btnEsc.keyPress(KeyEvent.VK_ESCAPE);
		WebElement mouseOverKidsAndBaby = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		Actions actions= new Actions(driver);
		actions.moveToElement(mouseOverKidsAndBaby).perform();
		TakesScreenshot kidsAndBabyProduct = (TakesScreenshot) driver;
		File screenshotAsBabyProduct = kidsAndBabyProduct.getScreenshotAs(OutputType.FILE);
		File moveLocation = new File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\babyproduct.png");
		FileUtils.moveFile(screenshotAsBabyProduct, moveLocation);                                           */
		
		//Day07 Task133
//		driver.get("https://www.snapdeal.com/");
//		WebElement txtBox = driver.findElement(By.xpath("//*[@id='inputValEnter']"));
//		JavascriptExecutor downCasting = (JavascriptExecutor) driver;
//		downCasting.executeScript("arguments[0].setAttribute('value','HP Laptop')",txtBox);
	//	downCasting.executeScript("arguments[0].click()",txtBox);
//		Thread.sleep(2000);
//		Robot btnEnter = new Robot();
//		btnEnter.keyPress(KeyEvent.VK_ENTER);
//		btnEnter.keyPress(KeyEvent.VK_ENTER);
//		btnEnter.keyPress(KeyEvent.VK_ENTER);
//		TakesScreenshot downCastings = (TakesScreenshot) driver;
//		File screenshotAsHpLaptop = downCastings.getScreenshotAs(OutputType.FILE);
//		File location = new File("C:\\Users\\intel\\Pictures\\Screenshot fileoperation\\hplaptop.png");
//		FileUtils.moveFile(screenshotAsHpLaptop, location);
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		//Day10 Task01
	/*driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone X",Keys.ENTER);
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed Premium)']"));
		Actions cc = new Actions(driver);
		cc.contextClick(rightclick).perform();
		Robot c = new Robot();
		for (int i = 1; i <=2; i++) {
		c.keyPress(KeyEvent.VK_DOWN);
		c.keyRelease(KeyEvent.VK_DOWN);	
			}
		c.keyPress(KeyEvent.VK_ENTER);	
		c.keyRelease(KeyEvent.VK_ENTER);	
		Thread.sleep(5000);
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		Set<String> childWindowsId = driver.getWindowHandles();
		System.out.println(childWindowsId);
		
		for (String str : childWindowsId) {
			if (!parentWindowId.equals(str)) {
				driver.switchTo().window(str);
			}
			}
		String text = driver.findElement(By.id("priceblock_ourprice")).getText();
		System.out.println(text);      */                                                         
		
		//Day10 Task02
	/*	driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone 7",Keys.ENTER);
		WebElement searchIphone = driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Black']"));
		Actions ref = new Actions(driver);
		ref.contextClick(searchIphone).perform();
		Robot refe = new Robot();
		for (int i = 1; i <=2; i++) {
			refe.keyPress(KeyEvent.VK_DOWN);
			refe.keyRelease(KeyEvent.VK_DOWN);	
			}
		refe.keyPress(KeyEvent.VK_ENTER);
		refe.keyRelease(KeyEvent.VK_ENTER);
		//to switch parent windows into child windows
		String parentwindowId = driver.getWindowHandle();
		System.out.println(parentwindowId);
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println(childWindows);
		for (String string : childWindows) {
			if (!string.equals(parentwindowId)) {
				driver.switchTo().window(string);
				}
			}
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		String textPrice = driver.findElement(By.xpath("(//span[@class='price'])[2]")).getText();
		System.out.println(textPrice);                                                                                     */
		
		
		//Day10 Task03
		/*driver.get("https://www.homedepot.com/");
		driver.findElement(By.xpath("//input[@class='SearchBox__input']")).sendKeys("celling fan",Keys.ENTER);
		WebElement firstProduct = driver.findElement(By.xpath("(//span[contains(text(),'Ashby Park 52 in. White Color')])[1]"));
		Actions refere= new Actions(driver);
		refere.contextClick(firstProduct).perform();
		Robot g = new Robot();
		for (int i = 0; i <=1; i++) {
			g.keyPress(KeyEvent.VK_DOWN);
			g.keyRelease(KeyEvent.VK_DOWN);
			}
		g.keyPress(KeyEvent.VK_ENTER);
		g.keyRelease(KeyEvent.VK_ENTER);
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);
		for (String string : childWindow) {
			if (!parentWindow.equals(string)) {
			driver.switchTo().window(string);	                                                          */
		
		
		//Day10 Task04
/*		driver.get(" http://www.greenstechnologys.com/python-training.html");
		WebElement btnSelenium = driver.findElement(By.id("Python-Solutions-Architect-Training"));
		JavascriptExecutor executor=  (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)",btnSelenium);
		Thread.sleep(2000);
		WebElement btnSele = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		executor.executeScript("arguments[0].click()",btnSele);
		WebElement btnSeleDay10task = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		executor.executeScript("arguments[0].click()", btnSeleDay10task);
//		WebElement scrollDown = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
//		executor.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		Robot y = new Robot();
		
		y.keyPress(KeyEvent.VK_ESCAPE);
		y.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath("(//button[@data-action='Clicked_On_Request_Batch'])[33]")).click();
		
//		Actions pp= new  Actions(driver);
//		pp.contextClick(seleniumTask).perform();
		
		for (int i = 0; i <=2; i++) {
		y.keyPress(KeyEvent.VK_DOWN);
		y.keyRelease(KeyEvent.VK_DOWN);
			}
		y.keyPress(KeyEvent.VK_ENTER);
		y.keyRelease(KeyEvent.VK_ENTER);
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println(childWindows);
		for (String string2 : childWindows) {
			if (!string2.equals(parentWindow) ){
			driver.switchTo().window(string2);
			}
			
			
		}                                                                                  */
		
		//Day10 Task05
	/*	driver.get("http://www.greenstechnologys.com/");
		WebElement courceMouseOver = driver.findElement(By.xpath("(//a[@href='courses.html'])[1]"));
		Actions scc = new Actions(driver);
		scc.moveToElement(courceMouseOver).perform();
		driver.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/python-training.html'])[1]")).click();
		Robot n = new  Robot();
		n.keyPress(KeyEvent.VK_ESCAPE);
		n.keyRelease(KeyEvent.VK_ESCAPE);
		WebElement scroll = driver.findElement(By.xpath("//h4[text()='Python  IT Certification']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scroll);
		WebElement selectExplore = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		//Thread.sleep(5000);
		scc.contextClick(selectExplore).perform();
		for (int i = 0; i <=1; i++) {
			n.keyPress(KeyEvent.VK_DOWN);
			n.keyRelease(KeyEvent.VK_DOWN);
		}
		n.keyPress(KeyEvent.VK_ENTER);
		n.keyRelease(KeyEvent.VK_ENTER);
		String parentwindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for (String string : childWindow) {
			if (!string.equals(parentwindow)) {
				driver.switchTo().window(string);
				}
			}      
			
			                                                                                         */
		//Day10Task06
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//div[@id='heading304']")).click();
		driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/JUNIT.txt']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for (String string : childWindow) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);
				}
			}
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")).getText();
		System.out.println(text);                                                                                                    */
		
		//Day10task07
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//div[@id='heading302']")).click();
		driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Day4_ControlStatements.txt']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for (String string : childWindow) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);
			}
		}
		String text = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")).getText();
		System.out.println(text);                                                                             
		                                                                                              */
		
		//Day10Task08
		
	/*	driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("hand sanitizer",Keys.ENTER);
		driver.findElement(By.xpath("(//p[contains(text(),'Mirah Belle Le')])[1]")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		for (String string : childwindow) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);
					}
		}
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();                              */
		
		
		//Day10Task09
	/*	driver.get("https://www.flipkart.com/");
		Robot g = new Robot();
		g.keyPress(KeyEvent.VK_ESCAPE);
		g.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi phone",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for (String string : childWindow) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);
				}
		}
		
		String text = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		System.out.println(text);                                                                                    */
		
		
		
		//Day10Task10
	/*	driver.get("https://www.flipkart.com/");
		Robot p = new Robot();
		p.keyPress(KeyEvent.VK_ESCAPE);
		p.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath("//*[@title='Search for products, brands and more']")).sendKeys("mask",Keys.ENTER);
		Thread.sleep(5000);
		WebElement maskClick = driver.findElement(By.xpath("(//*[contains(text(),'NEA N95 / KN95 FFP2 5')])[1]"));
		maskClick.click();
	//	JavascriptExecutor o = (JavascriptExecutor) driver;
	//	o.executeScript("arguments[0].click()", maskClick);
		
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for (String string2 : childWindow) {
			if (!string2.equals(parentWindow)) {
				driver.switchTo().window(string2);
				}
		}
		String pincode = driver.findElement(By.xpath("//*[@value='400016']")).getText();
		System.out.println(pincode);                                                                */
		
		//Day10 Task11
	/* 	driver.get("https://www.flipkart.com/");
		Robot p = new Robot();
		p.keyPress(KeyEvent.VK_ESCAPE);
		p.keyRelease(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath("//*[@placeholder='Search for products, brands and more']")).sendKeys("hp laptop",Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindows = driver.getWindowHandles();
		//To covert Set into Set
		List<String> li = new ArrayList<String>();
		li.addAll(childWindows);
		driver.switchTo().window(li.get(1));
		String laptopPrice = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		System.out.println(laptopPrice);                                                                       */
		
		
		//Day10 Task11
/*		driver.get("http://greenstech.in/selenium-course-content.html");
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		WebElement scrollDown = driver.findElement(By.xpath("//div[@id='heading303']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		//driver.findElement(By.xpath("//div[@id='heading303']")).click();
		js.executeScript("arguments[0].click()",scrollDown);
		driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		List<String> toConvert = new  ArrayList<String>();
		toConvert.addAll(childWindow);
		driver.switchTo().window(toConvert.get(1));
		String toGetPracticeQues = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")).getText();
		System.out.println(toGetPracticeQues);                                                                 */
		
		
		//Day10 Task12
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement scroll = driver.findElement(By.xpath("//div[@id='heading304']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scroll);
		js.executeScript("arguments[0].click()",scroll);
		driver.findElement(By.xpath("//*[text()=' TESTNG']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindows = driver.getWindowHandles();
		List<String> po = new ArrayList<String>();
		po.addAll(childWindows);
		driver.switchTo().window(po.get(1));
		String string = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")).getText();
		System.out.println(string);                                                         */
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Day08 Task07     Frame
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		List<WebElement> findframe = driver.findElements(By.tagName("frameset"));
		int size = findframe.size();
		System.out.println(size);
		driver.switchTo().frame(0);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("ramana123");
		driver.findElement(By.xpath("(//*[@alt='continue'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='input_password'])[2]")).sendKeys("152251");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
}                                                
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x", Keys.ENTER);
//		WebElement btnProdct = driver.findElement(By.xpath("(//span[text()='Apple iPhone X (256GB) - Space Grey'])[2]"));
//		Actions s = new Actions(driver);
//		s.contextClick(btnProdct).perform();
//		Robot r =  new Robot();
//		for (int i = 0; i <=1; i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);	
//				}
//			r.keyPress(KeyEvent.VK_ENTER);	
//			r.keyRelease(KeyEvent.VK_ENTER);	
//			Thread.sleep(5000);
//			
//			String parentWindow = driver.getWindowHandle();
//			System.out.println(parentWindow);
//			
//			Set<String> childWindow = driver.getWindowHandles();
//			System.out.println(childWindow);
//			
//			for (String string : childWindow) {
//				if (!parentWindow.equals(string)) {
//					driver.switchTo().window(string);
//				}
//			}
//			String text = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-price priceBlockBuyingPriceString']")).getText();
//			System.out.println(text);
			
		
		
	
		
	


			
		
		
			
		
	
	
	
	
	
	
	
	
	
	



































	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


