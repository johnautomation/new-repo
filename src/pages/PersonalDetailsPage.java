package pages;
 
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 
 //import org.openqa.selenium.support.ui.Select;
 
 public class PersonalDetailsPage {
 
 	WebDriver driver;
 
 	By email_add = By.name("email_address");
 	By passw = By.name("password");
 	By sign_in = By.xpath("//button[@type='submit']");
 	By new_product=By.cssSelector("a[href='http://107.170.213.234/catalog/products_new.php']>u");
 
 	

 
 	public PersonalDetailsPage(WebDriver driver) {
 		this.driver = driver;
 	}
 
 	public void enterEmail_ADD(String em_add) {
 		driver.findElement(email_add).sendKeys(em_add);
 	}
 
 	public void enterPassWord(String Passw) {
 		driver.findElement(passw).sendKeys(Passw);
 	}
 
 	public void clickSignInButton(){
 		driver.findElement(sign_in).click();
 	}
 		public void clickNew_ProductLink(){
 			driver.findElement(new_product).click();
 		}
 
 }
 