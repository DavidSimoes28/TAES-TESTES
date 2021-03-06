package at4
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


class CheckDashboardAuth {
	@Given("I am at the Dashboard Authenticated")
	def at_dashboard_auth() {
		Mobile.startApplication('C:\\Users\\david\\Desktop\\TAES\\Projeto\\Sentinel\\app\\build\\outputs\\apk\\debug\\app-debug.apk',
				true)
		Mobile.tap(findTestObject('Button - Dashboard Login'), 0)
		Mobile.setText(findTestObject('EditText - Email Login'), '123@mail.com', 0)
		Mobile.setText(findTestObject('EditText - Password Login'), '123123', 0)
		Mobile.tapAndHold(findTestObject('Button - Login Login'), 0, 0)
	}

	@When("I can see if the {string} text exists")
	def text_exists(String string) {
		Mobile.tap(findTestObject('TextView - '+string), 0)
	}

	@And("I can see if the {string} dropdown exists")
	def dropdown_exists(String string) {
		Mobile.verifyElementExist(findTestObject('CheckedTextView - '+string), 0)
	}

	@When("I want to change the sensor")
	def change_sensor() {
		Mobile.tap(findTestObject('TextView - Global Dashboard Auth'), 0)
		Mobile.tap(findTestObject('TextView - Temperature Dashboard Auth'), 0)
		Mobile.tap(findTestObject('TextView - Humidity Dashboard Auth'), 0)

		Mobile.tap(findTestObject('CheckedTextView - Dashboard Auth'), 0)
		Mobile.tapAndHold(findTestObject('CheckedTextView - Sala 2'), 0, 0)
	}

	@Then("The values update")
	def verify_change() {
		Mobile.verifyNotEqual(findTestObject('TextView - Change'), findTestObject('TextView - Global Dashboard Auth'))
		Mobile.verifyNotEqual(findTestObject('TextView - Change Temp'), findTestObject('TextView - Temperature Dashboard Auth'))
		Mobile.verifyNotEqual(findTestObject('TextView - Change Hum'), findTestObject('TextView - Humidity Dashboard Auth'))
	}
}