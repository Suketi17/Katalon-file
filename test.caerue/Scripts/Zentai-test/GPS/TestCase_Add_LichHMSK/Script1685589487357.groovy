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

//Check List
WebUI.mouseOver(findTestObject('勤怠管理/0-勤怠管理'))

WebUI.click(findTestObject('勤怠管理/5-訪問先別勤務情報'))

WebUI.click(findTestObject('ZenTai-変更必要/Add lich houmonsaki/Add 訪問'))

WebUI.click(findTestObject('ZenTai-変更必要/Add lich houmonsaki/勤務追加'))

WebUI.sendKeys(findTestObject('ZenTai-変更必要/Add lich houmonsaki/出勤BOX'), '0900')

WebUI.sendKeys(findTestObject('ZenTai-変更必要/Add lich houmonsaki/退勤BOX'), '1500')

WebUI.sendKeys(findTestObject('ZenTai-変更必要/Add lich houmonsaki/必要人数'), '1')

WebUI.click(findTestObject('ZenTai-変更必要/Add lich houmonsaki/HMSK_Save1'))

WebUI.click(findTestObject('ZenTai-変更必要/Add lich houmonsaki/NV追加'))

WebUI.sendKeys(findTestObject('ZenTai-変更必要/Add lich houmonsaki/従業員ID＿BOX'), GlobalVariable.Zentai_ID_NV)

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ZenTai-変更必要/Add lich houmonsaki/HMSK_Save2'))

WebUI.delay(2)

assert true

