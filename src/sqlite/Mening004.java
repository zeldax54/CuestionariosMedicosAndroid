package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Mening004 {
	
	private String caso_id;
	private boolean antecedentes;
	private String especifique;
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
	private String Antibioticos;
	
	public Mening004(){}
	public Mening004(String caso_id,boolean antecedentes,String especifique,String FRpersonasdorm,String FRconvivientes,String FRfumadores,String FRasistenciacirc,String FRlactancia,String FRbajopeso,String FRmadrevac,String FRepisodiosira,String FRantecedentesrinitis,String Consumo,String Antibioticos)
	{
	this.caso_id=caso_id;
	this.antecedentes=antecedentes;
	this.especifique=especifique;
	this.FRpersonasdorm=FRpersonasdorm;
	this.FRconvivientes=FRconvivientes;
	this.FRfumadores=FRfumadores;
	this.FRasistenciacirc=FRasistenciacirc;
	this.FRlactancia=FRlactancia;
	this.FRbajopeso=FRbajopeso;
	this.FRmadrevac=FRmadrevac;
	this.FRepisodiosira=FRepisodiosira;
	this.FRantecedentesrinitis=FRantecedentesrinitis;
	this.Consumo=Consumo;
	this.Antibioticos=Antibioticos;

	}
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getantecedentes()
	{
	return antecedentes;
	}
	public void setantecedentes(boolean antecedentes)
	{
	this.antecedentes=antecedentes;
	}
	public String getespecifique()
	{
	return especifique;
	}
	public void setespecifique(String especifique)
	{
	this.especifique=especifique;
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
	public String getConsumo()
	{
	return Consumo;
	}
	public void setConsumo(String Consumo)
	{
	this.Consumo=Consumo;
	}
	public String getAntibioticos()
	{
	return Antibioticos;
	}
	public void setAntibioticos(String Antibioticos)
	{
	this.Antibioticos=Antibioticos;
	}
  
	
	public String Crear()
  {
	  return "CREATE TABLE Mening004 (caso_id INTEGER PRIMARY KEY,antecedentes boolean, especifique TEXT, FRpersonasdorm TEXT, FRconvivientes TEXT, FRfumadores TEXT, FRasistenciacirc TEXT, FRlactancia TEXT, FRbajopeso TEXT, FRmadrevac TEXT, FRepisodiosira TEXT, FRantecedentesrinitis TEXT, Consumo TEXT, Antibioticos TEXT)";
  }
	
	
	
	public long insertMening004(Mening004 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getcaso_id());
	values.put("antecedentes",tipo.getantecedentes());
	values.put("especifique",tipo.getespecifique());
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
	values.put("Antibioticos",tipo.getAntibioticos());
	

	 long id=0;
		
		if(act)
		{
			String[] args = new String[] {caso_id};		
		     id = db.update("Mening004",values,"caso_id=?",args);
		}
		else
		{
			id = db.insert("Mening004", null, values);
		}
		 return id;

	}
	
	
	public Mening004 selectMening004(String caso_id,SQLiteDatabase db)
	{
	Mening004 tipo=null;
	Cursor cursor=db.query("Mening004" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	if(cursor.moveToFirst())
	{
	tipo=new Mening004(cursor.getString(0),Booleanos(cursor.getString(1)),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11),cursor.getString(12),cursor.getString(13));
	}
	return tipo;
	}
	
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
