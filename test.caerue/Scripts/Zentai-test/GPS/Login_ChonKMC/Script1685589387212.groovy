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

WebUI.openBrowser('test-newgps.caeru.biz/vitz')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Folder_Gerenal/Login_Logout/ID_Input'), 'admin')

WebUI.sendKeys(findTestObject('Folder_Gerenal/Login_Logout/Pass_Input'), '1')

WebUI.click(findTestObject('Folder_Gerenal/Login_Logout/Login_click'))

WebUI.mouseOver(findTestObject('勤怠管理/0-勤怠管理'))

WebUI.click(findTestObject('勤怠管理/1-勤怠データ管理'))

WebUI.click(findTestObject('ZenTai-変更必要/勤務地名＿選択-Zentai'))

