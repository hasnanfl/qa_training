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

WebUI.navigateToUrl('https://gitlab.com/users/sign_up/')

WebUI.click(findTestObject('Object Repository/TestRegisGitlab/Page_Sign up  GitLab/svg_Deprecations_s16 gl-icon gl-mx-3 gl-tex_9bcdbe'))

WebUI.click(findTestObject('Object Repository/TestRegisGitlab/Page_Sign up  GitLab/span_GitHub'))

WebUI.setText(findTestObject('Object Repository/TestRegisGitlab/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'hasnanfl')

WebUI.setEncryptedText(findTestObject('Object Repository/TestRegisGitlab/Page_Sign in to GitHub  GitHub/input_Password_password'), 
    'Ny2ZOf7Mi9kJjTx0ioHLqQ==')

WebUI.sendKeys(findTestObject('Object Repository/TestRegisGitlab/Page_Sign in to GitHub  GitHub/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

