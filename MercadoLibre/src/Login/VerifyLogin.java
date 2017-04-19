package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogin {

	public void verityLogin()
	{
		String userName = "user";//Aca va el nombre de usuario
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercadolibre.com.ar/");
		
		LoginPage login = new LoginPage(driver);
		login.clickOnAccessButton();
		login.typeEmail();
		login.clickOnLoginButton();
		login.typePassword();
		login.clickOnSubmitButton();
		
		if(userName == login.confirmAccess())
		{
			System.out.println("Login sucesss");
		}
		
	}
}
