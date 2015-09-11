package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.app.neumocuest.R;

public class ResponsableEnt {
	
	public String NombreyApellidos;
	public String  caso_id;
	public String fecha;
	
	public String getNombreyApellidos() {
		return NombreyApellidos;
	}
	
	public void setNombreyApellidos(String pnombreyApellidos) {
		NombreyApellidos = pnombreyApellidos;
	}
	
	public void setfecha(String pfecha) {
		fecha = pfecha;
	}
	
	
	public String getfecha() {
		return fecha;
	}
	
	
	public String getcaso_id() {
		return caso_id;
	}
	
	public void setcaso_id(String caso_id)
	{
		this.caso_id=caso_id;
	}
	
	public ResponsableEnt(){}
	
	public ResponsableEnt(String pcaso_id,String pNombreyApellidos, String pfecha)
	{
		setNombreyApellidos(pNombreyApellidos);
		setfecha(pfecha);
		setcaso_id(pcaso_id);
		
	}
	
	public String Crear()
	{
		return "CREATE TABLE Responsable(caso_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,NombreyApellidos TEXT,fecha TEXT) ";
	}
	
	public long insert(ResponsableEnt tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getcaso_id());
	values.put("NombreyApellidos",tipo. getNombreyApellidos());
	values.put("fecha",tipo. getfecha());
	
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("Responsable",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("Responsable", null, values);
	}
	
	 return id;
	}
	
	 public ResponsableEnt selectResp(String caso_id,SQLiteDatabase db)
	 {
	 ResponsableEnt tipo=null;
	 String[] args = new String[] {caso_id};
	 Cursor cursor=db.rawQuery("SELECT * FROM Responsable WHERE caso_id=?",args); 
	 cursor.moveToFirst();
	 tipo=new ResponsableEnt(cursor.getString(0),cursor.getString(1),cursor.getString(2));
	 return tipo;
	 }
	 
	 

}
