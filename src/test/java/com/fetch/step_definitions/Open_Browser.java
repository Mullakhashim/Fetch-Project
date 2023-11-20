package com.fetch.step_definitions;

import com.fetch.pages.Task_page;
import com.fetch.utilities.BrowserUtils;
import com.fetch.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Open_Browser {

    Task_page taskPage = new Task_page();

    @Given("user goes to the task page")
    public void user_goes_to_the_task_page() {
        Driver.getDriver().get("http://sdetchallenge.fetch.com/");
    }

    @Then("user should see the title of the task page")
    public void user_should_see_the_title_of_the_task_page() {
        BrowserUtils.verifyTitle("React App");
    }

    @Then("user should see the left bowl")
    public void user_should_see_the_left_bowl() {
        Assert.assertTrue(taskPage.left_bowl.isDisplayed());
        Assert.assertTrue(taskPage.left_0.isDisplayed());
        Assert.assertTrue(taskPage.left_1.isDisplayed());
        Assert.assertTrue(taskPage.left_2.isDisplayed());
    }

    @Then("user should see the Reset button")
    public void user_should_see_the_reset_button() {
        Assert.assertTrue(taskPage.resetButton.isDisplayed());
    }

    @Then("user should see the Weigh button")
    public void user_should_see_the_weigh_button() {
        Assert.assertTrue(taskPage.weighButton.isDisplayed());
    }

    @Then("user should see the Result button")
    public void user_should_see_the_result_button() {
        Assert.assertTrue(taskPage.result.isDisplayed());
        Assert.assertEquals(taskPage.result.getText(), "?");

    }


    @Then("user should see the right bowl")
    public void userShouldSeeTheRightBowl() {
        Assert.assertTrue(taskPage.right_bowl.isDisplayed());
        Assert.assertTrue(taskPage.right_0.isDisplayed());
        Assert.assertTrue(taskPage.right_1.isDisplayed());
        Assert.assertTrue(taskPage.right_2.isDisplayed());

    }
}
