package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EnfResp005 {
	
	private String IdCaso;
	private boolean SII;
	private String fiebreactual;
	private String numdias;
	private boolean dolorgarg;
	private boolean malestargen;
	private String otros_sintomas;
	private boolean ausenciasintomas;
	public EnfResp005(){}
	public EnfResp005(String pIdCaso,boolean pSII,String pfiebreactual,String pnumdias,boolean pdolorgarg,boolean pmalestargen,String potros_sintomas,boolean pausenciasintomas)
	{
	IdCaso=pIdCaso;
	SII=pSII;
	fiebreactual=pfiebreactual;
	numdias=pnumdias;
	dolorgarg=pdolorgarg;
	malestargen=pmalestargen;
	otros_sintomas=potros_sintomas;
	ausenciasintomas=pausenciasintomas;

	}
	public String getIdCaso()
	{
	return IdCaso;
	}
	public void setIdCaso(String IdCaso)
	{
	this.IdCaso=IdCaso;
	}
	public boolean getSII()
	{
	return SII;
	}
	public void setSII(boolean SII)
	{
	this.SII=SII;
	}
	public String getfiebreactual()
	{
	return fiebreactual;
	}
	public void setfiebreactual(String fiebreactual)
	{
	this.fiebreactual=fiebreactual;
	}
	public String getnumdias()
	{
	return numdias;
	}
	public void setnumdias(String numdias)
	{
	this.numdias=numdias;
	}
	public boolean getdolorgarg()
	{
	return dolorgarg;
	}
	public void setdolorgarg(boolean dolorgarg)
	{
	this.dolorgarg=dolorgarg;
	}
	public boolean getmalestargen()
	{
	return malestargen;
	}
	public void setmalestargen(boolean malestargen)
	{
	this.malestargen=malestargen;
	}
	public String getotros_sintomas()
	{
	return otros_sintomas;
	}
	public void setotros_sintomas(String otros_sintomas)
	{
	this.otros_sintomas=otros_sintomas;
	}
	public boolean getausenciasintomas()
	{
	return ausenciasintomas;
	}
	public void setausenciasintomas(boolean ausenciasintomas)
	{
	this.ausenciasintomas=ausenciasintomas;
	}


	public String Crear()
	{
	  return "CREATE TABLE EnfResp005 (caso_id INTEGER PRIMARY KEY,SII boolean,"
	  		+ " fiebreactual float, numdias float, dolorgarg boolean, malestargen boolean, "
	  		+ "otros_sintomas TEXT, ausenciasintomas boolean )";
	}
	public long insertEnfResp005(EnfResp005 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();	
	values.put("caso_id",tipo.getIdCaso());
	values.put("SII",tipo.getSII());
	values.put("fiebreactual",tipo.getfiebreactual());
	values.put("numdias",tipo.getnumdias());
	values.put("dolorgarg",tipo.getdolorgarg());
	values.put("malestargen",tipo.getmalestargen());
	values.put("otros_sintomas",tipo.getotros_sintomas());
	values.put("ausenciasintomas",tipo.getausenciasintomas());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("EnfResp005",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("EnfResp005", null, values);
	}

	return id;
	
	}
	public EnfResp005 selectEnfResp005(long caso_id,SQLiteDatabase db)
	{
	EnfResp005 tipo=null;
	Cursor cursor=db.query("EnfResp005" ,null,"caso_id=?",new String[] {Long.toString(caso_id)},null, null, null);
	cursor.moveToFirst();
	tipo=new EnfResp005(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),String.valueOf(cursor.getString(2)),String.valueOf(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),String.valueOf(cursor.getString(6)),Booleanos(cursor.getString(7)));
	return tipo;
	}
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}
	


}
