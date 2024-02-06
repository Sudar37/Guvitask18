package GuviTask18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

        // Open the jQueryUI
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));

        // Perform the drag and drop operation
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).perform();

        String targetColor = targetElement.getCssValue("background-color");
        System.out.println("Target element color: " + targetColor);

        // Verify the text of the target element
        String targetText = targetElement.getText();
        if (targetText.equals("Dropped!")) {
            System.out.println("Drag and drop successful!");
        } else {
            System.out.println("Drag and drop failed.");
        }

        // Close the browser
        driver.quit();
	}

}
