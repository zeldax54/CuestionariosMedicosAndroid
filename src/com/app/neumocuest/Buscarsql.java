package com.app.neumocuest;

import java.util.ArrayList;

import sqlite.BDAcceso;
import sqlite.BusquedaSqlite;

import com.app.neumocuest.R;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SearchView;

public class Buscarsql extends Fragment implements OnClickListener,OnItemSelectedListener,OnItemClickListener{
	
    SearchView busq;
    SearchView busqfecha;
    SearchView busqaps;
    SearchView ipk;
    
    SearchView cuestestad;
    Button b;
    EditText nomb;
    ListView l;
    ArrayList<BusquedaSqlite> c;
    String idc;
    String idcuest;
    int pos;
    ArrayList<String> mostrar;
    View rootview;
    private ProgressDialog progressDialog;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		
		
		rootview = inflater.inflate(R.layout.buscarsql, container,false);	
		
		busq=(SearchView)rootview.findViewById(R.id.searchView1t1);		
		busq.setQueryHint("Nombre");
		busq.setOnQueryTextListener(new OnQueryTextListener() 
		{ 
			@Override
           public boolean onQueryTextSubmit(String query) {
            // TODO Auto-generated method stub
				return false;
				}
			 @Override
             public boolean onQueryTextChange(String newText) {

          // TODO Auto-generated method stub
				 BDAcceso bd=new BDAcceso(rootview.getContext());
					l.setAdapter(null);
					
					c=bd.BuscarXNombre(newText,true);
					if(c.size()!=0)
					{
					    mostrar=new ArrayList<String>();
						for(int i=0;i<c.size();i++)
						{
							mostrar.add("Paciente: "+c.get(i).getresult1()+". Cuestionario: "+c.get(i).getresult3());
						}
						ListAdapter a=new ArrayAdapter<String>(rootview.getContext(),R.drawable.list,mostrar);
						l.setAdapter(a);
					}
					
       return false; 
       } 
			 });    
		
		busqfecha=(SearchView)rootview.findViewById(R.id.SearchView01);
		busqfecha.setQueryHint("Busqueda por fecha");    
	
		busqfecha.setOnQueryTextListener(new OnQueryTextListener() 
		{ 
			@Override
           public boolean onQueryTextSubmit(String query) {
            // TODO Auto-generated method stub
				return false;
				}
			 @Override
             public boolean onQueryTextChange(String newText) {

          // TODO Auto-generated method stub
				    BDAcceso bd=new BDAcceso(rootview.getContext());
				    l.setAdapter(null);					
					c=bd.BuscarXNombre(newText,false);
					if(c.size()!=0)
					{
					    mostrar=new ArrayList<String>();
						for(int i=0;i<c.size();i++)
						{
							mostrar.add("PACIENTE: "+c.get(i).getresult1()+". FECHA DE CONSULTA:"+c.get(i).getresult4()+". CUESTIONARIO: "+c.get(i).getresult3());
						}
						ListAdapter a=new ArrayAdapter<String>(rootview.getContext(),R.drawable.listabusq,mostrar);
						l.setAdapter(a);
					}
					
       return false; 
       }
			 
			 });    


		cuestestad=(SearchView)rootview.findViewById(R.id.SearchView02);	
		
		cuestestad.setOnQueryTextListener(new OnQueryTextListener() 
		{ 
			@Override
           public boolean onQueryTextSubmit(String query) {
            // TODO Auto-generated method stub
				return false;
				}
			 @Override
             public boolean onQueryTextChange(String newText) {

          // TODO Auto-generated method stub
				    BDAcceso bd=new BDAcceso(rootview.getContext());
				    l.setAdapter(null);					
					c=bd.BuscarDatosHosp(newText);
					if(c.size()!=0)
					{
						 mostrar=new ArrayList<String>();
						for(int i=0;i<c.size();i++)
						{
							mostrar.add("Semana Estadística: "+c.get(i).getresult2()+". Hospital:"+c.get(i).getresult3()+". CUESTIONARIO: "+c.get(i).getresult4());
						}
						ListAdapter a=new ArrayAdapter<String>(rootview.getContext(),R.drawable.listabusq,mostrar);
						l.setAdapter(a);
					}
					
       return false; 
       }
		
			 });    

busqaps=(SearchView)rootview.findViewById(R.id.SearchView03);	   
busqaps.setQueryHint("Num Semana Estadistica");    		
busqaps.setOnQueryTextListener(new OnQueryTextListener() 
		{ 
			@Override
           public boolean onQueryTextSubmit(String query) {
            // TODO Auto-generated method stub
				return false;
				}
			 @Override
             public boolean onQueryTextChange(String newText) {

          // TODO Auto-generated method stub
				    BDAcceso bd=new BDAcceso(rootview.getContext());
				    l.setAdapter(null);					
					c=bd.BuscarAps(newText);
					if(c.size()!=0)
					{
						 mostrar=new ArrayList<String>();
						for(int i=0;i<c.size();i++)
						{
							mostrar.add("Semana Estadística: "+c.get(i).getresult2()+". Area:"+c.get(i).getresult3()+". CUESTIONARIO: "+c.get(i).getresult4());
						}
						ListAdapter a=new ArrayAdapter<String>(rootview.getContext(),R.drawable.listabusq,mostrar);
						l.setAdapter(a);
					}
					
       return false; 
       }
		
			 });    
ipk=(SearchView)rootview.findViewById(R.id.SearchView04);	   
ipk.setQueryHint("Nombre Paciente");    		
ipk.setOnQueryTextListener(new OnQueryTextListener() 
		{ 
			@Override
           public boolean onQueryTextSubmit(String query) {
            // TODO Auto-generated method stub
				return false;
				}
			 @Override
             public boolean onQueryTextChange(String newText) {

          // TODO Auto-generated method stub
				    BDAcceso bd=new BDAcceso(rootview.getContext());
				    l.setAdapter(null);					
					c=bd.BuscarIPK(newText);
					if(c.size()!=0)
					{
						 mostrar=new ArrayList<String>();
						for(int i=0;i<c.size();i++)
						{
							mostrar.add("Nombre: "+c.get(i).getresult2()+". CI:"+c.get(i).getresult3()+". CUESTIONARIO: "+c.get(i).getresult4());
						}
						ListAdapter a=new ArrayAdapter<String>(rootview.getContext(),R.drawable.listabusq,mostrar);
						l.setAdapter(a);
					}
					
       return false; 
       }
		
			 });    
	
	
		l=(ListView)rootview.findViewById(R.id.listView1);
		l.setOnItemClickListener(this);
		return rootview;
	}

	
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		


		
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.listView1)
		{
			 idc=c.get(arg2).getid();
			 idcuest=c.get(arg2).getresult5();
			 if(idcuest=="")
			 {
				 idcuest=c.get(arg2).getresult1();
			 }
			
			  
				pos=arg2;
				AlertDialog.Builder dialogo1 = new AlertDialog.Builder(rootview.getContext());
		        dialogo1.setTitle("Mensaje");  
		        if(idcuest.equals("3"))
		        {
		        	dialogo1.setMessage("Ha Seleccionado un Cuestionario Estadístico con Nombre de Hospital: "+c.get(arg2).getresult3()+". Que desea hacer?");  
		        }
		        
		        else
		        	
		        {
		        dialogo1.setMessage("Ha Seleccionado un Cuestionario con nombre de Paciente "+c.get(arg2).getresult1()+". Que desea hacer?");          
		        }
		        dialogo1.setPositiveButton("Ver/Editar Cuestionario", new DialogInterface.OnClickListener() {  
		           
		        	public void onClick(DialogInterface dialogo1, int id) {  		            	
		    			Bundle vars=new Bundle();
		    			boolean bandera=true;
		    			vars.putString("caso_id", idc);		    		
		    			vars.putBoolean("bandera", bandera);
		    			
		    			progressDialog=new ProgressDialog(rootview.getContext());		 			 	  
		 		 	    progressDialog.setTitle("Cargando");
		 		 	    progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);	
		 		 	    progressDialog.setMessage("Recuperando Cuestionario.Por favor Espere.");
		 		 	    progressDialog.setCanceledOnTouchOutside(false);
		 		 		progressDialog.setProgress(0);
		 		 	    progressDialog.show();
		    			
		    			
		    			
		    			
		    			
		    			
		    			if(idcuest.equals("1"))
		    			{
		    	    	Intent intentenfresp=new Intent("com.app.neumocuest.ENFRESPSHOW");
		    			intentenfresp.putExtras(vars);
		    			cuentaAtras(2000, intentenfresp);
		            	
		    			}
		    			if(idcuest.equals("2"))
		    			{
		    				Intent intentmening=new Intent("com.app.neumocuest.MENINGPRINC");
		    				intentmening.putExtras(vars);
			    			cuentaAtras(2000, intentmening);
		    			}
		    			if(idcuest.equals("3"))
		    			{
		    				Intent intentdatoshosp=new Intent("com.app.neumocuest.DATOSHOSP");
		    				intentdatoshosp.putExtras(vars);
			    			cuentaAtras(2000, intentdatoshosp);
		    			}
		    			
		    			if(idcuest.equals("4"))
		    			{
		    				Intent intentdatoshosp=new Intent("com.app.neumocuest.APSCONT");
		    				intentdatoshosp.putExtras(vars);
			    			cuentaAtras(2000, intentdatoshosp);
		    			}
		    			
		    			if(idcuest.equals("5"))
		    			{
		    				Intent intentdatosaps=new Intent("com.app.neumocuest.DATOSAPS");
		    				intentdatosaps.putExtras(vars);
			    			cuentaAtras(2000, intentdatosaps);
		    			}
		    			if(idcuest.equals("6"))
		    			{
		    				Intent intentipk=new Intent("com.app.neumocuest.IPKCONT");
		    				intentipk.putExtras(vars);
			    			cuentaAtras(2000, intentipk);
		    			}
		            }  
		        });  
		        dialogo1.setNegativeButton("Eliminar Cuestionario", new DialogInterface.OnClickListener() {  
		            public void onClick(DialogInterface dialogo1, int id) {  
		                try {
		                	if(idcuest.equals("3"))
		                		Eliminar("3");
		                	if(idcuest.equals("1")||idcuest.equals("2")||idcuest.equals("4"))
							  Eliminar("1");
		                	if(idcuest.equals("5"))
		                		Eliminar("5");
		                	if(idcuest.equals("6"))
		                		Eliminar("6");
						} catch (Throwable e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}  
		            }  
		        });     
		        dialogo1.setNeutralButton("Nada", new DialogInterface.OnClickListener() {  
		            public void onClick(DialogInterface dialogo1, int id) {  
		               
		            }  
		        });     
		        dialogo1.show();   
			}
 
			
		
			 
	     }
	
	
	public void Eliminar(final String idcuest) {			
		 AlertDialog.Builder dialogo2 = new AlertDialog.Builder(rootview.getContext());
		 dialogo2.setTitle("Mensaje");  
	     dialogo2.setMessage("Estos datos quedaran ELIMINADOS. Esta accion no se puede deshacer.Desea proceder?");          
		 dialogo2.setPositiveButton("Si", new DialogInterface.OnClickListener(){  
            public void onClick(DialogInterface dialogo2, int id) {  
            	
                  
                	BDAcceso bd=new BDAcceso(rootview.getContext());
                	String x="";
                	if(idcuest.equals("5"))
                	{
                		x=bd.BorrarAps(idc);
                	}
                	if(idcuest.equals("3"))
                	{
                		x=bd.BorrarDatosHospCUest(idc);
                	}
                	if(idcuest.equals("1")||idcuest.equals("2")||idcuest.equals("4"))
                	{
			    	x=bd.BorrarCuest(idc);		
                	}
                	if(idcuest.equals("6"))
                	{
                		x=bd.BorrarIPK(idc);
                	}
                	
					Toast t=Toast.makeText(rootview.getContext(),x,Toast.LENGTH_SHORT);
					t.show();
					int a1=pos;
					ArrayList<String>xx=mostrar;
					 ArrayList<BusquedaSqlite> c1=c;
					c.remove(pos);
					mostrar.remove(pos);
					ListAdapter a=new ArrayAdapter<String>(rootview.getContext(),R.drawable.list,mostrar);
					l.setAdapter(a);
				
            }  
        });  
         dialogo2.setNegativeButton("No", new DialogInterface.OnClickListener() {  
            public void onClick(DialogInterface dialogo2, int id) {              	
        		dialogo2.dismiss();
            }  
        });     
		  dialogo2.show(); 
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
	        	progressDialog.setTitle("Recuperando Datos"+puntos[cont]);
	        	
	        	progressDialog.setProgress((psogreso*100)/(int)milisegundos);
	        	cont++;
	        	if(cont==3)
	        	{
	        		cont=0;
	        	}
	        }

	        @Override
	        public void onFinish() {	        
	          
	        	psogreso+= paso;
	        	progressDialog.setProgress(psogreso);
	        	
		         startActivityForResult(y,175);
	        };
	    };
	        mCountDownTimer.start();
	       
	    
 }
	
		 @Override
		public void onActivityResult(int requestCode, int resultCode, Intent data) {
		        super.onActivityResult(requestCode, resultCode, data);
		       
		        progressDialog.dismiss();
		    }


}
