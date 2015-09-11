package CustomFragments;

import java.util.List;

import sqlite.BDAcceso;
import sqlite.Mening001;
import sqlite.Mening002;
import sqlite.Mening003;
import sqlite.Mening004;
import sqlite.Mening005;
import sqlite.Mening006;
import sqlite.Mening007;
import sqlite.ResponsableEnt;
import sqlite.VacunacionEnt;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

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

public class FMeningControl extends Fragment implements OnClickListener{	

	View rootView;
	ImageButton insertar;
	ImageButton cancelar;
	ImageButton actualizar;
	EditText responsable;
	TextView pieboton;
	EditText fecha;
	ImageButton bfecha;
	
	String caso_id;
	
	
	
	public static FMeningControl newInstance() {
		FMeningControl frag = new FMeningControl();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		
		frag.setArguments(args);
		
		return frag;
	}
	
	public static FMeningControl newInstanceArgs(String caso_id) {
		FMeningControl frag = new FMeningControl();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		args.putString("caso_id",caso_id);
		frag.setArguments(args);
		
		return frag;
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflamos la Vista que se debe mostrar en pantalla.
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
		    	caso_id=getArguments().getString("caso_id");
		    	insertar.setVisibility(View.INVISIBLE);
		    	pieboton.setText("Actualizar Custionario");
		    	actualizar.setVisibility(View.VISIBLE);
		        ResponsableEnt r=new ResponsableEnt();
		        BDAcceso bd=new BDAcceso(rootView.getContext());
				 bd.open();
		       r=r.selectResp(getArguments().getString("caso_id"), bd.getBD());
		       bd.close();
		       responsable.setText(r.getNombreyApellidos());
		       fecha.setText(r.fecha);
		       getArguments().clear();
		       
		    }
	     
	     return rootView;
	}

	

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		
       if(arg0.getId()==R.id.imageButton1||arg0.getId()==R.id.ImageButton01) 
       {
    	   List<Fragment> lista=  getFragmentManager().getFragments();		    	
			
			FDatosCaso f=(FDatosCaso)lista.get(0);	
			FMening001 m1=(FMening001)lista.get(1);	
			FMening002 m2=(FMening002)lista.get(2);	
			FMening003 m3=(FMening003)lista.get(3);
			FMening004 m4=(FMening004)lista.get(4);
			FVacunacion vac=(FVacunacion)lista.get(5);
			FMening005 m5=(FMening005)lista.get(6);
			FMening006 m6=(FMening006)lista.get(7);
			
		if(arg0.getId()==R.id.imageButton1)
       {
    	   try
			{
		    		
				Inserciones(f,m1,m2,m3,m4,vac,m5,m6,false,caso_id);	
				
				
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
				Inserciones(f,m1,m2,m3,m4,vac,m5,m6,true,String.valueOf(caso_id));
			} catch (Exception e) {
				Toast t=Toast.makeText(rootView.getContext(),e.getMessage(), Toast.LENGTH_LONG);
			    t.show();
			}
		}
		
		
		
       }
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
		
	}
	
	public void Inserciones(FDatosCaso f,FMening001 m1,FMening002 m2,FMening003 m3,
			FMening004 m4,FVacunacion vac,FMening005 m5,FMening006 m6,boolean bandera,String caso_id) throws Exception
	{
		f.CreateVars(2);
		m1.CreateVars();
		m2.CreateVars();
		m3.CreateVars();
		m4.CreateVars();
		vac.CreateVars();
		m5.CreateVars();
		m6.CreateVars();
		
		BDAcceso bd=new BDAcceso(rootView.getContext());	
		long id=0;
		if(bandera==false)
		{
			id=bd.InsetDatosCaso(f.DC,false,null);
			
			f.HS.setcaso_id(String.valueOf(id));
			bd.InsetHS(f.HS,false,null);
			/*M001*/
			Mening001 mm1=new Mening001();
			bd.open();
			m1.m001.setcaso_id(String.valueOf(id));
			mm1.insertMenig001(m1.m001, bd.getBD(), false, null);
			bd.close();
			/*M002*/
			Mening002 mm2=new Mening002();
			bd.open();
			m2.m002.setCaso_id(String.valueOf(id));
			mm2.insertMening002(m2.m002, bd.getBD(),false, null);
			bd.close();
			/*M003*/
			Mening003 mm3=new Mening003();
			bd.open();
			m3.m003.setidCaso(String.valueOf(id));
			mm3.insertMening003(m3.m003, bd.getBD(),false, null);
			bd.close();
			/*M004*/
			Mening004 mm4=new Mening004();
			bd.open();
			m4.m4.setcaso_id(String.valueOf(id));
			mm4.insertMening004(m4.m4, bd.getBD(),false, null);
			bd.close();
			/*Vac*/
			VacunacionEnt v=new VacunacionEnt();
			bd.open();
			vac.VAC.setcaso_id(String.valueOf(id));
			v.insertVacunacion(vac.VAC, bd.getBD(),false, null);
			bd.close();
			/*M5*/
			Mening005 mm5=new Mening005();
			bd.open();
			m5.m005.setIdCaso(String.valueOf(id));
			mm5.insertMening005(m5.m005, bd.getBD(),false, null);
			bd.close();
			/*M6-7*/
			Mening006 mm6=new Mening006();
			Mening007 mm7=new Mening007();
			bd.open();
			m6.m006.setIdCaso(String.valueOf(id));
			m6.m007.setIdCaso(String.valueOf(id));
			mm6.insertMening006(m6.m006, bd.getBD(),false, null);
			mm7.insertMening007(m6.m007, bd.getBD(),false, null);
			bd.close();
			/*Resp*/
			bd.open();
			ResponsableEnt r=new ResponsableEnt(String.valueOf(id),responsable.getText().toString() , fecha.getText().toString());
			r.insert(r,bd.getBD(),false, null);
			bd.close();
		}
		else
		{
			bd.InsetDatosCaso(f.DC,true,caso_id);
			
			f.HS.setcaso_id(caso_id);
			bd.InsetHS(f.HS,true,caso_id);
			/*M001*/
			Mening001 mm1=new Mening001();
			bd.open();
			m1.m001.setcaso_id(caso_id);
			mm1.insertMenig001(m1.m001, bd.getBD(), true, caso_id);
			bd.close();
			/*M2*/
			Mening002 mm2=new Mening002();
			bd.open();
			m2.m002.setCaso_id(caso_id);
			mm2.insertMening002(m2.m002, bd.getBD(), true, caso_id);
			bd.close();
			
			/*M003*/
			Mening003 mm3=new Mening003();
			bd.open();
			m3.m003.setidCaso(caso_id);
			mm3.insertMening003(m3.m003, bd.getBD(),true, caso_id);
			bd.close();
			/*M004*/
			Mening004 mm4=new Mening004();
			bd.open();
			m4.m4.setcaso_id(caso_id);
			mm4.insertMening004(m4.m4, bd.getBD(),true, caso_id);
			bd.close();
			/*Vac*/
			VacunacionEnt v=new VacunacionEnt();
			bd.open();
			vac.VAC.setcaso_id(caso_id);
			v.insertVacunacion(vac.VAC, bd.getBD(),true, caso_id);
			bd.close();
			/*M5*/
			Mening005 mm5=new Mening005();
			bd.open();
			m5.m005.setIdCaso(String.valueOf(caso_id));
			mm5.insertMening005(m5.m005, bd.getBD(),true, caso_id);
			bd.close();
			/*M6-7*/
			Mening006 mm6=new Mening006();
			Mening007 mm7=new Mening007();
			bd.open();
			m6.m006.setIdCaso(String.valueOf(caso_id));
			m6.m007.setIdCaso(String.valueOf(caso_id));
			mm6.insertMening006(m6.m006, bd.getBD(),true, caso_id);
			mm7.insertMening007(m6.m007, bd.getBD(),true, caso_id);
			bd.close();
			/*Resp*/
			bd.open();			
			ResponsableEnt r=new ResponsableEnt(caso_id,responsable.getText().toString() , fecha.getText().toString());
			r.insert(r,bd.getBD(),true, caso_id);
			bd.close();
		
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
        dialogo1.setMessage("Ha insertado un Cuestionario con nombre de Paciente "+f.DC.getNombreCompleto()+" para Editar los Datos o vizualizarlos valla"
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



	