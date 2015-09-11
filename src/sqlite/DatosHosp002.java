package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatosHosp002 {
	
	private String datos_id;
	private String TD;
	private String TD_M_Num;
	private String TD_M_Por;
	private String TD_F_Num;
	private String TD_F_Por;
	private String TD_Observ;
	private String TD_Irag;
	private String TD_IragPor;
	private String TD_NeumbacNum;
	private String TD_NeumonbactPor;
	private String TD_MeninbactNum;
	private String TD_MeninbactPor;
	private String TD_BacterNum;
	private String TD_BacterPor;
	private String TD_SepsisNum;
	private String TD_SepsisPor;
	private String TD_ShockNum;
	private String TD_ShockPor;
	private String TD_InfeccNum;
	private String TD_InfeccPor;
	
	public DatosHosp002(){}
	public DatosHosp002(String datos_id,String TD,String TD_M_Num,String TD_M_Por,String TD_F_Num,String TD_F_Por,String TD_Observ,String TD_Irag,String TD_IragPor,String TD_NeumbacNum,String TD_NeumonbactPor,String TD_MeninbactNum,String TD_MeninbactPor,String TD_BacterNum,String TD_BacterPor,String TD_SepsisNum,String TD_SepsisPor,String TD_ShockNum,String TD_ShockPor,String TD_InfeccNum,String TD_InfeccPor)
	{
	this.datos_id=datos_id;
	this.TD=TD;
	this.TD_M_Num=TD_M_Num;
	this.TD_M_Por=TD_M_Por;
	this.TD_F_Num=TD_F_Num;
	this.TD_F_Por=TD_F_Por;
	this.TD_Observ=TD_Observ;
	this.TD_Irag=TD_Irag;
	this.TD_IragPor=TD_IragPor;
	this.TD_NeumbacNum=TD_NeumbacNum;
	this.TD_NeumonbactPor=TD_NeumonbactPor;
	this.TD_MeninbactNum=TD_MeninbactNum;
	this.TD_MeninbactPor=TD_MeninbactPor;
	this.TD_BacterNum=TD_BacterNum;
	this.TD_BacterPor=TD_BacterPor;
	this.TD_SepsisNum=TD_SepsisNum;
	this.TD_SepsisPor=TD_SepsisPor;
	this.TD_ShockNum=TD_ShockNum;
	this.TD_ShockPor=TD_ShockPor;
	this.TD_InfeccNum=TD_InfeccNum;
	this.TD_InfeccPor=TD_InfeccPor;

	}
	
	public String getdatos_id()
	{
	return datos_id;
	}
	public void setdatos_id(String datos_id)
	{
	this.datos_id=datos_id;
	}
	public String getTD()
	{
	return TD;
	}
	public void setTD(String TD)
	{
	this.TD=TD;
	}
	public String getTD_M_Num()
	{
	return TD_M_Num;
	}
	public void setTD_M_Num(String TD_M_Num)
	{
	this.TD_M_Num=TD_M_Num;
	}
	public String getTD_M_Por()
	{
	return TD_M_Por;
	}
	public void setTD_M_Por(String TD_M_Por)
	{
	this.TD_M_Por=TD_M_Por;
	}
	public String getTD_F_Num()
	{
	return TD_F_Num;
	}
	public void setTD_F_Num(String TD_F_Num)
	{
	this.TD_F_Num=TD_F_Num;
	}
	public String getTD_F_Por()
	{
	return TD_F_Por;
	}
	public void setTD_F_Por(String TD_F_Por)
	{
	this.TD_F_Por=TD_F_Por;
	}
	public String getTD_Observ()
	{
	return TD_Observ;
	}
	public void setTD_Observ(String TD_Observ)
	{
	this.TD_Observ=TD_Observ;
	}
	public String getTD_Irag()
	{
	return TD_Irag;
	}
	public void setTD_Irag(String TD_Irag)
	{
	this.TD_Irag=TD_Irag;
	}
	public String getTD_IragPor()
	{
	return TD_IragPor;
	}
	public void setTD_IragPor(String TD_IragPor)
	{
	this.TD_IragPor=TD_IragPor;
	}
	public String getTD_NeumbacNum()
	{
	return TD_NeumbacNum;
	}
	public void setTD_NeumbacNum(String TD_NeumbacNum)
	{
	this.TD_NeumbacNum=TD_NeumbacNum;
	}
	public String getTD_NeumonbactPor()
	{
	return TD_NeumonbactPor;
	}
	public void setTD_NeumonbactPor(String TD_NeumonbactPor)
	{
	this.TD_NeumonbactPor=TD_NeumonbactPor;
	}
	public String getTD_MeninbactNum()
	{
	return TD_MeninbactNum;
	}
	public void setTD_MeninbactNum(String TD_MeninbactNum)
	{
	this.TD_MeninbactNum=TD_MeninbactNum;
	}
	public String getTD_MeninbactPor()
	{
	return TD_MeninbactPor;
	}
	public void setTD_MeninbactPor(String TD_MeninbactPor)
	{
	this.TD_MeninbactPor=TD_MeninbactPor;
	}
	public String getTD_BacterNum()
	{
	return TD_BacterNum;
	}
	public void setTD_BacterNum(String TD_BacterNum)
	{
	this.TD_BacterNum=TD_BacterNum;
	}
	public String getTD_BacterPor()
	{
	return TD_BacterPor;
	}
	public void setTD_BacterPor(String TD_BacterPor)
	{
	this.TD_BacterPor=TD_BacterPor;
	}
	public String getTD_SepsisNum()
	{
	return TD_SepsisNum;
	}
	public void setTD_SepsisNum(String TD_SepsisNum)
	{
	this.TD_SepsisNum=TD_SepsisNum;
	}
	public String getTD_SepsisPor()
	{
	return TD_SepsisPor;
	}
	public void setTD_SepsisPor(String TD_SepsisPor)
	{
	this.TD_SepsisPor=TD_SepsisPor;
	}
	public String getTD_ShockNum()
	{
	return TD_ShockNum;
	}
	public void setTD_ShockNum(String TD_ShockNum)
	{
	this.TD_ShockNum=TD_ShockNum;
	}
	public String getTD_ShockPor()
	{
	return TD_ShockPor;
	}
	public void setTD_ShockPor(String TD_ShockPor)
	{
	this.TD_ShockPor=TD_ShockPor;
	}
	public String getTD_InfeccNum()
	{
	return TD_InfeccNum;
	}
	public void setTD_InfeccNum(String TD_InfeccNum)
	{
	this.TD_InfeccNum=TD_InfeccNum;
	}
	public String getTD_InfeccPor()
	{
	return TD_InfeccPor;
	}
	public void setTD_InfeccPor(String TD_InfeccPor)
	{
	this.TD_InfeccPor=TD_InfeccPor;
	}
	
	
	public String Crear()
	{
		return "CREATE TABLE DatosHosp002 (datos_id INTEGER PRIMARY KEY, TD TEXT, TD_M_Num TEXT, TD_M_Por TEXT, TD_F_Num TEXT, TD_F_Por TEXT, TD_Observ TEXT, TD_Irag TEXT, TD_IragPor TEXT, TD_NeumbacNum TEXT, TD_NeumonbactPor TEXT, TD_MeninbactNum TEXT, TD_MeninbactPor TEXT, TD_BacterNum TEXT, TD_BacterPor TEXT, TD_SepsisNum TEXT, TD_SepsisPor TEXT, TD_ShockNum TEXT, TD_ShockPor TEXT, TD_InfeccNum TEXT, TD_InfeccPor TEXT)";
	}
	
	public long insertDatosHosp002(DatosHosp002 tipo, SQLiteDatabase db,boolean act,String datos_id)
	{
	ContentValues values = new ContentValues();
	values.put("datos_id",tipo.getdatos_id());
	values.put("TD",tipo.getTD());
	values.put("TD_M_Num",tipo.getTD_M_Num());
	values.put("TD_M_Por",tipo.getTD_M_Por());
	values.put("TD_F_Num",tipo.getTD_F_Num());
	values.put("TD_F_Por",tipo.getTD_F_Por());
	values.put("TD_Observ",tipo.getTD_Observ());
	values.put("TD_Irag",tipo.getTD_Irag());
	values.put("TD_IragPor",tipo.getTD_IragPor());
	values.put("TD_NeumbacNum",tipo.getTD_NeumbacNum());
	values.put("TD_NeumonbactPor",tipo.getTD_NeumonbactPor());
	values.put("TD_MeninbactNum",tipo.getTD_MeninbactNum());
	values.put("TD_MeninbactPor",tipo.getTD_MeninbactPor());
	values.put("TD_BacterNum",tipo.getTD_BacterNum());
	values.put("TD_BacterPor",tipo.getTD_BacterPor());
	values.put("TD_SepsisNum",tipo.getTD_SepsisNum());
	values.put("TD_SepsisPor",tipo.getTD_SepsisPor());
	values.put("TD_ShockNum",tipo.getTD_ShockNum());
	values.put("TD_ShockPor",tipo.getTD_ShockPor());
	values.put("TD_InfeccNum",tipo.getTD_InfeccNum());
	values.put("TD_InfeccPor",tipo.getTD_InfeccPor());
	long id=0;
	if(act)
	{
		String[] args = new String[] {datos_id};		
	     id = db.update("DatosHosp002",values,"datos_id=?",args);
	}
	else
	{
		id = db.insert("DatosHosp002", null, values);
	}
	 return id;
	
	}
	public DatosHosp002 selectDatosHosp002(String caso_id,SQLiteDatabase db)
	{
	DatosHosp002 tipo=null;
	Cursor cursor=db.query("DatosHosp002" ,null,"datos_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new DatosHosp002(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11),cursor.getString(12),cursor.getString(13),cursor.getString(14),cursor.getString(15),cursor.getString(16),cursor.getString(17),cursor.getString(18),cursor.getString(19),cursor.getString(20));
	return tipo;
	}
	
	

}
