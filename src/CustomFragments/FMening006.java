package CustomFragments;

import sqlite.BDAcceso;
import sqlite.Mening004;
import sqlite.Mening006;
import sqlite.Mening007;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageButton;

public class FMening006 extends Fragment implements OnClickListener,OnCheckedChangeListener{

	Mening006 m006;
	Mening007 m007;
	View rootView;
	 
	 CheckBox HospUCI;
	 EditText FechaIngreso;
	 EditText FechaEgreso;
	 EditText NumDias;
	 CheckBox VentMecanicaSI;
	 EditText NumDiasVentMecanica;
	 CheckBox EgresoHospitalario;
	 CheckBox Curado;
	 EditText fechacurado;
	 CheckBox AltaVoluntaria;
	 EditText FechaAVoluntaria;
	 CheckBox RefOHosp;
	 EditText FechaRefOHospital;
	 CheckBox Fallecido;
	 EditText FechaFallecido;
	 CheckBox Autopsia;
	 EditText FechaAutopsia;
	 
	 CheckBox  eniCasoSospechoso;
	 CheckBox  eniCasoProbable;
	 CheckBox  eniDescartado;
	 CheckBox  eniInadecuadamenteInv;
	 CheckBox  eniHInfluenzae;
	 CheckBox  eniSpneumoniae;
	 CheckBox  eniNmeningitidis;
	 EditText  eniOtra;
	 EditText  eniSerotipoSubtipo;
	 CheckBox  iniBacteriemia;
	 CheckBox  iniSepsis;
	 CheckBox  iniSepsisSevera;
	 CheckBox  iniSockSeptico;
	 
	 ImageButton bfechaing;
	 ImageButton bfechaeg;
	 ImageButton bcurado;
	 ImageButton baltavol;
	 ImageButton botrohosp;
	 ImageButton bfallecido;
	 ImageButton bautopsia;
	 
	 
	 public static FMening006 newInstance() {
	  		FMening006 frag = new FMening006();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	 public static FMening006 newInstanceArgs(String caso_id) {
	 		FMening006 frag = new FMening006();
	 		
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
	     
		 rootView = inflater.inflate(R.layout.mening006, container,false);
	     
		 HospUCI=(CheckBox)rootView.findViewById(R.id.textView2);
	     FechaIngreso=(EditText)rootView.findViewById(R.id.EditText02);
	     FechaEgreso=(EditText)rootView.findViewById(R.id.EditText03);
	     NumDias=(EditText)rootView.findViewById(R.id.editText1);
	     VentMecanicaSI=(CheckBox)rootView.findViewById(R.id.textView4);
	     NumDiasVentMecanica=(EditText)rootView.findViewById(R.id.editText2);
	     EgresoHospitalario=(CheckBox)rootView.findViewById(R.id.textView5);
	     Curado=(CheckBox)rootView.findViewById(R.id.checkBox1);
	     fechacurado=(EditText)rootView.findViewById(R.id.EditText04);
	     AltaVoluntaria=(CheckBox)rootView.findViewById(R.id.checkBox2);
	     FechaAVoluntaria=(EditText)rootView.findViewById(R.id.EditText05);
	     RefOHosp=(CheckBox)rootView.findViewById(R.id.checkBox3);
	     FechaRefOHospital=(EditText)rootView.findViewById(R.id.EditText06);
	     Fallecido=(CheckBox)rootView.findViewById(R.id.checkBox4);
	     FechaFallecido=(EditText)rootView.findViewById(R.id.EditText07);
	     Autopsia=(CheckBox)rootView.findViewById(R.id.checkBox5);
	     FechaAutopsia=(EditText)rootView.findViewById(R.id.EditText08);
	     
	     eniCasoSospechoso=(CheckBox)rootView.findViewById(R.id.checkBox6);
	     eniCasoProbable=(CheckBox)rootView.findViewById(R.id.checkBox7);
	     eniDescartado=(CheckBox)rootView.findViewById(R.id.checkBox8);
	     eniInadecuadamenteInv=(CheckBox)rootView.findViewById(R.id.checkBox9);
	     eniHInfluenzae=(CheckBox)rootView.findViewById(R.id.checkBox10);
	     eniSpneumoniae=(CheckBox)rootView.findViewById(R.id.checkBox11);
	     eniNmeningitidis=(CheckBox)rootView.findViewById(R.id.checkBox12);
	     eniOtra=(EditText)rootView.findViewById(R.id.editText3);
	     eniSerotipoSubtipo=(EditText)rootView.findViewById(R.id.EditText01);
	     iniBacteriemia=(CheckBox)rootView.findViewById(R.id.CheckBox01);
	     iniSepsis=(CheckBox)rootView.findViewById(R.id.CheckBox04);
	     iniSepsisSevera=(CheckBox)rootView.findViewById(R.id.CheckBox03);
	     iniSockSeptico=(CheckBox)rootView.findViewById(R.id.CheckBox02);
	    
	      bfechaing=(ImageButton)rootView.findViewById(R.id.ImageButton02);
	      bfechaing.setOnClickListener(this);
	      
		  bfechaeg=(ImageButton)rootView.findViewById(R.id.ImageButton03);
		  bfechaeg.setOnClickListener(this);
		  
		  bcurado=(ImageButton)rootView.findViewById(R.id.ImageButton04);
		  bcurado.setOnClickListener(this);
		  
		  baltavol=(ImageButton)rootView.findViewById(R.id.ImageButton05);
		  baltavol.setOnClickListener(this);
		  
		  
		  botrohosp=(ImageButton)rootView.findViewById(R.id.ImageButton06);
		  botrohosp.setOnClickListener(this);
		  
		  bfallecido=(ImageButton)rootView.findViewById(R.id.ImageButton07);
		  bfallecido.setOnClickListener(this);
		  
		  bautopsia=(ImageButton)rootView.findViewById(R.id.ImageButton08);
		  bautopsia.setOnClickListener(this);
		  if(getArguments().isEmpty()==false)
		  {
		     Mening006 m6=new Mening006();
		     Mening007 m7=new Mening007();
			 BDAcceso bd=new BDAcceso(rootView.getContext());
			 bd.open();
			 m6=m6.selectMening006(getArguments().getString("caso_id"), bd.getBD());
			 m7=m7.selectMening007(getArguments().getString("caso_id"), bd.getBD());
			 bd.close();
			 HospUCI.setChecked(m6.getHospUCI());
			 FechaIngreso.setText(m6.getFechaIngreso());
			 FechaEgreso.setText(m6.getFechaEgreso());
			 NumDias.setText(m6.getNumDias());
			 VentMecanicaSI.setChecked(m6.getVentMecanicaSI());
			 NumDiasVentMecanica.setText(m6.getNumDiasVentMecanica());
			 EgresoHospitalario.setChecked(m6.getEgresoHospitalario());
			 Curado.setChecked(m6.getCurado());
			 fechacurado.setText(m6.getfechacurado());
			 AltaVoluntaria.setChecked(m6.getAltaVoluntaria());
			 FechaAVoluntaria.setText(m6.getFechaAVoluntaria());
			 RefOHosp.setChecked(m6.getRefOHosp());
			 FechaRefOHospital.setText(m6.getFechaRefOHospital());
			 Fallecido.setChecked(m6.getFallecido());
			 FechaFallecido.setText(m6.getFechaFallecido());
			 Autopsia.setChecked(m6.getAutopsia());
			 FechaAutopsia.setText(m6.getFechaAutopsia());
			 
			 eniCasoSospechoso.setChecked(m7.geteniCasoSospechoso());
			 eniCasoProbable.setChecked(m7.geteniCasoProbable());
			 eniDescartado.setChecked(m7.geteniDescartado());
			 eniInadecuadamenteInv.setChecked(m7.geteniInadecuadamenteInv());
			 eniHInfluenzae.setChecked(m7.geteniHInfluenzae());
			 eniSpneumoniae.setChecked(m7.geteniSpneumoniae());
			 eniNmeningitidis.setChecked(m7.geteniNmeningitidis());
			 eniOtra.setText(m7.geteniOtra());
			 eniSerotipoSubtipo.setText(m7.geteniSerotipoSubtipo());
			 iniBacteriemia.setChecked(m7.getiniBacteriemia());
			 iniSepsis.setChecked(m7.getiniSepsis());
			 iniSepsisSevera.setChecked(m7.getiniSepsisSevera());
			 iniSockSeptico.setChecked(m7.getiniSockSeptico());


			 
			 getArguments().clear();
		  }
	 
	     return rootView;
  	}
	
	@Override
  	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
  		// TODO Auto-generated method stub
  		
  	}

  	@Override
  	public void onClick(View arg0) {
  		// TODO Auto-generated method stub
  		SelectorFecha s=new SelectorFecha();
  		if(arg0.getId()==R.id.ImageButton02)
  		{
  			s.InsertFecha(FechaIngreso, rootView);
  		}
  		if(arg0.getId()==R.id.ImageButton03)
  		{
  			s.InsertFecha(FechaEgreso, rootView);
  		}
  		if(arg0.getId()==R.id.ImageButton04)
  		{
  			s.InsertFecha(fechacurado, rootView);
  		}
  		if(arg0.getId()==R.id.ImageButton05)
  		{
  			s.InsertFecha(FechaAVoluntaria, rootView);
  		}
  		if(arg0.getId()==R.id.ImageButton06)
  		{
  			s.InsertFecha(FechaRefOHospital, rootView);
  		}
  		
  		if(arg0.getId()==R.id.ImageButton07)
  		{
  			s.InsertFecha(FechaFallecido, rootView);
  		}
  		if(arg0.getId()==R.id.ImageButton08)
  		{
  			s.InsertFecha(FechaAutopsia, rootView);
  		}
  		s=null;
  		
  	}
  	
  	public void CreateVars()
  	{
  	m006=new Mening006("0",HospUCI.isChecked(),FechaIngreso.getText().toString(),FechaEgreso.getText().toString(),
  			NumDias.getText().toString(),VentMecanicaSI.isChecked(),NumDiasVentMecanica.getText().toString(),
  			EgresoHospitalario.isChecked(),Curado.isChecked(),fechacurado.getText().toString(),AltaVoluntaria.isChecked(),
  			FechaAVoluntaria.getText().toString(),RefOHosp.isChecked(),FechaRefOHospital.getText().toString(),Fallecido.isChecked(),
  			FechaFallecido.getText().toString(),Autopsia.isChecked(),FechaAutopsia.getText().toString());
  	m007=new Mening007("0",  eniCasoSospechoso.isChecked(),  eniCasoProbable.isChecked(),  eniDescartado.isChecked(),  eniInadecuadamenteInv.isChecked(),  eniHInfluenzae.isChecked(),  eniSpneumoniae.isChecked(),  eniNmeningitidis.isChecked(),  eniOtra.getText().toString(),  eniSerotipoSubtipo.getText().toString(),  iniBacteriemia.isChecked(),  iniSepsis.isChecked(),  iniSepsisSevera.isChecked(),  iniSockSeptico.isChecked());
  	}
  	
}
