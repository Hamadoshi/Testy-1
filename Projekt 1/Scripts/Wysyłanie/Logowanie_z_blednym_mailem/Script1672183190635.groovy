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

/*launching browser*/

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.delay(2)

/*consenting cookies*/

WebUI.click(findTestObject('Object Repository/Register_Page/btn_cookies'))

WebUI.delay(1)

/*launching login option*/

WebUI.click(findTestObject('Object Repository/Page_main/lnk_login'))

/*setting firstname*/

WebUI.setText(findTestObject('Object Repository/Register_Page/inp_firstname'), firstname)

/*setting surname*/

WebUI.setText(findTestObject('Object Repository/Register_Page/inp_surname'), surname)

/*setting mail*/

WebUI.setText(findTestObject('Object Repository/Register_Page/inp_mail'), mail)

/*setting password*/

WebUI.setEncryptedText(findTestObject('Object Repository/Register_Page/inp_password'), password)

/*setting repeat password*/

WebUI.setEncryptedText(findTestObject('Object Repository/Register_Page/inp_rep_password'), password)

/*agreeing to terms of services*/

WebUI.check(findTestObject('Object Repository/Register_Page/inp_reg'))

/*registering*/

WebUI.click(findTestObject('Object Repository/Register_Page/btn_register'))

/*checking error msg*/

String el_err_msg = WebUI.getText(findTestObject('Object Repository/Register_Page/err_mess'))

assert error == el_err_msg

/*closing browser*/

WebUI.closeBrowser()