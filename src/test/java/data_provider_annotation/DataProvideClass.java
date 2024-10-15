package data_provider_annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideClass {
	@Test (dataProvider =  "getUserName")
	public void verifyuserCanaddDataOnUI(String str)
	{
		//driver.findelement().sendkeys(str);
		System.out.println(str);
	}
	
	
	@DataProvider (name = "getUserName")
	public String[] sendData()
	{
		String [] arr = {"ABC","PQR","GTR","KJU","hytff"};
		return arr;
	}


@DataProvider (name = "credentials")
public String[][] sendUserCredentials()
{
	String arr[][] = {{"Ajay", "Ajay@123"},{"Sanjay","Sanjay@345"},{"Amar", "Am&4567"}};
	
	return arr;
}

@Test (dataProvider =  "credentials")
public void verifyUserCanLoginWithProvidedCredentials(String[] ar)
{
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	
}

@Test (dataProvider =  "credentials" )
public void verifyUserCanLoginWithProvidedCredentials2(String uname, String pass)
{
	System.out.println(uname);
	System.out.println(pass);
	
}
}