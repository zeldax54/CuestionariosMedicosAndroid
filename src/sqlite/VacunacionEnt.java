package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class VacunacionEnt {
	
	public String CarnetVacunacion;
	public boolean VacunacionNoPrecisada;
	public boolean VPV;
	public String VPV1df;
	public String VPV2df;
	public String VPV3DF;
	public boolean AMC;
	public String AMC1DF;
	public String AMC2DF;
	public String AMC3DF;
	public boolean HyD;
	public String HyD1DF;	
	public boolean ANC;
	public String ANC1DF;
	public String ANC2DF;
	public String ANC3DF;
	public boolean AI;
	public String AI1DF;
	public String AI2DF;
	public String AI3DF;
	public String  caso_id;
	
	
	public VacunacionEnt(){}
	public VacunacionEnt(String pCarnetVacunacion,boolean pVacunacionNoPrecisada,boolean pVPV,String pVPV1df,String pVPV2df,String pVPV3DF,boolean pAMC,String pAMC1DF,String pAMC2DF,String pAMC3DF,boolean pHyD,String pHyD1DF,boolean pANC,String pANC1DF,String pANC2DF,String pANC3DF,boolean pAI,String pAI1DF,String pAI2DF,String pAI3DF)
	{
	CarnetVacunacion=pCarnetVacunacion;
	VacunacionNoPrecisada=pVacunacionNoPrecisada;
	VPV=pVPV;
	VPV1df=pVPV1df;
	VPV2df=pVPV2df;
	VPV3DF=pVPV3DF;
	AMC=pAMC;
	AMC1DF=pAMC1DF;
	AMC2DF=pAMC2DF;
	AMC3DF=pAMC3DF;
	HyD=pHyD;
	HyD1DF=pHyD1DF;
	ANC=pANC;
	ANC1DF=pANC1DF;
	ANC2DF=pANC2DF;
	ANC3DF=pANC3DF;
	AI=pAI;
	AI1DF=pAI1DF;
	AI2DF=pAI2DF;
	AI3DF=pAI3DF;
   
	 

	}
	
	 public String Crear()
	 {
		 return "CREATE TABLE Vacunacion(caso_id INTEGER PRIMARY KEY,"
		 		+ "CarnetVacunacion TEXT,VacunacionNoPrecisada boolean,VPV boolean,"
		 		+ "VPV1df TEXT,VPV2df TEXT,VPV3DF TEXT,"
		 		+ "AMC boolean,AMC1DF TEXT,AMC2DF TEXT,AMC3DF TEXT,"
		 		+ "HyD boolean,HyD1DF TEXT,ANC boolean,ANC1DF TEXT,"
		 		+ "ANC2DF TEXT,ANC3DF TEXT,AI boolean,AI1DF TEXT,AI2DF TEXT,AI3DF TEXT)";
	 }
	 
	 public String getCarnetVacunacion()
	 {
	 return CarnetVacunacion;
	 }
	 public void setCarnetVacunacion(String CarnetVacunacion)
	 {
	 this.CarnetVacunacion=CarnetVacunacion;
	 }
	 public boolean getVacunacionNoPrecisada()
	 {
	 return VacunacionNoPrecisada;
	 }
	 public void setVacunacionNoPrecisada(boolean VacunacionNoPrecisada)
	 {
	 this.VacunacionNoPrecisada=VacunacionNoPrecisada;
	 }
	 public boolean getVPV()
	 {
	 return VPV;
	 }
	 public void setVPV(boolean VPV)
	 {
	 this.VPV=VPV;
	 }
	
	 public String getVPV1df()
	 {
	 return VPV1df;
	 }
	 public void setVPV1df(String VPV1df)
	 {
	 this.VPV1df=VPV1df;
	 }
	 public String getVPV2df()
	 {
	 return VPV2df;
	 }
	 public void setVPV2df(String VPV2df)
	 {
	 this.VPV2df=VPV2df;
	 }
	 public String getVPV3DF()
	 {
	 return VPV3DF;
	 }
	 public void setVPV3DF(String VPV3DF)
	 {
	 this.VPV3DF=VPV3DF;
	 }
	 public boolean getAMC()
	 {
	 return AMC;
	 }
	 public void setAMC(boolean AMC)
	 {
	 this.AMC=AMC;
	 }
	 public String getAMC1DF()
	 {
	 return AMC1DF;
	 }
	 public void setAMC1DF(String AMC1DF)
	 {
	 this.AMC1DF=AMC1DF;
	 }
	 public String getAMC2DF()
	 {
	 return AMC2DF;
	 }
	 public void setAMC2DF(String AMC2DF)
	 {
	 this.AMC2DF=AMC2DF;
	 }
	 public String getAMC3DF()
	 {
	 return AMC3DF;
	 }
	 public void setAMC3DF(String AMC3DF)
	 {
	 this.AMC3DF=AMC3DF;
	 }
	 public boolean getHyD()
	 {
	 return HyD;
	 }
	 public void setHyD(boolean HyD)
	 {
	 this.HyD=HyD;
	 }
	 public String getHyD1DF()
	 {
	 return HyD1DF;
	 }
	 public void setHyD1DF(String HyD1DF)
	 {
	 this.HyD1DF=HyD1DF;
	 }
	
	 public boolean getANC()
	 {
	 return ANC;
	 }
	 public void setANC(boolean ANC)
	 {
	 this.ANC=ANC;
	 }
	 public String getANC1DF()
	 {
	 return ANC1DF;
	 }
	 public void setANC1DF(String ANC1DF)
	 {
	 this.ANC1DF=ANC1DF;
	 }
	 public String getANC2DF()
	 {
	 return ANC2DF;
	 }
	 public void setANC2DF(String ANC2DF)
	 {
	 this.ANC2DF=ANC2DF;
	 }
	 public String getANC3DF()
	 {
	 return ANC3DF;
	 }
	 public void setANC3DF(String ANC3DF)
	 {
	 this.ANC3DF=ANC3DF;
	 }
	 public boolean getAI()
	 {
	 return AI;
	 }
	 public void setAI(boolean AI)
	 {
	 this.AI=AI;
	 }
	 public String getAI1DF()
	 {
	 return AI1DF;
	 }
	 public void setAI1DF(String AI1DF)
	 {
	 this.AI1DF=AI1DF;
	 }
	 public String getAI2DF()
	 {
	 return AI2DF;
	 }
	 public void setAI2DF(String AI2DF)
	 {
	 this.AI2DF=AI2DF;
	 }
	 public String getAI3DF()
	 {
	 return AI3DF;
	 }
	 public void setAI3DF(String AI3DF)
	 {
	 this.AI3DF=AI3DF;
	 }
	 public String getcaso_id()
	 {
	 return caso_id;
	 }
	 public void setcaso_id(String caso_id)
	 {
	 this.caso_id=caso_id;
	 }
	
	 public long insertVacunacion(VacunacionEnt tipo, SQLiteDatabase db,boolean act,String caso_id)
	 {
	 ContentValues values = new ContentValues();
	 values.put("caso_id", tipo.getcaso_id());
	 values.put("CarnetVacunacion",tipo.getCarnetVacunacion());
	 values.put("VacunacionNoPrecisada",tipo.getVacunacionNoPrecisada());
	 values.put("VPV",tipo.getVPV());
	 values.put("VPV1df",tipo.getVPV1df().toString());
	 values.put("VPV2df",tipo.getVPV2df().toString());
	 values.put("VPV3DF",tipo.getVPV3DF().toString());
	 values.put("AMC",tipo.getAMC());
	 values.put("AMC1DF",tipo.getAMC1DF().toString());
	 values.put("AMC2DF",tipo.getAMC2DF().toString());
	 values.put("AMC3DF",tipo.getAMC3DF().toString());
	 values.put("HyD",tipo.getHyD());
	 values.put("HyD1DF",tipo.getHyD1DF().toString());	 
	 values.put("ANC",tipo.getANC());
	 values.put("ANC1DF",tipo.getANC1DF().toString());
	 values.put("ANC2DF",tipo.getANC2DF().toString());
	 values.put("ANC3DF",tipo.getANC3DF().toString());
	 values.put("AI",tipo.getAI());
	 values.put("AI1DF",tipo.getAI1DF().toString());
	 values.put("AI2DF",tipo.getAI2DF().toString());
	 values.put("AI3DF",tipo.getAI3DF().toString());
	 long id=0;
		if(act)
		{
			String[] args = new String[] {caso_id};		
		     id = db.update("Vacunacion",values,"caso_id=?",args);
		}
		else
		{
			id = db.insert("Vacunacion", null, values);
		}

		return id;
	 
	 }
	
	 
	 public VacunacionEnt selectVacunacionEnt(String caso_id,SQLiteDatabase db)
	 {
	 VacunacionEnt tipo=null;	
	 String[] args = new String[] {caso_id};
	 Cursor cursor=db.rawQuery("SELECT * FROM Vacunacion WHERE caso_id=?",args); 	
	 if( cursor.moveToFirst())
	 {
	 tipo=new VacunacionEnt(String.valueOf(cursor.getString(1)),Booleanos(cursor.getString(2)),Booleanos(cursor.getString(3)),String.valueOf(cursor.getString(4)),String.valueOf(cursor.getString(5)),String.valueOf(cursor.getString(6)),Booleanos(cursor.getString(7)),String.valueOf(cursor.getString(8)),String.valueOf(cursor.getString(9)),String.valueOf(cursor.getString(10)),Booleanos(cursor.getString(11)),String.valueOf(cursor.getString(12)),Booleanos(cursor.getString(13)),String.valueOf(cursor.getString(14)),String.valueOf(cursor.getString(15)),String.valueOf(cursor.getString(16)),Booleanos(cursor.getString(17)),String.valueOf(cursor.getString(18)),String.valueOf(cursor.getString(19)),String.valueOf(cursor.getString(20)));
	 }
	 return tipo;
	 }
	 
	 public boolean Booleanos(String x)
	 	{
	 		if(x.equals("0"))
	 			return false;
	 		return true;
	 	}

}
