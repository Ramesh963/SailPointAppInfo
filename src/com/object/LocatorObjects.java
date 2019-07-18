package com.object;

public class LocatorObjects {

	
	
		public static String enterUserName="//*[@id='loginForm:accountId']";
		public static String enterPassword="//*[@id='loginForm:password']";
		public static String clickTheLoginButton="//*[@id='loginForm:loginButton']";
		public static String clickOnApplications="(//*[@class='dropdown-toggle' ])[3]";
		public static String clickOnAppDefinition="//*[@role='menuitem' and contains(text(),'Application Definition')]";
		public static String enterAppName="//*[@id='searchfield-1025-inputEl']";
		public static String clickOnSearchIcon="//*[@id='ext-gen1099']";
		public static String clickOnApplication="//*[@class='x-grid-cell-inner ']";
		public static String XpathforAppName="//*[@id='editForm:appName']";
		public static String XpathforRevoker="//*[@id='applicationPageRevoker-inputEl']";
		public static String XpathforTheOwner="//*[@id='applicationPageOwner-inputEl']";
		public static String XpathforAppType="//*[@id='editForm:appType']";
		public static String XpathforAuthorization="(//input[contains(@name,'editForm:j_idt') and @type='checkbox'])[1]";
		public static String clickOnConfiguration="(//span[contains(@id,'-btnInnerEl') and @class='x-tab-inner'])[2]";
		public static String XpathforFilePath="//*[contains(@id,'r_id_account:filename_')]";
		public static String XpathForParsingTypeIcon="//input[contains(@id,'editForm:j_idt') and contains(@id,':r_id_account:parseType_:0')]";
		public static String XpathForParsingType="//label[contains(@for,'editForm:j_idt') and contains(@for,':r_id_account:parseType_:0')]";
		public static String XpathForFilterEmptyRecords = "(//input[contains(@name,'editForm:j_idt') and contains(@type,'checkbox')])[3]";
		public static String clickTheTestConnection="//*[@id='editForm:testButton']";
		public static String XpathForTestConnectionStatus="//*[@id='testResultsDiv']";
		public static String XpathForConnectionUser="//input[contains(@name,'editForm:j_idt') and contains(@name,':r_id_account:user_')]";
		public static String XpathForDataBaseUrl="//input[contains(@name,'editForm:j_idt') and contains(@name,':r_id_account:url_')]";
		public static String XpathForJDBCdriver="//input[contains(@name,'editForm:j_idt') and contains(@name,':r_id_account:driverClass_')]";
		public static String SchemaAccountAttribute = "//*[contains(@name,'editForm:j_idt')and contains(@name,':0:schemaAttrTbl:";
		public static String SchemaGroupAttribute = "//*[contains(@name,'editForm:j_idt')and contains(@name,':1:schemaAttrTbl:";
		public static String SchemaRoleAttribute = "//*[contains(@name,'editForm:j_idt')and contains(@name,':1:schemaAttrTbl:";
		public static String SchemaResourceGroupAttribute = "//*[contains(@name,'editForm:j_idt')and contains(@name,':1:schemaAttrTbl:";
		public static String SchemaGroupAttributeForSwow = "//*[contains(@name,'editForm:j_idt')and contains(@name,':2:schemaAttrTbl:";
		public static String SchemaResourceAttribute = "//*[contains(@name,'editForm:j_idt')and contains(@name,':2:schemaAttrTbl:";
		public static String SchemaSubscriptionAttribute = "//*[contains(@name,'editForm:j_idt')and contains(@name,':3:schemaAttrTbl:";
		public static String SchemaGroupAttributeForAzure = "//*[contains(@name,'editForm:j_idt')and contains(@name,':4:schemaAttrTbl:";
}



