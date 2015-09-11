package sqlite;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Aps004 {
	
	private String idCaso;
	private boolean ECCurado;
	private String FechaCurado;
	private boolean RefHosp;
	private String FechaRefHosp;
	
	public Aps004(){}
	public Aps004(String idCaso,boolean ECCurado,String FechaCurado,boolean RefHosp,String FechaRefHosp)
	{
	this.idCaso=idCaso;
	this.ECCurado=ECCurado;
	this.FechaCurado=FechaCurado;
	this.RefHosp=RefHosp;
	this.FechaRefHosp=FechaRefHosp;

	}
	

public String getidCaso()
{
return idCaso;
}
public void setidCaso(String idCaso)
{
this.idCaso=idCaso;
}
public boolean getECCurado()
{
return ECCurado;
}
public void setECCurado(boolean ECCurado)
{
this.ECCurado=ECCurado;
}
public String getFechaCurado()
{
return FechaCurado;
}
public void setFechaCurado(String FechaCurado)
{
this.FechaCurado=FechaCurado;
}
public boolean getRefHosp()
{
return RefHosp;
}
public void setRefHosp(boolean RefHosp)
{
this.RefHosp=RefHosp;
}
public String getFechaRefHosp()
{
return FechaRefHosp;
}
public void setFechaRefHosp(String FechaRefHosp)
{
this.FechaRefHosp=FechaRefHosp;
}

public String Crear()
{
   return "CREATE TABLE Aps004 (caso_id INTEGER PRIMARY KEY, ECCurado boolean, FechaCurado TEXT, RefHosp boolean, FechaRefHosp TEXT)";
   		
} 
	
public long insertAps004(Aps004 tipo, SQLiteDatabase db,boolean act,String caso_id)
{
ContentValues values = new ContentValues();
values.put("caso_id",tipo.getidCaso());
values.put("ECCurado",tipo.getECCurado());
values.put("FechaCurado",tipo.getFechaCurado());
values.put("RefHosp",tipo.getRefHosp());
values.put("FechaRefHosp",tipo.getFechaRefHosp());
long id=0;
if(act)
{
	String[] args = new String[] {caso_id};		
     id = db.update("Aps004",values,"caso_id=?",args);
}
else
{
	id = db.insert("Aps004", null, values);
}

return id;

}

public Aps004 selectAps004(String caso_id,SQLiteDatabase db)
{
Aps004 tipo=null;
Cursor cursor=db.query("Aps004" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
cursor.moveToFirst();
tipo=new Aps004(String.valueOf(cursor.getString(0)),Booleanos(cursor.getString(1)),String.valueOf(cursor.getString(2)),Booleanos(cursor.getString(3)),String.valueOf(cursor.getString(4)));
return tipo;
}

public boolean Booleanos(String x)
{
	if(x.equals("0"))
		return false;
	return true;
}


}
