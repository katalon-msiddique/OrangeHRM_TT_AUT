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

"Step 2: Click on link viewAdmin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_viewAdmin'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on link viewAdmin.png')

"Step 3: Click on i object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object4'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on i object4.png')

"Step 4: Click on link emailConfiguration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_emailConfiguration'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link emailConfiguration.png')

"Step 5: Click on button reset"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_reset'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on button reset.png')

"Step 6: Click on item configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/item_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on item configuration.png')

"Step 7: Click on link emailSubscriptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_emailSubscriptions'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on link emailSubscriptions.png')

"Step 8: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on label object.png')

"Step 9: Click on label dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/label_dynamicObject', ['label_dynamicObject_nth': label_dynamicObject_nth]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on label dynamicObject object2.png')

"Step 10: Click on label dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/label_dynamicObject', ['label_dynamicObject_nth': label_dynamicObject_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on label dynamicObject object3.png')

"Step 11: Click on div tableCellActions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_tableCellActions'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on div tableCellActions.png')

"Step 12: Click on label dynamicObject (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/label_dynamicObject', ['label_dynamicObject_nth': label_dynamicObject_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on label dynamicObject object4.png')

"Step 13: Click on label dynamicObject (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/label_dynamicObject', ['label_dynamicObject_nth': label_dynamicObject_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on label dynamicObject object5.png')

"Step 14: Click on i configurationIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_configurationIcon'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on i configurationIcon.png')

"Step 15: Click on link localization -> Navigate to page 'dynamic content#web/index.php/*/localization'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_localization'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on link localization - Navigate to page dynamic contentwebindexphplocalization.png')

"Step 16: Click on button save4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/localization?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save4'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on button save4.png')

"Step 17: Click on item configuration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/localization?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/item_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on item configuration2.png')

"Step 18: Click on list emailConfiguration -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/localization?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/list_emailConfiguration'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on list emailConfiguration - Navigate to page dynamic contentwebindexphp.png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Configure Email Settings in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}