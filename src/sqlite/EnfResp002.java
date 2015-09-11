package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EnfResp002 {
	
	private String caso_id;
	private boolean ISNB;
	private boolean ISNBcomiezorep;
	private String ISNBfiebre;
	private boolean ISNBescalofrios;
	private boolean ISNBmalestargen;
	private boolean ISNBmialgias;
	private boolean ISNBdolorp;
	private boolean ISNBtaquipnea;
	private boolean ISNBtoscesp;
	private boolean ISNBvomitos;
	private boolean ISNBconvulciones;
	private boolean ISNBsatoxigeno;
	private String ISNBotros;
	private boolean IOIB;
	private boolean IOIB_SNPbronquitisaguda;
	private boolean IOIB_SNPbronconeumonia;
	private boolean IOIB_SNPneumoniaviral;
	private boolean IOIB_SNPneumoniainterst;
	private boolean IOIB_SNPtraqueobronquitis;
	private boolean IOIB_SNPbronquiolitis;
	private boolean IOIB_SCepiglotitis;
	private boolean IOIB_SClaringitis;
	private boolean IOIB_SClaringotraqueobronq;
	private boolean IOIBsindromcoqueluchoide;
	private boolean IOIBsindrominterpliquida;
	private boolean IOIBsindrominterpgaseosa;
	private boolean IAH;
	private String IAHcual;
	public EnfResp002(){}
	public EnfResp002(String pcaso_id,boolean pISNB,boolean pISNBcomiezorep,String pISNBfiebre,boolean pISNBescalofrios,boolean pISNBmalestargen,boolean pISNBmialgias,boolean pISNBdolorp,boolean pISNBtaquipnea,boolean pISNBtoscesp,boolean pISNBvomitos,boolean pISNBconvulciones,boolean pISNBsatoxigeno,String pISNBotros,boolean pIOIB,boolean pIOIB_SNPbronquitisaguda,boolean pIOIB_SNPbronconeumonia,boolean pIOIB_SNPneumoniaviral,boolean pIOIB_SNPneumoniainterst,boolean pIOIB_SNPtraqueobronquitis,boolean pIOIB_SNPbronquiolitis,boolean pIOIB_SCepiglotitis,boolean pIOIB_SClaringitis,boolean pIOIB_SClaringotraqueobronq,boolean pIOIBsindromcoqueluchoide,boolean pIOIBsindrominterpliquida,boolean pIOIBsindrominterpgaseosa,boolean pIAH,String pIAHcual)
	{
	caso_id=pcaso_id;
	ISNB=pISNB;
	ISNBcomiezorep=pISNBcomiezorep;
	ISNBfiebre=pISNBfiebre;
	ISNBescalofrios=pISNBescalofrios;
	ISNBmalestargen=pISNBmalestargen;
	ISNBmialgias=pISNBmialgias;
	ISNBdolorp=pISNBdolorp;
	ISNBtaquipnea=pISNBtaquipnea;
	ISNBtoscesp=pISNBtoscesp;
	ISNBvomitos=pISNBvomitos;
	ISNBconvulciones=pISNBconvulciones;
	ISNBsatoxigeno=pISNBsatoxigeno;
	ISNBotros=pISNBotros;
	IOIB=pIOIB;
	IOIB_SNPbronquitisaguda=pIOIB_SNPbronquitisaguda;
	IOIB_SNPbronconeumonia=pIOIB_SNPbronconeumonia;
	IOIB_SNPneumoniaviral=pIOIB_SNPneumoniaviral;
	IOIB_SNPneumoniainterst=pIOIB_SNPneumoniainterst;
	IOIB_SNPtraqueobronquitis=pIOIB_SNPtraqueobronquitis;
	IOIB_SNPbronquiolitis=pIOIB_SNPbronquiolitis;
	IOIB_SCepiglotitis=pIOIB_SCepiglotitis;
	IOIB_SClaringitis=pIOIB_SClaringitis;
	IOIB_SClaringotraqueobronq=pIOIB_SClaringotraqueobronq;
	IOIBsindromcoqueluchoide=pIOIBsindromcoqueluchoide;
	IOIBsindrominterpliquida=pIOIBsindrominterpliquida;
	IOIBsindrominterpgaseosa=pIOIBsindrominterpgaseosa;
	IAH=pIAH;
	IAHcual=pIAHcual;

	}
	
	
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getISNB()
	{
	return ISNB;
	}
	public void setISNB(boolean ISNB)
	{
	this.ISNB=ISNB;
	}
	public boolean getISNBcomiezorep()
	{
	return ISNBcomiezorep;
	}
	public void setISNBcomiezorep(boolean ISNBcomiezorep)
	{
	this.ISNBcomiezorep=ISNBcomiezorep;
	}
	public String getISNBfiebre()
	{
	return ISNBfiebre;
	}
	public void setISNBfiebre(String ISNBfiebre)
	{
	this.ISNBfiebre=ISNBfiebre;
	}
	public boolean getISNBescalofrios()
	{
	return ISNBescalofrios;
	}
	public void setISNBescalofrios(boolean ISNBescalofrios)
	{
	this.ISNBescalofrios=ISNBescalofrios;
	}
	public boolean getISNBmalestargen()
	{
	return ISNBmalestargen;
	}
	public void setISNBmalestargen(boolean ISNBmalestargen)
	{
	this.ISNBmalestargen=ISNBmalestargen;
	}
	public boolean getISNBmialgias()
	{
	return ISNBmialgias;
	}
	public void setISNBmialgias(boolean ISNBmialgias)
	{
	this.ISNBmialgias=ISNBmialgias;
	}
	public boolean getISNBdolorp()
	{
	return ISNBdolorp;
	}
	public void setISNBdolorp(boolean ISNBdolorp)
	{
	this.ISNBdolorp=ISNBdolorp;
	}
	public boolean getISNBtaquipnea()
	{
	return ISNBtaquipnea;
	}
	public void setISNBtaquipnea(boolean ISNBtaquipnea)
	{
	this.ISNBtaquipnea=ISNBtaquipnea;
	}
	public boolean getISNBtoscesp()
	{
	return ISNBtoscesp;
	}
	public void setISNBtoscesp(boolean ISNBtoscesp)
	{
	this.ISNBtoscesp=ISNBtoscesp;
	}
	public boolean getISNBvomitos()
	{
	return ISNBvomitos;
	}
	public void setISNBvomitos(boolean ISNBvomitos)
	{
	this.ISNBvomitos=ISNBvomitos;
	}
	public boolean getISNBconvulciones()
	{
	return ISNBconvulciones;
	}
	public void setISNBconvulciones(boolean ISNBconvulciones)
	{
	this.ISNBconvulciones=ISNBconvulciones;
	}
	public boolean getISNBsatoxigeno()
	{
	return ISNBsatoxigeno;
	}
	public void setISNBsatoxigeno(boolean ISNBsatoxigeno)
	{
	this.ISNBsatoxigeno=ISNBsatoxigeno;
	}
	public String getISNBotros()
	{
	return ISNBotros;
	}
	public void setISNBotros(String ISNBotros)
	{
	this.ISNBotros=ISNBotros;
	}
	public boolean getIOIB()
	{
	return IOIB;
	}
	public void setIOIB(boolean IOIB)
	{
	this.IOIB=IOIB;
	}
	public boolean getIOIB_SNPbronquitisaguda()
	{
	return IOIB_SNPbronquitisaguda;
	}
	public void setIOIB_SNPbronquitisaguda(boolean IOIB_SNPbronquitisaguda)
	{
	this.IOIB_SNPbronquitisaguda=IOIB_SNPbronquitisaguda;
	}
	public boolean getIOIB_SNPbronconeumonia()
	{
	return IOIB_SNPbronconeumonia;
	}
	public void setIOIB_SNPbronconeumonia(boolean IOIB_SNPbronconeumonia)
	{
	this.IOIB_SNPbronconeumonia=IOIB_SNPbronconeumonia;
	}
	public boolean getIOIB_SNPneumoniaviral()
	{
	return IOIB_SNPneumoniaviral;
	}
	public void setIOIB_SNPneumoniaviral(boolean IOIB_SNPneumoniaviral)
	{
	this.IOIB_SNPneumoniaviral=IOIB_SNPneumoniaviral;
	}
	public boolean getIOIB_SNPneumoniainterst()
	{
	return IOIB_SNPneumoniainterst;
	}
	public void setIOIB_SNPneumoniainterst(boolean IOIB_SNPneumoniainterst)
	{
	this.IOIB_SNPneumoniainterst=IOIB_SNPneumoniainterst;
	}
	public boolean getIOIB_SNPtraqueobronquitis()
	{
	return IOIB_SNPtraqueobronquitis;
	}
	public void setIOIB_SNPtraqueobronquitis(boolean IOIB_SNPtraqueobronquitis)
	{
	this.IOIB_SNPtraqueobronquitis=IOIB_SNPtraqueobronquitis;
	}
	public boolean getIOIB_SNPbronquiolitis()
	{
	return IOIB_SNPbronquiolitis;
	}
	public void setIOIB_SNPbronquiolitis(boolean IOIB_SNPbronquiolitis)
	{
	this.IOIB_SNPbronquiolitis=IOIB_SNPbronquiolitis;
	}
	public boolean getIOIB_SCepiglotitis()
	{
	return IOIB_SCepiglotitis;
	}
	public void setIOIB_SCepiglotitis(boolean IOIB_SCepiglotitis)
	{
	this.IOIB_SCepiglotitis=IOIB_SCepiglotitis;
	}
	public boolean getIOIB_SClaringitis()
	{
	return IOIB_SClaringitis;
	}
	public void setIOIB_SClaringitis(boolean IOIB_SClaringitis)
	{
	this.IOIB_SClaringitis=IOIB_SClaringitis;
	}
	public boolean getIOIB_SClaringotraqueobronq()
	{
	return IOIB_SClaringotraqueobronq;
	}
	public void setIOIB_SClaringotraqueobronq(boolean IOIB_SClaringotraqueobronq)
	{
	this.IOIB_SClaringotraqueobronq=IOIB_SClaringotraqueobronq;
	}
	public boolean getIOIBsindromcoqueluchoide()
	{
	return IOIBsindromcoqueluchoide;
	}
	public void setIOIBsindromcoqueluchoide(boolean IOIBsindromcoqueluchoide)
	{
	this.IOIBsindromcoqueluchoide=IOIBsindromcoqueluchoide;
	}
	public boolean getIOIBsindrominterpliquida()
	{
	return IOIBsindrominterpliquida;
	}
	public void setIOIBsindrominterpliquida(boolean IOIBsindrominterpliquida)
	{
	this.IOIBsindrominterpliquida=IOIBsindrominterpliquida;
	}
	public boolean getIOIBsindrominterpgaseosa()
	{
	return IOIBsindrominterpgaseosa;
	}
	public void setIOIBsindrominterpgaseosa(boolean IOIBsindrominterpgaseosa)
	{
	this.IOIBsindrominterpgaseosa=IOIBsindrominterpgaseosa;
	}
	public boolean getIAH()
	{
	return IAH;
	}
	public void setIAH(boolean IAH)
	{
	this.IAH=IAH;
	}
	public String getIAHcual()
	{
	return IAHcual;
	}
	public void setIAHcual(String IAHcual)
	{
	this.IAHcual=IAHcual;
	}

	
	
	
	public String Crear()
	{
		return "CREATE TABLE EnfResp002(caso_id INTEGER PRIMARY KEY,ISNB boolean, ISNBcomiezorep boolean, "
				+ "ISNBfiebre float, ISNBescalofrios boolean, ISNBmalestargen boolean, ISNBmialgias boolean, "
				+ "ISNBdolorp boolean, ISNBtaquipnea boolean, ISNBtoscesp boolean, ISNBvomitos boolean, ISNBconvulciones boolean, "
				+ "ISNBsatoxigeno boolean, ISNBotros TEXT, IOIB boolean, IOIB_SNPbronquitisaguda boolean, "
				+ "IOIB_SNPbronconeumonia boolean, IOIB_SNPneumoniaviral boolean, IOIB_SNPneumoniainterst boolean, "
				+ "IOIB_SNPtraqueobronquitis boolean, IOIB_SNPbronquiolitis boolean, IOIB_SCepiglotitis boolean, "
				+ "IOIB_SClaringitis boolean, IOIB_SClaringotraqueobronq boolean, IOIBsindromcoqueluchoide boolean,"
				+ " IOIBsindrominterpliquida boolean, IOIBsindrominterpgaseosa boolean, IAH boolean, IAHcual TEXT)";
		
	}
	
	public EnfResp002 selectEnfResp002(long caso_id,SQLiteDatabase db)
	{
	EnfResp002 tipo=null;
	Cursor cursor=db.query("EnfResp002" ,null,"caso_id=?",new String[] {Long.toString(caso_id)},null, null, null);
	cursor.moveToFirst();
	tipo=new EnfResp002(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),String.valueOf(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),Booleanos(cursor.getString(6)),Booleanos(cursor.getString(7)),Booleanos(cursor.getString(8)),Booleanos(cursor.getString(9)),Booleanos(cursor.getString(10)),Booleanos(cursor.getString(11)),Booleanos(cursor.getString(12)),String.valueOf(cursor.getString(13)),Booleanos(cursor.getString(14)),Booleanos(cursor.getString(15)),Booleanos(cursor.getString(16)),Booleanos(cursor.getString(17)),Booleanos(cursor.getString(18)),Booleanos(cursor.getString(19)),Booleanos(cursor.getString(20)),Booleanos(cursor.getString(21)),Booleanos(cursor.getString(22)),Booleanos(cursor.getString(23)),Booleanos(cursor.getString(24)),Booleanos(cursor.getString(25)),Booleanos(cursor.getString(26)),Booleanos(cursor.getString(27)),String.valueOf(cursor.getString(28)));
	return tipo;
	}
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}

	
	public long insertEnfResp002(EnfResp002 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();	
	values.put("caso_id",tipo.getcaso_id());
	values.put("ISNB",tipo.getISNB());
	values.put("ISNBcomiezorep",tipo.getISNBcomiezorep());
	values.put("ISNBfiebre",tipo.getISNBfiebre());
	values.put("ISNBescalofrios",tipo.getISNBescalofrios());
	values.put("ISNBmalestargen",tipo.getISNBmalestargen());
	values.put("ISNBmialgias",tipo.getISNBmialgias());
	values.put("ISNBdolorp",tipo.getISNBdolorp());
	values.put("ISNBtaquipnea",tipo.getISNBtaquipnea());
	values.put("ISNBtoscesp",tipo.getISNBtoscesp());
	values.put("ISNBvomitos",tipo.getISNBvomitos());
	values.put("ISNBconvulciones",tipo.getISNBconvulciones());
	values.put("ISNBsatoxigeno",tipo.getISNBsatoxigeno());
	values.put("ISNBotros",tipo.getISNBotros());
	values.put("IOIB",tipo.getIOIB());
	values.put("IOIB_SNPbronquitisaguda",tipo.getIOIB_SNPbronquitisaguda());
	values.put("IOIB_SNPbronconeumonia",tipo.getIOIB_SNPbronconeumonia());
	values.put("IOIB_SNPneumoniaviral",tipo.getIOIB_SNPneumoniaviral());
	values.put("IOIB_SNPneumoniainterst",tipo.getIOIB_SNPneumoniainterst());
	values.put("IOIB_SNPtraqueobronquitis",tipo.getIOIB_SNPtraqueobronquitis());
	values.put("IOIB_SNPbronquiolitis",tipo.getIOIB_SNPbronquiolitis());
	values.put("IOIB_SCepiglotitis",tipo.getIOIB_SCepiglotitis());
	values.put("IOIB_SClaringitis",tipo.getIOIB_SClaringitis());
	values.put("IOIB_SClaringotraqueobronq",tipo.getIOIB_SClaringotraqueobronq());
	values.put("IOIBsindromcoqueluchoide",tipo.getIOIBsindromcoqueluchoide());
	values.put("IOIBsindrominterpliquida",tipo.getIOIBsindrominterpliquida());
	values.put("IOIBsindrominterpgaseosa",tipo.getIOIBsindrominterpgaseosa());
	values.put("IAH",tipo.getIAH());
	values.put("IAHcual",tipo.getIAHcual());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("EnfResp002",values,"caso_id=?",args);
	}
	else
	{
		 id = db.insert("EnfResp002", null, values);
	}

	return id;
	}

}
