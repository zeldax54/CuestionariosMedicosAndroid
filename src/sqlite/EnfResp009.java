package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.app.neumocuest.R;


public class EnfResp009 {
	
	public boolean IRAG;
	public boolean cnSospBacteriana;
	public boolean cnSospProbableNeumoniaBacteriana;
	public boolean cclHinfluenzae;
	public boolean cclSpneumoniae;
	public boolean cclNmeningitidis;
	public String cclOtra;
	public String cclSerotipo_Subtipo;
	public boolean CasoDescartadoNeumBact;
	public boolean CasoNeumoniaInadecuadamenteInvest;
	public boolean CasoConfVirusRespLab;
	public String Virus;
	public String TipoySubtipo;
	public int  caso_id;
	public boolean otrabactconf;
	public String otrabactbact;
	public String otrabactstipos;
	public EnfResp009(){}
	public EnfResp009(boolean pIRAG,boolean pcnSospBacteriana,boolean pcnSospProbableNeumoniaBacteriana,
			boolean pcclHinfluenzae,boolean pcclSpneumoniae,boolean pcclNmeningitidis,
			String pcclOtra,String pcclSerotipo_Subtipo,boolean pCasoDescartadoNeumBact,
			boolean pCasoNeumoniaInadecuadamenteInvest,boolean pCasoConfVirusRespLab,
			String pVirus,String pTipoySubtipo,int pIdCaso,boolean potrabactconf,String potrabactbact,String potrabactstipos)
	{
	IRAG=pIRAG;
	cnSospBacteriana=pcnSospBacteriana;
	cnSospProbableNeumoniaBacteriana=pcnSospProbableNeumoniaBacteriana;
	cclHinfluenzae=pcclHinfluenzae;
	cclSpneumoniae=pcclSpneumoniae;
	cclNmeningitidis=pcclNmeningitidis;
	cclOtra=pcclOtra;
	cclSerotipo_Subtipo=pcclSerotipo_Subtipo;
	CasoDescartadoNeumBact=pCasoDescartadoNeumBact;
	CasoNeumoniaInadecuadamenteInvest=pCasoNeumoniaInadecuadamenteInvest;
	CasoConfVirusRespLab=pCasoConfVirusRespLab;
	Virus=pVirus;
	TipoySubtipo=pTipoySubtipo;
	 caso_id=pIdCaso;
     otrabactconf=potrabactconf;
     otrabactbact=potrabactbact;
     otrabactstipos=potrabactstipos;

	}
	
	 public String Crear()
	 {
		 return "CREATE TABLE EnfResp009(caso_id INTEGER PRIMARY KEY,IRAG boolean,cnSospBacteriana boolean,"
		 		+ "cnSospProbableNeumoniaBacteriana boolean,cclHinfluenzae boolean,cclSpneumoniae boolean,"
		 		+ "cclNmeningitidis boolean,cclOtra string,cclSerotipo_Subtipo string,"
		 		+ "CasoDescartadoNeumBact boolean,CasoNeumoniaInadecuadamenteInvest boolean,"
		 		+ "CasoConfVirusRespLab boolean,Virus string,TipoySubtipo string,Otrabact boolean,Bact TEXT,Bacttiposub TEXT)";
	 }
	 
	 public boolean getIRAG()
	 {
	 return IRAG;
	 }
	 public void setIRAG(boolean IRAG)
	 {
	 this.IRAG=IRAG;
	 }
	 public boolean getcnSospBacteriana()
	 {
	 return cnSospBacteriana;
	 }
	 public void setcnSospBacteriana(boolean cnSospBacteriana)
	 {
	 this.cnSospBacteriana=cnSospBacteriana;
	 }
	 public boolean getcnSospProbableNeumoniaBacteriana()
	 {
	 return cnSospProbableNeumoniaBacteriana;
	 }
	 public void setcnSospProbableNeumoniaBacteriana(boolean cnSospProbableNeumoniaBacteriana)
	 {
	 this.cnSospProbableNeumoniaBacteriana=cnSospProbableNeumoniaBacteriana;
	 }
	 public boolean getcclHinfluenzae()
	 {
	 return cclHinfluenzae;
	 }
	 public void setcclHinfluenzae(boolean cclHinfluenzae)
	 {
	 this.cclHinfluenzae=cclHinfluenzae;
	 }
	 public boolean getcclSpneumoniae()
	 {
	 return cclSpneumoniae;
	 }
	 public void setcclSpneumoniae(boolean cclSpneumoniae)
	 {
	 this.cclSpneumoniae=cclSpneumoniae;
	 }
	 public boolean getcclNmeningitidis()
	 {
	 return cclNmeningitidis;
	 }
	 public void setcclNmeningitidis(boolean cclNmeningitidis)
	 {
	 this.cclNmeningitidis=cclNmeningitidis;
	 }
	 public String getcclOtra()
	 {
	 return cclOtra;
	 }
	 public void setcclOtra(String cclOtra)
	 {
	 this.cclOtra=cclOtra;
	 }
	 public String getcclSerotipo_Subtipo()
	 {
	 return cclSerotipo_Subtipo;
	 }
	 public void setcclSerotipo_Subtipo(String cclSerotipo_Subtipo)
	 {
	 this.cclSerotipo_Subtipo=cclSerotipo_Subtipo;
	 }
	 public boolean getCasoDescartadoNeumBact()
	 {
	 return CasoDescartadoNeumBact;
	 }
	 public void setCasoDescartadoNeumBact(boolean CasoDescartadoNeumBact)
	 {
	 this.CasoDescartadoNeumBact=CasoDescartadoNeumBact;
	 }
	 public boolean getCasoNeumoniaInadecuadamenteInvest()
	 {
	 return CasoNeumoniaInadecuadamenteInvest;
	 }
	 public void setCasoNeumoniaInadecuadamenteInvest(boolean CasoNeumoniaInadecuadamenteInvest)
	 {
	 this.CasoNeumoniaInadecuadamenteInvest=CasoNeumoniaInadecuadamenteInvest;
	 }
	 public boolean getCasoConfVirusRespLab()
	 {
	 return CasoConfVirusRespLab;
	 }
	 public void setCasoConfVirusRespLab(boolean CasoConfVirusRespLab)
	 {
	 this.CasoConfVirusRespLab=CasoConfVirusRespLab;
	 }
	 public String getVirus()
	 {
	 return Virus;
	 }
	 public void setVirus(String Virus)
	 {
	 this.Virus=Virus;
	 }
	 public String getTipoySubtipo()
	 {
	 return TipoySubtipo;
	 }
	 public void setTipoySubtipo(String TipoySubtipo)
	 {
	 this.TipoySubtipo=TipoySubtipo;
	 }
	 public int getcaso_id()
	 {
	 return caso_id;
	 }
	 public void setcaso_id(int caso_id)
	 {
	 this.caso_id=caso_id;
	 }
	 

public boolean getotrabactconf()
{
return otrabactconf;
}
public void setotrabactconf(boolean otrabactconf)
{
this.otrabactconf=otrabactconf;
}
public String getotrabactbact()
{
return otrabactbact;
}
public void setotrabactbact(String otrabactbact)
{
this.otrabactbact=otrabactbact;
}
public String getotrabactstipos()
{
return otrabactstipos;
}
public void setotrabactstipos(String otrabactstipos)
{
this.otrabactstipos=otrabactstipos;
}


	 public long insert(EnfResp009 tipo, SQLiteDatabase db,boolean act,String caso_id)
	 {
	 ContentValues values = new ContentValues();
	 values.put("caso_id",tipo.getcaso_id());
	 values.put("IRAG",tipo.getIRAG());
	 values.put("cnSospBacteriana",tipo.getcnSospBacteriana());
	 values.put("cnSospProbableNeumoniaBacteriana",tipo.getcnSospProbableNeumoniaBacteriana());
	 values.put("cclHinfluenzae",tipo.getcclHinfluenzae());
	 values.put("cclSpneumoniae",tipo.getcclSpneumoniae());
	 values.put("cclNmeningitidis",tipo.getcclNmeningitidis());
	 values.put("cclOtra",tipo.getcclOtra());
	 values.put("cclSerotipo_Subtipo",tipo.getcclSerotipo_Subtipo());
	 values.put("CasoDescartadoNeumBact",tipo.getCasoDescartadoNeumBact());
	 values.put("CasoNeumoniaInadecuadamenteInvest",tipo.getCasoNeumoniaInadecuadamenteInvest());
	 values.put("CasoConfVirusRespLab",tipo.getCasoConfVirusRespLab());
	 values.put("Virus",tipo.getVirus());
	 values.put("TipoySubtipo",tipo.getTipoySubtipo());
	 values.put("Otrabact", tipo.getotrabactconf());
	 values.put("Bact", tipo.getotrabactbact());
	 values.put("Bacttiposub",tipo.getotrabactstipos());
	 long id=0;
		if(act)
		{
			String[] args = new String[] {caso_id};		
		     id = db.update("EnfResp009",values,"caso_id=?",args);
		}
		else
		{
			id = db.insert("EnfResp009", null, values);
		}
		return id;

	 }
	 public EnfResp009 selectEnfResp007Ent(String caso_id,SQLiteDatabase db)
	 {
	 EnfResp009 tipo=null;
	 String[] args = new String[] {caso_id};
	 Cursor cursor=db.rawQuery("SELECT * FROM EnfResp009 WHERE caso_id=?",args); 
	 cursor.moveToFirst();
	 tipo=new EnfResp009(Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),Booleanos(cursor.getString(6)),String.valueOf(cursor.getString(7)),String.valueOf(cursor.getString(8)),Booleanos(cursor.getString(9)),Booleanos(cursor.getString(10)),Booleanos(cursor.getString(11)),String.valueOf(cursor.getString(12)),String.valueOf(cursor.getString(13)),Integer.valueOf(cursor.getString(0)),
			 Booleanos(cursor.getString(14)),cursor.getString(15),cursor.getString(16));
	 return tipo;
	 }
	 public boolean Booleanos(String x)
		{
			if(x.equals("0"))
				return false;
			return true;
		}
	 
	
	
}
