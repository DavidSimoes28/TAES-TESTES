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

Mobile.tap(findTestObject('Button - Dashboard Login'), 0)

Mobile.setText(findTestObject('EditText - Email Login'), '123@mail.com', 0)

Mobile.setText(findTestObject('EditText - Password Login'), '123123', 0)

Mobile.tapAndHold(findTestObject('Button - Login Login'), 0, 0)

Mobile.tap(findTestObject('Button - Send Dashboard Auth'), 0)

Mobile.tap(findTestObject('Button - My Exposure Dashboard Auth'), 0)

Mobile.tap(findTestObject('Button - Logout Dashboard Auth'), 0)

Mobile.tap(findTestObject('Button - Favorite Dashboard Auth'), 0)

Mobile.tap(findTestObject('Button - Statistics Dashboard Auth'), 0)

Mobile.tap(findTestObject('Button - Share Dashboard Auth'), 0)

Mobile.verifyElementExist(findTestObject('TextView - Temperature Dashboard Auth'), 0)

Mobile.verifyElementExist(findTestObject('TextView - Humidity Dashboard Auth'), 0)

Mobile.verifyElementExist(findTestObject('TextView - Global Dashboard Auth'), 0)

Mobile.verifyElementExist(findTestObject('TextView - Data Dashboard Auth'), 0)

Mobile.verifyElementExist(findTestObject('CheckedTextView - Dashboard Auth'), 0)

Mobile.closeApplication()
