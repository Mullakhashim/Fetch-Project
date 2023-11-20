package com.fetch.pages;

import com.fetch.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Task_page {

    public Task_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "reset")
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

    @FindBy(id = "right_0")
    public WebElement right_0;

    @FindBy(id = "right_1")
    public WebElement right_1;

    @FindBy(id = "right_2")
    public WebElement right_2;










}
