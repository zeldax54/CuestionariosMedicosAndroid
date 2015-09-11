package CustomFragments;

import sqlite.BDAcceso;
import sqlite.DatosCaso;
import sqlite.HospitalServicio;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

public class FDatosCaso extends Fragment implements OnItemSelectedListener,OnClickListener{
	
	DatosCaso DC=null;
	HospitalServicio HS;
	
	 View rootView;
	 Spinner sexo;
	  Spinner prov;
	  
	  String [] cadena={"Hombre","Mujer"};
	  String[]cadena1={"Pinar del Rio","Artemisa","La Habana","Matanzas","Villa Clara","Cienfuegos",
			  "Sancti Spiritus","Ciego de Ávila","Camagüey","Las Tunas","Granma","Holguín",
			  "Santiago de Cuba","Guantánamo","Isla de La Juventud"};
	 ArrayAdapter<String> adaptador;
    ArrayAdapter<String> adaptador1;
	//Datos Caso
    EditText eNumHistClinica;
    EditText eNumSemanaEstadisticaEpid;
    EditText eNombreCompleto;
    EditText eFechaNac;
    EditText eAnos;
    EditText eMeses;
    EditText eDias;
    EditText eCI;
    EditText eMunicipio;
    EditText eDirParticular;
    EditText eAreaSalud;
    EditText eFechaInicioSintomas;
  
    //Hospital Servicio
    EditText eFechaConsulta;
    EditText eFechaNotif;
    EditText eNombreHosp;
    CheckBox cUrgencias;
    CheckBox cRespiratorio;
    CheckBox cMiscelanea;
    CheckBox cUCI;
    EditText eOtra;
    CheckBox cReferidoOtroHosp;
    EditText eConsultprev;
    EditText eHospitulta;
    
    /*Botones*/
    ImageButton bFechaNac;
    ImageButton bFechaInicioSintomas;
    ImageButton bFechaConsulta;
    ImageButton bFechaNotif;
	
    public static FDatosCaso newInstance() {
		FDatosCaso frag = new FDatosCaso();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		
		frag.setArguments(args);
		
		return frag;
	}
	
	public static FDatosCaso newInstanceArgs(String caso_id) {
		FDatosCaso frag = new FDatosCaso();
		
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
		// Inflamos la Vista que se debe mostrar en pantalla.
	
		//Spinners
		    rootView = inflater.inflate(R.layout.datoscaso, container,false);	
		    adaptador=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadena);			
			sexo=(Spinner)rootView.findViewById(R.id.spinner11);
			sexo.setOnItemSelectedListener(this);
			sexo.setAdapter(adaptador);			
			prov=(Spinner)rootView.findViewById(R.id.Spinner01);
		    adaptador1=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadena1);			
		    prov.setOnItemSelectedListener(this);
		    prov.setAdapter(adaptador1);
		    /////////
		    
		    /*DatosCaso*/
		    eNumHistClinica=(EditText)rootView.findViewById(R.id.editText1);
		    eNumSemanaEstadisticaEpid=(EditText)rootView.findViewById(R.id.editText2);
		    eNombreCompleto=(EditText)rootView.findViewById(R.id.editText09);
		    eFechaNac=(EditText)rootView.findViewById(R.id.editText116);
		    eAnos=(EditText)rootView.findViewById(R.id.editText7);
		    eMeses=(EditText)rootView.findViewById(R.id.editText10);
		    eDias=(EditText)rootView.findViewById(R.id.editText11);
		    eCI=(EditText)rootView.findViewById(R.id.EditText03);
		    eMunicipio=(EditText)rootView.findViewById(R.id.editText12j);
		    eDirParticular=(EditText)rootView.findViewById(R.id.editText14);
		    eAreaSalud=(EditText)rootView.findViewById(R.id.editText15);
		    eFechaInicioSintomas=(EditText)rootView.findViewById(R.id.editText169);
		    /*Hospital Servicio*/
		    eFechaConsulta=(EditText)rootView.findViewById(R.id.editText434t);
		    eFechaNotif=(EditText)rootView.findViewById(R.id.editText32);
		    eNombreHosp=(EditText)rootView.findViewById(R.id.editText5);
		    cUrgencias=(CheckBox)rootView.findViewById(R.id.checkBox1);
		    cRespiratorio=(CheckBox)rootView.findViewById(R.id.checkBox2);
		    cMiscelanea=(CheckBox)rootView.findViewById(R.id.checkBox3);
		    cUCI=(CheckBox)rootView.findViewById(R.id.checkBox4);
		    eOtra=(EditText)rootView.findViewById(R.id.editText8);
		    cReferidoOtroHosp=(CheckBox)rootView.findViewById(R.id.checkBox5);
		    eConsultprev=(EditText)rootView.findViewById(R.id.EditText01);
		    eHospitulta=(EditText)rootView.findViewById(R.id.EditText002);
		    /*Botones*/
		     bFechaNac=(ImageButton)rootView.findViewById(R.id.boton4ps);
		     bFechaNac.setOnClickListener(this);
		     bFechaInicioSintomas=(ImageButton)rootView.findViewById(R.id.boton3ps);
		     bFechaInicioSintomas.setOnClickListener(this);
		     bFechaConsulta=(ImageButton)rootView.findViewById(R.id.boton11pst);
		     bFechaConsulta.setOnClickListener(this);
		     bFechaNotif=(ImageButton)rootView.findViewById(R.id.boton21x);
		     bFechaNotif.setOnClickListener(this);
		    /**/
		 
		   
		     
		     if(getArguments().isEmpty()==false)
		     {
		    	 BDAcceso bd=new BDAcceso(rootView.getContext());
		    	 DatosCaso dc=new DatosCaso();
		    	 dc=bd.SelectDatosCaso(getArguments().getString("caso_id"), dc);
		    	 
		    	 eNumHistClinica.setText(dc.getNumHistClinica());
		    	 eNumSemanaEstadisticaEpid.setText(dc.getNumSemanaEstadisticaEpid());
		    	 eNombreCompleto.setText(dc.getNombreCompleto());
		    	 eFechaNac.setText(dc.getfechaNac());
		    	 eAnos.setText(dc.getAnos());
				 eMeses.setText(dc.getMeses());
				 eDias.setText(dc.getDias());
				 eCI.setText(dc.getCI());
				 eMunicipio.setText(dc.getMunicipio());
				 eDirParticular.setText(dc.getDirParticular());
				 eAreaSalud.setText(dc.getAreaSalud());
				 eFechaInicioSintomas.setText(dc.getFechaInicioSStringomas());
		    	 sexo.setSelection(Integer.valueOf(dc.getSexo()));
		    	 prov.setSelection(Integer.valueOf(dc.getProvincia()));
		    	 
		    	 HospitalServicio hs=new HospitalServicio();
		    	 hs=bd.SelectHospServ(Long.valueOf(getArguments().getString("caso_id")), hs);
		    	    eFechaConsulta.setText(hs.getFechaConsulta());
				    eFechaNotif.setText(hs.getFechaNotif());
				    eNombreHosp.setText(hs.getNombreHosp());
				    cUrgencias.setChecked(hs.getUrgencias());
				    cRespiratorio.setChecked(hs.getRespiratorio());
				    cMiscelanea.setChecked(hs.getMiscelanea());
				    cUCI.setChecked(hs.getUCI());
				    eOtra.setText(hs.getOtra());
				    cReferidoOtroHosp.setChecked(hs.getReferidoOtroHosp());
				    eConsultprev.setText(hs.getConsultprev());
				    eHospitulta.setText(hs.getHospitulta());
				    getArguments().clear();
		    	 
		     }
		     
		    return rootView;
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
	
    public void CreateVars(int idcuest){    
    	DC=new DatosCaso(String.valueOf(0), String.valueOf(idcuest), eNombreCompleto.getText().toString(), String.valueOf(sexo.getSelectedItemPosition()),
    			eFechaNac.getText().toString(),eAnos.getText().toString(),eMeses.getText().toString(), 
    			eDias.getText().toString(), eCI.getText().toString(), String.valueOf(prov.getSelectedItemPosition()),
    			eMunicipio.getText().toString(), eDirParticular.getText().toString(), eAreaSalud.getText().toString(), 
    			eFechaInicioSintomas.getText().toString(), eNumHistClinica.getText().toString(), 
    			eNumSemanaEstadisticaEpid.getText().toString());    
    	HS=new HospitalServicio("0", eFechaConsulta.getText().toString(), eFechaNotif.getText().toString(), eNombreHosp.getText().toString(), cUrgencias.isChecked(), cUCI.isChecked(), eOtra.getText().toString(), cReferidoOtroHosp.isChecked(), cRespiratorio.isChecked(), cMiscelanea.isChecked(), eConsultprev.getText().toString(), eHospitulta.getText().toString());
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		SelectorFecha s=new SelectorFecha();
		if(arg0.getId()==R.id.boton4ps)
		{
		  s.InsertFecha(eFechaNac, rootView);
		}
		if(arg0.getId()==R.id.boton3ps)
		{
		  s.InsertFecha(eFechaInicioSintomas, rootView);
		}
		if(arg0.getId()==R.id.boton11pst)
		{
		  s.InsertFecha(eFechaConsulta, rootView);
		}
		if(arg0.getId()==R.id.boton21x)
		{
		  s.InsertFecha(eFechaNotif, rootView);
		}
		s=null;
	}





























}

