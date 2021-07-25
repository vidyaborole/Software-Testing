package Website;


		import java.io.File;
		import java.io.IOException;
		import java.util.List;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.Select;

		import com.google.common.io.Files;

		public class Automation_Project 
		{

			public static void main(String[] args) throws InterruptedException, IOException 
			{
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selenium Jar\\chromedriver.exe");
			
				WebDriver w=new ChromeDriver();
				w.get("https://demoqa.com/select-menu");
				Thread.sleep(2000);
				
				
				w.manage().window().maximize();
			    System.out.println("TITLE of Page::" + w.getTitle());
			    System.out.println("URL of Page::" + w.getCurrentUrl());
				
			    
			    //Elements
			    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]")).click();
		        Thread.sleep(2000);
		        
		     
		        //TextBox
		        w.findElement(By.xpath("//span[contains(text(),'Text Box')]")).click();
		        w.findElement(By.xpath("//input[@id='userName']")).sendKeys("Yogita");
		        w.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("yb@gmail.com");
		        w.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Jalgaon");
		        w.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Raver");
		           
		        JavascriptExecutor j0= (JavascriptExecutor) w;
				j0.executeScript("window.scrollBy(0,2000)");
			    
		        
		        Thread.sleep(3000);
		        w.findElement(By.xpath("//button[@id='submit']")).click();
		        System.out.println("Submit successfully");
		        
		       
		       //screenshot
		        TakesScreenshot s= (TakesScreenshot) w;
		        File src = s.getScreenshotAs(OutputType.FILE);
		        Files.copy(src, new File("D:\\ScreenShotp\\submit1.jpg"));
		        Thread.sleep(2000);
		        
		       //checkbox         
		        w.findElement(By.xpath("//span[contains(text(),'Check Box')]")).click();
		        Thread.sleep(2000);
		        w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")).click();
		        Thread.sleep(2000);
		        
		        w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")).click();
		        Thread.sleep(5000);
		        
		        List<WebElement> Checkbox = w.findElements(By.tagName("span"));
		        int Total_Checkbox = Checkbox.size();
		        Thread.sleep(2000);
		        
		        System.out.println("Total number of checkbox: "+Total_Checkbox);
		        
		        TakesScreenshot s96= (TakesScreenshot) w;
		        File src96 = s96.getScreenshotAs(OutputType.FILE);
		        Files.copy(src96, new File("D:\\ScreenShotp\\submit#.jpg"));
		        
		        
		        //w.navigate().refresh();
		        
		        
		        
		        
		       
		        JavascriptExecutor j1= (JavascriptExecutor) w;
				j1.executeScript("window.scrollBy(0,2000)");
		        Thread.sleep(2000);
		        
		       
		        //radio button
		        w.findElement(By.xpath("//span[contains(text(),'Radio Button')]")).click();
		        Thread.sleep(2000);
		        w.findElement(By.xpath("//label[contains(text(),'Impressive')]")).click();
		        
		        
		        Thread.sleep(5000);
		        List<WebElement> RadioButton = w.findElements(By.tagName("label"));
		        System.out.println("Total number of radio button: "+RadioButton.size());
		        Thread.sleep(2000);
		       
		        
		        TakesScreenshot s91= (TakesScreenshot) w;
		        File src91 = s91.getScreenshotAs(OutputType.FILE);
		        Files.copy(src91, new File("D:\\ScreenShotp\\radio.jpg"));
		        
		        
		       
		        
		        JavascriptExecutor j2= (JavascriptExecutor) w;
				j2.executeScript("window.scrollBy(0,2000)");
			    Thread.sleep(2000);
		       
			    
		       //Web tables 
		        w.findElement(By.xpath("//span[contains(text(),'Web Tables')]")).click();
		        Thread.sleep(2000);
		        
		        
		        w.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		        w.findElement(By.id("firstName")).sendKeys("Yogita");
		        w.findElement(By.id("lastName")).sendKeys("Badhe");
		        w.findElement(By.id("userEmail")).sendKeys("ybadhe@gmail.com");
		        w.findElement(By.id("age")).sendKeys("24");
		        w.findElement(By.id("salary")).sendKeys("25000");
		        w.findElement(By.id("department")).sendKeys("MCA");
		        w.findElement(By.xpath("//button[@id='submit']")).click();
		        System.out.println("Data added successfully");
		        Thread.sleep(2000);
		        
		        TakesScreenshot s97= (TakesScreenshot) w;
		        File src97 = s97.getScreenshotAs(OutputType.FILE);
		        Files.copy(src97, new File("D:\\ScreenShotp\\submit!!1.jpg"));
		        
		        
		        w.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("Yogita");
		        w.findElement(By.xpath("//span[@id='basic-addon2']")).click();
		        System.out.println("data display successfully");
		        Thread.sleep(2000);
		        
		        TakesScreenshot s92= (TakesScreenshot) w;
		        File src92 = s92.getScreenshotAs(OutputType.FILE);
		        Files.copy(src92, new File("D:\\ScreenShotp\\submit@.jpg"));
		        
		        
		        
		       
			    
			    
		        
		        
		        
		        JavascriptExecutor j3= (JavascriptExecutor) w;
				j3.executeScript("window.scrollBy(0,2000)");
			    Thread.sleep(2000);
		        
		        
			    //button
		        w.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
		        Thread.sleep(3000);
		        w.findElement(By.xpath("//button[@id='doubleClickBtn']")).click();
		        Thread.sleep(3000);
		        w.findElement(By.xpath("//button[@id='rightClickBtn']")).click();
		        Thread.sleep(3000);
		        //w.findElement(By.xpath("//button[@id='xK841']")).click();
		        //Thread.sleep(3000);
		        
		        TakesScreenshot sc= (TakesScreenshot) w;
		        File src1 = sc.getScreenshotAs(OutputType.FILE);
		        Files.copy(src1, new File("D:\\ScreenShotp\\submit@@.jpg"));
		        
		        
		        
		        
		        
		        
		        JavascriptExecutor j4= (JavascriptExecutor) w;
				j4.executeScript("window.scrollBy(0,2000)");
			    Thread.sleep(2000);
		              
		        
			    //links
			    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/span[1]")).click();
		        Thread.sleep(3000); 
			    
		        List<WebElement> Link = w.findElements(By.tagName("a"));
		        int Total_Link = Link.size();
		        System.out.println("Total number of checkbox: "+Total_Link);
		        Thread.sleep(3000);
		        
		        
		        
		        
		        
		        
		        JavascriptExecutor j5= (JavascriptExecutor) w;
				j5.executeScript("window.scrollBy(0,2000)");
			    Thread.sleep(2000);
		            
		        
		        //broken links 
		        w.findElement(By.xpath("//span[contains(text(),'Broken Links - Images')]")).click();
		        Thread.sleep(3000);
		        
		        
		        JavascriptExecutor j6= (JavascriptExecutor) w;
				j6.executeScript("window.scrollBy(0,2000)");
			    Thread.sleep(2000);
		        
		        w.findElement(By.xpath("//a[contains(text(),'Click Here for Valid Link')]")).click();
		        Thread.sleep(3000);
		        w.navigate().back();
		        
		        JavascriptExecutor j7= (JavascriptExecutor) w;
				j7.executeScript("window.scrollBy(0,2000)");
			    Thread.sleep(2000);
			    
			    w.findElement(By.xpath("//a[contains(text(),'Click Here for Broken Link')]")).click();
			    
			    
			    TakesScreenshot s93= (TakesScreenshot) w;
		        File src93 = s93.getScreenshotAs(OutputType.FILE);
		        Files.copy(src93, new File("D:\\ScreenShotp\\link.jpg"));
		        
		        w.navigate().back();
		       
		        
		        //upload and download
		        JavascriptExecutor j8= (JavascriptExecutor) w;
				j8.executeScript("window.scrollBy(0,2000)");
			    Thread.sleep(2000);
		             
		        w.findElement(By.xpath("//span[contains(text(),'Upload and Download')]")).click();
		        Thread.sleep(3000);
		        

		        w.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Administrator\\Downloads\\nature.jpg");
		        System.out.println("File uploaded successfully");
		        Thread.sleep(3000);      

		        w.findElement(By.xpath("//a[@id='downloadButton']")).click();
		        System.out.println("File downloaded succeesfully");
		        Thread.sleep(3000);
		        
		        TakesScreenshot s94= (TakesScreenshot) w;
		        File src94 = s94.getScreenshotAs(OutputType.FILE);
		        Files.copy(src94, new File("D:\\ScreenShotp\\uplod.jpg"));
		        
		        
		        
		        
		        
		           
		        
		        //dynamic properties
		        JavascriptExecutor j9= (JavascriptExecutor) w;
				j9.executeScript("window.scrollBy(0,2000)");
			    Thread.sleep(2000);
		        

		        w.findElement(By.xpath("//span[contains(text(),'Dynamic Properties')]")).click();
		        Thread.sleep(3000);
		        
		        w.findElement(By.xpath("//button[@id='colorChange']")).click();
		        Thread.sleep(3000);
		        
		        
		        TakesScreenshot s95= (TakesScreenshot) w;
		        File src95 = s95.getScreenshotAs(OutputType.FILE);
		        Files.copy(src95, new File("D:\\ScreenShotp\\file.jpg"));
		             

		 
			    //JavascriptExecutor js= (JavascriptExecutor) w;
				//js.executeScript("window.scrollBy(0,2000)");
			    
		     
				List<WebElement> l= w.findElements(By.tagName("a"));
			    System.out.println(" Total Links are " + l.size());
			    
			    Thread.sleep(3000);
			    
			    
			    
			    //Forms
			    
			    JavascriptExecutor js61= (JavascriptExecutor) w;
				js61.executeScript("window.scrollBy(0,2000)");
				//Thread.sleep(3000);
				
				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]")).click();
		        Thread.sleep(3000);
		        //Practise Form
		        w.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
		        Thread.sleep(3000);
		        
		        
		        w.findElement(By.id("firstName")).sendKeys("Yogita");
			    w.findElement(By.id("lastName")).sendKeys("Badhe");
				w.findElement(By.id("userEmail")).sendKeys("ybadhe@gmail.com");
			    w.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
				w.findElement(By.id("userNumber")).sendKeys("8329649015");
				
				JavascriptExecutor js62= (JavascriptExecutor) w;
				js62.executeScript("window.scrollBy(0,2000)");
				
				w.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
				   w.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Administrator\\Downloads\\nature.jpg");
				   w.findElement(By.id("currentAddress")).sendKeys("JalgaonRaver");
				   w.findElement(By.xpath("//div[contains(text(),'Select State')]")).click();
				   Thread.sleep(2000);
		        w.findElement(By.xpath("//div[contains(text(),'Haryana')]")).click();
				   w.findElement(By.xpath("//div[contains(text(),'Select City')]")).click();
				   Thread.sleep(2000);
				   w.findElement(By.xpath("//div[contains(text(),'Panipat')]")).click(); 
				   Thread.sleep(2000);
			        
			    
			       w.findElement(By.xpath("//button[@id='submit']")).click();
			       Thread.sleep(2000);
			    
			       TakesScreenshot sc11= (TakesScreenshot) w;
			       File src11 = sc11.getScreenshotAs(OutputType.FILE);
			       Files.copy(src11, new File("D:\\ScreenShotp\\form1.jpg"));
			       
			       System.out.println("Submitted succeesfully");
			    
			    
			    	
						
				JavascriptExecutor jss= (JavascriptExecutor) w;
				jss.executeScript("window.scrollBy(0,2000)");
				
				
					
				//widgets click
				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]")).click();
			    Thread.sleep(3000);
			    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]")).click();
			    Thread.sleep(3000);
			    
			    TakesScreenshot t51 =(TakesScreenshot) w;
				  File srcc51 = t51.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc51, new File("D:\\ScreenShotp\\accordian.png"));
			    
			      
			    //w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]")).click();
			    //Thread.sleep(5000);
			    
			    
			   
			    
			    
			    JavascriptExecutor jss1= (JavascriptExecutor) w;
				jss1.executeScript("window.scrollBy(0,2000)");
				
			    //Click Accordian
			    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]")).click();
			    Thread.sleep(5000);
			    
			    System.out.println("widgets Button");
			    
			    String name1= w.findElement(By.xpath("//div[contains(text(),'Accordian')]")).getText();
			    System.out.println(name1);
			    
			    //1option click
			    w.findElement(By.id("section1Heading")).click();
			    Thread.sleep(5000);
			    
			    //2nd option click and close
			    w.findElement(By.xpath("//div[@id='section2Heading']")).click();
			    Thread.sleep(5000);
			    w.findElement(By.id("section2Heading")).click();
			    Thread.sleep(5000);
			    
			   //3nd option click and close	    
			    w.findElement(By.xpath("//div[@id='section3Heading']")).click();
			    Thread.sleep(5000);
			    
			    w.findElement(By.id("section3Heading")).click();
			    Thread.sleep(5000);
			    
			    TakesScreenshot t52 =(TakesScreenshot) w;
				  File srcc52 = t52.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc52, new File("D:\\ScreenShotp\\accordian.png"));
			       
			    
			    
			      
			    //Auto Complete
				JavascriptExecutor jss99=(JavascriptExecutor)w;
			    jss99.executeScript("window.scrollTo(0,5000)");
			      
			    w.findElement(By.xpath("//span[contains(text(),'Auto Complete')]")).click();
			    Thread.sleep(5000);
			    
			    System.out.println("Auto Complete");
			    
			    TakesScreenshot ts52 =(TakesScreenshot) w;
				File srcc522 = ts52.getScreenshotAs(OutputType.FILE);
			    Files.copy(srcc522, new File("D:\\ScreenShotp\\Autoomplete.png"));
			    
			    
			      
			      
			      
			      
			    
			    //Date Picker
			    JavascriptExecutor jss11= (JavascriptExecutor) w;
				jss11.executeScript("window.scrollBy(0,2000)");
					
				w.findElement(By.xpath("//span[contains(text(),'Date Picker')]")).click();
			    Thread.sleep(5000);
			    
			    System.out.println("Date Picker");
			    	
			    TakesScreenshot t56 =(TakesScreenshot) w;
				  File srcc56 = t56.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc56, new File("D:\\ScreenShotp\\Date.png"));
			    
			    
			    
			    
			    JavascriptExecutor js1= (JavascriptExecutor) w;
				js1.executeScript("window.scrollBy(0,2000)");
				
			     
			    // Slider Option		
				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]")).click();
			    Thread.sleep(5000);
			    
			    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]")).click();
		        Thread.sleep(5000);
		        
		        TakesScreenshot t53 =(TakesScreenshot) w;
				  File srcc53 = t53.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc53, new File("D:\\ScreenShotp\\slider.png"));
			    
		        
		        String name2= w.findElement(By.xpath("//div[contains(text(),'Slider')]")).getText();
			    System.out.println(name2);
			    
			    
		        
		 
			   
			    
		        JavascriptExecutor js2= (JavascriptExecutor) w;
				js2.executeScript("window.scrollBy(0,2000)");
						
				// Progress Bar Option		
				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]")).click();
			    Thread.sleep(5000);
			   
				w.findElement(By.id("startStopButton")).click();
				Thread.sleep(5000);
		        
				w.findElement(By.xpath("//button[@id='startStopButton']")).click();
				Thread.sleep(5000);
		        
				w.findElement(By.xpath("//button[@id='startStopButton']")).click();
				Thread.sleep(5000);
		        
				w.findElement(By.id("resetButton")).click();
				Thread.sleep(5000);
				
				TakesScreenshot t54 =(TakesScreenshot) w;
				  File srcc54 = t54.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc54, new File("D:\\ScreenShotp\\bar.png"));
			    
				
				String name3= w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]")).getText();
			    System.out.println(name3);
			    
			    
				
			 
			    
		               
				JavascriptExecutor js3= (JavascriptExecutor) w;
				js3.executeScript("window.scrollBy(0,2000)");
				
				//Tabs Option        
				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]")).click();
			    Thread.sleep(5000);

			    w.findElement(By.xpath("//a[@id='demo-tab-origin']")).click();
			    Thread.sleep(5000);
		        
			    w.findElement(By.xpath("//a[@id='demo-tab-use']")).click();
			    Thread.sleep(5000);
			    
			    TakesScreenshot t55 =(TakesScreenshot) w;
				  File srcc55 = t55.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc55, new File("D:\\ScreenShotp\\tabs.png"));
			    
				
			    String name4= w.findElement(By.xpath("//div[contains(text(),'Tabs')]")).getText();
			    System.out.println(name4);
			    
			    
			    
			    
			    
			    
			   
				
				JavascriptExecutor js4= (JavascriptExecutor) w;
				js4.executeScript("window.scrollBy(0,2000)");
				
				// Menu Option		
				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[8]")).click();
			    Thread.sleep(5000);

			    Actions act=new Actions(w);
			    act.moveToElement(w.findElement(By.linkText("Main Item 2"))).perform();
			    Thread.sleep(5000);
			    
			    Actions act1=new Actions(w);
			    act1.moveToElement(w.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"))).perform();
			    Thread.sleep(5000);
				
			    Actions act2=new Actions(w);
			    act2.moveToElement(w.findElement(By.linkText("Sub Sub Item 1"))).perform();
			    Thread.sleep(5000);
				
			    Actions act3=new Actions(w);
			    act3.moveToElement(w.findElement(By.linkText("Sub Sub Item 2"))).perform();
			    Thread.sleep(5000);
				
			    
			    TakesScreenshot t91 =(TakesScreenshot) w;
				  File srcc91 = t91.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc91, new File("D:\\ScreenShotp\\menu.png"));
			    
				
			    String name5= w.findElement(By.xpath("//div[contains(text(),'Menu')]")).getText();
			    System.out.println(name5);
			    
			    
			    
			    
			    
			    

			    JavascriptExecutor js5= (JavascriptExecutor) w;
				js5.executeScript("window.scrollBy(0,2000)");
				
				//Select Menu Option			
				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[9]")).click();
			    Thread.sleep(5000);
			    
			    String name6= w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]")).getText();
			    System.out.println(name6);
			    
			      //1st Option	    
	    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
	    Thread.sleep(5000);
	    
	    w.findElement(By.xpath("//div[contains(text(),'Group 2, option 1')]")).click();
	    Thread.sleep(5000);

		//2nd Option		
	    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]")).click();
	    Thread.sleep(5000);
	    
	    w.findElement(By.xpath("//div[contains(text(),'Mrs.')]")).click();
	    Thread.sleep(5000);
	    
		
		//3rd Option	    
	    Select s1 = new Select(w.findElement(By.id("oldSelectMenu")));
	    
	    s1.selectByVisibleText("Purple");
	    
	    Thread.sleep(5000);
	    
	    
	    
	    
	    
	    
	    JavascriptExecutor jss9=(JavascriptExecutor)w;
	    jss9.executeScript("window.scrollTo(0,5000)");
		  
	    
	    //4th Option 	    
	    //w.navigate().refresh();
	    
	    Thread.sleep(5000);
	    	    
	    w.findElement(By.xpath("//div[contains(text(),'Select...')]")).click();
	    Thread.sleep(5000);
	    
	    w.findElement(By.xpath("//div[contains(text(),'Blue')]")).click();
	    Thread.sleep(5000);
	    
	    w.findElement(By.xpath("//div[contains(text(),'Red')]")).click();
	    Thread.sleep(5000);

	    w.findElement(By.xpath("//div[contains(text(),'Black')]")).click();
	    Thread.sleep(5000);		
		
	    w.findElement(By.xpath("//div[contains(text(),'Green')]")).click();
	    Thread.sleep(5000);
	    
		
	    TakesScreenshot t57 =(TakesScreenshot) w;
		  File srcc57 = t57.getScreenshotAs(OutputType.FILE);
	      Files.copy(srcc57, new File("D:\\ScreenShotp\\SMenu.png"));
	    
	    
	    JavascriptExecutor jss77= (JavascriptExecutor) w;
		jss77.executeScript("window.scrollBy(0,2000)");
		    
		
		//Alerts
	    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]")).click();
	    Thread.sleep(2000);
	    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]")).click();
	    		
	   // To click on click me button
	    
	    System.out.println("Alert Button");
	    
	    w.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);	
				
		Alert A1=w.switchTo().alert();
		//To get the text 
	    System.out.println(A1.getText());
	    System.out.println("Alert Button");
	    System.out.println("Simple alert done");
	    A1.accept();
						
			
	  //simple wait    
	  w.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
	  
	  //Takes Screenshot	  
	  TakesScreenshot t =(TakesScreenshot) w;
	  File src5 = t.getScreenshotAs(OutputType.FILE);		
      Files.copy(src5, new File("D:\\ScreenShotp\\vidya7.png"));
	  Thread.sleep(6000);
	  Alert A2 =w.switchTo().alert();
	  System.out.println(A2.getText());
	  A2.accept();   

	  //confirm	
	  w.findElement(By.id("confirmButton")).click();
	  Thread.sleep(3000);
	  Alert A4= w.switchTo().alert();
	  System.out.println(A4.getText());
	  A4.dismiss();
	  Thread.sleep(3000);

	  //prompt	  
	  w.findElement(By.xpath("//button[@id='promtButton']")).click();
	  Alert A5= w.switchTo().alert();
	  A5.sendKeys("Hello");
	  Thread.sleep(1000);
	  System.out.println(A5.getText());
	  A5.accept();
	  Thread.sleep(2000);
	  
	 // String nm= w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]")).getText();
	 //System.out.println(nm);


	  
	  
	  
	    
	  
	  //Interaction	  
	  JavascriptExecutor jj=(JavascriptExecutor)w;
	  jj.executeScript("window.scrollTo(0,5000)");
	  
	  
	  w.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div/div[1]")).click();
	  Thread.sleep(5000);
	  //w.navigate().back();
	  
	  
	  
	  JavascriptExecutor jss3= (JavascriptExecutor) w;
	  jss3.executeScript("window.scrollBy(0,5000)");
	  
	  
	  //Sortable List	  
	 w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[1]")).click();
	 //System.out.println(w.getCurrentUrl());
			
     Thread.sleep(5000);
     
     System.out.println("Interactions Button");
	 w.findElement(By.id("demo-tab-list")).click();
	 Thread.sleep(2000);
	 WebElement drag = w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));
	 WebElement drop = w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[6]"));
	 Actions ac =new  Actions(w);
	 ac.dragAndDrop(drag, drop).build().perform();
	 
	 Thread.sleep(2000);
	 WebElement drag1 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));
	 WebElement drop1 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[5]"));
	 ac.dragAndDrop(drag1, drop1).build().perform();
	 
	 Thread.sleep(2000);
	 WebElement drag2 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));
	 WebElement drop2 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[4]"));
	 ac.dragAndDrop(drag2, drop2).build().perform();
	 
	 Thread.sleep(2000);
	 WebElement drag3 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));
	 WebElement drop3 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[3]"));
	 ac.dragAndDrop(drag3, drop3).build().perform();
	 
	  Thread.sleep(2000);
	  WebElement drag4 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));
	  WebElement drop4 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[2]"));
	  ac.dragAndDrop(drag4, drop4).build().perform();
	  
	 //Take screenshot
	  TakesScreenshot t1 =(TakesScreenshot) w;
	  File src6 = t1.getScreenshotAs(OutputType.FILE);
      Files.copy(src6, new File("D:\\ScreenShotp\\vidya8.png"));
      
      
      
      JavascriptExecutor j11= (JavascriptExecutor) w;
	  j11.executeScript("window.scrollBy(0,5000)");
	  
 
     //Grid       
      Thread.sleep(3000);
	  
	  w.findElement(By.id("demo-tab-grid")).click();
	  //w.manage().window().maximize();
	  Thread.sleep(3000);
	  w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[5]")).click();
	  Thread.sleep(2000);
	
	  WebElement drag5 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
	  WebElement drop5 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
	  Actions ac1=new  Actions(w);
	  ac1.dragAndDrop(drag5, drop5).build().perform();
	  
	  Thread.sleep(2000);
	  WebElement drag6 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
	  WebElement drop6 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[2]")); 
	  ac1.dragAndDrop(drag6, drop6).build().perform();
	  
	  Thread.sleep(2000);
	  WebElement drag7 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
	  WebElement drop7 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[3]")); 
	  ac1.dragAndDrop(drag7, drop7).build().perform();
	  
	  Thread.sleep(2000);
	  WebElement drag8 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
	  WebElement drop8 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[4]")); 
	  ac1.dragAndDrop(drag8, drop8).build().perform();
	  
	  Thread.sleep(2000);
	  WebElement drag9 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
	  WebElement drop9 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[5]")); 
	  ac1.dragAndDrop(drag9, drop9).build().perform();
	  
	  Thread.sleep(2000);
	  WebElement drag10 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
	  WebElement drop10 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[6]")); 
	  ac1.dragAndDrop(drag10, drop10).build().perform();
	  
	  Thread.sleep(2000);
	  WebElement drag11 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
	  WebElement drop11 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[7]")); 
	  ac1.dragAndDrop(drag11, drop11).build().perform();
	  
	  Thread.sleep(2000);
	  WebElement drag12 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
	  WebElement drop12 = w.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[8]")); 
	  ac1.dragAndDrop(drag12, drop12).build().perform();
	  
	  TakesScreenshot t2 =(TakesScreenshot) w;
	  File src2 = t2.getScreenshotAs(OutputType.FILE);
      Files.copy(src2, new File("D:\\ScreenShotp\\vidya!.png"));
      
      String nm5= w.findElement(By.xpath("//div[contains(text(),'Sortable')]")).getText();
 	 System.out.println(nm5);
 	 
	  w.navigate().back();
      
	  
	  //selectable	  
	  Thread.sleep(5000);
	  
	  JavascriptExecutor js6=(JavascriptExecutor)w;
      js6.executeScript("window.scrollTo(0,5000)");
		
	  w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[2]")).click();
	  Thread.sleep(2000);
	  
	  String nm6= w.findElement(By.xpath("//div[contains(text(),'Selectable')]")).getText();
	  System.out.println(nm6);
	  
	  //System.out.println(w.getCurrentUrl());
	  Thread.sleep(5000);
	  
	  
	  //List	 
	  w.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]")).click();
	  Thread.sleep(2000);
	  w.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]")).click();
	  Thread.sleep(2000);
	  w.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[3]")).click();
	  Thread.sleep(2000); 
	  
	  //Grid	  
	   w.findElement(By.xpath("//*[@id=\"demo-tab-grid\"]")).click();
	   Thread.sleep(2000);
	   w.findElement(By.xpath("//*[@id=\"row1\"]/li[1]")).click();
	   w.findElement(By.xpath("//*[@id=\"row2\"]/li[3]")).click();
	   w.findElement(By.xpath("//*[@id=\"row2\"]/li[1]")).click();
	   w.findElement(By.xpath("//*[@id=\"row2\"]/li[2]")).click();
	   w.findElement(By.xpath("//*[@id=\"row1\"]/li[3]")).click();
		 
	   TakesScreenshot t3 =(TakesScreenshot) w;
	   File src3 = t3.getScreenshotAs(OutputType.FILE);
	   Files.copy(src3, new File("D:\\ScreenShotp\\vidya10.png"));
		
	   w.navigate().back();
	  
	  
	   
	 //Resiable	   
	  Thread.sleep(2000);
		 
	  JavascriptExecutor js7=(JavascriptExecutor)w;
	  js7.executeScript("window.scrollTo(0,5000)");
		
	  w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[3]")).click();
      //System.out.println(w.getCurrentUrl()); 
	  Thread.sleep(2000);
	  
	  
	 WebElement element = w.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
	 Actions a= new Actions(w);
	 a.dragAndDropBy(element,100,160).perform();
	 Thread.sleep(2000);
	 
	JavascriptExecutor js33=(JavascriptExecutor)w;
	js33.executeScript("window.scrollTo(0,1000)");
	//System.out.println("window is  scrolled ");
	 
	 Thread.sleep(2000);
	 WebElement element1 = w.findElement(By.xpath("//*[@id=\"resizable\"]/span"));
	 a.dragAndDropBy(element1,100,180).perform();
	 
	 TakesScreenshot t4 =(TakesScreenshot) w;
	 File src4 = t4.getScreenshotAs(OutputType.FILE);
     Files.copy(src4, new File("D:\\ScreenShotp\\vidya11.png"));
     
     String name7= w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]")).getText();
	 System.out.println(name7);
	 Thread.sleep(2000);
	  
	 //w.navigate().back();
	 
	 
	//droppable 	 
	  w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[4]")).click();
	  Thread.sleep(2000);
	  //System.out.println(w.getCurrentUrl());
	  w.findElement(By.id("droppableExample-tab-simple")).click();
	  Thread.sleep(3000);
	 
	  
	  WebElement drag13 = w.findElement(By.id("draggable"));
	  WebElement drop13 = w.findElement(By.id("droppable")) ;
	  Actions a1= new Actions(w);
	  a1.dragAndDrop(drag13, drop13).build().perform();
	  
	  Thread.sleep(3000);
	  w.findElement(By.id("droppableExample-tab-accept")).click();
	  Thread.sleep(3000);
	  
	  WebElement drag14 = w.findElement(By.xpath("//div[@id='acceptable']"));
	  WebElement drop14 = w.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
	
	  Thread.sleep(2000);
	  a1.dragAndDrop(drag14, drop14).build().perform();
	  
	  String name8= w.findElement(By.xpath("//div[contains(text(),'Droppable')]")).getText();
	  System.out.println(name8);
	  
	  w.navigate().refresh();
	  
	  
      //Not acceptable		  
	  w.findElement(By.id("droppableExample-tab-accept")).click();
	  Thread.sleep(2000);
	  WebElement drop15 = w.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
	  WebElement drag15 = w.findElement(By.id("notAcceptable")) ; 
	  
	  a1.dragAndDrop(drag15, drop15 ).build().perform();
	  
	  TakesScreenshot t5 =(TakesScreenshot) w;
	  File src7 = t5.getScreenshotAs(OutputType.FILE);
      Files.copy(src7, new File("D:\\ScreenShotp\\vidya12.png"));
	  
      //prevent propagation	  
	  w.findElement(By.id("droppableExample-tab-preventPropogation")).click();
	  Thread.sleep(3000);
	  
	  WebElement drag16 = w.findElement(By.xpath("//div[@id='dragBox']"));
	  WebElement drop16 = w.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']")); 
	  Actions a2= new Actions(w);
	  a2.dragAndDrop(drag16, drop16).build().perform();
	  Thread.sleep(3000);
	  
	  TakesScreenshot t6 =(TakesScreenshot) w;
	  File src9 = t6.getScreenshotAs(OutputType.FILE);
      Files.copy(src9, new File("D:\\ScreenShotp\\vidya13.png"));
      
     
	  
     //revertable      
	  Thread.sleep(3000);
	  w.findElement(By.xpath("//a[@id='droppableExample-tab-revertable']")).click();
	  
	  WebElement drag18 = w.findElement(By.xpath("//div[@id='revertable']"));
	  WebElement drag19 = w.findElement(By.xpath("//div[@id='notRevertable']"));
	  WebElement drop18 = w.findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']"));
	  Actions a3= new Actions(w);
	  Thread.sleep(3000); 
	  a3.dragAndDrop(drag18, drop18).build().perform();
	  Thread.sleep(3000);
	  a3.dragAndDrop(drag19, drop18).build().perform();
	  
	  
	  
	  //Draggble	   
	  JavascriptExecutor jss4=(JavascriptExecutor)w;
	  jss4.executeScript("window.scrollTo(0,1000)");
      //System.out.println(w.getCurrentUrl());
	  
		
	  Thread.sleep(3000); 
	  w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[5]")).click();
	  Thread.sleep(3000); //simple
	  w.findElement(By.xpath("//a[@id='draggableExample-tab-simple']")).click();
	  
	  WebElement drag20 = w.findElement(By.xpath("//div[@id='dragBox']"));
	  Actions a4= new Actions(w);
	  a4.dragAndDropBy(drag20,100,100 ).build().perform();
	  
	  String name9= w.findElement(By.xpath("//div[contains(text(),'Dragabble')]")).getText();
	  System.out.println(name9);
	  
	  
	  
	  //axisRestriction	  
	  Thread.sleep(3000); 
	  w.findElement(By.xpath("//a[@id='draggableExample-tab-axisRestriction']")).click();
	  WebElement drag21 = w.findElement(By.xpath("//div[@id='restrictedX']"));
	  WebElement drag22 = w.findElement(By.xpath("//div[@id='restrictedY']"));
	  a4.dragAndDropBy(drag21,100,0 ).build().perform();
	  a4.dragAndDropBy(drag22,0,100 ).build().perform();
	  
	 //cursorStyle	  
	  Thread.sleep(3000);
	  w.findElement(By.xpath("//a[@id='draggableExample-tab-cursorStyle']")).click();
	  WebElement drag23 = w.findElement(By.xpath("//div[@id='cursorCenter']"));
	  a4.dragAndDropBy(drag23,100,110 ).build().perform();
	  Thread.sleep(2000);
	  
	  WebElement drag24 = w.findElement(By.xpath("//div[@id='cursorTopLeft']"));
	  a4.dragAndDropBy(drag24,-0,-190).build().perform();
	  Thread.sleep(2000);
	  
	  JavascriptExecutor jss5=(JavascriptExecutor)w;
      jss5.executeScript("window.scrollTo(0,1000)");
	 
	  WebElement drag25 = w.findElement(By.xpath("//div[@id='cursorBottom']"));
	  a4.dragAndDropBy(drag25,160,70 ).build().perform();
	  Thread.sleep(2000);
	  
	  TakesScreenshot t7 =(TakesScreenshot) w;
	  File srcc = t7.getScreenshotAs(OutputType.FILE);
      Files.copy(srcc, new File("D:\\ScreenShotp\\vidya14.png"));
       
      
      w.navigate().refresh();
	  
	 
			    //.Book store
		        JavascriptExecutor jss44=(JavascriptExecutor)w;
				jss44.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(3000);
				

			    //widgets
				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]/div[1]")).click();
				Thread.sleep(3000);	
				
				TakesScreenshot t77 =(TakesScreenshot) w;
				  File srcc66 = t77.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc66, new File("D:\\ScreenShotp\\vidya14.png"));
			      
				
				JavascriptExecutor jss19=(JavascriptExecutor)w;
				jss19.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(3000);
				
				
				//Login
				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/span[1]/div[1]/div[1]")).click();
				Thread.sleep(3000);
				
				w.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
				Thread.sleep(3000);
				
				TakesScreenshot t71 =(TakesScreenshot) w;
				  File srcc71 = t71.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc71, new File("D:\\ScreenShotp\\vidya14.png"));
			    
				
				
				//Book Store
				JavascriptExecutor jss919=(JavascriptExecutor)w;
				jss919.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(3000);
				
				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[2]/span[1]")).click();
				Thread.sleep(3000);
				
				TakesScreenshot t72 =(TakesScreenshot) w;
				  File srcc72 = t72.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc72, new File("D:\\ScreenShotp\\vidya14.png"));
			    
				
				//1st Link
				w.findElement(By.xpath("//a[contains(text(),'Git Pocket Guide')]")).click();
				Thread.sleep(3000);	
				JavascriptExecutor jss45=(JavascriptExecutor)w;
				jss45.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(3000);
				w.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
				Thread.sleep(3000);
				
			   //2nd Link 
				w.findElement(By.xpath("//a[contains(text(),'Learning JavaScript Design Patterns')]")).click();
				Thread.sleep(3000);	
				JavascriptExecutor jss46=(JavascriptExecutor)w;
				jss46.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(3000);
				w.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
				Thread.sleep(3000);
			
			    //3rd Link
				JavascriptExecutor jss47=(JavascriptExecutor)w;
				jss47.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(3000);
				w.findElement(By.xpath("//a[contains(text(),'Designing Evolvable Web APIs with ASP.NET')]")).click();
				Thread.sleep(3000);	
				JavascriptExecutor jss48=(JavascriptExecutor)w;
				jss48.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(3000);
				w.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
				Thread.sleep(3000);
			    
			    //4th Link
				JavascriptExecutor jss49=(JavascriptExecutor)w;
				jss49.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(3000);
				w.findElement(By.xpath("//a[contains(text(),'Speaking JavaScript')]")).click();
				Thread.sleep(3000);	
				JavascriptExecutor jss50=(JavascriptExecutor)w;
				jss50.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(3000);
				w.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
				Thread.sleep(3000);
			    
			    
			    //Profile
				JavascriptExecutor jss51=(JavascriptExecutor)w;
				jss51.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(3000);
				w.findElement(By.xpath("//span[contains(text(),'Profile')]")).click();
				Thread.sleep(3000);	
				
				TakesScreenshot t73 =(TakesScreenshot) w;
				  File srcc73 = t73.getScreenshotAs(OutputType.FILE);
			      Files.copy(srcc73, new File("D:\\ScreenShotp\\vidya14.png"));
			    
				

			    //Book Store API
				JavascriptExecutor jss52=(JavascriptExecutor)w;
			    jss52.executeScript("window.scrollTo(0,2000)");
				//Thread.sleep(3000);
				//w.navigate().refresh();
			    
			    TakesScreenshot t523 =(TakesScreenshot) w;
				File sr1cc = t523.getScreenshotAs(OutputType.FILE);
			    Files.copy(sr1cc, new File("D:\\ScreenShotp\\book.png"));
			    
			    System.out.println("End");
				
		        w.navigate().back();    
			  		
			}

		}
	  
	  
