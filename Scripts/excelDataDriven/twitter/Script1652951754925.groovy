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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://twitter.com/')

WebUI.click(findTestObject('Object Repository/twitter/Page_Twitter. Semua yang sedang terjadi  Twitter/span_Daftar dengan nomor telepon atau email'))

WebUI.setText(findTestObject('Object Repository/twitter/Page_Daftar ke Twitter  Twitter/input_Nama_name'), nama)

WebUI.click(findTestObject('Object Repository/twitter/Page_Daftar ke Twitter  Twitter/div_Telepon_css-1dbjc4n r-18u37iz r-16y2uox_e1ab7b'))

WebUI.setText(findTestObject('Object Repository/twitter/Page_Daftar ke Twitter  Twitter/input_Telepon_phone_number'), nohp)

WebUI.selectOptionByValue(findTestObject('Object Repository/twitter/Page_Daftar ke Twitter  Twitter/select_JanuariFebruariMaretAprilMeiJuniJuli_13de9b'), 
    bulan, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/twitter/Page_Daftar ke Twitter  Twitter/select_123456789101112131415161718192021222_566da4'), 
    tanggal, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/twitter/Page_Daftar ke Twitter  Twitter/select_202220212020201920182017201620152014_d959b4'), 
    tahun, true)

WebUI.click(findTestObject('Object Repository/twitter/Page_Daftar ke Twitter  Twitter/span_Berikutnya'))

WebUI.closeBrowser()

