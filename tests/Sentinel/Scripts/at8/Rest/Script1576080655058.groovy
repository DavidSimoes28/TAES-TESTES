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

response1 = WS.sendRequest(findTestObject('SendRest/SendRest'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response1.getResponseBodyContent())

def value = result.Sensor1.valores

GlobalVariable.valores = value

boolean existe = false;
for (def index : GlobalVariable.valores) {
	println(index.toString().replace("{","").replace("}",""))
	String nome = index.toString().replace("{","").replace("}","")
	String[] v = nome.split(",")
	println(v[0])
	//String[] vdata = v[0].split("=")
	//println(vdata[2])
	
	String[] vhum = v[1].split("=")
	//println(vhum[1])
	
	String[] vtemp = v[2].split("=")
	//println(vtemp[1])

	if( vhum[1].equals("50") &&
		vtemp[1].equals("40") ){
		existe = true
		
	}
	
	//valores1=data=11/9/2018 22:00:00, humidade=40, temperatura=16
	//def nome = LazyMap().put("123",index)
	//println(nome)
	//def res = slurper.parseText(index.toString())
	//println(index.valores1.humidade)

}

if(existe){
   println("Registo encontrado")
}else{
   println("Registo não encontrado")
}