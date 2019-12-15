package at14
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


class DeactivateAccount {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am at the Profile Page with user {string}")
	def profile_page_deactivate(String email) {
		Mobile.startApplication('C:\\Users\\david\\Desktop\\TAES\\Projeto\\Sentinel\\app\\build\\outputs\\apk\\debug\\app-debug.apk', true)

		Mobile.tapAndHold(findTestObject('Button - Dashboard Login'), 0, 0)

		Mobile.setText(findTestObject('EditText - Email Login'), email, 0)

		Mobile.setText(findTestObject('EditText - Password Login'), '123123', 0)

		Mobile.tapAndHold(findTestObject('Button - Login Login'), 0, 0)

		Mobile.switchToPortrait()

		Mobile.tap(findTestObject('Button - Profile Dashboard Auth'), 0)
	}

	@When("I return back to the Dashboard to login")
	def try_to_login_page() {
		Mobile.tapAndHold(findTestObject('Button - Dashboard Login'), 0, 0)
	}

	@Then("I can't login")
	def I_verify_the_status_in_step() {
		Mobile.setText(findTestObject('EditText - Email Login'), '1234@mail.com', 0)
		Mobile.setText(findTestObject('EditText - Password Login'), '123123', 0)
		Mobile.tapAndHold(findTestObject('Button - Login Login'), 0, 0)
	}
}