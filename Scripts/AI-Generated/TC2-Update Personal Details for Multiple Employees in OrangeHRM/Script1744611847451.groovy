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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 3: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Enter input value in input typeForHints.png')

"Step 4: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button search.png')

"Step 5: Click on div dynamicContent (code0218) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on div dynamicContent code0218 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 6: Click on link personalDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link personalDetails.png')

"Step 7: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Enter input value in input driverLicenseNumber.png')

"Step 8: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Enter input value in input licenseExpiryDate.png')

"Step 9: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on div selectPlaceholder.png')

"Step 10: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on div optionIndian.png')

"Step 11: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on div selectPlaceholder2.png')

"Step 12: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on div optionSingle.png')

"Step 13: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Enter input value in input dateOfBirth.png')

"Step 14: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on label genderMale.png')

"Step 15: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on button save.png')

"Step 16: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 17: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_1)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Enter input value in input typeForHints.png')

"Step 18: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on button search.png')

"Step 19: Click on div dynamicContent (code0219) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on div dynamicContent code0219 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 20: Click on link personalDetails2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on link personalDetails2.png')

"Step 21: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_1)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Enter input value in input driverLicenseNumber.png')

"Step 22: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_1)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Enter input value in input licenseExpiryDate.png')

"Step 23: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Click on div selectPlaceholder.png')

"Step 24: Click on div optionAmerican"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionAmerican'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Click on div optionAmerican.png')

"Step 25: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Click on div selectPlaceholder2.png')

"Step 26: Click on div optionMarried"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionMarried'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Click on div optionMarried.png')

"Step 27: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_1)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Enter input value in input dateOfBirth.png')

"Step 28: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Click on label genderMale.png')

"Step 29: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on button save.png')

"Step 30: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 31: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Enter input value in input typeForHints.png')

"Step 32: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Click on button search.png')

"Step 33: Click on div dynamicContent (code0220) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Click on div dynamicContent code0220 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 34: Click on link personalDetails3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails3'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 34-Click on link personalDetails3.png')

"Step 35: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 35-Enter input value in input driverLicenseNumber.png')

"Step 36: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 36-Enter input value in input licenseExpiryDate.png')

"Step 37: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 37-Click on div selectPlaceholder.png')

"Step 38: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 38-Click on div optionIndian.png')

"Step 39: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 39-Click on div selectPlaceholder2.png')

"Step 40: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 40-Click on div optionSingle.png')

"Step 41: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 41-Enter input value in input dateOfBirth.png')

"Step 42: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 42-Click on label genderMale.png')

"Step 43: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 43-Click on button save.png')

"Step 44: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 44-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 45: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_3)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 45-Enter input value in input typeForHints.png')

"Step 46: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 46-Click on button search.png')

"Step 47: Click on div dynamicContent (code0221) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 47-Click on div dynamicContent code0221 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 48: Click on link personalDetails4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails4'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 48-Click on link personalDetails4.png')

"Step 49: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_3)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 49-Enter input value in input driverLicenseNumber.png')

"Step 50: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_3)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 50-Enter input value in input licenseExpiryDate.png')

"Step 51: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 51-Click on div selectPlaceholder.png')

"Step 52: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 52-Click on div optionIndian.png')

"Step 53: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 53-Click on div selectPlaceholder2.png')

"Step 54: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 54-Click on div optionSingle.png')

"Step 55: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_3)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 55-Enter input value in input dateOfBirth.png')

"Step 56: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 56-Click on label genderMale.png')

"Step 57: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 57-Click on button save.png')

"Step 58: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 58-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 59: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_4)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 59-Enter input value in input typeForHints.png')

"Step 60: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 60-Click on button search.png')

"Step 61: Click on div dynamicContent (code0222) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 61-Click on div dynamicContent code0222 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 62: Click on link personalDetails5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails5'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 62-Click on link personalDetails5.png')

"Step 63: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_4)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 63-Enter input value in input driverLicenseNumber.png')

"Step 64: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_4)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 64-Enter input value in input licenseExpiryDate.png')

"Step 65: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 65-Click on div selectPlaceholder.png')

"Step 66: Click on div optionAmerican"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionAmerican'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 66-Click on div optionAmerican.png')

"Step 67: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 67-Click on div selectPlaceholder2.png')

"Step 68: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 68-Click on div optionSingle.png')

"Step 69: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_4)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 69-Enter input value in input dateOfBirth.png')

"Step 70: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 70-Click on label genderMale.png')

"Step 71: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 71-Click on button save.png')

"Step 72: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 72-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 73: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_5)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 73-Enter input value in input typeForHints.png')

"Step 74: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 74-Click on button search.png')

"Step 75: Click on div dynamicContent (code0223) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 75-Click on div dynamicContent code0223 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 76: Click on link personalDetails6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails6'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 76-Click on link personalDetails6.png')

"Step 77: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_5)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 77-Enter input value in input driverLicenseNumber.png')

"Step 78: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_5)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 78-Enter input value in input licenseExpiryDate.png')

"Step 79: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 79-Click on div selectPlaceholder.png')

"Step 80: Click on div optionAmerican"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionAmerican'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 80-Click on div optionAmerican.png')

"Step 81: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 81-Click on div selectPlaceholder2.png')

"Step 82: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 82-Click on div optionSingle.png')

"Step 83: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_5)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 83-Enter input value in input dateOfBirth.png')

"Step 84: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 84-Click on label genderMale.png')

"Step 85: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 85-Click on button save.png')

"Step 86: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 86-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 87: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_6)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 87-Enter input value in input typeForHints.png')

"Step 88: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 88-Click on button search.png')

"Step 89: Click on div dynamicContent (code0224) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 89-Click on div dynamicContent code0224 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 90: Click on link personalDetails7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails7'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 90-Click on link personalDetails7.png')

"Step 91: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_6)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 91-Enter input value in input driverLicenseNumber.png')

"Step 92: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_6)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 92-Enter input value in input licenseExpiryDate.png')

"Step 93: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 93-Click on div selectPlaceholder.png')

"Step 94: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 94-Click on div optionIndian.png')

"Step 95: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 95-Click on div selectPlaceholder2.png')

"Step 96: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 96-Click on div optionSingle.png')

"Step 97: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_6)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 97-Enter input value in input dateOfBirth.png')

"Step 98: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 98-Click on label genderMale.png')

"Step 99: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 99-Click on button save.png')

"Step 100: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 100-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 101: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_7)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 101-Enter input value in input typeForHints.png')

"Step 102: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 102-Click on button search.png')

"Step 103: Click on div dynamicContent (code0225) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 103-Click on div dynamicContent code0225 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 104: Click on link personalDetails8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails8'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 104-Click on link personalDetails8.png')

"Step 105: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_7)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 105-Enter input value in input driverLicenseNumber.png')

"Step 106: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_7)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 106-Enter input value in input licenseExpiryDate.png')

"Step 107: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 107-Click on div selectPlaceholder.png')

"Step 108: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 108-Click on div optionIndian.png')

"Step 109: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 109-Click on div selectPlaceholder2.png')

"Step 110: Click on div optionMarried"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionMarried'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 110-Click on div optionMarried.png')

"Step 111: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_7)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 111-Enter input value in input dateOfBirth.png')

"Step 112: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 112-Click on label genderMale.png')

"Step 113: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 113-Click on button save.png')

"Step 114: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 114-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 115: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_8)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 115-Enter input value in input typeForHints.png')

"Step 116: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 116-Click on button search.png')

"Step 117: Click on div dynamicContent (code0226) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 117-Click on div dynamicContent code0226 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 118: Click on link personalDetails9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails9'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 118-Click on link personalDetails9.png')

"Step 119: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_8)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 119-Enter input value in input driverLicenseNumber.png')

"Step 120: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_8)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 120-Enter input value in input licenseExpiryDate.png')

"Step 121: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 121-Click on div selectPlaceholder.png')

"Step 122: Click on div optionAmerican"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionAmerican'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 122-Click on div optionAmerican.png')

"Step 123: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 123-Click on div selectPlaceholder2.png')

"Step 124: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 124-Click on div optionSingle.png')

"Step 125: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_8)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 125-Enter input value in input dateOfBirth.png')

"Step 126: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 126-Click on label genderMale.png')

"Step 127: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 127-Click on button save.png')

"Step 128: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 128-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 129: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_9)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 129-Enter input value in input typeForHints.png')

"Step 130: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 130-Click on button search.png')

"Step 131: Click on div dynamicContent (code0227) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 131-Click on div dynamicContent code0227 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 132: Click on link personalDetails10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails10'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 132-Click on link personalDetails10.png')

"Step 133: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_9)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 133-Enter input value in input driverLicenseNumber.png')

"Step 134: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_9)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 134-Enter input value in input licenseExpiryDate.png')

"Step 135: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 135-Click on div selectPlaceholder.png')

"Step 136: Click on div optionAmerican"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionAmerican'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 136-Click on div optionAmerican.png')

"Step 137: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 137-Click on div selectPlaceholder2.png')

"Step 138: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 138-Click on div optionSingle.png')

"Step 139: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_9)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 139-Enter input value in input dateOfBirth.png')

"Step 140: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 140-Click on label genderMale.png')

"Step 141: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 141-Click on button save.png')

"Step 142: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 142-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 143: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_10)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 143-Enter input value in input typeForHints.png')

"Step 144: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 144-Click on button search.png')

"Step 145: Click on div dynamicContent (code0228) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 145-Click on div dynamicContent code0228 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 146: Click on link personalDetails11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails11'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 146-Click on link personalDetails11.png')

"Step 147: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_10)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 147-Enter input value in input driverLicenseNumber.png')

"Step 148: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_10)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 148-Enter input value in input licenseExpiryDate.png')

"Step 149: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 149-Click on div selectPlaceholder.png')

"Step 150: Click on div optionAmerican"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionAmerican'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 150-Click on div optionAmerican.png')

"Step 151: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 151-Click on div selectPlaceholder2.png')

"Step 152: Click on div optionMarried"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionMarried'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 152-Click on div optionMarried.png')

"Step 153: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_10)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 153-Enter input value in input dateOfBirth.png')

"Step 154: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 154-Click on label genderMale.png')

"Step 155: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 155-Click on button save.png')

"Step 156: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 156-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 157: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_11)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 157-Enter input value in input typeForHints.png')

"Step 158: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 158-Click on button search.png')

"Step 159: Click on div dynamicContent (employeeNumber) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 159-Click on div dynamicContent employeeNumber - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 160: Click on link personalDetails12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails12'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 160-Click on link personalDetails12.png')

"Step 161: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_11)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 161-Enter input value in input driverLicenseNumber.png')

"Step 162: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_11)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 162-Enter input value in input licenseExpiryDate.png')

"Step 163: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 163-Click on div selectPlaceholder.png')

"Step 164: Click on div optionAmerican"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionAmerican'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 164-Click on div optionAmerican.png')

"Step 165: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 165-Click on div selectPlaceholder2.png')

"Step 166: Click on div optionMarried"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionMarried'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 166-Click on div optionMarried.png')

"Step 167: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_11)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 167-Enter input value in input dateOfBirth.png')

"Step 168: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 168-Click on label genderMale.png')

"Step 169: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 169-Click on button save.png')

"Step 170: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 170-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 171: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_12)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 171-Enter input value in input typeForHints.png')

"Step 172: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 172-Click on button search.png')

"Step 173: Click on div dynamicContent (employeeNumber2) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 173-Click on div dynamicContent employeeNumber2 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 174: Click on link personalDetails13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails13'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 174-Click on link personalDetails13.png')

"Step 175: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_12)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 175-Enter input value in input driverLicenseNumber.png')

"Step 176: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_12)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 176-Enter input value in input licenseExpiryDate.png')

"Step 177: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 177-Click on div selectPlaceholder.png')

"Step 178: Click on div optionAmerican"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionAmerican'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 178-Click on div optionAmerican.png')

"Step 179: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 179-Click on div selectPlaceholder2.png')

"Step 180: Click on div optionMarried"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionMarried'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 180-Click on div optionMarried.png')

"Step 181: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_12)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 181-Enter input value in input dateOfBirth.png')

"Step 182: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 182-Click on label genderMale.png')

"Step 183: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 183-Click on button save.png')

"Step 184: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 184-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 185: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_13)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 185-Enter input value in input typeForHints.png')

"Step 186: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 186-Click on button search.png')

"Step 187: Click on div dynamicContent (employeeNumber3) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 187-Click on div dynamicContent employeeNumber3 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 188: Click on link personalDetails14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails14'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 188-Click on link personalDetails14.png')

"Step 189: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_13)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 189-Enter input value in input driverLicenseNumber.png')

"Step 190: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_13)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 190-Enter input value in input licenseExpiryDate.png')

"Step 191: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 191-Click on div selectPlaceholder.png')

"Step 192: Click on div optionAmerican"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionAmerican'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 192-Click on div optionAmerican.png')

"Step 193: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 193-Click on div selectPlaceholder2.png')

"Step 194: Click on div optionMarried"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionMarried'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 194-Click on div optionMarried.png')

"Step 195: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_13)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 195-Enter input value in input dateOfBirth.png')

"Step 196: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 196-Click on label genderMale.png')

"Step 197: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 197-Click on button save.png')

"Step 198: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 198-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 199: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_14)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 199-Enter input value in input typeForHints.png')

"Step 200: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 200-Click on button search.png')

"Step 201: Click on div dynamicContent (employeeNumber4) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 201-Click on div dynamicContent employeeNumber4 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 202: Click on link personalDetails15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails15'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 202-Click on link personalDetails15.png')

"Step 203: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_14)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 203-Enter input value in input driverLicenseNumber.png')

"Step 204: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_14)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 204-Enter input value in input licenseExpiryDate.png')

"Step 205: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 205-Click on div selectPlaceholder.png')

"Step 206: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 206-Click on div optionIndian.png')

"Step 207: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 207-Click on div selectPlaceholder2.png')

"Step 208: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 208-Click on div optionSingle.png')

"Step 209: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_14)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 209-Enter input value in input dateOfBirth.png')

"Step 210: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 210-Click on label genderMale.png')

"Step 211: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 211-Click on button save.png')

"Step 212: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 212-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 213: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_15)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 213-Enter input value in input typeForHints.png')

"Step 214: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 214-Click on button search.png')

"Step 215: Click on div dynamicContent (employeeNumber5) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 215-Click on div dynamicContent employeeNumber5 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 216: Click on link personalDetails16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails16'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 216-Click on link personalDetails16.png')

"Step 217: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_15)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 217-Enter input value in input driverLicenseNumber.png')

"Step 218: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_15)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 218-Enter input value in input licenseExpiryDate.png')

"Step 219: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 219-Click on div selectPlaceholder.png')

"Step 220: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 220-Click on div optionIndian.png')

"Step 221: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 221-Click on div selectPlaceholder2.png')

"Step 222: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 222-Click on div optionSingle.png')

"Step 223: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_15)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 223-Enter input value in input dateOfBirth.png')

"Step 224: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 224-Click on label genderMale.png')

"Step 225: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 225-Click on button save.png')

"Step 226: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 226-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 227: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_16)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 227-Enter input value in input typeForHints.png')

"Step 228: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 228-Click on button search.png')

"Step 229: Click on div dynamicContent (employeeNumber6) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 229-Click on div dynamicContent employeeNumber6 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 230: Click on link personalDetails17"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails17'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 230-Click on link personalDetails17.png')

"Step 231: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_16)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 231-Enter input value in input driverLicenseNumber.png')

"Step 232: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_16)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 232-Enter input value in input licenseExpiryDate.png')

"Step 233: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 233-Click on div selectPlaceholder.png')

"Step 234: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 234-Click on div optionIndian.png')

"Step 235: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 235-Click on div selectPlaceholder2.png')

"Step 236: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 236-Click on div optionSingle.png')

"Step 237: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_16)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 237-Enter input value in input dateOfBirth.png')

"Step 238: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 238-Click on label genderMale.png')

"Step 239: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 239-Click on button save.png')

"Step 240: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 240-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 241: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_17)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 241-Enter input value in input typeForHints.png')

"Step 242: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 242-Click on button search.png')

"Step 243: Click on div dynamicContent (employeeNumber7) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_17]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 243-Click on div dynamicContent employeeNumber7 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 244: Click on link personalDetails18"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails18'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 244-Click on link personalDetails18.png')

"Step 245: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_17)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 245-Enter input value in input driverLicenseNumber.png')

"Step 246: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_17)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 246-Enter input value in input licenseExpiryDate.png')

"Step 247: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 247-Click on div selectPlaceholder.png')

"Step 248: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 248-Click on div optionIndian.png')

"Step 249: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 249-Click on div selectPlaceholder2.png')

"Step 250: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 250-Click on div optionSingle.png')

"Step 251: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_17)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 251-Enter input value in input dateOfBirth.png')

"Step 252: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 252-Click on label genderMale.png')

"Step 253: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 253-Click on button save.png')

"Step 254: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 254-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 255: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_18)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 255-Enter input value in input typeForHints.png')

"Step 256: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 256-Click on button search.png')

"Step 257: Click on div dynamicContent (employeeNumber8) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_18]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 257-Click on div dynamicContent employeeNumber8 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 258: Click on link personalDetails19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails19'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 258-Click on link personalDetails19.png')

"Step 259: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_18)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 259-Enter input value in input driverLicenseNumber.png')

"Step 260: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_18)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 260-Enter input value in input licenseExpiryDate.png')

"Step 261: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 261-Click on div selectPlaceholder.png')

"Step 262: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 262-Click on div optionIndian.png')

"Step 263: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 263-Click on div selectPlaceholder2.png')

"Step 264: Click on div optionSingle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionSingle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 264-Click on div optionSingle.png')

"Step 265: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_18)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 265-Enter input value in input dateOfBirth.png')

"Step 266: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 266-Click on label genderMale.png')

"Step 267: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 267-Click on button save.png')

"Step 268: Click on link pim -> Navigate to page 'dynamic content#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_pim'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 268-Click on link pim - Navigate to page dynamic contentwebindexphpviewEmployeeList.png')

"Step 269: Enter input value in input typeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_typeForHints'), input_typeForHints_19)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 269-Enter input value in input typeForHints.png')

"Step 270: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_search'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 270-Click on button search.png')

"Step 271: Click on div dynamicContent (employeeNumber9) -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dynamic_content/div_dynamicContent', ['div_dynamicContent_internalText': div_dynamicContent_internalText_19]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 271-Click on div dynamicContent employeeNumber9 - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 272: Click on link personalDetails20"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_personalDetails20'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 272-Click on link personalDetails20.png')

"Step 273: Enter input value in input driverLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_driverLicenseNumber'), input_driverLicenseNumber_19)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 273-Enter input value in input driverLicenseNumber.png')

"Step 274: Enter input value in input licenseExpiryDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_licenseExpiryDate'), input_licenseExpiryDate_19)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 274-Enter input value in input licenseExpiryDate.png')

"Step 275: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 275-Click on div selectPlaceholder.png')

"Step 276: Click on div optionIndian"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionIndian'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 276-Click on div optionIndian.png')

"Step 277: Click on div selectPlaceholder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_selectPlaceholder2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 277-Click on div selectPlaceholder2.png')

"Step 278: Click on div optionMarried"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/div_optionMarried'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 278-Click on div optionMarried.png')

"Step 279: Enter input value in input dateOfBirth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_personal_details_view/input_dateOfBirth'), input_dateOfBirth_19)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 279-Enter input value in input dateOfBirth.png')

"Step 280: Click on label genderMale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_genderMale'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 280-Click on label genderMale.png')

"Step 281: Click on button save -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 281-Click on button save - Navigate to page .png')

"Step 282: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Update Personal Details for Multiple Employees in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}