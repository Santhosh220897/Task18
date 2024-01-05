package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) {

		// Webdriver is implemneted

		WebDriver driver = new ChromeDriver();

		// Maximize the window

		driver.manage().window().maximize();

		// Open the url

		driver.get("https://www.facebook.com/");

		// Wait for 2sec for the url to open

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// if else condition to redirect

		if (driver.getCurrentUrl().equals("https://www.facebook.com/")) {

			System.out.println("Page is been redirected to the homepage");
		} else {
			System.out.println("Page is not redirected to the homepage");
		}

		// Webelement for clicking the create new account

		WebElement createAccount = driver.findElement(By.linkText("Create new account"));

		createAccount.click();

		// Webelement for FirstName with explicitwait of 5sec

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='firstname']"))))
				.sendKeys("Santhosh");

		// Webelement for LastName

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));

		lastName.sendKeys("sony");

		// Webelement for email id

		WebElement emailId = driver.findElement(By.xpath("//input[@name='reg_email__']"));

		emailId.sendKeys("tvsanthoshsony@gmail.com");

		// Webelement for re-confirmation email id

		WebElement re_emailId = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));

		re_emailId.sendKeys("tvsanthoshsony@gmail.com");

		// WebElement for password

		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));

		password.sendKeys("Sample@56394");

		// Dropdown action is performed for selection of day

		WebElement day = driver.findElement(By.xpath("//Select[@id='day']"));

		Select selectDay = new Select(day);

		selectDay.selectByVisibleText("11");

		// Dropdown action is performed for selection of Month

		WebElement month = driver.findElement(By.xpath("//Select[@id='month']"));

		Select selectMonth = new Select(month);

		selectMonth.selectByVisibleText("May");

		// Dropdown action is performed for selection of year

		WebElement year = driver.findElement(By.xpath("//Select[@id='year']"));

		Select selectYear = new Select(year);

		selectYear.selectByVisibleText("1985");

		// radeo button gender selection

		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));

		gender.click();

		// SignUp button

		WebElement signUp = driver.findElement(By.xpath("//button[@name='websubmit']"));

		signUp.click();

		// Verify the redirection	

		if (driver.getCurrentUrl().equals("https://www.facebook.com/")) {

			System.out.println("Facebook is registered and redirected to homepage ");
		} else {
			System.out.println("Not Redirected to homepage");
		}

		// Close the Window

		driver.quit();

	}

}
