/**
 * 
 */
package Locators;

/**
 * @author P.Dhamanaskar
 *
 */
public class CustomXpath2 {

	/**
	 * Contains with text() function and attribute
	 * formula: //tagname[contains(@id,'value') and text()='text')]
	 * eg: //a[contains(@href,'login') and text()='Forgot Password?'] 
	 * 
	 * contains for attribute and text() function
	 * formula: //tagname[contains(@attr,'val') and contains(text(),'text)]
	 * eg: //a[contains(@href,'login') and contains(text(),'Password?')] 
	 *
	 * 6. starts-with():
	 *    filter to check whether the text startswith the specified text
	 *    formula: //tagname[starts-with(text(),'Forgot')]
	 *    eg:      //input[starts-with(@name,'user')]
	 *    
	 *    
	 *    Advance Xpath Axes:
	 * 1. Parent-Child Traversing: 
	 *    
	 *    Direct Child: use 1 forward slash / to traverse to direct child
	 *    formula:
	 *    //tagname[@attr='value']/immidiate-child-tagname
	 *    //div[@class='input-group']/input
	 *    we can traverse parent to child in 1 more method
	 *    formula:
	 *    //tagname[@attr='value']/child::child-tagname
	 *    
	 *    Grand/Great Grand Child
	 *   : use 2 forward slash / to traverse
	 *   formula: 
	 *   //tagname[@attr='value']//grand/great/grandchild-tagname
	 *   eg: (//div[@class='navFooterLinkCol navAccessibility'])[position()=1]//a
	 *   
	 * 2. Child-Parent Traversing/Backward Traversing: 
	 *    a) formula: //tagname[@attr='value']/../.. --> this can take you 1 generation backwards upto top of the DOM
	 *       eg:     //input[@name='username']/../..
	 *    b) Immediate Parent Traversing
	 *       formuala: //tagname[@attr='value']/parent::parent-tagname/parent::parent-tagname
	 *       eg:       //input[@name='username']/parent::div/parent::form
	 *    c) GrandParent Traversing of the selected element
	 *    formuala: //tagname[@attr='value']/ancestor::grandparent-tagname
	 *    eg :      //input[@name='username']/ancestor::form
	 *    
	 *    d) Preceding-Sibling:
	 *       Traversing from target element to the sibling in the same parent upwards
	 *       eg://a[text()='Alex DAN']//parent::div//preceding-sibling::td/input
	 *       
	 *    e) Following-Sibling
	 *       Traversing from target element to the sibling in the same parent downwards
	 *       eg://a[text()='Alex DAN']//parent::td//following-sibling::td/a[@context='company']
	 *       
	 *       
	 *       
	 *              
	 *              
	 *    
	 *    
	 *    
	 *    
	 *    
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
