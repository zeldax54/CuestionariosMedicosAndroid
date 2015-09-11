package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class Mening005 {

	private String IdCaso;
	private boolean tmExamenLiquidoCefalorr;
	private boolean tmPruebasDirectas;
	private String tmFechaTomaPruebasDir;
	private boolean tmCultivo;
	private boolean tmSangreHemocult;
	private String tmFechaTomaCultivo;
	private boolean rExamenDirectoLCR;
	private boolean positivolcr;
	private boolean rExamenDirectoPetequias;
	private boolean positivoPTquias;
	private boolean rCultivoLCR;
	private boolean positivo_LCR;
	private boolean rHemocultivo;
	private boolean positHemocult;
	private boolean rCultivoPetequias;
	private boolean positivoCPetequias;
	private boolean rLatex;
	private boolean positivoLatex;
	private boolean aNM;
	private String aNM_serogrupo;
	private String aNM_serotipo;
	private String aNM_subtipo;
	private String aNM_inmunotipo;
	private boolean aHinfluenzae;
	private String aHinfluenzae_biotipo;
	private String aHinfluenzae_subtipo;
	private boolean aSPneumoniae;
	private String aSPneumoniae_serotipo;
	private String aOtra;
	private boolean aNinguna;
	private String aFechaResultado;
	
	private String Susceptibilidad;
	private String Metodo;
	private String Fechasuscept;
	
	public Mening005(){}
	public Mening005(String IdCaso,boolean tmExamenLiquidoCefalorr,boolean tmPruebasDirectas,String tmFechaTomaPruebasDir,boolean tmCultivo,boolean tmSangreHemocult,String tmFechaTomaCultivo,boolean rExamenDirectoLCR,boolean positivolcr,boolean rExamenDirectoPetequias,boolean positivoPTquias,boolean rCultivoLCR,boolean positivo_LCR,boolean rHemocultivo,boolean positHemocult,boolean rCultivoPetequias,boolean positivoCPetequias,boolean rLatex,boolean positivoLatex,boolean aNM,String aNM_serogrupo,String aNM_serotipo,String aNM_subtipo,String aNM_inmunotipo,boolean aHinfluenzae,String aHinfluenzae_biotipo,String aHinfluenzae_subtipo,boolean aSPneumoniae,String aSPneumoniae_serotipo,String aOtra,boolean aNinguna,String aFechaResultado,String Susceptibilidad,String Metodo,String Fechasuscept)
	{
	this.IdCaso=IdCaso;
	this.tmExamenLiquidoCefalorr=tmExamenLiquidoCefalorr;
	this.tmPruebasDirectas=tmPruebasDirectas;
	this.tmFechaTomaPruebasDir=tmFechaTomaPruebasDir;
	this.tmCultivo=tmCultivo;
	this.tmSangreHemocult=tmSangreHemocult;
	this.tmFechaTomaCultivo=tmFechaTomaCultivo;
	this.rExamenDirectoLCR=rExamenDirectoLCR;
	this.positivolcr=positivolcr;
	this.rExamenDirectoPetequias=rExamenDirectoPetequias;
	this.positivoPTquias=positivoPTquias;
	this.rCultivoLCR=rCultivoLCR;
	this.positivo_LCR=positivo_LCR;
	this.rHemocultivo=rHemocultivo;
	this.positHemocult=positHemocult;
	this.rCultivoPetequias=rCultivoPetequias;
	this.positivoCPetequias=positivoCPetequias;
	this.rLatex=rLatex;
	this.positivoLatex=positivoLatex;
	this.aNM=aNM;
	this.aNM_serogrupo=aNM_serogrupo;
	this.aNM_serotipo=aNM_serotipo;
	this.aNM_subtipo=aNM_subtipo;
	this.aNM_inmunotipo=aNM_inmunotipo;
	this.aHinfluenzae=aHinfluenzae;
	this.aHinfluenzae_biotipo=aHinfluenzae_biotipo;
	this.aHinfluenzae_subtipo=aHinfluenzae_subtipo;
	this.aSPneumoniae=aSPneumoniae;
	this.aSPneumoniae_serotipo=aSPneumoniae_serotipo;
	this.aOtra=aOtra;
	this.aNinguna=aNinguna;
	this.aFechaResultado=aFechaResultado;
	this.Susceptibilidad=Susceptibilidad;
	this.Metodo=Metodo;
	this.Fechasuscept=Fechasuscept;

	}
	

public String getSusceptibilidad()
{
return Susceptibilidad;
}
public void setSusceptibilidad(String Susceptibilidad)
{
this.Susceptibilidad=Susceptibilidad;
}
public String getMetodo()
{
return Metodo;
}
public void setMetodo(String Metodo)
{
this.Metodo=Metodo;
}
public String getFechasuscept()
{
return Fechasuscept;
}
public void setFechasuscept(String Fechasuscept)
{
this.Fechasuscept=Fechasuscept;
}

	public String getIdCaso()
	{
	return IdCaso;
	}
	public void setIdCaso(String IdCaso)
	{
	this.IdCaso=IdCaso;
	}
	public boolean gettmExamenLiquidoCefalorr()
	{
	return tmExamenLiquidoCefalorr;
	}
	public void settmExamenLiquidoCefalorr(boolean tmExamenLiquidoCefalorr)
	{
	this.tmExamenLiquidoCefalorr=tmExamenLiquidoCefalorr;
	}
	public boolean gettmPruebasDirectas()
	{
	return tmPruebasDirectas;
	}
	public void settmPruebasDirectas(boolean tmPruebasDirectas)
	{
	this.tmPruebasDirectas=tmPruebasDirectas;
	}
	public String gettmFechaTomaPruebasDir()
	{
	return tmFechaTomaPruebasDir;
	}
	public void settmFechaTomaPruebasDir(String tmFechaTomaPruebasDir)
	{
	this.tmFechaTomaPruebasDir=tmFechaTomaPruebasDir;
	}
	public boolean gettmCultivo()
	{
	return tmCultivo;
	}
	public void settmCultivo(boolean tmCultivo)
	{
	this.tmCultivo=tmCultivo;
	}
	public boolean gettmSangreHemocult()
	{
	return tmSangreHemocult;
	}
	public void settmSangreHemocult(boolean tmSangreHemocult)
	{
	this.tmSangreHemocult=tmSangreHemocult;
	}
	public String gettmFechaTomaCultivo()
	{
	return tmFechaTomaCultivo;
	}
	public void settmFechaTomaCultivo(String tmFechaTomaCultivo)
	{
	this.tmFechaTomaCultivo=tmFechaTomaCultivo;
	}
	public boolean getrExamenDirectoLCR()
	{
	return rExamenDirectoLCR;
	}
	public void setrExamenDirectoLCR(boolean rExamenDirectoLCR)
	{
	this.rExamenDirectoLCR=rExamenDirectoLCR;
	}
	public boolean getpositivolcr()
	{
	return positivolcr;
	}
	public void setpositivolcr(boolean positivolcr)
	{
	this.positivolcr=positivolcr;
	}
	public boolean getrExamenDirectoPetequias()
	{
	return rExamenDirectoPetequias;
	}
	public void setrExamenDirectoPetequias(boolean rExamenDirectoPetequias)
	{
	this.rExamenDirectoPetequias=rExamenDirectoPetequias;
	}
	public boolean getpositivoPTquias()
	{
	return positivoPTquias;
	}
	public void setpositivoPTquias(boolean positivoPTquias)
	{
	this.positivoPTquias=positivoPTquias;
	}
	public boolean getrCultivoLCR()
	{
	return rCultivoLCR;
	}
	public void setrCultivoLCR(boolean rCultivoLCR)
	{
	this.rCultivoLCR=rCultivoLCR;
	}
	public boolean getpositivo_LCR()
	{
	return positivo_LCR;
	}
	public void setpositivo_LCR(boolean positivo_LCR)
	{
	this.positivo_LCR=positivo_LCR;
	}
	public boolean getrHemocultivo()
	{
	return rHemocultivo;
	}
	public void setrHemocultivo(boolean rHemocultivo)
	{
	this.rHemocultivo=rHemocultivo;
	}
	public boolean getpositHemocult()
	{
	return positHemocult;
	}
	public void setpositHemocult(boolean positHemocult)
	{
	this.positHemocult=positHemocult;
	}
	public boolean getrCultivoPetequias()
	{
	return rCultivoPetequias;
	}
	public void setrCultivoPetequias(boolean rCultivoPetequias)
	{
	this.rCultivoPetequias=rCultivoPetequias;
	}
	public boolean getpositivoCPetequias()
	{
	return positivoCPetequias;
	}
	public void setpositivoCPetequias(boolean positivoCPetequias)
	{
	this.positivoCPetequias=positivoCPetequias;
	}
	public boolean getrLatex()
	{
	return rLatex;
	}
	public void setrLatex(boolean rLatex)
	{
	this.rLatex=rLatex;
	}
	public boolean getpositivoLatex()
	{
	return positivoLatex;
	}
	public void setpositivoLatex(boolean positivoLatex)
	{
	this.positivoLatex=positivoLatex;
	}
	public boolean getaNM()
	{
	return aNM;
	}
	public void setaNM(boolean aNM)
	{
	this.aNM=aNM;
	}
	public String getaNM_serogrupo()
	{
	return aNM_serogrupo;
	}
	public void setaNM_serogrupo(String aNM_serogrupo)
	{
	this.aNM_serogrupo=aNM_serogrupo;
	}
	public String getaNM_serotipo()
	{
	return aNM_serotipo;
	}
	public void setaNM_serotipo(String aNM_serotipo)
	{
	this.aNM_serotipo=aNM_serotipo;
	}
	public String getaNM_subtipo()
	{
	return aNM_subtipo;
	}
	public void setaNM_subtipo(String aNM_subtipo)
	{
	this.aNM_subtipo=aNM_subtipo;
	}
	public String getaNM_inmunotipo()
	{
	return aNM_inmunotipo;
	}
	public void setaNM_inmunotipo(String aNM_inmunotipo)
	{
	this.aNM_inmunotipo=aNM_inmunotipo;
	}
	public boolean getaHinfluenzae()
	{
	return aHinfluenzae;
	}
	public void setaHinfluenzae(boolean aHinfluenzae)
	{
	this.aHinfluenzae=aHinfluenzae;
	}
	public String getaHinfluenzae_biotipo()
	{
	return aHinfluenzae_biotipo;
	}
	public void setaHinfluenzae_biotipo(String aHinfluenzae_biotipo)
	{
	this.aHinfluenzae_biotipo=aHinfluenzae_biotipo;
	}
	public String getaHinfluenzae_subtipo()
	{
	return aHinfluenzae_subtipo;
	}
	public void setaHinfluenzae_subtipo(String aHinfluenzae_subtipo)
	{
	this.aHinfluenzae_subtipo=aHinfluenzae_subtipo;
	}
	public boolean getaSPneumoniae()
	{
	return aSPneumoniae;
	}
	public void setaSPneumoniae(boolean aSPneumoniae)
	{
	this.aSPneumoniae=aSPneumoniae;
	}
	public String getaSPneumoniae_serotipo()
	{
	return aSPneumoniae_serotipo;
	}
	public void setaSPneumoniae_serotipo(String aSPneumoniae_serotipo)
	{
	this.aSPneumoniae_serotipo=aSPneumoniae_serotipo;
	}
	public String getaOtra()
	{
	return aOtra;
	}
	public void setaOtra(String aOtra)
	{
	this.aOtra=aOtra;
	}
	public boolean getaNinguna()
	{
	return aNinguna;
	}
	public void setaNinguna(boolean aNinguna)
	{
	this.aNinguna=aNinguna;
	}
	public String getaFechaResultado()
	{
	return aFechaResultado;
	}
	public void setaFechaResultado(String aFechaResultado)
	{
	this.aFechaResultado=aFechaResultado;
	}


	public String Crear()
	{
       return "CREATE TABLE Mening005 (caso_id INTEGER PRIMARY KEY AUTOINCREMENT, "
       		+ "tmExamenLiquidoCefalorr boolean, tmPruebasDirectas boolean, "
       		+ "tmFechaTomaPruebasDir TEXT, tmCultivo boolean, tmSangreHemocult boolean, "
       		+ "tmFechaTomaCultivo TEXT, rExamenDirectoLCR boolean, positivolcr boolean, "
       		+ "rExamenDirectoPetequias boolean, positivoPTquias boolean, rCultivoLCR boolean,"
       		+ " positivo_LCR boolean, rHemocultivo boolean, positHemocult boolean, "
       		+ "rCultivoPetequias boolean, positivoCPetequias boolean, rLatex boolean, "
       		+ "positivoLatex boolean, aNM boolean, aNM_serogrupo TEXT, aNM_serotipo TEXT, "
       		+ "aNM_subtipo TEXT, aNM_inmunotipo TEXT, aHinfluenzae boolean, aHinfluenzae_biotipo TEXT, "
       		+ "aHinfluenzae_subtipo TEXT, aSPneumoniae boolean, aSPneumoniae_serotipo TEXT,"
       		+ " aOtra TEXT, aNinguna boolean, aFechaResultado TEXT,Susceptibilidad TEXT,Metodo TEXT,Fechasuscept TEXT)";
	}
	
	
	public long insertMening005(Mening005 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getIdCaso());
	values.put("tmExamenLiquidoCefalorr",tipo.gettmExamenLiquidoCefalorr());
	values.put("tmPruebasDirectas",tipo.gettmPruebasDirectas());
	values.put("tmFechaTomaPruebasDir",tipo.gettmFechaTomaPruebasDir().toString());
	values.put("tmCultivo",tipo.gettmCultivo());
	values.put("tmSangreHemocult",tipo.gettmSangreHemocult());
	values.put("tmFechaTomaCultivo",tipo.gettmFechaTomaCultivo().toString());
	values.put("rExamenDirectoLCR",tipo.getrExamenDirectoLCR());
	values.put("positivolcr",tipo.getpositivolcr());
	values.put("rExamenDirectoPetequias",tipo.getrExamenDirectoPetequias());
	values.put("positivoPTquias",tipo.getpositivoPTquias());
	values.put("rCultivoLCR",tipo.getrCultivoLCR());
	values.put("positivo_LCR",tipo.getpositivo_LCR());
	values.put("rHemocultivo",tipo.getrHemocultivo());
	values.put("positHemocult",tipo.getpositHemocult());
	values.put("rCultivoPetequias",tipo.getrCultivoPetequias());
	values.put("positivoCPetequias",tipo.getpositivoCPetequias());
	values.put("rLatex",tipo.getrLatex());
	values.put("positivoLatex",tipo.getpositivoLatex());
	values.put("aNM",tipo.getaNM());
	values.put("aNM_serogrupo",tipo.getaNM_serogrupo());
	values.put("aNM_serotipo",tipo.getaNM_serotipo());
	values.put("aNM_subtipo",tipo.getaNM_subtipo());
	values.put("aNM_inmunotipo",tipo.getaNM_inmunotipo());
	values.put("aHinfluenzae",tipo.getaHinfluenzae());
	values.put("aHinfluenzae_biotipo",tipo.getaHinfluenzae_biotipo());
	values.put("aHinfluenzae_subtipo",tipo.getaHinfluenzae_subtipo());
	values.put("aSPneumoniae",tipo.getaSPneumoniae());
	values.put("aSPneumoniae_serotipo",tipo.getaSPneumoniae_serotipo());
	values.put("aOtra",tipo.getaOtra());
	values.put("aNinguna",tipo.getaNinguna());
	values.put("aFechaResultado",tipo.getaFechaResultado().toString());
	values.put("Susceptibilidad",tipo.getSusceptibilidad());
	values.put("Metodo",tipo.getMetodo());
	values.put("Fechasuscept",tipo.getFechasuscept());
	
	long id=0;		
	   if(act)
		{
			String[] args = new String[] {caso_id};		
		     id = db.update("Mening005",values,"caso_id=?",args);
		}
		else
		{
			id = db.insert("Mening005", null, values);
		}
		 return id;
	
	}
	
	public Mening005 selectMening005(String caso_id,SQLiteDatabase db)
	{
	Mening005 tipo=null;
	Cursor cursor=db.query("Mening005" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new Mening005(cursor.getString(0),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),cursor.getString(3),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),cursor.getString(6),Booleanos(cursor.getString(7)),Booleanos(cursor.getString(8)),Booleanos(cursor.getString(9)),Booleanos(cursor.getString(10)),Booleanos(cursor.getString(11)),Booleanos(cursor.getString(12)),Booleanos(cursor.getString(13)),Booleanos(cursor.getString(14)),Booleanos(cursor.getString(15)),Booleanos(cursor.getString(16)),Booleanos(cursor.getString(17)),Booleanos(cursor.getString(18)),Booleanos(cursor.getString(19)),cursor.getString(20),cursor.getString(21),cursor.getString(22),cursor.getString(23),Booleanos(cursor.getString(24)),cursor.getString(25),cursor.getString(26),Booleanos(cursor.getString(27)),cursor.getString(28),cursor.getString(29),Booleanos(cursor.getString(30)),cursor.getString(31),cursor.getString(32),cursor.getString(33),cursor.getString(34));
	return tipo;
	}
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}

}
