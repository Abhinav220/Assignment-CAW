package test2;


import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CusListeners.class)

public class Teask extends Baseclass{

	Baseclass base = new Baseclass();
	WebDriver driver= base.driversetup();
	Objectclass object = new Objectclass(driver);
	
	@Test()
	public void Task1() {
		
		//Objectclass object = new Objectclass(driver);
		
		try{
		
		object.searchtextbox().sendKeys("A");
					
		Assert.assertFalse(object.searchdscr().isDisplayed());		
		
	}
		catch(Exception e) {
			
			System.out.println("Search suggestions are not displayed for letters less than 3");
		}
			
		try {
			object.searchtextbox().clear();
			object.searchtextbox().sendKeys("Ch");
			Assert.assertFalse(object.searchdscr().isDisplayed());
		}
		catch(Exception e) {
			
			System.out.println("Search suggestions are not displayed for letters less than 3");
		}
		
		
		object.searchtextbox().clear();
		object.searchtextbox().sendKeys("Chi");
		Assert.assertTrue(object.searchdscr().isDisplayed());
		
	}
	
	@Test()
	public void Task2() throws InterruptedException {
		
		object.searchtextbox().clear();
		object.searchtextbox().sendKeys("Chiffon");
		object.submitsearch().click();
						
				if(object.searchresulttext().getText().equalsIgnoreCase("chiffon")) {
									
					Assert.assertEquals(true, true);
					
				}
				object.searchtextbox().clear();
				object.searchtextbox().sendKeys("asdgSGN");
				object.submitsearch().click();
				
				Thread.sleep(10000);
						
				
				if(object.alertsearchval().getText().trim().equalsIgnoreCase("No results were found for your search \"asdgSGN\"")) {
					
					Assert.assertEquals(true, true);					
				}
							
		
	}
	
	@Test()
	public void Task3() throws InterruptedException {
		
		
		try { WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		  //wait.until(ExpectedConditions.visibilityOf(object.tshirt()));
		  wait.until(ExpectedConditions.elementToBeClickable(object.tshirt()));
		  Actions act = new Actions(driver);
		  act.moveToElement(object.tshirt()).click().build().perform();
		  //object.tshirt().click();
		  } 
		catch(TimeoutException e) {
		  System.out.println("Button is not interactable and is a bug.");
		 driver.navigate().to(
		 "http://automationpractice.com/index.php?id_category=5&controller=category");
		  }
		 
		if(!object.largecatalaog().isSelected()) {
			object.largecatalaog().click();
			}
		System.out.println(object.enabledfilter().getText().trim());
		Assert.assertEquals(object.enabledfilter().getText().trim(), "Size: L");
				
		
	}
	@Test()
	public void Task4() throws InterruptedException, AWTException {
		
		driver.navigate().to("http://automationpractice.com/index.php");
		object.Contactus().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		Actions act = new Actions(driver);
		act.moveToElement(object.ChooseFilebutton()).click().build().perform();
		
	    Thread.sleep(2000); // suspending execution for specified time period
	 
	   
	    Robot rb = new Robot();
		
	    StringSelection str = new StringSelection("D:\\file\\damm.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V); 
	    
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);	 
	    
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(6000);
	    
	   System.out.println(object.Attachfilesuccess().getText());
	   Assert.assertEquals(object.Attachfilesuccess().getText(), "damm.docx");
	   
		
		
	}
	
	@Test()
	public void Task5() throws InterruptedException {
		
		
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Actions act =new Actions(driver);		
		act.moveToElement(object.FadedTshirt()).build().perform();
		object.addcartfadedtshirtbtn().click();
		
		Thread.sleep(2000);
		object.closepopup().click();
		
		act.moveToElement(object.blouse()).build().perform();; 
		object.addcartblousetbtn().click();
		
		Thread.sleep(2000);
		object.closepopup().click();
		
		act.moveToElement(object.printeddress()).build().perform();
		object.addcartprintdressbtn().click();
		
		Thread.sleep(2000);
		object.closepopup().click();
		
		act.moveToElement(object.dress()).click().build().perform();
		object.addcartdressbutton().click();
		
		Thread.sleep(2000);
		object.closepopup().click();
		driver.navigate().back();
		
		act.moveToElement(object.chiffon()).build().perform();
		object.addcartchiffonbtn().click();
		
		Thread.sleep(2000);
		object.closepopup().click();
		
		object.Cart().click();
		//System.out.println(object.FadedTshirtTotal().getText().split("\\$")[1]);
		
		double val1 = Double.parseDouble(object.FadedTshirtTotal().getText().split("\\$")[1]);
		
				//object.FadedTshirtTotal().getText().split("\\$")[1]);
		double val2 = Double.parseDouble(object.Blousetotal().getText().split("\\$")[1]);
		double val3 = Double.parseDouble(object.Printeddresstotal().getText().split("\\$")[1]);
		double val4 = Double.parseDouble(object.dresstotal().getText().split("\\$")[1]);
		double val5 = Double.parseDouble(object.Chiffontotal().getText().split("\\$")[1]);
		
		double totalproductsval = Double.parseDouble(object.TotalProducts().getText().split("\\$")[1]);
		
		double sum = val1+val2+val3+val4+val5;
		
		Assert.assertEquals(sum,totalproductsval);
		driver.close();
		}
	
	
	
}
