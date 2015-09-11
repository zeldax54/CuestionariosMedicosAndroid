package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EnfResp007 {
	private String caso_id;
	private boolean MLmuestraRespiratoriaVirologico;
	private String MLfechaMuestraRespVirologico;
	private boolean MLmuestraRespiratoriaBacteriolog;
	private String MLfechaMuestraRespiratoriaBacteriolog;
	private boolean MLsangreHemocultivo1;
	private String MLfechaSangreHemocultivo;
	private boolean MLsangreHemocultivo2;
	private String MLfechaSangreHemocultivo2;
	private boolean MLliquidopreural;
	private String MLfechaliquidopreural;
	private String MLotra;
	private String MLfechaOtra;
	private String BIhemocultivo;
	private String BIfechahemocultivo;
	private boolean BI_RHhinfluenzae;
	private boolean BI_RHspneumoniae;
	private boolean BI_RHnmeningiditis;
	private boolean BI_RHninguna;
	private String BI_RHotra;
	private String BI_RHfecharesultadohemocultivo;
	private String BIgram;
	private String BIfechagram;
	private boolean BI_RGhinfluenzae;
	private boolean BI_RGspneumoniae;
	private boolean BI_RGnmeningiditis;
	private boolean BI_RGninguna;
	private String BI_RGotra;
	private String BI_RGfecharesultado;
	private boolean LK_Cspneumoniae;
	private String LK_Cserotipo;
	private String LK_Cotra;
	private String LK_Cotraserotipo;
	private boolean LK_Cnoclonizado;
	private String LK_Cfecharesultado;
	private String LK_ABbactidentif;
	private boolean LK_ABhinfluenzae;
	private String LK_ABhinfserotipo;
	private boolean LK_ABspneumoniae;
	private String LK_ABspneumonserotipo;
	private boolean LK_ABnmeningiditis;
	private String LK_ABnmeningserotipo;
	private String LK_ABotra;
	private String LK_ABotraserotipo;
	private String LK_ABfecharesult;
	private String LK_VRvirusidentif;
	private String LK_VRtipovirus;
	private String LK_VRtiposubtipo;
	private String LK_VRfecharesultado;
	private String LK_analisisvarianteresist;
	public EnfResp007(){}
	public EnfResp007(String caso_id,boolean MLmuestraRespiratoriaVirologico,String MLfechaMuestraRespVirologico,boolean MLmuestraRespiratoriaBacteriolog,String MLfechaMuestraRespiratoriaBacteriolog,boolean MLsangreHemocultivo1,String MLfechaSangreHemocultivo,boolean MLsangreHemocultivo2,String MLfechaSangreHemocultivo2,boolean MLliquidopreural,String MLfechaliquidopreural,String MLotra,String MLfechaOtra,String BIhemocultivo,String BIfechahemocultivo,boolean BI_RHhinfluenzae,boolean BI_RHspneumoniae,boolean BI_RHnmeningiditis,boolean BI_RHninguna,String BI_RHotra,String BI_RHfecharesultadohemocultivo,String BIgram,String BIfechagram,boolean BI_RGhinfluenzae,boolean BI_RGspneumoniae,boolean BI_RGnmeningiditis,boolean BI_RGninguna,String BI_RGotra,String BI_RGfecharesultado,boolean LK_Cspneumoniae,String LK_Cserotipo,String LK_Cotra,String LK_Cotraserotipo,boolean LK_Cnoclonizado,String LK_Cfecharesultado,String LK_ABbactidentif,boolean LK_ABhinfluenzae,String LK_ABhinfserotipo,boolean LK_ABspneumoniae,String LK_ABspneumonserotipo,boolean LK_ABnmeningiditis,String LK_ABnmeningserotipo,String LK_ABotra,String LK_ABotraserotipo,String LK_ABfecharesult,String LK_VRvirusidentif,String LK_VRtipovirus,String LK_VRtiposubtipo,String LK_VRfecharesultado,String LK_analisisvarianteresist)
	{
	this.caso_id=caso_id;
	this.MLmuestraRespiratoriaVirologico=MLmuestraRespiratoriaVirologico;
	this.MLfechaMuestraRespVirologico=MLfechaMuestraRespVirologico;
	this.MLmuestraRespiratoriaBacteriolog=MLmuestraRespiratoriaBacteriolog;
	this.MLfechaMuestraRespiratoriaBacteriolog=MLfechaMuestraRespiratoriaBacteriolog;
	this.MLsangreHemocultivo1=MLsangreHemocultivo1;
	this.MLfechaSangreHemocultivo=MLfechaSangreHemocultivo;
	this.MLsangreHemocultivo2=MLsangreHemocultivo2;
	this.MLfechaSangreHemocultivo2=MLfechaSangreHemocultivo2;
	this.MLliquidopreural=MLliquidopreural;
	this.MLfechaliquidopreural=MLfechaliquidopreural;
	this.MLotra=MLotra;
	this.MLfechaOtra=MLfechaOtra;
	this.BIhemocultivo=BIhemocultivo;
	this.BIfechahemocultivo=BIfechahemocultivo;
	this.BI_RHhinfluenzae=BI_RHhinfluenzae;
	this.BI_RHspneumoniae=BI_RHspneumoniae;
	this.BI_RHnmeningiditis=BI_RHnmeningiditis;
	this.BI_RHninguna=BI_RHninguna;
	this.BI_RHotra=BI_RHotra;
	this.BI_RHfecharesultadohemocultivo=BI_RHfecharesultadohemocultivo;
	this.BIgram=BIgram;
	this.BIfechagram=BIfechagram;
	this.BI_RGhinfluenzae=BI_RGhinfluenzae;
	this.BI_RGspneumoniae=BI_RGspneumoniae;
	this.BI_RGnmeningiditis=BI_RGnmeningiditis;
	this.BI_RGninguna=BI_RGninguna;
	this.BI_RGotra=BI_RGotra;
	this.BI_RGfecharesultado=BI_RGfecharesultado;
	this.LK_Cspneumoniae=LK_Cspneumoniae;
	this.LK_Cserotipo=LK_Cserotipo;
	this.LK_Cotra=LK_Cotra;
	this.LK_Cotraserotipo=LK_Cotraserotipo;
	this.LK_Cnoclonizado=LK_Cnoclonizado;
	this.LK_Cfecharesultado=LK_Cfecharesultado;
	this.LK_ABbactidentif=LK_ABbactidentif;
	this.LK_ABhinfluenzae=LK_ABhinfluenzae;
	this.LK_ABhinfserotipo=LK_ABhinfserotipo;
	this.LK_ABspneumoniae=LK_ABspneumoniae;
	this.LK_ABspneumonserotipo=LK_ABspneumonserotipo;
	this.LK_ABnmeningiditis=LK_ABnmeningiditis;
	this.LK_ABnmeningserotipo=LK_ABnmeningserotipo;
	this.LK_ABotra=LK_ABotra;
	this.LK_ABotraserotipo=LK_ABotraserotipo;
	this.LK_ABfecharesult=LK_ABfecharesult;
	this.LK_VRvirusidentif=LK_VRvirusidentif;
	this.LK_ABfecharesult=LK_ABfecharesult;
	this.LK_VRtipovirus=LK_VRtipovirus;
	this.LK_VRtiposubtipo=LK_VRtiposubtipo;
	this.LK_VRfecharesultado=LK_VRfecharesultado;
	this.LK_analisisvarianteresist=LK_analisisvarianteresist;

	}
	
	
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getMLmuestraRespiratoriaVirologico()
	{
	return MLmuestraRespiratoriaVirologico;
	}
	public void setMLmuestraRespiratoriaVirologico(boolean MLmuestraRespiratoriaVirologico)
	{
	this.MLmuestraRespiratoriaVirologico=MLmuestraRespiratoriaVirologico;
	}
	public String getMLfechaMuestraRespVirologico()
	{
	return MLfechaMuestraRespVirologico;
	}
	public void setMLfechaMuestraRespVirologico(String MLfechaMuestraRespVirologico)
	{
	this.MLfechaMuestraRespVirologico=MLfechaMuestraRespVirologico;
	}
	public boolean getMLmuestraRespiratoriaBacteriolog()
	{
	return MLmuestraRespiratoriaBacteriolog;
	}
	public void setMLmuestraRespiratoriaBacteriolog(boolean MLmuestraRespiratoriaBacteriolog)
	{
	this.MLmuestraRespiratoriaBacteriolog=MLmuestraRespiratoriaBacteriolog;
	}
	public String getMLfechaMuestraRespiratoriaBacteriolog()
	{
	return MLfechaMuestraRespiratoriaBacteriolog;
	}
	public void setMLfechaMuestraRespiratoriaBacteriolog(String MLfechaMuestraRespiratoriaBacteriolog)
	{
	this.MLfechaMuestraRespiratoriaBacteriolog=MLfechaMuestraRespiratoriaBacteriolog;
	}
	public boolean getMLsangreHemocultivo1()
	{
	return MLsangreHemocultivo1;
	}
	public void setMLsangreHemocultivo1(boolean MLsangreHemocultivo1)
	{
	this.MLsangreHemocultivo1=MLsangreHemocultivo1;
	}
	public String getMLfechaSangreHemocultivo()
	{
	return MLfechaSangreHemocultivo;
	}
	public void setMLfechaSangreHemocultivo(String MLfechaSangreHemocultivo)
	{
	this.MLfechaSangreHemocultivo=MLfechaSangreHemocultivo;
	}
	public boolean getMLsangreHemocultivo2()
	{
	return MLsangreHemocultivo2;
	}
	public void setMLsangreHemocultivo2(boolean MLsangreHemocultivo2)
	{
	this.MLsangreHemocultivo2=MLsangreHemocultivo2;
	}
	public String getMLfechaSangreHemocultivo2()
	{
	return MLfechaSangreHemocultivo2;
	}
	public void setMLfechaSangreHemocultivo2(String MLfechaSangreHemocultivo2)
	{
	this.MLfechaSangreHemocultivo2=MLfechaSangreHemocultivo2;
	}
	public boolean getMLliquidopreural()
	{
	return MLliquidopreural;
	}
	public void setMLliquidopreural(boolean MLliquidopreural)
	{
	this.MLliquidopreural=MLliquidopreural;
	}
	public String getMLfechaliquidopreural()
	{
	return MLfechaliquidopreural;
	}
	public void setMLfechaliquidopreural(String MLfechaliquidopreural)
	{
	this.MLfechaliquidopreural=MLfechaliquidopreural;
	}
	public String getMLotra()
	{
	return MLotra;
	}
	public void setMLotra(String MLotra)
	{
	this.MLotra=MLotra;
	}
	public String getMLfechaOtra()
	{
	return MLfechaOtra;
	}
	public void setMLfechaOtra(String MLfechaOtra)
	{
	this.MLfechaOtra=MLfechaOtra;
	}
	public String getBIhemocultivo()
	{
	return BIhemocultivo;
	}
	public void setBIhemocultivo(String BIhemocultivo)
	{
	this.BIhemocultivo=BIhemocultivo;
	}
	public String getBIfechahemocultivo()
	{
	return BIfechahemocultivo;
	}
	public void setBIfechahemocultivo(String BIfechahemocultivo)
	{
	this.BIfechahemocultivo=BIfechahemocultivo;
	}
	public boolean getBI_RHhinfluenzae()
	{
	return BI_RHhinfluenzae;
	}
	public void setBI_RHhinfluenzae(boolean BI_RHhinfluenzae)
	{
	this.BI_RHhinfluenzae=BI_RHhinfluenzae;
	}
	public boolean getBI_RHspneumoniae()
	{
	return BI_RHspneumoniae;
	}
	public void setBI_RHspneumoniae(boolean BI_RHspneumoniae)
	{
	this.BI_RHspneumoniae=BI_RHspneumoniae;
	}
	public boolean getBI_RHnmeningiditis()
	{
	return BI_RHnmeningiditis;
	}
	public void setBI_RHnmeningiditis(boolean BI_RHnmeningiditis)
	{
	this.BI_RHnmeningiditis=BI_RHnmeningiditis;
	}
	public boolean getBI_RHninguna()
	{
	return BI_RHninguna;
	}
	public void setBI_RHninguna(boolean BI_RHninguna)
	{
	this.BI_RHninguna=BI_RHninguna;
	}
	public String getBI_RHotra()
	{
	return BI_RHotra;
	}
	public void setBI_RHotra(String BI_RHotra)
	{
	this.BI_RHotra=BI_RHotra;
	}
	public String getBI_RHfecharesultadohemocultivo()
	{
	return BI_RHfecharesultadohemocultivo;
	}
	public void setBI_RHfecharesultadohemocultivo(String BI_RHfecharesultadohemocultivo)
	{
	this.BI_RHfecharesultadohemocultivo=BI_RHfecharesultadohemocultivo;
	}
	public String getBIgram()
	{
	return BIgram;
	}
	public void setBIgram(String BIgram)
	{
	this.BIgram=BIgram;
	}
	public String getBIfechagram()
	{
	return BIfechagram;
	}
	public void setBIfechagram(String BIfechagram)
	{
	this.BIfechagram=BIfechagram;
	}
	public boolean getBI_RGhinfluenzae()
	{
	return BI_RGhinfluenzae;
	}
	public void setBI_RGhinfluenzae(boolean BI_RGhinfluenzae)
	{
	this.BI_RGhinfluenzae=BI_RGhinfluenzae;
	}
	public boolean getBI_RGspneumoniae()
	{
	return BI_RGspneumoniae;
	}
	public void setBI_RGspneumoniae(boolean BI_RGspneumoniae)
	{
	this.BI_RGspneumoniae=BI_RGspneumoniae;
	}
	public boolean getBI_RGnmeningiditis()
	{
	return BI_RGnmeningiditis;
	}
	public void setBI_RGnmeningiditis(boolean BI_RGnmeningiditis)
	{
	this.BI_RGnmeningiditis=BI_RGnmeningiditis;
	}
	public boolean getBI_RGninguna()
	{
	return BI_RGninguna;
	}
	public void setBI_RGninguna(boolean BI_RGninguna)
	{
	this.BI_RGninguna=BI_RGninguna;
	}
	public String getBI_RGotra()
	{
	return BI_RGotra;
	}
	public void setBI_RGotra(String BI_RGotra)
	{
	this.BI_RGotra=BI_RGotra;
	}
	public String getBI_RGfecharesultado()
	{
	return BI_RGfecharesultado;
	}
	public void setBI_RGfecharesultado(String BI_RGfecharesultado)
	{
	this.BI_RGfecharesultado=BI_RGfecharesultado;
	}
	public boolean getLK_Cspneumoniae()
	{
	return LK_Cspneumoniae;
	}
	public void setLK_Cspneumoniae(boolean LK_Cspneumoniae)
	{
	this.LK_Cspneumoniae=LK_Cspneumoniae;
	}
	public String getLK_Cserotipo()
	{
	return LK_Cserotipo;
	}
	public void setLK_Cserotipo(String LK_Cserotipo)
	{
	this.LK_Cserotipo=LK_Cserotipo;
	}
	public String getLK_Cotra()
	{
	return LK_Cotra;
	}
	public void setLK_Cotra(String LK_Cotra)
	{
	this.LK_Cotra=LK_Cotra;
	}
	public String getLK_Cotraserotipo()
	{
	return LK_Cotraserotipo;
	}
	public void setLK_Cotraserotipo(String LK_Cotraserotipo)
	{
	this.LK_Cotraserotipo=LK_Cotraserotipo;
	}
	public boolean getLK_Cnoclonizado()
	{
	return LK_Cnoclonizado;
	}
	public void setLK_Cnoclonizado(boolean LK_Cnoclonizado)
	{
	this.LK_Cnoclonizado=LK_Cnoclonizado;
	}
	public String getLK_Cfecharesultado()
	{
	return LK_Cfecharesultado;
	}
	public void setLK_Cfecharesultado(String LK_Cfecharesultado)
	{
	this.LK_Cfecharesultado=LK_Cfecharesultado;
	}
	public String getLK_ABbactidentif()
	{
	return LK_ABbactidentif;
	}
	public void setLK_ABbactidentif(String LK_ABbactidentif)
	{
	this.LK_ABbactidentif=LK_ABbactidentif;
	}
	public boolean getLK_ABhinfluenzae()
	{
	return LK_ABhinfluenzae;
	}
	public void setLK_ABhinfluenzae(boolean LK_ABhinfluenzae)
	{
	this.LK_ABhinfluenzae=LK_ABhinfluenzae;
	}
	public String getLK_ABhinfserotipo()
	{
	return LK_ABhinfserotipo;
	}
	public void setLK_ABhinfserotipo(String LK_ABhinfserotipo)
	{
	this.LK_ABhinfserotipo=LK_ABhinfserotipo;
	}
	public boolean getLK_ABspneumoniae()
	{
	return LK_ABspneumoniae;
	}
	public void setLK_ABspneumoniae(boolean LK_ABspneumoniae)
	{
	this.LK_ABspneumoniae=LK_ABspneumoniae;
	}
	public String getLK_ABspneumonserotipo()
	{
	return LK_ABspneumonserotipo;
	}
	public void setLK_ABspneumonserotipo(String LK_ABspneumonserotipo)
	{
	this.LK_ABspneumonserotipo=LK_ABspneumonserotipo;
	}
	public boolean getLK_ABnmeningiditis()
	{
	return LK_ABnmeningiditis;
	}
	public void setLK_ABnmeningiditis(boolean LK_ABnmeningiditis)
	{
	this.LK_ABnmeningiditis=LK_ABnmeningiditis;
	}
	public String getLK_ABnmeningserotipo()
	{
	return LK_ABnmeningserotipo;
	}
	public void setLK_ABnmeningserotipo(String LK_ABnmeningserotipo)
	{
	this.LK_ABnmeningserotipo=LK_ABnmeningserotipo;
	}
	public String getLK_ABotra()
	{
	return LK_ABotra;
	}
	public void setLK_ABotra(String LK_ABotra)
	{
	this.LK_ABotra=LK_ABotra;
	}
	public String getLK_ABotraserotipo()
	{
	return LK_ABotraserotipo;
	}
	public void setLK_ABotraserotipo(String LK_ABotraserotipo)
	{
	this.LK_ABotraserotipo=LK_ABotraserotipo;
	}
	
	public String getLK_VRvirusidentif()
	{
	return LK_VRvirusidentif;
	}
	public void setLK_VRvirusidentif(String LK_VRvirusidentif)
	{
	this.LK_VRvirusidentif=LK_VRvirusidentif;
	}
	public String getLK_ABfecharesult()
	{
	return LK_ABfecharesult;
	}
	public void setLK_ABfecharesult(String LK_ABfecharesult)
	{
	this.LK_ABfecharesult=LK_ABfecharesult;
	}
	public String getLK_VRtipovirus()
	{
	return LK_VRtipovirus;
	}
	public void setLK_VRtipovirus(String LK_VRtipovirus)
	{
	this.LK_VRtipovirus=LK_VRtipovirus;
	}
	public String getLK_VRtiposubtipo()
	{
	return LK_VRtiposubtipo;
	}
	public void setLK_VRtiposubtipo(String LK_VRtiposubtipo)
	{
	this.LK_VRtiposubtipo=LK_VRtiposubtipo;
	}
	public String getLK_VRfecharesultado()
	{
	return LK_VRfecharesultado;
	}
	public void setLK_VRfecharesultado(String LK_VRfecharesultado)
	{
	this.LK_VRfecharesultado=LK_VRfecharesultado;
	}
	public String getLK_analisisvarianteresist()
	{
	return LK_analisisvarianteresist;
	}
	public void setLK_analisisvarianteresist(String LK_analisisvarianteresist)
	{
	this.LK_analisisvarianteresist=LK_analisisvarianteresist;
	}

	 public String Crear()
	 {
		 return"CREATE TABLE EnfResp007 (caso_id INTEGER PRIMARY KEY,MLmuestraRespiratoriaVirologico boolean, "
		 		+ "MLfechaMuestraRespVirologico TEXT, MLmuestraRespiratoriaBacteriolog boolean, "
		 		+ "MLfechaMuestraRespiratoriaBacteriolog TEXT, MLsangreHemocultivo1 boolean, MLfechaSangreHemocultivo TEXT,"
		 		+ " MLsangreHemocultivo2 boolean, MLfechaSangreHemocultivo2 TEXT, MLliquidopreural boolean, "
		 		+ "MLfechaliquidopreural TEXT, MLotra TEXT, MLfechaOtra TEXT, BIhemocultivo TEXT, BIfechahemocultivo TEXT, "
		 		+ "BI_RHhinfluenzae boolean, BI_RHspneumoniae boolean, BI_RHnmeningiditis boolean, BI_RHninguna boolean, "
		 		+ "BI_RHotra TEXT, BI_RHfecharesultadohemocultivo TEXT, BIgram TEXT, BIfechagram TEXT, BI_RGhinfluenzae boolean,"
		 		+ " BI_RGspneumoniae boolean, BI_RGnmeningiditis boolean, BI_RGninguna boolean, BI_RGotra TEXT,"
		 		+ " BI_RGfecharesultado TEXT, LK_Cspneumoniae boolean, LK_Cserotipo TEXT, LK_Cotra TEXT, LK_Cotraserotipo TEXT, "
		 		+ "LK_Cnoclonizado boolean, LK_Cfecharesultado TEXT, LK_ABbactidentif TEXT, LK_ABhinfluenzae boolean, "
		 		+ "LK_ABhinfserotipo TEXT, LK_ABspneumoniae boolean, LK_ABspneumonserotipo TEXT, LK_ABnmeningiditis boolean,"
		 		+ "LK_ABnmeningserotipo TEXT, LK_ABotra TEXT, LK_ABotraserotipo TEXT, LK_ABfecharesult TEXT, LK_VRvirusidentif TEXT,"
		 		+ "LK_VRtipovirus TEXT, LK_VRtiposubtipo TEXT, LK_VRfecharesultado TEXT, "
		 		+ "LK_analisisvarianteresist TEXT )";
	 }
	 
	 public long insertEnfResp007(EnfResp007 tipo, SQLiteDatabase db,boolean act,String caso_id){
		 ContentValues values = new ContentValues();
		 values.put("caso_id",tipo.getcaso_id());
		 values.put("MLmuestraRespiratoriaVirologico",tipo.getMLmuestraRespiratoriaVirologico());
		 values.put("MLfechaMuestraRespVirologico",tipo.getMLfechaMuestraRespVirologico());
		 values.put("MLmuestraRespiratoriaBacteriolog",tipo.getMLmuestraRespiratoriaBacteriolog());
		 values.put("MLfechaMuestraRespiratoriaBacteriolog",tipo.getMLfechaMuestraRespiratoriaBacteriolog());
		 values.put("MLsangreHemocultivo1",tipo.getMLsangreHemocultivo1());
		 values.put("MLfechaSangreHemocultivo",tipo.getMLfechaSangreHemocultivo());
		 values.put("MLsangreHemocultivo2",tipo.getMLsangreHemocultivo2());
		 values.put("MLfechaSangreHemocultivo2",tipo.getMLfechaSangreHemocultivo2());
		 values.put("MLliquidopreural",tipo.getMLliquidopreural());
		 values.put("MLfechaliquidopreural",tipo.getMLfechaliquidopreural());
		 values.put("MLotra",tipo.getMLotra());
		 values.put("MLfechaOtra",tipo.getMLfechaOtra());
		 values.put("BIhemocultivo",tipo.getBIhemocultivo());
		 values.put("BIfechahemocultivo",tipo.getBIfechahemocultivo());
		 values.put("BI_RHhinfluenzae",tipo.getBI_RHhinfluenzae());
		 values.put("BI_RHspneumoniae",tipo.getBI_RHspneumoniae());
		 values.put("BI_RHnmeningiditis",tipo.getBI_RHnmeningiditis());
		 values.put("BI_RHninguna",tipo.getBI_RHninguna());
		 values.put("BI_RHotra",tipo.getBI_RHotra());
		 values.put("BI_RHfecharesultadohemocultivo",tipo.getBI_RHfecharesultadohemocultivo());
		 values.put("BIgram",tipo.getBIgram());
		 values.put("BIfechagram",tipo.getBIfechagram());
		 values.put("BI_RGhinfluenzae",tipo.getBI_RGhinfluenzae());
		 values.put("BI_RGspneumoniae",tipo.getBI_RGspneumoniae());
		 values.put("BI_RGnmeningiditis",tipo.getBI_RGnmeningiditis());
		 values.put("BI_RGninguna",tipo.getBI_RGninguna());
		 values.put("BI_RGotra",tipo.getBI_RGotra());
		 values.put("BI_RGfecharesultado",tipo.getBI_RGfecharesultado());
		 values.put("LK_Cspneumoniae",tipo.getLK_Cspneumoniae());
		 values.put("LK_Cserotipo",tipo.getLK_Cserotipo());
		 values.put("LK_Cotra",tipo.getLK_Cotra());
		 values.put("LK_Cotraserotipo",tipo.getLK_Cotraserotipo());
		 values.put("LK_Cnoclonizado",tipo.getLK_Cnoclonizado());
		 values.put("LK_Cfecharesultado",tipo.getLK_Cfecharesultado());
		 values.put("LK_ABbactidentif",tipo.getLK_ABbactidentif());
		 values.put("LK_ABhinfluenzae",tipo.getLK_ABhinfluenzae());
		 values.put("LK_ABhinfserotipo",tipo.getLK_ABhinfserotipo());
		 values.put("LK_ABspneumoniae",tipo.getLK_ABspneumoniae());
		 values.put("LK_ABspneumonserotipo",tipo.getLK_ABspneumonserotipo());
		 values.put("LK_ABnmeningiditis",tipo.getLK_ABnmeningiditis());
		 values.put("LK_ABnmeningserotipo",tipo.getLK_ABnmeningserotipo());
		 values.put("LK_ABotra",tipo.getLK_ABotra());
		 values.put("LK_ABotraserotipo",tipo.getLK_ABotraserotipo());
		 values.put("LK_ABfecharesult",tipo.getLK_ABfecharesult());
		 values.put("LK_VRvirusidentif",tipo.getLK_VRvirusidentif());		 
		 values.put("LK_VRtipovirus",tipo.getLK_VRtipovirus());
		 values.put("LK_VRtiposubtipo",tipo.getLK_VRtiposubtipo());
		 values.put("LK_VRfecharesultado",tipo.getLK_VRfecharesultado());
		 values.put("LK_analisisvarianteresist",tipo.getLK_analisisvarianteresist());
		 
		 long id=0;
			if(act)
			{
				String[] args = new String[] {caso_id};		
			     id = db.update("EnfResp007",values,"caso_id=?",args);
			}
			else
			{
				 id = db.insert("EnfResp007", null, values);
			}		 
		  
		 return id;
		 }
	 
	 public EnfResp007 selectEnfResp007(long caso_id,SQLiteDatabase db)
	 {
	 EnfResp007 tipo=null;
	 Cursor cursor=db.query("EnfResp007" ,null,"caso_id=?",new String[] {Long.toString(caso_id)},null, null, null);
	 cursor.moveToFirst();
	 tipo=new EnfResp007(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),String.valueOf(cursor.getString(2)),Booleanos(cursor.getString(3)),String.valueOf(cursor.getString(4)),Booleanos(cursor.getString(5)),String.valueOf(cursor.getString(6)),Booleanos(cursor.getString(7)),String.valueOf(cursor.getString(8)),Booleanos(cursor.getString(9)),String.valueOf(cursor.getString(10)),String.valueOf(cursor.getString(11)),String.valueOf(cursor.getString(12)),String.valueOf(cursor.getString(13)),String.valueOf(cursor.getString(14)),Booleanos(cursor.getString(15)),Booleanos(cursor.getString(16)),Booleanos(cursor.getString(17)),Booleanos(cursor.getString(18)),String.valueOf(cursor.getString(19)),String.valueOf(cursor.getString(20)),String.valueOf(cursor.getString(21)),String.valueOf(cursor.getString(22)),Booleanos(cursor.getString(23)),Booleanos(cursor.getString(24)),Booleanos(cursor.getString(25)),Booleanos(cursor.getString(26)),String.valueOf(cursor.getString(27)),String.valueOf(cursor.getString(28)),Booleanos(cursor.getString(29)),String.valueOf(cursor.getString(30)),String.valueOf(cursor.getString(31)),String.valueOf(cursor.getString(32)),Booleanos(cursor.getString(33)),String.valueOf(cursor.getString(34)),String.valueOf(cursor.getString(35)),Booleanos(cursor.getString(36)),String.valueOf(cursor.getString(37)),Booleanos(cursor.getString(38)),String.valueOf(cursor.getString(39)),Booleanos(cursor.getString(40)),String.valueOf(cursor.getString(41)),String.valueOf(cursor.getString(42)),String.valueOf(cursor.getString(43)),String.valueOf(cursor.getString(44)),String.valueOf(cursor.getString(45)),String.valueOf(cursor.getString(46)),String.valueOf(cursor.getString(47)),String.valueOf(cursor.getString(48)),String.valueOf(cursor.getString(49)));
	 return tipo;
	 }
	 
	 public boolean Booleanos(String x)
	 {
		 if(x.equals("1"))
			 return true;
		 return false;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}