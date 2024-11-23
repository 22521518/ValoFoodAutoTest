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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startApplication('C:\\Users\\duong\\AndroidStudioProjects\\Food_App\\app\\build\\outputs\\apk\\debug\\app-debug.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SIGN IN'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Email'), 'duongminhhien14@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password'), '123456', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Bnh lun'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Tiu'), title, 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - im (0-10)'), score, 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Vit trn 100 t, ng chnh t, ngn t vn ha  c im thng'), 
    content, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Gi'), 0)
AppiumDriver<?> driver = MobileDriverFactory.getDriver()
def toast = driver.findElementByXPath("//android.widget.Toast[@text='"+message+"']")

if (toast == null) {
	KeywordUtil.markFailed('ERROR: Toast object not found!')
}
WebUI.delay(3)
Mobile.closeApplication()

