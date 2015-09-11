package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatosHosp001 {
	
	private String datos_id;
	private String TU;
	private String TU_M_Num;
	private String TU_M_Por;
	private String TU_F_Num;
	private String TU_F_Por;
	private String TU_Observ;
	private String TU_Irag;
	private String TU_IragPor;
	private String TU_NeumbacNum;
	private String TU_NeumonbactPor;
	private String TU_MeninbactNum;
	private String TU_MeninbactPor;
	private String TU_BacterNum;
	private String TU_BacterPor;
	private String TU_SepsisNum;
	private String TU_SepsisPor;
	private String TU_ShockNum;
	private String TU_ShockPor;
	private String TU_InfeccNum;
	private String TU_InfeccPor;
	
	public DatosHosp001(){}
	public DatosHosp001(String datos_id,String TU,String TU_M_Num,String TU_M_Por,String TU_F_Num,String TU_F_Por,String TU_Observ,String TU_Irag,String TU_IragPor,String TU_NeumbacNum,String TU_NeumonbactPor,String TU_MeninbactNum,String TU_MeninbactPor,String TU_BacterNum,String TU_BacterPor,String TU_SepsisNum,String TU_SepsisPor,String TU_ShockNum,String TU_ShockPor,String TU_InfeccNum,String TU_InfeccPor)
	{
	this.datos_id=datos_id;
	this.TU=TU;
	this.TU_M_Num=TU_M_Num;
	this.TU_M_Por=TU_M_Por;
	this.TU_F_Num=TU_F_Num;
	this.TU_F_Por=TU_F_Por;
	this.TU_Observ=TU_Observ;
	this.TU_Irag=TU_Irag;
	this.TU_IragPor=TU_IragPor;
	this.TU_NeumbacNum=TU_NeumbacNum;
	this.TU_NeumonbactPor=TU_NeumonbactPor;
	this.TU_MeninbactNum=TU_MeninbactNum;
	this.TU_MeninbactPor=TU_MeninbactPor;
	this.TU_BacterNum=TU_BacterNum;
	this.TU_BacterPor=TU_BacterPor;
	this.TU_SepsisNum=TU_SepsisNum;
	this.TU_SepsisPor=TU_SepsisPor;
	this.TU_ShockNum=TU_ShockNum;
	this.TU_ShockPor=TU_ShockPor;
	this.TU_InfeccNum=TU_InfeccNum;
	this.TU_InfeccPor=TU_InfeccPor;

	}
	
	public String getdatos_id()
	{
	return datos_id;
	}
	public void setdatos_id(String datos_id)
	{
	this.datos_id=datos_id;
	}
	public String getTU()
	{
	return TU;
	}
	public void setTU(String TU)
	{
	this.TU=TU;
	}
	public String getTU_M_Num()
	{
	return TU_M_Num;
	}
	public void setTU_M_Num(String TU_M_Num)
	{
	this.TU_M_Num=TU_M_Num;
	}
	public String getTU_M_Por()
	{
	return TU_M_Por;
	}
	public void setTU_M_Por(String TU_M_Por)
	{
	this.TU_M_Por=TU_M_Por;
	}
	public String getTU_F_Num()
	{
	return TU_F_Num;
	}
	public void setTU_F_Num(String TU_F_Num)
	{
	this.TU_F_Num=TU_F_Num;
	}
	public String getTU_F_Por()
	{
	return TU_F_Por;
	}
	public void setTU_F_Por(String TU_F_Por)
	{
	this.TU_F_Por=TU_F_Por;
	}
	public String getTU_Observ()
	{
	return TU_Observ;
	}
	public void setTU_Observ(String TU_Observ)
	{
	this.TU_Observ=TU_Observ;
	}
	public String getTU_Irag()
	{
	return TU_Irag;
	}
	public void setTU_Irag(String TU_Irag)
	{
	this.TU_Irag=TU_Irag;
	}
	public String getTU_IragPor()
	{
	return TU_IragPor;
	}
	public void setTU_IragPor(String TU_IragPor)
	{
	this.TU_IragPor=TU_IragPor;
	}
	public String getTU_NeumbacNum()
	{
	return TU_NeumbacNum;
	}
	public void setTU_NeumbacNum(String TU_NeumbacNum)
	{
	this.TU_NeumbacNum=TU_NeumbacNum;
	}
	public String getTU_NeumonbactPor()
	{
	return TU_NeumonbactPor;
	}
	public void setTU_NeumonbactPor(String TU_NeumonbactPor)
	{
	this.TU_NeumonbactPor=TU_NeumonbactPor;
	}
	public String getTU_MeninbactNum()
	{
	return TU_MeninbactNum;
	}
	public void setTU_MeninbactNum(String TU_MeninbactNum)
	{
	this.TU_MeninbactNum=TU_MeninbactNum;
	}
	public String getTU_MeninbactPor()
	{
	return TU_MeninbactPor;
	}
	public void setTU_MeninbactPor(String TU_MeninbactPor)
	{
	this.TU_MeninbactPor=TU_MeninbactPor;
	}
	public String getTU_BacterNum()
	{
	return TU_BacterNum;
	}
	public void setTU_BacterNum(String TU_BacterNum)
	{
	this.TU_BacterNum=TU_BacterNum;
	}
	public String getTU_BacterPor()
	{
	return TU_BacterPor;
	}
	public void setTU_BacterPor(String TU_BacterPor)
	{
	this.TU_BacterPor=TU_BacterPor;
	}
	public String getTU_SepsisNum()
	{
	return TU_SepsisNum;
	}
	public void setTU_SepsisNum(String TU_SepsisNum)
	{
	this.TU_SepsisNum=TU_SepsisNum;
	}
	public String getTU_SepsisPor()
	{
	return TU_SepsisPor;
	}
	public void setTU_SepsisPor(String TU_SepsisPor)
	{
	this.TU_SepsisPor=TU_SepsisPor;
	}
	public String getTU_ShockNum()
	{
	return TU_ShockNum;
	}
	public void setTU_ShockNum(String TU_ShockNum)
	{
	this.TU_ShockNum=TU_ShockNum;
	}
	public String getTU_ShockPor()
	{
	return TU_ShockPor;
	}
	public void setTU_ShockPor(String TU_ShockPor)
	{
	this.TU_ShockPor=TU_ShockPor;
	}
	public String getTU_InfeccNum()
	{
	return TU_InfeccNum;
	}
	public void setTU_InfeccNum(String TU_InfeccNum)
	{
	this.TU_InfeccNum=TU_InfeccNum;
	}
	public String getTU_InfeccPor()
	{
	return TU_InfeccPor;
	}
	public void setTU_InfeccPor(String TU_InfeccPor)
	{
	this.TU_InfeccPor=TU_InfeccPor;
	}

	public String Crear()
	{
		return "CREATE TABLE DatosHosp001 (datos_id INTEGER PRIMARY KEY, TU TEXT, TU_M_Num TEXT, TU_M_Por TEXT, TU_F_Num TEXT, TU_F_Por TEXT, TU_Observ TEXT, TU_Irag TEXT, TU_IragPor TEXT, TU_NeumbacNum TEXT, TU_NeumonbactPor TEXT, TU_MeninbactNum TEXT, TU_MeninbactPor TEXT, TU_BacterNum TEXT, TU_BacterPor TEXT, TU_SepsisNum TEXT, TU_SepsisPor TEXT, TU_ShockNum TEXT, TU_ShockPor TEXT, TU_InfeccNum TEXT, TU_InfeccPor TEXT)";
	}
	
	public long insertDatosHosp001(DatosHosp001 tipo, SQLiteDatabase db,boolean act,String datos_id)
	{
	ContentValues values = new ContentValues();
	values.put("datos_id",tipo.getdatos_id());
	values.put("TU",tipo.getTU());
	values.put("TU_M_Num",tipo.getTU_M_Num());
	values.put("TU_M_Por",tipo.getTU_M_Por());
	values.put("TU_F_Num",tipo.getTU_F_Num());
	values.put("TU_F_Por",tipo.getTU_F_Por());
	values.put("TU_Observ",tipo.getTU_Observ());
	values.put("TU_Irag",tipo.getTU_Irag());
	values.put("TU_IragPor",tipo.getTU_IragPor());
	values.put("TU_NeumbacNum",tipo.getTU_NeumbacNum());
	values.put("TU_NeumonbactPor",tipo.getTU_NeumonbactPor());
	values.put("TU_MeninbactNum",tipo.getTU_MeninbactNum());
	values.put("TU_MeninbactPor",tipo.getTU_MeninbactPor());
	values.put("TU_BacterNum",tipo.getTU_BacterNum());
	values.put("TU_BacterPor",tipo.getTU_BacterPor());
	values.put("TU_SepsisNum",tipo.getTU_SepsisNum());
	values.put("TU_SepsisPor",tipo.getTU_SepsisPor());
	values.put("TU_ShockNum",tipo.getTU_ShockNum());
	values.put("TU_ShockPor",tipo.getTU_ShockPor());
	values.put("TU_InfeccNum",tipo.getTU_InfeccNum());
	values.put("TU_InfeccPor",tipo.getTU_InfeccPor());
	long id=0;
	if(act)
	{
		String[] args = new String[] {datos_id};		
	     id = db.update("DatosHosp001",values,"datos_id=?",args);
	}
	else
	{
		id = db.insert("DatosHosp001", null, values);
	}
	 return id;
	
	}
	public DatosHosp001 selectDatosHosp001(String caso_id,SQLiteDatabase db)
	{
	DatosHosp001 tipo=null;
	Cursor cursor=db.query("DatosHosp001" ,null,"datos_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new DatosHosp001(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11),cursor.getString(12),cursor.getString(13),cursor.getString(14),cursor.getString(15),cursor.getString(16),cursor.getString(17),cursor.getString(18),cursor.getString(19),cursor.getString(20));
	return tipo;
	}

}
