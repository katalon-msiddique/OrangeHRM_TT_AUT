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

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 3: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Enter input value in input typeForHints.png')

"Step 4: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on button search.png')

"Step 5: Click on div dynamicContent (code0218) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on div dynamicContent code0218 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 6: Click on link viewSalary -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link viewSalary - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 7: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button add2.png')

"Step 8: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Enter input value in input object.png')

"Step 9: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on i object.png')

"Step 10: Click on div grade4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade4'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on div grade4.png')

"Step 11: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on i object2.png')

"Step 12: Click on div weekly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_weekly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on div weekly.png')

"Step 13: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on i object3.png')

"Step 14: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on div usd.png')

"Step 15: Enter input value in input amountRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange'), input_amountRange)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Enter input value in input amountRange.png')

"Step 16: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Enter input value in textarea object.png')

"Step 17: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on button save3.png')

"Step 18: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 19: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Enter input value in input typeForHints.png')

"Step 20: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Click on button search.png')

"Step 21: Click on div dynamicContent (code0219) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Click on div dynamicContent code0219 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 22: Click on link viewSalary2 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Click on link viewSalary2 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 23: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Click on button add2.png')

"Step 24: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Enter input value in input object.png')

"Step 25: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Click on i object.png')

"Step 26: Click on div grade5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Click on div grade5.png')

"Step 27: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Click on i object2.png')

"Step 28: Click on div monthly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_monthly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Click on div monthly.png')

"Step 29: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 29-Click on i object3.png')

"Step 30: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 30-Click on div usd.png')

"Step 31: Enter input value in input amountRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange2'), input_amountRange2)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 31-Enter input value in input amountRange2.png')

"Step 32: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 32-Enter input value in textarea object.png')

"Step 33: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 33-Click on button save3.png')

"Step 34: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 34-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 35: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_2)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 35-Enter input value in input typeForHints.png')

"Step 36: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 36-Click on button search.png')

"Step 37: Click on div dynamicContent (code0220) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 37-Click on div dynamicContent code0220 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 38: Click on link viewSalary3 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 38-Click on link viewSalary3 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 39: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 39-Click on button add2.png')

"Step 40: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_2)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 40-Enter input value in input object.png')

"Step 41: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 41-Click on i object.png')

"Step 42: Click on div grade6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade6'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 42-Click on div grade6.png')

"Step 43: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 43-Click on i object2.png')

"Step 44: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 44-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 45: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_3)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 45-Enter input value in input typeForHints.png')

"Step 46: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 46-Click on button search.png')

"Step 47: Click on div dynamicContent (code0221) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 47-Click on div dynamicContent code0221 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 48: Click on link viewSalary4 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary4'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 48-Click on link viewSalary4 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 49: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 49-Click on button add2.png')

"Step 50: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_3)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 50-Enter input value in input object.png')

"Step 51: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 51-Click on i object.png')

"Step 52: Click on div grade7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade7'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 52-Click on div grade7.png')

"Step 53: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 53-Click on i object2.png')

"Step 54: Click on div weekly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_weekly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 54-Click on div weekly.png')

"Step 55: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 55-Click on i object3.png')

"Step 56: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 56-Click on div usd.png')

"Step 57: Enter input value in input amountRange3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange3'), input_amountRange3)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 57-Enter input value in input amountRange3.png')

"Step 58: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_2)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 58-Enter input value in textarea object.png')

"Step 59: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 59-Click on button save3.png')

"Step 60: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 60-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 61: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_4)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 61-Enter input value in input typeForHints.png')

"Step 62: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 62-Click on button search.png')

"Step 63: Click on div dynamicContent (code0222) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 63-Click on div dynamicContent code0222 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 64: Click on link viewSalary5 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 64-Click on link viewSalary5 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 65: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 65-Click on button add2.png')

"Step 66: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_4)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 66-Enter input value in input object.png')

"Step 67: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 67-Click on i object.png')

"Step 68: Click on div grade6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade6'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 68-Click on div grade6.png')

"Step 69: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 69-Click on i object2.png')

"Step 70: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 70-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 71: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_5)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 71-Enter input value in input typeForHints.png')

"Step 72: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 72-Click on button search.png')

"Step 73: Click on div dynamicContent (code0223) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 73-Click on div dynamicContent code0223 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 74: Click on link viewSalary6 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary6'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 74-Click on link viewSalary6 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 75: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 75-Click on button add2.png')

"Step 76: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_5)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 76-Enter input value in input object.png')

"Step 77: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 77-Click on i object.png')

"Step 78: Click on div grade3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 78-Click on div grade3.png')

"Step 79: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 79-Click on i object2.png')

"Step 80: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 80-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 81: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_6)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 81-Enter input value in input typeForHints.png')

"Step 82: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 82-Click on button search.png')

"Step 83: Click on div dynamicContent (code0224) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 83-Click on div dynamicContent code0224 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 84: Click on link viewSalary7 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary7'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 84-Click on link viewSalary7 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 85: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 85-Click on button add2.png')

"Step 86: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_6)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 86-Enter input value in input object.png')

"Step 87: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 87-Click on i object.png')

"Step 88: Click on div grade3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 88-Click on div grade3.png')

"Step 89: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 89-Click on i object2.png')

"Step 90: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 90-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 91: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_7)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 91-Enter input value in input typeForHints.png')

"Step 92: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 92-Click on button search.png')

"Step 93: Click on div dynamicContent (code0225) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 93-Click on div dynamicContent code0225 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 94: Click on link viewSalary8 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary8'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 94-Click on link viewSalary8 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 95: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 95-Click on button add2.png')

"Step 96: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_7)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 96-Enter input value in input object.png')

"Step 97: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 97-Click on i object.png')

"Step 98: Click on div grade7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade7'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 98-Click on div grade7.png')

"Step 99: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 99-Click on i object2.png')

"Step 100: Click on div monthly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_monthly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 100-Click on div monthly.png')

"Step 101: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 101-Click on i object3.png')

"Step 102: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 102-Click on div usd.png')

"Step 103: Enter input value in input amountRange3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange3'), input_amountRange3_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 103-Enter input value in input amountRange3.png')

"Step 104: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_3)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 104-Enter input value in textarea object.png')

"Step 105: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 105-Click on button save3.png')

"Step 106: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 106-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 107: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_8)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 107-Enter input value in input typeForHints.png')

"Step 108: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 108-Click on button search.png')

"Step 109: Click on div dynamicContent (code0226) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 109-Click on div dynamicContent code0226 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 110: Click on link viewSalary9 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary9'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 110-Click on link viewSalary9 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 111: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 111-Click on button add2.png')

"Step 112: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_8)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 112-Enter input value in input object.png')

"Step 113: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 113-Click on i object.png')

"Step 114: Click on div grade8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade8'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 114-Click on div grade8.png')

"Step 115: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 115-Click on i object2.png')

"Step 116: Click on div weekly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_weekly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 116-Click on div weekly.png')

"Step 117: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 117-Click on i object3.png')

"Step 118: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 118-Click on div usd.png')

"Step 119: Enter input value in input amountRange4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange4'), input_amountRange4)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 119-Enter input value in input amountRange4.png')

"Step 120: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_4)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 120-Enter input value in textarea object.png')

"Step 121: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 121-Click on button save3.png')

"Step 122: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 122-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 123: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_9)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 123-Enter input value in input typeForHints.png')

"Step 124: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 124-Click on button search.png')

"Step 125: Click on div dynamicContent (code0227) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 125-Click on div dynamicContent code0227 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 126: Click on link viewSalary10 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary10'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 126-Click on link viewSalary10 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 127: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 127-Click on button add2.png')

"Step 128: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_9)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 128-Enter input value in input object.png')

"Step 129: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 129-Click on i object.png')

"Step 130: Click on div grade3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 130-Click on div grade3.png')

"Step 131: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 131-Click on i object2.png')

"Step 132: Click on div weekly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_weekly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 132-Click on div weekly.png')

"Step 133: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 133-Click on i object3.png')

"Step 134: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 134-Click on div usd.png')

"Step 135: Enter input value in input amountRange5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange5'), input_amountRange5)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 135-Enter input value in input amountRange5.png')

"Step 136: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_5)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 136-Enter input value in textarea object.png')

"Step 137: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 137-Click on button save3.png')

"Step 138: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 138-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 139: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_10)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 139-Enter input value in input typeForHints.png')

"Step 140: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 140-Click on button search.png')

"Step 141: Click on div dynamicContent (code0228) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 141-Click on div dynamicContent code0228 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 142: Click on link viewSalary11 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary11'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 142-Click on link viewSalary11 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 143: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 143-Click on button add2.png')

"Step 144: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_10)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 144-Enter input value in input object.png')

"Step 145: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 145-Click on i object.png')

"Step 146: Click on div grade1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade1'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 146-Click on div grade1.png')

"Step 147: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 147-Click on i object2.png')

"Step 148: Click on div weekly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_weekly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 148-Click on div weekly.png')

"Step 149: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 149-Click on i object3.png')

"Step 150: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 150-Click on div usd.png')

"Step 151: Enter input value in input amountRange6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange6'), input_amountRange6)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 151-Enter input value in input amountRange6.png')

"Step 152: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_6)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 152-Enter input value in textarea object.png')

"Step 153: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 153-Click on button save3.png')

"Step 154: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 154-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 155: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_11)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 155-Enter input value in input typeForHints.png')

"Step 156: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 156-Click on button search.png')

"Step 157: Click on div dynamicContent (employeeNumber) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 157-Click on div dynamicContent employeeNumber - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 158: Click on link viewSalary12 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary12'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 158-Click on link viewSalary12 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 159: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 159-Click on button add2.png')

"Step 160: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_11)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 160-Enter input value in input object.png')

"Step 161: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 161-Click on i object.png')

"Step 162: Click on div grade2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 162-Click on div grade2.png')

"Step 163: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 163-Click on i object2.png')

"Step 164: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 164-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 165: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_12)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 165-Enter input value in input typeForHints.png')

"Step 166: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 166-Click on button search.png')

"Step 167: Click on div dynamicContent (employeeNumber2) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 167-Click on div dynamicContent employeeNumber2 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 168: Click on link viewSalary13 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary13'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 168-Click on link viewSalary13 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 169: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 169-Click on button add2.png')

"Step 170: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_12)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 170-Enter input value in input object.png')

"Step 171: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 171-Click on i object.png')

"Step 172: Click on div grade5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 172-Click on div grade5.png')

"Step 173: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 173-Click on i object2.png')

"Step 174: Click on div weekly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_weekly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 174-Click on div weekly.png')

"Step 175: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 175-Click on i object3.png')

"Step 176: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 176-Click on div usd.png')

"Step 177: Enter input value in input amountRange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange2'), input_amountRange2_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 177-Enter input value in input amountRange2.png')

"Step 178: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_7)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 178-Enter input value in textarea object.png')

"Step 179: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 179-Click on button save3.png')

"Step 180: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 180-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 181: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_13)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 181-Enter input value in input typeForHints.png')

"Step 182: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 182-Click on button search.png')

"Step 183: Click on div dynamicContent (employeeNumber3) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 183-Click on div dynamicContent employeeNumber3 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 184: Click on link viewSalary14 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary14'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 184-Click on link viewSalary14 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 185: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 185-Click on button add2.png')

"Step 186: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_13)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 186-Enter input value in input object.png')

"Step 187: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 187-Click on i object.png')

"Step 188: Click on div grade3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 188-Click on div grade3.png')

"Step 189: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 189-Click on i object2.png')

"Step 190: Click on div weekly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_weekly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 190-Click on div weekly.png')

"Step 191: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 191-Click on i object3.png')

"Step 192: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 192-Click on div usd.png')

"Step 193: Enter input value in input amountRange5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange5'), input_amountRange5_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 193-Enter input value in input amountRange5.png')

"Step 194: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_8)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 194-Enter input value in textarea object.png')

"Step 195: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 195-Click on button save3.png')

"Step 196: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 196-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 197: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_14)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 197-Enter input value in input typeForHints.png')

"Step 198: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 198-Click on button search.png')

"Step 199: Click on div dynamicContent (employeeNumber4) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 199-Click on div dynamicContent employeeNumber4 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 200: Click on link viewSalary15 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary15'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 200-Click on link viewSalary15 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 201: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 201-Click on button add2.png')

"Step 202: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_14)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 202-Enter input value in input object.png')

"Step 203: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 203-Click on i object.png')

"Step 204: Click on div grade1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade1'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 204-Click on div grade1.png')

"Step 205: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 205-Click on i object2.png')

"Step 206: Click on div monthly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_monthly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 206-Click on div monthly.png')

"Step 207: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 207-Click on i object3.png')

"Step 208: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 208-Click on div usd.png')

"Step 209: Enter input value in input amountRange6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange6'), input_amountRange6_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 209-Enter input value in input amountRange6.png')

"Step 210: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_9)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 210-Enter input value in textarea object.png')

"Step 211: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 211-Click on button save3.png')

"Step 212: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 212-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 213: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_15)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 213-Enter input value in input typeForHints.png')

"Step 214: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 214-Click on button search.png')

"Step 215: Click on div dynamicContent (employeeNumber5) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 215-Click on div dynamicContent employeeNumber5 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 216: Click on link viewSalary16 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary16'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 216-Click on link viewSalary16 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 217: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 217-Click on button add2.png')

"Step 218: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_15)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 218-Enter input value in input object.png')

"Step 219: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 219-Click on i object.png')

"Step 220: Click on div grade6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade6'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 220-Click on div grade6.png')

"Step 221: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 221-Click on i object2.png')

"Step 222: Click on div monthly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_monthly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 222-Click on div monthly.png')

"Step 223: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 223-Click on i object3.png')

"Step 224: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 224-Click on div usd.png')

"Step 225: Enter input value in input amountRange7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange7'), input_amountRange7)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 225-Enter input value in input amountRange7.png')

"Step 226: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_10)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 226-Enter input value in textarea object.png')

"Step 227: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 227-Click on button save3.png')

"Step 228: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 228-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 229: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_16)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 229-Enter input value in input typeForHints.png')

"Step 230: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 230-Click on button search.png')

"Step 231: Click on div dynamicContent (employeeNumber6) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 231-Click on div dynamicContent employeeNumber6 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 232: Click on link viewSalary17 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary17'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 232-Click on link viewSalary17 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 233: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 233-Click on button add2.png')

"Step 234: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_16)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 234-Enter input value in input object.png')

"Step 235: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 235-Click on i object.png')

"Step 236: Click on div grade7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade7'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 236-Click on div grade7.png')

"Step 237: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 237-Click on i object2.png')

"Step 238: Click on div weekly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_weekly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 238-Click on div weekly.png')

"Step 239: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 239-Click on i object3.png')

"Step 240: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 240-Click on div usd.png')

"Step 241: Enter input value in input amountRange3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange3'), input_amountRange3_2)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 241-Enter input value in input amountRange3.png')

"Step 242: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_11)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 242-Enter input value in textarea object.png')

"Step 243: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 243-Click on button save3.png')

"Step 244: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 244-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 245: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_17)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 245-Enter input value in input typeForHints.png')

"Step 246: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 246-Click on button search.png')

"Step 247: Click on div dynamicContent (employeeNumber7) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_17]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 247-Click on div dynamicContent employeeNumber7 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 248: Click on link viewSalary18 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary18'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 248-Click on link viewSalary18 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 249: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 249-Click on button add2.png')

"Step 250: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_17)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 250-Enter input value in input object.png')

"Step 251: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 251-Click on i object.png')

"Step 252: Click on div grade3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 252-Click on div grade3.png')

"Step 253: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 253-Click on i object2.png')

"Step 254: Click on div weekly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_weekly'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 254-Click on div weekly.png')

"Step 255: Click on i object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 255-Click on i object3.png')

"Step 256: Click on div usd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_usd'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 256-Click on div usd.png')

"Step 257: Enter input value in input amountRange5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_amountRange5'), input_amountRange5_2)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 257-Enter input value in input amountRange5.png')

"Step 258: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_object'), textarea_object_12)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 258-Enter input value in textarea object.png')

"Step 259: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 259-Click on button save3.png')

"Step 260: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 260-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 261: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_18)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 261-Enter input value in input typeForHints.png')

"Step 262: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 262-Click on button search.png')

"Step 263: Click on div dynamicContent (employeeNumber8) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_18]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 263-Click on div dynamicContent employeeNumber8 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 264: Click on link viewSalary19 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary19'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 264-Click on link viewSalary19 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 265: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 265-Click on button add2.png')

"Step 266: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_18)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 266-Enter input value in input object.png')

"Step 267: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 267-Click on i object.png')

"Step 268: Click on div grade5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 268-Click on div grade5.png')

"Step 269: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 269-Click on i object2.png')

"Step 270: Click on link pim3 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 270-Click on link pim3 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 271: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_19)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 271-Enter input value in input typeForHints.png')

"Step 272: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 272-Click on button search.png')

"Step 273: Click on div dynamicContent (employeeNumber9) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_19]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 273-Click on div dynamicContent employeeNumber9 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 274: Click on link viewSalary20 -> Navigate to page 'dynamic content#web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewSalary20'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 274-Click on link viewSalary20 - Navigate to page dynamic contentwebindexphpviewSalaryListempNumber.png')

"Step 275: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 275-Click on button add2.png')

"Step 276: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object_19)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 276-Enter input value in input object.png')

"Step 277: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 277-Click on i object.png')

"Step 278: Click on div grade2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_grade2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 278-Click on div grade2.png')

"Step 279: Click on i object2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 279-Click on i object2 - Navigate to page .png')

"Step 280: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-View and Add Salary Information for Multiple Employees in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}