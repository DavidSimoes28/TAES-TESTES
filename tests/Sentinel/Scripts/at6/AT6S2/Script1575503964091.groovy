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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\david\\Desktop\\TAES\\Projeto\\Sentinel\\app\\build\\outputs\\apk\\debug\\app-debug.apk', 
    true)

Mobile.tapAndHold(findTestObject('Button - Dashboard Login'), 0, 0)

Mobile.setText(findTestObject('EditText - Email Login'), '123@mail.com', 0)

Mobile.setText(findTestObject('EditText - Password Login'), '123123', 0)

Mobile.tapAndHold(findTestObject('Button - Login Login'), 0, 0)

Mobile.tapAndHold(findTestObject('Button - Share Dashboard Auth'), 0, 0)

Mobile.tap(findTestObject('WebView - To Load'), 0)

Mobile.tap(findTestObject('Button - Tweet Twitter'), 0)

Mobile.tap(findTestObject('ImageButton - To Load'), 0)

Mobile.tap(findTestObject('View - View Tweet'), 0)

Mobile.verifyElementExist(findTestObject('View - View Tweet Detail'), 0)

Mobile.closeApplication()

