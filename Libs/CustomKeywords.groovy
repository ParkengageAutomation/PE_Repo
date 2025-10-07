
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


 /**
	 * Refresh browser
	 */ 
def static "myCustomKeywords.CustKeywords.refreshBrowser"() {
    (new myCustomKeywords.CustKeywords()).refreshBrowser()
}

 /**
	 * Generate a random Promo Code like PROMO123
	 * @return String promoCode
	 */ 
def static "myCustomKeywords.CustKeywords.generatePromoCode"() {
    (new myCustomKeywords.CustKeywords()).generatePromoCode()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "myCustomKeywords.CustKeywords.clickElement"(
    	TestObject to	) {
    (new myCustomKeywords.CustKeywords()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "myCustomKeywords.CustKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new myCustomKeywords.CustKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}
