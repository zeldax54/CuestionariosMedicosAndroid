package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EnfResp004 {
	
	
	private String caso_id;
	private boolean SI;
	private boolean SIbacteriminia;
	private boolean SIhemocultivopos;
	private boolean SIfiebreunicamanif;
	private boolean SIsepsis;
	private boolean SIdistermia;
	private String SItemperatura;
	private boolean SItaquicardiaedad;
	private String SIfrecuanciaresp;
	private boolean SItaquipneaedad;
	private String SIfrecuanciacard;
	private boolean SIalteracionesfleuc;
	private boolean SIexceso;
	private boolean SIdefecto;
	private boolean SIformasinmaduras;
	private boolean SIsepsissevera;
	private boolean SIsockseptico;
	private boolean SIN;
	private boolean N;
	private boolean SNI_Ndolortoracico;
	private boolean SNI_estertores;
	private boolean SNI_Ncatarroprev;
	private boolean SNI_Nfiebremas39;
	private boolean SNI_Ndificultadresp;
	private boolean SNI_Ntiraje;
	private boolean SNI_Niractratprevio;
	private String SNI_Notro;
	private boolean O;
	private boolean SNI_Omembranaroja;
	private boolean SNI_Omembranaabombada;
	private boolean SNI_Omembranaperforada;
	private boolean SNI_Ofiebremas38;
	private boolean SNI_Ootalgia;
	private boolean SNI_Oantecednetesira;
	private String SNI_Ootro;
	private boolean SNI_OantecedentesOMA;
	private boolean SNI_Oconsumoantib;
	private boolean R;
	private String SNI_Rfiebre;
	private String SNI_Rnumdias;
	private boolean SNI_Rdolorgarg;
	private boolean SI_Rmalestargen;
	private boolean SNI_Rsecrecionmucop;
	private boolean SNI_Rotalgia;
	private boolean SNI_Riraanterior;
	private String SNI_Rotros;
	
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getSI()
	{
	return SI;
	}
	public void setSI(boolean SI)
	{
	this.SI=SI;
	}
	public boolean getSIbacteriminia()
	{
	return SIbacteriminia;
	}
	public void setSIbacteriminia(boolean SIbacteriminia)
	{
	this.SIbacteriminia=SIbacteriminia;
	}
	public boolean getSIhemocultivopos()
	{
	return SIhemocultivopos;
	}
	public void setSIhemocultivopos(boolean SIhemocultivopos)
	{
	this.SIhemocultivopos=SIhemocultivopos;
	}
	public boolean getSIfiebreunicamanif()
	{
	return SIfiebreunicamanif;
	}
	public void setSIfiebreunicamanif(boolean SIfiebreunicamanif)
	{
	this.SIfiebreunicamanif=SIfiebreunicamanif;
	}
	public boolean getSIsepsis()
	{
	return SIsepsis;
	}
	public void setSIsepsis(boolean SIsepsis)
	{
	this.SIsepsis=SIsepsis;
	}
	public boolean getSIdistermia()
	{
	return SIdistermia;
	}
	public void setSIdistermia(boolean SIdistermia)
	{
	this.SIdistermia=SIdistermia;
	}
	public String getSItemperatura()
	{
	return SItemperatura;
	}
	public void setSItemperatura(String SItemperatura)
	{
	this.SItemperatura=SItemperatura;
	}
	public boolean getSItaquicardiaedad()
	{
	return SItaquicardiaedad;
	}
	public void setSItaquicardiaedad(boolean SItaquicardiaedad)
	{
	this.SItaquicardiaedad=SItaquicardiaedad;
	}
	public String getSIfrecuanciaresp()
	{
	return SIfrecuanciaresp;
	}
	public void setSIfrecuanciaresp(String SIfrecuanciaresp)
	{
	this.SIfrecuanciaresp=SIfrecuanciaresp;
	}
	public boolean getSItaquipneaedad()
	{
	return SItaquipneaedad;
	}
	public void setSItaquipneaedad(boolean SItaquipneaedad)
	{
	this.SItaquipneaedad=SItaquipneaedad;
	}
	public String getSIfrecuanciacard()
	{
	return SIfrecuanciacard;
	}
	public void setSIfrecuanciacard(String SIfrecuanciacard)
	{
	this.SIfrecuanciacard=SIfrecuanciacard;
	}
	public boolean getSIalteracionesfleuc()
	{
	return SIalteracionesfleuc;
	}
	public void setSIalteracionesfleuc(boolean SIalteracionesfleuc)
	{
	this.SIalteracionesfleuc=SIalteracionesfleuc;
	}
	public boolean getSIexceso()
	{
	return SIexceso;
	}
	public void setSIexceso(boolean SIexceso)
	{
	this.SIexceso=SIexceso;
	}
	public boolean getSIdefecto()
	{
	return SIdefecto;
	}
	public void setSIdefecto(boolean SIdefecto)
	{
	this.SIdefecto=SIdefecto;
	}
	public boolean getSIformasinmaduras()
	{
	return SIformasinmaduras;
	}
	public void setSIformasinmaduras(boolean SIformasinmaduras)
	{
	this.SIformasinmaduras=SIformasinmaduras;
	}
	public boolean getSIsepsissevera()
	{
	return SIsepsissevera;
	}
	public void setSIsepsissevera(boolean SIsepsissevera)
	{
	this.SIsepsissevera=SIsepsissevera;
	}
	public boolean getSIsockseptico()
	{
	return SIsockseptico;
	}
	public void setSIsockseptico(boolean SIsockseptico)
	{
	this.SIsockseptico=SIsockseptico;
	}
	public boolean getSIN()
	{
	return SIN;
	}
	public void setSIN(boolean SIN)
	{
	this.SIN=SIN;
	}
	public boolean getN()
	{
	return N;
	}
	public void setN(boolean N)
	{
	this.N=N;
	}
	public boolean getSNI_Ndolortoracico()
	{
	return SNI_Ndolortoracico;
	}
	public void setSNI_Ndolortoracico(boolean SNI_Ndolortoracico)
	{
	this.SNI_Ndolortoracico=SNI_Ndolortoracico;
	}
	public boolean getSNI_estertores()
	{
	return SNI_estertores;
	}
	public void setSNI_estertores(boolean SNI_estertores)
	{
	this.SNI_estertores=SNI_estertores;
	}
	public boolean getSNI_Ncatarroprev()
	{
	return SNI_Ncatarroprev;
	}
	public void setSNI_Ncatarroprev(boolean SNI_Ncatarroprev)
	{
	this.SNI_Ncatarroprev=SNI_Ncatarroprev;
	}
	public boolean getSNI_Nfiebremas39()
	{
	return SNI_Nfiebremas39;
	}
	public void setSNI_Nfiebremas39(boolean SNI_Nfiebremas39)
	{
	this.SNI_Nfiebremas39=SNI_Nfiebremas39;
	}
	public boolean getSNI_Ndificultadresp()
	{
	return SNI_Ndificultadresp;
	}
	public void setSNI_Ndificultadresp(boolean SNI_Ndificultadresp)
	{
	this.SNI_Ndificultadresp=SNI_Ndificultadresp;
	}
	public boolean getSNI_Ntiraje()
	{
	return SNI_Ntiraje;
	}
	public void setSNI_Ntiraje(boolean SNI_Ntiraje)
	{
	this.SNI_Ntiraje=SNI_Ntiraje;
	}
	public boolean getSNI_Niractratprevio()
	{
	return SNI_Niractratprevio;
	}
	public void setSNI_Niractratprevio(boolean SNI_Niractratprevio)
	{
	this.SNI_Niractratprevio=SNI_Niractratprevio;
	}
	public String getSNI_Notro()
	{
	return SNI_Notro;
	}
	public void setSNI_Notro(String SNI_Notro)
	{
	this.SNI_Notro=SNI_Notro;
	}
	public boolean getO()
	{
	return O;
	}
	public void setO(boolean O)
	{
	this.O=O;
	}
	public boolean getSNI_Omembranaroja()
	{
	return SNI_Omembranaroja;
	}
	public void setSNI_Omembranaroja(boolean SNI_Omembranaroja)
	{
	this.SNI_Omembranaroja=SNI_Omembranaroja;
	}
	public boolean getSNI_Omembranaabombada()
	{
	return SNI_Omembranaabombada;
	}
	public void setSNI_Omembranaabombada(boolean SNI_Omembranaabombada)
	{
	this.SNI_Omembranaabombada=SNI_Omembranaabombada;
	}
	public boolean getSNI_Omembranaperforada()
	{
	return SNI_Omembranaperforada;
	}
	public void setSNI_Omembranaperforada(boolean SNI_Omembranaperforada)
	{
	this.SNI_Omembranaperforada=SNI_Omembranaperforada;
	}
	public boolean getSNI_Ofiebremas38()
	{
	return SNI_Ofiebremas38;
	}
	public void setSNI_Ofiebremas38(boolean SNI_Ofiebremas38)
	{
	this.SNI_Ofiebremas38=SNI_Ofiebremas38;
	}
	public boolean getSNI_Ootalgia()
	{
	return SNI_Ootalgia;
	}
	public void setSNI_Ootalgia(boolean SNI_Ootalgia)
	{
	this.SNI_Ootalgia=SNI_Ootalgia;
	}
	public boolean getSNI_Oantecednetesira()
	{
	return SNI_Oantecednetesira;
	}
	public void setSNI_Oantecednetesira(boolean SNI_Oantecednetesira)
	{
	this.SNI_Oantecednetesira=SNI_Oantecednetesira;
	}
	public String getSNI_Ootro()
	{
	return SNI_Ootro;
	}
	public void setSNI_Ootro(String SNI_Ootro)
	{
	this.SNI_Ootro=SNI_Ootro;
	}
	public boolean getSNI_OantecedentesOMA()
	{
	return SNI_OantecedentesOMA;
	}
	public void setSNI_OantecedentesOMA(boolean SNI_OantecedentesOMA)
	{
	this.SNI_OantecedentesOMA=SNI_OantecedentesOMA;
	}
	public boolean getSNI_Oconsumoantib()
	{
	return SNI_Oconsumoantib;
	}
	public void setSNI_Oconsumoantib(boolean SNI_Oconsumoantib)
	{
	this.SNI_Oconsumoantib=SNI_Oconsumoantib;
	}
	public boolean getR()
	{
	return R;
	}
	public void setR(boolean R)
	{
	this.R=R;
	}
	public String getSNI_Rfiebre()
	{
	return SNI_Rfiebre;
	}
	public void setSNI_Rfiebre(String SNI_Rfiebre)
	{
	this.SNI_Rfiebre=SNI_Rfiebre;
	}
	public String getSNI_Rnumdias()
	{
	return SNI_Rnumdias;
	}
	public void setSNI_Rnumdias(String SNI_Rnumdias)
	{
	this.SNI_Rnumdias=SNI_Rnumdias;
	}
	public boolean getSNI_Rdolorgarg()
	{
	return SNI_Rdolorgarg;
	}
	public void setSNI_Rdolorgarg(boolean SNI_Rdolorgarg)
	{
	this.SNI_Rdolorgarg=SNI_Rdolorgarg;
	}
	public boolean getSI_Rmalestargen()
	{
	return SI_Rmalestargen;
	}
	public void setSI_Rmalestargen(boolean SI_Rmalestargen)
	{
	this.SI_Rmalestargen=SI_Rmalestargen;
	}
	public boolean getSNI_Rsecrecionmucop()
	{
	return SNI_Rsecrecionmucop;
	}
	public void setSNI_Rsecrecionmucop(boolean SNI_Rsecrecionmucop)
	{
	this.SNI_Rsecrecionmucop=SNI_Rsecrecionmucop;
	}
	public boolean getSNI_Rotalgia()
	{
	return SNI_Rotalgia;
	}
	public void setSNI_Rotalgia(boolean SNI_Rotalgia)
	{
	this.SNI_Rotalgia=SNI_Rotalgia;
	}
	public boolean getSNI_Riraanterior()
	{
	return SNI_Riraanterior;
	}
	public void setSNI_Riraanterior(boolean SNI_Riraanterior)
	{
	this.SNI_Riraanterior=SNI_Riraanterior;
	}
	public String getSNI_Rotros()
	{
	return SNI_Rotros;
	}
	public void setSNI_Rotros(String SNI_Rotros)
	{
	this.SNI_Rotros=SNI_Rotros;
	}
	public EnfResp004(){}
	public EnfResp004(String pcaso_id,boolean pSI,boolean pSIbacteriminia,boolean pSIhemocultivopos,boolean pSIfiebreunicamanif,boolean pSIsepsis,boolean pSIdistermia,String pSItemperatura,boolean pSItaquicardiaedad,String pSIfrecuanciaresp,boolean pSItaquipneaedad,String pSIfrecuanciacard,boolean pSIalteracionesfleuc,boolean pSIexceso,boolean pSIdefecto,boolean pSIformasinmaduras,boolean pSIsepsissevera,boolean pSIsockseptico,boolean pSIN,boolean pN,boolean pSNI_Ndolortoracico,boolean pSNI_estertores,boolean pSNI_Ncatarroprev,boolean pSNI_Nfiebremas39,boolean pSNI_Ndificultadresp,boolean pSNI_Ntiraje,boolean pSNI_Niractratprevio,String pSNI_Notro,boolean pO,boolean pSNI_Omembranaroja,boolean pSNI_Omembranaabombada,boolean pSNI_Omembranaperforada,boolean pSNI_Ofiebremas38,boolean pSNI_Ootalgia,boolean pSNI_Oantecednetesira,String pSNI_Ootro,boolean pSNI_OantecedentesOMA,boolean pSNI_Oconsumoantib,boolean pR,String pSNI_Rfiebre,String pSNI_Rnumdias,boolean pSNI_Rdolorgarg,boolean pSI_Rmalestargen,boolean pSNI_Rsecrecionmucop,boolean pSNI_Rotalgia,boolean pSNI_Riraanterior,String pSNI_Rotros)
	{
	caso_id=pcaso_id;
	SI=pSI;
	SIbacteriminia=pSIbacteriminia;
	SIhemocultivopos=pSIhemocultivopos;
	SIfiebreunicamanif=pSIfiebreunicamanif;
	SIsepsis=pSIsepsis;
	SIdistermia=pSIdistermia;
	SItemperatura=pSItemperatura;
	SItaquicardiaedad=pSItaquicardiaedad;
	SIfrecuanciaresp=pSIfrecuanciaresp;
	SItaquipneaedad=pSItaquipneaedad;
	SIfrecuanciacard=pSIfrecuanciacard;
	SIalteracionesfleuc=pSIalteracionesfleuc;
	SIexceso=pSIexceso;
	SIdefecto=pSIdefecto;
	SIformasinmaduras=pSIformasinmaduras;
	SIsepsissevera=pSIsepsissevera;
	SIsockseptico=pSIsockseptico;
	SIN=pSIN;
	N=pN;
	SNI_Ndolortoracico=pSNI_Ndolortoracico;
	SNI_estertores=pSNI_estertores;
	SNI_Ncatarroprev=pSNI_Ncatarroprev;
	SNI_Nfiebremas39=pSNI_Nfiebremas39;
	SNI_Ndificultadresp=pSNI_Ndificultadresp;
	SNI_Ntiraje=pSNI_Ntiraje;
	SNI_Niractratprevio=pSNI_Niractratprevio;
	SNI_Notro=pSNI_Notro;
	O=pO;
	SNI_Omembranaroja=pSNI_Omembranaroja;
	SNI_Omembranaabombada=pSNI_Omembranaabombada;
	SNI_Omembranaperforada=pSNI_Omembranaperforada;
	SNI_Ofiebremas38=pSNI_Ofiebremas38;
	SNI_Ootalgia=pSNI_Ootalgia;
	SNI_Oantecednetesira=pSNI_Oantecednetesira;
	SNI_Ootro=pSNI_Ootro;
	SNI_OantecedentesOMA=pSNI_OantecedentesOMA;
	SNI_Oconsumoantib=pSNI_Oconsumoantib;
	R=pR;
	SNI_Rfiebre=pSNI_Rfiebre;
	SNI_Rnumdias=pSNI_Rnumdias;
	SNI_Rdolorgarg=pSNI_Rdolorgarg;
	SI_Rmalestargen=pSI_Rmalestargen;
	SNI_Rsecrecionmucop=pSNI_Rsecrecionmucop;
	SNI_Rotalgia=pSNI_Rotalgia;
	SNI_Riraanterior=pSNI_Riraanterior;
	SNI_Rotros=pSNI_Rotros;

	}
	
	
	
	
	public String Crear()
	{
		return "CREATE TABLE EnfResp004 (caso_id INTEGER PRIMARY KEY, SI boolean, SIbacteriminia boolean, "
				+ "SIhemocultivopos boolean, SIfiebreunicamanif boolean, SIsepsis boolean, "
				+ "SIdistermia boolean, SItemperatura float, SItaquicardiaedad boolean, SIfrecuanciaresp float, "
				+ "SItaquipneaedad boolean, SIfrecuanciacard float, SIalteracionesfleuc boolean, SIexceso boolean,"
				+ " SIdefecto boolean, SIformasinmaduras boolean, SIsepsissevera boolean, SIsockseptico boolean, "
				+ "SIN boolean, N boolean, SNI_Ndolortoracico boolean, SNI_estertores boolean, SNI_Ncatarroprev boolean, "
				+ "SNI_Nfiebremas39 boolean, SNI_Ndificultadresp boolean, SNI_Ntiraje boolean, SNI_Niractratprevio boolean,"
				+ " SNI_Notro TEXT, O boolean, SNI_Omembranaroja boolean, SNI_Omembranaabombada boolean, "
				+ "SNI_Omembranaperforada boolean, SNI_Ofiebremas38 boolean, SNI_Ootalgia boolean, "
				+ "SNI_Oantecednetesira boolean, SNI_Ootro TEXT, SNI_OantecedentesOMA boolean, SNI_Oconsumoantib boolean,"
				+ " R boolean, SNI_Rfiebre float, SNI_Rnumdias INTEGER, SNI_Rdolorgarg boolean, SI_Rmalestargen boolean, "
				+ "SNI_Rsecrecionmucop boolean, SNI_Rotalgia boolean, SNI_Riraanterior boolean, SNI_Rotros TEXT)";
	}
	
	public long insertEnfResp004(EnfResp004 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getcaso_id());
	values.put("SI",tipo.getSI());
	values.put("SIbacteriminia",tipo.getSIbacteriminia());
	values.put("SIhemocultivopos",tipo.getSIhemocultivopos());
	values.put("SIfiebreunicamanif",tipo.getSIfiebreunicamanif());
	values.put("SIsepsis",tipo.getSIsepsis());
	values.put("SIdistermia",tipo.getSIdistermia());
	values.put("SItemperatura",tipo.getSItemperatura());
	values.put("SItaquicardiaedad",tipo.getSItaquicardiaedad());
	values.put("SIfrecuanciaresp",tipo.getSIfrecuanciaresp());
	values.put("SItaquipneaedad",tipo.getSItaquipneaedad());
	values.put("SIfrecuanciacard",tipo.getSIfrecuanciacard());
	values.put("SIalteracionesfleuc",tipo.getSIalteracionesfleuc());
	values.put("SIexceso",tipo.getSIexceso());
	values.put("SIdefecto",tipo.getSIdefecto());
	values.put("SIformasinmaduras",tipo.getSIformasinmaduras());
	values.put("SIsepsissevera",tipo.getSIsepsissevera());
	values.put("SIsockseptico",tipo.getSIsockseptico());
	values.put("SIN",tipo.getSIN());
	values.put("N",tipo.getN());
	values.put("SNI_Ndolortoracico",tipo.getSNI_Ndolortoracico());
	values.put("SNI_estertores",tipo.getSNI_estertores());
	values.put("SNI_Ncatarroprev",tipo.getSNI_Ncatarroprev());
	values.put("SNI_Nfiebremas39",tipo.getSNI_Nfiebremas39());
	values.put("SNI_Ndificultadresp",tipo.getSNI_Ndificultadresp());
	values.put("SNI_Ntiraje",tipo.getSNI_Ntiraje());
	values.put("SNI_Niractratprevio",tipo.getSNI_Niractratprevio());
	values.put("SNI_Notro",tipo.getSNI_Notro());
	values.put("O",tipo.getO());
	values.put("SNI_Omembranaroja",tipo.getSNI_Omembranaroja());
	values.put("SNI_Omembranaabombada",tipo.getSNI_Omembranaabombada());
	values.put("SNI_Omembranaperforada",tipo.getSNI_Omembranaperforada());
	values.put("SNI_Ofiebremas38",tipo.getSNI_Ofiebremas38());
	values.put("SNI_Ootalgia",tipo.getSNI_Ootalgia());
	values.put("SNI_Oantecednetesira",tipo.getSNI_Oantecednetesira());
	values.put("SNI_Ootro",tipo.getSNI_Ootro());
	values.put("SNI_OantecedentesOMA",tipo.getSNI_OantecedentesOMA());
	values.put("SNI_Oconsumoantib",tipo.getSNI_Oconsumoantib());
	values.put("R",tipo.getR());
	values.put("SNI_Rfiebre",tipo.getSNI_Rfiebre());
	values.put("SNI_Rnumdias",tipo.getSNI_Rnumdias());
	values.put("SNI_Rdolorgarg",tipo.getSNI_Rdolorgarg());
	values.put("SI_Rmalestargen",tipo.getSI_Rmalestargen());
	values.put("SNI_Rsecrecionmucop",tipo.getSNI_Rsecrecionmucop());
	values.put("SNI_Rotalgia",tipo.getSNI_Rotalgia());
	values.put("SNI_Riraanterior",tipo.getSNI_Riraanterior());
	values.put("SNI_Rotros",tipo.getSNI_Rotros());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("EnfResp004",values,"caso_id=?",args);
	}
	else
	{
		id = db.insert("EnfResp004", null, values);
	}

	return id;
	
	}
	
	public EnfResp004 selectEnfResp004(long caso_id,SQLiteDatabase db)
	{
	EnfResp004 tipo=null;
	Cursor cursor=db.query("EnfResp004" ,null,"caso_id=?",new String[] {Long.toString(caso_id)},null, null, null);
	cursor.moveToFirst();
	tipo=new EnfResp004(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),Booleanos(cursor.getString(6)),String.valueOf(cursor.getString(7)),Booleanos(cursor.getString(8)),String.valueOf(cursor.getString(9)),Booleanos(cursor.getString(10)),String.valueOf(cursor.getString(11)),Booleanos(cursor.getString(12)),Booleanos(cursor.getString(13)),Booleanos(cursor.getString(14)),Booleanos(cursor.getString(15)),Booleanos(cursor.getString(16)),Booleanos(cursor.getString(17)),Booleanos(cursor.getString(18)),Booleanos(cursor.getString(19)),Booleanos(cursor.getString(20)),Booleanos(cursor.getString(21)),Booleanos(cursor.getString(22)),Booleanos(cursor.getString(23)),Booleanos(cursor.getString(24)),Booleanos(cursor.getString(25)),Booleanos(cursor.getString(26)),String.valueOf(cursor.getString(27)),Booleanos(cursor.getString(28)),Booleanos(cursor.getString(29)),Booleanos(cursor.getString(30)),Booleanos(cursor.getString(31)),Booleanos(cursor.getString(32)),Booleanos(cursor.getString(33)),Booleanos(cursor.getString(34)),String.valueOf(cursor.getString(35)),Booleanos(cursor.getString(36)),Booleanos(cursor.getString(37)),Booleanos(cursor.getString(38)),String.valueOf(cursor.getString(39)),String.valueOf(cursor.getString(40)),Booleanos(cursor.getString(41)),Booleanos(cursor.getString(42)),Booleanos(cursor.getString(43)),Booleanos(cursor.getString(44)),Booleanos(cursor.getString(45)),String.valueOf(cursor.getString(46)));
	return tipo;
	}
	
	

	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}
	

}
