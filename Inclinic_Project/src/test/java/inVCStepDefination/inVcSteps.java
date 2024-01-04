//package inVCStepDefination;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.io.IOException;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import genericLib.PropertyFile;
//import genericLib.WebDriverUtilies;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pomPages.LoginPage;
//import pomPages.addEmployeesPage;
//import pomPages.createNews;
//import pomPages.employeesPage;
//import pomPages.homePage;
//
//public class inVcSteps {
//	
//	WebDriver driver = null;
////	WebDriverUtilies driverutilies;
//	PropertyFile p=new PropertyFile();
//	LoginPage l=	new LoginPage(driver);
//	homePage h=new homePage(driver);
//	createNews cn = new createNews(driver);
//	employeesPage e = new employeesPage(driver);
//	addEmployeesPage an = new addEmployeesPage(driver);
//	WebDriverUtilies driverutilies=new WebDriverUtilies();
//	
//	@Before(order=0)
//	public void openApp() throws IOException {
//		
//		System.out.println(" I am inside brower setup");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is: "+projectPath);
//		
//		System.setProperty("webdriver.chrome.driver",
//				projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		
////		WebDriverManager.operadriver().setup();	
////		driver=new OperaDriver();
//		
////		WebDriverManager.firefoxdriver().setup();	
////		driver=new FirefoxDriver();
//		
////		WebDriverManager.edgedriver().setup();	
////		driver=new EdgeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://app.invc.vc/");
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		
//	}
//	@After(order=0)
//	public void closeApp() {
//		System.out.println(" I am Closing the browser");
////		driver.close();
//		driver.quit();
//	}
//	
//	@Given("user is on Login page")
//	public void user_is_on_login_page() {
//	   
//	}
//	
//	@Then("Verify inVC logo is displaying")
//	public void verify_in_vc_logo_is_displaying() {
//		WebElement inVCLogo = driver.findElement(By.xpath("//div[@class='flexInline']"));
//    	inVCLogo.isDisplayed();
//    	
//	}
//
//	@Then("Verify login Title is displaying")
//	public void verify_login_title_is_displaying() {
//		WebElement logInTitle = driver.findElement(By.xpath("//h1[@class='hmTitleTxt txtCenter']"));
//    	logInTitle.isDisplayed();
//    	
//    	
//	}
//
//	@Then("Verify login Link Text is displaying")
//	public void verify_login_link_text_is_displaying() {
//		WebElement loginLinkText = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//    	loginLinkText.isDisplayed();
//    	
//	}
//
//	@Then("Verify signUp Link is displaying")
//	public void verify_sign_up_link_is_displaying() {
//
//    	WebElement signUpLink = driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
//    	signUpLink.isDisplayed();
//	}
//
//
//	@When("^user enters valid (.*) and valid (.*)$")
//	public void user_enters_valid_user_name_and_valid_password(String UserName, String Password) {
//		WebElement username=driver.findElement(By.id("email"));
//		WebElement password=driver.findElement(By.id("password"));
//		username.sendKeys(UserName);
//		password.sendKeys(Password);
//	}
//
//	@And("hits on Login")
//	public void hits_on_login() {
//		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//		login.click();
//	}
//
//	@Then("I should be redirected to the dashboard page")
//	public void i_should_be_redirected_to_the_dashboard_page() {
//		String expectedErrorMsg = "Today Meetings";
//		 WebElement exp = driver.findElement(By.xpath("//span[@class='cardhdngTxt']"));
//	        String actualErrorMsg = exp.getText();
//	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
//	}
//	@Then("^It should display (.*) error message$")
//	public void it_should_display_incorrect_username_or_password_error_message(String ErrorMessage) {
//		String expectedErrorMsg = ErrorMessage;
//		 WebElement exp = driver.findElement(By.xpath("//span[@class='errorTxt']"));
//	        String actualErrorMsg = exp.getText();
//	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
//	}
//
////	SignUp Page
//	
//	@When("user hits on signUp Link")
//	public void user_hits_on_sign_up_link() {
//		WebElement signUpLink = driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
//		signUpLink.click();
//	}
//
//	@Then("I should redirect to the signUp Page")
//	public void i_should_redirect_to_the_sign_up_page() {
//	    
//		
//	}
//
//	@Then("Verify language drop down is displaying")
//	public void verify_language_drop_down_is_displaying() {
//		WebElement languagedd = driver.findElement(By.xpath("(//div[@class='flexInline'])[2]"));
//		languagedd.isDisplayed();
//	}
//
//	@Then("Verify signUp Text is displaying")
//	public void verify_sign_up_text_is_displaying() {
//		WebElement signUpText = driver.findElement(By.xpath("//h1[@class='hmTitleTxt1 txtCenter']"));
//		signUpText.isDisplayed();
//	}
//
//	@Then("Verify signUp button is displaying")
//	public void verify_sign_up_button_is_displaying() {
//		WebElement signUpbtn = driver.findElement(By.xpath("//div[@class='flexCol hmBtnBox']"));
//		signUpbtn.isDisplayed();
//		
//	}
//
//	@Then("Verify login Link is displaying")
//	public void verify_login_link_is_displaying() {
//		WebElement loginLink = driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
//		loginLink.isDisplayed();
//	}
//
//	@Then("Verify terms and condition link is displaying")
//	public void verify_terms_and_condition_link_is_displaying() {
//		WebElement termsandconditionlink = driver.findElement(By.xpath("//a[@target='_blank']"));
//		termsandconditionlink.isDisplayed();
//	}
//	
////	 SIGNUP WITH VALID DATA
//
//		@Then("^user Enters (.*) into the full Name text field$")
//		public void user_enters_full_name_into_the_full_name_text_field(String FullName) {
//			  WebElement fullnametb = driver.findElement(By.xpath("//input[@id='fullname']"));
//			  fullnametb.sendKeys(FullName);
//		}
//
//		@Then("^user Enters (.*) into the email text field$")
//		public void user_enters_email_into_the_email_text_field(String email) {
//			 WebElement emailtb = driver.findElement(By.xpath("//input[@id='email']"));
//			  emailtb.sendKeys(email);
//		}
//
//		@Then("^user Enters (.*) into the password text field$")
//		public void user_enters_password_into_the_password_text_field(String password) {
//			 WebElement passwordtb= driver.findElement(By.id("password"));
//			   passwordtb.sendKeys(password);
//		}
//
//		@Then("^user Enters (.*) into the confirm Password text field$")
//		public void user_enters_confirm_password_into_the_confirm_password_text_field(String confirmPassword) {
//			 WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
//			   confirmPasswordtb.sendKeys(confirmPassword);
//		}
//
//		@Then("user hits on Sign Up button")
//		public void user_hits_on_sign_up_button() {
//			WebElement signUpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//			signUpbtn.click();
//		}
//		
//		@Then("^verify the (.*) toast message$")
//		public void verify_the_error_message_toast_message(String errorMessage) {
//			String expectedErrorMsg = errorMessage;
//			 WebElement exp = driver.findElement(By.xpath("//div[@class='errorMsgBlock']"));
//		        String actualErrorMsg = exp.getText();
//		  Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
//		}
//		
//		@Then("^verify the (.*) error message$")
//		public void verify_the_full_name_should_be_the_alphabets_only_error_message(String errorMessage) {
//			String expectedErrorMsg = errorMessage;
//			 WebElement exp = driver.findElement(By.xpath("//p[@id='txtFirstName-error']"));
//		        String actualErrorMsg = exp.getText();
//		  Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
//		}
//		
//		@Then("^verifying the (.*) error message$")
//		public void verifying_the_full_name_should_be_the_alphabets_only_error_message(String errorMessage) {
//			String expectedErrorMsg = "Email should be in a proper format";
//			 WebElement exp = driver.findElement(By.xpath("//p[@id='txtEmail-error']"));
//		        String actualErrorMsg = exp.getText();
//		  Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
//		}
//		
//		@Then("^verify password  (.*) error message$")
//		public void verify_password_password_should_be_eight_characters_long_and_combination_one_uppercase_one_lowercase_one_digit_and_one_special_character_error_message(String errorMessage) {
//			String expectedErrorMsg = "Password should be eight characters long and combination one uppercase, one lowercase, one digit and one special character";
//			 WebElement exp = driver.findElement(By.xpath("//p[@id='txtPassword-error']"));
//		        String actualErrorMsg = exp.getText();
//		  Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
//		        		
//		}
//		
//		@Then("^verify invalid confirmpassword  (.*) error message$")
//		public void verify_invalid_confirmpassword_confirm_password_should_match_the_above_password_error_message(String errorMessage) {
//			String expectedErrorMsg = "Confirm password should match the above password";
//			 WebElement exp = driver.findElement(By.xpath("//p[@id='txtConfirmPwd-error']"));
//		        String actualErrorMsg = exp.getText();
//		  Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
//		        		
//		}
//		
////		Verifying the Elements of Forgot password page.
//		
//			@When("user hits on forgot Password Link")
//			public void user_hits_on_forgot_password_link_link() {
//				WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[@class='hmBtnAnchor txtCenter']"));
//		    	forgotPasswordLink.click();
//				
//			}
//
//			@Then("Verify forgot password text is displaying")
//			public void verify_forgot_password_text_is_displaying() {
//				WebElement forgotpasswordtext = driver.findElement(By.xpath("//h1[@class='hmTitleTxt txtCenter']"));
//				forgotpasswordtext.isDisplayed();
//			}
//
//			@Then("Verify enter mail text box is displaying")
//			public void verify_enter_mail_text_box_is_displaying() {
//				WebElement  entermailtb = driver.findElement(By.id("standard-with-placeholder"));
//				entermailtb.isDisplayed();
//			}
//
//			@Then("Verify send otp button is displaying")
//			public void verify_send_otp_button_is_displaying() {
//				WebElement sendotpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//				sendotpbtn.isDisplayed();
//			}
//
//			@Then("Verify login button is displaying")
//			public void verify_login_button_is_displaying() {
//				WebElement loginbtn = driver.findElement(By.xpath("//a[@class='hmBtnAnchor txtCenter']"));
//				loginbtn.isDisplayed();
//			}
//
//			@Then("I should redirect to the forgot Password Page")
//			public void i_should_redirect_to_the_forgot_password_page() {
//				
//			}
//
//			@Then("^user enters (.*) into the mailId Text field$")
//			public void user_enters_mail_into_the_mail_id_text_field(String mail) {
//				WebElement entermailtf = driver.findElement(By.id("standard-with-placeholder"));
//				entermailtf.sendKeys(mail);
//			}
//
//			@Then("user clicks on send OTP button")
//			public void user_clicks_on_send_otp_button() throws InterruptedException {
//				WebElement sendotpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//				sendotpbtn.click();
//				Thread.sleep(3000);
//			}
//
//			@Then("^Verify the current page text (.*)$")
//			public void verify_the_current_page_text_text(String text) throws InterruptedException {
//				Thread.sleep(1000);
//			    String actual_text = driver.findElement(By.xpath("//h1[normalize-space()='Create New Password']")).getText();
//			    String expected_text = "Create New Password";
//			    Assert.assertEquals(actual_text, expected_text);
//			}
//
//			@Then("^Verify the error text (.*)$")
//			public void verify_the_error_text_please_enter_valid_email(String text) throws InterruptedException {
//				Thread.sleep(3000);
//				String expectedErrorMsg = "Please Enter Valid Email";
//				WebElement exp = driver.findElement(By.xpath("//div[@class='errorMsgBlock']"));
//				String actualErrorMsg = exp.getText();
//				Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
//			}
//			
//	// Invc Dashboard Page
//			
//				@Then("Verify inVclogo is displaying")
//				public void verify_in_vclogo_is_displaying() {
//					WebElement inVclogo = driver.findElement(By.xpath("(//a[@href='/meeting'])[2]"));
//					inVclogo.isDisplayed();
//				}
//
//				@Then("Verify userNametxt is displaying")
//				public void verify_user_nametxt_is_displaying() {
//					WebElement userNametxt = driver.findElement(By.xpath("//div[@class='userName']"));
//					userNametxt.isDisplayed();
//				}
//
//				@Then("Verify userProfileImage is displaying")
//				public void verify_user_profile_image_is_displaying() {
//					WebElement userProfileImage = driver.findElement(By.xpath("//div[@class='userAvatar']"));
//					userProfileImage.isDisplayed();
//				}
//
//				@Then("Verify instaMeetingIcon is displaying")
//				public void verify_insta_meeting_icon_is_displaying() {
//					WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
//					instaMeetingIcon.isDisplayed();
//					
//				}
//
//				@Then("Verify joinMeetingIcon is displaying")
//				public void verify_join_meeting_icon_is_displaying() {
//					WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
//					joinMeetingIcon.isDisplayed();
//				}
//
//				@Then("Verify scheduleMeetingIcon is displaying")
//				public void verify_schedule_meeting_icon_is_displaying() {
//					WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
//					joinMeetingIcon.isDisplayed();
//				}
//
//				@Then("Verify shareScreenIcon is displaying")
//				public void verify_share_screen_icon_is_displaying() {
//					WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
//					shareScreenIcon.isDisplayed();
//					
//				}
//				
//				@When("user clicks on insta Meeting")
//				public void user_clicks_on_insta_meeting() throws InterruptedException {
//					Thread.sleep(1000);
//					
//					WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
//					instaMeetingIcon.click();
//					
//				}
//
//				@Then("user should redirected to the insta Meeting page")
//				public void user_should_redirected_to_the_insta_meeting_page() {
//					
//				}
//
//				@Then("^verifying the text (.*) on the insta Meeting page$")
//				public void verifying_the_text_instameeting_on_the_insta_meeting_page(String  instameeting) {
//				    String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Title']")).getText();
//				    Assert.assertEquals(actualText, "Meeting Title");
//				}
//
//				@Then("the user clicks the Back button in the browser")
//				public void the_user_clicks_the_back_button_in_the_browser() {
//				    driver.navigate().back();
//				}
//
//				@When("user clicks on join Meeting")
//				public void user_clicks_on_join_meeting() throws InterruptedException {
//
//					Thread.sleep(1000);
//					
//					WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
//					joinMeetingIcon.click();
//				}
//
//				@Then("user should redirected to the join Meeting page")
//				public void user_should_redirected_to_the_join_meeting_page() {
//				}
//
//				@Then("^verifying the text (.*) on the join Meeting page$")
//				public void verifying_the_text_joinmeeting_on_the_join_meeting_page(String joinmeeting) {
//				    String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Join a Meeting']")).getText();
//				    Assert.assertEquals(actualText, "Join a Meeting");
//				}
//
//				@When("user clicks on schedule Meeting")
//				public void user_clicks_on_schedule_meeting() throws InterruptedException {
//					Thread.sleep(1000);
//					
//					WebElement scheduleMeetingIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noLeftPdng'])[2]"));
//					scheduleMeetingIcon.click();
//				}
//
//				@Then("user should redirected to the schedule Meeting page")
//				public void user_should_redirected_to_the_schedule_meeting_page() {
//					
//				}
//
//				@Then("^verifying the text (.*) on the schedule Meeting page$")
//				public void verifying_the_text_schedulemeeting_on_the_schedule_meeting_page(String schedulemeeting) {
//					String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Title']")).getText();
//				    Assert.assertEquals(actualText, "Meeting Title");
//				}
//
//				@When("user clicks on share Screen")
//				public void user_clicks_on_share_screen() throws InterruptedException {
//				    Thread.sleep(1000);
//				    WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
//					shareScreenIcon.click();
//					
//				}
//
//				@Then("user should redirected to the share Screen page")
//				public void user_should_redirected_to_the_share_screen_page() {
//				   
//				}
//
//				@Then("^verifying the text (.*) on the share Screen page$")
//				public void verifying_the_text_share_screen_on_the_share_screen_page(String shareScreen) {
//					String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Join Meeting and Share']")).getText();
//				    Assert.assertEquals(actualText, "Join Meeting and Share");
//				}
//
//				@When("user clicks on My Meetig")
//				public void user_clicks_on_my_meetig() throws InterruptedException {
//					Thread.sleep(1000);
//					
//					WebElement  MyMeetig= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
//					MyMeetig.click();
//				
//				}
//
//				@Then("user should redirected to the My Meetig page")
//				public void user_should_redirected_to_the_my_meetig_page() {
//				    
//				}
//
//				@Then("^verifying the text (.*) on the My Meetig page$")
//				public void verifying_the_text_my_meetig_on_the_my_meetig_page(String MyMeetig) {
//					String actualText = driver.findElement(By.xpath("//h1[normalize-space()='My Meetings']")).getText();
//				    Assert.assertEquals(actualText, "My Meetings");
//				}
//				
//
//				@When("user clicks on Calender")
//				public void user_clicks_on_calender() throws InterruptedException {
//					Thread.sleep(1000);
//					
//					WebElement  Calender= driver.findElement(By.xpath("//a[contains(text(),'Calendar')]"));
//					Calender.click();
//				}
//
//				@Then("user should redirected to the Calender page")
//				public void user_should_redirected_to_the_calender_page() {
//					
//				}
//
//				@Then("^verifying the text (.*) on the Calender page$")
//				public void verifying_the_text_calender_on_the_calender_page(String Calender) {
//				    
//					String expectedText = "Calendar View";
//					String Actualtext = driver.findElement(By.xpath("//h1[normalize-space()='Calendar View']")).getText();
//					Assert.assertEquals(expectedText, Actualtext);
//				}
//
//				@When("user clicks on header dropdown My Profile")
//				public void user_clicks_on_header_dropdown_my_profile() throws InterruptedException {
//					Thread.sleep(1000);
//					WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
//					avatarDroDwn.click();
//					Thread.sleep(500);
//					
//					WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
//					myProfile.click();
//					Thread.sleep(500);
//				}
//
//				@Then("user should redirected to the  My Profile page")
//				public void user_should_redirected_to_the_my_profile_page() {
//					
//				}
//
//				@Then("^verifying the text (.*) on the  My Profile page$")
//				public void verifying_the_text_my_profile_on_the_my_profile_page(String MyProfile) {
//					String expectedText = "My Profile";
//					String Actualtext = driver.findElement(By.xpath("//h2[normalize-space()='My Profile']")).getText();
//					Assert.assertEquals(expectedText, Actualtext);
//				}
//
//				@When("user clicks on header dropdown Settings")
//				public void user_clicks_on_header_dropdown_settings() throws InterruptedException {
//					Thread.sleep(1000);
//					
//					WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
//					avatarDroDwn.click();
//					Thread.sleep(500);
//					
//					WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
//					setting.click();
//				}
//
//				@Then("user should redirected to the  Settings page")
//				public void user_should_redirected_to_the_settings_page() {
//				   
//				}
//
//				@Then("^verifying the text (.*) on the  Settings page$")
//				public void verifying_the_text_settings_on_the_settings_page(String Settings) {
//					String expectedText = "Settings";
//					String Actualtext = driver.findElement(By.xpath("//h2[normalize-space()='Settings']")).getText();
//					Assert.assertEquals(expectedText, Actualtext);
//				}
//
//				@When("user clicks on header dropdown Log Out")
//				public void user_clicks_on_header_dropdown_log_out() throws InterruptedException {
//					WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
//					avatarDroDwn.click();
//					//Thread.sleep(2000);
//					
//					WebElement logout=driver.findElement(By.xpath("//a[text()='Log Out']"));
//					logout.click();
//					Thread.sleep(500);
//				}
//
//				@Then("user should redirected to the Login page")
//				public void user_should_redirected_to_the_login_page() {
//				    
//				}
//
//				@Then("^verifying the text (.*) on the  Login page$")
//				public void verifying_the_text_settings_on_the_Login_page(String Login) {
//					String expectedText = "Login";
//					String Actualtext = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
//					Assert.assertEquals(expectedText, Actualtext);
//				}
//				
////	Schedule meeting
//				
//					@Then("^user enters Meeting Title (.*) into the text field$")
//					public void user_enters_meeting_title_scrum_meeting_into_the_text_field(String MeetingTitle) {
//						WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@id='outlined-basic']"));
//						MeetingTitleTF.sendKeys(MeetingTitle);
//					}
//
//					@Then("user click on the enable password toggle button")
//					public void user_click_on_the_enable_password_toggle_button() {
//						WebElement Password_Enable = driver.findElement(By.xpath("//div[@class='MuiFormGroup-root']//input[@type='checkbox']"));
//						Password_Enable.click();
//						
//					}
//
//					@Then("^user enters Meeting password (.*) into the text field$")
//					public void user_enters_meeting_password_into_the_text_field(String MeetingPassword) {
//						WebElement Create_meeting_password = driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-formControl MuiInputBase-adornedEnd MuiOutlinedInput-adornedEnd MuiInputBase-marginDense MuiOutlinedInput-marginDense']//input[@id='outlined-basic']"));
//						Create_meeting_password.sendKeys(MeetingPassword);
//					}
//
//					@Then("^user select the date (.*) from the calendar$")
//					public void user_select_the_date_january_from_the_calendar(String Date) throws InterruptedException {
//						String year = "2024";
//						String month = "January";
//						String date = "10";
//								
//						WebElement date_Picker = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']"));//date picker opens
//						JavascriptExecutor js=  (JavascriptExecutor)driver;
//						js.executeScript("arguments[0].scrollIntoView();", date_Picker);
//						Thread.sleep(500);
//						date_Picker.click();
//						
//						while(true) {
//							String monthyear = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
//							
//							String arr[]=monthyear.split(" ");
//							String mon =arr[0];
//							String yr = arr[1];
//							
//							if(mon.equalsIgnoreCase(month) && yr.equals(year))
//								break;
//							else {
//								driver.findElement(By.xpath("//div[@class='MuiPickersBasePicker-pickerView']//button[2]//span[1]//*[name()='svg']")).click();
//							}
//							
//						}
//						
//						List<WebElement> alldates = driver.findElements(By.xpath("//div[@class='MuiPickersBasePicker-container']//div"));
//						
//						for(WebElement ele:alldates) {
//							String dt = ele.getText();
//							if (dt.equals(date))
//							{
//								ele.click();
//								break;
//							}
//							
//						}
//						
//					}
//
//					@Then("user click on the enter")
//					public void user_click_on_the_enter() throws AWTException {
//				        
//						Robot r = new Robot();
//						r.keyPress(KeyEvent.VK_ENTER);
//					}
//
//					@Then("^user select the duration (.*)$")
//					public void user_select_the_duration_min(String duration) throws InterruptedException {
//						Thread.sleep(400);
//						WebElement min = driver.findElement(By.xpath("//label[normalize-space()='30min']"));
//						min.click();
//					}
//
//					@Then("^user select the number of participants seats (.*)$")
//					public void user_select_the_number_of_participants_seats(String Seats) throws InterruptedException {
//						WebElement seats = driver.findElement(By.xpath("//label[normalize-space()='4 Seats']"));
//						seats.click();
//						Thread.sleep(500);
//						
//					}
//
//					@Then("^user enter email (.*) to add invitees to the meeting$")
//					public void user_enter_email_sohel_peoplelinkvc_com_to_add_invitees_to_the_meeting(String email) {
//						WebElement AddInvitees = driver.findElement(By.xpath("//div[@class='flexCol pdngVtclMD']//input[@id='outlined-basic']"));
//						AddInvitees.sendKeys(email);
//
//					}
//
//					@Then("user click on schedule Meeting button")
//					public void user_click_on_schedule_meeting_button() throws InterruptedException {
//						JavascriptExecutor js = (JavascriptExecutor) driver;
//						WebElement Schedule_Meeting_Button = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
//						js.executeScript("arguments[0].scrollIntoView(true);",Schedule_Meeting_Button);
//						Thread.sleep(500);
//						Schedule_Meeting_Button.click();
//					}
//
//					@Then("^verifying the text (.*) on the page$")
//					public void verifying_the_text_my_profile_on_the_page(String MyProfile) {
//						String expectedText = "Meeting Details";
//						String Actualtext = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
//						Assert.assertEquals(expectedText, Actualtext);
//					}
//					
//					@And("user clicks on Delete meeting button")
//					public void user_clicks_on_delete_meeting_button() {
//						WebElement  Delete_Meeting= driver.findElement(By.xpath("//div[@class='flexMinWidth jcFE']//div[1]//button[1]"));
//						Delete_Meeting.click();
//					}
//
//					@And("user clicks on Confirm Delete meeting")
//					public void user_clicks_on_confirm_delete_meeting() {
//						WebElement  Confirm_Delete= driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
//						Confirm_Delete.click();
//					}
//}
