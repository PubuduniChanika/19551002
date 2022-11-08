package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class HomePage extends TestBase {

	
	//Page Factory - Object Repository
		
		@FindBy(xpath = "//div[@id='logo_aT']")
		WebElement actitimeLogo;
		
		@FindBy(xpath = "//span[text()='Me']")
		WebElement viewUser;
		
		//@FindBy(xpath = "//span[text()='Nowak, Peter']")
		
		@FindBy(xpath = "//span[text()='Nowak, Peter']")
		WebElement UserOne;
		
		@FindBy(xpath = "//div[@class='changeStatusButton approveButton']")
		WebElement Approve;
		
		@FindBy(xpath = "//div[@class='changeStatusButton rejectButton']")
		WebElement Reject;
		
		@FindBy(xpath = "//TD[@class='revokeCell']")
		WebElement Revoke;
    
		@FindBy(xpath = "//span[text()='Reject']")
		WebElement Reject2;
		
		@FindBy(xpath = "//SPAN[@class='ui-button-text'][text()='Cancel']")
		WebElement RejectCancel;
		
		@FindBy(xpath = "//input[@id='SubmitTTButton']")
		WebElement Save;
		
		
		@FindBy(xpath = "//td[@class='currentStatusCell statusText']")
		WebElement Status;
		
		@FindBy(xpath = "//TEXTAREA[@id='rejectWeekCommentTextArea']")
		WebElement RejectComment;
		
		@FindBy(xpath = "//DIV[@class='ttaHistoryButton']")
		WebElement Check;
		
		@FindBy(xpath = "/html/body/div[18]/div[2]/div/table/tbody/tr[1]/td[2]")
		WebElement CheckApproved;
		
		@FindBy(xpath = "/html/body/div[18]/div[2]/div/table/tbody/tr[1]/td[4]")
		WebElement Comment;
		
		@FindBy(xpath = "/html/body/div[18]/div[2]/div/table/tbody/tr[1]/td[3]")
		WebElement User;
		
		
		
		
		//TD[@class='statusCell approved'][text()='Approved']
		
		
		//nz-select/ng-reflect-name='selectedIntegrationtypes'
		
		
		
	
		
		//initialization
		
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
		
		//Action/Methods
		
		public Boolean validateActiTimeLogo() {
			return actitimeLogo.isDisplayed();
		}
		

		public void clickOnViewUsers() {
			viewUser.click();
			
			
		}
		
		public void clickOnUserOne() {
	         UserOne.click();     
		}	
		
		public void clickOnApprove() {
	         Approve.click();     
		}	
		public void clickOnReject() {
	         Reject.click();     
		}	
		public void clickOnReject2() {
	         Reject2.click();     
		}	
		public void clickOnSave() {
	         Save.click();     
		}	
		public String statusText() {
	         return Status.getText();     
		}


		public void clickOnRejectCancel() {
			RejectCancel.click(); 
			
		}
		
		public void setRejectComment(String a) {
			RejectComment.sendKeys(a); 
			
		}


		public void clickOnRevoke() {
			Revoke.click();
			
		}	
		public void clickOnCheck() {
			Check.click();
			
		}	
		public String CheckApprovedText() {
	         return CheckApproved.getText();     
		}
		public String CheckCommentText() {
	         return Comment.getText();     
		}
		public String CheckUserText() {
	         return User.getText();     
		}
		
	
}
