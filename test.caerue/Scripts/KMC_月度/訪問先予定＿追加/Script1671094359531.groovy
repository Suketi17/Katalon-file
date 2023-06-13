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

WebUI.mouseOver(findTestObject('Folder_Gerenal/choose_work_location/勤怠管理'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/訪問先別勤務情報'))

WebUI.click(findTestObject('0_0Folder＿変更必要/勤務地名＿選択'))

WebUI.click(findTestObject('0_0Folder＿変更必要/ID_訪問先'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/employee_working_year'), '2022年', false)

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/employee_working_month'), '5月度', false)

//2021-5-8
WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_5-8'))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/勤務追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/出勤BOX'), '0600')

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/退勤BOX'), '0800')

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/必要人数'), '1')

WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_Save1'))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/NV追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), GlobalVariable.ID_employe)

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_Save2'))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/Next_day'))

WebUI.delay(1)

WebUI.click(findTestObject('Folder_Gerenal/訪問先/Next_day'))

WebUI.delay(1)

//2021-5-10
WebUI.click(findTestObject('Folder_Gerenal/訪問先/勤務追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/出勤BOX'), '0600')

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/退勤BOX'), '0800')

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/必要人数'), '1')

WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_Save1'))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/NV追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), GlobalVariable.ID_employe)

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_Save2'))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/Next_day'))

WebUI.delay(1)

//2021-5-11
WebUI.click(findTestObject('Folder_Gerenal/訪問先/勤務追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/出勤BOX'), '0600')

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/退勤BOX'), '0800')

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/必要人数'), '1')

WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_Save1'))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/NV追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), GlobalVariable.ID_employe)

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_Save2'))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/Back_HMSKbetushousai'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/employee_working_year'), '2023年', false)

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/employee_working_month'), '1月度', false)

WebUI.click(findTestObject('Folder_Gerenal/訪問先/2022-1-2(day)'))

//2022-1-2
WebUI.click(findTestObject('Folder_Gerenal/訪問先/勤務追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/出勤BOX'), '0600')

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/退勤BOX'), '0800')

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/必要人数'), '1')

WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_Save1'))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/NV追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), GlobalVariable.ID_employe)

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_Save2'))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/Next_day'))

WebUI.delay(1)

WebUI.click(findTestObject('Folder_Gerenal/訪問先/Next_day'))

WebUI.delay(1)

//2022-1-4
WebUI.click(findTestObject('Folder_Gerenal/訪問先/勤務追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/出勤BOX'), '0600')

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/退勤BOX'), '0800')

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/必要人数'), '1')

WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_Save1'))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/NV追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), GlobalVariable.ID_employe)

WebUI.sendKeys(findTestObject('Folder_Gerenal/訪問先/従業員ID＿BOX'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Folder_Gerenal/訪問先/HMSK_Save2'))

