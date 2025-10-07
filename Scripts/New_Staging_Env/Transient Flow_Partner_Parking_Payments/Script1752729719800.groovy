import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.pdfbox.pdmodel.PDDocument as PDDocument
import org.apache.pdfbox.rendering.PDFRenderer as PDFRenderer
import javax.imageio.ImageIO as ImageIO
import java.awt.image.BufferedImage as BufferedImage
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging-transient.parkengage.com/parkingpayments/touchless-parking-parking/eyJmYWNpbGl0eV9pZCI6Mjg4LCJnYXRlIjoxMSwiZ2F0ZV90eXBlIjoiMCJ9')

WebUI.waitForElementPresent(findTestObject('Transient_Folder/Mobile_Number_Field'), 20)

/**
 * Generates a random 10-digit mobile number starting with 2233 series
 * e.g., 2233XXXXXX
 * @return String - 10 digit mobile number
 */
// Generate 6 random digits (to complete 10-digit number)
// Appends digit from 0-9
// Example usage:
String mobileNumber = generateMobileNumberWith2233Series()

println('Generated Mobile Number: ' + mobileNumber)

WebUI.setText(findTestObject('Transient_Folder/Mobile_Number_Field'), mobileNumber)

String lpNumber = generateLicenseplate()

println('Generated License Plate: ' + lpNumber)

WebUI.setText(findTestObject('Transient_Folder/License_Plate'), lpNumber)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Transient_Folder/Transient Duration_Increase'), 
    10)

JavascriptExecutor executor = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

executor.executeScript('arguments[0].click();', element)

//executor.executeScript('arguments[0].click();', element) //WebUI.mouseOver(findTestObject('Transient_Folder/Transient Duration_Increase'))
//WebUI.click(findTestObject('Transient_Folder/Transient Duration_Increase'))
//WebUI.click(findTestObject('Transient_Folder/Transient Duration_Increase'))
//WebUI.waitForElementPresent(findTestObject('Transient_Folder/Term_Condition_CB'), 10)

//WebUI.click(findTestObject('Transient_Folder/Term_Condition_CB'))

WebUI.scrollToElement(findTestObject('Transient_Folder/Start_Parking_BTN'), 20)

WebUI.setText(findTestObject('Transient_Folder/Card_Details_Name'), 'Satya Kumar')

WebUI.setText(findTestObject('Transient_Folder/Card_Deatils_Number'), '4761 7310 0000 0043')

WebUI.setText(findTestObject('Transient_Folder/Card_Expiry'), '12/30')

WebUI.setText(findTestObject('Transient_Folder/Card_CVV'), '111')

WebUI.delay(2)

WebUI.click(findTestObject('Transient_Folder/Start_Parking_BTN'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Transient_Folder/Get Ticket ID'), 10)

def ticketId = WebUI.getText(findTestObject('Transient_Folder/Get Ticket ID'))

print(ticketId)

String generateMobileNumberWith2233Series() {
    Random rand = new Random()

    StringBuilder lastSixDigits = new StringBuilder()

    for (int i = 0; i < 6; i++) {
        lastSixDigits.append(rand.nextInt(10))
    }
    
    return '2233' + lastSixDigits.toString()
}

String generateLicenseplate() {
    String chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'

    Random rand = new Random()

    StringBuilder lp = new StringBuilder()

    for (int i = 0; i < 4; i++) {
        int index = rand.nextInt(chars.length())

        lp.append(chars.charAt(index))
    }
    
    return lp.toString()
}

