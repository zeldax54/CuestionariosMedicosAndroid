package CustomFragments;
import java.util.List;

import sqlite.Antibioticos;
import sqlite.BDAcceso;
import sqlite.ConsumoMedicamentos;
import sqlite.ResponsableEnt;
import sqlite.Susceptibilidad;
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


/*EnfResp008*/
public  class FEnfResp009 extends Fragment implements OnClickListener{
	View rootView;
	ImageButton insertar;
	ImageButton cancelar;
	ImageButton actualizar;
	EditText responsable;
	TextView pieboton;
	EditText fecha;
	ImageButton bfecha;
	
	long idcaso;

	public static FEnfResp009 newInstance() {
		FEnfResp009 frag = new FEnfResp009();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		
		frag.setArguments(args);
		
		return frag;
	}
	
	public static FEnfResp009 newInstanceArgs(String caso_id) {
		FEnfResp009 frag = new FEnfResp009();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		args.putString("caso_id",caso_id);
		frag.setArguments(args);
		
		return frag;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflamos la Vista que se debe mostrar en pantalla.
	    rootView = inflater.inflate(R.layout.enfresp009f, container,false);
	    insertar=(ImageButton)rootView.findViewById(R.id.imageButton1);
	    insertar.setOnClickListener(this);
	    cancelar=(ImageButton)rootView.findViewById(R.id.imageButton2);
	    cancelar.setOnClickListener(this);
	    actualizar=(ImageButton)rootView.findViewById(R.id.ImageButton01);
	    actualizar.setOnClickListener(this);
	    actualizar.setVisibility(View.INVISIBLE);
	    responsable=(EditText)rootView.findViewById(R.id.EditText06f);
	    pieboton=(TextView)rootView.findViewById(R.id.textView1);
	    fecha=(EditText)rootView.findViewById(R.id.editText0001);
	    bfecha=(ImageButton)rootView.findViewById(R.id.Iboton2);
	    bfecha.setOnClickListener(this);
	    if(getArguments().isEmpty()==false)
	    {
	    	ResponsableEnt r=new ResponsableEnt();
	    	BDAcceso bd=new BDAcceso(rootView.getContext());
	    	r=bd.SelectResp(getArguments().getString("caso_id"),r);
	    	responsable.setText(r.getNombreyApellidos());
	    	insertar.setVisibility(View.INVISIBLE);
	    	pieboton.setText("Actualizar Custionario");
	    	actualizar.setVisibility(View.VISIBLE);
	    	insertar.setEnabled(false);
	    	idcaso=Long.valueOf(getArguments().getString("caso_id"));
	    	fecha.setText(r.getfecha());
	    	
	    }
	    return rootView;
	    
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getId()==R.id.imageButton1)
	
		{
			try
			{
		    	List<Fragment> lista=  getFragmentManager().getFragments();		
		    	
		    	
				
				FDatosCaso f=(FDatosCaso)lista.get(0);	
				FEnfResp001 er001=(FEnfResp001)lista.get(1);
				FEnfResp002 er002=(FEnfResp002)lista.get(2);
				FEnfResp003 er003=(FEnfResp003)lista.get(3);
				FEnfResp004 er004=(FEnfResp004)lista.get(4);
				FEnfResp005 er005=(FEnfResp005)lista.get(5);
				FVacunacion vac=(FVacunacion)lista.get(6);
				FEnfResp006 er006=(FEnfResp006)lista.get(7);
				FEnfResp007 er007=(FEnfResp007)lista.get(8);
				FEnfResp008 er008=(FEnfResp008)lista.get(9);
					Inserciones(f,er001,er002,er003,er004,er005,vac,er006,er007,er008,false,null);
					
				
				
	            }
			catch (Exception e)
			{
			Toast t=Toast.makeText(rootView.getContext(),e.getMessage(), Toast.LENGTH_LONG);
		    t.show();
			
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
						aceptar();
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
		
		
		
		
		
		
		
		
		
		
		if(arg0.getId()==R.id.ImageButton01)
		{
			List<Fragment> lista=  getFragmentManager().getFragments();	
			FDatosCaso f=(FDatosCaso)lista.get(0);	
			FEnfResp001 er001=(FEnfResp001)lista.get(1);
			FEnfResp002 er002=(FEnfResp002)lista.get(2);
			FEnfResp003 er003=(FEnfResp003)lista.get(3);
			FEnfResp004 er004=(FEnfResp004)lista.get(4);
			FEnfResp005 er005=(FEnfResp005)lista.get(5);
			FVacunacion vac=(FVacunacion)lista.get(6);
			FEnfResp006 er006=(FEnfResp006)lista.get(7);
			FEnfResp007 er007=(FEnfResp007)lista.get(8);
			FEnfResp008 er008=(FEnfResp008)lista.get(9);
			try {
				Inserciones(f, er001, er002, er003, er004, er005, vac, er006, er007, er008, true,String.valueOf(idcaso));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		if(arg0.getId()==R.id.Iboton2)
		{
		 SelectorFecha s=new SelectorFecha();
		 s.InsertFecha(fecha, rootView);
		 s=null;
		}
		
		
		
		
	}
	public void Inserciones(FDatosCaso f,FEnfResp001 er001,FEnfResp002 er002,FEnfResp003 er003,
			FEnfResp004 er004,FEnfResp005 er005,FVacunacion vac,FEnfResp006 er006
			,FEnfResp007 er007,FEnfResp008 er008,boolean bandera,String caso_id) throws Exception{
		
		/*Datos Caso Hospital Servicio*/
		
		f.CreateVars(1);	
	
		/*Validaciones*/
		
		/*if(f.DC.getNombreCompleto().isEmpty())
			throw new Exception("Debe especificar un nombre para la Persona->Pantalla 1");		
		if(f.DC.getfechaNac()=="")
			throw new Exception("Debe especificar una Fecha de Nacimiento para la Persona->Pantalla 1");		
		if(f.DC.getMunicipio().isEmpty())
			throw new Exception("Debe especificar un Municipio de Recidencia para la Persona->Pantalla 1");		
		/*Validaciones*/  
	/*DatosCasoHospServ end*/
	   
	  /*EnfResp001*/
	   er001.CreateVars();
	   
	   /*EnfResp001 end*/
		/*ER002*/
	   er002.CreateVars();
	   /*ER002 end*/
		/*Er003*/
	   er003.CreateVars();
	   /*Er003 end*/
	   /*Er004*/
	   er004.CreateVrs();
	   /*Er004end*/
	   
	   /*Er005*/
	   er005.Createvars();
	   /*Er005end*/
	   
	   /*vacunacion*/
	   vac.CreateVars();
	   /*vacunacion end*/
	   
	   /*ER006*/
	   er006.CreateVars();	  
	   ConsumoMedicamentos[] cons=er006.med;
	   Antibioticos[]ants=er006.ants;
	   /*ER006 end*/
	   
	   /*ER007*/
	   er007.CreateVars();
	   Susceptibilidad[]suscbacterias=er007.suscbacterias;
	   Susceptibilidad[]suscbaislamiento=er007.suscbaislamiento;
	   Susceptibilidad[]suscantiviral=er007.suscantiviral;
	   /*ER007end*/
	   
	   /*ER008-ER009*/
	   er008.CreateVars();
	   /*ER008-ER009 end*/
	   
	   
	   
	   BDAcceso bd=new BDAcceso(rootView.getContext());	
	   long id=0;
	   if(bandera==true)
	   {
		   bd.InsetDatosCaso(f.DC,true,caso_id);
		   
		   f.HS.setcaso_id(caso_id);
		   bd.InsetHS(f.HS,true,caso_id);	
		   
		   er001.ER1.setIdCaso(caso_id);
		   bd.InsertER001(er001.ER1,true,caso_id);
		   
		   er002.ER2.setcaso_id(caso_id);
		   bd.Insert002(er002.ER2,true,caso_id);
		   
		   er003.ER3.setcaso_id(caso_id);
		   bd.Insert003(er003.ER3,true,caso_id);
		   
		   er004.ER4.setcaso_id(caso_id);
		   bd.Insert004(er004.ER4,true,caso_id);
		   
		   er005.ER5.setIdCaso(caso_id);
		   bd.Insert005(er005.ER5,true,caso_id);
		   
		   vac.VAC.setcaso_id(caso_id);
		   bd.InsertVac(vac.VAC,true,caso_id);
		   /*Enfresp006*/
		   er006.ER6.setcaso_id(caso_id);
			bd.Insert006(er006.ER6,true,caso_id);			
			   
		   cons[0].setcaso_id(caso_id);
		   cons[1].setcaso_id(caso_id);
		   cons[2].setcaso_id(caso_id);
		   ants[0].setcaso_id(caso_id);
		   ants[1].setcaso_id(caso_id);
		   ants[2].setcaso_id(caso_id);
		   
		   ConsumoMedicamentos m=new ConsumoMedicamentos();
		   Antibioticos a=new Antibioticos();
			 for(int i=0;i<3;i++)
			   {	
				 if(cons[i].getnom_ant().isEmpty())//Antibioticos
				 {
					
					 bd.open();
					 m.DeleteMed(cons[i].GetIDreg(), bd.getBD());
					 bd.close();
				 }
				 

				   if(cons[i].getnom_ant().isEmpty()==false)//Antibioticos
				   {
					   bd.open();
					   if(m.BuscarMed(cons[i].GetIDreg(), bd.getBD())==false)
					   {
						   bd.insetMedicamentos(cons[i],false);
						   bd.close();
					   }
					   else
					   {
					   bd.insetMedicamentos(cons[i],true);
					   bd.close();
					   }
					   
				   }
				   
				 if(ants[i].getNombreAnt().isEmpty())//Medicamentos
				 {
					 bd.open();
					 a.DeleteAnt(ants[i].GetIDreg(), bd.getBD());
					 bd.close();
				 }
				 if(ants[i].getNombreAnt().isEmpty()==false)//Medicamentos
				 {
					 bd.open();
					   if(a.BuscarAnti(ants[i].GetIDreg(), bd.getBD())==false)
					   {
						   bd.InsertAnt(ants[i],false);
						   bd.close();
					   }
					   else
					   {
					   bd.InsertAnt(ants[i],true);
					   bd.close();
					   }
				 }
				 
			   }
			 /*Enfresp006 fin*/
			 
			 /*Er007*/
			 er007.ER007.setcaso_id(caso_id);
			  bd.Insert007(er007.ER007,true,caso_id);//Susceptibilidades
			  for(int j=0;j<5;j++)
			  {
				suscbacterias[j].setcaso_id(caso_id);
				suscbaislamiento[j].setcaso_id(caso_id);
			    suscantiviral[j].setcaso_id(caso_id);
			    Susceptibilidad sc=new Susceptibilidad();
			   
			    if(suscbacterias[j].getNombre().isEmpty())//Susc1
				 {
					
					 bd.open();
					 sc.Delete(suscbacterias[j].getidreg(), bd.getBD());
					 bd.close();
				 }
				 

			    if(suscbacterias[j].getNombre().isEmpty()==false)//Susc1
				   {
					   bd.open();
					   if(sc.Buscar(suscbacterias[j].getidreg(), bd.getBD())==false)
					   {
						   bd.InsertSubs(suscbacterias[j],false);
						   bd.close();
					   }
					   else
					   {
					   bd.InsertSubs(suscbacterias[j],true);
					   bd.close();
					   }
					   
				   }
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
			  er008.ER8.setcaso_id(Integer.valueOf(caso_id));
			   bd.Insert008(er008.ER8,true,caso_id);
			   er008.ER009.setcaso_id(Integer.valueOf(caso_id));
			   bd.Insert009(er008.ER009,true,caso_id);
			  
			   ResponsableEnt re=new ResponsableEnt(caso_id,responsable.getText().toString(), fecha.getText().toString());
				bd.InsertResp(re,true,caso_id);
			  
	   }
	   else
	   {
	    id=bd.InsetDatosCaso(f.DC,false,null);
        
	    f.HS.setcaso_id(String.valueOf(id));
	    bd.InsetHS(f.HS,false,null);	
	    
	    er001.ER1.setIdCaso(String.valueOf(id));		
	    bd.InsertER001(er001.ER1,false,null);
		
	    er002.ER2.setcaso_id(String.valueOf(id));
		bd.Insert002(er002.ER2,false,null);
		
		er003.ER3.setcaso_id(String.valueOf(id));
		bd.Insert003(er003.ER3,false,null);
		
		er004.ER4.setcaso_id(String.valueOf(id));
		bd.Insert004(er004.ER4,false,null);
		
		er005.ER5.setIdCaso(String.valueOf(id));
		bd.Insert005(er005.ER5,false,null);
		
		vac.VAC.setcaso_id(String.valueOf(id));
		bd.InsertVac(vac.VAC,false,null);
		   /*Enfresp006*/
		er006.ER6.setcaso_id(String.valueOf(id));
		bd.Insert006(er006.ER6,false,null);
		   
		   ants[0].setcaso_id(String.valueOf(id));
		   ants[1].setcaso_id(String.valueOf(id));
		   ants[2].setcaso_id(String.valueOf(id));
		   
		   cons[0].setcaso_id(String.valueOf(id));
		   cons[1].setcaso_id(String.valueOf(id));
		   cons[2].setcaso_id(String.valueOf(id));
		   
		   for(int i=0;i<3;i++)
		   {
			   if(ants[i].getNombreAnt().isEmpty()==false)
			   {
				   bd.InsertAnt(ants[i],false);
			   }
			   if(cons[i].getnom_ant().isEmpty()==false)
			   {
				   bd.insetMedicamentos(cons[i],false);
			   }
		   }
		   /*EnfResp006 end*/
		   
		   /*EnfResp007*/	   
		   er007.ER007.setcaso_id(String.valueOf(id));
		   bd.Insert007(er007.ER007,false,null);
		   for(int i=0;i<5;i++)
		   {
			   suscbacterias[i].setcaso_id(String.valueOf(id));
			   suscbaislamiento[i].setcaso_id(String.valueOf(id));
			   suscantiviral[i].setcaso_id(String.valueOf(id));
			   if(suscbacterias[i].getNombre().isEmpty()==false)
				   bd.InsertSubs(suscbacterias[i],false);
			   if(suscbaislamiento[i].getNombre().isEmpty()==false)
			      bd.InsertSubs(suscbaislamiento[i],false);
			   if(suscantiviral[i].getNombre().isEmpty()==false)
				      bd.InsertSubs(suscantiviral[i],false);
		   }
		   /*EnfResp007 end*/
		   
		   /*ER008*/
		   er008.ER8.setcaso_id(Integer.valueOf(String.valueOf(id)));
		   bd.Insert008(er008.ER8,false,null);
		   
		   er008.ER009.setcaso_id(Integer.valueOf(String.valueOf(id)));
		   bd.Insert009(er008.ER009,false,null);
		   /*ER008 end*/
			ResponsableEnt re=new ResponsableEnt(String.valueOf(id),responsable.getText().toString(), fecha.getText().toString());
			bd.InsertResp(re,false,null);
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