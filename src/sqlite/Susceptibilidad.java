package sqlite;

import java.sql.Date;
import java.util.ArrayList;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.app.neumocuest.R;

public class Susceptibilidad {
	
	private String idreg;
	private String caso_id;
	private String Nombre;
	private String Tipo;
	private String Origen;
	private String fecharesult;
	
	public Susceptibilidad(){}
	public Susceptibilidad(String idreg,String caso_id,String Nombre,String Tipo,String Origen,String fecharesult)
	{
	this.idreg=idreg;
	this.caso_id=caso_id;
	this.Nombre=Nombre;
	this.Tipo=Tipo;
	this.Origen=Origen;
	this.fecharesult=fecharesult;

	}
	
	
	public String Crear()
	{
		return "CREATE TABLE Susceptibilidad (idreg INTEGER PRIMARY KEY AUTOINCREMENT,caso_id INTEGER, Nombre TEXT, Tipo TEXT, Origen TEXT, fecharesult TEXT)";
	}

public String getidreg()
{
return idreg;
}
public void setidreg(String idreg)
{
this.idreg=idreg;
}
public String getcaso_id()
{
return caso_id;
}
public void setcaso_id(String caso_id)
{
this.caso_id=caso_id;
}
public String getNombre()
{
return Nombre;
}
public void setNombre(String Nombre)
{
this.Nombre=Nombre;
}
public String getTipo()
{
return Tipo;
}
public void setTipo(String Tipo)
{
this.Tipo=Tipo;
}
public String getOrigen()
{
return Origen;
}
public void setOrigen(String Origen)
{
this.Origen=Origen;
}
public String getfecharesult()
{
return fecharesult;
}
public void setfecharesult(String fecharesult)
{
this.fecharesult=fecharesult;
}

public long insertSusceptibilidad(Susceptibilidad tipo, SQLiteDatabase db,boolean act)
{
ContentValues values = new ContentValues();
values.put("caso_id",tipo.getcaso_id());
values.put("Nombre",tipo.getNombre());
values.put("Tipo",tipo.getTipo());
values.put("Origen",tipo.getOrigen());
values.put("fecharesult",tipo.getfecharesult());
long id=0;
if(act)
{
	String[] args = new String[] {tipo.getidreg()};		
     id = db.update("Susceptibilidad",values,"idreg=?",args);
}
else
{
	id = db.insert("Susceptibilidad", null, values);
}
return id;

}

  public long Actualizar(Susceptibilidad tipo, SQLiteDatabase db)
  {
   ContentValues values = new ContentValues();
   values.put("caso_id",tipo.getcaso_id());
   values.put("Nombre",tipo.getNombre());
   values.put("Tipo",tipo.getTipo());
   values.put("Origen",tipo.getOrigen());
   values.put("fecharesult",tipo.getfecharesult());
   String[] args = new String[] {tipo.getcaso_id()};
   long id = db.update("Susceptibilidad", values,"caso_id=?",args);
   return id;
   }
  
	 public ArrayList<Susceptibilidad> selectSuseptibilidad(String caso_id,String Origen,String tiposusc,SQLiteDatabase db)
	 {
	 Susceptibilidad tipo=null;
	 ArrayList<Susceptibilidad> fin=new ArrayList<Susceptibilidad>();
	 String[] args = new String[] {caso_id,Origen,tiposusc};
	 Cursor cursor=db.rawQuery("SELECT * FROM Susceptibilidad WHERE caso_id=? and Origen=? and Tipo=?",args); 
	 if(cursor.moveToFirst())
	 {
      do	
      {
    	  tipo=new Susceptibilidad(String.valueOf(cursor.getString(0)),String.valueOf(cursor.getString(1)),String.valueOf(cursor.getString(2)),String.valueOf(cursor.getString(3)),String.valueOf(cursor.getString(4)),String.valueOf(cursor.getString(5)));
      fin.add(tipo);
      }
      while(cursor.moveToNext());
	 }
	 return fin;	 
    }
	 
	 
	 
	    public boolean Booleanos(String x)
		{
			if(x.equals("0"))
				return false;
			return true;
		}
	 
	 public boolean Buscar(String idreg,SQLiteDatabase db)
		{
			String[] args = new String[] {idreg};
			Cursor cursor = db.rawQuery("Select * FROM Susceptibilidad WHERE idreg=?",args);
			if(cursor.moveToFirst())
				return true;
			else
			return false;
		}
	 
	 public void Delete(String idregs,SQLiteDatabase db)
		{
			 db.execSQL("Delete from Susceptibilidad where idreg="+idregs);
		}
		

}
