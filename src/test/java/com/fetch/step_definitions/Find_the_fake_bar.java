package com.fetch.step_definitions;

import com.fetch.pages.Task_page;
import com.fetch.utilities.BrowserUtils;
import com.fetch.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;

public class Find_the_fake_bar {

    Task_page taskPage = new Task_page();
    String result_text="";
    ArrayList<Integer> remaining_bars = new ArrayList<>();
    int fake_bar ;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

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
        for (int i = 0; i <= 8; i++) {

            Assert.assertTrue(taskPage.left_bowl_boxes.get(i).isDisplayed());
        }
//        Assert.assertTrue(taskPage.left_0.isDisplayed());
//        Assert.assertTrue(taskPage.left_1.isDisplayed());
//        Assert.assertTrue(taskPage.left_2.isDisplayed());
//        Assert.assertTrue(taskPage.left_3.isDisplayed());
//        Assert.assertTrue(taskPage.left_4.isDisplayed());
//        Assert.assertTrue(taskPage.left_5.isDisplayed());
//        Assert.assertTrue(taskPage.left_6.isDisplayed());
//        Assert.assertTrue(taskPage.left_7.isDisplayed());
//        Assert.assertTrue(taskPage.left_8.isDisplayed());
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
        for (int i = 0; i <= 8; i++) {
            Assert.assertTrue(taskPage.right_bowl_boxes.get(i).isDisplayed());
        }
//        Assert.assertTrue(taskPage.right_0.isDisplayed());
//        Assert.assertTrue(taskPage.right_1.isDisplayed());
//        Assert.assertTrue(taskPage.right_2.isDisplayed());
//        Assert.assertTrue(taskPage.right_3.isDisplayed());
//        Assert.assertTrue(taskPage.right_4.isDisplayed());
//        Assert.assertTrue(taskPage.right_5.isDisplayed());
//        Assert.assertTrue(taskPage.right_6.isDisplayed());
//        Assert.assertTrue(taskPage.right_7.isDisplayed());
//        Assert.assertTrue(taskPage.right_8.isDisplayed());

    }

    @Given("user puts first three bars in the left bowl")
    public void userPutsFirstBarsInTheLeftBowl() {
        for (int i = 0; i <= 2; i++) {
            taskPage.left_bowl_boxes.get(i).sendKeys(""+i);
        }

//        taskPage.left_0.sendKeys("0");
//        taskPage.left_1.sendKeys("1");
//        taskPage.left_2.sendKeys("2");

    }

    @Given("user puts last three bars in the right bowl")
    public void userPutsLastThreeBarsInTheRightBowl() {
        for (int i = 8; i >= 6; i--) {
            taskPage.right_bowl_boxes.get(i).sendKeys(""+i);
        }

//        taskPage.right_8.sendKeys("8");
//        taskPage.right_7.sendKeys("7");
//        taskPage.right_6.sendKeys("6");

    }

    @Then("user clicks Weigh button")
    public void userClicksWeighButton(){
        taskPage.weighButton.click();
        wait.until(ExpectedConditions.visibilityOf(taskPage.first_iterations_result));

        result_text = taskPage.result.getText();
    }

    @Then("user puts first and second of remaining three bars")
    public void userPutsFirstAndSecondOfRemainingThreeBars(){

        taskPage.resetButton.click();

        taskPage.left_4.sendKeys(remaining_bars.get(0).toString());
        taskPage.right_5.sendKeys(remaining_bars.get(1).toString());

    }

    @Then("user locates the fake bar")
    public void userLocatesTheFakeBar() {
        if (taskPage.result.getText().equals("=")){

            fake_bar=remaining_bars.get(2);

        } else if (taskPage.result.getText().equals("<")) {


            fake_bar=remaining_bars.get(0);

        } else if (taskPage.result.getText().equals(">")) {


            fake_bar=remaining_bars.get(1);

        }else{
            throw new RuntimeException("try one more time");
        }
//        System.out.println("fake_bar = " + fake_bar);
    }

    @Then("user clicks Weigh button second time")
    public void userClicksWeighButtonSecondTime() {

        taskPage.weighButton.click();
        wait.until(ExpectedConditions.visibilityOf(taskPage.second_iteration_result));

        result_text = taskPage.result.getText();
    }

    @Then("user should see the Result of weighing and click Reset button")
    public void userShouldSeeTheResultOfWeighingAndClickResetButton() {

        if (taskPage.result.getText().equals("=")){
            remaining_bars.add(3);
            remaining_bars.add(4);
            remaining_bars.add(5);

        } else if (taskPage.result.getText().equals("<")) {
            remaining_bars.add(0);
            remaining_bars.add(1);
            remaining_bars.add(2);

        } else if (taskPage.result.getText().equals(">")) {
            remaining_bars.add(6);
            remaining_bars.add(7);
            remaining_bars.add(8);

        }else{
            throw new RuntimeException("try one more time");
        }

        taskPage.resetButton.click();
    }

    @Then("user clicks to the bar number and sees confirmation and error messages")
    public void userClicksToTheBarNumberAndSeesConfirmationAndErrorMessages() {
        for (int i =0; i<=8; i++){

            if (Integer.valueOf(taskPage.list_of_bars.get(i).getText()) == fake_bar){
                taskPage.list_of_bars.get(i).click();

                Alert alert = Driver.getDriver().switchTo().alert();
                String Actual_text = alert.getText();
                alert.accept();

                Assert.assertEquals(Actual_text,"Yay! You find it!");

            }else{

                taskPage.list_of_bars.get(i).click();

                Alert alert = Driver.getDriver().switchTo().alert();
                String Actual_text = alert.getText();
                alert.accept();

                Assert.assertEquals(Actual_text,"Oops! Try Again!");

            }

        }

    }
}
