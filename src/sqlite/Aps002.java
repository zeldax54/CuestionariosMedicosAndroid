package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Aps002 {

	private String idCaso;
	private boolean CasSospNeumonBact;
	private boolean CasSospNeumViralUOC;
	private boolean ComiRep;
	private String Fiebre;
	private boolean tos;
	private boolean dolorgarg;
	private boolean difResp;
	private String FrecResp;
	private boolean escalofrios;
	private boolean mialgias;
	private boolean taquipnea;
	private boolean vomitos;
	private String otros;
	private boolean malestGener;
	private boolean dolorPleurit;
	private boolean tosCEsputo;
	private boolean IndRXSI;
	private boolean IndRXNO;
	private String fechIndic;
	public Aps002(){}
	public Aps002(String idCaso,boolean CasSospNeumonBact,boolean CasSospNeumViralUOC,boolean ComiRep,String Fiebre,boolean tos,boolean dolorgarg,boolean difResp,String FrecResp,boolean escalofrios,boolean mialgias,boolean taquipnea,boolean vomitos,String otros,boolean malestGener,boolean dolorPleurit,boolean tosCEsputo,boolean IndRXSI,boolean IndRXNO,String fechIndic)
	{
	this.idCaso=idCaso;
	this.CasSospNeumonBact=CasSospNeumonBact;
	this.CasSospNeumViralUOC=CasSospNeumViralUOC;
	this.ComiRep=ComiRep;
	this.Fiebre=Fiebre;
	this.tos=tos;
	this.dolorgarg=dolorgarg;
	this.difResp=difResp;
	this.FrecResp=FrecResp;
	this.escalofrios=escalofrios;
	this.mialgias=mialgias;
	this.taquipnea=taquipnea;
	this.vomitos=vomitos;
	this.otros=otros;
	this.malestGener=malestGener;
	this.dolorPleurit=dolorPleurit;
	this.tosCEsputo=tosCEsputo;
	this.IndRXSI=IndRXSI;
	this.IndRXNO=IndRXNO;
	this.fechIndic=fechIndic;

	}
	

public String getidCaso()
{
return idCaso;
}
public void setidCaso(String idCaso)
{
this.idCaso=idCaso;
}
public boolean getCasSospNeumonBact()
{
return CasSospNeumonBact;
}
public void setCasSospNeumonBact(boolean CasSospNeumonBact)
{
this.CasSospNeumonBact=CasSospNeumonBact;
}
public boolean getCasSospNeumViralUOC()
{
return CasSospNeumViralUOC;
}
public void setCasSospNeumViralUOC(boolean CasSospNeumViralUOC)
{
this.CasSospNeumViralUOC=CasSospNeumViralUOC;
}
public boolean getComiRep()
{
return ComiRep;
}
public void setComiRep(boolean ComiRep)
{
this.ComiRep=ComiRep;
}
public String getFiebre()
{
return Fiebre;
}
public void setFiebre(String Fiebre)
{
this.Fiebre=Fiebre;
}
public boolean gettos()
{
return tos;
}
public void settos(boolean tos)
{
this.tos=tos;
}
public boolean getdolorgarg()
{
return dolorgarg;
}
public void setdolorgarg(boolean dolorgarg)
{
this.dolorgarg=dolorgarg;
}
public boolean getdifResp()
{
return difResp;
}
public void setdifResp(boolean difResp)
{
this.difResp=difResp;
}
public String getFrecResp()
{
return FrecResp;
}
public void setFrecResp(String FrecResp)
{
this.FrecResp=FrecResp;
}
public boolean getescalofrios()
{
return escalofrios;
}
public void setescalofrios(boolean escalofrios)
{
this.escalofrios=escalofrios;
}
public boolean getmialgias()
{
return mialgias;
}
public void setmialgias(boolean mialgias)
{
this.mialgias=mialgias;
}
public boolean gettaquipnea()
{
return taquipnea;
}
public void settaquipnea(boolean taquipnea)
{
this.taquipnea=taquipnea;
}
public boolean getvomitos()
{
return vomitos;
}
public void setvomitos(boolean vomitos)
{
this.vomitos=vomitos;
}
public String getotros()
{
return otros;
}
public void setotros(String otros)
{
this.otros=otros;
}
public boolean getmalestGener()
{
return malestGener;
}
public void setmalestGener(boolean malestGener)
{
this.malestGener=malestGener;
}
public boolean getdolorPleurit()
{
return dolorPleurit;
}
public void setdolorPleurit(boolean dolorPleurit)
{
this.dolorPleurit=dolorPleurit;
}
public boolean gettosCEsputo()
{
return tosCEsputo;
}
public void settosCEsputo(boolean tosCEsputo)
{
this.tosCEsputo=tosCEsputo;
}
public boolean getIndRXSI()
{
return IndRXSI;
}
public void setIndRXSI(boolean IndRXSI)
{
this.IndRXSI=IndRXSI;
}
public boolean getIndRXNO()
{
return IndRXNO;
}
public void setIndRXNO(boolean IndRXNO)
{
this.IndRXNO=IndRXNO;
}
public String getfechIndic()
{
return fechIndic;
}
public void setfechIndic(String fechIndic)
{
this.fechIndic=fechIndic;
}

	
	public String Crear()
	{
       return "CREATE TABLE Aps002 (caso_id INTEGER PRIMARY KEY, CasSospNeumonBact boolean, CasSospNeumViralUOC boolean, "
       		+ "ComiRep boolean, Fiebre TEXT, tos boolean, dolorgarg boolean, difResp boolean, FrecResp TEXT, "
       		+ "escalofrios boolean, mialgias boolean, taquipnea boolean, vomitos boolean, otros TEXT, malestGener boolean, "
       		+ "dolorPleurit boolean, tosCEsputo boolean, IndRXSI boolean, IndRXNO boolean, fechIndic TEXT)";
	} 
	
	public long insertAps002(Aps002 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getidCaso());
	values.put("CasSospNeumonBact",tipo.getCasSospNeumonBact());
	values.put("CasSospNeumViralUOC",tipo.getCasSospNeumViralUOC());
	values.put("ComiRep",tipo.getComiRep());
	values.put("Fiebre",tipo.getFiebre());
	values.put("tos",tipo.gettos());
	values.put("dolorgarg",tipo.getdolorgarg());
	values.put("difResp",tipo.getdifResp());
	values.put("FrecResp",tipo.getFrecResp());
	values.put("escalofrios",tipo.getescalofrios());
	values.put("mialgias",tipo.getmialgias());
	values.put("taquipnea",tipo.gettaquipnea());
	values.put("vomitos",tipo.getvomitos());
	values.put("otros",tipo.getotros());
	values.put("malestGener",tipo.getmalestGener());
	values.put("dolorPleurit",tipo.getdolorPleurit());
	values.put("tosCEsputo",tipo.gettosCEsputo());
	values.put("IndRXSI",tipo.getIndRXSI());
	values.put("IndRXNO",tipo.getIndRXNO());
	values.put("fechIndic",tipo.getfechIndic());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("Aps002",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("Aps002", null, values);
	}
	
	return id;
	 

	}
	
	public Aps002 selectAps002(String caso_id,SQLiteDatabase db)
	{
	Aps002 tipo=null;
	Cursor cursor=db.query("Aps002" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new Aps002(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),String.valueOf(cursor.getString(4)),Booleanos(cursor.getString(5)),Booleanos(cursor.getString(6)),Booleanos(cursor.getString(7)),String.valueOf(cursor.getString(8)),Booleanos(cursor.getString(9)),Booleanos(cursor.getString(10)),Booleanos(cursor.getString(11)),Booleanos(cursor.getString(12)),String.valueOf(cursor.getString(13)),Booleanos(cursor.getString(14)),Booleanos(cursor.getString(15)),Booleanos(cursor.getString(16)),Booleanos(cursor.getString(17)),Booleanos(cursor.getString(18)),String.valueOf(cursor.getString(19)));
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
