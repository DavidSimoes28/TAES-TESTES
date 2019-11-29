package at3
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


class CheckRegisterPage {
	@Given("I am at the register page")
	def Check_Dashboard_Page() {
		Mobile.startApplication('C:\\Users\\david\\Desktop\\TAES\\Projeto\\Sentinel\\app\\build\\outputs\\apk\\debug\\app-debug.apk',
				true)
		Mobile.tap(findTestObject('at3/android.widget.Button0 - REGISTER'), 0)
	}

	@And("I click the {string} button")
	def I_click_the_register_button_dashboard(String name) {
		Mobile.tap(findTestObject('at3/android.widget.Button0 - ' + name), 0)
	}

	@Then("I return back to the dashboard")
	def I_return_back_to_the_dashboard() {
		Mobile.closeApplication()
	}

	@And("i can see if the email field exists")
	def email_field_exists() {
		Mobile.verifyElementExist(findTestObject('at3/android.widget.EditText0'), 0)
	}

	@And("i can see if password confirmation field exists")
	def password_confirmation_field_exists() {
		Mobile.verifyElementExist(findTestObject('at3/android.widget.EditText0 (2)'), 0)
	}

	@And("i can see if the password field exists")
	def password_field_exists() {
		Mobile.verifyElementExist(findTestObject('at3/android.widget.EditText0 (1)'), 0)
	}

	@And("i can see if register button exists")
	def register_button_exists() {
		Mobile.verifyElementExist(findTestObject('at3/android.widget.Button0 - REGISTER (1)'), 0)
	}

	@Then("i can see if the cancel button exists")
	def cancel_button_exists() {
		Mobile.verifyElementExist(findTestObject('at3/android.widget.Button0 - CANCELAR'), 0)
		Mobile.closeApplication()
	}
}