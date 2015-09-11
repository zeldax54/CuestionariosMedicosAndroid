package sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.app.neumocuest.R;

public class SqlitePrinc extends SQLiteOpenHelper{

	public SqlitePrinc(Context context) {
		super(context, "CuestionariosBD", null, 1);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		  CuestionariosNom cn=new CuestionariosNom();
		  db.execSQL(cn.Crear());
		  /**/
		  CuestionariosNom c1=new CuestionariosNom(1, "Formulario Caso/Defunción hospitalizado "
		  		+ "de IRAG y otras Enfermedades Respiratorias");
		  CuestionariosNom c2=new CuestionariosNom(2, "Formulario. Casos/Defunción hospitalizado de "
		  		+ "Meningitis");
		  CuestionariosNom c3=new CuestionariosNom(3, "Formulario Datos estadísticos y epidemiológicos "
		  		+ "hospitalarios");
		  CuestionariosNom c4=new CuestionariosNom(4, "Formulario Caso de Enfermedad Respiratoria atendido en la APS");
		  CuestionariosNom c5=new CuestionariosNom(5, "Formulario Datos Estadísticos y Epidemiológicos de la APS");
		  CuestionariosNom c6=new CuestionariosNom(6, "Modelo de Recolección de Datos sobre Muestras para el diagnóstico microbiológico o envío de de cepas para el trabajo de referencia nacional en el IPK ");
		    cn.insert(c1, db); cn.insert(c2, db); cn.insert(c3, db); cn.insert(c4, db); cn.insert(c5, db); cn.insert(c6, db);
		  /**/
		  
		  DatosCaso dc=new DatosCaso();
		  db.execSQL(dc.Crear());
		  
	      HospitalServicio hs=new HospitalServicio();
	      db.execSQL(hs.Crear());
	      
	      Susceptibilidad sa= new Susceptibilidad();
	      db.execSQL(sa.Crear());
	    
	      VacunacionEnt v= new VacunacionEnt();
	      db.execSQL(v.Crear());
	      
		  ResponsableEnt r=new ResponsableEnt();
		  db.execSQL(r.Crear());
		  
		  EnfResp001 er1=new EnfResp001();
		  db.execSQL(er1.Crear());
		  
		  EnfResp002 er2=new EnfResp002();
		  db.execSQL(er2.Crear());
		  
		  EnfResp003 er3=new EnfResp003();
		  db.execSQL(er3.Crear());
		  
		  EnfResp004 er4=new EnfResp004();
		  db.execSQL(er4.Crear());
		  
		  EnfResp005 er5=new EnfResp005();
		  db.execSQL(er5.Crear());
		  
		  EnfResp006 er6=new EnfResp006();
		  db.execSQL(er6.Crear());

	      Antibioticos ae=new Antibioticos();
	      db.execSQL(ae.Create());
	      
	      ConsumoMedicamentos med=new ConsumoMedicamentos();
	      db.execSQL(med.Create());      
	      
		  EnfResp007 er7=new EnfResp007();
		  db.execSQL(er7.Crear());
		  
		  EnfResp008 er8=new EnfResp008();
		  db.execSQL(er8.Crear());
		  
		  EnfResp009 er9=new EnfResp009();
		  db.execSQL(er9.Crear());
		  
		  /*Mening*/
		  Mening001 m1=new Mening001();
		  db.execSQL(m1.Crear());
		  m1=null;
		  
		  Mening002 m2=new Mening002();
		  db.execSQL(m2.Crear());
		  m2=null;
		  
		  Mening003 m3=new Mening003();
		  db.execSQL(m3.Crear());
		  m3=null;
		  
		  Mening004 m4=new Mening004();
		  db.execSQL(m4.Crear());
		  m4=null;
		  
		  Mening005 m5=new Mening005();
		  db.execSQL(m5.Crear());
		  m5=null;
		  
		  Mening006 m6=new Mening006();
		  db.execSQL(m6.Crear());
		  m6=null;
		  
		  Mening007 m7=new Mening007();
		  db.execSQL(m7.Crear());
		  m7=null;
		  
		  DatosHospC dh=new DatosHospC();
		  db.execSQL(dh.Crear());
		  dh=null;
		  
		  DatosHosp001 d1=new DatosHosp001();
		  db.execSQL(d1.Crear());
		  d1=null;
		  
		  DatosHosp002 d2=new DatosHosp002();
		  db.execSQL(d2.Crear());
		  d2=null;
		  
		  
		  DatosHosp003 d3=new DatosHosp003();
		  db.execSQL(d3.Crear());
		  d3=null;
		  
		  GrupoEdades ge=new GrupoEdades();
		  db.execSQL(ge.Crear());
		  ge=null;
		  
		  DatosAps da=new DatosAps();
		  db.execSQL(da.Crear());
		  da=null;
		  
		  /*IPK*/
		  EIPK001 ei1=new EIPK001();
		  db.execSQL(ei1.Crear());
		  ei1=null;
		  
		  EIPK002 ei2=new EIPK002();
		  db.execSQL(ei2.Crear());
		  ei2=null;
		  
		  
		  EIPK003 ei3=new EIPK003();
		  db.execSQL(ei3.Crear());
		  ei3=null;
		
		  EIPK004 ei4=new EIPK004();
		  db.execSQL(ei4.Crear());
		  ei4=null;
		  
		  /*APS*/
		  Aps001 a1=new Aps001();
		  db.execSQL(a1.Crear());
		  a1=null;
		  
		  Aps002 a2=new Aps002();
		  db.execSQL(a2.Crear());
		  a2=null;
		  
		  Aps003 a3=new Aps003();
		  db.execSQL(a3.Crear());
		  a3=null;
		  
		  Aps004 a4=new Aps004();
		  db.execSQL(a4.Crear());
		  a4=null;
		  
		  Aps005 a5=new Aps005();
		  db.execSQL(a5.Crear());
		  a5=null;
		  
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub		 
	          db.execSQL("DROP TABLE IF EXISTS CuestionariosNom");
	          db.execSQL("DROP TABLE IF EXISTS DatosCaso");
	          db.execSQL("DROP TABLE IF EXISTS HospitalServicio");
	          db.execSQL("DROP TABLE IF EXISTS SuseptibilidadAntimicrob");
	          db.execSQL("DROP TABLE IF EXISTS Antibioticos");
	          db.execSQL("DROP TABLE IF EXISTS Vacunacion");
	          db.execSQL("DROP TABLE IF EXISTS Responsable");
	          db.execSQL("DROP TABLE IF EXISTS EnfResp001");
	          db.execSQL("DROP TABLE IF EXISTS EnfResp002");
	          db.execSQL("DROP TABLE IF EXISTS EnfResp003");
	          db.execSQL("DROP TABLE IF EXISTS EnfResp004");
	          db.execSQL("DROP TABLE IF EXISTS EnfResp005");
	          db.execSQL("DROP TABLE IF EXISTS EnfResp006");
	          db.execSQL("DROP TABLE IF EXISTS EnfResp007");
	          db.execSQL("DROP TABLE IF EXISTS EnfResp008");
	          db.execSQL("DROP TABLE IF EXISTS EnfResp009");	 
	          
	          db.execSQL("DROP TABLE IF EXISTS Menig001");	 
	          db.execSQL("DROP TABLE IF EXISTS Mening002");	
	          db.execSQL("DROP TABLE IF EXISTS Mening003");	
	          db.execSQL("DROP TABLE IF EXISTS Mening004");	
	          db.execSQL("DROP TABLE IF EXISTS Mening005");	
	          db.execSQL("DROP TABLE IF EXISTS Mening006");	
	          db.execSQL("DROP TABLE IF EXISTS Mening007");	
	          
	          db.execSQL("DROP TABLE IF EXISTS DatosHosp");	
	          db.execSQL("DROP TABLE IF EXISTS DatosHosp001");	
	          db.execSQL("DROP TABLE IF EXISTS DatosHosp002");	
	          db.execSQL("DROP TABLE IF EXISTS DatosHosp003");	
	      	
	          
	          db.execSQL("DROP TABLE IF EXISTS GrupoEdades");
	          db.execSQL("DROP TABLE IF EXISTS DatosAps");
	          
	          db.execSQL("DROP TABLE IF EXISTS EIPK001");
	          db.execSQL("DROP TABLE IF EXISTS EIPK002");
	          db.execSQL("DROP TABLE IF EXISTS EIPK003");
	          db.execSQL("DROP TABLE IF EXISTS EIPK004");
	          
	          db.execSQL("DROP TABLE IF EXISTS Aps001");
	          db.execSQL("DROP TABLE IF EXISTS Aps002");
	          db.execSQL("DROP TABLE IF EXISTS Aps003");
	          db.execSQL("DROP TABLE IF EXISTS Aps004");
	          
	          
	          onCreate(db);
		
	}
	
	
	

}
