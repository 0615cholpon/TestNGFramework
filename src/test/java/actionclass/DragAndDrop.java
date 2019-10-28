package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class DragAndDrop {
    Actions actions;
    @Test
    public void dragAndDrop(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement source = Driver.getDriver().findElement(By.id("draggable"));
        WebElement target= Driver.getDriver().findElement(By.id("droptarget"));
        actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(source,target).perform();

        //String expected=

    }
}
