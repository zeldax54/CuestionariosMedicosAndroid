package sqlite;


import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class BDAcceso {
	
	  private Context context;
	   private SQLiteDatabase db;
	   private SqlitePrinc openHelper;
	   
	   public SQLiteDatabase getBD()
	   {
		   return db;
	   }
	 
	   public BDAcceso(Context context) {
	      this.context = context;
	      this.openHelper = new SqlitePrinc(this.context);
	   }
	 
	   public BDAcceso open(){
	      this.db = openHelper.getWritableDatabase();      
	      return this;
	   }
	 
	   public void close() {
	      this.db.close();
	   }
	   
	   public long InsetDatosCaso(DatosCaso dc,boolean band,String caso_id)
	   {
		   open();
		   long x= dc.insertDatosCaso(dc,db,band,caso_id);
		   close();
		   return x;
	   }
	   
	   public long InsetHS(HospitalServicio hs,boolean band,String caso_id)
	   {
		   open();
		   long x= hs.insert(hs, db,band,caso_id);
		   close();
		   return x;
	   }
	   
	   public long InsertER001(EnfResp001 er001,boolean band,String caso_id)
	   {
		   open();
		   long x= er001.insertEnfResp001(er001,db,band,caso_id);
		   close();
		   return x;
	   }
	   public long Insert002(EnfResp002 er002,boolean band,String caso_id)
	   {
		   open();
		   long x= er002.insertEnfResp002(er002, db,band,caso_id);
		   close();
		   return x;
	   }
	   public long Insert003( EnfResp003 er003,boolean band,String caso_id)
	   {
		   open();
		   long x= er003.insertEnfResp003(er003, db,band,caso_id);
		   close();
		   return x;
	   }	   
	 
	   public long Insert004( EnfResp004 tipo,boolean band,String caso_id)
	   {
		   open();
		   long x= tipo.insertEnfResp004(tipo, db,band,caso_id);
		   close();
		   return x;
	   }
	   
	   public long Insert005(EnfResp005 tipo,boolean band,String caso_id)
	   {
		   open();
		   long x= tipo.insertEnfResp005(tipo, db,band,caso_id);
		   close();
		   return x;
	   }
	   
	   public long InsertVac( VacunacionEnt ve,boolean band,String caso_id)
	   {
		   open();
		   long x= ve.insertVacunacion(ve, db,band,caso_id);
		   close();
		   return x;
	   }
	   
	   
	   public long Insert006(EnfResp006 er6,boolean band,String caso_id)
	   {
		   open();
		   long x=er6.insertEnfResp006(er6, db,band,caso_id);
		   close();
		   return x;
	   }
	  
	   
	   
	   public long InsertAnt(Antibioticos tipo,boolean band)
	   {
		   open();
		   long x=tipo.insertAntibioticosEnt(tipo, db,band);
		   close();
		   return x;	   
		   
	   }
	   
	   public long insetMedicamentos(ConsumoMedicamentos med,boolean band)
	   {
		   open();
		   long x=med.insertConsumoMed(med, db,band);
		   close();
		   return x;
	   }
	   

	   public long Insert007(EnfResp007 tipo,boolean band,String caso_id)
	   {
		   open();
		   long x=tipo.insertEnfResp007(tipo, db,band,caso_id);
		   close();
		   return x;
	   }
	   
	   
	   public long InsertSubs(Susceptibilidad tipo,boolean band)
	   {
		   open();
		   long x=tipo.insertSusceptibilidad(tipo, db,band);
		   close();
		   return x;
		   
	   }
	   
	   
	   public long Insert008(EnfResp008 er8,boolean band,String caso_id)
	   {
		   open();
		   long x=er8.insert(er8, db,band,caso_id);
		   close();
		   return x;
	   }
	   
	   public long Insert009(EnfResp009 er9,boolean band,String caso_id)
	   {
		   open();
		   long x=er9.insert(er9, db,band,caso_id);
		   close();
		   return x;
	   }
	   
	   public long InsertResp(ResponsableEnt Resp,boolean band,String caso_id)
	   {
		   open();
		   long x=Resp.insert(Resp, db,band,caso_id);
		   close();
		   return x;
	   }
	   
	 
	   public ArrayList<BusquedaSqlite> BuscarDatosHosp(String NombreHosp)
	   {
		   ArrayList<BusquedaSqlite> lista=new ArrayList<BusquedaSqlite>();
		   open();
		   NombreHosp="%"+NombreHosp+"%";
			  String[]args=new String[]{NombreHosp};		  
			  String Consulta="Select datos_id,idcuestionario,SemanaEpid,NombreHosp,CuestionariosNom.Nombre FROM DatosHosp INNER JOIN CuestionariosNom ON DatosHosp.idcuestionario"
			  		+ "=CuestionariosNom.cuestionario_id where NombreHosp LIKE ?";
			  Cursor c=db.rawQuery(Consulta, args);
			  if (c.moveToFirst()) {
					/*Recorremos el cursor hasta que no haya más registros*/
					do {
					String id = c.getString(0);
					String idcuest=c.getString(1);
					String NombreHospr = c.getString(2);
					String Semana=c.getString(3);		
					String nombr=c.getString(4);
					
					BusquedaSqlite s=new BusquedaSqlite(id, idcuest, NombreHospr,Semana,nombr,"");
					lista.add(s);
					} while(c.moveToNext());
				  
			      }
			  return lista;			  
	   }
	   
	 
	   
	   
	   
	   public  ArrayList<BusquedaSqlite> BuscarXNombre(String nombre,boolean bandera)
	   {  
		   ArrayList<BusquedaSqlite> lista=new ArrayList<BusquedaSqlite>();
		   if(bandera)
		   {
	      open();
	      nombre="%"+nombre+"%";
		  String[]args=new String[]{nombre};		  
		  String Consulta="Select caso_id,NombreCompleto,Sexo,Nombre,CuestionariosNom.cuestionario_id FROM DatosCaso INNER JOIN CuestionariosNom ON DatosCaso.idcuestionario"
		  		+ "=CuestionariosNom.cuestionario_id where NombreCompleto LIKE ?";
		  Cursor c=db.rawQuery(Consulta, args);
		
		  if (c.moveToFirst()) {
			/*Recorremos el cursor hasta que no haya más registros*/
			do {
			String id = c.getString(0);
			String Nombre = c.getString(1);
			String Sexo=c.getString(2);		
			String NombreCuest=c.getString(3);
			BusquedaSqlite s=new BusquedaSqlite(id, Nombre, Sexo,NombreCuest,"",c.getString(4));
			lista.add(s);
			} while(c.moveToNext());
		  
	      }
		  close();
		
		   }
		   if(bandera==false)
		   
		   {
			 open();
			   String[]args=new String[]{nombre};		
			   
				  String Consulta="Select HospitalServicio.caso_id,HospitalServicio.FechaConsulta,DatosCaso.NombreCompleto,DatosCaso.Sexo,CuestionariosNom.Nombre,CuestionariosNom.cuestionario_id FROM HospitalServicio INNER JOIN DatosCaso ON DatosCaso.caso_id"
				  		+ "=HospitalServicio.caso_id INNER JOIN CuestionariosNom ON DatosCaso.idcuestionario=CuestionariosNom.cuestionario_id where FechaConsulta=?";
				  Cursor c=db.rawQuery(Consulta, args);
					
				  if (c.moveToFirst()) {
					//Recorremos el cursor hasta que no haya más registros
					do {
					String id = c.getString(0);
					String Nombre = c.getString(2);
					String Sexo=c.getString(3);		
					String NombreCuest=c.getString(4);
					String Fecha=c.getString(1);
					BusquedaSqlite s=new BusquedaSqlite(id, Nombre, Sexo,NombreCuest,Fecha,c.getString(4));
					lista.add(s);
					} while(c.moveToNext());
		      }
				  close();
		   }
		   return lista;
	   }
	   

	   public ArrayList<BusquedaSqlite> BuscarAps(String NumSem)
	   {
		   ArrayList<BusquedaSqlite> lista=new ArrayList<BusquedaSqlite>();
		   open();
		   NumSem="%"+NumSem+"%";
			  String[]args=new String[]{NumSem};		  
			  String Consulta="Select datos_id,idcuestionario,NoSemana,Area,CuestionariosNom.Nombre FROM DatosAps INNER JOIN CuestionariosNom ON DatosAps.idcuestionario"
			  		+ "=CuestionariosNom.cuestionario_id where NoSemana LIKE ?";
			  Cursor c=db.rawQuery(Consulta, args);
			  if (c.moveToFirst()) {
					/*Recorremos el cursor hasta que no haya más registros*/
					do {
					String id = c.getString(0);
					String idcuest=c.getString(1);
					String NombreHospr = c.getString(2);
					String Semana=c.getString(3);		
					String nombr=c.getString(4);
					
					BusquedaSqlite s=new BusquedaSqlite(id, idcuest, NombreHospr,Semana,nombr,"");
					lista.add(s);
					} while(c.moveToNext());
				  
			      }
			  return lista;			  
	   }
	   

	   public ArrayList<BusquedaSqlite> BuscarIPK(String Nombre)
	   {
		   ArrayList<BusquedaSqlite> lista=new ArrayList<BusquedaSqlite>();
		   open();
		   Nombre="%"+Nombre+"%";
			  String[]args=new String[]{Nombre};		  
			  String Consulta="Select caso_id,idcuestionario,EIPK001.Nombre,carne,CuestionariosNom.Nombre FROM EIPK001 INNER JOIN CuestionariosNom ON EIPK001.idcuestionario"
			  		+ "=CuestionariosNom.cuestionario_id where EIPK001.Nombre LIKE ?";
			  Cursor c=db.rawQuery(Consulta, args);
			  if (c.moveToFirst()) {
					/*Recorremos el cursor hasta que no haya más registros*/
					do {
					String id = c.getString(0);
					String idcuest=c.getString(1);
					String NombreHospr = c.getString(2);
					String Semana=c.getString(3);		
					String nombr=c.getString(4);
					
					BusquedaSqlite s=new BusquedaSqlite(id, idcuest, NombreHospr,Semana,nombr,"");
					lista.add(s);
					} while(c.moveToNext());
				  
			      }
			  return lista;			  
	   }
	   
	   
	   
	   public void BorraBD()throws Exception
	   {
		   db.execSQL("Delete database CuestionariosBD");
	   }
	   
	   public String BorrarCuest(String caso_id)
	   {
		   String Res="";
		   open();
		   
		   db.delete("Antibioticos","caso_id=?",new String[] {caso_id});
		   db.delete("ConsumoMed","caso_id=?",new String[] {caso_id});
		   db.delete("DatosCaso","caso_id=?", new String[] {caso_id});
		   db.delete("EnfResp001","caso_id=?", new String[] {caso_id});
		   db.delete("EnfResp002","caso_id=?", new String[]{caso_id});
		   db.delete("EnfResp003","caso_id=?", new String[] {caso_id});
		   db.delete("EnfResp004","caso_id=?", new String[] {caso_id});
		   db.delete("EnfResp005","caso_id=?", new String[] {caso_id});
		   db.delete("EnfResp006","caso_id=?", new String[] {caso_id});
		   db.delete("EnfResp007","caso_id=?", new String[] {caso_id});
		   db.delete("EnfResp008","caso_id=?", new String[] {caso_id});
		   db.delete("EnfResp009","caso_id=?", new String[] {caso_id});
		   db.delete("HospitalServicio","caso_id=?", new String[]{caso_id});
		   db.delete("Responsable","caso_id=?", new String[]{caso_id});
		   db.delete("Susceptibilidad","caso_id=?", new String[]{caso_id});
		   db.delete("Vacunacion","caso_id=?", new String[] {caso_id});
		   
		   db.delete("Menig001","caso_id=?", new String[]{caso_id});
		   db.delete("Mening002","caso_id=?", new String[]{caso_id});
		   db.delete("Mening003","caso_id=?", new String[]{caso_id});
		   db.delete("Mening004","caso_id=?", new String[]{caso_id});
		   db.delete("Mening005","caso_id=?", new String[]{caso_id});
		   db.delete("Mening006","caso_id=?", new String[]{caso_id});
		   db.delete("Mening007","caso_id=?", new String[]{caso_id});
		   
		   db.delete("Aps001","caso_id=?", new String[]{caso_id});
		   db.delete("Aps002","caso_id=?", new String[]{caso_id});
		   db.delete("Aps003","caso_id=?", new String[]{caso_id});
		   db.delete("Aps004","caso_id=?", new String[]{caso_id});
		   db.delete("Aps005","caso_id=?", new String[]{caso_id});
		   
		   Res="Cuesionario Eliminado";
		   close();
		   return Res;
	   }
	   
	   public String BorrarDatosHospCUest(String datos_id)
	   {
		   String Res="";
		   open();
		   db.delete("DatosHosp","datos_id=?",new String[] {datos_id});
		   db.delete("DatosHosp001","datos_id=?",new String[] {datos_id});
		   db.delete("DatosHosp002","datos_id=?",new String[] {datos_id});
		   db.delete("DatosHosp003","datos_id=?",new String[] {datos_id});
		   db.delete("GrupoEdades","datos_id=?",new String[] {datos_id});
		   
		   Res="Cuesionario Eliminado";
		   close();
		   return Res;
	   }
	   
	   public String BorrarAps(String datos_id)
	   {
		  String Res="";
	      open();
	      db.delete("DatosAps","datos_id=?",new String[] {datos_id});
	      Res="Cuesionario Eliminado";
	      close();
	      return Res;
		   
	   }
	   
	   public String BorrarIPK(String datos_id)
	   {
		  String Res="";
	      open();
	      db.delete("EIPK001","caso_id=?",new String[] {datos_id});
	      db.delete("EIPK002","caso_id=?",new String[] {datos_id});
	      db.delete("EIPK003","caso_id=?",new String[] {datos_id});
	      db.delete("EIPK004","caso_id=?",new String[] {datos_id});
	      Res="Cuesionario Eliminado";
	      close();
	      return Res;
		   
	   }
	   
	   
	   /*Selects*/
	   public DatosCaso SelectDatosCaso(String caso_id,DatosCaso tipo)
	   {
		   open();
		   DatosCaso fin=tipo.selectDatosCaso(caso_id, db);
		   close();
		   return fin;
	   }
	   
	   public HospitalServicio SelectHospServ(long caso_id,HospitalServicio tipo)
	   {
		   open();
		   HospitalServicio fin=tipo.selectHospitalServicio(caso_id, db);
		   close();
		   return fin;
	   }
	   
	   public EnfResp001 Select001(long caso_id,EnfResp001 tipo)
	   {
		   open();
		   EnfResp001 fin=tipo.selectEnfResp001(caso_id, db);
		   close();
		   return fin;
	   }
	   
	  
	  
	   public VacunacionEnt SelectVac(long caso_id,VacunacionEnt tipo)
	   {
		   open();
		   VacunacionEnt fin=tipo.selectVacunacionEnt(String.valueOf(caso_id), db);
		   close();
		   return fin;
	   }
	   
	   public ArrayList<Antibioticos> SelecAtns(long caso_id,Antibioticos tipo)
	   {
		   open();
		   ArrayList<Antibioticos> fin=tipo.selectAntibioticos(String.valueOf(caso_id), db);
		   close();
		   return fin;
	   }
	   
	
	   
	 
	  
	   
	   public EnfResp008 Select006(long caso_id,EnfResp008 tipo)
	   {
		   open();
		   EnfResp008 fin=tipo.selectEnfResp006Ent(String.valueOf(caso_id), db);
		   close();
		   return fin;
	   }
	   
	   public EnfResp009 Select007(long caso_id,EnfResp009 tipo)
	   {
		   open();
		   EnfResp009 fin=tipo.selectEnfResp007Ent(String.valueOf(caso_id), db);
		   close();
		   return fin;
	   }
	   
	   public ResponsableEnt SelectResp(String caso_id,ResponsableEnt tipo)
	   {
		   open();
		   ResponsableEnt fin=tipo.selectResp(caso_id, db);
		   close();
		   return fin;
	   }
	
	  
	   
	  
	   
	    


}
