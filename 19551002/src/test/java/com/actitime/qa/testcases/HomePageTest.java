package com.actitime.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		
		
	}
	
	
	/*@Test(priority = 1)
	public void homePageTaskLinkTest() {
		
	homePage.clickOnTaskLink();
	
	}*/
	@Test(priority = 1)
	public void homeUserApprove() {
		
	homePage.clickOnViewUsers();
	homePage.clickOnUserOne();
	homePage.clickOnApprove();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)", "");
	homePage.clickOnSave();
	Assert.assertTrue(homePage.statusText().contains("Approved"));
	homePage.clickOnCheck();
	Assert.assertTrue(homePage.CheckApprovedText().contains("Approved"));
	Assert.assertTrue(homePage.CheckCommentText().isEmpty());
	Assert.assertTrue(homePage.CheckUserText().contains("Me"));
	}
	@Test(priority = 2)
	public void homeUserCancelReject() {
		
		homePage.clickOnViewUsers();
		homePage.clickOnUserOne();
		homePage.clickOnReject();
		homePage.clickOnRejectCancel();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		homePage.clickOnSave();
		Assert.assertTrue(homePage.statusText().contains("Approved"));
		homePage.clickOnCheck();
		Assert.assertTrue(homePage.CheckApprovedText().contains("Approved"));
		Assert.assertTrue(homePage.CheckCommentText().isEmpty());
		Assert.assertTrue(homePage.CheckUserText().contains("Me"));
		
		}
	@Test(priority = 3)
	public void homeUserReject(){
		
		homePage.clickOnViewUsers();
		homePage.clickOnUserOne();
		homePage.clickOnReject();
		homePage.clickOnReject2();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		homePage.clickOnSave();
		Assert.assertTrue(homePage.statusText().contains("Rejected"));
		homePage.clickOnCheck();
		Assert.assertTrue(homePage.CheckApprovedText().contains("Rejected"));
		Assert.assertTrue(homePage.CheckCommentText().isEmpty());
		Assert.assertTrue(homePage.CheckUserText().contains("Me"));
		
		}
	@Test(priority = 4)
	public void homeRevoke() throws InterruptedException {
		
		homePage.clickOnViewUsers();
		homePage.clickOnUserOne();
		homePage.clickOnRevoke();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		homePage.clickOnSave();
		Thread.sleep(100);
		Assert.assertTrue(homePage.statusText().contains("Approved"));
		homePage.clickOnCheck();
		Assert.assertTrue(homePage.CheckApprovedText().contains("Approved"));
		Assert.assertTrue(homePage.CheckCommentText().isEmpty());
		Assert.assertTrue(homePage.CheckUserText().contains("Me"));
		
		}
	
	@Test(priority = 5)
	public void homeUserRejectCommented() throws InterruptedException {
		
		homePage.clickOnViewUsers();
		homePage.clickOnUserOne();
		homePage.clickOnReject();
		homePage.setRejectComment("Test");
		Thread.sleep(100);
		homePage.clickOnReject2();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		homePage.clickOnSave();
		Assert.assertTrue(homePage.statusText().contains("Rejected"));
		homePage.clickOnCheck();
		Assert.assertTrue(homePage.CheckApprovedText().contains("Rejected"));
		Assert.assertTrue(homePage.CheckCommentText().contains("Test"));
		Assert.assertTrue(homePage.CheckUserText().contains("Me"));
		}
	/*@Test(priority = 2)
	public void homePageUserOne() {
		
	homePage.clickOnUserOne();
		
	}*/
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
