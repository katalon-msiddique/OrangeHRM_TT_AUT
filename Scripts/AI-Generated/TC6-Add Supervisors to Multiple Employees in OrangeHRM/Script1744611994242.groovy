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

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 3: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Enter input value in input typeForHints.png')

"Step 4: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on button search.png')

"Step 5: Click on div dynamicContent (code0218) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on div dynamicContent code0218 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 6: Click on link reportTo -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on link reportTo - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 7: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on button addSupervisor.png')

"Step 8: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Enter input value in input typeForHintsReport.png')

"Step 9: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on div optionMahtabSiddique.png')

"Step 10: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on i iconForm.png')

"Step 11: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on div optionDirect.png')

"Step 12: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on button saveReport.png')

"Step 13: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 14: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_1)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Enter input value in input typeForHints.png')

"Step 15: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on button search.png')

"Step 16: Click on div dynamicContent (code0219) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on div dynamicContent code0219 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 17: Click on link reportToDuplicate -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportToDuplicate'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on link reportToDuplicate - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 18: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on button addSupervisor.png')

"Step 19: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_1)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Enter input value in input typeForHintsReport.png')

"Step 20: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Click on div optionMahtabSiddique.png')

"Step 21: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on i iconForm.png')

"Step 22: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 22-Click on div optionDirect.png')

"Step 23: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 23-Click on button saveReport.png')

"Step 24: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 24-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 25: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_2)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 25-Enter input value in input typeForHints.png')

"Step 26: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 26-Click on button search.png')

"Step 27: Click on div dynamicContent (code0220) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 27-Click on div dynamicContent code0220 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 28: Click on link reportToAnother -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportToAnother'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 28-Click on link reportToAnother - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 29: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 29-Click on button addSupervisor.png')

"Step 30: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_2)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 30-Enter input value in input typeForHintsReport.png')

"Step 31: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 31-Click on div optionMahtabSiddique.png')

"Step 32: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 32-Click on i iconForm.png')

"Step 33: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 33-Click on div optionDirect.png')

"Step 34: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 34-Click on button saveReport.png')

"Step 35: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 35-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 36: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_3)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 36-Enter input value in input typeForHints.png')

"Step 37: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 37-Click on button search.png')

"Step 38: Click on div dynamicContent (code0221) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 38-Click on div dynamicContent code0221 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 39: Click on link reportToYetAnother -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportToYetAnother'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 39-Click on link reportToYetAnother - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 40: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 40-Click on button addSupervisor.png')

"Step 41: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_3)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 41-Enter input value in input typeForHintsReport.png')

"Step 42: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 42-Click on div optionMahtabSiddique.png')

"Step 43: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 43-Click on i iconForm.png')

"Step 44: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 44-Click on div optionDirect.png')

"Step 45: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 45-Click on button saveReport.png')

"Step 46: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 46-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 47: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_4)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 47-Enter input value in input typeForHints.png')

"Step 48: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 48-Click on button search.png')

"Step 49: Click on div dynamicContent (code0222) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 49-Click on div dynamicContent code0222 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 50: Click on link reportToFinal -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportToFinal'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 50-Click on link reportToFinal - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 51: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 51-Click on button addSupervisor.png')

"Step 52: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_4)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 52-Enter input value in input typeForHintsReport.png')

"Step 53: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 53-Click on div optionMahtabSiddique.png')

"Step 54: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 54-Click on i iconForm.png')

"Step 55: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 55-Click on div optionDirect.png')

"Step 56: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 56-Click on button saveReport.png')

"Step 57: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 57-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 58: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_5)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 58-Enter input value in input typeForHints.png')

"Step 59: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 59-Click on button search.png')

"Step 60: Click on div dynamicContent (code0223) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 60-Click on div dynamicContent code0223 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 61: Click on link reportToFinalDuplicate -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportToFinalDuplicate'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 61-Click on link reportToFinalDuplicate - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 62: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 62-Click on button addSupervisor.png')

"Step 63: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_5)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 63-Enter input value in input typeForHintsReport.png')

"Step 64: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 64-Click on div optionMahtabSiddique.png')

"Step 65: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 65-Click on i iconForm.png')

"Step 66: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 66-Click on div optionDirect.png')

"Step 67: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 67-Click on button saveReport.png')

"Step 68: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 68-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 69: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_6)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 69-Enter input value in input typeForHints.png')

"Step 70: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 70-Click on button search.png')

"Step 71: Click on div dynamicContent (code0224) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 71-Click on div dynamicContent code0224 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 72: Click on link reportToFinalDuplicate2 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportToFinalDuplicate2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 72-Click on link reportToFinalDuplicate2 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 73: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 73-Click on button addSupervisor.png')

"Step 74: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_6)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 74-Enter input value in input typeForHintsReport.png')

"Step 75: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 75-Click on div optionMahtabSiddique.png')

"Step 76: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 76-Click on i iconForm.png')

"Step 77: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 77-Click on div optionDirect.png')

"Step 78: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 78-Click on button saveReport.png')

"Step 79: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 79-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 80: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_7)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 80-Enter input value in input typeForHints.png')

"Step 81: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 81-Click on button search.png')

"Step 82: Click on div dynamicContent (code0225) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 82-Click on div dynamicContent code0225 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 83: Click on link reportToFinalDuplicate3 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportToFinalDuplicate3'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 83-Click on link reportToFinalDuplicate3 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 84: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 84-Click on button addSupervisor.png')

"Step 85: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_7)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 85-Enter input value in input typeForHintsReport.png')

"Step 86: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 86-Click on div optionMahtabSiddique.png')

"Step 87: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 87-Click on i iconForm.png')

"Step 88: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 88-Click on div optionDirect.png')

"Step 89: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 89-Click on button saveReport.png')

"Step 90: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 90-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 91: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_8)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 91-Enter input value in input typeForHints.png')

"Step 92: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 92-Click on button search.png')

"Step 93: Click on div dynamicContent (code0226) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 93-Click on div dynamicContent code0226 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 94: Click on link reportToFinalDuplicate4 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportToFinalDuplicate4'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 94-Click on link reportToFinalDuplicate4 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 95: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 95-Click on button addSupervisor.png')

"Step 96: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_8)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 96-Enter input value in input typeForHintsReport.png')

"Step 97: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 97-Click on div optionMahtabSiddique.png')

"Step 98: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 98-Click on i iconForm.png')

"Step 99: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 99-Click on div optionDirect.png')

"Step 100: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 100-Click on button saveReport.png')

"Step 101: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 101-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 102: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_9)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 102-Enter input value in input typeForHints.png')

"Step 103: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 103-Click on button search.png')

"Step 104: Click on div dynamicContent (code0227) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 104-Click on div dynamicContent code0227 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 105: Click on link reportToFinalDuplicate5 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportToFinalDuplicate5'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 105-Click on link reportToFinalDuplicate5 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 106: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 106-Click on button addSupervisor.png')

"Step 107: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_9)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 107-Enter input value in input typeForHintsReport.png')

"Step 108: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 108-Click on div optionMahtabSiddique.png')

"Step 109: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 109-Click on i iconForm.png')

"Step 110: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 110-Click on div optionDirect.png')

"Step 111: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 111-Click on button saveReport.png')

"Step 112: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 112-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 113: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_10)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 113-Enter input value in input typeForHints.png')

"Step 114: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 114-Click on button search.png')

"Step 115: Click on div dynamicContent (code0228) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 115-Click on div dynamicContent code0228 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 116: Click on link reportTo2 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 116-Click on link reportTo2 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 117: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 117-Click on button addSupervisor.png')

"Step 118: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_10)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 118-Enter input value in input typeForHintsReport.png')

"Step 119: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 119-Click on div optionMahtabSiddique.png')

"Step 120: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 120-Click on i iconForm.png')

"Step 121: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 121-Click on div optionDirect.png')

"Step 122: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 122-Click on button saveReport.png')

"Step 123: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 123-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 124: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_11)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 124-Enter input value in input typeForHints.png')

"Step 125: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 125-Click on button search.png')

"Step 126: Click on div dynamicContent (employeeNumber) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 126-Click on div dynamicContent employeeNumber - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 127: Click on link reportTo3 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo3'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 127-Click on link reportTo3 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 128: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 128-Click on button addSupervisor.png')

"Step 129: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_11)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 129-Enter input value in input typeForHintsReport.png')

"Step 130: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 130-Click on div optionMahtabSiddique.png')

"Step 131: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 131-Click on i iconForm.png')

"Step 132: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 132-Click on div optionDirect.png')

"Step 133: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 133-Click on button saveReport.png')

"Step 134: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 134-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 135: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_12)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 135-Enter input value in input typeForHints.png')

"Step 136: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 136-Click on button search.png')

"Step 137: Click on div dynamicContent (employeeNumber2) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 137-Click on div dynamicContent employeeNumber2 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 138: Click on link reportTo4 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo4'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 138-Click on link reportTo4 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 139: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 139-Click on button addSupervisor.png')

"Step 140: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_12)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 140-Enter input value in input typeForHintsReport.png')

"Step 141: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 141-Click on div optionMahtabSiddique.png')

"Step 142: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 142-Click on i iconForm.png')

"Step 143: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 143-Click on div optionDirect.png')

"Step 144: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 144-Click on button saveReport.png')

"Step 145: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 145-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 146: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_13)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 146-Enter input value in input typeForHints.png')

"Step 147: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 147-Click on button search.png')

"Step 148: Click on div dynamicContent (employeeNumber3) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 148-Click on div dynamicContent employeeNumber3 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 149: Click on link reportTo5 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo5'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 149-Click on link reportTo5 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 150: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 150-Click on button addSupervisor.png')

"Step 151: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_13)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 151-Enter input value in input typeForHintsReport.png')

"Step 152: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 152-Click on div optionMahtabSiddique.png')

"Step 153: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 153-Click on i iconForm.png')

"Step 154: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 154-Click on div optionDirect.png')

"Step 155: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 155-Click on button saveReport.png')

"Step 156: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 156-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 157: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_14)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 157-Enter input value in input typeForHints.png')

"Step 158: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 158-Click on button search.png')

"Step 159: Click on div dynamicContent (employeeNumber4) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 159-Click on div dynamicContent employeeNumber4 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 160: Click on link reportTo6 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo6'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 160-Click on link reportTo6 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 161: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 161-Click on button addSupervisor.png')

"Step 162: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_14)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 162-Enter input value in input typeForHintsReport.png')

"Step 163: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 163-Click on div optionMahtabSiddique.png')

"Step 164: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 164-Click on i iconForm.png')

"Step 165: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 165-Click on div optionDirect.png')

"Step 166: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 166-Click on button saveReport.png')

"Step 167: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 167-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 168: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_15)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 168-Enter input value in input typeForHints.png')

"Step 169: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 169-Click on button search.png')

"Step 170: Click on div dynamicContent (employeeNumber5) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 170-Click on div dynamicContent employeeNumber5 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 171: Click on link reportTo7 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo7'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 171-Click on link reportTo7 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 172: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 172-Click on button addSupervisor.png')

"Step 173: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_15)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 173-Enter input value in input typeForHintsReport.png')

"Step 174: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 174-Click on div optionMahtabSiddique.png')

"Step 175: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 175-Click on i iconForm.png')

"Step 176: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 176-Click on div optionDirect.png')

"Step 177: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 177-Click on button saveReport.png')

"Step 178: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 178-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 179: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_16)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 179-Enter input value in input typeForHints.png')

"Step 180: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 180-Click on button search.png')

"Step 181: Click on div dynamicContent (employeeNumber6) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 181-Click on div dynamicContent employeeNumber6 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 182: Click on link reportTo8 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo8'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 182-Click on link reportTo8 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 183: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 183-Click on button addSupervisor.png')

"Step 184: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_16)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 184-Enter input value in input typeForHintsReport.png')

"Step 185: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 185-Click on div optionMahtabSiddique.png')

"Step 186: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 186-Click on i iconForm.png')

"Step 187: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 187-Click on div optionDirect.png')

"Step 188: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 188-Click on button saveReport.png')

"Step 189: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 189-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 190: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_17)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 190-Enter input value in input typeForHints.png')

"Step 191: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 191-Click on button search.png')

"Step 192: Click on div dynamicContent (employeeNumber7) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_17]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 192-Click on div dynamicContent employeeNumber7 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 193: Click on link reportTo9 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo9'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 193-Click on link reportTo9 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 194: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 194-Click on button addSupervisor.png')

"Step 195: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_17)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 195-Enter input value in input typeForHintsReport.png')

"Step 196: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 196-Click on div optionMahtabSiddique.png')

"Step 197: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 197-Click on i iconForm.png')

"Step 198: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 198-Click on div optionDirect.png')

"Step 199: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 199-Click on button saveReport.png')

"Step 200: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 200-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 201: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_18)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 201-Enter input value in input typeForHints.png')

"Step 202: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 202-Click on button search.png')

"Step 203: Click on div dynamicContent (employeeNumber8) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_18]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 203-Click on div dynamicContent employeeNumber8 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 204: Click on link reportTo10 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo10'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 204-Click on link reportTo10 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 205: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 205-Click on button addSupervisor.png')

"Step 206: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_18)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 206-Enter input value in input typeForHintsReport.png')

"Step 207: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 207-Click on div optionMahtabSiddique.png')

"Step 208: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 208-Click on i iconForm.png')

"Step 209: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 209-Click on div optionDirect.png')

"Step 210: Click on button saveReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 210-Click on button saveReport.png')

"Step 211: Click on link pimReport -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_pimReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 211-Click on link pimReport - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 212: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_19)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 212-Enter input value in input typeForHints.png')

"Step 213: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 213-Click on button search.png')

"Step 214: Click on div dynamicContent (employeeNumber9) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_19]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 214-Click on div dynamicContent employeeNumber9 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 215: Click on link reportTo11 -> Navigate to page 'report view#web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_reportTo11'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 215-Click on link reportTo11 - Navigate to page report viewwebindexphpviewReportToDetailsempNumber.png')

"Step 216: Click on button addSupervisor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_addSupervisor'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 216-Click on button addSupervisor.png')

"Step 217: Enter input value in input typeForHintsReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report_view/input_typeForHintsReport'), input_typeForHintsReport_19)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 217-Enter input value in input typeForHintsReport.png')

"Step 218: Click on div optionMahtabSiddique"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionMahtabSiddique'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 218-Click on div optionMahtabSiddique.png')

"Step 219: Click on i iconForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/i_iconForm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 219-Click on i iconForm.png')

"Step 220: Click on div optionDirect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/div_optionDirect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 220-Click on div optionDirect.png')

"Step 221: Click on button saveReport -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/button_saveReport'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 221-Click on button saveReport - Navigate to page .png')

"Step 222: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Add Supervisors to Multiple Employees in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}