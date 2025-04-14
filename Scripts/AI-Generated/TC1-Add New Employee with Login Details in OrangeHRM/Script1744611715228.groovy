import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to web/index.php/*/*"

TrueTestScripts.navigate("web/index.php/${index_php_id}/${path_param_4}")

"Step 2: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 3: Click on button add -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on button add - Navigate to page dynamic contentwebindexphp.png')

"Step 4: Click on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on input firstName.png')

"Step 5: Enter input value in input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_firstName'), input_firstName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Enter input value in input firstName.png')

"Step 6: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_lastName'), input_lastName)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Enter input value in input lastName.png')

"Step 7: Click on label createLoginDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/label_createLoginDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on label createLoginDetails.png')

"Step 8: Enter input value in input loginDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_loginDetails'), input_loginDetails)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Enter input value in input loginDetails.png')

"Step 9: Enter input value in input password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_password'), input_password)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Enter input value in input password.png')

"Step 10: Enter input value in input passwordDuplicate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_passwordDuplicate'), input_passwordDuplicate)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Enter input value in input passwordDuplicate.png')

"Step 11: Click on button saveFinal -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_saveFinal'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on button saveFinal - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Add New Employee with Login Details in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}