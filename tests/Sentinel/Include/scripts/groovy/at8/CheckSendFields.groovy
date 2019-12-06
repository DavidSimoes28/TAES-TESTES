package at8
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class CheckSendFields {


	@Given("I am at the send page")
	def I_am_at_send_page() {
		Mobile.startApplication('C:\\Users\\mathe\\Desktop\\Escola\\Ano3S1\\ProjAtv\\Sentinel\\app\\build\\outputs\\apk\\debug\\app-debug.apk',
				true)

		Mobile.tap(findTestObject('at8/android.widget.Button0 - LOGIN (2)'), 0)

		Mobile.setText(findTestObject('at8/android.widget.EditText0 (2)'), '123@mail.com', 0)

		Mobile.setText(findTestObject('at8/android.widget.EditText0 (3)'), '123123', 0)

		Mobile.tapAndHold(findTestObject('at8/android.widget.Button0 - LOGIN (3)'), 0, 0)

		Mobile.tap(findTestObject('at8/android.widget.Button0 - SEND (1)'), 0)
	}
	
	@And("I can see if the temperatura, humidade and temperatura field exists")
	def Check_all_fields(){
		Mobile.verifyElementExist(findTestObject('at8/android.widget.EditText0 (4)'), 0)
		
		Mobile.verifyElementExist(findTestObject('at8/android.widget.EditText0 (5)'), 0)
		
		Mobile.verifyElementExist(findTestObject('at8/android.widget.EditText0 (6)'), 0)
	}
	
}