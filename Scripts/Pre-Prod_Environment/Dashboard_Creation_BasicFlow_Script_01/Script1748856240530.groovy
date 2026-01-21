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

WebUI.navigateToUrl('https://preprod-admin.parkengage.com/')

WebUI.waitForElementPresent(findTestObject('Login_Page_Objects/Login_Button'), 20)

WebUI.click(findTestObject('Login_Page_Objects/Login_Button'))

WebUI.waitForElementPresent(findTestObject('Login_Page_Objects/Email_Password_Field'), 20)

WebUI.setText(findTestObject('Login_Page_Objects/Email_Input_Field'), email)

WebUI.setEncryptedText(findTestObject('Login_Page_Objects/Email_Password_Field'), 'Cqo1foBX0qbZ3A82kE6k0A==')

WebUI.click(findTestObject('Login_Page_Objects/Login_Submit_Button'))

WebUI.delay(15)

WebUI.doubleClick(findTestObject('Dashboard_Analytics/Dashboard_Configuration_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/Add_New_Button_Dashboard'))

WebUI.waitForElementPresent(findTestObject('Dashboard_Analytics/Dashboard_Title_Input'), 10)

WebUI.setText(findTestObject('Dashboard_Analytics/Dashboard_Title_Input'), 'New_Dashboard_Create')

WebUI.setText(findTestObject('Dashboard_Analytics/Input_Embeded_Id'), '96213a28-ce51-4746-aa6a-6c8dbe8aac8e')

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/Enable_RLS_Check_Box'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Dashboard_Analytics/RLS_Configuration'))

WebUI.setText(findTestObject('Dashboard_Analytics/RLS_Configuration'), '{ "partner_id": "{{partner_id}}" }')

WebUI.setText(findTestObject('Dashboard_Analytics/UI_Config_Clause'), '{ "hideTitle": true, "hideTab": true, "hideChartControls": true, "filters": { "visible": true, "expanded": false } }')

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/Create_Button_Dashboard'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Dashboard_Analytics/Membership_Plan_Menu_Option'), 5)

WebUI.click(findTestObject('Dashboard_Analytics/Membership_Plan_Menu_Option'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/RevPass_Membership_Plan_Edit_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/Genearl_Permision_Expand_DrpDwn'))

WebUI.click(findTestObject('Dashboard_Analytics/Checkbox_EngagementInsight_Permission'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Dashboard_Analytics/PE_Dashboard_Permission_CB'), 10)

WebUI.click(findTestObject('Dashboard_Analytics/PE_Dashboard_Permission_CB'))

WebUI.scrollToElement(findTestObject('Dashboard_Analytics/Update_Button_MB_Plan'), 10)

WebUI.click(findTestObject('Dashboard_Analytics/Update_Button_MB_Plan'))

WebUI.waitForElementPresent(findTestObject('Dashboard_Analytics/EngagementInsight_Menu'), 40)

WebUI.click(findTestObject('Dashboard_Analytics/EngagementInsight_Menu'))

WebUI.waitForElementClickable(findTestObject('Dashboard_Analytics/Partner_Selection_Drp_Dwn'), 30)

WebUI.click(findTestObject('Dashboard_Analytics/Partner_Selection_Drp_Dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/jkane_partner_selelction'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/Submit_Button'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(12)

WebUI.waitForElementPresent(findTestObject('Page_Parkengage/span_Operational Dashboard'), 10)

WebUI.click(findTestObject('Page_Parkengage/span_Operational Dashboard'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Parkengage/Detail Table'))

WebUI.delay(10)

WebUI.click(findTestObject('Dashboard_Analytics/LPR_Tab'))

WebUI.delay(8)

WebUI.click(findTestObject('Page_Parkengage/span_Operational Dashboard'))

WebUI.click(findTestObject('Page_Parkengage/Time_Period_Selection'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Parkengage/previous calendar week'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Parkengage/button_APPLY'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Parkengage/Apply filters'))

WebUI.delay(2)

WebUI.switchToWindowIndex(0)

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/Dashboard_Configuration_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/Delete_Dashborad_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('Dashboard_Analytics/Delete_Dashboard_CNF'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Dashboard_Analytics/Membership_Plan_Menu_Option'), 5)

WebUI.click(findTestObject('Dashboard_Analytics/Membership_Plan_Menu_Option'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/RevPass_Membership_Plan_Edit_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Analytics/Genearl_Permision_Expand_DrpDwn'))

WebUI.click(findTestObject('Dashboard_Analytics/Checkbox_EngagementInsight_Permission'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Dashboard_Analytics/Update_Button_MB_Plan'), 10)

WebUI.click(findTestObject('Dashboard_Analytics/Update_Button_MB_Plan'))

WebUI.delay(15)

WebUI.closeBrowser()

