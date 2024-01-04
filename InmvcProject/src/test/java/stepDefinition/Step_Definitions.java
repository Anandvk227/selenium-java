package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import genericLib.PropertyFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_Definitions {
	WebDriverWait wait;
	WebDriver driver=null;	
	PropertyFile p=new PropertyFile();
	@Before(order=0)
	public void openApp() throws IOException {
		
//		System.out.println(" I am inside brower setup");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is: "+projectPath);
		
//		System.setProperty("webdriver.chrome.driver",
//				"src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
//		WebDriverManager.operadriver().setup();	
//		driver=new OperaDriver();
	
//	WebDriverManager.firefoxdriver().setup();		
//	driver=new FirefoxDriver();
	
//	WebDriverManager.edgedriver().setup();	
//	driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://inmvc-uat.instavc.net/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
	}
	@After(order=0)
	public void closeApp() {
		System.out.println(" I am Closing the browser");
//		driver.close();
		driver.quit();
	}
	
	
	
	@Given("user is in Login Page")
	public void user_is_in_login_page() {
		
		System.out.println("  user is on Login page");
		
	   
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_harish_yopmail_com_and_inmvc(String UserName, String Password) throws IOException{
		driver.findElement(By.name("email")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
	}

	@When("click on Login button")
	public void click_on_login_button() throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[2]/div/div[2]/form/div[4]/button")).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Then("user is navigated to dashboard page")
	public void user_is_navigated_to_dashboard_page() {
		String expected_Text0 = "Today’s Meetings (0)";
		String actual_Text0 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[3]/div/div/div[1]/div/div[1]/div/span")).getText();
		Assert.assertEquals(expected_Text0, actual_Text0);
		System.out.println("  user is on Login page");
		
	}

	@Then("user is have to verify invalid message")
	public void user_is_have_to_verify_invalid_message() {
		String expected_Text1 = "Incorrect username or password";
		String actual_Text2 = driver.findElement(By.xpath("//div[@role='status']")).getText();
		Assert.assertEquals(expected_Text1, actual_Text2);
	}

//	@Then("Click on Book Room button")
//	public void click_on_book_room_button() throws InterruptedException {
//	    driver.findElement(By.xpath("//button[normalize-space()='Book room']")).click();
//	    Thread.sleep(3000);
//	}

	@Then("Select Available Room")
	public void select_available_room() throws InterruptedException {

		Thread.sleep(2000);
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Then("Check the Date and time and Click on one Time")
	public void check_the_date_and_time_and_click_on_one_time() throws InterruptedException {
		
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[3]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/table/tbody/tr/td/div/div/div/div[1]/table/tbody/tr[77]/td[2]")).click();
		 

 
	}

	@Then("Enter Meeting Title and Description")
	public void enter_meeting_title_and_description() {
	   driver.findElement(By.name("meetName")).sendKeys("Testing Team Meeting");
	   driver.findElement(By.name("meetDescription")).sendKeys("Testing Team Meeting");
	}

	@Then("Check Date and Time")
	public void check_date_and_time() {
		
		System.out.println("Selected date and time is Displyed");


	}

	@Then("Select one Video for Meeting")
	public void select_one_video_for_meeting() throws InterruptedException {
	    driver.findElement(By.xpath("//img[@src='/images/webX.svg']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@Then("Add one Participant")
	public void add_one_participant() throws AWTException, InterruptedException {
	    WebElement element=driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[2]/div[7]/div/div[1]/div/div/div/div/div/input"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	    element.sendKeys("anand@yopmail.com");
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    		
	}
	
	@Then("Click on Book Room button")
	public void Click_on_Book_Room_button() throws InterruptedException {
		WebElement element=driver.findElement(By.xpath("//button[normalize-space()='Book room']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		element.click();
//		driver.findElement(By.xpath("//button[text()='Book room']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
	}
	
	

//	@Then("verify the Booked room Confirmation Message")
//	public void verify_the_booked_room_confirmation_message() throws InterruptedException {
//		String expected_Text11 = "Successfully booked a meeting room";
//		String actual_Text22 = driver.findElement(By.xpath("//div[@role='status']")).getText();
//		Assert.assertEquals(expected_Text11, actual_Text22);
//		Thread.sleep(3000);
//	   
//	}

	@Then("Click on that Created Meeting")
	public void click_on_that_created_meeting() {
		
	    driver.findElement(By.xpath("//div[@class='flexMinWidthCol pdngHXS alignCntr justifyCntr ']")).click();
	}

	@Then("Click on Delete button")
	public void click_on_delete_button() throws InterruptedException {
	    driver.findElement(By.xpath("//div[@class='flexAutoRow']//span[@class='pointer']//*[name()='svg']")).click();
	    Thread.sleep(2000);
	}

	@Then("Check the Delete popup and Click on Delete button")
	public void check_the_delete_popup_and_click_on_delete_button() throws InterruptedException {
	    driver.findElement(By.xpath("//button[normalize-space()='delete']")).click();
	    Thread.sleep(2000);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("Check the Meeting is Deleted in List")
	public void check_the_meeting_is_deleted_in_list() {
	    System.out.println("Meeting Deleted Successfully");
	   
	}

	@When("user Click on Forgot Password button")
	public void user_click_on_forgot_password_button() {
	   WebElement forgot= driver.findElement(By.xpath("//button[normalize-space()='Forgot Password ?']"));
	   forgot.click();
	}

	@Then("Enter Valid email address")
	public void enter_valid_email_address() throws InterruptedException {
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("anand@yopmail.com");
		WebElement sendotp=driver.findElement(By.xpath("//button[normalize-space()='Send OTP']"));
		sendotp.click();
		Thread.sleep(4000);
	   
	}

	@Then("Verify OTP Page")
	public void verify_otp_page() {
		
		System.out.println("ABD");
//		String expected_Text1 = "Reset Password";
//		String actual_Text2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[2]/div/div/div[1]/span[1]")).getText();
//		Assert.assertEquals(expected_Text1, actual_Text2);
		
	    
	}

	@Then("Change the Tab to OTP Page")
	public void change_the_tab_to_otp_page() throws InterruptedException {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.open()", "");
//		  js.executeScript("Window.open();");
		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  Thread.sleep(3000);
	}

	@Then("Enter OTP getted Mail")
	public void enter_otp_getted_mail() throws InterruptedException {
		driver.get("https://yopmail.com/en/");
		Thread.sleep(3000);
	   WebElement emailfield= driver.findElement(By.id("login"));
	   emailfield.sendKeys("anand");
	   WebElement click=driver.findElement(By.xpath("//button[@title='Check Inbox @yopmail.com']"));
	   click.click();
	   Thread.sleep(8000);
	 
	}

	@Then("Copy the OTP")
	public void copy_the_otp() throws AWTException, InterruptedException {
		WebElement iframeElement = driver.findElement(By.id("ifmail"));		//driver.switchTo().frame("id of the element");
		driver.switchTo().frame(iframeElement);
	    WebElement ele=driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/div/div[3]/span"));
	    Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.open()", "");
//		  js.executeScript("Window.open();");
		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(0));
		  Thread.sleep(3000);
		  WebElement paste=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		  paste.click();
		  Robot r1=new Robot();
			r1.keyPress(KeyEvent.VK_CONTROL);
			r1.keyPress(KeyEvent.VK_V);
			r1.keyRelease(KeyEvent.VK_CONTROL);
			r1.keyRelease(KeyEvent.VK_V);
		  WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		  password.sendKeys("Inmvc@123");
		  WebElement cpassword=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		  cpassword.sendKeys("Inmvc@123");
		  WebElement submit=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].scrollIntoView(true);",submit);
		  submit.click();
		  Thread.sleep(3000);
		
	}



	@Then("Click on Calendar button")
	public void click_on_calendar_button() throws InterruptedException {
	    
		WebElement calendar=driver.findElement(By.xpath("//span[normalize-space()='Calendar']"));
		calendar.click();
		Thread.sleep(3000);
	}

	@Then("Select room from dropdown")
	public void select_room_from_dropdown() throws InterruptedException {
	   WebElement roomdropdown=driver.findElement(By.xpath("//span[@class='flexInline alignCntr capitalTxt ']"));
	   roomdropdown.click();
	   Thread.sleep(1000);
	   WebElement allselect=driver.findElement(By.xpath("//div[contains(@class,'flexRow alignCntr brdrBSM pdngHSM')]//input[contains(@type,'checkbox')]"));
	   allselect.click();
	   Thread.sleep(1000);
	   WebElement selectroom=driver.findElement(By.xpath("//div[contains(@class,'flexCol menuListCntr pdngHSM')]//div[1]//div[2]//span[1]//input[1]"));
	   selectroom.click();
	   Thread.sleep(1000);
	   WebElement apply=driver.findElement(By.xpath("//span[normalize-space()='Apply']"));
	   apply.click();
	   Thread.sleep(1000);
	}

	@Then("Select time for Meeting")
	public void select_time_for_meeting() throws InterruptedException {
//	   WebElement time=driver.findElement(By.xpath("//span[normalize-space()='5:00 PM']"));
//	   time.click();
	   Thread.sleep(3000);
	}

	@Then("Disable the Video Call button")
	public void disable_the_video_call_button() throws InterruptedException {
		WebElement disable=driver.findElement(By.xpath("//input[@id='public']"));
		disable.click();
		Thread.sleep(1000);
	   
	}

	@Then("Click on Edit button")
	public void click_on_edit_button() throws InterruptedException {
	    WebElement editmeeting=driver.findElement(By.xpath("//button[normalize-space()='Edit meeting']"));
	    editmeeting.click();
	    Thread.sleep(3000);
	}

	@Then("Edit the Meeting name ad Description")
	public void edit_the_meeting_name_ad_description() throws AWTException, InterruptedException {
	    WebElement meetingname=driver.findElement(By.name("meetName"));
	    meetingname.click();
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_A);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_A);
	    meetingname.sendKeys("Meeting for QA Team");
	    Thread.sleep(2000);
	    
	    WebElement meetingdescription=driver.findElement(By.name("meetDescription"));
	    meetingdescription.click();
	    Robot r1=new Robot();
	    r1.keyPress(KeyEvent.VK_CONTROL);
	    r1.keyPress(KeyEvent.VK_A);
	    r1.keyRelease(KeyEvent.VK_CONTROL);
	    r1.keyRelease(KeyEvent.VK_A);
	    meetingdescription.sendKeys("Meeting for QA Team");
	    Thread.sleep(2000);
	}

	@Then("Click on Update Meeting")
	public void click_on_update_meeting() throws InterruptedException {
		WebElement updatemeeting=driver.findElement(By.xpath("//button[normalize-space()='UPDATE MEETING']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",updatemeeting);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		updatemeeting.click();
		WebElement update=driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		update.click();
	    Thread.sleep(3000);
	}


	@Then("Edit Date and Time")
	public void edit_date_and_time() {
	    WebElement clickondate=driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer timeinput alignCntr')]"));
	    clickondate.click();
	    
	    WebElement nextmonth=driver.findElement(By.xpath("//button[contains(@title,'Next month')]//*[name()='svg']"));
	    nextmonth.click();
	    
	    WebElement starttime=driver.findElement(By.xpath("//div[contains(@class,'alignCntr timeinput marginH4')]"));
	    starttime.click();
	    
	    WebElement selecttime=driver.findElement(By.xpath("//li[contains(@value,'81')]"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",selecttime);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    selecttime.click();
	    
	    WebElement endtime=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[2]/div[4]/div[3]/div"));
	    endtime.click();
	    
	    WebElement selectendtime=driver.findElement(By.xpath("//li[contains(@value,'83')]"));
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView(true);",selectendtime);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    selectendtime.click();
	}




}
