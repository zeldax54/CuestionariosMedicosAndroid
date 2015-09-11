package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
public class Aps005 {

	private String idCaso;
	private boolean CSospNeumBact;
	private boolean CProbNeumBacteriana;
	private boolean CLHInf;
	private boolean CLSPeumoniae;
	private boolean CLNMening;
	private String CLOtra;
	private String SEROSUBT;
	private boolean NeumConfLab;
	private boolean CasDescNeumBacter;
	private boolean CNeumInadecInvestig;
	
	private boolean OMAConfLab;
	private boolean OMANoconfLab;
	
	private boolean RinoConfLab;
	private boolean RinoNoConfLab;
	
	private boolean InfluenzConfirmuOtrosVirus;
	private String Virus;
	private String TipoSubTipo;
	private boolean ETINoConf;
	private boolean CasoConfOtraBacter;
	private String BacteriaConf;
	private String TipoSubtipo;
	
	public Aps005(){}
	public Aps005(String idCaso,boolean CSospNeumBact,boolean CProbNeumBacteriana,boolean CLHInf,boolean CLSPeumoniae,boolean CLNMening,String CLOtra,String SEROSUBT,boolean NeumConfLab,boolean CasDescNeumBacter,boolean CNeumInadecInvestig,boolean OMAConfLab,boolean OMANoconfLab,boolean RinoConfLab,boolean RinoNoConfLab,boolean InfluenzConfirmuOtrosVirus,String Virus,String TipoSubTipo,boolean ETINoConf,boolean CasoConfOtraBacter,String BacteriaConf,String TipoSubtipo)
	{
	this.idCaso=idCaso;
	this.CSospNeumBact=CSospNeumBact;
	this.CProbNeumBacteriana=CProbNeumBacteriana;
	this.CLHInf=CLHInf;
	this.CLSPeumoniae=CLSPeumoniae;
	this.CLNMening=CLNMening;
	this.CLOtra=CLOtra;
	this.SEROSUBT=SEROSUBT;
	this.NeumConfLab=NeumConfLab;
	this.CasDescNeumBacter=CasDescNeumBacter;
	this.CNeumInadecInvestig=CNeumInadecInvestig;
	
	this.OMAConfLab=OMAConfLab;
	this.OMANoconfLab=OMANoconfLab;
	
	this.RinoConfLab=RinoConfLab;
	this.RinoNoConfLab=RinoNoConfLab;
	
	this.InfluenzConfirmuOtrosVirus=InfluenzConfirmuOtrosVirus;
	this.Virus=Virus;
	this.TipoSubTipo=TipoSubTipo;
	this.ETINoConf=ETINoConf;
	this.CasoConfOtraBacter=CasoConfOtraBacter;
	this.BacteriaConf=BacteriaConf;
	this.TipoSubtipo=TipoSubtipo;

	}

public String getidCaso()
{
return idCaso;
}
public void setidCaso(String idCaso)
{
this.idCaso=idCaso;
}
public boolean getCSospNeumBact()
{
return CSospNeumBact;
}
public void setCSospNeumBact(boolean CSospNeumBact)
{
this.CSospNeumBact=CSospNeumBact;
}
public boolean getCProbNeumBacteriana()
{
return CProbNeumBacteriana;
}
public void setCProbNeumBacteriana(boolean CProbNeumBacteriana)
{
this.CProbNeumBacteriana=CProbNeumBacteriana;
}
public boolean getCLHInf()
{
return CLHInf;
}
public void setCLHInf(boolean CLHInf)
{
this.CLHInf=CLHInf;
}
public boolean getCLSPeumoniae()
{
return CLSPeumoniae;
}
public void setCLSPeumoniae(boolean CLSPeumoniae)
{
this.CLSPeumoniae=CLSPeumoniae;
}
public boolean getCLNMening()
{
return CLNMening;
}
public void setCLNMening(boolean CLNMening)
{
this.CLNMening=CLNMening;
}
public String getCLOtra()
{
return CLOtra;
}
public void setCLOtra(String CLOtra)
{
this.CLOtra=CLOtra;
}
public String getSEROSUBT()
{
return SEROSUBT;
}
public void setSEROSUBT(String SEROSUBT)
{
this.SEROSUBT=SEROSUBT;
}
public boolean getNeumConfLab()
{
return NeumConfLab;
}
public void setNeumConfLab(boolean NeumConfLab)
{
this.NeumConfLab=NeumConfLab;
}
public boolean getCasDescNeumBacter()
{
return CasDescNeumBacter;
}
public void setCasDescNeumBacter(boolean CasDescNeumBacter)
{
this.CasDescNeumBacter=CasDescNeumBacter;
}
public boolean getCNeumInadecInvestig()
{
return CNeumInadecInvestig;
}
public void setCNeumInadecInvestig(boolean CNeumInadecInvestig)
{
this.CNeumInadecInvestig=CNeumInadecInvestig;
}

public boolean getOMAConfLab()
{
return OMAConfLab;
}
public void setOMAConfLab(boolean OMAConfLab)
{
this.OMAConfLab=OMAConfLab;
}
public boolean getOMANoconfLab()
{
return OMANoconfLab;
}
public void setOMANoconfLab(boolean OMANoconfLab)
{
this.OMANoconfLab=OMANoconfLab;
}

public boolean getRinoConfLab()
{
return RinoConfLab;
}
public void setRinoConfLab(boolean RinoConfLab)
{
this.RinoConfLab=RinoConfLab;
}
public boolean getRinoNoConfLab()
{
return RinoNoConfLab;
}
public void setRinoNoConfLab(boolean RinoNoConfLab)
{
this.RinoNoConfLab=RinoNoConfLab;
}

public boolean getInfluenzConfirmuOtrosVirus()
{
return InfluenzConfirmuOtrosVirus;
}
public void setInfluenzConfirmuOtrosVirus(boolean InfluenzConfirmuOtrosVirus)
{
this.InfluenzConfirmuOtrosVirus=InfluenzConfirmuOtrosVirus;
}
public String getVirus()
{
return Virus;
}
public void setVirus(String Virus)
{
this.Virus=Virus;
}
public String getTipoSubTipo()
{
return TipoSubTipo;
}
public void setTipoSubTipo(String TipoSubTipo)
{
this.TipoSubTipo=TipoSubTipo;
}
public boolean getETINoConf()
{
return ETINoConf;
}
public void setETINoConf(boolean ETINoConf)
{
this.ETINoConf=ETINoConf;
}
public boolean getCasoConfOtraBacter()
{
return CasoConfOtraBacter;
}
public void setCasoConfOtraBacter(boolean CasoConfOtraBacter)
{
this.CasoConfOtraBacter=CasoConfOtraBacter;
}
public String getBacteriaConf()
{
return BacteriaConf;
}
public void setBacteriaConf(String BacteriaConf)
{
this.BacteriaConf=BacteriaConf;
}
public String getTipoSubtipo()
{
return TipoSubtipo;
}
public void setTipoSubtipo(String TipoSubtipo)
{
this.TipoSubtipo=TipoSubtipo;
}



	
	public String Crear()
	{
	   return "CREATE TABLE Aps005 (caso_id INTEGER PRIMARY KEY, CSospNeumBact boolean, CProbNeumBacteriana boolean,"
	   		+ " CLHInf boolean, CLSPeumoniae boolean, CLNMening boolean, CLOtra TEXT, SEROSUBT TEXT,"
	   		+ " NeumConfLab boolean, CasDescNeumBacter boolean, CNeumInadecInvestig boolean,"
	   		+ " OMAConfLab boolean, OMANoconfLab boolean, RinoConfLab boolean,"
	   		+ " RinoNoConfLab boolean, InfluenzConfirmuOtrosVirus boolean, Virus TEXT,"
	   		+ " TipoSubTipov TEXT, ETINoConf boolean, CasoConfOtraBacter boolean, BacteriaConf TEXT, TipoSubtipo TEXT)";
	   		
	} 
	public long insertAps005(Aps005 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getidCaso());
	values.put("CSospNeumBact",tipo.getCSospNeumBact());
	values.put("CProbNeumBacteriana",tipo.getCProbNeumBacteriana());
	values.put("CLHInf",tipo.getCLHInf());
	values.put("CLSPeumoniae",tipo.getCLSPeumoniae());
	values.put("CLNMening",tipo.getCLNMening());
	values.put("CLOtra",tipo.getCLOtra());
	values.put("SEROSUBT",tipo.getSEROSUBT());
	values.put("NeumConfLab",tipo.getNeumConfLab());
	values.put("CasDescNeumBacter",tipo.getCasDescNeumBacter());
	values.put("CNeumInadecInvestig",tipo.getCNeumInadecInvestig());
	
	values.put("OMAConfLab",tipo.getOMAConfLab());
	values.put("OMANoconfLab",tipo.getOMANoconfLab());
	
	values.put("RinoConfLab",tipo.getRinoConfLab());
	values.put("RinoNoConfLab",tipo.getRinoNoConfLab());
	
	values.put("InfluenzConfirmuOtrosVirus",tipo.getInfluenzConfirmuOtrosVirus());
	values.put("Virus",tipo.getVirus());
	values.put("TipoSubTipov",tipo.getTipoSubTipo());
	values.put("ETINoConf",tipo.getETINoConf());
	values.put("CasoConfOtraBacter",tipo.getCasoConfOtraBacter());
	values.put("BacteriaConf",tipo.getBacteriaConf());
	values.put("TipoSubtipo",tipo.getTipoSubtipo());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("Aps005",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("Aps005", null, values);
	}	
	return id;

	}
	public Aps005 selectAps005(String caso_id,SQLiteDatabase db)
	{
	Aps005 tipo=null;
	Cursor cursor=db.query("Aps005" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new Aps005(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),String.valueOf(cursor.getString(6)),String.valueOf(cursor.getString(7)),Booleanos(cursor.getString(8)),Booleanos(cursor.getString(9)),Booleanos(cursor.getString(10)),Booleanos(cursor.getString(11)),Booleanos(cursor.getString(12)),Booleanos(cursor.getString(13)),Booleanos(cursor.getString(14)),Booleanos(cursor.getString(15)),String.valueOf(cursor.getString(16)),String.valueOf(cursor.getString(17)),Booleanos(cursor.getString(18)),Booleanos(cursor.getString(19)),String.valueOf(cursor.getString(20)),String.valueOf(cursor.getString(21)));
	return tipo;
	}
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}
	
}
