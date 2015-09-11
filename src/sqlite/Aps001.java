package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Aps001 {

	private String caso_id;
	private String NoSemEstEpid;
	private String FechaConsulta;
	private String NombAreaSalud;
	private String NumCMF;
	private String PrimConsulta;
	private String NumConsultPMotivActual;
	
	public Aps001(){}
	public Aps001(String caso_id,String NoSemEstEpid,String FechaConsulta,String NombAreaSalud,String NumCMF,String PrimConsulta,String NumConsultPMotivActual)
	{
	this.caso_id=caso_id;
	this.NoSemEstEpid=NoSemEstEpid;
	this.FechaConsulta=FechaConsulta;
	this.NombAreaSalud=NombAreaSalud;
	this.NumCMF=NumCMF;
	this.PrimConsulta=PrimConsulta;
	this.NumConsultPMotivActual=NumConsultPMotivActual;

	}
	
	public String getidCaso()
	{
	return caso_id;
	}
	public void setidCaso(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public String getNoSemEstEpid()
	{
	return NoSemEstEpid;
	}
	public void setNoSemEstEpid(String NoSemEstEpid)
	{
	this.NoSemEstEpid=NoSemEstEpid;
	}
	public String getFechaConsulta()
	{
	return FechaConsulta;
	}
	public void setFechaConsulta(String FechaConsulta)
	{
	this.FechaConsulta=FechaConsulta;
	}
	public String getNombAreaSalud()
	{
	return NombAreaSalud;
	}
	public void setNombAreaSalud(String NombAreaSalud)
	{
	this.NombAreaSalud=NombAreaSalud;
	}
	public String getNumCMF()
	{
	return NumCMF;
	}
	public void setNumCMF(String NumCMF)
	{
	this.NumCMF=NumCMF;
	}
	public String getPrimConsulta()
	{
	return PrimConsulta;
	}
	public void setPrimConsulta(String PrimConsulta)
	{
	this.PrimConsulta=PrimConsulta;
	}
	public String getNumConsultPMotivActual()
	{
	return NumConsultPMotivActual;
	}
	public void setNumConsultPMotivActual(String NumConsultPMotivActual)
	{
	this.NumConsultPMotivActual=NumConsultPMotivActual;
	}

	public String Crear()
	{
		return "CREATE TABLE Aps001 (caso_id INTEGER PRIMARY KEY, NoSemEstEpid INTEGER, "
				+ "FechaConsulta TEXT, NombAreaSalud TEXT, NumCMF TEXT, "
				+ "PrimConsulta TEXT, NumConsultPMotivActual TEXT)";
	}
	
	public long insertAps001(Aps001 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getidCaso());
	values.put("NoSemEstEpid",tipo.getNoSemEstEpid());
	values.put("FechaConsulta",tipo.getFechaConsulta());
	values.put("NombAreaSalud",tipo.getNombAreaSalud());
	values.put("NumCMF",tipo.getNumCMF());
	values.put("PrimConsulta",tipo.getPrimConsulta());
	values.put("NumConsultPMotivActual",tipo.getNumConsultPMotivActual());
	
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("Aps001",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("Aps001", null, values);
	}
	
	return id;
	
	}
	
	
	
	public Aps001 selectAps001(String caso_id,SQLiteDatabase db)
	{
	Aps001 tipo=null;
	Cursor cursor=db.query("Aps001" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new Aps001(String.valueOf(cursor.getString(0)),String.valueOf(cursor.getString(1)),String.valueOf(cursor.getString(2)),String.valueOf(cursor.getString(3)),String.valueOf(cursor.getString(4)),String.valueOf(cursor.getString(5)),String.valueOf(cursor.getString(6)));
	return tipo;
	}

	/*cambiar Bolean x boleanos*/
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}
}
