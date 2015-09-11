package CustomFragments;

import java.util.ArrayList;
import java.util.List;

import sqlite.BDAcceso;
import sqlite.DatosHosp001;
import sqlite.DatosHosp002;
import sqlite.DatosHosp003;
import sqlite.DatosHospC;
import sqlite.GrupoEdades;
import sqlite.ResponsableEnt;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

public class FDatosHospControl extends Fragment implements OnClickListener{
	
	 View rootView;
	 ImageButton insertar;
		ImageButton cancelar;
		ImageButton actualizar;
		EditText responsable;
		TextView pieboton;
		EditText fecha;
		ImageButton bfecha;
		
		String datos_id;
		
		
	public static FDatosHospControl newInstance() {
		FDatosHospControl frag = new FDatosHospControl();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	  		
		
		frag.setArguments(args);
		
		return frag;
	}
	
	public static FDatosHospControl newInstanceArgs(String caso_id) {
		FDatosHospControl frag = new FDatosHospControl();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		args.putString("caso_id", caso_id);
		frag.setArguments(args);
		
		return frag;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	   rootView = inflater.inflate(R.layout.meningcontrol, container,false);	
	   insertar=(ImageButton)rootView.findViewById(R.id.imageButton1);
	    insertar.setOnClickListener(this);
	    cancelar=(ImageButton)rootView.findViewById(R.id.imageButton2);
	    cancelar.setOnClickListener(this);
	    actualizar=(ImageButton)rootView.findViewById(R.id.ImageButton01);
	    actualizar.setOnClickListener(this);
	    actualizar.setVisibility(View.INVISIBLE);
	    responsable=(EditText)rootView.findViewById(R.id.EditText06f);
	    pieboton=(TextView)rootView.findViewById(R.id.textView1);
	    fecha=(EditText)rootView.findViewById(R.id.EditText02);
	    bfecha=(ImageButton)rootView.findViewById(R.id.ImageButton02);
	    bfecha.setOnClickListener(this);
	    if(getArguments().isEmpty()==false)
	    {
	    	datos_id=getArguments().getString("caso_id");
	    	insertar.setVisibility(View.INVISIBLE);
	    	pieboton.setText("Actualizar Custionario");
	    	actualizar.setVisibility(View.VISIBLE);
	       
	    	 BDAcceso bd=new BDAcceso(rootView.getContext());
	    		bd.open();
	    		DatosHosp003 d3=new DatosHosp003();
	    		d3=d3.selectDatosHosp003(getArguments().getString("caso_id"), bd.getBD());
	    		bd.close();
	    		responsable.setText(d3.getResponsible());
	    		fecha.setText(d3.getFecha());
	       getArguments().clear();
	       
	    }
	   return rootView;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.imageButton2)
		{
			AlertDialog.Builder dialogo1 = new AlertDialog.Builder(rootView.getContext());
	        dialogo1.setTitle("Atencion!");  
	        dialogo1.setMessage("Saldra del Cuestionario Sin Salvar los Datos?");            
	        dialogo1.setCancelable(false);  
	        dialogo1.setPositiveButton("Si, Saldre.", new DialogInterface.OnClickListener(){  
	            public void onClick(DialogInterface dialogo1, int id) {  
	                try {
	                	 getActivity().finish(); 
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

		if(arg0.getId()==R.id.ImageButton02)
		{
		 SelectorFecha s=new SelectorFecha();
		 s.InsertFecha(fecha, rootView);
		 s=null;
		}
		
		
	       if(arg0.getId()==R.id.imageButton1||arg0.getId()==R.id.ImageButton01) 
	       {
	    	   List<Fragment> lista=  getFragmentManager().getFragments();		
	    	   FDatosHosp dh=(FDatosHosp)lista.get(0);
	    	   FDatosHosp001 dh1=(FDatosHosp001)lista.get(1);
	    	   FDatosHosp002 dh2=(FDatosHosp002)lista.get(2);
	    	   FDatosHosp003 dh3=(FDatosHosp003)lista.get(3);
	    	   
	    	   if(arg0.getId()==R.id.imageButton1)
	           {
	        	   try
	    			{
	    		    		
	    				Inserciones(dh,dh1,dh2,dh3,false,datos_id);	
	    				
	    				
	    	            }
	    			catch (Exception e)
	    			{
	    			Toast t=Toast.makeText(rootView.getContext(),e.getMessage(), Toast.LENGTH_LONG);
	    		    t.show();
	    			
	    			}
	           }
	    	   if(arg0.getId()==R.id.ImageButton01)
	   		{
	   			
	   			try {
	   				Inserciones(dh,dh1,dh2,dh3,true,String.valueOf(datos_id));
	   			} catch (Exception e) {
	   				Toast t=Toast.makeText(rootView.getContext(),e.getMessage(), Toast.LENGTH_LONG);
	   			    t.show();
	   			}
	   		}
	       }
	}
	
	
	public void Inserciones(FDatosHosp dh,FDatosHosp001 dh1,FDatosHosp002 dh2,FDatosHosp003 dh3,boolean bandera,String datos_id) throws Exception
	{
		dh.CreateVars("3");
		dh1.CreateVars();
		dh2.CreateVars();
		dh3.CreateVars();

		BDAcceso bd=new BDAcceso(rootView.getContext());	
		long id=0;
		if(bandera==false)
		{
			/*DatosHosp*/
			DatosHospC ddh=new DatosHospC();
			bd.open();
			id=ddh.insertDatosHosp(dh.dh, bd.getBD(), false, null);
		
			/*Grupo Edades DH*/
			GrupoEdades ge=new GrupoEdades();
			dh.gTA.setdatos_id(String.valueOf(id));
			ge.insertGrupoEdades(dh.gTA, bd.getBD(), false, null,null);	
			
			
			dh.gTH.setdatos_id(String.valueOf(id));
			ge.insertGrupoEdades(dh.gTH, bd.getBD(), false, null,null);		
			
		
			dh.gTH_I.setdatos_id(String.valueOf(id));
			ge.insertGrupoEdades(dh.gTH_I, bd.getBD(), false, null,null);		
			
			
			dh.gTH_N.setdatos_id(String.valueOf(id));
			ge.insertGrupoEdades(dh.gTH_N, bd.getBD(), false, null,null);	
			
		
			dh.gTH_M.setdatos_id(String.valueOf(id));
			ge.insertGrupoEdades(dh.gTH_M, bd.getBD(), false, null,null);	
			
			
			dh.gTH_B.setdatos_id(String.valueOf(id));
			ge.insertGrupoEdades(dh.gTH_B, bd.getBD(), false, null,null);	
			
			
			dh.gTH_O.setdatos_id(String.valueOf(id));
			ge.insertGrupoEdades(dh.gTH_O, bd.getBD(), false, null,null);				
			
		
			dh.gTH_If.setdatos_id(String.valueOf(id));
			ge.insertGrupoEdades(dh.gTH_If, bd.getBD(), false, null,null);	
			
			/*DH001*/
			DatosHosp001 dd1=new DatosHosp001();
			dh1.dh1.setdatos_id(String.valueOf(id));
			dd1.insertDatosHosp001(dh1.dh1, bd.getBD(), false, null);
			
			/*Edades DH1*/
			ArrayList<GrupoEdades> l1=dh1.lista;
			for(int i=0;i<l1.size();i++)
			{
				l1.get(i).setdatos_id(String.valueOf(id));
				ge.insertGrupoEdades(l1.get(i), bd.getBD(),false, null, null);
			}
			
			/*dH002*/
			DatosHosp002 dd2=new DatosHosp002();
			dh2.dh2.setdatos_id(String.valueOf(id));
			dd2.insertDatosHosp002(dh2.dh2, bd.getBD(), false, null);
			/*Edades DH1*/
			ArrayList<GrupoEdades> l2=dh2.lista;
			for(int i=0;i<l2.size();i++)
			{
				l2.get(i).setdatos_id(String.valueOf(id));
				ge.insertGrupoEdades(l2.get(i), bd.getBD(),false, null, null);
			}
			
			/*DH003-Fin*/
			DatosHosp003 dd3=new DatosHosp003();
			dh3.d3.setdatos_id(String.valueOf(id));
			dh3.d3.setResponsible(responsable.getText().toString());
			dh3.d3.setFecha(fecha.getText().toString());
			dd3.insertDatosHosp003(dh3.d3, bd.getBD(), false, null);
			
			bd.close();	
			/**/
		      
		}
		else
		{
			/*DatosHosp*/
			DatosHospC ddh=new DatosHospC();
			bd.open();
			dh.dh.setdatos_id(datos_id);
			ddh.insertDatosHosp(dh.dh, bd.getBD(), true, datos_id);
			
			/*Grupo EdadesDH*/
			GrupoEdades ge=new GrupoEdades();
			dh.gTA.setdatos_id(String.valueOf(datos_id));
			ge.insertGrupoEdades(dh.gTA, bd.getBD(), true, datos_id,"TA");	
			
		
			dh.gTH.setdatos_id(String.valueOf(datos_id));
			ge.insertGrupoEdades(dh.gTH, bd.getBD(), true, datos_id,"TH");		
			
		
			dh.gTH_I.setdatos_id(String.valueOf(datos_id));
			ge.insertGrupoEdades(dh.gTH_I, bd.getBD(), true, datos_id,"TH_I");		
			
		
			dh.gTH_N.setdatos_id(String.valueOf(datos_id));
			ge.insertGrupoEdades(dh.gTH_N, bd.getBD(), true, datos_id,"TH_N");	
			
		
			dh.gTH_M.setdatos_id(String.valueOf(datos_id));
			ge.insertGrupoEdades(dh.gTH_M, bd.getBD(), true, datos_id,"TH_M");	
			
		
			dh.gTH_B.setdatos_id(String.valueOf(datos_id));
			ge.insertGrupoEdades(dh.gTH_B, bd.getBD(), true, datos_id,"TH_B");	
			
		
			dh.gTH_O.setdatos_id(String.valueOf(datos_id));
			ge.insertGrupoEdades(dh.gTH_O, bd.getBD(), true, datos_id,"TH_O");				
			
		
			dh.gTH_If.setdatos_id(String.valueOf(datos_id));
			ge.insertGrupoEdades(dh.gTH_If, bd.getBD(), true, datos_id,"TH_If");	
			
			/*dh1*/
			/*DH001*/
			DatosHosp001 dd1=new DatosHosp001();
			dh1.dh1.setdatos_id(datos_id);
			dd1.insertDatosHosp001(dh1.dh1, bd.getBD(), true, datos_id);
			 
			/*Edades DH1*/
			ArrayList<GrupoEdades> l1=dh1.lista;
			String[]vals=new String[]{"TU","TU_I","TU_N","TU_M","TU_B","TU_S","TU_Ss","TU_If"};
			for(int i=0;i<l1.size();i++)
			{
				l1.get(i).setdatos_id(datos_id);
				ge.insertGrupoEdades(l1.get(i), bd.getBD(),true, datos_id, vals[i]);
			}
			vals=null;
			
			/*DH002*/
			DatosHosp002 dd2=new DatosHosp002();
			dh2.dh2.setdatos_id(datos_id);
			dd2.insertDatosHosp002(dh2.dh2, bd.getBD(), true, datos_id);
			 
			/*Edades DH2*/
			ArrayList<GrupoEdades> l2=dh2.lista;	
			String[]vals1=new String[]{"TD","TD_I","TD_N","TD_M","TD_B","TD_S","TD_Ss","TD_If"};
			for(int i=0;i<l2.size();i++)
			{
				l2.get(i).setdatos_id(datos_id);
				ge.insertGrupoEdades(l2.get(i), bd.getBD(),true, datos_id, vals1[i]);
			}
			vals1=null;
			ge=null;
			
			/*DH003 -Fin*/
			DatosHosp003 dd3=new DatosHosp003();
			dh3.d3.setdatos_id(datos_id);
			dh3.d3.setResponsible(responsable.getText().toString());
			dh3.d3.setFecha(fecha.getText().toString());
			dd3.insertDatosHosp003(dh3.d3, bd.getBD(), true, datos_id);
			
			bd.close();	
			/**/
			
			
			
			
		}
		if(bandera)
		{
			AlertDialog.Builder dialogo1 = new AlertDialog.Builder(rootView.getContext());
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
		else
		{
		AlertDialog.Builder dialogo1 = new AlertDialog.Builder(rootView.getContext());
        dialogo1.setTitle("Mensaje");  
        dialogo1.setMessage("Ha insertado un Cuestionario con nombre de Hospital "+dh.dh.getNombreHosp()+" para Editar los Datos o vizualizarlos valla"
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
	
	
	
	
	
	public void aceptar() throws Throwable {	
	    getActivity().finish(); 
    }
	
	   

}

