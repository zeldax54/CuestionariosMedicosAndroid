package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class GrupoEdades {

	
	private String idreg;
	private String datos_id;
	private String Pertenece;
	private String e0_5m;
	private String e6_11m;
	private String e12_23m;
	private String e2_4a;
	private String e5_9a;
	private String e10_14a;
	private String e15_18a;
	
	public GrupoEdades(){}
	public GrupoEdades(String idreg,String datos_id,String Pertenece,String e0_5m,String e6_11m,String e12_23m,String e2_4a,String e5_9a,String e10_14a,String e15_18a)
	{
	this.idreg=idreg;
	this.datos_id=datos_id;
	this.Pertenece=Pertenece;
	this.e0_5m=e0_5m;
	this.e6_11m=e6_11m;
	this.e12_23m=e12_23m;
	this.e2_4a=e2_4a;
	this.e5_9a=e5_9a;
	this.e10_14a=e10_14a;
	this.e15_18a=e15_18a;
	}
	
	
	
	public String getidreg()
	{
	return idreg;
	}
	public void setidreg(String idreg)
	{
	this.idreg=idreg;
	}
	public String getdatos_id()
	{
	return datos_id;
	}
	public void setdatos_id(String datos_id)
	{
	this.datos_id=datos_id;
	}
	public String getPertenece()
	{
	return Pertenece;
	}
	public void setPertenece(String Pertenece)
	{
	this.Pertenece=Pertenece;
	}
	public String gete0_5m()
	{
	return e0_5m;
	}
	public void sete0_5m(String e0_5m)
	{
	this.e0_5m=e0_5m;
	}
	public String gete6_11m()
	{
	return e6_11m;
	}
	public void sete6_11m(String e6_11m)
	{
	this.e6_11m=e6_11m;
	}
	public String gete12_23m()
	{
	return e12_23m;
	}
	public void sete12_23m(String e12_23m)
	{
	this.e12_23m=e12_23m;
	}
	public String gete2_4a()
	{
	return e2_4a;
	}
	public void sete2_4a(String e2_4a)
	{
	this.e2_4a=e2_4a;
	}
	public String gete5_9a()
	{
	return e5_9a;
	}
	public void sete5_9a(String e5_9a)
	{
	this.e5_9a=e5_9a;
	}
	public String gete10_14a()
	{
	return e10_14a;
	}
	public void sete10_14a(String e10_14a)
	{
	this.e10_14a=e10_14a;
	}
	public String gete15_18a()
	{
	return e15_18a;
	}
	public void sete15_18a(String e15_18a)
	{
	this.e15_18a=e15_18a;
	}
	
	
	public String Crear()
	{
		return "CREATE TABLE GrupoEdades (idreg INTEGER PRIMARY KEY AUTOINCREMENT, datos_id INTEGER, Pertenece TEXT, e0_5m TEXT, e6_11m TEXT, e12_23m TEXT, e2_4a TEXT, e5_9a TEXT, e10_14a TEXT, e15_18a TEXT )";
	}
	
	
	public long insertGrupoEdades(GrupoEdades tipo, SQLiteDatabase db,boolean act,String caso_id,String pertenece)
	{
	ContentValues values = new ContentValues();	
	values.put("datos_id",tipo.getdatos_id());
	values.put("Pertenece",tipo.getPertenece());
	values.put("e0_5m",tipo.gete0_5m());
	values.put("e6_11m",tipo.gete6_11m());
	values.put("e12_23m",tipo.gete12_23m());
	values.put("e2_4a",tipo.gete2_4a());
	values.put("e5_9a",tipo.gete5_9a());
	values.put("e10_14a",tipo.gete10_14a());
	values.put("e15_18a",tipo.gete15_18a());
	long id=0;
	if(act)
	{
		 String[] args = new String[] {caso_id,pertenece};		
	     id = db.update("GrupoEdades",values,"datos_id=? and Pertenece=?",args);
	}
	else
	{
		 id = db.insert("GrupoEdades", null, values);
	}
	 return id;

	}
	
	
	public GrupoEdades selectGrupoEdades(String datos_id,String pertenece,SQLiteDatabase db)
	{
	GrupoEdades tipo=null;
	Cursor cursor=db.query("GrupoEdades" ,null,"datos_id=? and Pertenece=?",new String[] {datos_id,pertenece},null, null, null);
	cursor.moveToFirst();
	tipo=new GrupoEdades(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9));
	return tipo;
	}
	
	
	
	
}