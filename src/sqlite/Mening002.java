package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Mening002 {

	private String caso_id;
	private boolean SospechaEnfNeumInvasiva;
	private boolean Bacterminia;
	private boolean HemocultivoPositivo;
	private boolean FiebreCUnicaManifestacion;
	private boolean Sepsis;
	private boolean Distermia;
	private String temperatura;
	private boolean Taquicardia;
	private String FrecRespiratoria;
	private boolean TaquipneaPEdad;
	private String FrecuenciaCardiaca;
	private boolean AlteracionesFLeucocitaria;
	private boolean PExcesoLeucocitosis;
	private boolean Leucopenia;
	private boolean M10PFormasInmaduras;
	private boolean SepsisSevera;
	private boolean ShockSeptico;
	
	public Mening002(){}
	public Mening002(String idCaso,boolean SospechaEnfNeumInvasiva,boolean Bacterminia,boolean HemocultivoPositivo,boolean FiebreCUnicaManifestacion,boolean Sepsis,boolean Distermia,String temperatura,boolean Taquicardia,String FrecRespiratoria,boolean TaquipneaPEdad,String FrecuenciaCardiaca,boolean AlteracionesFLeucocitaria,boolean PExcesoLeucocitosis,boolean Leucopenia,boolean M10PFormasInmaduras,boolean SepsisSevera,boolean ShockSeptico)
	{
	this.caso_id=idCaso;
	this.SospechaEnfNeumInvasiva=SospechaEnfNeumInvasiva;
	this.Bacterminia=Bacterminia;
	this.HemocultivoPositivo=HemocultivoPositivo;
	this.FiebreCUnicaManifestacion=FiebreCUnicaManifestacion;
	this.Sepsis=Sepsis;
	this.Distermia=Distermia;
	this.temperatura=temperatura;
	this.Taquicardia=Taquicardia;
	this.FrecRespiratoria=FrecRespiratoria;
	this.TaquipneaPEdad=TaquipneaPEdad;
	this.FrecuenciaCardiaca=FrecuenciaCardiaca;
	this.AlteracionesFLeucocitaria=AlteracionesFLeucocitaria;
	this.PExcesoLeucocitosis=PExcesoLeucocitosis;
	this.Leucopenia=Leucopenia;
	this.M10PFormasInmaduras=M10PFormasInmaduras;
	this.SepsisSevera=SepsisSevera;
	this.ShockSeptico=ShockSeptico;

	}
	
	public String getCaso_id()
	{
	return caso_id;
	}
	public void setCaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getSospechaEnfNeumInvasiva()
	{
	return SospechaEnfNeumInvasiva;
	}
	public void setSospechaEnfNeumInvasiva(boolean SospechaEnfNeumInvasiva)
	{
	this.SospechaEnfNeumInvasiva=SospechaEnfNeumInvasiva;
	}
	public boolean getBacterminia()
	{
	return Bacterminia;
	}
	public void setBacterminia(boolean Bacterminia)
	{
	this.Bacterminia=Bacterminia;
	}
	public boolean getHemocultivoPositivo()
	{
	return HemocultivoPositivo;
	}
	public void setHemocultivoPositivo(boolean HemocultivoPositivo)
	{
	this.HemocultivoPositivo=HemocultivoPositivo;
	}
	public boolean getFiebreCUnicaManifestacion()
	{
	return FiebreCUnicaManifestacion;
	}
	public void setFiebreCUnicaManifestacion(boolean FiebreCUnicaManifestacion)
	{
	this.FiebreCUnicaManifestacion=FiebreCUnicaManifestacion;
	}
	public boolean getSepsis()
	{
	return Sepsis;
	}
	public void setSepsis(boolean Sepsis)
	{
	this.Sepsis=Sepsis;
	}
	public boolean getDistermia()
	{
	return Distermia;
	}
	public void setDistermia(boolean Distermia)
	{
	this.Distermia=Distermia;
	}
	public String gettemperatura()
	{
	return temperatura;
	}
	public void settemperatura(String temperatura)
	{
	this.temperatura=temperatura;
	}
	public boolean getTaquicardia()
	{
	return Taquicardia;
	}
	public void setTaquicardia(boolean Taquicardia)
	{
	this.Taquicardia=Taquicardia;
	}
	public String getFrecRespiratoria()
	{
	return FrecRespiratoria;
	}
	public void setFrecRespiratoria(String FrecRespiratoria)
	{
	this.FrecRespiratoria=FrecRespiratoria;
	}
	public boolean getTaquipneaPEdad()
	{
	return TaquipneaPEdad;
	}
	public void setTaquipneaPEdad(boolean TaquipneaPEdad)
	{
	this.TaquipneaPEdad=TaquipneaPEdad;
	}
	public String getFrecuenciaCardiaca()
	{
	return FrecuenciaCardiaca;
	}
	public void setFrecuenciaCardiaca(String FrecuenciaCardiaca)
	{
	this.FrecuenciaCardiaca=FrecuenciaCardiaca;
	}
	public boolean getAlteracionesFLeucocitaria()
	{
	return AlteracionesFLeucocitaria;
	}
	public void setAlteracionesFLeucocitaria(boolean AlteracionesFLeucocitaria)
	{
	this.AlteracionesFLeucocitaria=AlteracionesFLeucocitaria;
	}
	public boolean getPExcesoLeucocitosis()
	{
	return PExcesoLeucocitosis;
	}
	public void setPExcesoLeucocitosis(boolean PExcesoLeucocitosis)
	{
	this.PExcesoLeucocitosis=PExcesoLeucocitosis;
	}
	public boolean getLeucopenia()
	{
	return Leucopenia;
	}
	public void setLeucopenia(boolean Leucopenia)
	{
	this.Leucopenia=Leucopenia;
	}
	public boolean getM10PFormasInmaduras()
	{
	return M10PFormasInmaduras;
	}
	public void setM10PFormasInmaduras(boolean M10PFormasInmaduras)
	{
	this.M10PFormasInmaduras=M10PFormasInmaduras;
	}
	public boolean getSepsisSevera()
	{
	return SepsisSevera;
	}
	public void setSepsisSevera(boolean SepsisSevera)
	{
	this.SepsisSevera=SepsisSevera;
	}
	public boolean getShockSeptico()
	{
	return ShockSeptico;
	}
	public void setShockSeptico(boolean ShockSeptico)
	{
	this.ShockSeptico=ShockSeptico;
	}

	
	
	public String Crear()
	{
       return "CREATE TABLE Mening002 (caso_id INTEGER PRIMARY KEY AUTOINCREMENT, SospechaEnfNeumInvasiva boolean, Bacterminia boolean,"
       		+ " HemocultivoPositivo boolean, FiebreCUnicaManifestacion boolean, Sepsis boolean,"
       		+ " Distermia boolean, temperatura FLOAT, Taquicardia boolean, FrecRespiratoria FLOAT,"
       		+ " TaquipneaPEdad boolean, FrecuenciaCardiaca FLOAT, AlteracionesFLeucocitaria boolean,"
       		+ " PExcesoLeucocitosis boolean, Leucopenia boolean, M10PFormasInmaduras boolean, "
       		+ "SepsisSevera boolean, ShockSeptico boolean )";
	}
	
	
	public long insertMening002(Mening002 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getCaso_id());
	values.put("SospechaEnfNeumInvasiva",tipo.getSospechaEnfNeumInvasiva());
	values.put("Bacterminia",tipo.getBacterminia());
	values.put("HemocultivoPositivo",tipo.getHemocultivoPositivo());
	values.put("FiebreCUnicaManifestacion",tipo.getFiebreCUnicaManifestacion());
	values.put("Sepsis",tipo.getSepsis());
	values.put("Distermia",tipo.getDistermia());
	values.put("temperatura",tipo.gettemperatura());
	values.put("Taquicardia",tipo.getTaquicardia());
	values.put("FrecRespiratoria",tipo.getFrecRespiratoria());
	values.put("TaquipneaPEdad",tipo.getTaquipneaPEdad());
	values.put("FrecuenciaCardiaca",tipo.getFrecuenciaCardiaca());
	values.put("AlteracionesFLeucocitaria",tipo.getAlteracionesFLeucocitaria());
	values.put("PExcesoLeucocitosis",tipo.getPExcesoLeucocitosis());
	values.put("Leucopenia",tipo.getLeucopenia());
	values.put("M10PFormasInmaduras",tipo.getM10PFormasInmaduras());
	values.put("SepsisSevera",tipo.getSepsisSevera());
	values.put("ShockSeptico",tipo.getShockSeptico());
	
    long id=0;
	
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("Mening002",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("Mening002", null, values);
	}
	 return id;

	}
	
	public Mening002 selectMening002(String caso_id,SQLiteDatabase db)
	{
	Mening002 tipo=null;
	Cursor cursor=db.query("Mening002" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new Mening002(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),Booleanos(cursor.getString(6)),String.valueOf(cursor.getString(7)),Booleanos(cursor.getString(8)),String.valueOf(cursor.getString(9)),Booleanos(cursor.getString(10)),String.valueOf(cursor.getString(11)),Booleanos(cursor.getString(12)),Booleanos(cursor.getString(13)),Booleanos(cursor.getString(14)),Booleanos(cursor.getString(15)),Booleanos(cursor.getString(16)),Booleanos(cursor.getString(17)));
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
