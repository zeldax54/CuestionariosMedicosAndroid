package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class HospitalServicio {	
	private String caso_id;
	private String FechaConsulta;
	private String FechaNotif;
	private String NombreHosp;
	private boolean Urgencias;
	private boolean UCI;
	private String Orta;
	private boolean ReferidoOtroHosp;
	private boolean Respiratorio;
	private boolean Miscelanea;
	private String Consultprev;
	private String Hospitulta;
	public HospitalServicio(){}
	public HospitalServicio(String caso_id,String FechaConsulta,String FechaNotif,String NombreHosp,boolean Urgencias,boolean UCI,String Orta,boolean ReferidoOtroHosp,boolean Respiratorio,boolean Miscelanea,String Consultprev,String Hospitulta)
	{
	this.caso_id=caso_id;
	this.FechaConsulta=FechaConsulta;
	this.FechaNotif=FechaNotif;
	this.NombreHosp=NombreHosp;
	this.Urgencias=Urgencias;
	this.UCI=UCI;
	this.Orta=Orta;
	this.ReferidoOtroHosp=ReferidoOtroHosp;
	this.Respiratorio=Respiratorio;
	this.Miscelanea=Miscelanea;
	this.Consultprev=Consultprev;
	this.Hospitulta=Hospitulta;

	}
	public String Crear()	
	{
		return "CREATE TABLE HospitalServicio (caso_id INTEGER PRIMARY KEY,FechaConsulta TIMESTAMP,"
				+ "FechaNotif TIMESTAMP,NombreHosp TEXT,Urgencias boolean,UCI boolean,Otra TEXT,"
				+ "ReferidoOtroHosp boolean,Respiratorio boolean,Miscelanea boolean,Consultprev INTEGER,Hospitulta INTEGER)";
	}
	
	public String getFechaConsulta()
	{
	return FechaConsulta;
	}
	public void setFechaConsulta(String FechaConsulta)
	{
	this.FechaConsulta=FechaConsulta;
	}
	public String getFechaNotif()
	{
	return FechaNotif;
	}
	public void setFechaNotif(String FechaNotif)
	{
	this.FechaNotif=FechaNotif;
	}
	public String getNombreHosp()
	{
	return NombreHosp;
	}
	public void setNombreHosp(String NombreHosp)
	{
	this.NombreHosp=NombreHosp;
	}
	public boolean getUrgencias()
	{
	return Urgencias;
	}
	public void setUrgencias(boolean Urgencias)
	{
	this.Urgencias=Urgencias;
	}
	public boolean getUCI()
	{
	return UCI;
	}
	public void setUCI(boolean UCI)
	{
	this.UCI=UCI;
	}
	public String getOtra()
	{
	return Orta;
	}
	public void setOtra(String Otra)
	{
	this.Orta=Otra;
	}
	public boolean getReferidoOtroHosp()
	{
	return ReferidoOtroHosp;
	}
	public void setReferidoOtroHosp(boolean ReferidoOtroHosp)
	{
	this.ReferidoOtroHosp=ReferidoOtroHosp;
	}
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getRespiratorio()
	{
	return Respiratorio;
	}
	public void setRespiratorio(boolean Respiratorio)
	{
	this.Respiratorio=Respiratorio;
	}
	public boolean getMiscelanea()
	{
	return Miscelanea;
	}
	public void setMiscelanea(boolean Miscelanea)
	{
	this.Miscelanea=Miscelanea;
	}
	
	public String getConsultprev()
    {
     return Consultprev;
     }
	public void setConsultprev(String Consultprev)
    {
    this.Consultprev=Consultprev;
    }
	public String getHospitulta()
   {
    return Hospitulta;
   }
	public void setHospitulta(String Hospitulta)
   {
   this.Hospitulta=Hospitulta;
   }

	public long insert(HospitalServicio tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id", tipo.getcaso_id());
	values.put("FechaConsulta",tipo.getFechaConsulta().toString());
	values.put("FechaNotif",tipo.getFechaNotif().toString());
	values.put("NombreHosp",tipo.getNombreHosp());
	values.put("Urgencias",tipo.getUrgencias());
	values.put("UCI",tipo.getUCI());
	values.put("Otra",tipo.getOtra());
	values.put("ReferidoOtroHosp",tipo.getReferidoOtroHosp());
	
	values.put("Respiratorio",tipo.getRespiratorio());
	values.put("Miscelanea",tipo.getMiscelanea());
	values.put("Consultprev",tipo.getConsultprev());
	values.put("Hospitulta",tipo.getHospitulta());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
		id = db.update("HospitalServicio",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("HospitalServicio", null, values);
	}
	 return id;
	  
	
	}
	
	public HospitalServicio selectHospitalServicio(long caso_id,SQLiteDatabase db)
	{
	HospitalServicio tipo=null;
	Cursor cursor=db.query("HospitalServicio" ,null,"caso_id=?",new String[] {Long.toString(caso_id)},null, null, null);
	cursor.moveToFirst();
	tipo=new HospitalServicio(String.valueOf(cursor.getString(0)),String.valueOf(cursor.getString(1)),String.valueOf(cursor.getString(2)),String.valueOf(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),String.valueOf(cursor.getString(6)),Booleanos(cursor.getString(7)),Booleanos(cursor.getString(8)),Booleanos(cursor.getString(9)),String.valueOf(cursor.getString(10)),String.valueOf(cursor.getString(11)));
	return tipo;
	}
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}
}
