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

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 3: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Enter input value in input typeForHints.png')

"Step 4: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button search.png')

"Step 5: Click on div dynamicContent (code0218) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on div dynamicContent code0218 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 6: Click on link job -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on link job - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 7: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on i calendarIcon.png')

"Step 8: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on div calendarDate21.png')

"Step 9: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on i selectIconAfter.png')

"Step 10: Click on div jobTitleAutomationArchitect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleAutomationArchitect'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on div jobTitleAutomationArchitect.png')

"Step 11: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on i selectIconAfter2.png')

"Step 12: Click on div jobTitleProfessionals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleProfessionals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on div jobTitleProfessionals.png')

"Step 13: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on i selectIconAfter3.png')

"Step 14: Click on div jobTitleMarketingManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleMarketingManager'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on div jobTitleMarketingManager.png')

"Step 15: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on i selectIconAfter4.png')

"Step 16: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on div jobTitleOffice.png')

"Step 17: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on i selectIconAfter5.png')

"Step 18: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Click on div jobTitleFullTimePermanent.png')

"Step 19: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Click on button save.png')

"Step 20: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 21: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_1)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21-Enter input value in input typeForHints.png')

"Step 22: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Click on button search.png')

"Step 23: Click on div dynamicContent (code0219) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 23-Click on div dynamicContent code0219 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 24: Click on link job2 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 24-Click on link job2 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 25: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 25-Click on i calendarIcon.png')

"Step 26: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 26-Click on div calendarDate21.png')

"Step 27: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 27-Click on i selectIconAfter.png')

"Step 28: Click on div jobTitleAutomationArchitect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleAutomationArchitect'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 28-Click on div jobTitleAutomationArchitect.png')

"Step 29: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 29-Click on i selectIconAfter2.png')

"Step 30: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 30-Click on div jobTitleOfficialsAndManagers.png')

"Step 31: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 31-Click on i selectIconAfter3.png')

"Step 32: Click on div jobTitleMarketingManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleMarketingManager'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 32-Click on div jobTitleMarketingManager.png')

"Step 33: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 33-Click on i selectIconAfter4.png')

"Step 34: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 34-Click on div jobTitleOffice.png')

"Step 35: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 35-Click on i selectIconAfter5.png')

"Step 36: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 36-Click on div jobTitleFullTimePermanent.png')

"Step 37: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 37-Click on button save.png')

"Step 38: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 38-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 39: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_2)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 39-Enter input value in input typeForHints.png')

"Step 40: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 40-Click on button search.png')

"Step 41: Click on div dynamicContent (code0220) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 41-Click on div dynamicContent code0220 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 42: Click on link job3 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 42-Click on link job3 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 43: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 43-Click on i calendarIcon.png')

"Step 44: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 44-Click on div calendarDate21.png')

"Step 45: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 45-Click on i selectIconAfter.png')

"Step 46: Click on div jobTitleDataQualityEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleDataQualityEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 46-Click on div jobTitleDataQualityEngineer.png')

"Step 47: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 47-Click on i selectIconAfter2.png')

"Step 48: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 48-Click on div jobTitleOfficialsAndManagers.png')

"Step 49: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 49-Click on i selectIconAfter3.png')

"Step 50: Click on div jobTitleLeadDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleLeadDeveloper'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 50-Click on div jobTitleLeadDeveloper.png')

"Step 51: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 51-Click on i selectIconAfter4.png')

"Step 52: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 52-Click on div jobTitleOffice.png')

"Step 53: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 53-Click on i selectIconAfter5.png')

"Step 54: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 54-Click on div jobTitleFullTimePermanent.png')

"Step 55: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 55-Click on button save.png')

"Step 56: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 56-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 57: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_3)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 57-Enter input value in input typeForHints.png')

"Step 58: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 58-Click on button search.png')

"Step 59: Click on div dynamicContent (code0221) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 59-Click on div dynamicContent code0221 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 60: Click on link job4 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 60-Click on link job4 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 61: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 61-Click on i calendarIcon.png')

"Step 62: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 62-Click on div calendarDate21.png')

"Step 63: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 63-Click on i selectIconAfter.png')

"Step 64: Click on div jobTitleAutomationArchitect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleAutomationArchitect'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 64-Click on div jobTitleAutomationArchitect.png')

"Step 65: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 65-Click on i selectIconAfter2.png')

"Step 66: Click on div jobTitleProfessionals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleProfessionals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 66-Click on div jobTitleProfessionals.png')

"Step 67: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 67-Click on i selectIconAfter3.png')

"Step 68: Click on div jobTitleLeadDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleLeadDeveloper'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 68-Click on div jobTitleLeadDeveloper.png')

"Step 69: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 69-Click on i selectIconAfter4.png')

"Step 70: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 70-Click on div jobTitleOffice.png')

"Step 71: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 71-Click on i selectIconAfter5.png')

"Step 72: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 72-Click on div jobTitleFullTimePermanent.png')

"Step 73: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 73-Click on button save.png')

"Step 74: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 74-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 75: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_4)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 75-Enter input value in input typeForHints.png')

"Step 76: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 76-Click on button search.png')

"Step 77: Click on div dynamicContent (code0222) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 77-Click on div dynamicContent code0222 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 78: Click on link job5 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 78-Click on link job5 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 79: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 79-Click on i calendarIcon.png')

"Step 80: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 80-Click on div calendarDate21.png')

"Step 81: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 81-Click on i selectIconAfter.png')

"Step 82: Click on div jobTitleApiautomationTester"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleApiautomationTester'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 82-Click on div jobTitleApiautomationTester.png')

"Step 83: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 83-Click on i selectIconAfter2.png')

"Step 84: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 84-Click on div jobTitleOfficialsAndManagers.png')

"Step 85: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 85-Click on i selectIconAfter3.png')

"Step 86: Click on div jobTitleQatester"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleQatester'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 86-Click on div jobTitleQatester.png')

"Step 87: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 87-Click on i selectIconAfter4.png')

"Step 88: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 88-Click on div jobTitleOffice.png')

"Step 89: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 89-Click on i selectIconAfter5.png')

"Step 90: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 90-Click on div jobTitleFullTimePermanent.png')

"Step 91: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 91-Click on button save.png')

"Step 92: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 92-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 93: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_5)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 93-Enter input value in input typeForHints.png')

"Step 94: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 94-Click on button search.png')

"Step 95: Click on div dynamicContent (code0223) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 95-Click on div dynamicContent code0223 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 96: Click on link job6 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job6'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 96-Click on link job6 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 97: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 97-Click on i calendarIcon.png')

"Step 98: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 98-Click on div calendarDate21.png')

"Step 99: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 99-Click on i selectIconAfter.png')

"Step 100: Click on div jobTitleAutomationArchitect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleAutomationArchitect'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 100-Click on div jobTitleAutomationArchitect.png')

"Step 101: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 101-Click on i selectIconAfter2.png')

"Step 102: Click on div jobTitleProfessionals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleProfessionals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 102-Click on div jobTitleProfessionals.png')

"Step 103: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 103-Click on i selectIconAfter3.png')

"Step 104: Click on div jobTitleMarketingManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleMarketingManager'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 104-Click on div jobTitleMarketingManager.png')

"Step 105: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 105-Click on i selectIconAfter4.png')

"Step 106: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 106-Click on div jobTitleOffice.png')

"Step 107: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 107-Click on i selectIconAfter5.png')

"Step 108: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 108-Click on div jobTitleFullTimePermanent.png')

"Step 109: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 109-Click on button save.png')

"Step 110: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 110-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 111: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_6)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 111-Enter input value in input typeForHints.png')

"Step 112: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 112-Click on button search.png')

"Step 113: Click on div dynamicContent (code0224) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 113-Click on div dynamicContent code0224 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 114: Click on link job7 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job7'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 114-Click on link job7 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 115: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 115-Click on i calendarIcon.png')

"Step 116: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 116-Click on div calendarDate21.png')

"Step 117: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 117-Click on i selectIconAfter.png')

"Step 118: Click on div jobTitleCiCdtestEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleCiCdtestEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 118-Click on div jobTitleCiCdtestEngineer.png')

"Step 119: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 119-Click on i selectIconAfter2.png')

"Step 120: Click on div jobTitleProfessionals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleProfessionals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 120-Click on div jobTitleProfessionals.png')

"Step 121: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 121-Click on i selectIconAfter3.png')

"Step 122: Click on div jobTitleItmanager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleItmanager'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 122-Click on div jobTitleItmanager.png')

"Step 123: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 123-Click on i selectIconAfter4.png')

"Step 124: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 124-Click on div jobTitleOffice.png')

"Step 125: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 125-Click on i selectIconAfter5.png')

"Step 126: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 126-Click on div jobTitleFullTimePermanent.png')

"Step 127: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 127-Click on button save.png')

"Step 128: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 128-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 129: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_7)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 129-Enter input value in input typeForHints.png')

"Step 130: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 130-Click on button search.png')

"Step 131: Click on div dynamicContent (code0225) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 131-Click on div dynamicContent code0225 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 132: Click on link job8 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job8'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 132-Click on link job8 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 133: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 133-Click on i calendarIcon.png')

"Step 134: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 134-Click on div calendarDate21.png')

"Step 135: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 135-Click on i selectIconAfter.png')

"Step 136: Click on div jobTitleAitestEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleAitestEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 136-Click on div jobTitleAitestEngineer.png')

"Step 137: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 137-Click on i selectIconAfter2.png')

"Step 138: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 138-Click on div jobTitleOfficialsAndManagers.png')

"Step 139: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 139-Click on i selectIconAfter3.png')

"Step 140: Click on div jobTitleSoftwareDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleSoftwareDeveloper'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 140-Click on div jobTitleSoftwareDeveloper.png')

"Step 141: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 141-Click on i selectIconAfter4.png')

"Step 142: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 142-Click on div jobTitleOffice.png')

"Step 143: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 143-Click on i selectIconAfter5.png')

"Step 144: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 144-Click on div jobTitleFullTimePermanent.png')

"Step 145: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 145-Click on button save.png')

"Step 146: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 146-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 147: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_8)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 147-Enter input value in input typeForHints.png')

"Step 148: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 148-Click on button search.png')

"Step 149: Click on div dynamicContent (code0226) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 149-Click on div dynamicContent code0226 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 150: Click on link job9 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job9'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 150-Click on link job9 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 151: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 151-Click on i calendarIcon.png')

"Step 152: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 152-Click on div calendarDate21.png')

"Step 153: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 153-Click on i selectIconAfter.png')

"Step 154: Click on div jobTitleApiautomationTester"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleApiautomationTester'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 154-Click on div jobTitleApiautomationTester.png')

"Step 155: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 155-Click on i selectIconAfter2.png')

"Step 156: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 156-Click on div jobTitleOfficialsAndManagers.png')

"Step 157: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 157-Click on i selectIconAfter3.png')

"Step 158: Click on div jobTitleItmanager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleItmanager'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 158-Click on div jobTitleItmanager.png')

"Step 159: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 159-Click on i selectIconAfter4.png')

"Step 160: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 160-Click on div jobTitleOffice.png')

"Step 161: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 161-Click on i selectIconAfter5.png')

"Step 162: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 162-Click on div jobTitleFullTimePermanent.png')

"Step 163: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 163-Click on button save.png')

"Step 164: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 164-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 165: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_9)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 165-Enter input value in input typeForHints.png')

"Step 166: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 166-Click on button search.png')

"Step 167: Click on div dynamicContent (code0227) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 167-Click on div dynamicContent code0227 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 168: Click on link job10 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job10'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 168-Click on link job10 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 169: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 169-Click on i calendarIcon.png')

"Step 170: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 170-Click on div calendarDate21.png')

"Step 171: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 171-Click on i selectIconAfter.png')

"Step 172: Click on div jobTitleCiCdtestEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleCiCdtestEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 172-Click on div jobTitleCiCdtestEngineer.png')

"Step 173: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 173-Click on i selectIconAfter2.png')

"Step 174: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 174-Click on div jobTitleOfficialsAndManagers.png')

"Step 175: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 175-Click on i selectIconAfter3.png')

"Step 176: Click on div jobTitleLeadDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleLeadDeveloper'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 176-Click on div jobTitleLeadDeveloper.png')

"Step 177: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 177-Click on i selectIconAfter4.png')

"Step 178: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 178-Click on div jobTitleOffice.png')

"Step 179: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 179-Click on i selectIconAfter5.png')

"Step 180: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 180-Click on div jobTitleFullTimePermanent.png')

"Step 181: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 181-Click on button save.png')

"Step 182: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 182-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 183: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_10)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 183-Enter input value in input typeForHints.png')

"Step 184: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 184-Click on button search.png')

"Step 185: Click on div dynamicContent (code0228) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 185-Click on div dynamicContent code0228 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 186: Click on link job11 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_job11'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 186-Click on link job11 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 187: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 187-Click on i calendarIcon.png')

"Step 188: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 188-Click on div calendarDate21.png')

"Step 189: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 189-Click on i selectIconAfter.png')

"Step 190: Click on div jobTitleApiautomationTester"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleApiautomationTester'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 190-Click on div jobTitleApiautomationTester.png')

"Step 191: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 191-Click on i selectIconAfter2.png')

"Step 192: Click on div jobTitleProfessionals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleProfessionals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 192-Click on div jobTitleProfessionals.png')

"Step 193: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 193-Click on i selectIconAfter3.png')

"Step 194: Click on div jobTitleSoftwareDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleSoftwareDeveloper'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 194-Click on div jobTitleSoftwareDeveloper.png')

"Step 195: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 195-Click on i selectIconAfter4.png')

"Step 196: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 196-Click on div jobTitleOffice.png')

"Step 197: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 197-Click on i selectIconAfter5.png')

"Step 198: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 198-Click on div jobTitleFullTimePermanent.png')

"Step 199: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 199-Click on button save.png')

"Step 200: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 200-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 201: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_11)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 201-Enter input value in input typeForHints.png')

"Step 202: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 202-Click on button search.png')

"Step 203: Click on div dynamicContent (employeeNumber) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 203-Click on div dynamicContent employeeNumber - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 204: Click on link viewJob -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewJob'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 204-Click on link viewJob - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 205: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 205-Click on i calendarIcon.png')

"Step 206: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 206-Click on div calendarDate21.png')

"Step 207: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 207-Click on i selectIconAfter.png')

"Step 208: Click on div jobTitleDataQualityEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleDataQualityEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 208-Click on div jobTitleDataQualityEngineer.png')

"Step 209: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 209-Click on i selectIconAfter2.png')

"Step 210: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 210-Click on div jobTitleOfficialsAndManagers.png')

"Step 211: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 211-Click on i selectIconAfter3.png')

"Step 212: Click on div jobTitleSoftwareDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleSoftwareDeveloper'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 212-Click on div jobTitleSoftwareDeveloper.png')

"Step 213: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 213-Click on i selectIconAfter4.png')

"Step 214: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 214-Click on div jobTitleOffice.png')

"Step 215: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 215-Click on i selectIconAfter5.png')

"Step 216: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 216-Click on div jobTitleFullTimePermanent.png')

"Step 217: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 217-Click on button save.png')

"Step 218: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 218-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 219: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_12)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 219-Enter input value in input typeForHints.png')

"Step 220: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 220-Click on button search.png')

"Step 221: Click on div dynamicContent (employeeNumber2) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 221-Click on div dynamicContent employeeNumber2 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 222: Click on link viewJob2 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewJob2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 222-Click on link viewJob2 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 223: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 223-Click on i calendarIcon.png')

"Step 224: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 224-Click on div calendarDate21.png')

"Step 225: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 225-Click on i selectIconAfter.png')

"Step 226: Click on div jobTitleApiautomationTester"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleApiautomationTester'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 226-Click on div jobTitleApiautomationTester.png')

"Step 227: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 227-Click on i selectIconAfter2.png')

"Step 228: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 228-Click on div jobTitleOfficialsAndManagers.png')

"Step 229: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 229-Click on i selectIconAfter3.png')

"Step 230: Click on div jobTitleLeadDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleLeadDeveloper'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 230-Click on div jobTitleLeadDeveloper.png')

"Step 231: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 231-Click on i selectIconAfter4.png')

"Step 232: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 232-Click on div jobTitleOffice.png')

"Step 233: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 233-Click on i selectIconAfter5.png')

"Step 234: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 234-Click on div jobTitleFullTimePermanent.png')

"Step 235: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 235-Click on button save.png')

"Step 236: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 236-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 237: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_13)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 237-Enter input value in input typeForHints.png')

"Step 238: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 238-Click on button search.png')

"Step 239: Click on div dynamicContent (employeeNumber3) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 239-Click on div dynamicContent employeeNumber3 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 240: Click on link viewJob3 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewJob3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 240-Click on link viewJob3 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 241: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 241-Click on i calendarIcon.png')

"Step 242: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 242-Click on div calendarDate21.png')

"Step 243: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 243-Click on i selectIconAfter.png')

"Step 244: Click on div jobTitleCiCdtestEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleCiCdtestEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 244-Click on div jobTitleCiCdtestEngineer.png')

"Step 245: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 245-Click on i selectIconAfter2.png')

"Step 246: Click on div jobTitleProfessionals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleProfessionals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 246-Click on div jobTitleProfessionals.png')

"Step 247: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 247-Click on i selectIconAfter3.png')

"Step 248: Click on div jobTitleMarketingManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleMarketingManager'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 248-Click on div jobTitleMarketingManager.png')

"Step 249: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 249-Click on i selectIconAfter4.png')

"Step 250: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 250-Click on div jobTitleOffice.png')

"Step 251: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 251-Click on i selectIconAfter5.png')

"Step 252: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 252-Click on div jobTitleFullTimePermanent.png')

"Step 253: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 253-Click on button save.png')

"Step 254: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 254-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 255: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_14)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 255-Enter input value in input typeForHints.png')

"Step 256: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 256-Click on button search.png')

"Step 257: Click on div dynamicContent (employeeNumber4) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 257-Click on div dynamicContent employeeNumber4 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 258: Click on link viewJob4 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewJob4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 258-Click on link viewJob4 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 259: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 259-Click on i calendarIcon.png')

"Step 260: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 260-Click on div calendarDate21.png')

"Step 261: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 261-Click on i selectIconAfter.png')

"Step 262: Click on div jobTitleCiCdtestEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleCiCdtestEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 262-Click on div jobTitleCiCdtestEngineer.png')

"Step 263: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 263-Click on i selectIconAfter2.png')

"Step 264: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 264-Click on div jobTitleOfficialsAndManagers.png')

"Step 265: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 265-Click on i selectIconAfter3.png')

"Step 266: Click on div jobTitleLeadDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleLeadDeveloper'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 266-Click on div jobTitleLeadDeveloper.png')

"Step 267: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 267-Click on i selectIconAfter4.png')

"Step 268: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 268-Click on div jobTitleOffice.png')

"Step 269: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 269-Click on i selectIconAfter5.png')

"Step 270: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 270-Click on div jobTitleFullTimePermanent.png')

"Step 271: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 271-Click on button save.png')

"Step 272: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 272-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 273: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_15)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 273-Enter input value in input typeForHints.png')

"Step 274: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 274-Click on button search.png')

"Step 275: Click on div dynamicContent (employeeNumber5) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 275-Click on div dynamicContent employeeNumber5 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 276: Click on link viewJob5 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewJob5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 276-Click on link viewJob5 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 277: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 277-Click on i calendarIcon.png')

"Step 278: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 278-Click on div calendarDate21.png')

"Step 279: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 279-Click on i selectIconAfter.png')

"Step 280: Click on div jobTitleCiCdtestEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleCiCdtestEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 280-Click on div jobTitleCiCdtestEngineer.png')

"Step 281: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 281-Click on i selectIconAfter2.png')

"Step 282: Click on div jobTitleProfessionals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleProfessionals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 282-Click on div jobTitleProfessionals.png')

"Step 283: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 283-Click on i selectIconAfter3.png')

"Step 284: Click on div jobTitleMarketingManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleMarketingManager'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 284-Click on div jobTitleMarketingManager.png')

"Step 285: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 285-Click on i selectIconAfter4.png')

"Step 286: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 286-Click on div jobTitleOffice.png')

"Step 287: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 287-Click on i selectIconAfter5.png')

"Step 288: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 288-Click on div jobTitleFullTimePermanent.png')

"Step 289: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 289-Click on button save.png')

"Step 290: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 290-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 291: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_16)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 291-Enter input value in input typeForHints.png')

"Step 292: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 292-Click on button search.png')

"Step 293: Click on div dynamicContent (employeeNumber6) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 293-Click on div dynamicContent employeeNumber6 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 294: Click on link viewJob6 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewJob6'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 294-Click on link viewJob6 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 295: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 295-Click on i calendarIcon.png')

"Step 296: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 296-Click on div calendarDate21.png')

"Step 297: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 297-Click on i selectIconAfter.png')

"Step 298: Click on div jobTitleCiCdtestEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleCiCdtestEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 298-Click on div jobTitleCiCdtestEngineer.png')

"Step 299: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 299-Click on i selectIconAfter2.png')

"Step 300: Click on div jobTitleProfessionals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleProfessionals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 300-Click on div jobTitleProfessionals.png')

"Step 301: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 301-Click on i selectIconAfter3.png')

"Step 302: Click on div jobTitleItmanager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleItmanager'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 302-Click on div jobTitleItmanager.png')

"Step 303: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 303-Click on i selectIconAfter4.png')

"Step 304: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 304-Click on div jobTitleOffice.png')

"Step 305: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 305-Click on i selectIconAfter5.png')

"Step 306: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 306-Click on div jobTitleFullTimePermanent.png')

"Step 307: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 307-Click on button save.png')

"Step 308: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 308-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 309: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_17)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 309-Enter input value in input typeForHints.png')

"Step 310: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 310-Click on button search.png')

"Step 311: Click on div dynamicContent (employeeNumber7) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_17]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 311-Click on div dynamicContent employeeNumber7 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 312: Click on link viewJob7 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewJob7'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 312-Click on link viewJob7 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 313: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 313-Click on i calendarIcon.png')

"Step 314: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 314-Click on div calendarDate21.png')

"Step 315: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 315-Click on i selectIconAfter.png')

"Step 316: Click on div jobTitleAitestEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleAitestEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 316-Click on div jobTitleAitestEngineer.png')

"Step 317: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 317-Click on i selectIconAfter2.png')

"Step 318: Click on div jobTitleProfessionals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleProfessionals'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 318-Click on div jobTitleProfessionals.png')

"Step 319: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 319-Click on i selectIconAfter3.png')

"Step 320: Click on div jobTitleMarketingManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleMarketingManager'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 320-Click on div jobTitleMarketingManager.png')

"Step 321: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 321-Click on i selectIconAfter4.png')

"Step 322: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 322-Click on div jobTitleOffice.png')

"Step 323: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 323-Click on i selectIconAfter5.png')

"Step 324: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 324-Click on div jobTitleFullTimePermanent.png')

"Step 325: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 325-Click on button save.png')

"Step 326: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 326-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 327: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_18)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 327-Enter input value in input typeForHints.png')

"Step 328: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 328-Click on button search.png')

"Step 329: Click on div dynamicContent (employeeNumber8) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_18]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 329-Click on div dynamicContent employeeNumber8 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 330: Click on link viewJob8 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewJob8'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 330-Click on link viewJob8 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 331: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 331-Click on i calendarIcon.png')

"Step 332: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 332-Click on div calendarDate21.png')

"Step 333: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 333-Click on i selectIconAfter.png')

"Step 334: Click on div jobTitleCiCdtestEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleCiCdtestEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 334-Click on div jobTitleCiCdtestEngineer.png')

"Step 335: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 335-Click on i selectIconAfter2.png')

"Step 336: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 336-Click on div jobTitleOfficialsAndManagers.png')

"Step 337: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 337-Click on i selectIconAfter3.png')

"Step 338: Click on div jobTitleLeadDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleLeadDeveloper'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 338-Click on div jobTitleLeadDeveloper.png')

"Step 339: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 339-Click on i selectIconAfter4.png')

"Step 340: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 340-Click on div jobTitleOffice.png')

"Step 341: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 341-Click on i selectIconAfter5.png')

"Step 342: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 342-Click on div jobTitleFullTimePermanent.png')

"Step 343: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 343-Click on button save.png')

"Step 344: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 344-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 345: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_19)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 345-Enter input value in input typeForHints.png')

"Step 346: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 346-Click on button search.png')

"Step 347: Click on div dynamicContent (employeeNumber9) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_19]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 347-Click on div dynamicContent employeeNumber9 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 348: Click on link viewJob9 -> Navigate to page 'job details view#web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_viewJob9'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 348-Click on link viewJob9 - Navigate to page job details viewwebindexphpviewJobDetailsempNumber.png')

"Step 349: Click on i calendarIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_calendarIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 349-Click on i calendarIcon.png')

"Step 350: Click on div calendarDate21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_calendarDate21'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 350-Click on div calendarDate21.png')

"Step 351: Click on i selectIconAfter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 351-Click on i selectIconAfter.png')

"Step 352: Click on div jobTitleDataQualityEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleDataQualityEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 352-Click on div jobTitleDataQualityEngineer.png')

"Step 353: Click on i selectIconAfter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 353-Click on i selectIconAfter2.png')

"Step 354: Click on div jobTitleOfficialsAndManagers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOfficialsAndManagers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 354-Click on div jobTitleOfficialsAndManagers.png')

"Step 355: Click on i selectIconAfter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 355-Click on i selectIconAfter3.png')

"Step 356: Click on div jobTitleMarketingManager"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleMarketingManager'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 356-Click on div jobTitleMarketingManager.png')

"Step 357: Click on i selectIconAfter4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 357-Click on i selectIconAfter4.png')

"Step 358: Click on div jobTitleOffice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleOffice'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 358-Click on div jobTitleOffice.png')

"Step 359: Click on i selectIconAfter5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_selectIconAfter5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 359-Click on i selectIconAfter5.png')

"Step 360: Click on div jobTitleFullTimePermanent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_jobTitleFullTimePermanent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 360-Click on div jobTitleFullTimePermanent.png')

"Step 361: Click on button save -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 361-Click on button save - Navigate to page .png')

"Step 362: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Manage Job Titles for Multiple Employees in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}