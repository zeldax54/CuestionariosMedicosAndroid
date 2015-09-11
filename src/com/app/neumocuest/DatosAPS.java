package com.app.neumocuest;

import sqlite.BDAcceso;
import sqlite.DatosAps;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class DatosAPS extends Activity implements OnClickListener{
	
	ImageButton bfecha;
	ImageButton insert;
	ImageButton act;
	ImageButton canc;
	TextView texto;
	DatosAps ap;
	
	EditText NoSemana;
	EditText Fecha;
	EditText Area;
	EditText CMF;
	EditText TA;
	EditText TAMasNum;
	EditText TAMasPor;
	EditText TAFemNum;
	EditText TAFemPor;
	EditText TAObserv;
	EditText e0_5mNum;
	EditText e0_5mPor;
	EditText e6_11mNum;
	EditText e6_11mPor;
	EditText e12_23mNum;
	EditText e12_23mPor;
	EditText e2_4aNum;
	EditText e2_4aPor;
	EditText e5_9aNum;
	EditText e5_9aPor;
	EditText e10_14aNum;
	EditText e10_14aPor;
	EditText e15_18aNum;
	EditText e15_18aPor;
	EditText e18_24aNum;
	EditText e18_24aPor;
	EditText e25_49aNum;
	EditText e25_49aPor;
	EditText e50_69aNum;
	EditText e50_69aPor;
	EditText e70_masNum;
	EditText e70_masPor;
	EditText Observedades;
	EditText L;
	EditText ViralesNum;
	EditText BactNum;
	EditText ViralesPor;
	EditText BactPor;
	EditText Obserlab;
	EditText Nombreresp;
	
	Bundle vars;


	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.datosaps);
		
		bfecha=(ImageButton)findViewById(R.id.ImageButton01);
		bfecha.setOnClickListener(this);
		Fecha=(EditText)findViewById(R.id.EditText57);
		
		insert=(ImageButton)findViewById(R.id.imageButton1);
		insert.setOnClickListener(this);
		act=(ImageButton)findViewById(R.id.ImageButton02);
		act.setOnClickListener(this);
		act.setVisibility(View.INVISIBLE);
		canc=(ImageButton)findViewById(R.id.imageButton2);
		canc.setOnClickListener(this);
		texto=(TextView)findViewById(R.id.textView1);
		
		NoSemana=(EditText)findViewById(R.id.EditText67);	
		Area=(EditText)findViewById(R.id.EditText51);
		CMF=(EditText)findViewById(R.id.EditText70);
		TA=(EditText)findViewById(R.id.EditText44);
		TAMasNum=(EditText)findViewById(R.id.EditText55);
		TAMasPor=(EditText)findViewById(R.id.EditText50);
		TAFemNum=(EditText)findViewById(R.id.EditText42);
		TAFemPor=(EditText)findViewById(R.id.EditText71);
		TAObserv=(EditText)findViewById(R.id.EditText69);
		
		e0_5mNum=(EditText)findViewById(R.id.EditText40);
		e0_5mPor=(EditText)findViewById(R.id.EditText66);
		e6_11mNum=(EditText)findViewById(R.id.EditText49);
		e6_11mPor=(EditText)findViewById(R.id.EditText37);
		e12_23mNum=(EditText)findViewById(R.id.EditText74);
		e12_23mPor=(EditText)findViewById(R.id.EditText65);
		e2_4aNum=(EditText)findViewById(R.id.EditText56);
		e2_4aPor=(EditText)findViewById(R.id.EditText62);
		e5_9aNum=(EditText)findViewById(R.id.EditText38);
		e5_9aPor=(EditText)findViewById(R.id.EditText60);
		e10_14aNum=(EditText)findViewById(R.id.EditText61);
		e10_14aPor=(EditText)findViewById(R.id.EditText41);
		e15_18aNum=(EditText)findViewById(R.id.EditText59);
		e15_18aPor=(EditText)findViewById(R.id.EditText64);
		e18_24aNum=(EditText)findViewById(R.id.EditText63);
		e18_24aPor=(EditText)findViewById(R.id.EditText72);
		e25_49aNum=(EditText)findViewById(R.id.EditText54);
		e25_49aPor=(EditText)findViewById(R.id.EditText47);
		e50_69aNum=(EditText)findViewById(R.id.EditText43);
		e50_69aPor=(EditText)findViewById(R.id.EditText39);
		e70_masNum=(EditText)findViewById(R.id.EditText73);
		e70_masPor=(EditText)findViewById(R.id.EditText46);		
		Observedades=(EditText)findViewById(R.id.EditText45);
		
		L=(EditText)findViewById(R.id.EditText48);
		ViralesNum=(EditText)findViewById(R.id.EditText75);
		ViralesPor=(EditText)findViewById(R.id.EditText58);
		BactNum=(EditText)findViewById(R.id.EditText53);
		BactPor=(EditText)findViewById(R.id.EditText52);
		Obserlab=(EditText)findViewById(R.id.EditText68);
		Nombreresp=(EditText)findViewById(R.id.EditText06f);

		
	    vars=getIntent().getExtras();
		
		if(vars!=null)
		{
			insert.setVisibility(View.INVISIBLE);
			act.setVisibility(View.VISIBLE);
			texto.setText("Actualizar Cuestionario");
			BDAcceso bd=new BDAcceso(this);
			DatosAps dda=new DatosAps();
			bd.open();			
			dda=dda.selectDatosAps(vars.getString("caso_id"), bd.getBD());
			bd.close();NoSemana.setText(dda.getNoSemana());
			Fecha.setText(dda.getFecha());
			Area.setText(dda.getArea());
			CMF.setText(dda.getCMF());
			TA.setText(dda.getTA());
			TAMasNum.setText(dda.getTAMasNum());
			TAMasPor.setText(dda.getTAMasPor());
			TAFemNum.setText(dda.getTAFemNum());
			TAFemPor.setText(dda.getTAFemPor());
			TAObserv.setText(dda.getTAObserv());
			e0_5mNum.setText(dda.gete0_5mNum());
			e0_5mPor.setText(dda.gete0_5mPor());
			e6_11mNum.setText(dda.gete6_11mNum());
			e6_11mPor.setText(dda.gete6_11mPor());
			e12_23mNum.setText(dda.gete12_23mNum());
			e12_23mPor.setText(dda.gete12_23mPor());
			e2_4aNum.setText(dda.gete2_4aNum());
			e2_4aPor.setText(dda.gete2_4aPor());
			e5_9aNum.setText(dda.gete5_9aNum());
			e5_9aPor.setText(dda.gete5_9aPor());
			e10_14aNum.setText(dda.gete10_14aNum());
			e10_14aPor.setText(dda.gete10_14aPor());
			e15_18aNum.setText(dda.gete15_18aNum());
			e15_18aPor.setText(dda.gete15_18aPor());
			e18_24aNum.setText(dda.gete18_24aNum());
			e18_24aPor.setText(dda.gete18_24aPor());
			e25_49aNum.setText(dda.gete25_49aNum());
			e25_49aPor.setText(dda.gete25_49aPor());
			e50_69aNum.setText(dda.gete50_69aNum());
			e50_69aPor.setText(dda.gete50_69aPor());
			e70_masNum.setText(dda.gete70_masNum());
			e70_masPor.setText(dda.gete70_masPor());
			Observedades.setText(dda.getObservedades());
			L.setText(dda.getL());
			ViralesNum.setText(dda.getViralesNum());
			BactNum.setText(dda.getBactNum());
			ViralesPor.setText(dda.getViralesPor());
			BactPor.setText(dda.getBactPor());
			Obserlab.setText(dda.getObserlab());
			Nombreresp.setText(dda.getNombreresp());

			
		}
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.ImageButton01)
		{
			SelectorFecha s=new SelectorFecha();
			s.InsertFechaView(Fecha,this);
		}
		
		if(arg0.getId()==R.id.imageButton2)
		{

			AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
	        dialogo1.setTitle("Atencion!");  
	        dialogo1.setMessage("Saldra del Cuestionario Sin Salvar los Datos?");            
	        dialogo1.setCancelable(false);  
	        dialogo1.setPositiveButton("Si, Saldre.", new DialogInterface.OnClickListener(){  
	            public void onClick(DialogInterface dialogo1, int id) {  
	                try {
	                	finish(); 
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
	            }  
	        }); 
	        dialogo1.setNegativeButton("No, Me Quedo.", new DialogInterface.OnClickListener() {  
	            public void onClick(DialogInterface dialogo1, int id) {  
	              
	            }  
	        });  
	        dialogo1.show();
		}
		
		
		
		if(arg0.getId()==R.id.imageButton1)
		{
			CreateVars();
			BDAcceso bd=new BDAcceso(this);
			bd.open();
			DatosAps da=new DatosAps();
			da.insert(ap, bd.getBD(), false, null);
			bd.close();
			
			AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
	        dialogo1.setTitle("Mensaje");  
	        dialogo1.setMessage("Ha insertado un Cuestionario con nombre de Area de Salud "+ap.getArea()+" para Editar los Datos o vizualizarlos valla"
	        		+ " a la Seccion Datos de la Pantalla Principal");            
	        dialogo1.setCancelable(false);  
	        dialogo1.setPositiveButton("OK", new DialogInterface.OnClickListener() {  
	            public void onClick(DialogInterface dialogo1, int id) {  
	                try {
						aceptar();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
	            }  
	        });  
	                
	        dialogo1.show();  
			}
		

		if(arg0.getId()==R.id.ImageButton02)
		{
			CreateVars();
			BDAcceso bd=new BDAcceso(this);
			bd.open();
			DatosAps da=new DatosAps();
			ap.setdatos_id(vars.getString("caso_id"));
			da.insert(ap, bd.getBD(), true, vars.getString("caso_id"));
			bd.close();
			
			AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
	        dialogo1.setTitle("Mensaje");  
	        dialogo1.setMessage("Datos Actualizados Exitosamente!!! Para Volver a Editar los Datos o vizualizarlos valla"
	        		+ " a la Seccion Datos de la Pantalla Principal");            
	        dialogo1.setCancelable(false);  
	        dialogo1.setPositiveButton("OK", new DialogInterface.OnClickListener() {  
	            public void onClick(DialogInterface dialogo1, int id) {  
	                try {
						aceptar();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
	            }  
	        });  
	                
	        dialogo1.show();   
		}
		
	
	}
		
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
        dialogo1.setTitle("Importante");  
        dialogo1.setMessage("Si cierra el Cuestionario sin haber guardado los datos estos se Perderán. Desea Cerrar?");            
        dialogo1.setCancelable(false);  
        dialogo1.setPositiveButton("Si", new DialogInterface.OnClickListener() {  
            public void onClick(DialogInterface dialogo1, int id) {  
                aceptar();  
            }  
        });  
        dialogo1.setNegativeButton("No", new DialogInterface.OnClickListener() {  
            public void onClick(DialogInterface dialogo1, int id) {  
                cancelar();
            }  
        });            
        dialogo1.show();   
	}

	public void aceptar() {
		 finish();
    }
    
    public void cancelar() {
       
    }
    
    public void CreateVars()
    {
    ap=new DatosAps("0","5", NoSemana.getText().toString(), Fecha.getText().toString(), Area.getText().toString(), CMF.getText().toString(), TA.getText().toString(), TAMasNum.getText().toString(), TAMasPor.getText().toString(), TAFemNum.getText().toString(), TAFemPor.getText().toString(), TAObserv.getText().toString(), e0_5mNum.getText().toString(), e0_5mPor.getText().toString(), e6_11mNum.getText().toString(), e6_11mPor.getText().toString(), e12_23mNum.getText().toString(), e12_23mPor.getText().toString(), e2_4aNum.getText().toString(), e2_4aPor.getText().toString(), e5_9aNum.getText().toString(), e5_9aPor.getText().toString(), e10_14aNum.getText().toString(), e10_14aPor.getText().toString(), e15_18aNum.getText().toString(), e15_18aPor.getText().toString(), e18_24aNum.getText().toString(), e18_24aPor.getText().toString(), e25_49aNum.getText().toString(), e25_49aPor.getText().toString(), e50_69aNum.getText().toString(), e50_69aPor.getText().toString(), e70_masNum.getText().toString(), e70_masPor.getText().toString(), Observedades.getText().toString(), L.getText().toString(), ViralesNum.getText().toString(), BactNum.getText().toString(), ViralesPor.getText().toString(), BactPor.getText().toString(), Obserlab.getText().toString(), Nombreresp.getText().toString());
    }
  

}
