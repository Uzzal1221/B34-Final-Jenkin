package step.Definations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.model.LoginPage;

public class LoginStepDefination {
	WebDriver driver;

	@Given("user can open go the url")
	public void user_can_open_go_the_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"file:///C:/Users/dasuz/AppData/Local/Microsoft/Windows/INetCache/IE/NZSS1SFT/dev_online_Banking_monthly_yearly_statement[1].html");

	}

	@When("user can enter valid username")
	public void user_can_enter_valid_username() {
		// driver.findElement(By.xpath("LoginPage.userName")).sendKeys("Batch34");
		driver.findElement(LoginPage.userName).sendKeys("Batch34");
	}

	@Then("user can enter valid password")
	public void user_can_enter_valid_password() {
		// .findElement(By.xpath("//*[@id='password']")).sendKeys("student123@");
		driver.findElement(LoginPage.passWord).sendKeys("student123@");

	}

	@When("user can click login button")
	public void user_can_click_login_button() {
		// driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(LoginPage.login).click();

	}

	@Then("check logout button exist for validations")
	public void check_logout_button_exist_for_validations() {
		SoftAssert sa = new SoftAssert();
		sa.assertAll();
		// sa.assertTrue(driver.findElement(By.xpath("//*[text()='Logout']")).isDisplayed());
		WebElement log = driver.findElement(LoginPage.logout);
		if (log.isDisplayed()) {
			System.out.println("The postive test case is passed ");
		}
		sa.assertTrue(driver.findElement(By.xpath("//button[@id='logoutButton']")).isDisplayed());
		//String handle=driver.getWindowHandle();
		//System.out.println(handle);
	
	}

	@When("user can enter Invali username")
	public void user_can_enter_invali_username() {
		driver.findElement(LoginPage.userName).sendKeys("invalid");
	}

	@Then("user can enter Invalid password")
	public void user_can_enter_invalid_password() {
		driver.findElement(LoginPage.passWord).sendKeys("invalid");

	}

	@Then("alert textbox should pop")
	public void alert_textbox_should_pop() {
		SoftAssert sa = new SoftAssert();
		sa.assertAll();
		Alert alert = driver.switchTo().alert();
		String alertMSG = alert.getText();
		sa.assertEquals(alertMSG, "Invalid username or password");
	
		if(alertMSG.equalsIgnoreCase("Invalid username or password")) {
			System.out.println("The Negative testcase has passed ");
		}
	}

	@When("user can enter null username")
	public void user_can_enter_null_username() {
		driver.findElement(LoginPage.userName).sendKeys("");
	}

	@Then("user can enter null password")
	public void user_can_enter_null_password() {
		driver.findElement(LoginPage.passWord).sendKeys("");
	}

}
