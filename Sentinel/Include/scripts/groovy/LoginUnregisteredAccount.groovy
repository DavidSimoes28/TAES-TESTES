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


class LoginUnregisteredAccount {

	@Given("I am in the login page")
	def At_Login_Page() {
		Mobile.startApplication('C:\\Users\\david\\Desktop\\TAES\\Projeto\\Sentinel\\app\\build\\outputs\\apk\\debug\\app-debug.apk',
				true)

		Mobile.tap(findTestObject('AT2/android.widget.Button0 - LOGIN'), 0)
		Mobile.verifyElementExist(findTestObject('AT2/android.widget.FrameLayout0'), 0)
	}
	@And("I insert {string} in the email field")
	def Insert_Email(String email) {

		Mobile.setText(findTestObject('AT2/android.widget.EditText0'), email, 0)
	}

	@When("I insert {string} in the password field")
	def I_insert(String name) {
		Mobile.setText(findTestObject('AT2/android.widget.EditText0 (1)'), name, 0)
	}

	@Then("I click on the {string} button")
	def I_click_cancel_button_in_login_page(String name) {

		Mobile.tap(findTestObject('AT2/android.widget.Button0 - ' + name ), 0)

		Mobile.closeApplication()
	}

	@Then("I click in the {string} button")
	def I_click_button_in_login_page(String name) {

		Mobile.tap(findTestObject('AT2/android.widget.Button0 - ' + name + ' (1)'), 0)

		Mobile.closeApplication()
	}

}