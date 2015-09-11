package CustomFragments;

import java.util.List;

import sqlite.Aps001;
import sqlite.Aps002;
import sqlite.BDAcceso;
import sqlite.ResponsableEnt;
import sqlite.Susceptibilidad;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

public class FAPSControl extends Fragment implements OnClickListener{
	
	View rootView;
	ImageButton insertar;
	ImageButton cancelar;
	ImageButton actualizar;
	EditText responsable;
	TextView pieboton;
	EditText fecha;
	ImageButton bfecha;
	
	String caso_id;
	
	
	 public static FAPSControl newInstance() {
		 FAPSControl frag = new FAPSControl();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	 
		public static FAPSControl newInstanceArgs(String caso_id) {
			FAPSControl frag = new FAPSControl();
			
			Bundle args = frag.getArguments();
			if(args == null)
				args = new Bundle();	
			
			args.putString("caso_id", caso_id);
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
				
				FAps001 a1=(FAps001)lista.get(0);	
				FAps002 a2=(FAps002)lista.get(1);	
				FEnfResp003 e3=(FEnfResp003)lista.get(2);
				FAps003 a3=(FAps003)lista.get(3);
				FAps004 a4=(FAps004)lista.get(4);
				FEnfResp005 e5=(FEnfResp005)lista.get(5);
				FVacunacion v=(FVacunacion)lista.get(6);
				FEnfResp006 e6=(FEnfResp006)lista.get(7);
				FAps005 a5=(FAps005)lista.get(8);
				FAps006 a6=(FAps006)lista.get(9);
				
				
			if(arg0.getId()==R.id.imageButton1)
	       {
	    	   try
				{
			    		
					Inserciones(a1,a2,e3,a3,a4,e5,v,e6,a5,a6,false,caso_id);	
					
					
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
					Inserciones(a1,a2,e3,a3,a4,e5,v,e6,a5,a6,true,String.valueOf(caso_id));
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Inserciones(FAps001 a1,FAps002 a2,FEnfResp003 e3,FAps003 a3,FAps004 a4,FEnfResp005 e5,
			FVacunacion v,FEnfResp006 e6,FAps005 a5,FAps006 a6,boolean bandera,String caso_id) throws Exception
	{
		a1.CreateVars();
		a2.CreateVars();
		e3.CreateVars();
		a3.CreateVars();
		a4.CreateVrs();
		e5.Createvars();
		v.CreateVars();
		e6.CreateVars();
		a5.CreateVars();
		a6.CreateVars();
		
		Susceptibilidad[]suscbaislamiento=a5.suscbaislamiento;
		Susceptibilidad[]suscantiviral=a5.suscantiviral;
		
		BDAcceso bd=new BDAcceso(rootView.getContext());	
		long id=0;
		
		if(bandera==false)
		{
			id=bd.InsetDatosCaso(a1.dc,false,null);
		    //APS1
			bd.open();
			a1.aps001.setidCaso(String.valueOf(id));
			Aps001 aa1=new Aps001();
			aa1.insertAps001(a1.aps001, bd.getBD(), false, null);
			aa1=null;
			//APS2
			a2.aps002.setidCaso(String.valueOf(id));
			Aps002 aa2=new Aps002();
			aa2.insertAps002(a2.aps002, bd.getBD(), false, null);
			aa2=null;
			//ER3
			e3.ER3.setcaso_id(String.valueOf(id));
			e3.ER3.insertEnfResp003(e3.ER3, bd.getBD(), false, null);
			//APS3
			a3.aps003.setidCaso(String.valueOf(id));
			a3.aps003.insertAps003(a3.aps003, bd.getBD(), false, null);		
			//ER4-FAPS4
			a4.ER4.setcaso_id(String.valueOf(id));
			a4.ER4.insertEnfResp004(a4.ER4, bd.getBD(), false, null);
			//ER5
			e5.ER5.setIdCaso(String.valueOf(id));
			e5.ER5.insertEnfResp005(e5.ER5, bd.getBD(), false, null);
			//Vac
			v.VAC.setcaso_id(String.valueOf(id));
			v.VAC.insertVacunacion(v.VAC, bd.getBD(), false, null);
			//ER6
			e6.ER6.setcaso_id(String.valueOf(id));
			e6.ER6.insertEnfResp006(e6.ER6, bd.getBD(), false, null);
			//APS5
			 a5.ER007.setcaso_id(String.valueOf(id));
			   bd.Insert007(a5.ER007,false,null);
			
			   for(int i=0;i<5;i++)
			   {				 
				   suscbaislamiento[i].setcaso_id(String.valueOf(id));
				   suscantiviral[i].setcaso_id(String.valueOf(id));				
				   if(suscbaislamiento[i].getNombre().isEmpty()==false)
				      bd.InsertSubs(suscbaislamiento[i],false);
				   if(suscantiviral[i].getNombre().isEmpty()==false)
					      bd.InsertSubs(suscantiviral[i],false);
			   }
			
			//APS6
			bd.open();
			a6.aps004.setidCaso(String.valueOf(id));
			a6.aps005.setidCaso(String.valueOf(id));
			
			a6.aps004.insertAps004(a6.aps004, bd.getBD(), false, null);
			a6.aps005.insertAps005(a6.aps005, bd.getBD(), false, null);
			
			/*Resp*/
			bd.open();
			ResponsableEnt r=new ResponsableEnt(String.valueOf(id),responsable.getText().toString() , fecha.getText().toString());
			r.insert(r,bd.getBD(),false, null);
		
			bd.close();
			
		}
		else
		{
			
			bd.InsetDatosCaso(a1.dc,true,caso_id);
			 //APS1
			bd.open();
			a1.aps001.setidCaso(caso_id);
			Aps001 aa1=new Aps001();
			aa1.insertAps001(a1.aps001, bd.getBD(), true, caso_id);
			aa1=null;
			//APS2
			a2.aps002.setidCaso(caso_id);
			Aps002 aa2=new Aps002();
			aa2.insertAps002(a2.aps002, bd.getBD(), true, caso_id);
			aa2=null;			
			//ER3
			e3.ER3.setcaso_id(caso_id);
			e3.ER3.insertEnfResp003(e3.ER3, bd.getBD(), true, caso_id);
			//APS3
			a3.aps003.setidCaso(caso_id);
			a3.aps003.insertAps003(a3.aps003, bd.getBD(), true, caso_id);
			//ER4-FAPS4
			a4.ER4.setcaso_id(caso_id);
			a4.ER4.insertEnfResp004(a4.ER4, bd.getBD(), true, caso_id);
			//ER5
			e5.ER5.setIdCaso(caso_id);
			e5.ER5.insertEnfResp005(e5.ER5, bd.getBD(), true, caso_id);
			//Vac
			v.VAC.setcaso_id(caso_id);
			v.VAC.insertVacunacion(v.VAC, bd.getBD(), true, caso_id);
			//ER6
			e6.ER6.setcaso_id(caso_id);
			e6.ER6.insertEnfResp006(e6.ER6, bd.getBD(), true, caso_id);
			//APS5
			a5.ER007.setcaso_id(caso_id);
			  bd.Insert007(a5.ER007,true,caso_id);//Susceptibilidades
			  for(int j=0;j<5;j++)
			  {
				
				suscbaislamiento[j].setcaso_id(caso_id);
			    suscantiviral[j].setcaso_id(caso_id);
			    Susceptibilidad sc=new Susceptibilidad();			   

			    if(suscbaislamiento[j].getNombre().isEmpty())//Susc1
				 {
					
					 bd.open();
					 sc.Delete(suscbaislamiento[j].getidreg(), bd.getBD());
					 bd.close();
				 }
				 

			    if(suscbaislamiento[j].getNombre().isEmpty()==false)//Susc2
				   {
					   bd.open();
					   if(sc.Buscar(suscbaislamiento[j].getidreg(), bd.getBD())==false)
					   {
						   bd.InsertSubs(suscbaislamiento[j],false);
						   bd.close();
					   }
					   else
					   {
					   bd.InsertSubs(suscbaislamiento[j],true);
					   bd.close();
					   }
					   
				   }
			    if(suscantiviral[j].getNombre().isEmpty())//Susc3
				 {
					
					 bd.open();
					 sc.Delete(suscantiviral[j].getidreg(), bd.getBD());
					 bd.close();
				 }
				 

			    if(suscantiviral[j].getNombre().isEmpty()==false)//Susc3
				   {
					   bd.open();
					   if(sc.Buscar(suscantiviral[j].getidreg(), bd.getBD())==false)
					   {
						   bd.InsertSubs(suscantiviral[j],false);
						   bd.close();
					   }
					   else
					   {
					   bd.InsertSubs(suscantiviral[j],true);
					   bd.close();
					   }
					   
				   }
			 
			    
			  }
			//APS6
			  bd.open();
				a6.aps004.setidCaso(caso_id);
				a6.aps005.setidCaso(caso_id);
				
				a6.aps004.insertAps004(a6.aps004, bd.getBD(), true, caso_id);
				a6.aps005.insertAps005(a6.aps005, bd.getBD(), true, caso_id);
				
				ResponsableEnt r=new ResponsableEnt(caso_id,responsable.getText().toString() , fecha.getText().toString());
				r.insert(r,bd.getBD(),true, caso_id);
				bd.close();
			
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
        dialogo1.setMessage("Ha insertado un Cuestionario con nombre de Paciente "+a1.dc.getNombreCompleto()+" para Editar los Datos o vizualizarlos valla"
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
