package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Aps003 {

	
	private String idCaso;
	private boolean OtMediaAgBacter;
	private boolean RinosinuAgBacter;
	private boolean ETI;
	private String fiebre;
	private String NoDias;
	private boolean dolorGarg;
	private boolean malesGeneral;
	private boolean secrecMucu;
	private boolean Otalg;
	private boolean AntecedIRAAnt;
	private String Otros;
	private boolean MrespEVir;
	private boolean MrespEBact;
	private String fecEXVirolog;
	private String FecEXBacteriol;
	
	public Aps003(){}
	public Aps003(String idCaso,boolean OtMediaAgBacter,boolean RinosinuAgBacter,boolean ETI,String fiebre,String NoDias,boolean dolorGarg,boolean malesGeneral,boolean secrecMucu,boolean Otalg,boolean AntecedIRAAnt,String Otros,boolean MrespEVir,boolean MrespEBact,String fecEXVirolog,String FecEXBacteriol)
	{
	this.idCaso=idCaso;
	this.OtMediaAgBacter=OtMediaAgBacter;
	this.RinosinuAgBacter=RinosinuAgBacter;
	this.ETI=ETI;
	this.fiebre=fiebre;
	this.NoDias=NoDias;
	this.dolorGarg=dolorGarg;
	this.malesGeneral=malesGeneral;
	this.secrecMucu=secrecMucu;
	this.Otalg=Otalg;
	this.AntecedIRAAnt=AntecedIRAAnt;
	this.Otros=Otros;
	this.MrespEVir=MrespEVir;
	this.MrespEBact=MrespEBact;
	this.fecEXVirolog=fecEXVirolog;
	this.FecEXBacteriol=FecEXBacteriol;

	}

public String getidCaso()
{
return idCaso;
}
public void setidCaso(String idCaso)
{
this.idCaso=idCaso;
}
public boolean getOtMediaAgBacter()
{
return OtMediaAgBacter;
}
public void setOtMediaAgBacter(boolean OtMediaAgBacter)
{
this.OtMediaAgBacter=OtMediaAgBacter;
}
public boolean getRinosinuAgBacter()
{
return RinosinuAgBacter;
}
public void setRinosinuAgBacter(boolean RinosinuAgBacter)
{
this.RinosinuAgBacter=RinosinuAgBacter;
}
public boolean getETI()
{
return ETI;
}
public void setETI(boolean ETI)
{
this.ETI=ETI;
}
public String getfiebre()
{
return fiebre;
}
public void setfiebre(String fiebre)
{
this.fiebre=fiebre;
}
public String getNoDias()
{
return NoDias;
}
public void setNoDias(String NoDias)
{
this.NoDias=NoDias;
}
public boolean getdolorGarg()
{
return dolorGarg;
}
public void setdolorGarg(boolean dolorGarg)
{
this.dolorGarg=dolorGarg;
}
public boolean getmalesGeneral()
{
return malesGeneral;
}
public void setmalesGeneral(boolean malesGeneral)
{
this.malesGeneral=malesGeneral;
}
public boolean getsecrecMucu()
{
return secrecMucu;
}
public void setsecrecMucu(boolean secrecMucu)
{
this.secrecMucu=secrecMucu;
}
public boolean getOtalg()
{
return Otalg;
}
public void setOtalg(boolean Otalg)
{
this.Otalg=Otalg;
}
public boolean getAntecedIRAAnt()
{
return AntecedIRAAnt;
}
public void setAntecedIRAAnt(boolean AntecedIRAAnt)
{
this.AntecedIRAAnt=AntecedIRAAnt;
}
public String getOtros()
{
return Otros;
}
public void setOtros(String Otros)
{
this.Otros=Otros;
}
public boolean getMrespEVir()
{
return MrespEVir;
}
public void setMrespEVir(boolean MrespEVir)
{
this.MrespEVir=MrespEVir;
}
public boolean getMrespEBact()
{
return MrespEBact;
}
public void setMrespEBact(boolean MrespEBact)
{
this.MrespEBact=MrespEBact;
}
public String getfecEXVirolog()
{
return fecEXVirolog;
}
public void setfecEXVirolog(String fecEXVirolog)
{
this.fecEXVirolog=fecEXVirolog;
}
public String getFecEXBacteriol()
{
return FecEXBacteriol;
}
public void setFecEXBacteriol(String FecEXBacteriol)
{
this.FecEXBacteriol=FecEXBacteriol;
}

	public String Crear()
	{
       return "CREATE TABLE Aps003 (caso_id INTEGER PRIMARY KEY, OtMediaAgBacter boolean, RinosinuAgBacter boolean, ETI boolean, "
       		+ "fiebre TEXT, NoDias TEXT, dolorGarg boolean, malesGeneral boolean, secrecMucu boolean, Otalg boolean, "
       		+ "AntecedIRAAnt boolean, Otros TEXT, MrespEVir boolean, MrespEBact boolean, "
       		+ "fecEXVirolog TEXT, FecEXBacteriol TEXT)";
       		
    } 
	
	public long insertAps003(Aps003 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getidCaso());
	values.put("OtMediaAgBacter",tipo.getOtMediaAgBacter());
	values.put("RinosinuAgBacter",tipo.getRinosinuAgBacter());
	values.put("ETI",tipo.getETI());
	values.put("fiebre",tipo.getfiebre());
	values.put("NoDias",tipo.getNoDias());
	values.put("dolorGarg",tipo.getdolorGarg());
	values.put("malesGeneral",tipo.getmalesGeneral());
	values.put("secrecMucu",tipo.getsecrecMucu());
	values.put("Otalg",tipo.getOtalg());
	values.put("AntecedIRAAnt",tipo.getAntecedIRAAnt());
	values.put("Otros",tipo.getOtros());
	values.put("MrespEVir",tipo.getMrespEVir());
	values.put("MrespEBact",tipo.getMrespEBact());
	values.put("fecEXVirolog",tipo.getfecEXVirolog());
	values.put("FecEXBacteriol",tipo.getFecEXBacteriol());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("Aps003",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("Aps003", null, values);
	}
	
	return id;
	
	}
	
	public Aps003 selectAps003(String caso_id,SQLiteDatabase db)
	{
	Aps003 tipo=null;
	Cursor cursor=db.query("Aps003" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new Aps003(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),String.valueOf(cursor.getString(4)),String.valueOf(cursor.getString(5)),Booleanos(cursor.getString(6)),Booleanos(cursor.getString(7)),Booleanos(cursor.getString(8)),Booleanos(cursor.getString(9)),Booleanos(cursor.getString(10)),String.valueOf(cursor.getString(11)),Booleanos(cursor.getString(12)),Booleanos(cursor.getString(13)),String.valueOf(cursor.getString(14)),String.valueOf(cursor.getString(15)));
	return tipo;
	}
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}
}
