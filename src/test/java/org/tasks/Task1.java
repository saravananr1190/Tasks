package org.tasks;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutput;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.util.Set;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Wait;

import net.bytebuddy.implementation.EqualsMethod;

public class Task1 extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {

		Launch("https://www.snapdeal.com/");
		Actions a = new Actions(d);
		
		TakesScreenshot tk = (TakesScreenshot)d;
		
		
		
		
		WebElement m = findByxpath("//div[@class='myAccountTab accountHeaderClass col-xs-13 reset-padding']");
		a.moveToElement(m).perform();
		File src1 = tk.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\HP\\Desktop\\New folder\\s1.jpg");
		FileHandler.copy(src1, des1);
		
		WebElement m2 = findByxpath("//span[@class='accountBtn btn rippleWhite']");
		a.moveToElement(m2).click().perform();
		
		
		File f = new File("C:\\Users\\HP\\Desktop\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fs);
		Sheet s = w.getSheet("FormatCast");

		Row r = s.getRow(1);
		Cell c1 = r.getCell(0);
		long l = (long) c1.getNumericCellValue();
		String user = String.valueOf(l);
		System.out.println(user);

		Cell c2 = r.getCell(1);
		String pass = c2.getStringCellValue();

		d.switchTo().frame(findByxpath("//iframe[@id='loginIframe']"));

		WebElement e = findByxpath("//input[@id='userName']");
		type(e, user);
		File src2 = tk.getScreenshotAs(OutputType.FILE);
		File des2 = new File("C:\\Users\\HP\\Desktop\\New folder\\s2.jpg");
		FileHandler.copy(src2, des2);
		
		WebElement e2 = findByxpath("//button[@id='checkUser']");
		e2.click();

		WebElement e3 = findByxpath("//input[@id='j_password_login_uc']");
		Thread.sleep(2000);
		type(e3, pass);

		WebElement e4 = findByxpath("//button[@id='submitLoginUC']");
		e4.click();

		d.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement e5 = findByxpath("//input[@id='inputValEnter']");
		Thread.sleep(2000);
		Cell c3 = r.getCell(2);
		String product = c3.getStringCellValue();
		type(e5, product);

		File src3 = tk.getScreenshotAs(OutputType.FILE);
		File des3 = new File("C:\\Users\\HP\\Desktop\\New folder\\s3.jpg");
		FileHandler.copy(src3, des3);
		
		
		WebElement e6 = findByxpath("//button[@class='searchformButton col-xs-4 rippleGrey']");
		e6.click();

		findByxpath("(//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[2]").click();
		File src4 = tk.getScreenshotAs(OutputType.FILE);
		File des4 = new File("C:\\Users\\HP\\Desktop\\New folder\\s4.jpg");
		FileHandler.copy(src4, des4);
		
		String par = d.getWindowHandle();

		Set<String> sub = d.getWindowHandles();

		for (String x : sub) {
			if (!par.equals(x)) {
				d.switchTo().window(x);
			}
		}

		File src5 = tk.getScreenshotAs(OutputType.FILE);
		File des5 = new File("C:\\Users\\HP\\Desktop\\New folder\\s5.jpg");
		FileHandler.copy(src5, des5);
		
		findById("buy-button-id").click();
		
		findById("back-to-saved-address").click();

		File src6 = tk.getScreenshotAs(OutputType.FILE);
		File des6 = new File("C:\\Users\\HP\\Desktop\\New folder\\s6.jpg");
		FileHandler.copy(src6, des6);
		
		findByxpath("//div[@class='rippleWhite btn']").click();
		File src7 = tk.getScreenshotAs(OutputType.FILE);
		File des7 = new File("C:\\Users\\HP\\Desktop\\New folder\\s7.jpg");
		FileHandler.copy(src7, des7);
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		WebElement down = d.findElement(By.xpath("//button[text()='PROCEED TO PAYMENT']"));
		
		
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(2000);
		
		findByxpath("//button[text()='PROCEED TO PAYMENT']").click();
		Thread.sleep(2000);
		File src8 = tk.getScreenshotAs(OutputType.FILE);
		File des8 = new File("C:\\Users\\HP\\Desktop\\New folder\\s8.jpg");
		FileHandler.copy(src8, des8);
		
	}
}