package test2;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CusListeners extends Baseclass implements ITestListener{
	
	
	 public void onTestFail(ITestResult result) throws IOException {
	  
	  failed();
	  
	  }
	 
	
	
	
}
