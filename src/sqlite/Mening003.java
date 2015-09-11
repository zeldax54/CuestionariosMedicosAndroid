package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Mening003 {
	
	private String idCaso;
	private boolean MeningHInfluenzae;
	private boolean EnfermMening;
	private boolean MM;
	private boolean MC;
	private boolean MeninguitisViral;
	private String OtraEtiolog;
	
	public Mening003(){}
	public Mening003(String idCaso,boolean MeningHInfluenzae,boolean EnfermMening,boolean MM,boolean MC,boolean MeninguitisViral,String OtraEtiolog)
	{
	this.idCaso=idCaso;
	this.MeningHInfluenzae=MeningHInfluenzae;
	this.EnfermMening=EnfermMening;
	this.MM=MM;
	this.MC=MC;
	this.MeninguitisViral=MeninguitisViral;
	this.OtraEtiolog=OtraEtiolog;

	}
	
	public String getidCaso()
	{
	return idCaso;
	}
	public void setidCaso(String idCaso)
	{
	this.idCaso=idCaso;
	}
	public boolean getMeningHInfluenzae()
	{
	return MeningHInfluenzae;
	}
	public void setMeningHInfluenzae(boolean MeningHInfluenzae)
	{
	this.MeningHInfluenzae=MeningHInfluenzae;
	}
	public boolean getEnfermMening()
	{
	return EnfermMening;
	}
	public void setEnfermMening(boolean EnfermMening)
	{
	this.EnfermMening=EnfermMening;
	}
	public boolean getMM()
	{
	return MM;
	}
	public void setMM(boolean MM)
	{
	this.MM=MM;
	}
	public boolean getMC()
	{
	return MC;
	}
	public void setMC(boolean MC)
	{
	this.MC=MC;
	}
	public boolean getMeninguitisViral()
	{
	return MeninguitisViral;
	}
	public void setMeninguitisViral(boolean MeninguitisViral)
	{
	this.MeninguitisViral=MeninguitisViral;
	}
	public String getOtraEtiolog()
	{
	return OtraEtiolog;
	}
	public void setOtraEtiolog(String OtraEtiolog)
	{
	this.OtraEtiolog=OtraEtiolog;
	}
	
	public String Crear()
	{
       return "CREATE TABLE Mening003 (caso_id INTEGER PRIMARY KEY, MeningHInfluenzae boolean, EnfermMening boolean, MM boolean, MC boolean, MeninguitisViral boolean, OtraEtiolog text)";
	}
	
	public long insertMening003(Mening003 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getidCaso());
	values.put("MeningHInfluenzae",tipo.getMeningHInfluenzae());
	values.put("EnfermMening",tipo.getEnfermMening());
	values.put("MM",tipo.getMM());
	values.put("MC",tipo.getMC());
	values.put("MeninguitisViral",tipo.getMeninguitisViral());
	values.put("OtraEtiolog",tipo.getOtraEtiolog());
	
	
	 long id=0;
		
		if(act)
		{
			String[] args = new String[] {caso_id};		
		     id = db.update("Mening003",values,"caso_id=?",args);
		}
		else
		{
			id = db.insert("Mening003", null, values);
		}
		 return id;
	 
	 
	 

	}

	public Mening003 selectMening003(String caso_id,SQLiteDatabase db)
	{
	Mening003 tipo=null;
	Cursor cursor=db.query("Mening003" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new Mening003(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),String.valueOf(cursor.getString(6)));
	return tipo;
	}
	

	
	public boolean Booleanos(String x)
	{
		if(x.equals("0"))
			return false;
		return true;
	}

}
