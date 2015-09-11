package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatosHospC {
	
	private String datos_id;
	private String idcuestionario;
	private String Semanaepid;
	private String Fecha;
	private String NombreHosp;
	private String TA;
	private String TA_M_Num;
	private String TA_M_Por;
	private String TA_F_Num;
	private String TA_F_Por;
	private String TA_Observ;
	private String TH;
	private String TH_M_Num;
	private String TH_M_Por;
	private String TH_F_Num;
	private String TH_F_Por;
	private String TH_Observ;
	private String TH_IragNum;
	private String TH_IragPor;
	private String TH_NeumbactNum;
	private String TH_NeumbacPor;
	private String TH_MeninNum;
	private String TH_MeninPor;
	private String TH_BacterNum;
	private String TH_BacterPor;
	private String TH_OtitisNum;
	private String TH_OtitisPor;
	private String TH_InfeccionNum;
	private String TH_InfeccionPor;
	
	public DatosHospC(){}
	public DatosHospC(String datos_id,String idcuestionario,String Semanaepid,String Fecha,String NombreHosp,String TA,String TA_M_Num,String TA_M_Por,String TA_F_Num,String TA_F_Por,String TA_Observ,String TH,String TH_M_Num,String TH_M_Por,String TH_F_Num,String TH_F_Por,String TH_Observ,String TH_IragNum,String TH_IragPor,String TH_NeumbactNum,String TH_NeumbacPor,String TH_MeninNum,String TH_MeninPor,String TH_BacterNum,String TH_BacterPor,String TH_OtitisNum,String TH_OtitisPor,String TH_InfeccionNum,String TH_InfeccionPor)
	{
	this.datos_id=datos_id;
	this.idcuestionario=idcuestionario;
	this.Semanaepid=Semanaepid;
	this.Fecha=Fecha;
	this.NombreHosp=NombreHosp;
	this.TA=TA;
	this.TA_M_Num=TA_M_Num;
	this.TA_M_Por=TA_M_Por;
	this.TA_F_Num=TA_F_Num;
	this.TA_F_Por=TA_F_Por;
	this.TA_Observ=TA_Observ;
	this.TH=TH;
	this.TH_M_Num=TH_M_Num;
	this.TH_M_Por=TH_M_Por;
	this.TH_F_Num=TH_F_Num;
	this.TH_F_Por=TH_F_Por;
	this.TH_Observ=TH_Observ;
	this.TH_IragNum=TH_IragNum;
	this.TH_IragPor=TH_IragPor;
	this.TH_NeumbactNum=TH_NeumbactNum;
	this.TH_NeumbacPor=TH_NeumbacPor;
	this.TH_MeninNum=TH_MeninNum;
	this.TH_MeninPor=TH_MeninPor;
	this.TH_BacterNum=TH_BacterNum;
	this.TH_BacterPor=TH_BacterPor;
	this.TH_OtitisNum=TH_OtitisNum;
	this.TH_OtitisPor=TH_OtitisPor;
	this.TH_InfeccionNum=TH_InfeccionNum;
	this.TH_InfeccionPor=TH_InfeccionPor;

	}
	
	
	public String getidcuestionario()
	{
	return idcuestionario;
	}
	public void setidcuestionario(String idcuestionario)
	{
	this.idcuestionario=idcuestionario;
	}
	
	public String getSemanaepid()
	{
	return Semanaepid;
	}
	public String getdatos_id()
	{
	return datos_id;
	}
	public void setdatos_id(String datos_id)
	{
	this.datos_id=datos_id;
	}

	public String getFecha()
	{
	return Fecha;
	}
	public void setFecha(String Fecha)
	{
	this.Fecha=Fecha;
	}
	public String getNombreHosp()
	{
	return NombreHosp;
	}
	public void setNombreHosp(String NombreHosp)
	{
	this.NombreHosp=NombreHosp;
	}
	public String getTA()
	{
	return TA;
	}
	public void setTA(String TA)
	{
	this.TA=TA;
	}
	public String getTA_M_Num()
	{
	return TA_M_Num;
	}
	public void setTA_M_Num(String TA_M_Num)
	{
	this.TA_M_Num=TA_M_Num;
	}
	public String getTA_M_Por()
	{
	return TA_M_Por;
	}
	public void setTA_M_Por(String TA_M_Por)
	{
	this.TA_M_Por=TA_M_Por;
	}
	public String getTA_F_Num()
	{
	return TA_F_Num;
	}
	public void setTA_F_Num(String TA_F_Num)
	{
	this.TA_F_Num=TA_F_Num;
	}
	public String getTA_F_Por()
	{
	return TA_F_Por;
	}
	public void setTA_F_Por(String TA_F_Por)
	{
	this.TA_F_Por=TA_F_Por;
	}
	public String getTA_Observ()
	{
	return TA_Observ;
	}
	public void setTA_Observ(String TA_Observ)
	{
	this.TA_Observ=TA_Observ;
	}
	public String getTH()
	{
	return TH;
	}
	public void setTH(String TH)
	{
	this.TH=TH;
	}
	public String getTH_M_Num()
	{
	return TH_M_Num;
	}
	public void setTH_M_Num(String TH_M_Num)
	{
	this.TH_M_Num=TH_M_Num;
	}
	public String getTH_M_Por()
	{
	return TH_M_Por;
	}
	public void setTH_M_Por(String TH_M_Por)
	{
	this.TH_M_Por=TH_M_Por;
	}
	public String getTH_F_Num()
	{
	return TH_F_Num;
	}
	public void setTH_F_Num(String TH_F_Num)
	{
	this.TH_F_Num=TH_F_Num;
	}
	public String getTH_F_Por()
	{
	return TH_F_Por;
	}
	public void setTH_F_Por(String TH_F_Por)
	{
	this.TH_F_Por=TH_F_Por;
	}
	public String getTH_Observ()
	{
	return TH_Observ;
	}
	public void setTH_Observ(String TH_Observ)
	{
	this.TH_Observ=TH_Observ;
	}
	public String getTH_IragNum()
	{
	return TH_IragNum;
	}
	public void setTH_IragNum(String TH_IragNum)
	{
	this.TH_IragNum=TH_IragNum;
	}
	public String getTH_IragPor()
	{
	return TH_IragPor;
	}
	public void setTH_IragPor(String TH_IragPor)
	{
	this.TH_IragPor=TH_IragPor;
	}
	public String getTH_NeumbactNum()
	{
	return TH_NeumbactNum;
	}
	public void setTH_NeumbactNum(String TH_NeumbactNum)
	{
	this.TH_NeumbactNum=TH_NeumbactNum;
	}
	public String getTH_NeumbacPor()
	{
	return TH_NeumbacPor;
	}
	public void setTH_NeumbacPor(String TH_NeumbacPor)
	{
	this.TH_NeumbacPor=TH_NeumbacPor;
	}
	public String getTH_MeninNum()
	{
	return TH_MeninNum;
	}
	public void setTH_MeninNum(String TH_MeninNum)
	{
	this.TH_MeninNum=TH_MeninNum;
	}
	public String getTH_MeninPor()
	{
	return TH_MeninPor;
	}
	public void setTH_MeninPor(String TH_MeninPor)
	{
	this.TH_MeninPor=TH_MeninPor;
	}
	public String getTH_BacterNum()
	{
	return TH_BacterNum;
	}
	public void setTH_BacterNum(String TH_BacterNum)
	{
	this.TH_BacterNum=TH_BacterNum;
	}
	public String getTH_BacterPor()
	{
	return TH_BacterPor;
	}
	public void setTH_BacterPor(String TH_BacterPor)
	{
	this.TH_BacterPor=TH_BacterPor;
	}
	public String getTH_OtitisNum()
	{
	return TH_OtitisNum;
	}
	public void setTH_OtitisNum(String TH_OtitisNum)
	{
	this.TH_OtitisNum=TH_OtitisNum;
	}
	public String getTH_OtitisPor()
	{
	return TH_OtitisPor;
	}
	public void setTH_OtitisPor(String TH_OtitisPor)
	{
	this.TH_OtitisPor=TH_OtitisPor;
	}
	public String getTH_InfeccionNum()
	{
	return TH_InfeccionNum;
	}
	public void setTH_InfeccionNum(String TH_InfeccionNum)
	{
	this.TH_InfeccionNum=TH_InfeccionNum;
	}
	public String getTH_InfeccionPor()
	{
	return TH_InfeccionPor;
	}
	public void setTH_InfeccionPor(String TH_InfeccionPor)
	{
	this.TH_InfeccionPor=TH_InfeccionPor;
	}


	
	
	public String Crear()
	{
		return "CREATE TABLE DatosHosp (datos_id INTEGER PRIMARY KEY AUTOINCREMENT,idcuestionario INTEGER,"
				+ "Semanaepid TEXT, Fecha TEXT, NombreHosp TEXT, TA TEXT, "
				+ "TA_M_Num TEXT, TA_M_Por TEXT, TA_F_Num TEXT, TA_F_Por TEXT, "
				+ "TA_Observ TEXT, TH TEXT, TH_M_Num TEXT, TH_M_Por TEXT, TH_F_Num TEXT, "
				+ "TH_F_Por TEXT, TH_Observ TEXT, TH_IragNum TEXT, TH_IragPor TEXT, "
				+ "TH_NeumbactNum TEXT, TH_NeumbacPor TEXT, TH_MeninNum TEXT, TH_MeninPor TEXT, "
				+ "TH_BacterNum TEXT, TH_BacterPor TEXT, TH_OtitisNum TEXT, TH_OtitisPor TEXT, "
				+ "TH_InfeccionNum TEXT, TH_InfeccionPor TEXT)";
	}
	
	public long insertDatosHosp(DatosHospC tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();	
	values.put("idcuestionario",tipo.getidcuestionario());
	values.put("Semanaepid",tipo.getSemanaepid());
	values.put("Fecha",tipo.getFecha());
	values.put("NombreHosp",tipo.getNombreHosp());
	values.put("TA",tipo.getTA());
	values.put("TA_M_Num",tipo.getTA_M_Num());
	values.put("TA_M_Por",tipo.getTA_M_Por());
	values.put("TA_F_Num",tipo.getTA_F_Num());
	values.put("TA_F_Por",tipo.getTA_F_Por());
	values.put("TA_Observ",tipo.getTA_Observ());
	values.put("TH",tipo.getTH());
	values.put("TH_M_Num",tipo.getTH_M_Num());
	values.put("TH_M_Por",tipo.getTH_M_Por());
	values.put("TH_F_Num",tipo.getTH_F_Num());
	values.put("TH_F_Por",tipo.getTH_F_Por());
	values.put("TH_Observ",tipo.getTH_Observ());
	values.put("TH_IragNum",tipo.getTH_IragNum());
	values.put("TH_IragPor",tipo.getTH_IragPor());
	values.put("TH_NeumbactNum",tipo.getTH_NeumbactNum());
	values.put("TH_NeumbacPor",tipo.getTH_NeumbacPor());
	values.put("TH_MeninNum",tipo.getTH_MeninNum());
	values.put("TH_MeninPor",tipo.getTH_MeninPor());
	values.put("TH_BacterNum",tipo.getTH_BacterNum());
	values.put("TH_BacterPor",tipo.getTH_BacterPor());
	values.put("TH_OtitisNum",tipo.getTH_OtitisNum());
	values.put("TH_OtitisPor",tipo.getTH_OtitisPor());
	values.put("TH_InfeccionNum",tipo.getTH_InfeccionNum());
	values.put("TH_InfeccionPor",tipo.getTH_InfeccionPor());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("DatosHosp",values,"datos_id=?",args);
	}
	else
	{
		 id = db.insert("DatosHosp", null, values);
	}
	 return id;
	

	}
	
	public DatosHospC selectDatosHosp(String string,SQLiteDatabase db)
	{
	DatosHospC tipo=null;
	Cursor cursor=db.query("DatosHosp" ,null,"datos_id=?",new String[] {string},null, null, null);
	cursor.moveToFirst();
	tipo=new DatosHospC(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11),cursor.getString(12),cursor.getString(13),cursor.getString(14),cursor.getString(15),cursor.getString(16),cursor.getString(17),cursor.getString(18),cursor.getString(19),cursor.getString(20),cursor.getString(21),cursor.getString(22),cursor.getString(23),cursor.getString(24),cursor.getString(25),cursor.getString(26),cursor.getString(27),cursor.getString(28));
	return tipo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
