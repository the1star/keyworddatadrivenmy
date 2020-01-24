package executionEngine;

import config.ActionKeywords;
import utility.ExcelUtils;

public class DriverScript {

	public static void main(String[] args) throws Exception {

		String sPath = "E:\\projectkeyworddrivenframework\\projectkeyword\\keyworddatadriven\\src\\dataEngine\\DataEngine.xlsx";
	
	
	     ExcelUtils.setExcelFile(sPath, "Test Steps");

	     for (int iRow=1;iRow<=8;iRow++){
		     //Storing the value of excel cell in sActionKeyword string variable
		     String sActionKeyword = ExcelUtils.getCellData(iRow, 3);
		 
		     //Comparing the value of Excel cell with all the project keywords
		     if(sActionKeyword.equals("openBrowser")){
		    	 ActionKeywords.openBrowser();
		     }
		                        //This will execute if the excel cell value is 'openBrowser'
		     //Action Keyword is called here to perform action
		     else if(sActionKeyword.equals("navigate")){
		     ActionKeywords.navigate();}
		     else if(sActionKeyword.equals("Input_Username")){
		     ActionKeywords.Input_Username();}
		     else if(sActionKeyword.equals("Input_Password")){
		     ActionKeywords.Input_Password();}
		     else if(sActionKeyword.equals("click_login")){
		     ActionKeywords.click_login();}
		     else if(sActionKeyword.equals("onpersonal")){
			 ActionKeywords.onpersonal();}
		     else if(sActionKeyword.equals("onmessage")){
			 ActionKeywords.onmessage();}
		     else if(sActionKeyword.equals("ontext")){
			 ActionKeywords.ontext();}
		     }

		}
	
	
	}

