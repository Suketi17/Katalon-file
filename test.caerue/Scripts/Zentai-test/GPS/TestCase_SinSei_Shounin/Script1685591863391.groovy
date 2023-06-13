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

WebUI.openBrowser('test-newgps.caeru.biz/vitz/sinsei')

WebUI.acceptAlert()

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Folder_Gerenal/Login_Logout/ID_Input'), '1005')

WebUI.sendKeys(findTestObject('Folder_Gerenal/Login_Logout/Pass_Input'), '1')

WebUI.click(findTestObject('Folder_Gerenal/Login_Logout/Login_click'))

WebUI.click(findTestObject('ZenTai-変更必要/Sinsei_Display/Next_Month'))

WebUI.click(findTestObject('ZenTai-変更必要/Sinsei_Display/Day1'))

WebUI.selectOptionByLabel(findTestObject(null), '時有', false)

WebUI.sendKeys(findTestObject('ZenTai-変更必要/Sinsei_Display/Jikyuu_IN'), '0900')

WebUI.sendKeys(findTestObject('ZenTai-変更必要/Sinsei_Display/Jikyuu_OUT'), '1100')

WebUI.click(findTestObject('ZenTai-変更必要/Sinsei_Display/申請ボタン'))

WebUI.openBrowser('test-newgps.caeru.biz/vitz/')

WebUI.callTestCase(findTestCase('Zentai-test/GPS/Login_ChonKMC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ZenTai-変更必要/ID_NV'))

WebUI.click(findTestObject('ZenTai-変更必要/Sinsei_Display/Next_Month'))

WebUI.click(findTestObject('ZenTai-変更必要/Sinsei_Display/Sinsei_個人別右上'))

WebUI.click(findTestObject('ZenTai-変更必要/Sinsei_Display/承認ボタン'))

WebUI.click(findTestObject('ZenTai-変更必要/Sinsei_Display/個人別詳細＿戻る'))
