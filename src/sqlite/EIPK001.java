package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EIPK001 {
	
	private String caso_id;
	private String idcuestionario;
	private String Nombre;
	private String carne;
	private String direccion;
	private String municipio;
	private String provincia;
	private String histclinica;
	private String edad;
	private String sexo;
	private String oucpacion;
	private String piel;
	private String diasingreso;
	private String centrorem;
	private String sala;
	private String municipio2;
	private String provincia2;
	private String fecha;
	
	public EIPK001(){}
	public EIPK001(String caso_id,String idcuestionario,String Nombre,String carne,String direccion,String municipio,String provincia,String histclinica,String edad,String sexo,String oucpacion,String piel,String diasingreso,String centrorem,String sala,String municipio2,String provincia2,String fecha)
	{
	this.caso_id=caso_id;
	this.idcuestionario=idcuestionario;
	this.Nombre=Nombre;
	this.carne=carne;
	this.direccion=direccion;
	this.municipio=municipio;
	this.provincia=provincia;
	this.histclinica=histclinica;
	this.edad=edad;
	this.sexo=sexo;
	this.oucpacion=oucpacion;
	this.piel=piel;
	this.diasingreso=diasingreso;
	this.centrorem=centrorem;
	this.sala=sala;
	this.municipio2=municipio2;
	this.provincia2=provincia2;
	this.fecha=fecha;

	}
	

public String getcaso_id()
{
return caso_id;
}
public void setcaso_id(String caso_id)
{
this.caso_id=caso_id;
}
public String getidcuestionario()
{
return idcuestionario;
}
public void setidcuestionario(String idcuestionario)
{
this.idcuestionario=idcuestionario;
}
public String getNombre()
{
return Nombre;
}
public void setNombre(String Nombre)
{
this.Nombre=Nombre;
}
public String getcarne()
{
return carne;
}
public void setcarne(String carne)
{
this.carne=carne;
}
public String getdireccion()
{
return direccion;
}
public void setdireccion(String direccion)
{
this.direccion=direccion;
}
public String getmunicipio()
{
return municipio;
}
public void setmunicipio(String municipio)
{
this.municipio=municipio;
}
public String getprovincia()
{
return provincia;
}
public void setprovincia(String provincia)
{
this.provincia=provincia;
}
public String gethistclinica()
{
return histclinica;
}
public void sethistclinica(String histclinica)
{
this.histclinica=histclinica;
}
public String getedad()
{
return edad;
}
public void setedad(String edad)
{
this.edad=edad;
}
public String getsexo()
{
return sexo;
}
public void setsexo(String sexo)
{
this.sexo=sexo;
}
public String getoucpacion()
{
return oucpacion;
}
public void setoucpacion(String oucpacion)
{
this.oucpacion=oucpacion;
}
public String getpiel()
{
return piel;
}
public void setpiel(String piel)
{
this.piel=piel;
}
public String getdiasingreso()
{
return diasingreso;
}
public void setdiasingreso(String diasingreso)
{
this.diasingreso=diasingreso;
}
public String getcentrorem()
{
return centrorem;
}
public void setcentrorem(String centrorem)
{
this.centrorem=centrorem;
}
public String getsala()
{
return sala;
}
public void setsala(String sala)
{
this.sala=sala;
}
public String getmunicipio2()
{
return municipio2;
}
public void setmunicipio2(String municipio2)
{
this.municipio2=municipio2;
}
public String getprovincia2()
{
return provincia2;
}
public void setprovincia2(String provincia2)
{
this.provincia2=provincia2;
}
public String getfecha()
{
return fecha;
}
public void setfecha(String fecha)
{
this.fecha=fecha;
}

public String Crear()
{
	return "CREATE TABLE EIPK001 (caso_id INTEGER PRIMARY KEY AUTOINCREMENT,idcuestionario INTEGER, Nombre TEXT, carne TEXT, direccion TEXT, municipio TEXT, provincia TEXT, histclinica TEXT, edad TEXT, sexo TEXT, oucpacion TEXT, piel TEXT, diasingreso TEXT, centrorem TEXT, sala TEXT, municipio2 TEXT, provincia2 TEXT, fecha TEXT)";}


public long insertEIPK001(EIPK001 tipo, SQLiteDatabase db,boolean act,String caso_id)
{
ContentValues values = new ContentValues();
values.put("idcuestionario",tipo.getidcuestionario());
values.put("Nombre",tipo.getNombre());
values.put("carne",tipo.getcarne());
values.put("direccion",tipo.getdireccion());
values.put("municipio",tipo.getmunicipio());
values.put("provincia",tipo.getprovincia());
values.put("histclinica",tipo.gethistclinica());
values.put("edad",tipo.getedad());
values.put("sexo",tipo.getsexo());
values.put("oucpacion",tipo.getoucpacion());
values.put("piel",tipo.getpiel());
values.put("diasingreso",tipo.getdiasingreso());
values.put("centrorem",tipo.getcentrorem());
values.put("sala",tipo.getsala());
values.put("municipio2",tipo.getmunicipio2());
values.put("provincia2",tipo.getprovincia2());
values.put("fecha",tipo.getfecha());
long id=0;
if(act)
{
	String[] args = new String[] {caso_id};		
     id = db.update("EIPK001",values,"caso_id=?",args);
}
else
{
 id = db.insert("EIPK001", null, values);
}
 return id;

}

public EIPK001 selectEIPK001(String caso_id,SQLiteDatabase db)
{
EIPK001 tipo=null;
Cursor cursor=db.query("EIPK001" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
cursor.moveToFirst();
tipo=new EIPK001(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11),cursor.getString(12),cursor.getString(13),cursor.getString(14),cursor.getString(15),cursor.getString(16),cursor.getString(17));
return tipo;
}






}










