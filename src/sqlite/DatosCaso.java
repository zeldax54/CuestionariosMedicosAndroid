package sqlite;


import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatosCaso {	
	private String caso_id;
	private String NombreCompleto;
	private String Sexo;
	private String FechaNac;	
	private String Anos;
	private String Meses;
	private String Dias;
	private String CI;
	private String Provincia;
	private String Municipio;
	private String DirParticular;
	private String AreaSalud;	
	private String FechaInicioSStringomas;
	private String NumHistClinica;
	private String NumSemanaEstadisticaEpid;	
	private String idcuestionario;
	
	 public DatosCaso(){}
	 public DatosCaso(String pidcaso,String pidcuestionario,String pNombreCompleto,String psexo,String pFechaNac,String pAnos,String pMeses,
			 String pDias,String pCI,String pProvincia,String pMunicipio,String pDirParticular,
			 String pAreaSalud,String pFechaSStringomas,String pNumHistClinica,String pNumSemanaEstadisticaEpid)
	 {
		 caso_id=pidcaso;
		 idcuestionario=pidcuestionario;
		 NombreCompleto=pNombreCompleto;
		 FechaNac=pFechaNac;
		 Sexo=psexo;
		 Anos=pAnos;
		 CI=pCI;
		 Meses=pMeses;
		 Dias=pDias;		
		 Provincia=pProvincia;
		 Municipio=pMunicipio;
		 DirParticular=pDirParticular;
		 AreaSalud=pAreaSalud;
		 FechaInicioSStringomas=pFechaSStringomas;
		 NumHistClinica=pNumHistClinica;
		 NumSemanaEstadisticaEpid=pNumSemanaEstadisticaEpid;
		
		 
		 
	 }
	
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public String getNombreCompleto()
	{
	return NombreCompleto;
	}
	public void setNombreCompleto(String NombreCompleto)
	{
	this.NombreCompleto=NombreCompleto;
	}

	public String getfechaNac()
	{
	return FechaNac;
	}
	public void setFechaNac(String FechaNac)
	{
	this.FechaNac=FechaNac;
	}

	public String getSexo()
	{
	return Sexo;
	}
	public void setSexo(String Sexo)
	{
	this.Sexo=Sexo;
	}
	public String getAnos()
	{
	return Anos;
	}
	public void setAnos(String Anos)
	{
	this.Anos=Anos;
	}
	public String getMeses()
	{
	return Meses;
	}
	public void setMeses(String Meses)
	{
	this.Meses=Meses;
	}
	public String getDias()
	{
	return Dias;
	}
	public void setDias(String Dias)
	{
	this.Dias=Dias;
	}


	public String getProvincia()
	{
	return Provincia;
	}
	public void setProvincia(String Provincia)
	{
	this.Provincia=Provincia;
	}
	public String getMunicipio()
	{
	return Municipio;
	}
	public void setMunicipio(String Municipio)
	{
	this.Municipio=Municipio;
	}
	public String getDirParticular()
	{
	return DirParticular;
	}
	public void setDirParticular(String DirParticular)
	{
	this.DirParticular=DirParticular;
	}
	public String getAreaSalud()
	{
	return AreaSalud;
	}
	public void setAreaSalud(String AreaSalud)
	{
	this.AreaSalud=AreaSalud;
	}
	public String getFechaInicioSStringomas()
	{
	return FechaInicioSStringomas;
	}
	public void setFechaInicioSStringomas(String FechaInicioSStringomas)
	{
	this.FechaInicioSStringomas=FechaInicioSStringomas;
	}
	public String getNumHistClinica()
	{
	return NumHistClinica;
	}
	public void setNumHistClinica(String NumHistClinica)
	{
	this.NumHistClinica=NumHistClinica;
	}
	public String getNumSemanaEstadisticaEpid()
	{
	return NumSemanaEstadisticaEpid;
	}
	public void setNumSemanaEstadisticaEpid(String NumSemanaEstadisticaEpid)
	{
	this.NumSemanaEstadisticaEpid=NumSemanaEstadisticaEpid;
	}

	public String getidcuestionario()
	{
	return idcuestionario;
	}
	public void setidcuestionario(String idcuestionario)
	{
	this.idcuestionario=idcuestionario;
	}
	


public String getCI()
{
return CI;
}
public void setCI(String CI)
{
this.CI=CI;
}


	
	
	
	
	public String Crear()
	  {
		  return "CREATE TABLE DatosCaso (caso_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,idcuestionario INTEGER, NombreCompleto TEXT,Sexo TEXT,FechaNac TIMESTAMP, "
		  		+ "Anos String, Meses String, Dias String,CI TEXT, Provincia TEXT,"
		  		+ " Municipio TEXT, DirParticular TEXT, AreaSalud TEXT, "
		  		+ "FechaInicioSStringomas TIMESTAMP, NumHistClinica TEXT,NumSemanaEstadisticaEpid TEXT)";
		  		
	  }
	
	
	public long insertDatosCaso(DatosCaso tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("idcuestionario",tipo.getidcuestionario());
	values.put("NombreCompleto",tipo.getNombreCompleto());
	values.put("FechaNac",tipo.getfechaNac().toString());
	values.put("Sexo",tipo.getSexo());
	values.put("Anos",tipo.getAnos());
	values.put("Meses",tipo.getMeses());
	values.put("Dias",tipo.getDias());
	values.put("CI",tipo.getCI());
	values.put("Provincia",tipo.getProvincia());
	values.put("Municipio",tipo.getMunicipio());
	values.put("DirParticular",tipo.getDirParticular());
	values.put("AreaSalud",tipo.getAreaSalud());
	values.put("FechaInicioSStringomas",tipo.getFechaInicioSStringomas().toString());
	values.put("NumHistClinica",tipo.getNumHistClinica());
	values.put("NumSemanaEstadisticaEpid",tipo.getNumSemanaEstadisticaEpid());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("DatosCaso",values,"caso_id=?",args);
	}
	else
	{
     id = db.insert("DatosCaso", null, values);
	}
	 return id;
	}
	
	
	
	public DatosCaso selectDatosCaso(String caso_id,SQLiteDatabase db)
	{
	DatosCaso tipo=null;
	Cursor cursor=db.query("DatosCaso" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new DatosCaso(String.valueOf(cursor.getString(0)),String.valueOf(cursor.getString(1)),String.valueOf(cursor.getString(2)),String.valueOf(cursor.getString(3)),String.valueOf(cursor.getString(4)),String.valueOf(cursor.getString(5)),String.valueOf(cursor.getString(6)),String.valueOf(cursor.getString(7)),String.valueOf(cursor.getString(8)),String.valueOf(cursor.getString(9)),String.valueOf(cursor.getString(10)),String.valueOf(cursor.getString(11)),String.valueOf(cursor.getString(12)),String.valueOf(cursor.getString(13)),String.valueOf(cursor.getString(14)),String.valueOf(cursor.getString(15)));
	return tipo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
