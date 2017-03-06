package com.banking.bussiness;

import java.sql.Connection;
import java.sql.ResultSet;

import com.banking.jdbc.DBconnection;
import com.banking.jdbc.UserTables;



public class Manage {

	public static String managelogin(String userid, String password)
	{
		 Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.validateLogin(userid, password,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";

}

	public static String manageacount(String accno1, String uid) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.validateaccount(accno1,uid,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";
}

	public static ResultSet manageviewdet(String uid) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 ResultSet rs=UserTables.validateviewprofile(uid,session); 
		 if(rs.next())
         	return rs;
         else
         	return null;
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			
		 }
		return null;
		
}

	public static String passchk(String pass, String usid) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.validatepass(pass,usid,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";

	}

	public static String updatepass(String usid, String np) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.updatepass(usid,np,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";

	}

	 public static String managefunds(String uid, int p, int a1, double amt, int accno) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		String isValid=UserTables.fundstransfer(uid,p,a1,amt,accno,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";
	}

	public static String manageacountvalid(int a1) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.isvalidaccount(a1,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";
	}

	public static String balanceamt(int accnod,double amt, int p) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.balancechecking(accnod,amt,p,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";
	}

	public static String manageadminacount(String admin, String pswd) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.validateadminaccount(admin,pswd,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";
	}

	public static String updateadminpass(String aaccno, String np) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.updateadmpass(aaccno,np,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";

	}

	public static ResultSet manageaccview() {
		Connection session=null;
		ResultSet re=null;
		 try
		 {
		 session=DBconnection.getDBConnection("mysql");		 
		 re=UserTables.viewuseraccdetails(session);
		 
		 return re;
		 
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
		 }
		 finally
		 {
			 
		 }
		return re;
		
		
	}

	public static String manageacount1(String accno1) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.validateaccount1(accno1,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";
	}

	public static String managenewreg(String id, String pwd, String accno) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.insertaccount(id,pwd,accno,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";
	}

	public static String managecreateaccount(int accno, int pin, double bal, String name, String state,
			int phno, String mailid) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.createnewaccount(accno,pin,bal,name,state,phno,mailid,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";
	}

	public static String deleteaccount(String accno1) {
		Connection session=null;

		 try
		 {
			
		 session=DBconnection.getDBConnection("mysql");		 
		 String isValid=UserTables.deleteacct(accno1,session); 
		 if(isValid.equalsIgnoreCase("true"))
				return "true";
		 else
			    return "false";
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace(); 
			
			
		 }
		 finally
		 {
			 try{
			session.close();
			 }catch(Exception e){e.printStackTrace();}
		 }
		return "false";
	}
	}

	

	
