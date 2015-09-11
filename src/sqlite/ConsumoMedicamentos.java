package sqlite;

import java.util.ArrayList;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ConsumoMedicamentos {
	
	public String idreg;
	public String caso_id;
	public String nom_ant;
	public String diasconsumo;
	public ConsumoMedicamentos(){}
	public ConsumoMedicamentos(String pidreg,String pcaso_id,String pnomb,String pdiasc)
	{
		idreg=pidreg;
		caso_id=pcaso_id;
		nom_ant=pnomb;
		diasconsumo=pdiasc;
	}
	
	public String GetIDreg()
	{
		return idreg;
	}
	
	public void SetIDreg(String idreg)
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
	
	public String getnom_ant()
	{
	return nom_ant;
	}
	public void setnom_ant(String nom_ant)
	{
	this.nom_ant=nom_ant;
	}
	
	
	public String getdiasconsumo()
	{
	return diasconsumo;
	}
	public void setdiasconsumo(String diasconsumo)
	{
	this.diasconsumo=diasconsumo;
	}
	
	
	

	public String Create()
	{
		return "CREATE TABLE ConsumoMed(idreg INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,caso_id INTEGER NOT NULL,"
				+ " nom_ant TEXT,diasconsumo TEXT)";
	}
	
	public ArrayList<ConsumoMedicamentos> selectConsumo(String caso_id,SQLiteDatabase db)
	{
	 ConsumoMedicamentos tipo=null;
	 ArrayList<ConsumoMedicamentos> fin=new ArrayList<ConsumoMedicamentos>();
	 String[] args = new String[] {caso_id};
	 Cursor cursor=db.rawQuery("SELECT * FROM ConsumoMed WHERE caso_id=?",args);
	 if(cursor.moveToFirst())
		do
		{
			tipo=new ConsumoMedicamentos(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3));
	    fin.add(tipo);
		}while(cursor.moveToNext());
		
	return fin;
	}
	
	public void DeleteMed(String idregs,SQLiteDatabase db)
	{
		 db.execSQL("Delete from ConsumoMed where idreg="+idregs);
	}
	
	public boolean BuscarMed(String idreg,SQLiteDatabase db)
	{
		String[] args = new String[] {String.valueOf(idreg)};
		Cursor cursor = db.rawQuery("Select * FROM ConsumoMed WHERE idreg=?",args);
		if(cursor.moveToFirst())
			return true;
		else
		return false;
	}
	
	public long insertConsumoMed(ConsumoMedicamentos tipo, SQLiteDatabase db,boolean act)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id", tipo.getcaso_id());
	values.put("nom_ant",tipo.getnom_ant());
	values.put("diasconsumo",tipo.getdiasconsumo());
	
	long id=0;
 	if(act)
 	{
 		String[] args = new String[] {tipo.GetIDreg()};		
 	     id = db.update("ConsumoMed",values,"idreg=?",args);
 	}
 	else
 	{
 		id = db.insert("ConsumoMed", null, values);
 	}

	return id;
	}
	
	
	

}
