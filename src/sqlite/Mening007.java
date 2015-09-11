package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Mening007 {

	private String IdCaso;
	private boolean eniCasoSospechoso;
	private boolean eniCasoProbable;
	private boolean eniDescartado;
	private boolean eniInadecuadamenteInv;
	private boolean eniHInfluenzae;
	private boolean eniSpneumoniae;
	private boolean eniNmeningitidis;
	private String eniOtra;
	private String eniSerotipoSubtipo;
	private boolean iniBacteriemia;
	private boolean iniSepsis;
	private boolean iniSepsisSevera;
	private boolean iniSockSeptico;
	
	public Mening007(){}
	public Mening007(String IdCaso,boolean eniCasoSospechoso,boolean eniCasoProbable,boolean eniDescartado,boolean eniInadecuadamenteInv,boolean eniHInfluenzae,boolean eniSpneumoniae,boolean eniNmeningitidis,String eniOtra,String eniSerotipoSubtipo,boolean iniBacteriemia,boolean iniSepsis,boolean iniSepsisSevera,boolean iniSockSeptico)
	{
	this.IdCaso=IdCaso;
	this.eniCasoSospechoso=eniCasoSospechoso;
	this.eniCasoProbable=eniCasoProbable;
	this.eniDescartado=eniDescartado;
	this.eniInadecuadamenteInv=eniInadecuadamenteInv;
	this.eniHInfluenzae=eniHInfluenzae;
	this.eniSpneumoniae=eniSpneumoniae;
	this.eniNmeningitidis=eniNmeningitidis;
	this.eniOtra=eniOtra;
	this.eniSerotipoSubtipo=eniSerotipoSubtipo;
	this.iniBacteriemia=iniBacteriemia;
	this.iniSepsis=iniSepsis;
	this.iniSepsisSevera=iniSepsisSevera;
	this.iniSockSeptico=iniSockSeptico;

	}
	

public String getIdCaso()
{
return IdCaso;
}
public void setIdCaso(String IdCaso)
{
this.IdCaso=IdCaso;
}
public boolean geteniCasoSospechoso()
{
return eniCasoSospechoso;
}
public void seteniCasoSospechoso(boolean eniCasoSospechoso)
{
this.eniCasoSospechoso=eniCasoSospechoso;
}
public boolean geteniCasoProbable()
{
return eniCasoProbable;
}
public void seteniCasoProbable(boolean eniCasoProbable)
{
this.eniCasoProbable=eniCasoProbable;
}
public boolean geteniDescartado()
{
return eniDescartado;
}
public void seteniDescartado(boolean eniDescartado)
{
this.eniDescartado=eniDescartado;
}
public boolean geteniInadecuadamenteInv()
{
return eniInadecuadamenteInv;
}
public void seteniInadecuadamenteInv(boolean eniInadecuadamenteInv)
{
this.eniInadecuadamenteInv=eniInadecuadamenteInv;
}
public boolean geteniHInfluenzae()
{
return eniHInfluenzae;
}
public void seteniHInfluenzae(boolean eniHInfluenzae)
{
this.eniHInfluenzae=eniHInfluenzae;
}
public boolean geteniSpneumoniae()
{
return eniSpneumoniae;
}
public void seteniSpneumoniae(boolean eniSpneumoniae)
{
this.eniSpneumoniae=eniSpneumoniae;
}
public boolean geteniNmeningitidis()
{
return eniNmeningitidis;
}
public void seteniNmeningitidis(boolean eniNmeningitidis)
{
this.eniNmeningitidis=eniNmeningitidis;
}
public String geteniOtra()
{
return eniOtra;
}
public void seteniOtra(String eniOtra)
{
this.eniOtra=eniOtra;
}
public String geteniSerotipoSubtipo()
{
return eniSerotipoSubtipo;
}
public void seteniSerotipoSubtipo(String eniSerotipoSubtipo)
{
this.eniSerotipoSubtipo=eniSerotipoSubtipo;
}
public boolean getiniBacteriemia()
{
return iniBacteriemia;
}
public void setiniBacteriemia(boolean iniBacteriemia)
{
this.iniBacteriemia=iniBacteriemia;
}
public boolean getiniSepsis()
{
return iniSepsis;
}
public void setiniSepsis(boolean iniSepsis)
{
this.iniSepsis=iniSepsis;
}
public boolean getiniSepsisSevera()
{
return iniSepsisSevera;
}
public void setiniSepsisSevera(boolean iniSepsisSevera)
{
this.iniSepsisSevera=iniSepsisSevera;
}
public boolean getiniSockSeptico()
{
return iniSockSeptico;
}
public void setiniSockSeptico(boolean iniSockSeptico)
{
this.iniSockSeptico=iniSockSeptico;
}

	
	public String Crear()
	{
		return "CREATE TABLE Mening007 (caso_id INTEGER, eniCasoSospechoso boolean, eniCasoProbable boolean, eniDescartado boolean,"
				+ " eniInadecuadamenteInv boolean, eniHInfluenzae boolean, eniSpneumoniae boolean, eniNmeningitidis boolean, eniOtra TEXT,"
				+ " eniSerotipoSubtipo TEXT, iniBacteriemia boolean, iniSepsis boolean, iniSepsisSevera boolean, iniSockSeptico boolean)";
	}
	
	public long insertMening007(Mening007 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getIdCaso());
	values.put("eniCasoSospechoso",tipo.geteniCasoSospechoso());
	values.put("eniCasoProbable",tipo.geteniCasoProbable());
	values.put("eniDescartado",tipo.geteniDescartado());
	values.put("eniInadecuadamenteInv",tipo.geteniInadecuadamenteInv());
	values.put("eniHInfluenzae",tipo.geteniHInfluenzae());
	values.put("eniSpneumoniae",tipo.geteniSpneumoniae());
	values.put("eniNmeningitidis",tipo.geteniNmeningitidis());
	values.put("eniOtra",tipo.geteniOtra());
	values.put("eniSerotipoSubtipo",tipo.geteniSerotipoSubtipo());
	values.put("iniBacteriemia",tipo.getiniBacteriemia());
	values.put("iniSepsis",tipo.getiniSepsis());
	values.put("iniSepsisSevera",tipo.getiniSepsisSevera());
	values.put("iniSockSeptico",tipo.getiniSockSeptico());
	 long id=0;		
		if(act)
		{
			String[] args = new String[] {caso_id};		
		     id = db.update("Mening007",values,"caso_id=?",args);
		}
		else
		{
			id = db.insert("Mening007", null, values);
		}
		 return id;
	}
	
	public Mening007 selectMening007(String caso_id,SQLiteDatabase db)
	{
	Mening007 tipo=null;
	Cursor cursor=db.query("Mening007" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new Mening007(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),Booleanos(cursor.getString(6)),Booleanos(cursor.getString(7)),String.valueOf(cursor.getString(8)),String.valueOf(cursor.getString(9)),Booleanos(cursor.getString(10)),Booleanos(cursor.getString(11)),Booleanos(cursor.getString(12)),Booleanos(cursor.getString(13)));
	return tipo;
	}
	
	
	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}
	
}
