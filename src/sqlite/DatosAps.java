package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatosAps {
	
	private String datos_id;
	private String idcuestionario;
	private String NoSemana;
	private String Fecha;
	private String Area;
	private String CMF;
	private String TA;
	private String TAMasNum;
	private String TAMasPor;
	private String TAFemNum;
	private String TAFemPor;
	private String TAObserv;
	private String e0_5mNum;
	private String e0_5mPor;
	private String e6_11mNum;
	private String e6_11mPor;
	private String e12_23mNum;
	private String e12_23mPor;
	private String e2_4aNum;
	private String e2_4aPor;
	private String e5_9aNum;
	private String e5_9aPor;
	private String e10_14aNum;
	private String e10_14aPor;
	private String e15_18aNum;
	private String e15_18aPor;
	private String e18_24aNum;
	private String e18_24aPor;
	private String e25_49aNum;
	private String e25_49aPor;
	private String e50_69aNum;
	private String e50_69aPor;
	private String e70_masNum;
	private String e70_masPor;
	private String Observedades;
	private String L;
	private String ViralesNum;
	private String ViralesPor;
	private String BactNum;
	private String BactPor;
	private String Obserlab;
	private String Nombreresp;
	
	public DatosAps(){}
	public DatosAps(String datos_id,String idcuestionario,String NoSemana,String Fecha,String Area,String CMF,String TA,String TAMasNum,String TAMasPor,String TAFemNum,String TAFemPor,String TAObserv,String e0_5mNum,String e0_5mPor,String e6_11mNum,String e6_11mPor,String e12_23mNum,String e12_23mPor,String e2_4aNum,String e2_4aPor,String e5_9aNum,String e5_9aPor,String e10_14aNum,String e10_14aPor,String e15_18aNum,String e15_18aPor,String e18_24aNum,String e18_24aPor,String e25_49aNum,String e25_49aPor,String e50_69aNum,String e50_69aPor,String e70_masNum,String e70_masPor,String Observedades,String L,String ViralesNum,String ViralesPor,String BactNum,String BactPor,String Obserlab,String Nombreresp)
	{
	this.datos_id=datos_id;
	this.idcuestionario=idcuestionario;
	this.NoSemana=NoSemana;
	this.Fecha=Fecha;
	this.Area=Area;
	this.CMF=CMF;
	this.TA=TA;
	this.TAMasNum=TAMasNum;
	this.TAMasPor=TAMasPor;
	this.TAFemNum=TAFemNum;
	this.TAFemPor=TAFemPor;
	this.TAObserv=TAObserv;
	this.e0_5mNum=e0_5mNum;
	this.e0_5mPor=e0_5mPor;
	this.e6_11mNum=e6_11mNum;
	this.e6_11mPor=e6_11mPor;
	this.e12_23mNum=e12_23mNum;
	this.e12_23mPor=e12_23mPor;
	this.e2_4aNum=e2_4aNum;
	this.e2_4aPor=e2_4aPor;
	this.e5_9aNum=e5_9aNum;
	this.e5_9aPor=e5_9aPor;
	this.e10_14aNum=e10_14aNum;
	this.e10_14aPor=e10_14aPor;
	this.e15_18aNum=e15_18aNum;
	this.e15_18aPor=e15_18aPor;
	this.e18_24aNum=e18_24aNum;
	this.e18_24aPor=e18_24aPor;
	this.e25_49aNum=e25_49aNum;
	this.e25_49aPor=e25_49aPor;
	this.e50_69aNum=e50_69aNum;
	this.e50_69aPor=e50_69aPor;
	this.e70_masNum=e70_masNum;
	this.e70_masPor=e70_masPor;
	this.Observedades=Observedades;
	this.L=L;
	this.ViralesNum=ViralesNum;
	this.ViralesPor=ViralesPor;
	this.BactNum=BactNum;
	this.BactPor=BactPor;
	this.Obserlab=Obserlab;
	this.Nombreresp=Nombreresp;

	}
	
	public String getidcuestionario()
	{
	return idcuestionario;
	}
	
	public String getdatos_id()
	{
	return datos_id;
	}
	public void setdatos_id(String datos_id)
	{
	this.datos_id=datos_id;
	}
	public String getNoSemana()
	{
	return NoSemana;
	}
	public void setNoSemana(String NoSemana)
	{
	this.NoSemana=NoSemana;
	}
	public String getFecha()
	{
	return Fecha;
	}
	public void setFecha(String Fecha)
	{
	this.Fecha=Fecha;
	}
	public String getArea()
	{
	return Area;
	}
	public void setArea(String Area)
	{
	this.Area=Area;
	}
	public String getCMF()
	{
	return CMF;
	}
	public void setCMF(String CMF)
	{
	this.CMF=CMF;
	}
	public String getTA()
	{
	return TA;
	}
	public void setTA(String TA)
	{
	this.TA=TA;
	}
	public String getTAMasNum()
	{
	return TAMasNum;
	}
	public void setTAMasNum(String TAMasNum)
	{
	this.TAMasNum=TAMasNum;
	}
	public String getTAMasPor()
	{
	return TAMasPor;
	}
	public void setTAMasPor(String TAMasPor)
	{
	this.TAMasPor=TAMasPor;
	}
	public String getTAFemNum()
	{
	return TAFemNum;
	}
	public void setTAFemNum(String TAFemNum)
	{
	this.TAFemNum=TAFemNum;
	}
	public String getTAFemPor()
	{
	return TAFemPor;
	}
	public void setTAFemPor(String TAFemPor)
	{
	this.TAFemPor=TAFemPor;
	}
	public String getTAObserv()
	{
	return TAObserv;
	}
	public void setTAObserv(String TAObserv)
	{
	this.TAObserv=TAObserv;
	}
	public String gete0_5mNum()
	{
	return e0_5mNum;
	}
	public void sete0_5mNum(String e0_5mNum)
	{
	this.e0_5mNum=e0_5mNum;
	}
	public String gete0_5mPor()
	{
	return e0_5mPor;
	}
	public void sete0_5mPor(String e0_5mPor)
	{
	this.e0_5mPor=e0_5mPor;
	}
	public String gete6_11mNum()
	{
	return e6_11mNum;
	}
	public void sete6_11mNum(String e6_11mNum)
	{
	this.e6_11mNum=e6_11mNum;
	}
	public String gete6_11mPor()
	{
	return e6_11mPor;
	}
	public void sete6_11mPor(String e6_11mPor)
	{
	this.e6_11mPor=e6_11mPor;
	}
	public String gete12_23mNum()
	{
	return e12_23mNum;
	}
	public void sete12_23mNum(String e12_23mNum)
	{
	this.e12_23mNum=e12_23mNum;
	}
	public String gete12_23mPor()
	{
	return e12_23mPor;
	}
	public void sete12_23mPor(String e12_23mPor)
	{
	this.e12_23mPor=e12_23mPor;
	}
	public String gete2_4aNum()
	{
	return e2_4aNum;
	}
	public void sete2_4aNum(String e2_4aNum)
	{
	this.e2_4aNum=e2_4aNum;
	}
	public String gete2_4aPor()
	{
	return e2_4aPor;
	}
	public void sete2_4aPor(String e2_4aPor)
	{
	this.e2_4aPor=e2_4aPor;
	}
	public String gete5_9aNum()
	{
	return e5_9aNum;
	}
	public void sete5_9aNum(String e5_9aNum)
	{
	this.e5_9aNum=e5_9aNum;
	}
	public String gete5_9aPor()
	{
	return e5_9aPor;
	}
	public void sete5_9aPor(String e5_9aPor)
	{
	this.e5_9aPor=e5_9aPor;
	}
	public String gete10_14aNum()
	{
	return e10_14aNum;
	}
	public void sete10_14aNum(String e10_14aNum)
	{
	this.e10_14aNum=e10_14aNum;
	}
	public String gete10_14aPor()
	{
	return e10_14aPor;
	}
	public void sete10_14aPor(String e10_14aPor)
	{
	this.e10_14aPor=e10_14aPor;
	}
	public String gete15_18aNum()
	{
	return e15_18aNum;
	}
	public void sete15_18aNum(String e15_18aNum)
	{
	this.e15_18aNum=e15_18aNum;
	}
	public String gete15_18aPor()
	{
	return e15_18aPor;
	}
	public void sete15_18aPor(String e15_18aPor)
	{
	this.e15_18aPor=e15_18aPor;
	}
	public String gete18_24aNum()
	{
	return e18_24aNum;
	}
	public void sete18_24aNum(String e18_24aNum)
	{
	this.e18_24aNum=e18_24aNum;
	}
	public String gete18_24aPor()
	{
	return e18_24aPor;
	}
	public void sete18_24aPor(String e18_24aPor)
	{
	this.e18_24aPor=e18_24aPor;
	}
	public String gete25_49aNum()
	{
	return e25_49aNum;
	}
	public void sete25_49aNum(String e25_49aNum)
	{
	this.e25_49aNum=e25_49aNum;
	}
	public String gete25_49aPor()
	{
	return e25_49aPor;
	}
	public void sete25_49aPor(String e25_49aPor)
	{
	this.e25_49aPor=e25_49aPor;
	}
	public String gete50_69aNum()
	{
	return e50_69aNum;
	}
	public void sete50_69aNum(String e50_69aNum)
	{
	this.e50_69aNum=e50_69aNum;
	}
	public String gete50_69aPor()
	{
	return e50_69aPor;
	}
	public void sete50_69aPor(String e50_69aPor)
	{
	this.e50_69aPor=e50_69aPor;
	}
	public String gete70_masNum()
	{
	return e70_masNum;
	}
	public void sete70_masNum(String e70_masNum)
	{
	this.e70_masNum=e70_masNum;
	}
	public String gete70_masPor()
	{
	return e70_masPor;
	}
	public void sete70_masPor(String e70_masPor)
	{
	this.e70_masPor=e70_masPor;
	}
	public String getObservedades()
	{
	return Observedades;
	}
	public void setObservedades(String Observedades)
	{
	this.Observedades=Observedades;
	}
	public String getL()
	{
	return L;
	}
	public void setL(String L)
	{
	this.L=L;
	}
	public String getViralesNum()
	{
	return ViralesNum;
	}
	public void setViralesNum(String ViralesNum)
	{
	this.ViralesNum=ViralesNum;
	}
	public String getViralesPor()
	{
	return ViralesPor;
	}
	public void setViralesPor(String ViralesPor)
	{
	this.ViralesPor=ViralesPor;
	}
	public String getBactNum()
	{
	return BactNum;
	}
	public void setBactNum(String BactNum)
	{
	this.BactNum=BactNum;
	}
	public String getBactPor()
	{
	return BactPor;
	}
	public void setBactPor(String BactPor)
	{
	this.BactPor=BactPor;
	}
	public String getObserlab()
	{
	return Obserlab;
	}
	public void setObserlab(String Obserlab)
	{
	this.Obserlab=Obserlab;
	}
	public String getNombreresp()
	{
	return Nombreresp;
	}
	public void setNombreresp(String Nombreresp)
	{
	this.Nombreresp=Nombreresp;
	}
	
	public String Crear()
	{
		return "CREATE TABLE DatosAps (datos_id INTEGER PRIMARY KEY AUTOINCREMENT,idcuestionario INTEGER, NoSemana TEXT, Fecha TEXT, Area TEXT, CMF TEXT, TA TEXT, TAMasNum TEXT, TAMasPor TEXT, TAFemNum TEXT, TAFemPor TEXT, TAObserv TEXT, e0_5mNum TEXT, e0_5mPor TEXT, e6_11mNum TEXT, e6_11mPor TEXT, e12_23mNum TEXT, e12_23mPor TEXT, e2_4aNum TEXT, e2_4aPor TEXT, e5_9aNum TEXT, e5_9aPor TEXT, e10_14aNum TEXT, e10_14aPor TEXT, e15_18aNum TEXT, e15_18aPor TEXT, e18_24aNum TEXT, e18_24aPor TEXT, e25_49aNum TEXT, e25_49aPor TEXT, e50_69aNum TEXT, e50_69aPor TEXT, e70_masNum TEXT, e70_masPor TEXT, Observedades TEXT, L TEXT, ViralesNum TEXT, ViralesPor TEXT, BactNum TEXT, BactPor TEXT, Obserlab TEXT, Nombreresp TEXT )";
	}
	
	public long insert(DatosAps tipo, SQLiteDatabase db,boolean act,String datos_id)
	{
	ContentValues values = new ContentValues();
	values.put("datos_id",tipo.getdatos_id());
	values.put("idcuestionario", tipo.getidcuestionario());
	values.put("NoSemana",tipo.getNoSemana());
	values.put("Fecha",tipo.getFecha());
	values.put("Area",tipo.getArea());
	values.put("CMF",tipo.getCMF());
	values.put("TA",tipo.getTA());
	values.put("TAMasNum",tipo.getTAMasNum());
	values.put("TAMasPor",tipo.getTAMasPor());
	values.put("TAFemNum",tipo.getTAFemNum());
	values.put("TAFemPor",tipo.getTAFemPor());
	values.put("TAObserv",tipo.getTAObserv());
	values.put("e0_5mNum",tipo.gete0_5mNum());
	values.put("e0_5mPor",tipo.gete0_5mPor());
	values.put("e6_11mNum",tipo.gete6_11mNum());
	values.put("e6_11mPor",tipo.gete6_11mPor());
	values.put("e12_23mNum",tipo.gete12_23mNum());
	values.put("e12_23mPor",tipo.gete12_23mPor());
	values.put("e2_4aNum",tipo.gete2_4aNum());
	values.put("e2_4aPor",tipo.gete2_4aPor());
	values.put("e5_9aNum",tipo.gete5_9aNum());
	values.put("e5_9aPor",tipo.gete5_9aPor());
	values.put("e10_14aNum",tipo.gete10_14aNum());
	values.put("e10_14aPor",tipo.gete10_14aPor());
	values.put("e15_18aNum",tipo.gete15_18aNum());
	values.put("e15_18aPor",tipo.gete15_18aPor());
	values.put("e18_24aNum",tipo.gete18_24aNum());
	values.put("e18_24aPor",tipo.gete18_24aPor());
	values.put("e25_49aNum",tipo.gete25_49aNum());
	values.put("e25_49aPor",tipo.gete25_49aPor());
	values.put("e50_69aNum",tipo.gete50_69aNum());
	values.put("e50_69aPor",tipo.gete50_69aPor());
	values.put("e70_masNum",tipo.gete70_masNum());
	values.put("e70_masPor",tipo.gete70_masPor());
	values.put("Observedades",tipo.getObservedades());
	values.put("L",tipo.getL());
	values.put("ViralesNum",tipo.getViralesNum());
	values.put("ViralesPor",tipo.getViralesPor());
	values.put("BactNum",tipo.getBactNum());
	values.put("BactPor",tipo.getBactPor());
	values.put("Obserlab",tipo.getObserlab());
	values.put("Nombreresp",tipo.getNombreresp());
	long id=0;
	if(act)
	{
		String[] args = new String[] {datos_id};		
	     id = db.update("DatosAps",values,"datos_id=?",args);
	}
	else
	{
		id = db.insert("DatosAps", null, values);
	}
	
	return id;
	}

	public DatosAps selectDatosAps(String caso_id,SQLiteDatabase db)
	{
	DatosAps tipo=null;
	Cursor cursor=db.query("DatosAps" ,null,"datos_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new DatosAps(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11),cursor.getString(12),cursor.getString(13),cursor.getString(14),cursor.getString(15),cursor.getString(16),cursor.getString(17),cursor.getString(18),cursor.getString(19),cursor.getString(20),cursor.getString(21),cursor.getString(22),cursor.getString(23),cursor.getString(24),cursor.getString(25),cursor.getString(26),cursor.getString(27),cursor.getString(28),cursor.getString(29),cursor.getString(30),cursor.getString(31),cursor.getString(32),cursor.getString(33),cursor.getString(34),cursor.getString(35),cursor.getString(36),cursor.getString(37),cursor.getString(38),cursor.getString(39),cursor.getString(40),cursor.getString(41));
	return tipo;
	}
}
