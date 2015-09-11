package com.app.neumocuest;
import java.util.ArrayList;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Cuestionarios extends Activity implements OnItemClickListener {

	
	
	Intent intent;
	ListView lista;
    Context c;
  
    private ProgressDialog progressDialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cuestionarios);
       c=this;
       lista=(ListView)findViewById(R.id.listView1);
       ArrayList<String > mostrar=new ArrayList<String>();
       mostrar.add("Formulario Caso/Defunción hospitalizado de IRAG y otras Enfermedades Respiratorias");
       mostrar.add("Formulario Casos/Defunción hospitalizado de Meningitis");
       mostrar.add("Formulario Datos estadísticos y epidemiológicos hospitalarios ");
       mostrar.add("Formulario Caso de Enfermedad Respiratoria atendido en la APS ");
       mostrar.add("Formulario Datos estadísticos y epidemiológicos de la APS ");
       mostrar.add("Modelo de recolección de Datos para el trabajo en el IPK");
       ListAdapter a=new ArrayAdapter<String>(this,R.drawable.cuestionarlist,mostrar);	         
	    lista.setAdapter(a);
       lista.setOnItemClickListener(this);
	   
	    
		
		
	}
	
	
  


	
	 int psogreso=0;
	 int paso=100;
	
	 
	 private void cuentaAtras(final long milisegundos,final Intent y){
		    
		    CountDownTimer mCountDownTimer;
		    progressDialog.setMax(100);
		    psogreso=0;
		    progressDialog.setProgress(paso);
		    final String [] puntos={".","..","..."};
		    mCountDownTimer=new CountDownTimer(milisegundos, paso) {
		     int cont=0;  
		        @Override
		        public void onTick(long millisUntilFinished) {
		        	
		        	psogreso+=paso;
		        	progressDialog.setTitle("Cargando"+puntos[cont]);
		        	
		        	progressDialog.setProgress((psogreso*100)/(int)milisegundos);
		        	cont++;
		        	if(cont==3)
		        		cont=0;
		        }

		        @Override
		        public void onFinish() {	        
		          
		        	psogreso+= paso;
		        	progressDialog.setProgress(psogreso);
		        	
			         startActivityForResult(y,157);
		        };
		    };
		        mCountDownTimer.start();
		       
		    
	 }
	
	 @Override
	    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	        super.onActivityResult(requestCode, resultCode, data);
	       
	        progressDialog.dismiss();
	    }




	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.listView1)
		{
			if(arg2==0)
			{

			    progressDialog=new ProgressDialog(c);		 			 	  
		 	    progressDialog.setTitle("Cargando");
		 	    progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);	
		 	    progressDialog.setMessage("Preparando Cuestionario.Por favor Espere.");
		 	    progressDialog.setCanceledOnTouchOutside(false);
		 		progressDialog.setProgress(0);
		 	    progressDialog.show();
		 	    Intent i =new Intent("com.app.neumocuest.ENFRESPPRINC");	
		 	    cuentaAtras(2000,i);
			}
			
			if(arg2==1)
			{
				    progressDialog=new ProgressDialog(c);		 			 	  
			 	    progressDialog.setTitle("Cargando");
			 	    progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);	
			 	    progressDialog.setMessage("Preparando Cuestionario.Por favor Espere.");
			 	    progressDialog.setCanceledOnTouchOutside(false);
			 		progressDialog.setProgress(0);
			 	    progressDialog.show();
			 	    Intent i =new Intent("com.app.neumocuest.MENINGPRINC");	
			 	    cuentaAtras(2000,i);
				
			}
			if(arg2==2)
			{

			    progressDialog=new ProgressDialog(c);		 			 	  
		 	    progressDialog.setTitle("Cargando");
		 	    progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);	
		 	    progressDialog.setMessage("Preparando Cuestionario.Por favor Espere.");
		 	    progressDialog.setCanceledOnTouchOutside(false);
		 		progressDialog.setProgress(0);
		 	    progressDialog.show();
		 	    Intent i =new Intent("com.app.neumocuest.DATOSHOSP");	
		 	    cuentaAtras(2000,i);
			}
			if(arg2==3)
			{

			    progressDialog=new ProgressDialog(c);		 			 	  
		 	    progressDialog.setTitle("Cargando");
		 	    progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);	
		 	    progressDialog.setMessage("Preparando Cuestionario.Por favor Espere.");
		 	    progressDialog.setCanceledOnTouchOutside(false);
		 		progressDialog.setProgress(0);
		 	    progressDialog.show();
		 	    Intent i =new Intent("com.app.neumocuest.APSCONT");	
		 	    cuentaAtras(2000,i);
			}
			
			
			if(arg2==4)
			{

			    progressDialog=new ProgressDialog(c);		 			 	  
		 	    progressDialog.setTitle("Cargando");
		 	    progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);	
		 	    progressDialog.setMessage("Preparando Cuestionario.Por favor Espere.");
		 	    progressDialog.setCanceledOnTouchOutside(false);
		 		progressDialog.setProgress(0);
		 	    progressDialog.show();
		 	    Intent i =new Intent("com.app.neumocuest.DATOSAPS");	
		 	    cuentaAtras(2000,i);
			}
			
			if(arg2==5)
			{
				  progressDialog=new ProgressDialog(c);		 			 	  
			 	    progressDialog.setTitle("Cargando");
			 	    progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);	
			 	    progressDialog.setMessage("Preparando Cuestionario.Por favor Espere.");
			 	    progressDialog.setCanceledOnTouchOutside(false);
			 		progressDialog.setProgress(0);
			 	    progressDialog.show();
			 	    Intent i =new Intent("com.app.neumocuest.IPKCONT");	
			 	    cuentaAtras(2000,i);
			}
		}
	}
	 
	
	

}


