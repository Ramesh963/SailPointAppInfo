package com.object;

public class SchemaAttributeObjects {
	
	//JDBC
		
	
	public static 	String[] accountAttributesBWSOnline = {"name","Role","shopper_id","email","first_name","last_name","no_offers","date_created",
															"date_last_modified","alert_flag","teammember","isbusinessaccount","isguest","lastsessioniddatetime"};
	
	public static String[] groupAttributesBWSOnline = {"Id","name","description","AccessLevel"};
	
	public static String[] accountAttributesCACapaciyManager = {"UserID","UserLevel","Name","Description","Enabled","RoleID","UpdatedOn"};
	
	public static String[] groupAttributesCACapacityManager = {"RoleID","Name","Description","Enabled","UpdatedOn","AccessRightName","Rank"};
	
    public static String[] accountAttributesCAPerformancecenter = {"UserID","UserLevel","Name","Description","Enabled","RoleID","UpdatedOn"};
	
	public static String[] groupAttributesCAPerformancecenter = {"RoleID","Name","Description","Enabled","RoleFlag","TenantID","UpdatedOn","AccessRightName","Rank"};
	
    public static String[] accountAttributesCategoryknowledge = {"GRANTEE,GRANTED_ROLE"};
    
    public static String[] accountAttributesCDrator = {"ID","USERNAME","FULL_NAME","ROLE","EMAIL","CONFIG_ACCESS","STATUS_ID"};
	
	public static String[] groupAttributesCDrator = {"ID,NAME","MENU_TITLE"};
	
    public static String[] accountAttributesCeftron = {"USR_ID","USR_NM","USR_ACTV","ROLE_CD"};
	
	public static String[] groupAttributesCeftron = {"ROLE_CD","ROLE_DESC","ROLE_LOCK"};
	
    public static String[] accountAttributesChannelclusteringRSO = {"ID","USER_NAME","PROFILE_NAME"};
	
	
	
    public static String[] accountAttributesContractorsDatabase = {"UniqueId","EmployeeID","EmployeeType","FirstName","LastName","Company_Vendor","EmailAddress","AD_CreationDate", 
		"AD_TerminationDate","AD_AccountName","LineManager_UserID","PositionTitle","EmployeeID_Reversed","Manager_EmployeeID","Domain ID"};
	
	
    public static String[] accountAttributesCowntdownOnlineApplication = {"shopper_id","Description","email","title","first_name","middle_initial","last_name","business_phone","date_created","date_last_modified","comments","company","alert_flag","number_of_orders","duplicate_flag","TeamMember","AccessLevel"};
	
	public static String[] groupAttributesCowntdownOnlineApplication = {"AccessLevel"};
	
	public static String[] accountAttributesCustomerContactmanagement = {"User_ID","UserName","Name","EmailAddress","Change_Password_Date","Expired_Date","IsOK","Site_ID","Store_ID","Person_ID","Role_Code","Last_Login_Date","Created_Date","Created_By","Last_Modified_Date","Last_Modified_By","Deleted"};
		
	public static String[] groupAttributesCustomerContactmanagement = {"Role_Code","Role_Name","Description","MAX_POINTS","Created_Date","Created_By","Last_Modified_Date","Last_Modified_By","Deleted","MAX_CPL"};
		
    public static String[] accountAttributesCustomerLED = {"USR_ID","USR_NM","ROLE_ID","LOC_TYPE_DESC","LOC_NM","UPD_TMSTMP","UPD_USRID","DIV_LST","CorrelationKey"};
			
	public static String[] groupAttributesCustomerLED = {"ROLE_ID","ROLE_DESC","PVLG_DESC","UPD_TMSTMP","UPD_USRID"};
			
	
				
	public static String[] accountAttributesDanMurphySiteManagement = {"shopper_id,email,first_name,last_name,no_offers,date_created,date_last_modified,alert_flag,teammember,isbusinessaccount,isguest,lastsessioniddatetime,Role"};
	
	public static String[] groupAttributesDanMurphySiteManagement = {"Attribute,Id,name,description"};
		
		
	public static String[] accountAttributesDanMurphysDSS = {"USER_ID","USERNAME","ACCOUNT_STATUS","LOCK_DATE","EXPIRY_DATE","CREATED","PROFILE","INITIAL_RSRC_CONSUMER_GROUP","GRANTED_ROLE","ADMIN_OPTION","Privilege"};
			
			
			
	public static String[] accountAttributesDanMurphysODHGUI = {"ID","USR_NM","FST_NM","LAST_NM","EMAIL_ADDR","EMP_NO","ACTIVE_FL","CRE_DTETM","CRE_USR_ID","UPD_DTETM","UPD_USR_ID","COMMENTS","VERSION","WC_ROLE_ID"};
			
	public static String[] groupAttributesDanMurphysODHGUI = {"ID","WC_ROLE_NM","CRE_DTETM","CRE_USR_ID","UPD_DTETM","UPD_USR_ID","COMMENTS","VERSION"};
				
	public static String[] accountAttributesECMWowOnline = {"userid","username","userdisplayname","isAdmin","Groupid","Correlation_Key"};
					
	public static String[] groupAttributesECMWowOnline = {"GroupId","GroupName"};
					
	public static String[] accountAttributesEnterprisedata = {"UserId","UserName","SystemUserFlag","UserEmailId","LastAccessDate","LastCertifyDate","CommentString","UserDepartment","WithAdmin","UserProfile","UserOrganisation","RoleName","GranteeKind"};
						
						
						
	public static String[] accountAttributesepay = {"USR_ID","USR_NM","USR_FST_NM","USR_LAST_NM","ROLE_ID","MOD_USR_ID","MOD_TIMESTAMP"};
							
	public static String[] groupAttributesepay = {"ROLE_ID","ROLE_NM","VER_NO","UPDD_USR_ID","UPDD_TIMSTMP","PVLG_ID"};
							
	public static String[] accountAttributesEverydayGiftcard = {"USA_ID","USA_TYPE_CD","USA_UID","UAR_ROL_ID","USA_FIRST_NM","USA_MIDDLE_NM","USA_LAST_NM","USA_EMAIL","USA_EMPLOYEE_NBR","USA_CUST_NBR","USA_LAST_LOGIN_DT","USA_PWD_EXP_IND","USA_PWD_CHANGED_DT","USA_LOGIN_COUNT","USA_SYS_TIMESTAMP","USA_CEM_ACCOUNT_ID","USA_MERGED_INTO_USA_ID","OBJ_STATUS_CD","OBJ_CREATE_DT","OBJ_MODIFY_DT"};
								
	public static String[] groupAttributesEverydayGiftcard = {"RPR_ROL_ID","RPR_PRV_NM","RPR_OPTION_VAL","OBJ_LABEL","OBJ_DESC,OBJ_CREATE_DT","OBJ_MODIFY_DT"};
	  
			
	public static String[] accountAttributesiDemo = {"login","Firstname","surname","email","Active","usertype","supplierId","firstLogin","Service Account"};
				
	 public static String[] accountAttributesWyongRDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesWyongRDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesSydneyRDCTC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesSydneyRDCTC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesSydneyNDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesSydneyNDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesSydneyLDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesSydneyLDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesMelbourneLDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesMelbourneLDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesWodongaRDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesWodongaRDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesMelbourneNDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesMelbourneNDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesMulgraveProduceDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesMulgraveProduceDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesAdelaideRDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesAdelaideRDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesPerthRDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesPerthRDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesBrisbaneRDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesBrisbaneRDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesBrisbaneLDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesBrisbaneLDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesHoxtonParkDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesHoxtonParkDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesBreadalbanDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesBreadalbanDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  public static String[] accountAttributesTasmaniaRDC= {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		
	  public static String[] groupAttributesTasmaniaRDC = {"CLASS_ID,LDESC,CREATE_DTIM,CREATE_USER,CHANGE_USER,CHANGE_DTIM"};
	  
	  		  
	  public static String[] accountAttributesIPFX = {"ID","Firstname","Lastname","Email","UserLevel","FeatureClass Description"};
			
	  public static String[] groupAttributesIPFX = {"UserLevelID","UserLevelDescription"};
		  
		  public static String[] accountAttributesJDATransport = {"USR_CD","NAME","STAT_ENU","USR_GRP_CD","USR_GRP_TYP_ENU","CDTY_CD","LGST_GRP_CD","DIV_CD,PLAN_ID","CRTD_DTT","UPDT_DTT","CRTD_USR_CD","UPDT_USR_CD","RSTD_ACSS_YN","EMAL","PWD_CHNG_EXPT_YN","PWD_CHNG_DTT","LOGIN_DTT","user_status","user_type"};
				
		  public static String[] groupAttributesJDATransport = {"USR_GRP_CD","USR_GRP_DESC","USR_GRP_TYP_ENU","CUST_CD","CARR_CD","MRKT_PROF_YN","RSTD_LOC_YN","ALW_CNFG_LST_YN","DIV_CD"};
			  
         public static String[] accountAttributesJDABIGW = {"USER_ID","FIRSTNAME","LASTNAME","EMAIL","ROLENAME"};
				
		  public static String[] groupAttributesJDABIGW = {"ROLENAME"};
		  
		  public static String[] accountAttributesJDADemandManagerBigW = {"USER_ID","FIRSTNAME","LASTNAME","EMAIL","ROLENAME"};
			
			  public static String[] groupAttributesJDADemandManagerBigW = {"ROLENAME"};
		  
		  public static String[] accountAttributesJDADemandManagerBigWPromo = {"USER_ID","FIRSTNAME","LASTNAME","EMAIL","ROLENAME"};
				
		  public static String[] groupAttributesJDADemandManagerBigWPromo = {"ROLENAME"};
			  
		  public static String[] accountAttributesJDADemandManagerBigWPromoAustralia = {"USER_ID","USR_NAME","USR_ROLE","EMAIL"};
			
			  public static String[] groupAttributesJDADemandManagerBigWPromoAustralia = {"USR_ROLE","ROLE_DISPLAY_NAME"};
			  
			  public static String[] accountAttributesJDADemandManagerBigWPromoNewZealand = {"USER_ID","USR_NAME","USR_ROLE","EMAIL"};
			
		  public static String[] groupAttributesJDADemandManagerBigWPromoNewZealand = {"USR_ROLE","ROLE_DISPLAY_NAME"};
		  
		  public static String[] accountAttributesJDADemandManagerSupermarketAustralia = {"USER_ID","USR_NAME","USR_ROLE","EMAIL"};
				
		  public static String[] groupAttributesJDADemandManagerSupermarketAustralia = {"USR_ROLE"};
		  
		  public static String[] accountAttributesJDADemandManagerSupermarketNewzealand = {"USER_ID","USR_NAME","USR_ROLE","EMAIL"};
			
			  public static String[] groupAttributesJDADemandManagerSupermarketNewzealand = {"USR_ROLE","ROLE_DISPLAY_NAME"};
			  
			  public static String[] accountAttributesJDAFulfillment = {"USER_NAME","ENTERPRISE_NAME","FULL_NAME","FIRST_NAME","LAST_NAME","EMAIL","ROLE_NAME","ROLE_DESCRIPTION"};
				
			  public static String[] groupAttributesJDAFulfillment = {"ROLE_NAME","ROLE_DESCRIPTION"};
			  
			  public static String[] accountAttributesJDASupermarketprofiler = {"USER_ID","FIRSTNAME","LASTNAME","EMAIL","ROLENAME"};
				
			  public static String[] groupAttributesJDASupermarketprofiler = {"ROLENAME"};
			  
			  public static String[] accountAttributesKronosTime = {"PERSONID","PERSONNUM","FIRSTNM","LASTNM","FULLNM","SHORTNM","USERACCOUNTNM","COST_CENTER","HOMEJOB","ACCESSPROFILENAME","LOGONPROFILENAME","EMPLOYMENTSTATUS","USERACCOUNTSTATUS","COMB_EFFECTIVEDATE","COMB_EXPIRATIONDATE","PERSON_EFFECTIVEDATE","PERSON_EXPIRATIONDATE"};
				
			  public static String[] groupAttributesKronosTime = {"ACCESSPROFID","PROFILENM","PROFILEDSC","DEFAULTSW","UPDATEDBYUSRACCTID","UPDATEDTM","VERSIONCNT","ALLOWALLSW"};
			  
			  public static String[] accountAttributesLeaseManagementPeps = {"op_id","op_stop","op_name","op_email","op_password_expire","opg_id","ARCHIVED","lastLogindate"};
				
			  public static String[] groupAttributesLeaseManagementPeps = {"OPG_ID","OPG_NAME","OPG_PERIOD","OPG_LOG_ON,OPG_TIME_OUT","OPG_ADMIN","OPG_BYPASS_PO","OPG_BYPASS_PAM","OPG_BYPASS_PAV","OPG_TRANSACTION_CD","rowid",
					  "OPG_ARCHIVE_CD","OPG_SHUT_DOWN","ARCHIVED"};
			  
			  public static String[] accountAttributesLoadrunner = {"USER_ID","USER_NAME","FULL_NAME","EMAIL","DESCRIPTION","LAST_UPDATE","US_DOM_AUTH","US_REPORT_ROLE","US_IS_SYSTEM","US_IS_ACTIVE","ACC_IS_ACTIVE","US_EXPIRATION_DATE","US_AVATAR_CACHE","ROLE_NAME","PROJECT_NAME"};
				
			  public static String[] groupAttributesLoadrunner = {"PROJECT_ID","PROJECT_NAME","PROJECT_TYPE","DESCRIPTION","LAST_TOUCH_TIME","PR_IS_ACTIVE","DOMAIN_ID","DOMAIN_NAME","DB_NAME","DB_TYPE","PHYSICAL_DIRECTORY","DBSERVER_NAME"};
			  
      		  public static String[] accountAttributesMaximo = {"USERID","TYPE","MAXUSERID","DISPLAYNAME","STATUS","TERMINATIONDATE","STATUSDATE","GROUPNAME","DEPARTMENT","COUNTRY","CITY"};
			
		  public static String[] groupAttributesMaximo = {"GROUPNAME"};
		  
		  public static String[] accountAttributesMcafeeEpo = {"Id","Name","AuthURI","Admin","Disabled","Visible","Interactive","Removable","Editable","FullName","Email","PhoneNumber","Notes","LastLoginTime","groups"};
			
		  public static String[] groupAttributesMcafeeEpo = {"Id","Name","Visible","UniqueKey","CreatedBy","CreatedOn","ModifiedBy","ModifiedOn","Prefix","RoleURI"};
		  
		  public static String[] accountAttributesMcafeeePO53 = {"Id","Name","AuthURI","Admin","Disabled","Visible","Interactive","Removable","Editable","FullName","Email","PhoneNumber","Notes","LastLoginTime","groups"};
 				
		  public static String[] groupAttributesMcafeeePO53 = {"Id","Name","Visible","UniqueKey","CreatedBy","CreatedOn","ModifiedBy","ModifiedOn","Prefix","RoleURI"};
		  
		  public static String[] accountAttributesOFS = {"OperatorId","OperatorCode","OperatorName","ReferenceCode","OperatorProfile","ReferenceID","ReferenceParameter"};
			
		  public static String[] groupAttributesOFS = {"ReferenceCode","ReferenceDescription","ReferenceVisible","ReferencePersistenceId","ReferenceParameter"};
	
		  public static String[] accountAttributesOnesourceFBT = {"PersonUID","FirstName","LastName","Email","RoleUID","IsActive","LastLogin","createddate","lastupdateddate","lastpwdchange","changepwd","ValidTill","Login"};
		  public static String[] groupAttributesOnesourceFBT = {"ROLENAME"};
		  
		  public static String[] accountAttributesOptimityBeefDaily = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityBeefDaily = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityBeefweekly = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityBeefweekly = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityBurisweekly = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityBurisweekly = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityCondweekly = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityCondweekly = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityGameweekly = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityGameweekly = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityLambdaily = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityLambdaily = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityLambweekly = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityLambweekly = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityOffaldaily = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityoffaldaily = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimitypetfooddaily = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimitypetfooddaily = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityporkdaily = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityporkdaily = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityporkweekly = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityporkweekly = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimitypoultrydaily = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimitypoultrydaily = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityprepmealweekly = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityprepmealweekly = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimityServmeatweekly = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimityServmeatweekly = {"RoleID","Description"};
		  
		  public static String[] accountAttributesOptimitysmallgds = {"UserID","FirstName","Lastname","Email","DashboardID","DashboardFromPeriodID","DashboardToPeriodID","WorkflowApprover","WorkflowApprovingFavouriteView","WorkflowApprovingForecastGroup","ScreensToOpenAtStart","RoleID"};
		  public static String[] groupAttributesOptimitysmallgds = {"RoleID","Description"};
		  
		  public static String[] accountAttributesPassbigw = {"USERID","NAME","DISPLAYNAME","USEWINDOWSLOGON","EMAIL","ROLEID","Correlation_Key"};
		  public static String[] groupAttributesPassbigw = {"RoleID","Description"};
		  
		  public static String[] accountAttributesPowertax = {"PersonUID","FirstName","LastName","Email","RoleUID","IsActive","LastLogin","createddate","lastupdateddate","lastpwdchange","changepwd","ValidTill","Login",
				  "Correlation_Key"};
		  public static String[] groupAttributesPowertax = {"RoleUID","DisplayName","Descr","HierarchyNo","IsDev","IsActive","CreatedDate","LastUpdatedDate"};
		  
		  public static String[] accountAttributesPWRM = {"USR_ID","USER_NAME","FIRST_NAME","LAST_NAME","EMAIL_ADDR","ENBL_USR_FL","ROLE_NM","CRE_USR_ID","CRE_DTETM","UPD_USR_ID","UPD_DTETM","STORE_ID"};
		  public static String[] groupAttributesPWRM = {"ROLE_NM"};
		  
		  public static String[] accountAttributesPyramid = {"SystemUserID","NTUserID","UserName","Inactive","EmailAddress","UserLocation","Role","Scope","DeactivatedDate","ModifiedDateTime","ModifieduserID","Privileges","FULFILLER"};
		  public static String[] groupAttributesPyramid = {"Role","Scope","Role Description","Scope Description","Role Group","NationalRole","SupportTeamRole","TransportRole","LockStaffingSheetRole","Privileges","Privilege Description"};
		  
		  public static String[] accountAttributesQlikview = {"ACCESS","NTNAME","Topic","ROLE","OMITGROUP","Correlation_Key","Privilege","AD ID"};
		  
		  
		  public static String[] accountAttributesReplenishmentcentral = {"USER_ID","USER_NAME","ROLE_ID","CREATE_DTETM","CREATE_USER","LAST_REVIEW_DATE","LAST_REVIEW_BY","DELETED_DATE","SALES_ORG_IND","UPDATE_USER_ID","UPDATE_DTETM"};
		  public static String[] groupAttributesReplenishmentcentral = {"ROLE_ID","ROLE_NAME","SALES_ORG_IND","CREATE_USER_ID","CREATE_DTETM","UPDATE_USER_ID","UPDATE_DTETM","DELETED_DTE","SCREEN_ID","SCREEN_NAME"};
		  
		  public static String[] accountAttributesRetailix = {"UserId","UserName","FirstName","LastName","UserStatus","LoginDateTime","DomainUserName","MatrixMemberId","UserProfileId","CreationDate","UpdatedDate","Privileges","AD ID"};
		  public static String[] groupAttributesRetailix = {"UserProfileId","UserProfileDescription","MatrixMemberId","ProfileTypeDescription","Privileges"};
		  
			public static String[] accountAttributesRouteplanner = {"UserID","UserGUID","LoginName","FirstName","MiddleName","LastName","Title","UserGroup","Role","Active","EmailAddress","CreateDate","StartPage","ModifiedBy",
					"ModifyDate","LockedOut","NextPswChgDate","PswNeverExpires","UserType"};
			
			
			
		
		  public static String[] accountAttributesSmart = {"LogOnID","UserName","RoleName"};
		  public static String[] groupAttributesSmart = {"RoleID","RoleName","Status"};
		  
		  public static String[] accountAttributesStorelocator = {"ID","USR_NM","EMAIL_ADDR","EMP_NO","FST_NM","LAST_NM","ACTIVE_FL","CRE_DTETM","CRE_USR_ID","UPD_DTETM","UPD_USR_ID","DIV_FULL_NM","TROLE_ID","LOC_ID"};
		  public static String[] groupAttributesStorelocator = {"ID","TROLE_NM","COMMENTS","VERSION","CRE_DTETM","CRE_USR_ID","UPD_DTETM","UPD_USR_ID"};
		  
		  public static String[] accountAttributesSwisslogHume = {"USRID","FORENAME","NAME","INITIALS","EMP_NR","TIMESTAMP","GROUP_ID","Correlation_Key"};
    	  public static String[] groupAttributesSwisslogHume = {"GROUP_ID","INFO","TERM_TYPE","JOB_TYPE","Term Type Description"};
//		  
		  public static String[] accountAttributesSwisslogMinchinbury = {"USRID","FORENAME","NAME","INITIALS","EMP_NR","TIMESTAMP","GROUP_ID","Correlation_Key"};
		  public static String[] groupAttributesSwisslogMinchinbury = {"GROUP_ID","INFO","TERM_TYPE","JOB_TYPE","Term Type Description"};
//		  
	  public static String[] accountAttributesTactics = {"UserID","Name","Email","Access_level","Distribution_Centre"};
		  public static String[] groupAttributesTactics = {"SystemRoleID","Description"};
//		  
		 public static String[] accountAttributesTeammate = {"UserID","Auditor_Role","Contact_Role","Other_Role","AuditorRole","ActiveStatus","FirstName","LastName","Initials","Phone","Email","StaffNumber","Title","Team","Grade","Location","IsSystem","LevelNum","LoginName","LastLoggedIn_Days","NeverLoggedIn","ModuleDescription","ModuleRole","Team Schedule","Team Store","Team Risk","Team Admin","Team TEC","Team Central Reports","Team Central","Team EWP"};


  
		  public static String[] accountAttributesUnitload = {"USER_IDT","LOCATION_NAME","TIME_CREATE","TIME_UPDATE","CREATE_USER_IDT","UPDATE_USER_IDT"};

		  
		  public static String[] accountAttributesWDLOrder = {"UserId","username","LoweredUserName","LastActivityDate","email","LoweredEmail","IsApproved","IsLockedOut","CreateDate","LastLoginDate","LastPasswordChangedDate","LastLockoutDate","RoleId"};
		  public static String[] groupAttributesWDLOrder = {"RoleId","RoleName","LoweredRoleName","Description"};
		  
		  public static String[] accountAttributesWMSBroadmeadows = {"userId","userName","homeDirectory","shell","userIdInfo","primaryGroupId","primaryGroupName","groups"};
		  public static String[] groupAttributesWMSBroadmeadows = {"groupName","groupId","members"};
	  
	      public static String[] accountAttributesWMSMinchbury = {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DEPT","MAIN_MENU_ID","DFLT_DC_ID","DFLT_WHSE_ID","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		  public static String[] groupAttributesWMSMinchbury = {"CLASS_ID","DESC","CREATE_DTIM","CREATE_USER","CHANGE_USER","CHANGE_DTIM"};
		  
		  public static String[] accountAttributesMonartoDC = {"userId","userName","homeDirectory","shell","userIdInfo","primaryGroupId","primaryGroupName","groups","Job ID"};
		  public static String[] groupAttributesMonartoDC = {"groupName","groupId","members"};
		  
		  public static String[] accountAttributesWarwickDC = {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DEPT","MAIN_MENU_ID","DFLT_DC_ID","DFLT_WHSE_ID","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		  public static String[] groupAttributesWarwickDC = {"RoleID","Description"};
		  
          public static String[] accountAttributesWMSJDA = {"USR_ID","LOGIN_ID","FIRST_NAME","LAST_NAME","USR_DSP","USR_STS","SUPER_USR_FLG","ACCT_EXPIR_DAT","PSWD_CHG_FLG","PSWD_EXPIR_FLG","ADR_ID","CLIENT_ID",
		"LMSDTE","LST_DAT","LST_LOGOUT_DTE","INTRUDER_CNT","SINGLE_SIGNON_FLG","EXT_ATH_FLG","MODDTE","MOD_USR_ID","MC_SUPERVISOR_ID","MC_EMP_IS_SUPERVISOR",
		"MC_EMP_COST","MC_EMP_HIRE_DATE","ADRNAM","EMAIL_ADR","PO_BOX_FLG","ROLE_ID","LDAP_FLG","GRP_NAM","Correlation_Key"};
          
          public static String[] accountAttributesWowOnline = {"Id","firstname","lastname","email","isemailconfirmed","accessfailedcount","lockoutenddateutc","lockoutenabled","accesslevel"};
          
		 
		  
		  public static String[] accountAttributesXBRLegacy = {"USERID","USER_NAME","USER_OR_GROUP","GROUP_NAME","DEFAULT_LIBRARY","EMAIL_ADDR","PRIMARY_APP","SECURITY"};
		  public static String[] groupAttributesXBRLegacy = {"SECURITY","SECURITYCODE"};
		  
		  public static String[] accountAttributesAucklandNDC = {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		  public static String[] groupAttributesAucklandNDC = {"CLASS_ID","LDESC","CREATE_DTIM","CREATE_USER","CHANGE_USER","CHANGE_DTIM"};
		  
		  public static String[] accountAttributesAucklandRDC = {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		  public static String[] groupAttributesAucklandRDC = {"CLASS_ID","LDESC","CREATE_DTIM","CREATE_USER","CHANGE_USER","CHANGE_DTIM"};
		  
		  public static String[] accountAttributesChristchurchRDC = {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		  public static String[] groupAttributesChristchurchRDC = {"CLASS_ID","LDESC","CREATE_DTIM","CREATE_USER","CHANGE_USER","CHANGE_DTIM"};
		  
		  public static String[] accountAttributesPalmerstonRDC = {"USER_ID","CLASS_ID","FNAME","LNAME","MIDDLE_INITIAL","DFLT_DC_ID","MENU_TITLE","CREATE_DTIM","CREATE_USER","CHANGE_DTIM","CHANGE_USER"};
		  public static String[] groupAttributesPalmerstonRDC = {"CLASS_ID","LDESC","CREATE_DTIM","CREATE_USER","CHANGE_USER","CHANGE_DTIM"};
		  
		  
		  public static String[] accountAttributesFileIntegrity = {"OID","HASADM","ISENABLED","LOGIN","LOGOUT","EMAIL","NME","DSC","PTYPE","BLTIN","Group","Role"};
		  
		  
		  public static String[] accountAttributesEndeavormarketplace = {"Id","CreatedBy","CreatedOn","DeactivationDate","Disabled","Email","FirstName","GoogleEmail","GoogleId","IsPortalOperator","LastName","Role","UpdatedBy","UpdatedOn","DeactivatedBy","SkuRegisterdDate"};
		 
		  
		  
	/*
	 * public static String[] accountAttributesJDASupermarketprofiler =
	 * {"USER_ID","FIRSTNAME","LASTNAME","EMAIL","ROLENAME"};
	 * 
	 * public static String[] groupAttributesJDASupermarketprofiler = {"ROLENAME"};
	 * 
	 * 
	 * public static String[] accountAttributesJDASupermarketprofiler =
	 * {"USER_ID","FIRSTNAME","LASTNAME","EMAIL","ROLENAME"};
	 * 
	 * public static String[] groupAttributesJDASupermarketprofiler = {"ROLENAME"};
	 * 
	 * public static String[] accountAttributesJDASupermarketprofiler =
	 * {"USER_ID","FIRSTNAME","LASTNAME","EMAIL","ROLENAME"};
	 * 
	 * public static String[] groupAttributesJDASupermarketprofiler = {"ROLENAME"};
	 * 
	 * public static String[] accountAttributesJDASupermarketprofiler =
	 * {"USER_ID","FIRSTNAME","LASTNAME","EMAIL","ROLENAME"};
	 * 
	 * public static String[] groupAttributesJDASupermarketprofiler = {"ROLENAME"};
	 */
		  
	//AD-Direct
	
	public static String[] accountAttributesActiveDirectoryBigW = {"cn","displayName","distinguishedName","employeeID","employeeType","givenName","homePhone","l","mail","manager","mobile","sn",
		     "telephoneNumber","uid","objectClass","memberOf","objectSid","objectguid","sAMA","countName","primaryGroupID","primaryGroupDN",
		     "accountFlags","department","company","accountExpires","lastLogontimeStamp","createTimeStamp","modifyTimeStamp","pwdLastSet,userAccountControl",
		     "Must change password on logon","Account Status","Password Never Expires","CorrelationKey"};
	
	public static String[] groupAttributeactiveDirectoryBigW = {"cn","distinguishedName","o","ou","owner","description","memberOf",
			"objectSid","objectguid","mailNickname","GroupType","GroupScope","sAMAccountName","msDS-PrincipalName"};
	
	
	
	public static String[] accountAttributesActiveDirectoryCorpDir = {"businessCategory","carLicense","cn","departmentNumber","description","destinationIndicator","displayName","distinguishedName",
			"employeeNumber","employeeType","facsimileTelephoneNumber","givenName","homePhone","homePostalAddress","initials","internationalISDNNumber","l","mail","manager",
			"mobile","o","ou","pager","physicalDeliveryOfficeName","postOfficeBox","postalAddress","postalCode","preferredDeliveryMethod","preferredLanguage","registeredAddress",
			"roomNumber","secretary","seeAlso","sn","st","street","telephoneNumber","teletexTerminalIdentifier","telexNumber","title","uid","objectClass","memberOf","objectSid",
			"objectguid","sAMAccountName","primaryGroupID", "primaryGroupDN","accountFlags","department","msNPCallingStationID","msRADIUSFramedRoute","msNPAllowDialin","msRADIUSCallbackNumber",
			"msRADIUSFramedIPAddress","mailNickname","homeMDB","msExchHideFromAddressLists","msRTCSIP-UserEnabled","SipAddress","RegistrarPool","LyncPinSet","LyncPinLockedOut","msDS-PrincipalName",
			"company","accountExpires","lastLogontimeStamp","createTimeStamp","modifyTimeStamp","pwdLastSet","userAccountControl","Must change password on logon","Account Status",
			"Password Never Expires","CorrelationKey"};
			
	public static String[] groupAttributesActiveDirectoryCorpDir = {"cn","distinguishedName","o","ou","owner","description","memberOf","objectSid","objectguid","mailNickname","GroupType",
			"GroupScope","sAMAccountName","msDS-PrincipalName"};
	
	public static String[] accountAttributesActiveDirectoryNSWRO = {"businessCategory","carLicense","cn","departmentNumber","description","destinationIndicator","displayName","distinguishedName",
			"employeeNumber","employeeType","facsimileTelephoneNumber","givenName","homePhone","homePostalAddress","initials","internationalISDNNumber","l","mail","manager",
			"mobile","o","ou","pager","physicalDeliveryOfficeName","postOfficeBox","postalAddress","postalCode","preferredDeliveryMethod","preferredLanguage","registeredAddress",
			"roomNumber","secretary","seeAlso","sn","st","street","telephoneNumber","teletexTerminalIdentifier","telexNumber","title","uid","objectClass","memberOf","objectSid",
			"objectguid","sAMAccountName","primaryGroupID", "primaryGroupDN","accountFlags","department","msNPCallingStationID","msRADIUSFramedRoute","msNPAllowDialin","msRADIUSCallbackNumber",
			"msRADIUSFramedIPAddress","mailNickname","homeMDB","msExchHideFromAddressLists","msRTCSIP-UserEnabled","SipAddress","RegistrarPool","LyncPinSet","LyncPinLockedOut","msDS-PrincipalName",
			"company","accountExpires","lastLogontimeStamp","createTimeStamp","modifyTimeStamp","pwdLastSet","userAccountControl","Must change password on logon","Account Status",
			"Password Never Expires","CorrelationKey"};
	
	public static String[] groupAttributesActiveDirectoryNSWRO = {"cn","distinguishedName","o","ou","owner","description","memberOf","objectSid","objectguid","mailNickname","GroupType",
			"GroupScope","sAMAccountName","msDS-PrincipalName"};
	
	public static String[] accountAttributesActiveDirectoryPelCorp = {"businessCategory","carLicense","cn","departmentNumber","description","destinationIndicator","displayName","distinguishedName",
			"employeeNumber","employeeType","facsimileTelephoneNumber","givenName","homePhone","homePostalAddress","initials","internationalISDNNumber","l","mail","manager",
			"mobile","o","ou","pager","physicalDeliveryOfficeName","postOfficeBox","postalAddress","postalCode","preferredDeliveryMethod","preferredLanguage","registeredAddress",
			"roomNumber","secretary","seeAlso","sn","st","street","telephoneNumber","teletexTerminalIdentifier","telexNumber","title","uid","objectClass","memberOf","objectSid",
			"objectguid","sAMAccountName","primaryGroupID", "primaryGroupDN","accountFlags","department","msNPCallingStationID","msRADIUSFramedRoute","msNPAllowDialin","msRADIUSCallbackNumber",
			"msRADIUSFramedIPAddress","mailNickname","homeMDB","msExchHideFromAddressLists","msRTCSIP-UserEnabled","SipAddress","RegistrarPool","LyncPinSet","LyncPinLockedOut","msDS-PrincipalName",
			"company","accountExpires","lastLogontimeStamp","createTimeStamp","modifyTimeStamp","pwdLastSet","userAccountControl","Must change password on logon","Account Status",
			"Password Never Expires","CorrelationKey"};
	
	public static String[] groupAttributesActiveDirectoryPelCorp = {"cn","distinguishedName","o","ou","owner","description","memberOf","objectSid","objectguid","mailNickname","GroupType",
			"GroupScope","sAMAccountName","msDS-PrincipalName"};
	
	public static String[] accountAttributesActiveDirectoryWowCorp = {"businessCategory","carLicense","cn","departmentNumber","description","destinationIndicator","displayName","distinguishedName",
			"employeeNumber","employeeNumber","employeeType","facsimileTelephoneNumber","givenName","homePhone","homePostalAddress","initials","internationalISDNNumber","l","mail","manager",
			"mobile","o","ou","pager","physicalDeliveryOfficeName","postOfficeBox","postalAddress","postalCode","preferredDeliveryMethod","preferredLanguage","registeredAddress",
			"roomNumber","secretary","seeAlso","sn","st","street","telephoneNumber","teletexTerminalIdentifier","telexNumber","title","uid","objectClass","memberOf","objectSid",
			"objectguid","sAMAccountName","primaryGroupID", "primaryGroupDN","accountFlags","department","msNPCallingStationID","msRADIUSFramedRoute","msNPAllowDialin","msRADIUSCallbackNumber",
			"msRADIUSFramedIPAddress","mailNickname","homeMDB","msExchHideFromAddressLists","msRTCSIP-UserEnabled","SipAddress","RegistrarPool","LyncPinSet","LyncPinLockedOut","msDS-PrincipalName",
			"company","accountExpires","lastLogontimeStamp","createTimeStamp","modifyTimeStamp","pwdLastSet","userAccountControl","Must change password on logon","Account Status",
			"Password Never Expires","CorrelationKey"};
	
	public static String[] groupAttributesActiveDirectoryWowCorp = {"cn","distinguishedName","o","ou","owner","description","memberOf","objectSid","objectguid","mailNickname","GroupType",
			"GroupScope","sAMAccountName","msDS-PrincipalName"};
	
	
	public static String[] accountAttributesActiveDirectoryBigWStores = {"businessCategory","carLicense","cn","departmentNumber","description","destinationIndicator","displayName","distinguishedName",
			"employeeNumber","employeeType","facsimileTelephoneNumber","givenName","homePhone","homePostalAddress","initials","internationalISDNNumber","l","mail","manager",
			"mobile","o","ou","pager","physicalDeliveryOfficeName","postOfficeBox","postalAddress","postalCode","preferredDeliveryMethod","preferredLanguage","registeredAddress",
			"roomNumber","secretary","seeAlso","sn","st","street","telephoneNumber","teletexTerminalIdentifier","telexNumber","title","uid","objectClass","memberOf","objectSid",
			"objectguid","sAMAccountName","primaryGroupID", "primaryGroupDN","accountFlags","department","msNPCallingStationID","msRADIUSFramedRoute","msNPAllowDialin","msRADIUSCallbackNumber",
			"msRADIUSFramedIPAddress","mailNickname","homeMDB","msExchHideFromAddressLists","msRTCSIP-UserEnabled","SipAddress","RegistrarPool","LyncPinSet","LyncPinLockedOut","msDS-PrincipalName",
			"company","accountExpires","lastLogontimeStamp","createTimeStamp","modifyTimeStamp","pwdLastSet","userAccountControl","Must change password on logon","employeeID","Account Status",
			"Password Never Expires","CorrelationKey"};
	
	public static String[] groupAttributeactiveDirectoryBigWStores = {"cn","distinguishedName","o","ou","owner","description","memberOf","objectSid","objectguid","mailNickname","GroupType",
			"GroupScope","sAMAccountName","msDS-PrincipalName"};
			
	
	
	//Azure
	
	public static String[] accountAttributesAzure = {"accountEnabled","assignedLicenses","assignedPlans","city","country","department","dirSyncEnabled",
			"disabledPlans","displayName","facsimileTelephoneNumber","givenName","groups","immutableId","jobTitle","lastDirSyncTime",
			"mail","mailNickname","mobile","objectId","onPremisesSecurityIdentifier","otherMails","passwordPolicies","physicalDeliveryOfficeName",
			"postalCode","preferredLanguage","proxyAddresses","roles","sipProxyAddress","state","streetAddress","surname","telephoneNumber",
			"usageLocation","userPrincipalName","userType","Subscriptions","ResourceGroups","Resources"};
	
	
	public static String[] resourcegroupAttributesAzure = {"Subscriptions","Resources"};
	
	public static String[] resourceAttributesAzure = {"ResourceGroups","Subscriptions"};
	
	public static String[] subscriptionAttributeAzure = {"ResourceGroups","Resources"};
	
	public static String[] groupAttributesAzure = {"description","dirSyncEnabled","displayName","lastDirSyncTime","mail","mailEnabled",
			"mailNickname","objectId","onPremisesSecurityIdentifier","proxyAddresses","securityEnabled","Subscriptions",
			"ResourceGroups","Resources"};

	
	
	//Delimited
	
	public static String[] accountAttributesALH = {"STATUS","USERID","Username","First Name","Last Name","Middle Name","Manager",
			"Human Resource", "Division","Area","Store","Job Code","Time Zone","Hire Date","Employee Id","Title","Business Fax",
			"Address 1","Address 2","City","State","ZIP","Country","Review Frequency","Last Review Date","Career Stream",
			"FT/PT Casual","Location","Line Manager","Employment Type","HR Level","Career Level","Ops/Sup","Region","Location State",
			"Paying Department","Career Group","Customizable Field 13","Customizable Field 14","in EC","Matrix Manager", "Default Locale",
			"Custom Manager", "Second Manager","Division_ID","Area_ID","Title_ID","Ops/Sup_ID","Region_ID","Store_ID"};
	
	public static String[] accountAttributesAriba = {"Organization.SystemID","LoginDate","LastLoginDate","PasswordAdapter","EmailAddress","Name","Creation Date","FailedLoginAttemptAfterLastLogin",
			"LocaleID.UniqueName","Phone","TimeZoneID","DefaultCurrency.UniqueName","Fax","UniqueName","Privilege","PurchasingUnit"};


	public static String[] accountAttributesHK = {"STATUS","USERID","Username","First Name","Last Name","Middle Name","Manager","Human Resource","Area",
			"Job Code","Division","Store / Site / Department","Time Zone","Hire Date","Employee Id","Title",
			"Business Phone","Business Fax","Address 2","City","State","Post Code","Country","Review Frequency",
			"Last Review Date","Position Id","FT/PT Casual","Cost Center","Line Manager","Employment Type",
			"HR Level","Grade","Customizable Field 9","Customizable Field 10","Customizable Field 11",
			"Customizable Field 12","Customizable Field 13","Customizable Field 14","HRCode","Matrix Manager","Default Locale","Custom Manager","Second Manager","Division_ID","Area_ID"};
	
	public static String[] accountAttributesAztec = {"FIRST NAME","LAST NAME","EMAIL ADDRESS","SALES ORGANISATION"};
	
	public static String[] accountAttributesSOI = {"User Id","First Name","Last Name","Role Name","Group Name","Last Login Date","Active/Inactive Status"};
	
	/*public static String[] accountAttributesCCH_Integrator = {"LogonID","firstname","lastname","email","Active","LastPWChange","lastlogonattempt","lastlogonsuccess","UserCreatedDate",
			"UserCreatedBy","UserModifiedDate","UserModifiedBy","PersonnelCreatedDate","PersonnelCreatedBy","PersonnelModifiedDate",
			"PersonnelModifiedBy"};*/
	
	public static String[] accountAttributesQuantum = {"EmployeeId","FirstName","LastName","Email","AD ID","Full Name","ShortName","Group"};
			
	public static String[] accountAttributesKIRK_IndentOrderManagement = {"User ID","First Name","Last Name","Email Address","Domain User ID","Employee ID","Role Name","Role Description","Department",
	"Last Login Date","User Status"};
	
	public static String[] accountAttributesOnlineBankingANZ = {"User ID","User Name","Status","Role","Role Type"};
	
	public static String[] accountAttributesOnlineBankingCBA = {"Service Id","Service Name","Type Of Row","User Name","Identifier","User ID","User Status","Token Status","NetLock Status",
			"Last Log In","Is the user identified by t	he Bank","User Access times","Payables cap","Receivables Cap","FX Cap",
			"Token delivery address","Permission Mode","Roles Assigned","Transaction Purposes Assigned","Is the user a Service Delegate","Last Modified"};
	
	public static String[] groupAttributesOnlineBankingCBA = {"Roles Assigned","Admin Permission","FX Permissions","IS_VIEW_CI_REPORTS","Reports Permissions","Transaction Permissions"};
	
	public static String[] accountAttributesOnlineBankingExigo = {"User","First Name","Last Name","Current State","Sub Participant"};
	
	public static String[] accountAttributesOnlineBankingHSBC = {"Username","Name","User type","User status","Last logon date/time","ast modified date","Registered date"};
	
	public static String[] accountAttributesOnlineBankingNAB = {"User Name","User ID","User Type","User Status"};
	
	public static String[] accountAttributesOnlineBankingWestpac = {"User name","Customer number","Session timeout","Hours of availability","Mobile access","Status","Token number","Token expiry date","Last sign-in","Offices","Office ID","Applications","Administration authority Level","Administration role","Administration offices","Administration office ID","Accounts authority level","Accounts features",
			"Receipts features","Payments authority level","Payments features","Online FX authority level","Online FX features","Online Agency authority level","Online Agency features","Online Deposits authority level","Online Deposits features"};
			
	public static String[] accountAttributesOptomate = {"CODE","NAME","SLEVEL","SFQTY","SLQTY","CLQTY","SOQTY","OIQTY","SGQTY","SAQTY","STQTY","CTQTY","SFSELL","SLSELL","CLSELL","SOSELL","OISELL","SGSELL","SASELL","STSELL","CTS","ELL","SFGP","SLGP","CLGP","SOGP","OIGP","SGGP","SAGP","STGP","CTGP","INACTIVE","MOBILE"};
	
	public static String[] accountAttributesPegasus = {"Userid","Name","Email Address","Pegasus Status","Ingres Status","Unix Status","Last Login","User Created","Privileges"};
	
	public static String[] accountAttributesPulse = {"USERNAME","FULL_NAME","DESCRIPTION","HAS_PASSWORD","ACTIVE_USER","DISABLED","SYSTEM","AUTHENTICATED",
			"SELF_REGISTERED","LAST_LOGIN_DATE_AND_TIME","LOGI","TYPE","DOMAINS","USER_ROLES"};
	
	public static String[] accountAttributesHybris = {"User ID","Name","First Name","Last Name","Roles","Account Disabled","Email ID","Employee ID","AD ID"};
	
	public static String[] accountAttributesSapc4c = {"User Locked","Password Locked","User ID","Name","Technical ID","Counted User","Counted On","Role","Email","CorrelationKey"};
	
	public static String[] accountAttributesWebmethodsIS = {"Username","Role"};
	
	public static String[] accountAttributesWebmethodsTradingnetworks = {"USER ID","FIRST NAME","LAST NAME","E-MAIL","DIRECTORY SERVICE","EDIT","Display Name","Role"};
	
	public static String[] accountAttributesInformaticaApplication = {"GroupName","UserName","UserSecurityDomain","Privileges"};
	
	
	public static String[] accountAttributesPayGlobal = {"SF USER ID","PAY PERIOD CODE","PAY PERIOD DESCRIPTION","EMPLOYEE CODE","FIRST NAME","MIDDLE NAMES","LAST NAME","EMAIL ID",
			"PREFERRED NAME","MANAGER_ID","MANAGER_NAME","POST CODE","COST CENTRE DESCRIPTION","WOW COST CENTRE","DIVISION",
			"DIVISION DESCRIPTION","REGION","REGION DESCRIPTION","AREA CODE","AREA DESCRIPTION","COUNTRY","DEPARTMENT CODE",
			"DEPARTMENT DESCRIPTION","POSITION CODE","POSITION DESCRIPTION","SALARIED/WAGED","EMPLOYEE STATUS","START DATE","EMPLOYEE TERMINATED Y/N","TERMINATIONDATE","TERMINATION_REASON_DESCRIPTION","RECORD_UPDATE_DATE","ABSENCE BEGIN DATE",
			"ABSENCE END DATE","ABSENCE TYPE"};
	
	public static String[] accountAttributesQlikviewLogistics = {"CAL", "UserFullname", "Last Used","Status","Correlation_Key"};
	

	
	//Google Apps
	
	public static String[] accountAttributesGoogleApps = {"objectID","primaryEmail","name","isAdmin","isDelegatedAdmin","lastLoginTime","suspended","suspensionReason","changePasswordAtNextLogin","ipWhitelisted",
			"ims","emails","externalIds","relations","addresses","organizations","phones","aliases","nonEditableAliases","customerId","orgUnitPath","isMailboxSetup","includeInGlobalAddressList",
			"thumbnailPhotoUrl","contacts","Groups","fullName","EmployeeNumber","ADID","Role","familyName","givenName","customSchemas","SAPID"};
	
	public static String[] roleAttributesGoogleApps = {"roleId","roleName","roleDescription","rolePrivileges.privilegeN","ame","isSystemRole","isSuperAdminRole"};
	
	public static String[] groupAttributesGoogleApps = {"name","nonEditableAliases","objectID","description","adminCreated","aliases","email","directMembersCount","whoCanJoin","whoCanViewMembership","whoCanViewGroup",
			"whoCanInvite","allowExternalMembers","whoCanPostMessage","allowWebPosting","primaryLanguage","maxMessageBytes","isArchived","archiveOnly","messageModerationLevel","spamModerationLevel","replyTo",
			"customReplyTo","sendMessageDenyNotification","defaultMessageDenyNotificationText","showInGroupDirectory","allowGoogleCommunication","membersCanPostAsTheGroup","messageDisplayFont","includeInGlobalAddressList",
			"MANAGERS","OWNERS"};
	
	
	//IBM
	
	public static String[] accountAttributesB2CTAMLDAP = {"businessCategory","carLicense","cn","dn","departmentNumber","description","destinationIndicator","displayName",
			"employeeNumber","employeeType","facsimileTelephoneNumber","givenName","homePhone","homePostalAddress","initials","internationalISDNNumber","l","mail","manager",
			"mobile","o","ou","pager","physicalDeliveryOfficeName","postOfficeBox","postalAddress","postalCode","preferredDeliveryMethod","preferredLanguage","pwdReset","registeredAddress",
			"roomNumber","secretary","seeAlso","sn","st","street","telephoneNumber","teletexTerminalIdentifier","telexNumber","title","uid","objectClass","ibm-allgroups","uniqueIdentifier",
			"loginAlias","groups"};
	
	public static String[] groupAttributesB2CTAMLDAP = {"cn","uniqueMember","dn","o","ou","owner","description"};
	
	public static String[] accountAttributesBusinessObjectsEBIReplenishment = {"businessCategory","carLicense","cn","dn","departmentNumber","description","destinationIndicator","displayName",
			"employeeNumber","employeeType","facsimileTelephoneNumber","givenName","ibm-allgroups","homePhone","homePostalAddress","initials","internationalISDNNumber","l","mail","manager",
			"mobile","o","ou","pager","physicalDeliveryOfficeName","postOfficeBox","postalAddress","postalCode","preferredDeliveryMethod","preferredLanguage","pwdReset","registeredAddress",
			"roomNumber","secretary","seeAlso","sn","st","street","telephoneNumber","teletexTerminalIdentifier","telexNumber","title","uid","objectClass"};
	
	public static String[] groupAttributesBusinessObjectsEBIReplenishment = {"cn","dn","o","ou","owner","description"};
	
	public static String[] accountAttributesBusinessObjectsEBIWowLink = {"businessCategory","carLicense","cn","dn","departmentNumber","description","destinationIndicator","displayName",
			"employeeNumber","employeeType","facsimileTelephoneNumber","givenName","ibm-allgroups","homePhone","homePostalAddress",
			"initials","internationaliSDNNumber","l","mail","manager","mobile","o","ou","pager","physicalDeliveryOfficeName",
			"postOfficeBox","postalAddress","postalCode","preferredDeliveryMethod","preferredLanguage","pwdReset","registeredAddress",
			"roomNumber","secretary","seeAlso","sn","st","street","telephoneNumber","teletexTerminalIdentifier","telexNumber","title",
			"uid","objectClass"};
	
	public static String[] groupAttributesBusinessObjectsEBIWowLink = {"cn","member","dn","o","ou","owner","description"};
	
	
	//LDAP
	
	public static String[] accountAttributesB2BTAMLDAP = {"businessCategory","carLicense","cn","dn","departmentNumber","description","destinationIndicator","displayName","employeeNumber","employeeType","facsimileTelephoneNumber","givenName",
			"ibm-allgroups","homePhone","homePostalAddress","initials","internationaliSDNNumbe","l","mail","manager","mobile","o","ou","pager","physicalDeliveryOfficeName","postOfficeBox","postalAddress","postalCode","preferredDeliveryMethod",
			"preferredLanguage","registeredAddress","roomNumber","secretary","seeAlso","sn","st","street","telephoneNumber","teletexTerminalIdentifier","telexNumber","title","uid","objectClass","wowIdmsLoginString"};
	
	public static String[] groupAttributesB2BTAMLDAP = {"cn","dn","o","ou","owner","description","member"};
	
	public static String[] accountAttributesSAP_IDM = {"dn","mskeyvalue","mx_mail_primary","mx_usertype","mxref_mx_privilege",
			"sap_changenumber","changenumber","mskey","mx_printersettings_spdb","mx_locked","mx_department","displayname","accountsbw300","accountsec100","mx_address_country","mx_admin_unit",
			"mx_dateformat","mx_entrytype","mx_firstname","mx_language","mx_language_country","mx_lastname","mx_nickname","mx_printersettings_spda",
			"mxref_mx_company_address","mx_printersettings_spld","mx_communication_language","mx_communication_method",
			"mx_validto","mx_logon_ticket_enabled","accountsbw_hn","mx_password_disabled","MX_VALIDFROM","MX_DISABLED","mx_autorole",
			"mx_autoprivilege","mxref_mx_role","MX_USER_CATEGORY","MX_IDENTITY_CATEGORY","MX_NUMBERFORMAT","Z_PERSONATYPE",
			"Correlation_Key","objectClass","Z_SP_EIMEID","MX_FS_SALUTATION","Z_SP_EMPLOYEE_ID","Z_SP_COSTCENTER_ID","MX_COSTCENTER",
			"Z_SP_POSITION_ID","Z_SP_POSITION","Z_SP_COMPANY","Z_SP_COMPANY_ID","Z_SP_GROUP","Z_SP_GROUP_ID","Z_SP_BRAND","Z_SP_BRAND_ID",
			"Z_SP_OPS_SUPPORT","Z_SP_OPS_SUPPORT_ID","Z_SP_REGION","Z_SP_AREA_ID","Z_SP_AREA","Z_SP_LOCATION","Z_SP_LOCATION_ID",
			"Z_SP_EMPLOYMENT_CLASS","Z_SP_EMPLOYEE_TYPE","Z_SP_LINE_MANAGER","MX_PHONE_PRIMARY","Z_SP_HR_STATUS","Z_SP_REGION_ID",
			"Account Access","Z_SP_COSTCENTER"};

	public static String[] groupAttributesSAP_IDM = {"dn","displayname","mskeyvalue","mx_autorole","mx_entrytype","mx_inherit","mxac_entry","mxac_members","mxmember_mx_person",
			"mxref_mx_role","changenumber","mskey","accountsbw_hn","mx_group_inheritance","mx_is_account","mx_modifytask","mx_privilege_type","mx_repositoryname","mx_req_priv","description",
			"mx_deprovisiontask","mx_provisiontask","mx_add_member_task","mx_del_member_task","mx_validate_add_task","mx_validate_del_task","mx_modifytask_attr","SAP Module Name"};
	
	public static String[] privillegeAttributesSAP_IDM = {"dn","mskeyvalue","mx_autorole","mx_entrytype","mxmember_mx_privilege","mxref_mx_role","changenumber","mskey","mxac_entry",
			"mxac_members","mxmember_mx_person","displayname"};
	
	//Microsoft
	
	public static String[] accountAttributesOrderDistributionSystemCountdownODS = {"native_identity","database_name","database_id","server_login","name","principal_id","type",
			"type_desc","default_schema_name","create_date","modify_date","owning_principal_id","sid","is_fixed_role","server_name",
			"DBUser","roles"};
	
	public static String[] groupAttributesOrderDistributionSystemCountdownODS = {"native_identity","name","database_name","database_id","principal_id","roles","server_name",
			"type_desc"};
	
	
	
	//OpenLDAP
	
	public static String[] accountAttributesRedHatLDAP = {"cn","dn","posixgroups","givenName","sn","uid","objectClass","loginShell","gidNumber","uidNumber","mail","gecos","shadowLastChange","homeDirectory","host"};
	
	public static String[] groupAttributesRedHatLDAP = {"cn","dn","gidNumber","memberUid","objectClass"};
	
	
	//Oracle
	
		public static 	String[] accountAttributeHumanResource = {"USERNAME","USER_ID","ACCOUNT_STATUS","LOCK_DATE","EXPIRY_DATE","DEFAULT_TABLESPACE","TEMPORARY_TABLESPACE","CREATED","PROFILE",
						"INITIAL_RSRC_CONSUMER_GROUP","EXTERNAL_NAME","ROLES","SYSTEM_PRIVILEGES"};
		
		public static 	String[] groupAttributeHumanResource = {"ROLE","AUTHENTICATION_TYPE","PASSWORD_REQUIRED","ROLES","SYSTEM_PRIVILEGES"};
		
		public static 	String[] accountAttributeCustomerMasterDataManagementCMDM = {"USERNAME","USER_ID","ACCOUNT_STATUS","DEFAULT_TABLESPACE","TEMPORARY_TABLESPACE",
						"AUTHENTICATION_TYPE","PROFILE","ROLES","SYSTEM_PRIVILEGES"};
		
		public static 	String[] groupAttributeCustomerMasterDataManagementCMDM = {"ROLE","PASSWORD_REQUIRED","AUTHENTICATION_TYPE","ROLES","SYSTEM_PRIVILEGES"};
		
		public static 	String[] accountAttributeCustomerLoyaltyCentralSystem = {"USERNAME","USER_ID","ACCOUNT_STATUS","DEFAULT_TABLESPACE","TEMPORARY_TABLESPACE",
				"AUTHENTICATION_TYPE","PROFILE","ROLES","SYSTEM_PRIVILEGES"};

		public static 	String[] groupAttributeCustomerLoyaltyCentralSystem = {"ROLE","PASSWORD_REQUIRED","AUTHENTICATION_TYPE","ROLES","SYSTEM_PRIVILEGES"};

		
		//RuleFileParser
		
		public static 	String[] accountAttributecaIntroscope = {"Name","UserGroup"};
		
		public static 	String[] groupAttributecaIntrocope= {"UserGroup","Description","Group"};
		
		
		//Salesforce
		
		public static 	String[] accountAttributeSalesforce1QAProductQualityAssurance = {"Id","Alias","City","CommunityNickname","CompanyName","CallCenterId","Country","Department","Email","Division",
				"EmployeeNumber","Extension","Street","Fax","IsActive","Username","FirstName","LastName","EmailEncodingKey","Name","UserPermissionsMarketingUser",
				"UserPermissionsMobileUser","UserPermissionsOfflineUser","UserPermissionsSFContentUser","Phone","ProfileId","ProfileName",
				"PublicGroups","ReceivesAdminInfoEmails","UserRoleId","UserRoleName","UserType","State","Title","ReceivesInfoEmails","PermissionSet","UserLicense","LanguageLocaleKey","LocaleSidKey",
				"TimeZoneSidKey","FederationIdentifier","CreatedDate","LastLoginDate"};
		
		public static 	String[] groupAttributeSalesforce1QAProductQualityAssurance = {"Id","Name","Description","UserType","UserLicense"};
		
		public static 	String[] accountAttributeSalesforceBunch = {"Id","Alias","City","CommunityNickname","CompanyName","CallCenterId","Country","Department","Email","Division",
				"EmployeeNumber","Extension","Street","Fax","IsActive","Username","FirstName","LastName","EmailEncodingKey","Name","UserPermissionsMarketingUser",
				"UserPermissionsMobileUser","UserPermissionsOfflineUser","UserPermissionsSFContentUser","Phone","ProfileId","ProfileName",
				"PublicGroups","ReceivesAdminInfoEmails","UserRoleId","UserRoleName","UserType","State","Title","ReceivesInfoEmails","PermissionSet","UserLicense","LanguageLocaleKey","LocaleSidKey",
				"TimeZoneSidKey","FederationIdentifier","CreatedDate","LastLoginDate"};
		
		public static 	String[] groupAttributeSalesforceBunch = {"Id","Name","Description","UserType","UserLicense"};
		
		public static String[] accountAttributesSalesforceEbusiness = {"Id","Alias","City","CommunityNickname","CompanyName","CallCenterId","Country","Department","Email","Division","EmployeeNumber","Extension","Street","Fax","IsActive","Username","FirstName","LastName","EmailEncodingKey","Name","UserPermissionsMarketingUser","UserPermissionsMobileUser","UserPermissionsOfflineUser","UserPermissionsSFContentUser","Phone","ProfileId","ProfileName","PublicGroups","ReceivesAdminInfoEmails","UserRoleId","UserRoleName","UserType","State","Title","ReceivesInfoEmails","PermissionSet","UserLicense","LanguageLocaleKey","LocaleSidKey","TimeZoneSidKey","FederationIdentifier",
				"CreatedDate","LastLoginDate"};
		
		public static 	String[] groupAttributeSalesforceEbusiness = {"Id","Name","Description","UserType","UserLicense"};
		
		public static String[] accountAttributesSalesforceHR = {"Id","Alias","City","CommunityNickname","CompanyName","CallCenterId","Country","Department","Email","Division","EmployeeNumber","Extension","Street","Fax","IsActive","Username","FirstName","LastName","EmailEncodingKey","Name","UserPermissionsMarketingUser","UserPermissionsMobileUser","UserPermissionsOfflineUser","UserPermissionsSFContentUser","Phone","ProfileId","ProfileName","PublicGroups","ReceivesAdminInfoEmails","UserRoleId","UserRoleName","UserType","State","Title","ReceivesInfoEmails","PermissionSet","UserLicense","LanguageLocaleKey","LocaleSidKey","TimeZoneSidKey","FederationIdentifier",
				"CreatedDate","LastLoginDate"};
		
		public static 	String[] groupAttributeSalesforceHR = {"Id","Name","Description","UserType","UserLicense"};
		
		
		//SAP
		
		public static 	String[] accountAttributeSAPDirect = {"Academic Title","Academic Title 2","Addr Number","Alias","Birth Name","Building","Building 2",
				"Building Long","Care of","Check Status","City","City Number","Code","Communication Language","Communication type",
				"Company","Company Address","Company Address2","Company Address3","Company Address4","Country","Country ISO","Delivery District",
				"Department","District","District Number","E-Mail","E-Mail List","Employee Number","Fax","Fax Extension","Fax List","First name",
				"Floor","Floor 2","Format","FullName","FullName2","Function","GUI Flag","House  Number 2","House Number","HouseNumber 3","Inhouse ML",
				"Initials","Language CR P","Language ISO","Language UCP ISO","Language UP ISO","Last name","Location","Logon Language","Middle Name",
				"Name Country","Nickname","Notes","Other City","Other City Number","Pager SMS List","Parameters","Pboxcity Number","PCODE 1 Ext","PCODE 2 Ext",
				"PCODE 3 Ext","PO Box","PO Box City","PO Box City ISO","PO Box Country","PO Box Region","PO Box Without Number",
				"Postal Code","Postal Code2","Postal Code3","Prefix 1","Prefix 2","Print Immediately","Printer List","Region","Region Group","Remote Communication List",
				"Remote Function Call List","Remote Mail List","Room Number","Room Number 2","Reference User","Search Term2 P","Search Term P","Search Term1",
				"Search Term2","Second Name","Start Menu","Street Abbreviation","Street Address","Street Address2","Street Address3","Street Address4",
				"Street Number","SNC Name","Tax Jurisdiction Code","Telephone","Telephone Extension","Telephone List","Teletex List","Telex List","Time Format","TimeZone",
				"TZone","Title","Title SPPL","Transportation Zone","URL List","User Last Logon Time","User Last Logon Date",
				"Productive Password","User Name","User Title","User Type","User Valid From","User Valid To","X.400 List","Roles","Profiles","User Group"};
		
		public static 	String[] roleAttributeSAPDirect = {"Name","Type","Description","Subsystem","Child Roles","Long Description",
				"Generated Profile","TCodes"};
		
		public static 	String[] groupAttributeSAPDirect = {"ID","Name","Type","Description","Subsystem","Child Profiles"};
		
		
		
		
		
		//SAPHANADATABASE
		
		
	    public static 	String[] accountAttributeSAPHanadatabase = {"USER_ID","USER_NAME","USER_MODE","CREATOR","VALID_FROM","VALID_UNTIL","IS_RESTRICTED","IS_CLIENT_CONNECT_ENABLED","HAS_REMOTE_USERS","SESSION_CLIENT","EMAIL_ADDRESS","TIME_ZONE","AUTHENTICATION_TYPE","SYSTEM_PRIVILEGES","APPLICATION_PRIVILEGES","CATALOG_ROLES","REPOSITORY_ROLES","FORCE_PWD_CHG_ON_NEXT_LOGON"};
		
		public static 	String[] roleAttributeSAPHanadatabase = {"ROLE_NAME","ROLE_ID","ROLE_MODE","GLOBAL_IDENTITY","CREATOR","GRANTED_ROLES"};
		
		public static 	String[] groupAttributeSAPHanadatabase = {"ROLE_NAME","ROLE_ID","ROLE_MODE","GLOBAL_IDENTITY","CREATOR,GRANTED_ROLES"};
		
		
		
		//Servicewow
		
		
		 public static 	String[] accountAttributeServicewow = {"first_name","last_name","email","user_name","department","title","sys_id","phone","calendar_integration",
				 "sys_class_name","company","cost_center","sys_created_on","sys_created_by","groups","roles","active","building","city","country","location","manager","middle_name",
				 "name","password_needs_reset","user_id","default_perspective","sys_domain","employee_number","failed_attempts","gender",
				 "home_phone","ldap_server","preferred_language","last_login","last_login_time","locked_out","mobile_phone","notification",
				 "schedule","state","source","street","time_format","time_zone","sys_updated_on","sys_updated_by","sys_mod_count","vip","zip","u_ad_user_id","enterprise_identity_source",
				 "secondary_location_id","secondary_location","windows_10","horizon"};
			
		 public static 	String[] roleAttributeServicewow = {"sys_replace_on_upgrade","sys_name","sys_updated_on","sys_id","grantable","sys_created_on","suffix","sys_created_by","can_delegate",
				 	"sys_policy","sys_updated_by","sys_tags","sys_package","description","name","sys_class_name","sys_update_name","elevated_privilege","sys_mod_count","sys_customer_update","sys_scope","roles"};
			
		 public static 	String[] groupAttributeServicewow = {"name","email","manager","roles","parent","active","cost_center","default_assignee","description","exclude_manager",
				 	"sys_created_on","sys_created_by","source","sys_id","type","sys_updated_on","sys_updated_by","sys_mod_count"};
		 
		 
		 //Sucessfactor
		 
		 
		 public static 	String[] accountAttributeSucessfactor = {"userId","userNav.lastName","userNav.firstName","employmentNav.personNav.personalInfoNav.preferredName",
				 "employmentNav.personNav.personalInfoNav.salutationNav.picklistLabels.label","userNav.empId","employmentNav.jobInfoNav.costCenterNav.externalCode",
				 "employmentNav.jobInfoNav.costCenterNav.name","employmentNav.jobInfoNav.position","employmentNav.jobInfoNav.positionNav.externalName_defaultValue",
				 "employmentNav.jobInfoNav.companyNav.name","employmentNav.jobInfoNav.company","employmentNav.jobInfoNav.customString4Nav.externalName",
				 "employmentNav.jobInfoNav.customString4Nav.externalCode","employmentNav.jobInfoNav.division","employmentNav.jobInfoNav.divisionNav.name",
				 "employmentNav.jobInfoNav.customString5Nav.externalName","employmentNav.jobInfoNav.customString5Nav.externalCode",
				 "employmentNav.jobInfoNav.businessUnitNav.name","employmentNav.jobInfoNav.businessUnitNav.externalCode","employmentNav.jobInfoNav.department",
				 "employmentNav.jobInfoNav.departmentNav.name","employmentNav.jobInfoNav.customString9Nav.externalName","employmentNav.jobInfoNav.customString9Nav.externalCode",
				 "employmentNav.jobInfoNav.employeeClassNav.picklistLabels.label","employmentNav.jobInfoNav.employmentTypeNav.picklistLabels.label","userNav.manager.userId",
				 "payGroup","payGroupNav.name","userNav.businessPhone","employmentNav.firstDateWorked","employmentNav.endDate","employmentNav.jobInfoNav.emplStatusNav.externalCode",
				 "userNav.status","Employee Status","employmentNav.jobInfoNav.positionNav.cust_payingDepartmentNav.externalCode","employmentNav.jobInfoNav.positionNav.cust_payingDepartmentNav.externalName",
				 "employmentNav.customDate5","employmentNav.jobInfoNav.customDate5","employmentNav.jobInfoNav.customString29","employmentNav.personNav.customString1","employmentNav.jobInfoNav.customString16",
				 "employmentNav.jobInfoNav.customString50Nav.externalCode","employmentNav.jobInfoNav.customString50Nav.externalName","employmentNav.jobInfoNav.customString28Nav.vendorCode",
				 "employmentNav.jobInfoNav.customString28Nav.vendorName"};
		
		 
		 //Unix
		 
		 
		 public static 	String[] accountAttributecentraldatabase = {"userId","userName","homeDirectory","shell","userIdInfo","primaryGroupId","primaryGroupName","groups","Job ID"};
			
	     public static 	String[] groupAttributecentraldatabase = {"groupName","groupId","members"};
	     
	     public static 	String[] accountAttributecrossdockmanagement = {"userId","userName","homeDirectory","shell","userIdInfo","primaryGroupId","primaryGroupName","groups","Job ID"};
			
	     public static 	String[] groupAttributecrossdockmanagement = {"groupName","groupId","members"};
	     
	     public static 	String[] accountAttributeWMS3_3BroadmeadowsDC = {"userId","userName","homeDirectory","shell","userIdInfo","primaryGroupId","primaryGroupName","groups"};
			
	     public static 	String[] groupAttributeWMS3_3BroadmeadowsDC = {"groupName","groupId","members"};
	     
	     public static 	String[] accountAttributeWMS3_3MinchinburyDC = {"userId","userName","homeDirectory","shell","userIdInfo","primaryGroupId","primaryGroupName","groups"};
			
	     public static 	String[] groupAttributeWMS3_3MinchinburyDC = {"groupName","groupId","members"};
	     
	     //Webservices
	     
	     
	     public static 	String[] accountAttributelastpass = {"username","fullname","mpstrength","created","last_pw_change","last_login","disabled","admin","totalscore","linked","multifactor","neverloggedin","duousername","sites","notes","formfills","applications","attachments","groups","privilege"};
	     
	     
	     public static 	String[] accountAttributeSentient = {"userType","firstName","lastName","active","costCentre","employeeId","externalReferenceId","userCreatedDate","userLastLoginDate","assignedUserRoles","location","email","loginName"};
	     
	     public static 	String[] usertAttributeAkamai = {"firstName","lastName","username","email","timezone","userType","accountId","tfaEnabled","tfaConfigured","tfaAllowedForUser","lastLoginDate","contactId","privilege"};
			
	     public static 	String[] groupAttributecrossAkamai = {"privilege","privilegeName","groupName","topLevelGroup","navGroup","leaf","parentGroupId","groupID","roleName","roleDescription","contractTypeId","roleID"};
	     
	     public static 	String[] userAttributeApigee = {"firstName","lastName","roles","emailId"};
			
	
	     
	     public static 	String[] userAttributeEDGVsts = {"subjectKind","domain","principalName","mailAddress","origin","originId","displayName","accessLevel.licensingSource","accessLevel.accountLicenseType","accessLevel.msdnLicenseType","accessLevel.licenseDisplayName","accessLevel.status","accessLevel.statusMessage","accessLevel.assignmentSource","lastAccessedDate","projectEntitlements","extensions","groupAssignments"};
			
	    
	     public static 	String[] accountAttributeVulnerability = {"id","username","firstname","lastname","title","status","email","locked","city","country","lastLogin","modifiedTime","mustChangePassword","createdTime","authType","fingerprint","group","role","CorrelationKey"};
		 
	     public static String[] roleAttributeVulnerability = {"id","name","description","createdTime","modifiedTime","permPurgeReportResults","permPurgeScanResults","permViewOrgLogs","permManageBlackoutWindows","permScan","permManageRoles","permManageAttributeSets","permCreateAlerts","permCreateTickets","permManageApp","permManageAcceptRiskRules","permShareObjects","permManageRecastRiskRules","permPurgeTickets","permCreateAuditFiles",
	    		 "permCreatePolicies","permManageGroupRelationships","permAgentsScan","permUploadNessusResults","permUpdateFeeds","permCreateLDAPAssets","permManageGroups","permManageImages"};
	    
	     public static 	String[] groupAttributeVulnerability = {"id","name","description","createdTime","modifiedTime"};
	     
	     public static 	String[] UserAttributewoolworthsmoney = {"createdBy","created","lastModified","principalName","authorizableCategory","uuid","authorizableId","lastModifiedBy","email","familyName","givenName","groups","resourceType","lastReplicatedBy","lastReplicated","lastReplicationAction"};
			
	     public static 	String[] groupAttributewoolworthsmoney = {"authorizableId","createdBy","created","givenName","lastModifiedBy","members","principalName","authorizableCategory","lastModified","uuid","aboutMe","resourceType","lastReplicatedBy","lastReplicated","lastReplicationAction"};
	     
	     public static 	String[] accountAttributeZendesk = {"id","url","name","email","created_at","updated_at","time_zone","phone","shared_phone_number","locale_id","locale","organization_id","role","verified","external_id","tags","alias","active","shared","shared_agent","last_login_at","two_factor_auth_enabled","signature","details","notes","role_type","custom_role_id","moderator","ticket_restriction","only_private_comments","restricted_agent",
	    		 "suspended","chat_only","default_group_id","user_fields"};
			
	   
	     
	     public static 	String[] accountAttributeZscaler = {"id","name","email","groups.name","department.name","comments","adminUser"};
			
	   
 
	
}		
	
	


