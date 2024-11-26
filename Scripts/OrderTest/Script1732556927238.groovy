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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startApplication('C:\\Users\\duong\\AndroidStudioProjects\\Food_App\\app\\build\\outputs\\apk\\debug\\app-debug.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SIGN IN'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Email'), 'duongtx2@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password'), '123456', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('android.widget.FrameLayout (1)'), 0)

Mobile.scrollToText('Giỏ Hàng')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - GI HNG'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - t hng'), 0)

Mobile.clearText(findTestObject('Object Repository/android.widget.EditText - Duong Trinh'), 0)

Mobile.clearText(findTestObject('Object Repository/android.widget.EditText - 098998'), 0)

Mobile.clearText(findTestObject('Object Repository/android.widget.EditText - Binh Duong'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Nhp tn ca bn'), name, 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Nhp s in thoi'), phone, 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Nhp a ch giao hng'), address, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Confirm'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath(('//android.widget.Toast[@text=\'' + message) + '\']')

if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

WebUI.delay(5)

Mobile.closeApplication()

