package com.fetch.pages;

import com.fetch.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class Task_page {

    public Task_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@id='reset' and .='Reset']")
    public WebElement resetButton;

    @FindBy(id = "weigh")
    public WebElement weighButton;

    @FindBy(xpath = "//div[@class='result']//button")
    public WebElement result;

    @FindBy(xpath = "//div[contains(text(), \"left\")]")
    public WebElement left_bowl;

    @FindBy(xpath = "//div[contains(text(), \"right\")]")
    public WebElement right_bowl;

    @FindBy(id = "left_0")
    public WebElement left_0;

    @FindBy(id = "left_1")
    public WebElement left_1;

    @FindBy(id = "left_2")
    public WebElement left_2;

    @FindBy(id = "left_3")
    public WebElement left_3;

    @FindBy(id = "left_4")
    public WebElement left_4;

    @FindBy(id = "left_5")
    public WebElement left_5;

    @FindBy(id = "left_6")
    public WebElement left_6;

    @FindBy(id = "left_7")
    public WebElement left_7;

    @FindBy(id = "left_8")
    public WebElement left_8;

    @FindBy(id = "right_0")
    public WebElement right_0;

    @FindBy(id = "right_1")
    public WebElement right_1;

    @FindBy(id = "right_2")
    public WebElement right_2;
    @FindBy(id = "right_3")
    public WebElement right_3;

    @FindBy(id = "right_4")
    public WebElement right_4;

    @FindBy(id = "right_5")
    public WebElement right_5;

    @FindBy(id = "right_6")
    public WebElement right_6;

    @FindBy(id = "right_7")
    public WebElement right_7;

    @FindBy(id = "right_8")
    public WebElement right_8;

    @FindBy(xpath = "//div[@class='game-info']//ol")
    public WebElement first_iterations_result;

    @FindBy(xpath = "//div[@class='game-info']//ol//li/following-sibling::*[1]")
    public WebElement second_iteration_result;

    @FindBy(xpath = "//button[@class='square']")
    public List<WebElement> list_of_bars;










}
