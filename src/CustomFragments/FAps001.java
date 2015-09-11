package CustomFragments;
import sqlite.Aps001;
import sqlite.BDAcceso;
import sqlite.DatosCaso;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

public class FAps001 extends Fragment implements OnClickListener,OnItemSelectedListener {

	Aps001 aps001;
	DatosCaso dc;
	View rootView;
	
	Spinner sexo;
	Spinner prov;
	  
	  String [] cadena={"Hombre","Mujer"};
	  String[]cadena1={"Pinar del Rio","Artemisa","La Habana","Matanzas","Villa Clara","Cienfuegos",
			  "Sancti Spiritus","Ciego de Ávila","Camagüey","Las Tunas","Granma","Holguín",
			  "Santiago de Cuba","Guantánamo","Isla de La Juventud"};
	 ArrayAdapter<String> adaptador;
     ArrayAdapter<String> adaptador1;
	 
	 EditText NoSemEstEpid;
	 EditText FechaConsulta;
	 ImageButton fechaConsulta;
	 
	 EditText NombAreaSalud;
	 EditText NumCMF;
	 EditText PrimConsulta;
	 ImageButton primConsulta;
	 
	 EditText NumConsultPMotivActual;
	 
	 ImageButton bechaNac;
	  EditText eNombreCompleto;
	  EditText eFechaNac;
	  EditText eAnos;
	  EditText eMeses;
	  EditText eDias;
	  EditText eCI;
	  EditText eMunicipio;
	  EditText eDirParticular;
	 
	 public static FAps001 newInstance() {
		 FAps001 frag = new FAps001();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	 
		public static FAps001 newInstanceArgs(String caso_id) {
			FAps001 frag = new FAps001();
			
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
	     rootView = inflater.inflate(R.layout.aps001, container,false);
	     
	     NoSemEstEpid=(EditText)rootView.findViewById(R.id.editText20);
	     FechaConsulta=(EditText)rootView.findViewById(R.id.editText5);
	     NombAreaSalud=(EditText)rootView.findViewById(R.id.EditText01);
	     NumCMF=(EditText)rootView.findViewById(R.id.editText434t);
	     PrimConsulta=(EditText)rootView.findViewById(R.id.EditText02);
	     NumConsultPMotivActual=(EditText)rootView.findViewById(R.id.EditText0021);
	     fechaConsulta=(ImageButton)rootView.findViewById(R.id.boton11pst);
	     fechaConsulta.setOnClickListener(this);
	     primConsulta=(ImageButton)rootView.findViewById(R.id.ImageButton01);
	     primConsulta.setOnClickListener(this);
	        adaptador=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadena);			
			sexo=(Spinner)rootView.findViewById(R.id.spinner11k);
			sexo.setOnItemSelectedListener(this);
			sexo.setAdapter(adaptador);			
			prov=(Spinner)rootView.findViewById(R.id.Spinner01);
		    adaptador1=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadena1);			
		    prov.setOnItemSelectedListener(this);
		    prov.setAdapter(adaptador1);
		    
		    eNombreCompleto=(EditText)rootView.findViewById(R.id.editText09);
		    eFechaNac=(EditText)rootView.findViewById(R.id.editText116);
		    eAnos=(EditText)rootView.findViewById(R.id.editText7);
		    eMeses=(EditText)rootView.findViewById(R.id.editText10);
		    eDias=(EditText)rootView.findViewById(R.id.editText11);
		    eCI=(EditText)rootView.findViewById(R.id.EditText03);
		    eMunicipio=(EditText)rootView.findViewById(R.id.editText12j);
		    eDirParticular=(EditText)rootView.findViewById(R.id.editText14);
		    bechaNac=(ImageButton)rootView.findViewById(R.id.ImageButton02);
		    bechaNac.setOnClickListener(this);
		  
		    if(getArguments().isEmpty()==false)
		    {
		    	
		    	 BDAcceso bd=new BDAcceso(rootView.getContext());
		    	 DatosCaso dcc=new DatosCaso();
		    	 dcc=bd.SelectDatosCaso(getArguments().getString("caso_id"),dcc);		    	 
		  
		    	 eNombreCompleto.setText(dcc.getNombreCompleto());
		    	 eFechaNac.setText(dcc.getfechaNac());
		    	 eAnos.setText(dcc.getAnos());
				 eMeses.setText(dcc.getMeses());
				 eDias.setText(dcc.getDias());
				 eCI.setText(dcc.getCI());
				 eMunicipio.setText(dcc.getMunicipio());
				 eDirParticular.setText(dcc.getDirParticular());				
		    	 sexo.setSelection(Integer.valueOf(dcc.getSexo()));
		    	 prov.setSelection(Integer.valueOf(dcc.getProvincia()));
		    	 
		    	 Aps001 aaps=new Aps001();
		    	 bd.open();
		    	 aaps=aaps.selectAps001(getArguments().getString("caso_id"), bd.getBD());		    	 
		    	 NoSemEstEpid.setText(aaps.getNoSemEstEpid());
		    	 FechaConsulta.setText(aaps.getFechaConsulta());
		    	 NombAreaSalud.setText(aaps.getNombAreaSalud());
		    	 NumCMF.setText(aaps.getNumCMF());
		    	 PrimConsulta.setText(aaps.getPrimConsulta());
		    	 NumConsultPMotivActual.setText(aaps.getNumConsultPMotivActual());
		    	 bd.close();
		    	
		    }
	        return rootView;
	}
	


	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		SelectorFecha s=new SelectorFecha();
		
		if(arg0.getId()==R.id.boton11pst)
		{
		  s.InsertFecha(FechaConsulta, rootView);
		}
		if(arg0.getId()==R.id.ImageButton01)
		{
		  s.InsertFecha(PrimConsulta, rootView);
		}		
		
		if(arg0.getId()==R.id.ImageButton02)
		{
			 s.InsertFecha(eFechaNac, rootView);
		}
				
		s=null;
	}
	
	public void CreateVars(){
		
	 aps001=new Aps001("0",NoSemEstEpid.getText().toString(),FechaConsulta.getText().toString(),
			 NombAreaSalud.getText().toString(),NumCMF.getText().toString(),PrimConsulta.getText().toString(),
			 NumConsultPMotivActual.getText().toString());
	 dc=new DatosCaso("0", "4", eNombreCompleto.getText().toString(), String.valueOf(sexo.getSelectedItemPosition()), eFechaNac.getText().toString(), eAnos.getText().toString(), eMeses.getText().toString(), eDias.getText().toString(), eCI.getText().toString(), String.valueOf(prov.getSelectedItemPosition()), eMunicipio.getText().toString(), eDirParticular.getText().toString(), "", "", "", "");
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

}
