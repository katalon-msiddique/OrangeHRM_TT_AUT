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

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 3: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Enter input value in input typeForHints.png')

"Step 4: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on button search.png')

"Step 5: Click on div dynamicContent (code0218) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on div dynamicContent code0218 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 6: Click on link contactDetails -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on link contactDetails - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 7: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Enter input value in input dynamicContent.png')

"Step 8: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Enter input value in input dynamicContent2.png')

"Step 9: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Enter input value in input dynamicContent3.png')

"Step 10: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Enter input value in input dynamicContent4.png')

"Step 11: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Enter input value in input dynamicContent5.png')

"Step 12: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on i icon2.png')

"Step 13: Click on div optionIndia"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_optionIndia'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on div optionIndia.png')

"Step 14: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Enter input value in input dynamicContent6.png')

"Step 15: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Enter input value in input dynamicContentField1.png')

"Step 16: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Enter input value in input dynamicContentField2.png')

"Step 17: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Enter input value in input dynamicContentField3.png')

"Step 18: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Enter input value in input dynamicContentField4.png')

"Step 19: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on button save2.png')

"Step 20: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 21: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 21-Enter input value in input typeForHints.png')

"Step 22: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 22-Click on button search.png')

"Step 23: Click on div dynamicContent (code0219) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 23-Click on div dynamicContent code0219 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 24: Click on link contactDetails2 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 24-Click on link contactDetails2 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 25: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 25-Enter input value in input dynamicContent.png')

"Step 26: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 26-Enter input value in input dynamicContent2.png')

"Step 27: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 27-Enter input value in input dynamicContent3.png')

"Step 28: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 28-Enter input value in input dynamicContent4.png')

"Step 29: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 29-Enter input value in input dynamicContent5.png')

"Step 30: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 30-Click on i icon2.png')

"Step 31: Click on div addressUnitedStates"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 31-Click on div addressUnitedStates.png')

"Step 32: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 32-Enter input value in input dynamicContent6.png')

"Step 33: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 33-Enter input value in input dynamicContentField1.png')

"Step 34: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 34-Enter input value in input dynamicContentField2.png')

"Step 35: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 35-Enter input value in input dynamicContentField3.png')

"Step 36: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_1)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 36-Enter input value in input dynamicContentField4.png')

"Step 37: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 37-Click on button save2.png')

"Step 38: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 38-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 39: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 39-Enter input value in input typeForHints.png')

"Step 40: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 40-Click on button search.png')

"Step 41: Click on div dynamicContent (code0220) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 41-Click on div dynamicContent code0220 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 42: Click on link contactDetails3 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails3'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 42-Click on link contactDetails3 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 43: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 43-Enter input value in input dynamicContent.png')

"Step 44: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 44-Enter input value in input dynamicContent2.png')

"Step 45: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 45-Enter input value in input dynamicContent3.png')

"Step 46: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 46-Enter input value in input dynamicContent4.png')

"Step 47: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 47-Enter input value in input dynamicContent5.png')

"Step 48: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 48-Click on i icon2.png')

"Step 49: Click on div addressUnitedStates"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 49-Click on div addressUnitedStates.png')

"Step 50: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 50-Enter input value in input dynamicContent6.png')

"Step 51: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 51-Enter input value in input dynamicContentField1.png')

"Step 52: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 52-Enter input value in input dynamicContentField2.png')

"Step 53: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 53-Enter input value in input dynamicContentField3.png')

"Step 54: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_2)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 54-Enter input value in input dynamicContentField4.png')

"Step 55: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 55-Click on button save2.png')

"Step 56: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 56-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 57: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 57-Enter input value in input typeForHints.png')

"Step 58: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 58-Click on button search.png')

"Step 59: Click on div dynamicContent (code0221) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 59-Click on div dynamicContent code0221 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 60: Click on link contactDetails4 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails4'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 60-Click on link contactDetails4 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 61: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 61-Enter input value in input dynamicContent.png')

"Step 62: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 62-Enter input value in input dynamicContent2.png')

"Step 63: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 63-Enter input value in input dynamicContent3.png')

"Step 64: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 64-Enter input value in input dynamicContent4.png')

"Step 65: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 65-Enter input value in input dynamicContent5.png')

"Step 66: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 66-Click on i icon2.png')

"Step 67: Click on div optionIndia"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_optionIndia'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 67-Click on div optionIndia.png')

"Step 68: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 68-Enter input value in input dynamicContent6.png')

"Step 69: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 69-Enter input value in input dynamicContentField1.png')

"Step 70: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 70-Enter input value in input dynamicContentField2.png')

"Step 71: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 71-Enter input value in input dynamicContentField3.png')

"Step 72: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_3)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 72-Enter input value in input dynamicContentField4.png')

"Step 73: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 73-Click on button save2.png')

"Step 74: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 74-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 75: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 75-Enter input value in input typeForHints.png')

"Step 76: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 76-Click on button search.png')

"Step 77: Click on div dynamicContent (code0222) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 77-Click on div dynamicContent code0222 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 78: Click on link contactDetails5 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails5'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 78-Click on link contactDetails5 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 79: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 79-Enter input value in input dynamicContent.png')

"Step 80: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 80-Enter input value in input dynamicContent2.png')

"Step 81: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 81-Enter input value in input dynamicContent3.png')

"Step 82: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 82-Enter input value in input dynamicContent4.png')

"Step 83: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 83-Enter input value in input dynamicContent5.png')

"Step 84: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 84-Click on i icon2.png')

"Step 85: Click on div addressUnitedStates"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 85-Click on div addressUnitedStates.png')

"Step 86: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 86-Enter input value in input dynamicContent6.png')

"Step 87: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 87-Enter input value in input dynamicContentField1.png')

"Step 88: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 88-Enter input value in input dynamicContentField2.png')

"Step 89: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 89-Enter input value in input dynamicContentField3.png')

"Step 90: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_4)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 90-Enter input value in input dynamicContentField4.png')

"Step 91: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 91-Click on button save2.png')

"Step 92: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 92-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 93: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 93-Enter input value in input typeForHints.png')

"Step 94: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 94-Click on button search.png')

"Step 95: Click on div dynamicContent (code0223) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 95-Click on div dynamicContent code0223 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 96: Click on link contactDetails6 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails6'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 96-Click on link contactDetails6 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 97: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 97-Enter input value in input dynamicContent.png')

"Step 98: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 98-Enter input value in input dynamicContent2.png')

"Step 99: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 99-Enter input value in input dynamicContent3.png')

"Step 100: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 100-Enter input value in input dynamicContent4.png')

"Step 101: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 101-Enter input value in input dynamicContent5.png')

"Step 102: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 102-Click on i icon2.png')

"Step 103: Click on div optionIndia"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_optionIndia'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 103-Click on div optionIndia.png')

"Step 104: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 104-Enter input value in input dynamicContent6.png')

"Step 105: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 105-Enter input value in input dynamicContentField1.png')

"Step 106: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 106-Enter input value in input dynamicContentField2.png')

"Step 107: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 107-Enter input value in input dynamicContentField3.png')

"Step 108: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_5)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 108-Enter input value in input dynamicContentField4.png')

"Step 109: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 109-Click on button save2.png')

"Step 110: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 110-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 111: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 111-Enter input value in input typeForHints.png')

"Step 112: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 112-Click on button search.png')

"Step 113: Click on div dynamicContent (code0224) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 113-Click on div dynamicContent code0224 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 114: Click on link contactDetails7 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails7'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 114-Click on link contactDetails7 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 115: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 115-Enter input value in input dynamicContent.png')

"Step 116: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 116-Enter input value in input dynamicContent2.png')

"Step 117: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 117-Enter input value in input dynamicContent3.png')

"Step 118: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 118-Enter input value in input dynamicContent4.png')

"Step 119: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 119-Enter input value in input dynamicContent5.png')

"Step 120: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 120-Click on i icon2.png')

"Step 121: Click on div addressUnitedStates"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 121-Click on div addressUnitedStates.png')

"Step 122: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 122-Enter input value in input dynamicContent6.png')

"Step 123: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 123-Enter input value in input dynamicContentField1.png')

"Step 124: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 124-Enter input value in input dynamicContentField2.png')

"Step 125: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 125-Enter input value in input dynamicContentField3.png')

"Step 126: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_6)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 126-Enter input value in input dynamicContentField4.png')

"Step 127: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 127-Click on button save2.png')

"Step 128: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 128-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 129: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 129-Enter input value in input typeForHints.png')

"Step 130: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 130-Click on button search.png')

"Step 131: Click on div dynamicContent (code0225) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 131-Click on div dynamicContent code0225 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 132: Click on link contactDetails8 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails8'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 132-Click on link contactDetails8 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 133: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 133-Enter input value in input dynamicContent.png')

"Step 134: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 134-Enter input value in input dynamicContent2.png')

"Step 135: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 135-Enter input value in input dynamicContent3.png')

"Step 136: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 136-Enter input value in input dynamicContent4.png')

"Step 137: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 137-Enter input value in input dynamicContent5.png')

"Step 138: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 138-Click on i icon2.png')

"Step 139: Click on div addressUnitedStates"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 139-Click on div addressUnitedStates.png')

"Step 140: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 140-Enter input value in input dynamicContent6.png')

"Step 141: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 141-Enter input value in input dynamicContentField1.png')

"Step 142: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 142-Enter input value in input dynamicContentField2.png')

"Step 143: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 143-Enter input value in input dynamicContentField3.png')

"Step 144: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_7)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 144-Enter input value in input dynamicContentField4.png')

"Step 145: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 145-Click on button save2.png')

"Step 146: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 146-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 147: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 147-Enter input value in input typeForHints.png')

"Step 148: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 148-Click on button search.png')

"Step 149: Click on div dynamicContent (code0226) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 149-Click on div dynamicContent code0226 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 150: Click on link contactDetails9 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails9'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 150-Click on link contactDetails9 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 151: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 151-Enter input value in input dynamicContent.png')

"Step 152: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 152-Enter input value in input dynamicContent2.png')

"Step 153: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 153-Enter input value in input dynamicContent3.png')

"Step 154: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 154-Enter input value in input dynamicContent4.png')

"Step 155: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 155-Enter input value in input dynamicContent5.png')

"Step 156: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 156-Click on i icon2.png')

"Step 157: Click on div addressUnitedStates"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 157-Click on div addressUnitedStates.png')

"Step 158: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 158-Enter input value in input dynamicContent6.png')

"Step 159: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 159-Enter input value in input dynamicContentField1.png')

"Step 160: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 160-Enter input value in input dynamicContentField2.png')

"Step 161: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 161-Enter input value in input dynamicContentField3.png')

"Step 162: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_8)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 162-Enter input value in input dynamicContentField4.png')

"Step 163: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 163-Click on button save2.png')

"Step 164: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 164-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 165: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 165-Enter input value in input typeForHints.png')

"Step 166: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 166-Click on button search.png')

"Step 167: Click on div dynamicContent (code0227) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 167-Click on div dynamicContent code0227 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 168: Click on link contactDetails10 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails10'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 168-Click on link contactDetails10 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 169: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 169-Enter input value in input dynamicContent.png')

"Step 170: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 170-Enter input value in input dynamicContent2.png')

"Step 171: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 171-Enter input value in input dynamicContent3.png')

"Step 172: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 172-Enter input value in input dynamicContent4.png')

"Step 173: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 173-Enter input value in input dynamicContent5.png')

"Step 174: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 174-Click on i icon2.png')

"Step 175: Click on div addressUnitedStates"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 175-Click on div addressUnitedStates.png')

"Step 176: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 176-Enter input value in input dynamicContent6.png')

"Step 177: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 177-Enter input value in input dynamicContentField1.png')

"Step 178: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 178-Enter input value in input dynamicContentField2.png')

"Step 179: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 179-Enter input value in input dynamicContentField3.png')

"Step 180: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_9)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 180-Enter input value in input dynamicContentField4.png')

"Step 181: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 181-Click on button save2.png')

"Step 182: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 182-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 183: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 183-Enter input value in input typeForHints.png')

"Step 184: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 184-Click on button search.png')

"Step 185: Click on div dynamicContent (code0228) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 185-Click on div dynamicContent code0228 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 186: Click on link contactDetails11 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails11'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 186-Click on link contactDetails11 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 187: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 187-Enter input value in input dynamicContent.png')

"Step 188: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 188-Enter input value in input dynamicContent2.png')

"Step 189: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 189-Enter input value in input dynamicContent3.png')

"Step 190: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 190-Enter input value in input dynamicContent4.png')

"Step 191: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 191-Enter input value in input dynamicContent5.png')

"Step 192: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 192-Click on i icon2.png')

"Step 193: Click on div addressUnitedStates"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 193-Click on div addressUnitedStates.png')

"Step 194: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 194-Enter input value in input dynamicContent6.png')

"Step 195: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 195-Enter input value in input dynamicContentField1.png')

"Step 196: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 196-Enter input value in input dynamicContentField2.png')

"Step 197: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 197-Enter input value in input dynamicContentField3.png')

"Step 198: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_10)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 198-Enter input value in input dynamicContentField4.png')

"Step 199: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 199-Click on button save2.png')

"Step 200: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 200-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 201: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 201-Enter input value in input typeForHints.png')

"Step 202: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 202-Click on button search.png')

"Step 203: Click on div dynamicContent (employeeNumber) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 203-Click on div dynamicContent employeeNumber - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 204: Click on link contactDetails12 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails12'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 204-Click on link contactDetails12 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 205: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 205-Enter input value in input dynamicContent.png')

"Step 206: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 206-Enter input value in input dynamicContent2.png')

"Step 207: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 207-Enter input value in input dynamicContent3.png')

"Step 208: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 208-Enter input value in input dynamicContent4.png')

"Step 209: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 209-Enter input value in input dynamicContent5.png')

"Step 210: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 210-Click on i icon2.png')

"Step 211: Click on div optionIndia"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_optionIndia'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 211-Click on div optionIndia.png')

"Step 212: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 212-Enter input value in input dynamicContent6.png')

"Step 213: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 213-Enter input value in input dynamicContentField1.png')

"Step 214: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 214-Enter input value in input dynamicContentField2.png')

"Step 215: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 215-Enter input value in input dynamicContentField3.png')

"Step 216: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_11)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 216-Enter input value in input dynamicContentField4.png')

"Step 217: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 217-Click on button save2.png')

"Step 218: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 218-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 219: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 219-Enter input value in input typeForHints.png')

"Step 220: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 220-Click on button search.png')

"Step 221: Click on div dynamicContent (employeeNumber2) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 221-Click on div dynamicContent employeeNumber2 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 222: Click on link contactDetails13 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails13'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 222-Click on link contactDetails13 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 223: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 223-Enter input value in input dynamicContent.png')

"Step 224: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 224-Enter input value in input dynamicContent2.png')

"Step 225: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 225-Enter input value in input dynamicContent3.png')

"Step 226: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 226-Enter input value in input dynamicContent4.png')

"Step 227: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 227-Enter input value in input dynamicContent5.png')

"Step 228: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 228-Click on i icon2.png')

"Step 229: Click on div optionIndia"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_optionIndia'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 229-Click on div optionIndia.png')

"Step 230: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 230-Enter input value in input dynamicContent6.png')

"Step 231: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 231-Enter input value in input dynamicContentField1.png')

"Step 232: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 232-Enter input value in input dynamicContentField2.png')

"Step 233: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 233-Enter input value in input dynamicContentField3.png')

"Step 234: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_12)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 234-Enter input value in input dynamicContentField4.png')

"Step 235: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 235-Click on button save2.png')

"Step 236: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 236-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 237: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 237-Enter input value in input typeForHints.png')

"Step 238: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 238-Click on button search.png')

"Step 239: Click on div dynamicContent (employeeNumber3) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 239-Click on div dynamicContent employeeNumber3 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 240: Click on link contactDetails14 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails14'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 240-Click on link contactDetails14 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 241: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 241-Enter input value in input dynamicContent.png')

"Step 242: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 242-Enter input value in input dynamicContent2.png')

"Step 243: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 243-Enter input value in input dynamicContent3.png')

"Step 244: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 244-Enter input value in input dynamicContent4.png')

"Step 245: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 245-Enter input value in input dynamicContent5.png')

"Step 246: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 246-Click on i icon2.png')

"Step 247: Click on div optionIndia"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_optionIndia'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 247-Click on div optionIndia.png')

"Step 248: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 248-Enter input value in input dynamicContent6.png')

"Step 249: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 249-Enter input value in input dynamicContentField1.png')

"Step 250: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 250-Enter input value in input dynamicContentField2.png')

"Step 251: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 251-Enter input value in input dynamicContentField3.png')

"Step 252: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_13)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 252-Enter input value in input dynamicContentField4.png')

"Step 253: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 253-Click on button save2.png')

"Step 254: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 254-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 255: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 255-Enter input value in input typeForHints.png')

"Step 256: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 256-Click on button search.png')

"Step 257: Click on div dynamicContent (employeeNumber4) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 257-Click on div dynamicContent employeeNumber4 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 258: Click on link contactDetails15 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails15'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 258-Click on link contactDetails15 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 259: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 259-Enter input value in input dynamicContent.png')

"Step 260: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 260-Enter input value in input dynamicContent2.png')

"Step 261: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 261-Enter input value in input dynamicContent3.png')

"Step 262: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 262-Enter input value in input dynamicContent4.png')

"Step 263: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 263-Enter input value in input dynamicContent5.png')

"Step 264: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 264-Click on i icon2.png')

"Step 265: Click on div addressUnitedStates2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 265-Click on div addressUnitedStates2.png')

"Step 266: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 266-Enter input value in input dynamicContent6.png')

"Step 267: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 267-Enter input value in input dynamicContentField1.png')

"Step 268: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 268-Enter input value in input dynamicContentField2.png')

"Step 269: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 269-Enter input value in input dynamicContentField3.png')

"Step 270: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_14)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 270-Enter input value in input dynamicContentField4.png')

"Step 271: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 271-Click on button save2.png')

"Step 272: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 272-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 273: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 273-Enter input value in input typeForHints.png')

"Step 274: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 274-Click on button search.png')

"Step 275: Click on div dynamicContent (employeeNumber5) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 275-Click on div dynamicContent employeeNumber5 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 276: Click on link contactDetails16 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails16'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 276-Click on link contactDetails16 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 277: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 277-Enter input value in input dynamicContent.png')

"Step 278: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 278-Enter input value in input dynamicContent2.png')

"Step 279: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 279-Enter input value in input dynamicContent3.png')

"Step 280: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 280-Enter input value in input dynamicContent4.png')

"Step 281: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 281-Enter input value in input dynamicContent5.png')

"Step 282: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 282-Click on i icon2.png')

"Step 283: Click on div optionIndia"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_optionIndia'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 283-Click on div optionIndia.png')

"Step 284: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 284-Enter input value in input dynamicContent6.png')

"Step 285: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 285-Enter input value in input dynamicContentField1.png')

"Step 286: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 286-Enter input value in input dynamicContentField2.png')

"Step 287: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 287-Enter input value in input dynamicContentField3.png')

"Step 288: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_15)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 288-Enter input value in input dynamicContentField4.png')

"Step 289: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 289-Click on button save2.png')

"Step 290: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 290-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 291: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 291-Enter input value in input typeForHints.png')

"Step 292: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 292-Click on button search.png')

"Step 293: Click on div dynamicContent (employeeNumber6) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 293-Click on div dynamicContent employeeNumber6 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 294: Click on link contactDetails17 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails17'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 294-Click on link contactDetails17 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 295: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 295-Enter input value in input dynamicContent.png')

"Step 296: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 296-Enter input value in input dynamicContent2.png')

"Step 297: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 297-Enter input value in input dynamicContent3.png')

"Step 298: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 298-Enter input value in input dynamicContent4.png')

"Step 299: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 299-Enter input value in input dynamicContent5.png')

"Step 300: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 300-Click on i icon2.png')

"Step 301: Click on div addressUnitedStates2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 301-Click on div addressUnitedStates2.png')

"Step 302: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 302-Enter input value in input dynamicContent6.png')

"Step 303: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 303-Enter input value in input dynamicContentField1.png')

"Step 304: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 304-Enter input value in input dynamicContentField2.png')

"Step 305: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 305-Enter input value in input dynamicContentField3.png')

"Step 306: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_16)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 306-Enter input value in input dynamicContentField4.png')

"Step 307: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 307-Click on button save2.png')

"Step 308: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 308-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 309: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 309-Enter input value in input typeForHints.png')

"Step 310: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 310-Click on button search.png')

"Step 311: Click on div dynamicContent (employeeNumber7) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_17]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 311-Click on div dynamicContent employeeNumber7 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 312: Click on link contactDetails18 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails18'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 312-Click on link contactDetails18 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 313: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 313-Enter input value in input dynamicContent.png')

"Step 314: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 314-Enter input value in input dynamicContent2.png')

"Step 315: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 315-Enter input value in input dynamicContent3.png')

"Step 316: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 316-Enter input value in input dynamicContent4.png')

"Step 317: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 317-Enter input value in input dynamicContent5.png')

"Step 318: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 318-Click on i icon2.png')

"Step 319: Click on div optionIndia"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_optionIndia'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 319-Click on div optionIndia.png')

"Step 320: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 320-Enter input value in input dynamicContent6.png')

"Step 321: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 321-Enter input value in input dynamicContentField1.png')

"Step 322: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 322-Enter input value in input dynamicContentField2.png')

"Step 323: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 323-Enter input value in input dynamicContentField3.png')

"Step 324: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_17)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 324-Enter input value in input dynamicContentField4.png')

"Step 325: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 325-Click on button save2.png')

"Step 326: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 326-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 327: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 327-Enter input value in input typeForHints.png')

"Step 328: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 328-Click on button search.png')

"Step 329: Click on div dynamicContent (employeeNumber8) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_18]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 329-Click on div dynamicContent employeeNumber8 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 330: Click on link contactDetails19 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails19'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 330-Click on link contactDetails19 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 331: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 331-Enter input value in input dynamicContent.png')

"Step 332: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 332-Enter input value in input dynamicContent2.png')

"Step 333: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 333-Enter input value in input dynamicContent3.png')

"Step 334: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 334-Enter input value in input dynamicContent4.png')

"Step 335: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 335-Enter input value in input dynamicContent5.png')

"Step 336: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 336-Click on i icon2.png')

"Step 337: Click on div addressUnitedStates2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_addressUnitedStates2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 337-Click on div addressUnitedStates2.png')

"Step 338: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 338-Enter input value in input dynamicContent6.png')

"Step 339: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 339-Enter input value in input dynamicContentField1.png')

"Step 340: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 340-Enter input value in input dynamicContentField2.png')

"Step 341: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 341-Enter input value in input dynamicContentField3.png')

"Step 342: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_18)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 342-Enter input value in input dynamicContentField4.png')

"Step 343: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 343-Click on button save2.png')

"Step 344: Click on link pim2 -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 344-Click on link pim2 - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 345: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 345-Enter input value in input typeForHints.png')

"Step 346: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 346-Click on button search.png')

"Step 347: Click on div dynamicContent (employeeNumber9) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_19]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 347-Click on div dynamicContent employeeNumber9 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 348: Click on link contactDetails20 -> Navigate to page 'dynamic content#web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_contactDetails20'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 348-Click on link contactDetails20 - Navigate to page dynamic contentwebindexphpempNumber.png')

"Step 349: Enter input value in input dynamicContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent'), input_dynamicContent_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 349-Enter input value in input dynamicContent.png')

"Step 350: Enter input value in input dynamicContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent2'), input_dynamicContent2_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 350-Enter input value in input dynamicContent2.png')

"Step 351: Enter input value in input dynamicContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent3'), input_dynamicContent3_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 351-Enter input value in input dynamicContent3.png')

"Step 352: Enter input value in input dynamicContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent4'), input_dynamicContent4_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 352-Enter input value in input dynamicContent4.png')

"Step 353: Enter input value in input dynamicContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent5'), input_dynamicContent5_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 353-Enter input value in input dynamicContent5.png')

"Step 354: Click on i icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_icon2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 354-Click on i icon2.png')

"Step 355: Click on div optionIndia"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_optionIndia'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 355-Click on div optionIndia.png')

"Step 356: Enter input value in input dynamicContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContent6'), input_dynamicContent6_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 356-Enter input value in input dynamicContent6.png')

"Step 357: Enter input value in input dynamicContentField1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField1'), input_dynamicContentField1_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 357-Enter input value in input dynamicContentField1.png')

"Step 358: Enter input value in input dynamicContentField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField2'), input_dynamicContentField2_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 358-Enter input value in input dynamicContentField2.png')

"Step 359: Enter input value in input dynamicContentField3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField3'), input_dynamicContentField3_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 359-Enter input value in input dynamicContentField3.png')

"Step 360: Enter input value in input dynamicContentField4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_dynamicContentField4'), input_dynamicContentField4_19)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 360-Enter input value in input dynamicContentField4.png')

"Step 361: Click on button save2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 361-Click on button save2 - Navigate to page .png')

"Step 362: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Edit Contact Details for Multiple Employees in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}