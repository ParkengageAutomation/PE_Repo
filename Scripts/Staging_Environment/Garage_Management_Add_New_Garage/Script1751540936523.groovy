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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging-admin.parkengage.com/')

WebUI.waitForElementPresent(findTestObject('Login_Page_Objects/Login_Button'), 20)

WebUI.click(findTestObject('Login_Page_Objects/Login_Button'))

WebUI.waitForElementPresent(findTestObject('Login_Page_Objects/Email_Password_Field'), 20)

WebUI.setText(findTestObject('Login_Page_Objects/Email_Input_Field'), GlobalVariable.G_Email)

WebUI.setEncryptedText(findTestObject('Login_Page_Objects/Email_Password_Field'), '8ONjX3ggx5TCf8aO14KwWA==')

WebUI.click(findTestObject('Login_Page_Objects/Login_Submit_Button'))

WebUI.delay(15)

WebUI.click(findTestObject('Create_Garrage/Product_Menu_Expand'))

WebUI.waitForElementClickable(findTestObject('Create_Garrage/Garage_Management_Menu'), 5)

WebUI.click(findTestObject('Create_Garrage/Garage_Management_Menu'))

WebUI.waitForElementPresent(findTestObject('Create_Garrage/Add_New_Button_Garage'), 10)

WebUI.click(findTestObject('Create_Garrage/Add_New_Button_Garage'))

WebUI.setText(findTestObject('Create_Garrage/Garage_Name_Input_Field'), 'TestGarage')

WebUI.setText(findTestObject('Create_Garrage/Garage_Short_Name'), 'TestGrg')

WebUI.setText(findTestObject('Create_Garrage/Garage_Code_Input_Field'), 'TG1101')

WebUI.setText(findTestObject('Create_Garrage/Garage_Phone_Number_Input'), '1122332233')

WebUI.delay(2)

WebUI.click(findTestObject('Create_Garrage/Select_Partner_Garage_Mngmnt_Drp_Dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Create_Garrage/Partner_Rev_Pass'))

WebUI.click(findTestObject('Create_Garrage/Garage_Type_Drp_Dwn'))

WebUI.delay(1)

WebUI.click(findTestObject('Create_Garrage/Ungated_Garage_Option'))

