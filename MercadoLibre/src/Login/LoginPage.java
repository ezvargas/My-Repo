package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By email = By.id("user_id");
	By password = By.name("password");
	By accessButton = By.xpath(".//*[@id='nav-header-menu']/a[2]");
	By loginButton = By.xpath(".//*[@id='login_user_form']/div[2]/input");
	By submitButton = By.xpath(".//*[@id='main']/div[3]/form/div[2]/input");
	By confirm = By.xpath(".//*[@id='nav-header-menu']/div/label");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void typeEmail()
	{
		driver.findElement(email).sendKeys("admin@gmail.com");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("1234");
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
	public void clickOnAccessButton()
	{
		driver.findElement(accessButton).click();
	}
	
	public void clickOnSubmitButton()
	{
		driver.findElement(submitButton).click();
	}
	
	public String confirmAccess()
	{
		return driver.findElement(confirm).getText();
	}
}
