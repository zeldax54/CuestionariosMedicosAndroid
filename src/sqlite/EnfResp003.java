package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EnfResp003 {	
	private String caso_id;
	private boolean Consolidacion;
	private boolean DerramePleural;
	private boolean BroncogramaAereo;
	private boolean InfiltradoIntersticial;
	private boolean Empiema;
	private boolean Atelectasia;
	private String Otro;
	private String ClasifRx;
	private boolean CasoProbableNeumoniaBacteriana;
	public EnfResp003(){}
	
	public EnfResp003(String pcaso_id,boolean pConsolidacion,boolean pDerramePleural,boolean pBroncogramaAereo,boolean pInfiltradoIntersticial,boolean pEmpiema,boolean pAtelectasia,String pOtro,String pClasifRx,boolean pCasoProbableNeumoniaBacteriana)
	{
	caso_id=pcaso_id;
	Consolidacion=pConsolidacion;
	DerramePleural=pDerramePleural;
	BroncogramaAereo=pBroncogramaAereo;
	InfiltradoIntersticial=pInfiltradoIntersticial;
	Empiema=pEmpiema;
	Atelectasia=pAtelectasia;
	Otro=pOtro;
	ClasifRx=pClasifRx;
	CasoProbableNeumoniaBacteriana=pCasoProbableNeumoniaBacteriana;
	}
	
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getConsolidacion()
	{
	return Consolidacion;
	}
	public void setConsolidacion(boolean Consolidacion)
	{
	this.Consolidacion=Consolidacion;
	}
	public boolean getDerramePleural()
	{
	return DerramePleural;
	}
	public void setDerramePleural(boolean DerramePleural)
	{
	this.DerramePleural=DerramePleural;
	}
	public boolean getBroncogramaAereo()
	{
	return BroncogramaAereo;
	}
	public void setBroncogramaAereo(boolean BroncogramaAereo)
	{
	this.BroncogramaAereo=BroncogramaAereo;
	}
	public boolean getInfiltradoIntersticial()
	{
	return InfiltradoIntersticial;
	}
	public void setInfiltradoIntersticial(boolean InfiltradoIntersticial)
	{
	this.InfiltradoIntersticial=InfiltradoIntersticial;
	}
	public boolean getEmpiema()
	{
	return Empiema;
	}
	public void setEmpiema(boolean Empiema)
	{
	this.Empiema=Empiema;
	}
	public boolean getAtelectasia()
	{
	return Atelectasia;
	}
	public void setAtelectasia(boolean Atelectasia)
	{
	this.Atelectasia=Atelectasia;
	}
	public String getOtro()
	{
	return Otro;
	}
	public void setOtro(String Otro)
	{
	this.Otro=Otro;
	}
	public String getClasifRx()
	{
	return ClasifRx;
	}
	public void setClasifRx(String ClasifRx)
	{
	this.ClasifRx=ClasifRx;
	}
	public boolean getCasoProbableNeumoniaBacteriana()
	{
	return CasoProbableNeumoniaBacteriana;
	}
	public void setCasoProbableNeumoniaBacteriana(boolean CasoProbableNeumoniaBacteriana)
	{
	this.CasoProbableNeumoniaBacteriana=CasoProbableNeumoniaBacteriana;
	}
   
	
	public long insertEnfResp003(EnfResp003 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getcaso_id());
	values.put("Consolidacion",tipo.getConsolidacion());
	values.put("DerramePleural",tipo.getDerramePleural());
	values.put("BroncogramaAereo",tipo.getBroncogramaAereo());
	values.put("InfiltradoIntersticial",tipo.getInfiltradoIntersticial());
	values.put("Empiema",tipo.getEmpiema());
	values.put("Atelectasia",tipo.getAtelectasia());
	values.put("Otro",tipo.getOtro());
	values.put("ClasifRx",tipo.getClasifRx());
	values.put("CasoProbableNeumoniaBacteriana",tipo.getCasoProbableNeumoniaBacteriana());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("EnfResp003",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("EnfResp003", null, values);
	}

	return id;
	}
	
	public String Crear()
	{
	return "CREATE TABLE EnfResp003 (caso_id INTEGER PRIMARY KEY, Consolidacion boolean, DerramePleural boolean, "
			+ "BroncogramaAereo boolean, InfiltradoIntersticial boolean, Empiema boolean, Atelectasia boolean,"
			+ " Otro TEXT, ClasifRx TEXT, CasoProbableNeumoniaBacteriana boolean )";
	}
	
	public EnfResp003 selectEnfResp003(long caso_id,SQLiteDatabase db)
	{
	EnfResp003 tipo=null;
	Cursor cursor=db.query("EnfResp003" ,null,"caso_id=?",new String[] {Long.toString(caso_id)},null, null, null);
	cursor.moveToFirst();
	tipo=new EnfResp003(String.valueOf(cursor.getString(0)),booleanos(cursor.getString(1)),booleanos(cursor.getString(2)),booleanos(cursor.getString(3)),booleanos(cursor.getString(4)),booleanos(cursor.getString(5)),booleanos(cursor.getString(6)),String.valueOf(cursor.getString(7)),String.valueOf(cursor.getString(8)),booleanos(cursor.getString(9)));
	return tipo;
	}
	
	
	
	public boolean booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}

}
