package sqlite;

import java.sql.Date;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.app.neumocuest.R;

public class EnfResp008 {
	
	public boolean HospitalizacionUCI;
	public String FechaIngresoUCI;
	public String FechaEgresoUCI;
	public int NumeroDiasUCI;
	public boolean VentilacionMecanica;
	public int NumeroDiasVentilacionMec;
	public boolean eCurado;
	public String eFechaeCurado;
	public boolean eAltaVoluntaria;
	public String eFechaAltaVolunt;	
	public boolean eReferidoOtroHosp;
	public String eFechaRefOtroHosp;
	public boolean eFallecido;
	public String eFallecidoFecha;
	public int  caso_id;
	
	public EnfResp008(){}
	public EnfResp008(boolean pHospitalizacionUCI,String pFechaIngresoUCI,String pFechaEgresoUCI,int pNumeroDiasUCI,boolean pVentilacionMecanica,int pNumeroDiasVentilacionMec,boolean peCurado,String peFechaeCurado,boolean peAltaVoluntaria,String peFechaAltaVolunt,boolean peReferidoOtroHosp,String peFechaRefOtroHosp,boolean peFallecido,String peFallecidoFecha,int pIdCaso)
	{
	HospitalizacionUCI=pHospitalizacionUCI;
	FechaIngresoUCI=pFechaIngresoUCI;
	FechaEgresoUCI=pFechaEgresoUCI;
	NumeroDiasUCI=pNumeroDiasUCI;
	VentilacionMecanica=pVentilacionMecanica;
	NumeroDiasVentilacionMec=pNumeroDiasVentilacionMec;
	eCurado=peCurado;
	eFechaeCurado=peFechaeCurado;
	eAltaVoluntaria=peAltaVoluntaria;
	eFechaAltaVolunt=peFechaAltaVolunt;
	eReferidoOtroHosp=peReferidoOtroHosp;
	eFechaRefOtroHosp=peFechaRefOtroHosp;
	eFallecido=peFallecido;
	eFallecidoFecha=peFallecidoFecha;
	 caso_id=pIdCaso;

	}
	public String Crear()
	{
		return "CREATE TABLE EnfResp008(caso_id INTEGER PRIMARY KEY,HospitalizacionUCI boolean,"
				+ "FechaIngresoUCI TEXT,FechaEgresoUCI TEXT,NumeroDiasUCI INTEGER,VentilacionMecanica boolean,"
				+ "NumeroDiasVentilacionMec INTEGER,eCurado boolean,eFechaeCurado TEXT,eAltaVoluntaria boolean,"
				+ "eFechaAltaVolunt TEXT,eReferidoOtroHosp boolean,eFechaRefOtroHosp TEXT,eFallecido boolean,eFallecidoFecha TEXT)";
	}

	public String geteFechaRefOtroHosp()
	{
	return eFechaRefOtroHosp;
	}
	public void seteFechaRefOtroHosp(String eFechaRefOtroHosp)
	{
	this.eFechaRefOtroHosp=eFechaRefOtroHosp;
	}

		
		public boolean getHospitalizacionUCI()
		{
		return HospitalizacionUCI;
		}
		public void setHospitalizacionUCI(boolean HospitalizacionUCI)
		{
		this.HospitalizacionUCI=HospitalizacionUCI;
		}
		public String getFechaIngresoUCI()
		{
		return FechaIngresoUCI;
		}
		public void setFechaIngresoUCI(String FechaIngresoUCI)
		{
		this.FechaIngresoUCI=FechaIngresoUCI;
		}
		public String getFechaEgresoUCI()
		{
		return FechaEgresoUCI;
		}
		public void setFechaEgresoUCI(String FechaEgresoUCI)
		{
		this.FechaEgresoUCI=FechaEgresoUCI;
		}
		public int getNumeroDiasUCI()
		{
		return NumeroDiasUCI;
		}
		public void setNumeroDiasUCI(int NumeroDiasUCI)
		{
		this.NumeroDiasUCI=NumeroDiasUCI;
		}
		public boolean getVentilacionMecanica()
		{
		return VentilacionMecanica;
		}
		public void setVentilacionMecanica(boolean VentilacionMecanica)
		{
		this.VentilacionMecanica=VentilacionMecanica;
		}
		public int getNumeroDiasVentilacionMec()
		{
		return NumeroDiasVentilacionMec;
		}
		public void setNumeroDiasVentilacionMec(int NumeroDiasVentilacionMec)
		{
		this.NumeroDiasVentilacionMec=NumeroDiasVentilacionMec;
		}
		public boolean geteCurado()
		{
		return eCurado;
		}
		public void seteCurado(boolean eCurado)
		{
		this.eCurado=eCurado;
		}
		public String geteFechaeCurado()
		{
		return eFechaeCurado;
		}
		public void seteFechaeCurado(String eFechaeCurado)
		{
		this.eFechaeCurado=eFechaeCurado;
		}
		public boolean geteAltaVoluntaria()
		{
		return eAltaVoluntaria;
		}
		public void seteAltaVoluntaria(boolean eAltaVoluntaria)
		{
		this.eAltaVoluntaria=eAltaVoluntaria;
		}
		public String geteFechaAltaVolunt()
		{
		return eFechaAltaVolunt;
		}
		public void seteFechaAltaVolunt(String eFechaAltaVolunt)
		{
		this.eFechaAltaVolunt=eFechaAltaVolunt;
		}
		public boolean geteReferidoOtroHosp()
		{
		return eReferidoOtroHosp;
		}
		public void seteReferidoOtroHosp(boolean eReferidoOtroHosp)
		{
		this.eReferidoOtroHosp=eReferidoOtroHosp;
		}
		public boolean geteFallecido()
		{
		return eFallecido;
		}
		public void seteFallecido(boolean eFallecido)
		{
		this.eFallecido=eFallecido;
		}
		public String geteFallecidoFecha()
		{
		return eFallecidoFecha;
		}
		public void seteFallecidoFecha(String eFallecidoFecha)
		{
		this.eFallecidoFecha=eFallecidoFecha;
		}
		public int getcaso_id()
		{
		return caso_id;
		}
		public void setcaso_id(int caso_id)
		{
		this.caso_id=caso_id;
		}

		

	public long insert(EnfResp008 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getcaso_id());
	values.put("HospitalizacionUCI",tipo.getHospitalizacionUCI());
	values.put("FechaIngresoUCI",tipo.getFechaIngresoUCI().toString());
	values.put("FechaEgresoUCI",tipo.getFechaEgresoUCI().toString());
	values.put("NumeroDiasUCI",tipo.getNumeroDiasUCI());
	values.put("VentilacionMecanica",tipo.getVentilacionMecanica());
	values.put("NumeroDiasVentilacionMec",tipo.getNumeroDiasVentilacionMec());
	values.put("eCurado",tipo.geteCurado());
	values.put("eFechaeCurado",tipo.geteFechaeCurado().toString());
	values.put("eAltaVoluntaria",tipo.geteAltaVoluntaria());
	values.put("eFechaAltaVolunt",tipo.geteFechaAltaVolunt().toString());
	values.put("eReferidoOtroHosp",tipo.geteReferidoOtroHosp());
	values.put("eFechaRefOtroHosp",tipo.geteFechaRefOtroHosp().toString());
	values.put("eFallecido",tipo.geteFallecido());
	values.put("eFallecidoFecha",tipo.geteFallecidoFecha().toString());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("EnfResp008",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("EnfResp008", null, values);
	}
	return id;
	}
	
	public EnfResp008 selectEnfResp006Ent(String caso_id,SQLiteDatabase db)
	{
	EnfResp008 tipo=null;
	 String[] args = new String[] {caso_id};
	 Cursor cursor=db.rawQuery("SELECT * FROM EnfResp008 WHERE caso_id=?",args); 
	cursor.moveToFirst();
	tipo=new EnfResp008(Booleanos(cursor.getString(1)),cursor.getString(2),cursor.getString(3),Integer.valueOf(cursor.getString(4)),Booleanos(cursor.getString(5)),Integer.valueOf(cursor.getString(6)),Booleanos(cursor.getString(7)),cursor.getString(8),Booleanos(cursor.getString(9)),cursor.getString(10),Booleanos(cursor.getString(11)),cursor.getString(12),Booleanos(cursor.getString(13)),cursor.getString(14),Integer.valueOf(cursor.getString(0)));
	return tipo;
	}
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}
	
	

}
