package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EIPK003 {
	
	private String caso_id;
	private boolean suero;
	private boolean sangre;
	private boolean lcr;
	private boolean humora;
	private boolean orina;
	private boolean liquidoa;
	private boolean garg;
	private boolean esputo;
	private boolean heces;
	private String exudado;
	private String tejido;
	private String lamina;
	private String cepa;
	private String fechamuestra;
	private boolean diagnostico;
	private boolean referencia;
	private String suero1;
	private String suero2;
	private boolean confirmat;
	private boolean referencia2;
	
	public EIPK003(){}
	public EIPK003(String caso_id,boolean suero,boolean sangre,boolean lcr,boolean humora,boolean orina,boolean liquidoa,boolean garg,boolean esputo,boolean heces,String exudado,String tejido,String lamina,String cepa,String fechamuestra,boolean diagnostico,boolean referencia,String suero1,String suero2,boolean confirmat,boolean referencia2)
	{
	this.caso_id=caso_id;
	this.suero=suero;
	this.sangre=sangre;
	this.lcr=lcr;
	this.humora=humora;
	this.orina=orina;
	this.liquidoa=liquidoa;
	this.garg=garg;
	this.esputo=esputo;
	this.heces=heces;
	this.exudado=exudado;
	this.tejido=tejido;
	this.lamina=lamina;
	this.cepa=cepa;
	this.fechamuestra=fechamuestra;
	this.diagnostico=diagnostico;
	this.referencia=referencia;
	this.suero1=suero1;
	this.suero2=suero2;
	this.confirmat=confirmat;
	this.referencia2=referencia2;

	}
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public boolean getsuero()
	{
	return suero;
	}
	public void setsuero(boolean suero)
	{
	this.suero=suero;
	}
	public boolean getsangre()
	{
	return sangre;
	}
	public void setsangre(boolean sangre)
	{
	this.sangre=sangre;
	}
	public boolean getlcr()
	{
	return lcr;
	}
	public void setlcr(boolean lcr)
	{
	this.lcr=lcr;
	}
	public boolean gethumora()
	{
	return humora;
	}
	public void sethumora(boolean humora)
	{
	this.humora=humora;
	}
	public boolean getorina()
	{
	return orina;
	}
	public void setorina(boolean orina)
	{
	this.orina=orina;
	}
	public boolean getliquidoa()
	{
	return liquidoa;
	}
	public void setliquidoa(boolean liquidoa)
	{
	this.liquidoa=liquidoa;
	}
	public boolean getgarg()
	{
	return garg;
	}
	public void setgarg(boolean garg)
	{
	this.garg=garg;
	}
	public boolean getesputo()
	{
	return esputo;
	}
	public void setesputo(boolean esputo)
	{
	this.esputo=esputo;
	}
	public boolean getheces()
	{
	return heces;
	}
	public void setheces(boolean heces)
	{
	this.heces=heces;
	}
	public String getexudado()
	{
	return exudado;
	}
	public void setexudado(String exudado)
	{
	this.exudado=exudado;
	}
	public String gettejido()
	{
	return tejido;
	}
	public void settejido(String tejido)
	{
	this.tejido=tejido;
	}
	public String getlamina()
	{
	return lamina;
	}
	public void setlamina(String lamina)
	{
	this.lamina=lamina;
	}
	public String getcepa()
	{
	return cepa;
	}
	public void setcepa(String cepa)
	{
	this.cepa=cepa;
	}
	public String getfechamuestra()
	{
	return fechamuestra;
	}
	public void setfechamuestra(String fechamuestra)
	{
	this.fechamuestra=fechamuestra;
	}
	public boolean getdiagnostico()
	{
	return diagnostico;
	}
	public void setdiagnostico(boolean diagnostico)
	{
	this.diagnostico=diagnostico;
	}
	public boolean getreferencia()
	{
	return referencia;
	}
	public void setreferencia(boolean referencia)
	{
	this.referencia=referencia;
	}
	public String getsuero1()
	{
	return suero1;
	}
	public void setsuero1(String suero1)
	{
	this.suero1=suero1;
	}
	public String getsuero2()
	{
	return suero2;
	}
	public void setsuero2(String suero2)
	{
	this.suero2=suero2;
	}
	public boolean getconfirmat()
	{
	return confirmat;
	}
	public void setconfirmat(boolean confirmat)
	{
	this.confirmat=confirmat;
	}
	public boolean getreferencia2()
	{
	return referencia2;
	}
	public void setreferencia2(boolean referencia2)
	{
	this.referencia2=referencia2;
	}
	
	public String Crear()
	{
		return "CREATE TABLE EIPK003 (caso_id INTEGER PRIMARY KEY ,suero boolean, sangre boolean, lcr boolean, humora boolean, orina boolean, liquidoa boolean, garg boolean, esputo boolean, heces boolean, exudado TEXT, tejido TEXT, lamina TEXT, cepa TEXT, fechamuestra TEXT, diagnostico boolean, referencia boolean, suero1 TEXT, suero2 TEXT, confirmat boolean, referencia2 boolean)";
	}
	
	public long insertEIPK003(EIPK003 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getcaso_id());
	values.put("suero",tipo.getsuero());
	values.put("sangre",tipo.getsangre());
	values.put("lcr",tipo.getlcr());
	values.put("humora",tipo.gethumora());
	values.put("orina",tipo.getorina());
	values.put("liquidoa",tipo.getliquidoa());
	values.put("garg",tipo.getgarg());
	values.put("esputo",tipo.getesputo());
	values.put("heces",tipo.getheces());
	values.put("exudado",tipo.getexudado());
	values.put("tejido",tipo.gettejido());
	values.put("lamina",tipo.getlamina());
	values.put("cepa",tipo.getcepa());
	values.put("fechamuestra",tipo.getfechamuestra());
	values.put("diagnostico",tipo.getdiagnostico());
	values.put("referencia",tipo.getreferencia());
	values.put("suero1",tipo.getsuero1());
	values.put("suero2",tipo.getsuero2());
	values.put("confirmat",tipo.getconfirmat());
	values.put("referencia2",tipo.getreferencia2());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("EIPK003",values,"caso_id=?",args);
	}
	else
	{
	 id = db.insert("EIPK003", null, values);
	}
	
	return id;

	}
	
	public EIPK003 selectEIPK003(String caso_id,SQLiteDatabase db)
	{
	EIPK003 tipo=null;
	Cursor cursor=db.query("EIPK003" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new EIPK003(cursor.getString(0),Booleanos(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),Booleanos(cursor.getString(6)),Booleanos(cursor.getString(7)),Booleanos(cursor.getString(8)),Booleanos(cursor.getString(9)),cursor.getString(10),cursor.getString(11),cursor.getString(12),cursor.getString(13),cursor.getString(14),Booleanos(cursor.getString(15)),Booleanos(cursor.getString(16)),cursor.getString(17),cursor.getString(18),Booleanos(cursor.getString(19)),Booleanos(cursor.getString(20)));
	return tipo;
	}
	
	
	
	
	
	public boolean Booleanos(String x)
	{
		if(x.equals("1"))
			return true;
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


}
