package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatosHosp003 {
	
	private String datos_id;
	private String MuestasNum;
	private String MuestasPor;
	private String HemosNum;
	private String HemosPor;
	private String RespNum;
	private String RespPor;
	private String LCRNum;
	private String LCRPor;
	private String Observ;
	private String Responsible;
	private String Fecha;
	
	public DatosHosp003(){}
	public DatosHosp003(String datos_id,String MuestasNum,String MuestasPor,String HemosNum,String HemosPor,String RespNum,String RespPor,String LCRNum,String LCRPor,String Observ,String Responsible,String Fecha)
	{
	this.datos_id=datos_id;
	this.MuestasNum=MuestasNum;
	this.MuestasPor=MuestasPor;
	this.HemosNum=HemosNum;
	this.HemosPor=HemosPor;
	this.RespNum=RespNum;
	this.RespPor=RespPor;
	this.LCRNum=LCRNum;
	this.LCRPor=LCRPor;
	this.Observ=Observ;
	this.Responsible=Responsible;
	this.Fecha=Fecha;

	}
	

public String getdatos_id()
{
return datos_id;
}
public void setdatos_id(String datos_id)
{
this.datos_id=datos_id;
}
public String getMuestasNum()
{
return MuestasNum;
}
public void setMuestasNum(String MuestasNum)
{
this.MuestasNum=MuestasNum;
}
public String getMuestasPor()
{
return MuestasPor;
}
public void setMuestasPor(String MuestasPor)
{
this.MuestasPor=MuestasPor;
}
public String getHemosNum()
{
return HemosNum;
}
public void setHemosNum(String HemosNum)
{
this.HemosNum=HemosNum;
}
public String getHemosPor()
{
return HemosPor;
}
public void setHemosPor(String HemosPor)
{
this.HemosPor=HemosPor;
}
public String getRespNum()
{
return RespNum;
}
public void setRespNum(String RespNum)
{
this.RespNum=RespNum;
}
public String getRespPor()
{
return RespPor;
}
public void setRespPor(String RespPor)
{
this.RespPor=RespPor;
}
public String getLCRNum()
{
return LCRNum;
}
public void setLCRNum(String LCRNum)
{
this.LCRNum=LCRNum;
}
public String getLCRPor()
{
return LCRPor;
}
public void setLCRPor(String LCRPor)
{
this.LCRPor=LCRPor;
}
public String getObserv()
{
return Observ;
}
public void setObserv(String Observ)
{
this.Observ=Observ;
}
public String getResponsible()
{
return Responsible;
}
public void setResponsible(String Responsible)
{
this.Responsible=Responsible;
}
public String getFecha()
{
return Fecha;
}
public void setFecha(String Fecha)
{
this.Fecha=Fecha;
}

public String Crear()
{return "CREATE TABLE DatosHosp003 (datos_id INTEGER, MuestasNum TEXT, MuestasPor TEXT, HemosNum TEXT, HemosPor TEXT, RespNum TEXT, RespPor TEXT, LCRNum TEXT, LCRPor TEXT, Observ TEXT, Responsible TEXT, Fecha TEXT)";
	}

public long insertDatosHosp003(DatosHosp003 tipo, SQLiteDatabase db,boolean act,String datos_id)
{
ContentValues values = new ContentValues();
values.put("datos_id",tipo.getdatos_id());
values.put("MuestasNum",tipo.getMuestasNum());
values.put("MuestasPor",tipo.getMuestasPor());
values.put("HemosNum",tipo.getHemosNum());
values.put("HemosPor",tipo.getHemosPor());
values.put("RespNum",tipo.getRespNum());
values.put("RespPor",tipo.getRespPor());
values.put("LCRNum",tipo.getLCRNum());
values.put("LCRPor",tipo.getLCRPor());
values.put("Observ",tipo.getObserv());
values.put("Responsible",tipo.getResponsible());
values.put("Fecha",tipo.getFecha());

long id=0;
if(act)
{
	String[] args = new String[] {datos_id};		
     id = db.update("DatosHosp003",values,"datos_id=?",args);
}
else
{
	id = db.insert("DatosHosp003", null, values);
}
return id;
}


public DatosHosp003 selectDatosHosp003(String datos_id,SQLiteDatabase db)
{
DatosHosp003 tipo=null;
Cursor cursor=db.query("DatosHosp003" ,null,"datos_id=?",new String[] {datos_id},null, null, null);
cursor.moveToFirst();
tipo=new DatosHosp003(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11));
return tipo;
}

}
