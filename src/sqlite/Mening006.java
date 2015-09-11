package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class Mening006 {

	private String IdCaso;
	private boolean HospUCI;
	private String FechaIngreso;
	private String FechaEgreso;
	private String NumDias;
	private boolean VentMecanicaSI;
	private String NumDiasVentMecanica;
	private boolean EgresoHospitalario;
	private boolean Curado;
	private String fechacurado;
	private boolean AltaVoluntaria;
	private String FechaAVoluntaria;
	private boolean RefOHosp;
	private String FechaRefOHospital;
	private boolean Fallecido;
	private String FechaFallecido;
	private boolean Autopsia;
	private String FechaAutopsia;
	
	public Mening006(){}
	public Mening006(String IdCaso,boolean HospUCI,String FechaIngreso,String FechaEgreso,String NumDias,boolean VentMecanicaSI,String NumDiasVentMecanica,boolean EgresoHospitalario,boolean Curado,String fechacurado,boolean AltaVoluntaria,String FechaAVoluntaria,boolean RefOHosp,String FechaRefOHospital,boolean Fallecido,String FechaFallecido,boolean Autopsia,String FechaAutopsia)
	{
	this.IdCaso=IdCaso;
	this.HospUCI=HospUCI;
	this.FechaIngreso=FechaIngreso;
	this.FechaEgreso=FechaEgreso;
	this.NumDias=NumDias;
	this.VentMecanicaSI=VentMecanicaSI;
	this.NumDiasVentMecanica=NumDiasVentMecanica;
	this.EgresoHospitalario=EgresoHospitalario;
	this.Curado=Curado;
	this.fechacurado=fechacurado;
	this.AltaVoluntaria=AltaVoluntaria;
	this.FechaAVoluntaria=FechaAVoluntaria;
	this.RefOHosp=RefOHosp;
	this.FechaRefOHospital=FechaRefOHospital;
	this.Fallecido=Fallecido;
	this.FechaFallecido=FechaFallecido;
	this.Autopsia=Autopsia;
	this.FechaAutopsia=FechaAutopsia;

	}
	

public String getIdCaso()
{
return IdCaso;
}
public void setIdCaso(String IdCaso)
{
this.IdCaso=IdCaso;
}
public boolean getHospUCI()
{
return HospUCI;
}
public void setHospUCI(boolean HospUCI)
{
this.HospUCI=HospUCI;
}
public String getFechaIngreso()
{
return FechaIngreso;
}
public void setFechaIngreso(String FechaIngreso)
{
this.FechaIngreso=FechaIngreso;
}
public String getFechaEgreso()
{
return FechaEgreso;
}
public void setFechaEgreso(String FechaEgreso)
{
this.FechaEgreso=FechaEgreso;
}
public String getNumDias()
{
return NumDias;
}
public void setNumDias(String NumDias)
{
this.NumDias=NumDias;
}
public boolean getVentMecanicaSI()
{
return VentMecanicaSI;
}
public void setVentMecanicaSI(boolean VentMecanicaSI)
{
this.VentMecanicaSI=VentMecanicaSI;
}
public String getNumDiasVentMecanica()
{
return NumDiasVentMecanica;
}
public void setNumDiasVentMecanica(String NumDiasVentMecanica)
{
this.NumDiasVentMecanica=NumDiasVentMecanica;
}
public boolean getEgresoHospitalario()
{
return EgresoHospitalario;
}
public void setEgresoHospitalario(boolean EgresoHospitalario)
{
this.EgresoHospitalario=EgresoHospitalario;
}
public boolean getCurado()
{
return Curado;
}
public void setCurado(boolean Curado)
{
this.Curado=Curado;
}
public String getfechacurado()
{
return fechacurado;
}
public void setfechacurado(String fechacurado)
{
this.fechacurado=fechacurado;
}
public boolean getAltaVoluntaria()
{
return AltaVoluntaria;
}
public void setAltaVoluntaria(boolean AltaVoluntaria)
{
this.AltaVoluntaria=AltaVoluntaria;
}
public String getFechaAVoluntaria()
{
return FechaAVoluntaria;
}
public void setFechaAVoluntaria(String FechaAVoluntaria)
{
this.FechaAVoluntaria=FechaAVoluntaria;
}
public boolean getRefOHosp()
{
return RefOHosp;
}
public void setRefOHosp(boolean RefOHosp)
{
this.RefOHosp=RefOHosp;
}
public String getFechaRefOHospital()
{
return FechaRefOHospital;
}
public void setFechaRefOHospital(String FechaRefOHospital)
{
this.FechaRefOHospital=FechaRefOHospital;
}
public boolean getFallecido()
{
return Fallecido;
}
public void setFallecido(boolean Fallecido)
{
this.Fallecido=Fallecido;
}
public String getFechaFallecido()
{
return FechaFallecido;
}
public void setFechaFallecido(String FechaFallecido)
{
this.FechaFallecido=FechaFallecido;
}
public boolean getAutopsia()
{
return Autopsia;
}
public void setAutopsia(boolean Autopsia)
{
this.Autopsia=Autopsia;
}
public String getFechaAutopsia()
{
return FechaAutopsia;
}
public void setFechaAutopsia(String FechaAutopsia)
{
this.FechaAutopsia=FechaAutopsia;
}


	public String Crear()
	{
		 return "CREATE TABLE Mening006 (caso_id INTEGER, HospUCI boolean, FechaIngreso TEXT, FechaEgreso TEXT, NumDias TEXT, VentMecanicaSI boolean, NumDiasVentMecanica TEXT, EgresoHospitalario boolean, Curado boolean, fechacurado TEXT, AltaVoluntaria boolean, FechaAVoluntaria TEXT, RefOHosp boolean, FechaRefOHospital TEXT, Fallecido boolean, FechaFallecido TEXT, Autopsia boolean, FechaAutopsia TEXT)";
	}
	
	public long insertMening006(Mening006 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getIdCaso());
	values.put("HospUCI",tipo.getHospUCI());
	values.put("FechaIngreso",tipo.getFechaIngreso());
	values.put("FechaEgreso",tipo.getFechaEgreso());
	values.put("NumDias",tipo.getNumDias());
	values.put("VentMecanicaSI",tipo.getVentMecanicaSI());
	values.put("NumDiasVentMecanica",tipo.getNumDiasVentMecanica());
	values.put("EgresoHospitalario",tipo.getEgresoHospitalario());
	values.put("Curado",tipo.getCurado());
	values.put("fechacurado",tipo.getfechacurado());
	values.put("AltaVoluntaria",tipo.getAltaVoluntaria());
	values.put("FechaAVoluntaria",tipo.getFechaAVoluntaria());
	values.put("RefOHosp",tipo.getRefOHosp());
	values.put("FechaRefOHospital",tipo.getFechaRefOHospital());
	values.put("Fallecido",tipo.getFallecido());
	values.put("FechaFallecido",tipo.getFechaFallecido());
	values.put("Autopsia",tipo.getAutopsia());
	values.put("FechaAutopsia",tipo.getFechaAutopsia());	 
	 long id=0;		
		if(act)
		{
			String[] args = new String[] {caso_id};		
		     id = db.update("Mening006",values,"caso_id=?",args);
		}
		else
		{
			id = db.insert("Mening006", null, values);
		}
		 return id;
	}
	
	
	public Mening006 selectMening006(String caso_id,SQLiteDatabase db)
	{
	Mening006 tipo=null;
	Cursor cursor=db.query("Mening006" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new Mening006(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),String.valueOf(cursor.getString(2)),String.valueOf(cursor.getString(3)),String.valueOf(cursor.getString(4)),Booleanos(cursor.getString(5)),String.valueOf(cursor.getString(6)),Booleanos(cursor.getString(7)),Booleanos(cursor.getString(8)),String.valueOf(cursor.getString(9)),Booleanos(cursor.getString(10)),String.valueOf(cursor.getString(11)),Booleanos(cursor.getString(12)),String.valueOf(cursor.getString(13)),Booleanos(cursor.getString(14)),String.valueOf(cursor.getString(15)),Booleanos(cursor.getString(16)),String.valueOf(cursor.getString(17)));
	return tipo;
	}
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}

}
