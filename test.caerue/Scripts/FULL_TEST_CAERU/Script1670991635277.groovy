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

WebUI.callTestCase(findTestCase('KMC_月度/login1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('KMC_月度/訪問先予定＿追加'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('KMC_月度/choose_work_location_2021'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2021-2022/Lich-05月'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2021-2022/Lich-06月'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2021-2022/Lich-07月'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2021-2022/Lich-08月'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2021-2022/Lich-09月'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2021-2022/Lich-10月'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2021-2022/Lich-11月'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2021-2022/Lich-12月'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2021-2022/Lich-furikae01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2021-2022/Lich-furikae02'), [:], FailureHandling.STOP_ON_FAILURE)

