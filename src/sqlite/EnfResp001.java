package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EnfResp001 {
	
	private String AntecedentesF;
	private String Fiebre;
	private boolean Tos;
	private boolean DolorGarganta;
	private boolean DificultadRespirar;
	private String FrecuenciaRespiratoria;
	private boolean RxTorax;
	private String RxToraxFechaIndicacion;
	private String caso_id;
	public EnfResp001(){}
	public EnfResp001(String pIdCaso,String pAntecedentesF,String pFiebre,boolean pTos,boolean pDolorGarganta,boolean pDificultadRespirar,String pFrecuenciaRespiratoria,boolean pRxTorax,String pRxToraxFechaIndicacion)
	{
	AntecedentesF=pAntecedentesF;
	Fiebre=pFiebre;
	Tos=pTos;
	DolorGarganta=pDolorGarganta;
	DificultadRespirar=pDificultadRespirar;
	FrecuenciaRespiratoria=pFrecuenciaRespiratoria;
	RxTorax=pRxTorax;
	RxToraxFechaIndicacion=pRxToraxFechaIndicacion;
	caso_id=pIdCaso;

	}
	
	public String getAntecedentesF()
	{
	return AntecedentesF;
	}
	public void setAntecedentesF(String AntecedentesF)
	{
	this.AntecedentesF=AntecedentesF;
	}
	public String getFiebre()
	{
	return Fiebre;
	}
	public void setFiebre(String Fiebre)
	{
	this.Fiebre=Fiebre;
	}
	public boolean getTos()
	{
	return Tos;
	}
	public void setTos(boolean Tos)
	{
	this.Tos=Tos;
	}
	public boolean getDolorGarganta()
	{
	return DolorGarganta;
	}
	public void setDolorGarganta(boolean DolorGarganta)
	{
	this.DolorGarganta=DolorGarganta;
	}
	public boolean getDificultadRespirar()
	{
	return DificultadRespirar;
	}
	public void setDificultadRespirar(boolean DificultadRespirar)
	{
	this.DificultadRespirar=DificultadRespirar;
	}
	public String getFrecuenciaRespiratoria()
	{
	return FrecuenciaRespiratoria;
	}
	public void setFrecuenciaRespiratoria(String FrecuenciaRespiratoria)
	{
	this.FrecuenciaRespiratoria=FrecuenciaRespiratoria;
	}
	
	public boolean getRxTorax()
	{
	return RxTorax;
	}
	public void setRxTorax(boolean RxTorax)
	{
	this.RxTorax=RxTorax;
	}
	public String getRxToraxFechaIndicacion()
	{
	return RxToraxFechaIndicacion;
	}
	public void setRxToraxFechaIndicacion(String RxToraxFechaIndicacion)
	{
	this.RxToraxFechaIndicacion=RxToraxFechaIndicacion;
	}
	
	public String getIdCaso()
	{
	return caso_id;
	}
	public void setIdCaso(String IdCaso)
	{
	this.caso_id=IdCaso;
	}

	public String Crear()
	{
		String fin="CREATE TABLE EnfResp001 (caso_id INTEGER PRIMARY KEY,"
				+ "AntecedentesF TEXT, Fiebre float, Tos boolean, DolorGarganta boolean, "
				+ "DificultadRespirar boolean, FrecuenciaRespiratoria float, RxTorax boolean, "
				+ "RxToraxFechaIndicacion TEXT)";
		return fin;
	}
	
	public long insertEnfResp001(EnfResp001 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getIdCaso());
	values.put("AntecedentesF",tipo.getAntecedentesF());
	values.put("Fiebre",tipo.getFiebre());
	values.put("Tos",tipo.getTos());
	values.put("DolorGarganta",tipo.getDolorGarganta());
	values.put("DificultadRespirar",tipo.getDificultadRespirar());
	values.put("FrecuenciaRespiratoria",tipo.getFrecuenciaRespiratoria());
	values.put("RxTorax",tipo.getRxTorax());
	values.put("RxToraxFechaIndicacion",tipo.getRxToraxFechaIndicacion());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("EnfResp001",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("EnfResp001", null, values);
	}
	 return id;

	}
	
	public EnfResp001 selectEnfResp001(long caso_id,SQLiteDatabase db)
	{
	EnfResp001 tipo=null;
	Cursor cursor=db.query("EnfResp001" ,null,"caso_id=?",new String[] {Long.toString(caso_id)},null, null, null);
	cursor.moveToFirst();
	tipo=new EnfResp001(String.valueOf(cursor.getString(0)),String.valueOf(cursor.getString(1)),String.valueOf(cursor.getString(2)),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),String.valueOf(cursor.getString(6)),Booleanos(cursor.getString(7)),String.valueOf(cursor.getString(8)));
	return tipo;
	}
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}

}
