package core.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;



import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("http://www.youtube.com")
public class DictionaryYouTubePage extends PageObject{
	
	@FindBy(xpath="//input[@name='search_query']")
    private WebElementFacade searchQuery;

    @FindBy(xpath="//a[contains(@title,'Redimi2 - Trapstorno')]")
    private WebElementFacade videoTitle;
    
    @FindBy(xpath="//yt-formatted-string[text()='Share']")
    private WebElement share_it;
    
    @FindBy(xpath="//div[@class='style-scope ytd-share-target-renderer' and text()='Facebook']")
    private WebElement facebookShare;
	
	public void look_for_the_video(String keyword) {
		searchQuery.type(keyword);
    }
	
	public void watch_video() {
		videoTitle.click();
	}
	
	public void share_it() {
		share_it.click();
		facebookShare.click();
	}
	
}
