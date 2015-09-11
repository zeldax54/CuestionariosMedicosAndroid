package CustomFragments;


import sqlite.Mening007;

import com.app.neumocuest.R;

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

public class FMening007 extends Fragment implements OnClickListener,OnCheckedChangeListener{

	Mening007 m007;
	View rootView;

	 CheckBox eniCasoSospechoso;
	 CheckBox eniCasoProbable;
	 CheckBox eniDescartado;
	 CheckBox eniInadecuadamenteInv;
	 CheckBox eniHInfluenzae;
	 CheckBox eniSpneumoniae;
	 CheckBox eniNmeningitidis;
	 EditText eniOtra;
	 EditText eniSerotipoSubtipo;
	 CheckBox iniBacteriemia;
	 CheckBox iniSepsis;
	 CheckBox iniSepsisSevera;
	 CheckBox iniSockSeptico;
	
	 public static FMening007 newInstance() {
	  		FMening007 frag = new FMening007();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	 
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflamos la Vista que se debe mostrar en pantalla.
	     
		 rootView = inflater.inflate(R.layout.mening006, container,false);
	     
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
	 
	     return rootView;
	}
	
	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void CreateVars()
	{
	m007=new Mening007("0",eniCasoSospechoso.isChecked(),eniCasoProbable.isChecked(),eniDescartado.isChecked(),eniInadecuadamenteInv.isChecked(),eniHInfluenzae.isChecked(),eniSpneumoniae.isChecked(),eniNmeningitidis.isChecked(),eniOtra.getText().toString(),eniSerotipoSubtipo.getText().toString(),iniBacteriemia.isChecked(),iniSepsis.isChecked(),iniSepsisSevera.isChecked(),iniSockSeptico.isChecked());
	} 
}
