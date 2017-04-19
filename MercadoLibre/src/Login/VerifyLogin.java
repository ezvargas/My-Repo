package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogin {

	public void verityLogin()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercadolibre.com.ar/");
		
		LoginPage login = new LoginPage(driver);
		login.clickOnAccessButton();
		login.typeEmail();
		login.clickOnLoginButton();
		login.typePassword();
		login.clickOnSubmitButton();
		
	}
}
