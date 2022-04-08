package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objectclass {
	WebDriver driver;
	
	By search= By.id("search_query_top");
	By submitsearch= By.xpath("//button[@name='submit_search']");
	By searchdscr=By.className("ac_results");
	By searchresulttext = By.xpath("//span[@class='lighter']");
	By alertsearchval = By.xpath("//*[@id='center_column']/p");
	By tshirt = By.xpath("//a[@title='T-shirts']");
	By largecatalaog= By.xpath("//input[@value='3_1']");
	By enabledfilter =By.xpath("//*[@id=\'enabled_filters\']/ul/li");
	By contact = By.xpath("//a[@title='Contact Us']");
	By choosefile = By.xpath("//span[text()='Choose File']");
	By FadedTshirt =By.xpath("//*[@id=\'homefeatured\']/li[1]/div/div[2]/h5/a");
	
	By blouse= By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a");
	By printeddress= By.xpath("//*[@id=\'homefeatured\']/li[3]/div/div[2]/h5");
	
	By dress= By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img");
	By chiffon = By.xpath("//*[@id=\'homefeatured\']/li[7]/div/div[2]/h5");
	
	By closepopup=By.xpath("//*[@id=\'layer_cart\']/div[1]/div[1]/span");
	
	By addcartfadedtshirtbtn= By.xpath( "//*[@id=\'homefeatured\']/li[1]/div/div[2]/div[2]/a[1]/span");
	By addcartblousetbtn= By.xpath( "//*[@id=\'homefeatured\']/li[2]/div/div[2]/div[2]/a[1]/span");
	By addcartprintdressbtn=By.xpath("//*[@id=\'homefeatured\']/li[3]/div/div[2]/div[2]/a[1]/span");
	By addcartdressbutton= By.xpath("//*[@id='add_to_cart']/button/span");
	
	By addcartchiffonbtn= By.xpath("//*[@id=\'homefeatured\']/li[7]/div/div[2]/div[2]/a[1]/span");
	
	By Cart =By.xpath("//*[@id=\'header\']/div[3]/div/div/div[3]/div/a/b");
	
	By FadedTshirtTotal=By.xpath("//*[@id='product_1_1_0_0']/td[6]");
	
	By Blousetotal= By.xpath("//*[@id='product_2_7_0_0']/td[6]");
	
	By Printeddresstotal = By.xpath("//*[@id='product_3_13_0_0']/td[6]");
	
	By dresstotal = By.xpath("//*[@id='product_4_16_0_0']/td[6]"); 
	
	By Chiffontotal = By.xpath("//*[@id='product_7_34_0_0']/td[6]");
	
	By TotalProducts = By.xpath("//*[@id='total_product']");
	
	By Attachfilesuccess= By.xpath("//*[@id=\'uniform-fileUpload\']/span[1]");
	
	public Objectclass(WebDriver driver) {
		
		this.driver=driver;
	}
	public  WebElement Attachfilesuccess() {
		
		return driver.findElement(Attachfilesuccess);
		
	}
	public  WebElement TotalProducts() {
		
		return driver.findElement(TotalProducts);
		
	}
	public  WebElement Chiffontotal() {
		
		return driver.findElement(Chiffontotal);
		
	}
	public  WebElement dresstotal() {
		
		return driver.findElement(dresstotal);
		
	}
	public  WebElement Printeddresstotal() {
		
		return driver.findElement(Printeddresstotal);
		
	}
	public  WebElement Blousetotal() {
		
		return driver.findElement(Blousetotal);
		
	}
	
	public  WebElement FadedTshirtTotal() {
		
		return driver.findElement(FadedTshirtTotal);
		
	}
	public  WebElement Cart() {
		
		return driver.findElement(Cart);
		
	}
	public  WebElement addcartchiffonbtn() {
		
		return driver.findElement(addcartchiffonbtn);
		
	}
	public  WebElement addcartdressbutton() {
		
		return driver.findElement(addcartdressbutton);
		
	}
	public  WebElement addcartprintdressbtn() {
		
		return driver.findElement(addcartprintdressbtn);
		
	}
	public  WebElement addcartblousetbtn() {
		
		return driver.findElement(addcartblousetbtn);
		
	}
	
	public  WebElement addcartfadedtshirtbtn() {
		
		return driver.findElement(addcartfadedtshirtbtn);
		
	}
	public  WebElement submitsearch() {
		
		return driver.findElement(submitsearch);
		
	}
	public  WebElement searchtextbox() {
		
		return driver.findElement(search);
		
	}

	public  WebElement searchdscr() {
		
		return driver.findElement(searchdscr);
		
	}
	public  WebElement searchresulttext() {
		
		return driver.findElement(searchresulttext);
		
	}
	public  WebElement alertsearchval() {
		
		return driver.findElement(alertsearchval);
		
	}
	public  WebElement tshirt() {
		
		return driver.findElement(tshirt);
		
	}
	public  WebElement largecatalaog() {
		
		return driver.findElement(largecatalaog);
		
	}
	public  WebElement Contactus() {
		
		return driver.findElement(contact);
		
	}
	public  WebElement ChooseFilebutton() {
		
		return driver.findElement(choosefile);
		
	}
	public  WebElement enabledfilter() {
		
		return driver.findElement(enabledfilter);
		
	}
	public  WebElement FadedTshirt() {
		
		return driver.findElement(FadedTshirt);
		
	}
	
	public  WebElement blouse() {
		
		return driver.findElement(blouse);
		
	}
	public  WebElement printeddress() {
		
		return driver.findElement(printeddress);
		
	}
	public  WebElement dress() {
		
		return driver.findElement(dress);
		
	}
	public  WebElement chiffon() {
		
		return driver.findElement(chiffon);
		
	}
	public  WebElement closepopup() {
		
		return driver.findElement(closepopup);
		
	}
	
}
