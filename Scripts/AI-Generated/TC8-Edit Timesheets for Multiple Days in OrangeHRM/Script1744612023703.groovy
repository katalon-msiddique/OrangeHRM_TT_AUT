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

"Step 2: Click on link time"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_time'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on link time.png')

"Step 3: Click on span timesheets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/span_timesheets'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on span timesheets.png')

"Step 4: Click on link myTimesheets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_myTimesheets'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link myTimesheets.png')

"Step 5: Click on i icon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on i icon.png')

"Step 6: Click on div today"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_today'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on div today.png')

"Step 7: Click on button edit -> Navigate to page 'dynamic content#web/index.php/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_edit'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on button edit - Navigate to page dynamic contentwebindexphp.png')

"Step 8: Enter input value in input project"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_project'), input_project)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Enter input value in input project.png')

"Step 9: Click on div projectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_projectOption'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on div projectOption.png')

"Step 10: Click on div activitySelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_activitySelect'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on div activitySelect.png')

"Step 11: Click on div activityOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_activityOption'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on div activityOption.png')

"Step 12: Enter input value in input  14Mon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input__14Mon'), input__14Mon)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Enter input value in input  14Mon.png')

"Step 13: Enter input value in input  16Wed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input__16Wed'), input__16Wed)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Enter input value in input  16Wed.png')

"Step 14: Enter input value in input  17Thu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input__17Thu'), input__17Thu)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Enter input value in input  17Thu.png')

"Step 15: Enter input value in input  18Fri"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input__18Fri'), input__18Fri)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Enter input value in input  18Fri.png')

"Step 16: Enter input value in input  19Sat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input__19Sat'), input__19Sat)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Enter input value in input  19Sat.png')

"Step 17: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on button save.png')

"Step 18: Click on button saveDuplicate -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_saveDuplicate'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on button saveDuplicate - Navigate to page dynamic contentwebindexphp.png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Edit Timesheets for Multiple Days in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}