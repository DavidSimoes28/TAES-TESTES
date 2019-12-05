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

Mobile.startApplication('C:\\Users\\mathe\\Desktop\\Escola\\Ano3S1\\ProjAtv\\Sentinel\\app\\build\\outputs\\apk\\debug\\app-debug.apk', 
    true)

Mobile.tap(findTestObject('at8/android.widget.Button0 - LOGIN (8)'), 0)

Mobile.setText(findTestObject('at8/android.widget.EditText0 (11)'), '123@mail.com', 0)

Mobile.setText(findTestObject('at8/android.widget.EditText0 (12)'), '123123', 0)

Mobile.tapAndHold(findTestObject('at8/android.widget.Button0 - LOGIN (9)'), 0, 0)

Mobile.tap(findTestObject('at8/android.widget.Button0 - SEND (6)'), 0)

Mobile.setText(findTestObject('at8/android.widget.EditText0 (13)'), 'Sala A1.2A', 0)

Mobile.setText(findTestObject('at8/android.widget.EditText0 (14)'), '20', 0)

Mobile.setText(findTestObject('at8/android.widget.EditText0 (15)'), '50', 0)

Mobile.tapAndHold(findTestObject('at8/android.widget.Button0 - SEND (7)'), 0, 0)

Mobile.closeApplication()

