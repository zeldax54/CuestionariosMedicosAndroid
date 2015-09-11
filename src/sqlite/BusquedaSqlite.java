package sqlite;

import com.app.neumocuest.R;

public class BusquedaSqlite {
	
	public String id;
	public String result1;
	public String result2;
	private String result3;
	private String result4;
	private String result5;
	
	public BusquedaSqlite(String pid,String presult1,String presult2,String presult3,String presult4,String presult5)
	{
	id=pid;
	result1=presult1;
	result2=presult2;
	result3=presult3;
	result4=presult4;
	result5=presult5;

	}
	

public String getresult4()
{
return result4;
}
public void setresult4(String result4)
{
this.result4=result4;
}


public String getresult3()
{
return result3;
}
public void setresult3(String result3)
{
this.result3=result3;
}

public String getid()
{
return id;
}
public void setid(String id)
{
this.id=id;
}
public String getresult1()
{
return result1;
}
public void setresult1(String result1)
{
this.result1=result1;
}
public String getresult2()
{
return result2;
}
public void setresult2(String result2)
{
this.result2=result2;
}
	
	





public String getresult5()
{
return result5;
}
public void setresult5(String result5)
{
this.result5=result5;
}





}