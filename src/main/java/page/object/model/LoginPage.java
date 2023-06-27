package page.object.model;

import org.openqa.selenium.By;

public class LoginPage {

	// POM use by. & PF @FindBy
	// default can go to only within the package//protect can be with the extend
	// keywords

	public static By userName = By.xpath("//*[@id='username']");
	public static By passWord = By.xpath("//*[@id='password']");
	public static By login = By.xpath("//*[@type='submit']");
	public static By logout = By.xpath("//button[@id='logoutButton']");
}
