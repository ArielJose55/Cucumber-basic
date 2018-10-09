package core.steps;

import net.thucydides.core.annotations.Steps;
import core.steps.serenity.UserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Es la clase donde se le da semantica a las acciones que realiza en actor y su respectivo mappeo de con el lenguaje cherkin 
 * 
 * @author ariel.arnedo
 *
 */
public class SemacticSteps {

	// Define primeramente en actor
	@Steps
	UserSteps ariel;
	
	//despues con las anotaciones Given("mapper"), When("mapper"), Then("mapper") decoremos los metodos que haran las los pasos del actor
	
	@Given("the user is on youtube home page")
	public void givenTheUserIsOnTheYoutubeHomePage() {
		ariel.is_the_home_page();
	}
	
	@When("the user looks for video of and share it '(.*)'")
	public void whenTheUserLooksForVideoOf(String video) {
		ariel.looks_for_and_start_search(video);
		try {
			Thread.sleep(5000L);
		}catch (Exception e) {
			e.printStackTrace();
		}
		ariel.share_it();
	}
	
	@When("the user changes the tab to share the video")
	public void wheTheUserChangesTheTabtoShareTheVideo() {
		ariel.change_tab();
	}
	
	@When("the user logs on facebook and post the video")
	public void wheTheUserLogsOnFacebook() {
		ariel.log_in_on_facebook();
		ariel.post_the_video();
	}
	
}
