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

WebUI.navigateToUrl('https://demoqa.com/webtables')

WebUI.click(findTestObject('Object Repository/Variables/Page_ToolsQA/button_Add'))

WebUI.setText(findTestObject('Object Repository/Variables/Page_ToolsQA/input_First Name_firstName'), 'Juan')

WebUI.click(findTestObject('Object Repository/Variables/Page_ToolsQA/input_Last Name_lastName'))

WebUI.setText(findTestObject('Object Repository/Variables/Page_ToolsQA/input_Last Name_lastName'), 'Perez')

WebUI.setText(findTestObject('Object Repository/Variables/Page_ToolsQA/input_Email_userEmail'), 'juan@gmail.com')

WebUI.setText(findTestObject('Object Repository/Variables/Page_ToolsQA/input_Age_age'), '22')

WebUI.setText(findTestObject('Object Repository/Variables/Page_ToolsQA/input_Salary_salary'), '35000')

WebUI.setText(findTestObject('Object Repository/Variables/Page_ToolsQA/input_Department_department'), 'Informatica')

WebUI.rightClick(findTestObject('Object Repository/Variables/Page_ToolsQA/input_Department_department'))

WebUI.click(findTestObject('Object Repository/Variables/Page_ToolsQA/div_Submit'))

WebUI.setText(findTestObject('Object Repository/Variables/Page_ToolsQA/input_Department_department'), 'Informática')

WebUI.click(findTestObject('Object Repository/Variables/Page_ToolsQA/div_Submit'))

WebUI.click(findTestObject('Object Repository/Variables/Page_ToolsQA/button_Submit'))

WebUI.closeBrowser()

