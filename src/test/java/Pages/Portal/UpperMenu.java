package Pages.Portal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Pages.GenericPage;
import WebElements.Button;

public class UpperMenu extends GenericPage{
		
	
	 @FindBy(how=How.ID,using="dashboard")
	 	private WebElement Managment_element;
	 	public Button Managment;
	 	
	@FindBy(how=How.XPATH,using="//*[@id=\"stg-operations\"]/div/div[1]/div[3]/twa-swg-change-set-plugin/div/twa-swg-customer-change/div/twa-button/material-button/div")
		 	private WebElement pendingChanes_element;
		 	public Button pendingChanes;
	 	
		 public UpperMenu () {
			 Managment = new Button(Managment_element);
			 pendingChanes = new Button(pendingChanes_element);
		 }

}
