package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class UploadPractice {
    @Test
    public void uploadTest()throws InterruptedException{
        //get- to page
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        //locate the ChooseFile inoutbutton
        WebElement chooseFileInout=Driver.getDriver().findElement(By.id("file-upload"));
        Thread.sleep(2000);
        chooseFileInout.sendKeys("/Users/c.alymova/Desktop/OCA/useful materials/2-JAVA .pdf");
        Thread.sleep(2000);
        WebElement uploadbutton=Driver.getDriver().findElement(By.id("file-submit"));
        uploadbutton.click();

        WebElement uploadedFolderBox = Driver.getDriver().findElement(By.id("uploaded-files"));
        //uploadedFolderBox.click();
        String expectedFileName = "2-JAVA .pdf";
        String actualFileName=uploadedFolderBox.getText();

        Assert.assertEquals(expectedFileName,actualFileName);
    }
}
