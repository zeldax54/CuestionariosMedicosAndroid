package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EnfResp006 {
	
	private String caso_id;
	private boolean ERasma;
	private boolean ERotraenfpulm;
	private boolean ERinmunodef;
	private boolean ERcard;
	private boolean ERdiab;
	private String ERotra1;
	private boolean ERenfhep;
	private boolean ERenfNeurolg;
	private String ERotra2;
	private boolean ERenfrenal;
	private boolean ERobesidad;
	private String ERotra3;
	private String FRpersonasdorm;
	private String FRconvivientes;
	private String FRfumadores;
	private String FRasistenciacirc;
	private String FRlactancia;
	private String FRbajopeso;
	private String FRmadrevac;
	private String FRepisodiosira;
	private String FRantecedentesrinitis;
	private String Consumo;
	private String oseltamivir;
	private String fechainiciooselt;
	public EnfResp006(){}
	public EnfResp006(String pcaso_id,boolean pERasma,boolean pERotraenfpulm,boolean pERinmunodef,boolean pERcard,boolean pERdiab,String pERotra1,boolean pERenfhep,boolean pERenfNeurolg,String pERotra2,boolean pERenfrenal,boolean pERobesidad,String pERotra3,String pFRpersonasdorm,String pFRconvivientes,String pFRfumadores,String pFRasistenciacirc,String pFRlactancia,String pFRbajopeso,String pFRmadrevac,String pFRepisodiosira,String pFRantecedentesrinitis,String pConsumo,String poseltamivir,String pfechainiciooselt)
	{
	caso_id=pcaso_id;
	ERasma=pERasma;
	ERotraenfpulm=pERotraenfpulm;
	ERinmunodef=pERinmunodef;
	ERcard=pERcard;
	ERdiab=pERdiab;
	ERotra1=pERotra1;
	ERenfhep=pERenfhep;
	ERenfNeurolg=pERenfNeurolg;
	ERotra2=pERotra2;
	ERenfrenal=pERenfrenal;
	ERobesidad=pERobesidad;
	ERotra3=pERotra3;
	FRpersonasdorm=pFRpersonasdorm;
	FRconvivientes=pFRconvivientes;
	FRfumadores=pFRfumadores;
	FRasistenciacirc=pFRasistenciacirc;
	FRlactancia=pFRlactancia;
	FRbajopeso=pFRbajopeso;
	FRmadrevac=pFRmadrevac;
	FRepisodiosira=pFRepisodiosira;
	FRantecedentesrinitis=pFRantecedentesrinitis;
	Consumo=pConsumo;
	oseltamivir=poseltamivir;
	fechainiciooselt=pfechainiciooselt;

	}
	
	
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getERasma()
	{
	return ERasma;
	}
	public void setERasma(boolean ERasma)
	{
	this.ERasma=ERasma;
	}
	public boolean getERotraenfpulm()
	{
	return ERotraenfpulm;
	}
	public void setERotraenfpulm(boolean ERotraenfpulm)
	{
	this.ERotraenfpulm=ERotraenfpulm;
	}
	public boolean getERinmunodef()
	{
	return ERinmunodef;
	}
	public void setERinmunodef(boolean ERinmunodef)
	{
	this.ERinmunodef=ERinmunodef;
	}
	public boolean getERcard()
	{
	return ERcard;
	}
	public void setERcard(boolean ERcard)
	{
	this.ERcard=ERcard;
	}
	public boolean getERdiab()
	{
	return ERdiab;
	}
	public void setERdiab(boolean ERdiab)
	{
	this.ERdiab=ERdiab;
	}
	public String getERotra1()
	{
	return ERotra1;
	}
	public void setERotra1(String ERotra1)
	{
	this.ERotra1=ERotra1;
	}
	public boolean getERenfhep()
	{
	return ERenfhep;
	}
	public void setERenfhep(boolean ERenfhep)
	{
	this.ERenfhep=ERenfhep;
	}
	public boolean getERenfNeurolg()
	{
	return ERenfNeurolg;
	}
	public void setERenfNeurolg(boolean ERenfNeurolg)
	{
	this.ERenfNeurolg=ERenfNeurolg;
	}
	public String getERotra2()
	{
	return ERotra2;
	}
	public void setERotra2(String ERotra2)
	{
	this.ERotra2=ERotra2;
	}
	public boolean getERenfrenal()
	{
	return ERenfrenal;
	}
	public void setERenfrenal(boolean ERenfrenal)
	{
	this.ERenfrenal=ERenfrenal;
	}
	public boolean getERobesidad()
	{
	return ERobesidad;
	}
	public void setERobesidad(boolean ERobesidad)
	{
	this.ERobesidad=ERobesidad;
	}
	public String getERotra3()
	{
	return ERotra3;
	}
	public void setERotra3(String ERotra3)
	{
	this.ERotra3=ERotra3;
	}
	public String getFRpersonasdorm()
	{
	return FRpersonasdorm;
	}
	public void setFRpersonasdorm(String FRpersonasdorm)
	{
	this.FRpersonasdorm=FRpersonasdorm;
	}
	public String getFRconvivientes()
	{
	return FRconvivientes;
	}
	public void setFRconvivientes(String FRconvivientes)
	{
	this.FRconvivientes=FRconvivientes;
	}
	public String getFRfumadores()
	{
	return FRfumadores;
	}
	public void setFRfumadores(String FRfumadores)
	{
	this.FRfumadores=FRfumadores;
	}
	public String getFRasistenciacirc()
	{
	return FRasistenciacirc;
	}
	public void setFRasistenciacirc(String FRasistenciacirc)
	{
	this.FRasistenciacirc=FRasistenciacirc;
	}
	public String getFRlactancia()
	{
	return FRlactancia;
	}
	public void setFRlactancia(String FRlactancia)
	{
	this.FRlactancia=FRlactancia;
	}
	public String getFRbajopeso()
	{
	return FRbajopeso;
	}
	public void setFRbajopeso(String FRbajopeso)
	{
	this.FRbajopeso=FRbajopeso;
	}
	public String getFRmadrevac()
	{
	return FRmadrevac;
	}
	public void setFRmadrevac(String FRmadrevac)
	{
	this.FRmadrevac=FRmadrevac;
	}
	public String getFRepisodiosira()
	{
	return FRepisodiosira;
	}
	public void setFRepisodiosira(String FRepisodiosira)
	{
	this.FRepisodiosira=FRepisodiosira;
	}
	public String getFRantecedentesrinitis()
	{
	return FRantecedentesrinitis;
	}
	public void setFRantecedentesrinitis(String FRantecedentesrinitis)
	{
	this.FRantecedentesrinitis=FRantecedentesrinitis;
	}
	public String getoseltamivir()
	{
	return oseltamivir;
	}
	public void setoseltamivir(String oseltamivir)
	{
	this.oseltamivir=oseltamivir;
	}
	public String getfechainiciooselt()
	{
	return fechainiciooselt;
	}
	public void setfechainiciooselt(String fechainiciooselt)
	{
	this.fechainiciooselt=fechainiciooselt;
	}

	public String getConsumo()
	{
	return Consumo;
	}
	public void setConsumo(String Consumo)
	{
	this.Consumo=Consumo;
	}

	
	public String Crear()
	{
		return "CREATE TABLE EnfResp006 (caso_id INTEGER PRIMARY KEY,ERasma boolean, "
				+ "ERotraenfpulm boolean, ERinmunodef boolean, ERcard boolean, ERdiab boolean, "
				+ "ERotra1 TEXT, ERenfhep boolean, ERenfNeurolg boolean, ERotra2 TEXT, ERenfrenal boolean, "
				+ "ERobesidad boolean, ERotra3 TEXT, FRpersonasdorm TEXT, FRconvivientes TEXT, FRfumadores TEXT,"
				+ " FRasistenciacirc TEXT, FRlactancia TEXT, FRbajopeso TEXT, FRmadrevac TEXT, FRepisodiosira TEXT, "
				+ "FRantecedentesrinitis TEXT,Consumo TEXT, oseltamivir TEXT, fechainiciooselt TEXT )";
	}
	
	
	public long insertEnfResp006(EnfResp006 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getcaso_id());
	values.put("ERasma",tipo.getERasma());
	values.put("ERotraenfpulm",tipo.getERotraenfpulm());
	values.put("ERinmunodef",tipo.getERinmunodef());
	values.put("ERcard",tipo.getERcard());
	values.put("ERdiab",tipo.getERdiab());
	values.put("ERotra1",tipo.getERotra1());
	values.put("ERenfhep",tipo.getERenfhep());
	values.put("ERenfNeurolg",tipo.getERenfNeurolg());
	values.put("ERotra2",tipo.getERotra2());
	values.put("ERenfrenal",tipo.getERenfrenal());
	values.put("ERobesidad",tipo.getERobesidad());
	values.put("ERotra3",tipo.getERotra3());
	values.put("FRpersonasdorm",tipo.getFRpersonasdorm());
	values.put("FRconvivientes",tipo.getFRconvivientes());
	values.put("FRfumadores",tipo.getFRfumadores());
	values.put("FRasistenciacirc",tipo.getFRasistenciacirc());
	values.put("FRlactancia",tipo.getFRlactancia());
	values.put("FRbajopeso",tipo.getFRbajopeso());
	values.put("FRmadrevac",tipo.getFRmadrevac());
	values.put("FRepisodiosira",tipo.getFRepisodiosira());
	values.put("FRantecedentesrinitis",tipo.getFRantecedentesrinitis());
	values.put("Consumo",tipo.getConsumo());
	values.put("oseltamivir",tipo.getoseltamivir());
	values.put("fechainiciooselt",tipo.getfechainiciooselt());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("EnfResp006",values,"caso_id=?",args);
	}
	else
	{
		 id = db.insert("EnfResp006", null, values);
	}

	return id;

	}
	
	
	
	public EnfResp006 selectEnfResp006(long caso_id,SQLiteDatabase db)
	{
	EnfResp006 tipo=null;
	Cursor cursor=db.query("EnfResp006" ,null,"caso_id=?",new String[] {Long.toString(caso_id)},null, null, null);
	cursor.moveToFirst();
	tipo=new EnfResp006(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),String.valueOf(cursor.getString(6)),Booleanos(cursor.getString(7)),Booleanos(cursor.getString(8)),String.valueOf(cursor.getString(9)),Booleanos(cursor.getString(10)),Booleanos(cursor.getString(11)),String.valueOf(cursor.getString(12)),String.valueOf(cursor.getString(13)),String.valueOf(cursor.getString(14)),String.valueOf(cursor.getString(15)),String.valueOf(cursor.getString(16)),String.valueOf(cursor.getString(17)),String.valueOf(cursor.getString(18)),String.valueOf(cursor.getString(19)),String.valueOf(cursor.getString(20)),String.valueOf(cursor.getString(21)),String.valueOf(cursor.getString(22)),String.valueOf(cursor.getString(23)),String.valueOf(cursor.getString(24)));
	return tipo;
	}
	
	public boolean Booleanos(String x)
	{
		if(x.equals("1"))
			return true;
		return false;
	}
	
	
	
	
	
	
	
	
	

}
