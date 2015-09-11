package sqlite;

import java.sql.Date;
import java.util.ArrayList;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.app.neumocuest.R;

public class Antibioticos {
	

	public String idreg;
	public String caso_id;
	public boolean Ult7Dias;
	public String ViaAdmin;
	public String NombreAnt;
	public String Fecha1raDos;
	public String Fecha2daDos;
	
	
	public Antibioticos(){}
	public Antibioticos(String pidreg,String pcaso_id,boolean pUlt7Dias,String pViaAdmin,String pNombreAnt,String pFecha1raDos,String pFecha2daDos)
	{
	idreg=pidreg;
	caso_id=pcaso_id;
	Ult7Dias=pUlt7Dias;
	ViaAdmin=pViaAdmin;
	NombreAnt=pNombreAnt;
	Fecha1raDos=pFecha1raDos;
	Fecha2daDos=pFecha2daDos;

	}
	
	public String Create()
	{
		return "CREATE TABLE Antibioticos(idreg INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,caso_id INTEGER NOT NULL,"
				+ " Ult7Dias boolean,ViaAdmin TEXT, NombreAnt TEXT, Fecha1raDos TIMESTAMP,"
				+ " Fecha2daDos TIMESTAMP )";
	}
 
	
	public String GetIDreg()
	{
		return idreg;
	}
	
	public void SetIDreg(String idreg)
	{
		this.idreg=idreg;
	}
	public String getViaAdmin()
	{
	return ViaAdmin;
	}
	public void setViaAdmint(String via)
	{
	this.ViaAdmin=via;
	}
	
	
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getUlt7Dias()
	{
	return Ult7Dias;
	}
	public void setUlt7Dias(boolean Ult7Dias)
	{
	this.Ult7Dias=Ult7Dias;
	}
	public String getNombreAnt()
	{
	return NombreAnt;
	}
	public void setNombreAnt(String NombreAnt)
	{
	this.NombreAnt=NombreAnt;
	}
	public String getFecha1raDos()
	{
	return Fecha1raDos;
	}
	public void setFecha1raDos(String Fecha1raDos)
	{
	this.Fecha1raDos=Fecha1raDos;
	}
	public String getFecha2daDos()
	{
	return Fecha2daDos;
	}
	public void setFecha2daDos(String Fecha2daDos)
	{
	this.Fecha2daDos=Fecha2daDos;
	}
	public long insertAntibioticosEnt(Antibioticos tipo, SQLiteDatabase db,boolean act)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id", tipo.getcaso_id());
	values.put("Ult7Dias",tipo.getUlt7Dias());
	values.put("NombreAnt",tipo.getNombreAnt());
	values.put("ViaAdmin",tipo.getViaAdmin());
	values.put("Fecha1raDos",tipo.getFecha1raDos().toString());
	values.put("Fecha2daDos",tipo.getFecha2daDos().toString());  
     
     long id=0;
 	if(act)
 	{
 		String[] args = new String[] {tipo.GetIDreg()};		
 	     id = db.update("Antibioticos",values,"idreg=?",args);
 	}
 	else
 	{
 		id = db.insert("Antibioticos", null, values);
 	}

 	return id;

	}

	
	public ArrayList<Antibioticos> selectAntibioticos(String caso_id,SQLiteDatabase db)
	{
	 Antibioticos tipo=null;
	 ArrayList<Antibioticos> fin=new ArrayList<Antibioticos>();
	 String[] args = new String[] {caso_id};
	 Cursor cursor=db.rawQuery("SELECT * FROM Antibioticos WHERE caso_id=?",args);
	 if(cursor.moveToFirst())
		do
		{
	   tipo=new Antibioticos(String.valueOf(cursor.getString(0)),String.valueOf(cursor.getString(1)),Booleanos(cursor.getString(2)),String.valueOf(cursor.getString(3)),cursor.getString(4),String.valueOf(cursor.getString(5)),String.valueOf(cursor.getString(6)));
	   fin.add(tipo);
		}while(cursor.moveToNext());
		
	return fin;
	}
	public void DeleteAnt(String idregs,SQLiteDatabase db)
	{
		 db.execSQL("Delete from Antibioticos where idreg="+idregs);
	}
	
	
	public boolean BuscarAnti(String idreg,SQLiteDatabase db)
	{
		String[] args = new String[] {idreg};
		Cursor cursor = db.rawQuery("Select * FROM Antibioticos WHERE idreg=?",args);
		if(cursor.moveToFirst())
			return true;
		else
		return false;
	}
	
	public boolean Booleanos(String x)
	 	{
	 		if(x.equals("0"))
	 			return false;
	 		return true;
	 	}
	

}
