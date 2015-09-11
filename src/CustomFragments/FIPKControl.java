package CustomFragments;

import java.util.List;

import sqlite.BDAcceso;
import sqlite.EIPK001;
import sqlite.EIPK002;
import sqlite.EIPK003;
import sqlite.EIPK004;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.app.neumocuest.R;

public class FIPKControl extends Fragment implements OnClickListener{

	View rootView;
	ImageButton insertar;
	ImageButton cancelar;
	ImageButton actualizar;
	TextView pieboton;
    RelativeLayout lay;
    TextView t;
    EditText e;
	String caso_id;
	
	
	public static FIPKControl newInstanceArgs(String caso_id) {
		FIPKControl frag = new FIPKControl();
			
			Bundle args = frag.getArguments();
			if(args == null)
				args = new Bundle();			
			args.putString("caso_id",caso_id);
			frag.setArguments(args);			
			return frag;
		}
	 
	
	  	public static FIPKControl newInstance() {
	  		FIPKControl frag = new FIPKControl();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();		   		
	   		frag.setArguments(args);	   		
	   		return frag;
	   	}
	  	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {		
	     rootView = inflater.inflate(R.layout.meningcontrol,container,false);
	     insertar=(ImageButton)rootView.findViewById(R.id.imageButton1);
		    insertar.setOnClickListener(this);
		    cancelar=(ImageButton)rootView.findViewById(R.id.imageButton2);
		    cancelar.setOnClickListener(this);
		    actualizar=(ImageButton)rootView.findViewById(R.id.ImageButton01);
		    pieboton=(TextView)rootView.findViewById(R.id.textView1);
		    actualizar.setOnClickListener(this);
		    actualizar.setVisibility(View.INVISIBLE);
		    lay=(RelativeLayout)rootView.findViewById(R.id.relativeLayouav);
		    lay.setVisibility(View.INVISIBLE);
		    t=(TextView)rootView.findViewById(R.id.TextView14);
		    e=(EditText)rootView.findViewById(R.id.EditText06f);
		    t.setVisibility(View.INVISIBLE);  e.setVisibility(View.INVISIBLE);
		    if(getArguments().isEmpty()==false)
		    {
		    	caso_id=getArguments().getString("caso_id");
		    	insertar.setVisibility(View.INVISIBLE);
		    	pieboton.setText("Actualizar Custionario");
		    	actualizar.setVisibility(View.VISIBLE);
		    }
	     return rootView;
	}


	
	
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		  if(arg0.getId()==R.id.imageButton1||arg0.getId()==R.id.ImageButton01) 
		  {
			  List<Fragment> lista=  getFragmentManager().getFragments();		
			  FIPK001 i1=(FIPK001)lista.get(0);	
			  FIPK002 i2=(FIPK002)lista.get(1);	
			  FIPK003 i3=(FIPK003)lista.get(2);	
			  FIPK004 i4=(FIPK004)lista.get(3);	
			  
				if(arg0.getId()==R.id.imageButton1)
			       {
			    	   try
						{
					    		
							Inserciones(i1,i2,i3,i4,false,caso_id);	
							
							
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
							Inserciones(i1,i2,i3,i4,true,String.valueOf(caso_id));
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
		  }
		
	



public void Inserciones(FIPK001 i1,FIPK002 i2,FIPK003 i3,FIPK004 i4,boolean bandera,String caso_id) throws Exception
{
	i1.CreateVars();
	i2.CreateVars();
	i3.CreateVars();
	i4.CreateVars();
	BDAcceso bd=new BDAcceso(rootView.getContext());	
	
	if(bandera==false)
	{
		long id=0;
		bd.open();
		EIPK001 ei1=new EIPK001();
		id=ei1.insertEIPK001(i1.e1, bd.getBD(), false, null);
		
		i2.e2.setcaso_id(String.valueOf(id));
		EIPK002 ei2=new EIPK002();
		ei2.insertEIPK002(i2.e2, bd.getBD(),false,null);
		
		i3.e3.setcaso_id(String.valueOf(id));
		EIPK003 ei3=new EIPK003();
		ei3.insertEIPK003(i3.e3, bd.getBD(),false,null);
		
		i4.e4.setcaso_id(String.valueOf(id));
		EIPK004 ei4=new EIPK004();
		ei4.insertEIPK004(i4.e4, bd.getBD(),false,null);
		
		bd.close();
		
	}
	else
	{
		bd.open();
		EIPK001 ei1=new EIPK001();
		i1.e1.setcaso_id(caso_id);
		ei1.insertEIPK001(i1.e1, bd.getBD(), true, caso_id);
		
		i2.e2.setcaso_id(caso_id);
		EIPK002 ei2=new EIPK002();
		ei2.insertEIPK002(i2.e2, bd.getBD(), true, caso_id);
		
		i3.e3.setcaso_id(caso_id);
		EIPK003 ei3=new EIPK003();
		ei3.insertEIPK003(i3.e3, bd.getBD(), true, caso_id);
		
		i4.e4.setcaso_id(caso_id);
		EIPK004 ei4=new EIPK004();
		ei4.insertEIPK004(i4.e4, bd.getBD(), true, caso_id);
		
		
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
    dialogo1.setMessage("Ha insertado un Cuestionario con nombre"+i1.e1.getNombre()+" para Editar los Datos o vizualizarlos valla"
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

