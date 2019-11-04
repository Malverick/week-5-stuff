package com.qa.selenium.testing;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTests {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	@Ignore
	public void testOne() throws InterruptedException {
		System.out.println("Test 001");
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}
	@Test
	@Ignore
	public void testTwo() throws InterruptedException {
		driver.get("http://thedemosite.co.uk/addauser.php");
		WebElement webEle1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		webEle1.sendKeys("TestUser52");
		WebElement webEle2 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		webEle2.sendKeys("TestPas52");
		WebElement webEle5 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		webEle5.click();
		driver.get("http://thedemosite.co.uk/login.php");
		WebElement webEle3 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		webEle3.sendKeys("TestUser52");
		WebElement webEle4 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		webEle4.sendKeys("TestPas52");
		WebElement webEle6 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		webEle6.click();
		Thread.sleep(2000);
		WebElement webEle7 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		Thread.sleep(2000);
		assertEquals("Login Test Result::", true, webEle7.getText().equals("**Successful Login**"));
	}
	@Test
	@Ignore
	public void testThree() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		WebElement webEle8 = driver.findElement(By.id("search_query_top"));
		webEle8.sendKeys("dress");
		Thread.sleep(2000);
		WebElement webEle9 = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
		webEle9.click();
		Thread.sleep(2000);
		WebElement webEle10 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a"));
		Thread.sleep(2000);
		webEle10.click();
		Thread.sleep(5000);
	}
	@Test
	@Ignore
	public void testFour() throws InterruptedException {
		driver.get("http://www.youidraw.com/apps/painter");
		WebElement webEle20 = driver.findElement(By.xpath("//*[@id=\"catch\"]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(webEle20).moveByOffset(-500, -300).moveByOffset(50, 50).clickAndHold().moveByOffset(100, 0).moveByOffset(-50, 0).moveByOffset(0, 200).moveByOffset(-3, 3).moveByOffset(-3, 3).moveByOffset(-3, 3).moveByOffset(-2, 2).moveByOffset(-2, 2).moveByOffset(-2, 2).moveByOffset(-3, 0).moveByOffset(-3, 0).moveByOffset(-3, 0).moveByOffset(-2, 0).moveByOffset(-3, -3).moveByOffset(-3, -3).moveByOffset(-3, -3).moveByOffset(-2, -2).moveByOffset(-2, -2).moveByOffset(-2, -2).release().perform();
		actions.moveToElement(webEle20).moveByOffset(-500, -300).moveByOffset(50, 50).moveByOffset(300, 400).clickAndHold().moveByOffset(200, -200).moveByOffset(0, -120).moveByOffset(-260, 260).moveByOffset(60, 60).moveByOffset(-25, -25).moveByOffset(-50, 50).moveByOffset(-10, -10).moveByOffset(50,-50).release().perform();
		actions.moveToElement(webEle20).moveByOffset(-500, -300).moveByOffset(50, 50).moveByOffset(300, 400).moveByOffset(-15, -15).moveByOffset(10, -10).clickAndHold().moveByOffset(190, -190).moveByOffset(15, -105).release().perform();
		actions.moveToElement(webEle20).moveByOffset(-500, -300).moveByOffset(50, 50).moveByOffset(300, 400).clickAndHold().moveByOffset(10, -10).moveByOffset(-60, -60).release().perform();

		//The following section became redundant because the bucket tool of the software I was using did not work.

//		WebElement webEle21 = driver.findElement(By.id("color"));
//		webEle21.click();
//		Thread.sleep(500);
//		WebElement webEle22 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[5]/input"));
//		webEle22.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//		webEle22.sendKeys("383838");
//		WebElement webEle23 = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[3]/div/div/table/tbody/tr[4]/td/div"));
//		webEle23.click();
//		actions.moveToElement(webEle20).moveByOffset(-500, -300).moveByOffset(50, 50).moveByOffset(300, 400).moveByOffset(20, -20).click().perform();
		
		Thread.sleep(10000);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
