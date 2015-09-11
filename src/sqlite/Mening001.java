package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Mening001 {
	
	private String caso_id;
	private boolean sospecha;
	private String fiebre;
	private boolean RigidezNuca;
	private boolean Cefalea;
	private boolean Vomitos;
	private boolean Fotofobia;
	private boolean Convulciones;
	private boolean OtrosSignosMenigios;
	private boolean AlteracionesConciencia;
	private boolean PetequiasOPurpuras;
	private boolean TrastornosConducta;
	private String Otras;
	private boolean m1aAbombatamientoFontanela;
	private boolean m1aConvulciones;
	private boolean m1aLetargia;
	private boolean m1aSinJustoCausaClinica;
	private String m1aOtras;
	private boolean lcrTubridez;
	private boolean lcrHipertension;
	private boolean lcrDisminucionFluidez;
	private boolean lcrPleocitosisMenorA9xmm3PredoNeutrofilos;
	private boolean lcrProteinorraquiaMenor99mg_dl;
	private boolean lcrHipoglicorraquiaMenor40mg_dl;
	private String lcrOtras;
	private boolean aeContactoCasoPrevio;
	private boolean aeinternamiento;
	private boolean aeAcinamiento;
	private String aeOtras;
	
	public Mening001(){}
	public Mening001(String caso_id,boolean sospecha,String fiebre,boolean RigidezNuca,boolean Cefalea,boolean Vomitos,boolean Fotofobia,boolean Convulciones,boolean OtrosSignosMenigios,boolean AlteracionesConciencia,boolean PetequiasOPurpuras,boolean TrastornosConducta,String Otras,boolean m1aAbombatamientoFontanela,boolean m1aConvulciones,boolean m1aLetargia,boolean m1aSinJustoCausaClinica,String m1aOtras,boolean lcrTubridez,boolean lcrHipertension,boolean lcrDisminucionFluidez,boolean lcrPleocitosisMenorA9xmm3PredoNeutrofilos,boolean lcrProteinorraquiaMenor99mg_dl,boolean lcrHipoglicorraquiaMenor40mg_dl,String lcrOtras,boolean aeContactoCasoPrevio,boolean aeinternamiento,boolean aeAcinamiento,String aeOtras)
	{
	this.sospecha=sospecha;
	this.caso_id=caso_id;
	this.fiebre=fiebre;
	this.RigidezNuca=RigidezNuca;
	this.Cefalea=Cefalea;
	this.Vomitos=Vomitos;
	this.Fotofobia=Fotofobia;
	this.Convulciones=Convulciones;
	this.OtrosSignosMenigios=OtrosSignosMenigios;
	this.AlteracionesConciencia=AlteracionesConciencia;
	this.PetequiasOPurpuras=PetequiasOPurpuras;
	this.TrastornosConducta=TrastornosConducta;
	this.Otras=Otras;
	this.m1aAbombatamientoFontanela=m1aAbombatamientoFontanela;
	this.m1aConvulciones=m1aConvulciones;
	this.m1aLetargia=m1aLetargia;
	this.m1aSinJustoCausaClinica=m1aSinJustoCausaClinica;
	this.m1aOtras=m1aOtras;
	this.lcrTubridez=lcrTubridez;
	this.lcrHipertension=lcrHipertension;
	this.lcrDisminucionFluidez=lcrDisminucionFluidez;
	this.lcrPleocitosisMenorA9xmm3PredoNeutrofilos=lcrPleocitosisMenorA9xmm3PredoNeutrofilos;
	this.lcrProteinorraquiaMenor99mg_dl=lcrProteinorraquiaMenor99mg_dl;
	this.lcrHipoglicorraquiaMenor40mg_dl=lcrHipoglicorraquiaMenor40mg_dl;
	this.lcrOtras=lcrOtras;
	this.aeContactoCasoPrevio=aeContactoCasoPrevio;
	this.aeinternamiento=aeinternamiento;
	this.aeAcinamiento=aeAcinamiento;
	this.aeOtras=aeOtras;

	}
	
	public boolean getsospecha()
	{
	return sospecha;
	}
	
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getRigidezNuca()
	{
	return RigidezNuca;
	}
	
	public String getfiebre()
	{
	return fiebre;
	}
	public void setRigidezNuca(boolean RigidezNuca)
	{
	this.RigidezNuca=RigidezNuca;
	}
	public boolean getCefalea()
	{
	return Cefalea;
	}
	public void setCefalea(boolean Cefalea)
	{
	this.Cefalea=Cefalea;
	}
	public boolean getVomitos()
	{
	return Vomitos;
	}
	public void setVomitos(boolean Vomitos)
	{
	this.Vomitos=Vomitos;
	}
	public boolean getFotofobia()
	{
	return Fotofobia;
	}
	public void setFotofobia(boolean Fotofobia)
	{
	this.Fotofobia=Fotofobia;
	}
	public boolean getConvulciones()
	{
	return Convulciones;
	}
	public void setConvulciones(boolean Convulciones)
	{
	this.Convulciones=Convulciones;
	}
	public boolean getOtrosSignosMenigios()
	{
	return OtrosSignosMenigios;
	}
	public void setOtrosSignosMenigios(boolean OtrosSignosMenigios)
	{
	this.OtrosSignosMenigios=OtrosSignosMenigios;
	}
	public boolean getAlteracionesConciencia()
	{
	return AlteracionesConciencia;
	}
	public void setAlteracionesConciencia(boolean AlteracionesConciencia)
	{
	this.AlteracionesConciencia=AlteracionesConciencia;
	}
	public boolean getPetequiasOPurpuras()
	{
	return PetequiasOPurpuras;
	}
	public void setPetequiasOPurpuras(boolean PetequiasOPurpuras)
	{
	this.PetequiasOPurpuras=PetequiasOPurpuras;
	}
	public boolean getTrastornosConducta()
	{
	return TrastornosConducta;
	}
	public void setTrastornosConducta(boolean TrastornosConducta)
	{
	this.TrastornosConducta=TrastornosConducta;
	}
	public String getOtras()
	{
	return Otras;
	}
	public void setOtras(String Otras)
	{
	this.Otras=Otras;
	}
	public boolean getm1aAbombatamientoFontanela()
	{
	return m1aAbombatamientoFontanela;
	}
	public void setm1aAbombatamientoFontanela(boolean m1aAbombatamientoFontanela)
	{
	this.m1aAbombatamientoFontanela=m1aAbombatamientoFontanela;
	}
	public boolean getm1aConvulciones()
	{
	return m1aConvulciones;
	}
	public void setm1aConvulciones(boolean m1aConvulciones)
	{
	this.m1aConvulciones=m1aConvulciones;
	}
	public boolean getm1aLetargia()
	{
	return m1aLetargia;
	}
	public void setm1aLetargia(boolean m1aLetargia)
	{
	this.m1aLetargia=m1aLetargia;
	}
	public boolean getm1aSinJustoCausaClinica()
	{
	return m1aSinJustoCausaClinica;
	}
	public void setm1aSinJustoCausaClinica(boolean m1aSinJustoCausaClinica)
	{
	this.m1aSinJustoCausaClinica=m1aSinJustoCausaClinica;
	}
	public String getm1aOtras()
	{
	return m1aOtras;
	}
	public void setm1aOtras(String m1aOtras)
	{
	this.m1aOtras=m1aOtras;
	}
	public boolean getlcrTubridez()
	{
	return lcrTubridez;
	}
	public void setlcrTubridez(boolean lcrTubridez)
	{
	this.lcrTubridez=lcrTubridez;
	}
	public boolean getlcrHipertension()
	{
	return lcrHipertension;
	}
	public void setlcrHipertension(boolean lcrHipertension)
	{
	this.lcrHipertension=lcrHipertension;
	}
	public boolean getlcrDisminucionFluidez()
	{
	return lcrDisminucionFluidez;
	}
	public void setlcrDisminucionFluidez(boolean lcrDisminucionFluidez)
	{
	this.lcrDisminucionFluidez=lcrDisminucionFluidez;
	}
	public boolean getlcrPleocitosisMenorA9xmm3PredoNeutrofilos()
	{
	return lcrPleocitosisMenorA9xmm3PredoNeutrofilos;
	}
	public void setlcrPleocitosisMenorA9xmm3PredoNeutrofilos(boolean lcrPleocitosisMenorA9xmm3PredoNeutrofilos)
	{
	this.lcrPleocitosisMenorA9xmm3PredoNeutrofilos=lcrPleocitosisMenorA9xmm3PredoNeutrofilos;
	}
	public boolean getlcrProteinorraquiaMenor99mg_dl()
	{
	return lcrProteinorraquiaMenor99mg_dl;
	}
	public void setlcrProteinorraquiaMenor99mg_dl(boolean lcrProteinorraquiaMenor99mg_dl)
	{
	this.lcrProteinorraquiaMenor99mg_dl=lcrProteinorraquiaMenor99mg_dl;
	}
	public boolean getlcrHipoglicorraquiaMenor40mg_dl()
	{
	return lcrHipoglicorraquiaMenor40mg_dl;
	}
	public void setlcrHipoglicorraquiaMenor40mg_dl(boolean lcrHipoglicorraquiaMenor40mg_dl)
	{
	this.lcrHipoglicorraquiaMenor40mg_dl=lcrHipoglicorraquiaMenor40mg_dl;
	}
	public String getlcrOtras()
	{
	return lcrOtras;
	}
	public void setlcrOtras(String lcrOtras)
	{
	this.lcrOtras=lcrOtras;
	}
	public boolean getaeContactoCasoPrevio()
	{
	return aeContactoCasoPrevio;
	}
	public void setaeContactoCasoPrevio(boolean aeContactoCasoPrevio)
	{
	this.aeContactoCasoPrevio=aeContactoCasoPrevio;
	}
	public boolean getaeinternamiento()
	{
	return aeinternamiento;
	}
	public void setaeinternamiento(boolean aeinternamiento)
	{
	this.aeinternamiento=aeinternamiento;
	}
	public boolean getaeAcinamiento()
	{
	return aeAcinamiento;
	}
	public void setaeAcinamiento(boolean aeAcinamiento)
	{
	this.aeAcinamiento=aeAcinamiento;
	}
	public String getaeOtras()
	{
	return aeOtras;
	}
	public void setaeOtras(String aeOtras)
	{
	this.aeOtras=aeOtras;
	}

	
	
	public String Crear()
	{
		return "CREATE TABLE Menig001 (caso_id INTEGER PRIMARY KEY AUTOINCREMENT,sospecha boolean,fiebre FLOAT,RigidezNuca boolean, "
				+ "Cefalea boolean, Vomitos boolean, Fotofobia boolean, Convulciones boolean, OtrosSignosMenigios boolean,"
				+ " AlteracionesConciencia boolean, PetequiasOPurpuras boolean, TrastornosConducta boolean, Otras TEXT, "
				+ "m1aAbombatamientoFontanela boolean, m1aConvulciones boolean, m1aLetargia boolean, "
				+ "m1aSinJustoCausaClinica boolean, m1aOtras TEXT, lcrTubridez boolean, lcrHipertension boolean, "
				+ "lcrDisminucionFluidez boolean, lcrPleocitosisMenorA9xmm3PredoNeutrofilos boolean, "
				+ "lcrProteinorraquiaMenor99mg_dl boolean, lcrHipoglicorraquiaMenor40mg_dl boolean, "
				+ "lcrOtras TEXT, aeContactoCasoPrevio boolean, aeinternamiento boolean, aeAcinamiento boolean, "
				+ "aeOtras TEXT)";
	}
	
	
	/*Quitar id*/
	
	public long insertMenig001(Mening001 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getcaso_id());
	values.put("sospecha",tipo.getsospecha());
	values.put("fiebre",tipo.getfiebre());
	values.put("RigidezNuca",tipo.getRigidezNuca());
	values.put("Cefalea",tipo.getCefalea());
	values.put("Vomitos",tipo.getVomitos());
	values.put("Fotofobia",tipo.getFotofobia());
	values.put("Convulciones",tipo.getConvulciones());
	values.put("OtrosSignosMenigios",tipo.getOtrosSignosMenigios());
	values.put("AlteracionesConciencia",tipo.getAlteracionesConciencia());
	values.put("PetequiasOPurpuras",tipo.getPetequiasOPurpuras());
	values.put("TrastornosConducta",tipo.getTrastornosConducta());
	values.put("Otras",tipo.getOtras());
	values.put("m1aAbombatamientoFontanela",tipo.getm1aAbombatamientoFontanela());
	values.put("m1aConvulciones",tipo.getm1aConvulciones());
	values.put("m1aLetargia",tipo.getm1aLetargia());
	values.put("m1aSinJustoCausaClinica",tipo.getm1aSinJustoCausaClinica());
	values.put("m1aOtras",tipo.getm1aOtras());
	values.put("lcrTubridez",tipo.getlcrTubridez());
	values.put("lcrHipertension",tipo.getlcrHipertension());
	values.put("lcrDisminucionFluidez",tipo.getlcrDisminucionFluidez());
	values.put("lcrPleocitosisMenorA9xmm3PredoNeutrofilos",tipo.getlcrPleocitosisMenorA9xmm3PredoNeutrofilos());
	values.put("lcrProteinorraquiaMenor99mg_dl",tipo.getlcrProteinorraquiaMenor99mg_dl());
	values.put("lcrHipoglicorraquiaMenor40mg_dl",tipo.getlcrHipoglicorraquiaMenor40mg_dl());
	values.put("lcrOtras",tipo.getlcrOtras());
	values.put("aeContactoCasoPrevio",tipo.getaeContactoCasoPrevio());
	values.put("aeinternamiento",tipo.getaeinternamiento());
	values.put("aeAcinamiento",tipo.getaeAcinamiento());
	values.put("aeOtras",tipo.getaeOtras());
	
	long id=0;
	
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("Menig001",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("Menig001", null, values);
	}
	 return id;
	
	}
	
	public Mening001 selectMening001(String caso_id,SQLiteDatabase db)
	{
	Mening001 tipo=null;
	Cursor cursor=db.query("Menig001" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new Mening001(cursor.getString(0),Booleanos(cursor.getString(1)),cursor.getString(2),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),Booleanos(cursor.getString(6)),Booleanos(cursor.getString(7)),Booleanos(cursor.getString(8)),Booleanos(cursor.getString(9)),Booleanos(cursor.getString(10)),Booleanos(cursor.getString(11)),cursor.getString(12),Booleanos(cursor.getString(13)),Booleanos(cursor.getString(14)),Booleanos(cursor.getString(15)),Booleanos(cursor.getString(16)),cursor.getString(17),Booleanos(cursor.getString(18)),Booleanos(cursor.getString(19)),Booleanos(cursor.getString(20)),Booleanos(cursor.getString(21)),Booleanos(cursor.getString(22)),Booleanos(cursor.getString(23)),cursor.getString(24),Booleanos(cursor.getString(25)),Booleanos(cursor.getString(26)),Booleanos(cursor.getString(27)),cursor.getString(28));
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
