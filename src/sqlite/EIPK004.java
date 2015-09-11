package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EIPK004 {
	
	private String caso_id;
	private String app;
	private String enfsimilar;
	private String historiaviajes;
	private String pais;
	private String fechallegada;
	private String tratprev;
	private String cuales;
	private String vac;
	private String fecha2;
	private String nombre;
	private String result;
	public EIPK004(){}
	public EIPK004(String caso_id,String app,String enfsimilar,String historiaviajes,String pais,String fechallegada,String tratprev,String cuales,String vac,String fecha2,String nombre,String result)
	{
	this.caso_id=caso_id;
	this.app=app;
	this.enfsimilar=enfsimilar;
	this.historiaviajes=historiaviajes;
	this.pais=pais;
	this.fechallegada=fechallegada;
	this.tratprev=tratprev;
	this.cuales=cuales;
	this.vac=vac;
	this.fecha2=fecha2;
	this.nombre=nombre;
	this.result=result;

	}
	public String getcuales()
	{
	return cuales;
	}
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public String getapp()
	{
	return app;
	}
	public void setapp(String app)
	{
	this.app=app;
	}
	public String getenfsimilar()
	{
	return enfsimilar;
	}
	public void setenfsimilar(String enfsimilar)
	{
	this.enfsimilar=enfsimilar;
	}
	public String gethistoriaviajes()
	{
	return historiaviajes;
	}
	public void sethistoriaviajes(String historiaviajes)
	{
	this.historiaviajes=historiaviajes;
	}
	public String getpais()
	{
	return pais;
	}
	public void setpais(String pais)
	{
	this.pais=pais;
	}
	public String getfechallegada()
	{
	return fechallegada;
	}
	public void setfechallegada(String fechallegada)
	{
	this.fechallegada=fechallegada;
	}
	public String gettratprev()
	{
	return tratprev;
	}
	public void settratprev(String tratprev)
	{
	this.tratprev=tratprev;
	}
	public String getvac()
	{
	return vac;
	}
	public void setvac(String vac)
	{
	this.vac=vac;
	}
	public String getfecha2()
	{
	return fecha2;
	}
	public void setfecha2(String fecha2)
	{
	this.fecha2=fecha2;
	}
	public String getnombre()
	{
	return nombre;
	}
	public void setnombre(String nombre)
	{
	this.nombre=nombre;
	}
	public String getresult()
	{
	return result;
	}
	public void setresult(String result)
	{
	this.result=result;
	}
	
	public String Crear()
	{
		return "CREATE TABLE EIPK004 (caso_id INTEGER PRIMARY KEY ,app TEXT, enfsimilar TEXT, historiaviajes TEXT, pais TEXT, fechallegada TEXT, tratprev TEXT,cuales TEXT, vac TEXT, fecha2 TEXT, nombre TEXT, result TEXT)";
	}
	
	
	public long insertEIPK004(EIPK004 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getcaso_id());
	values.put("app",tipo.getapp());
	values.put("enfsimilar",tipo.getenfsimilar());
	values.put("historiaviajes",tipo.gethistoriaviajes());
	values.put("pais",tipo.getpais());
	values.put("fechallegada",tipo.getfechallegada());
	values.put("tratprev",tipo.gettratprev());
	values.put("cuales", tipo.getcuales());
	values.put("vac",tipo.getvac());
	values.put("fecha2",tipo.getfecha2());
	values.put("nombre",tipo.getnombre());
	values.put("result",tipo.getresult());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("EIPK004",values,"caso_id=?",args);
	}
	else
	{
	 id = db.insert("EIPK004", null, values);
	}
	
	return id;

	}
	
	public EIPK004 selectEIPK004(String caso_id,SQLiteDatabase db)
	{
	EIPK004 tipo=null;
	Cursor cursor=db.query("EIPK004" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new EIPK004(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11));
	return tipo;
	}
	
	
	
	
	
	
	
	
	


}
