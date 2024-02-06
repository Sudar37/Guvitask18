package GuviTask18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        driver.findElement(By.id("u_g_b_KQ")).sendKeys("Test");
        driver.findElement(By.id("u_g_d_sJ")).sendKeys("User");
        driver.findElement(By.id("u_g_g_hU")).sendKeys("testuser@test.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Asdfg@123");

        // Select birthdate (example: day 11, month May, year 1985)
        Select dayDropdown = new Select(driver.findElement(By.id("Day")));
        dayDropdown.selectByVisibleText("11");

        Select monthDropdown = new Select(driver.findElement(By.id("Month")));
        monthDropdown.selectByValue("May");

        Select yearDropdown = new Select(driver.findElement(By.id("Year")));
        yearDropdown.selectByValue("1985");

        // Select gender (example: Female)
        driver.findElement(By.className("_58mt")).click();

        // Submit the form
        driver.findElement(By.name("websubmit")).submit();

        // Close the browser
        driver.quit();
	}

}
