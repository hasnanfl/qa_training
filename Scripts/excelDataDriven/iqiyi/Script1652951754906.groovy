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

WebUI.navigateToUrl('https://www.iq.com/?lang=en_us')

WebUI.click(findTestObject('Object Repository/iqiyi/Page_iQiyi - Nonton drama Asia, film, anime_f81ce9/svg_Member login'))

WebUI.click(findTestObject('Object Repository/iqiyi/Page_iQiyi - Nonton drama Asia, film, anime_f81ce9/span_Daftar'))

WebUI.click(findTestObject('Object Repository/iqiyi/Page_iQiyi - Nonton drama Asia, film, anime_f81ce9/div_Pakai akun SMS daftar'))

WebUI.click(findTestObject('Object Repository/iqiyi/Page_iQiyi - Nonton drama Asia, film, anime_f81ce9/svg'))

WebUI.click(findTestObject('Object Repository/iqiyi/Page_iQiyi - Nonton drama Asia, film, anime_f81ce9/div_62 Indonesia'))

WebUI.setText(findTestObject('Object Repository/iqiyi/Page_iQiyi - Nonton drama Asia, film, anime_f81ce9/input_Kebijakan Privasi iQIYI_passport-inpu_6c5f26'), 
    nohp)

WebUI.click(findTestObject('Object Repository/iqiyi/Page_iQiyi - Nonton drama Asia, film, anime_f81ce9/div_Lanjutkan'))

WebUI.closeBrowser()

