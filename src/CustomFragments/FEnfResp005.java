package CustomFragments;

import sqlite.BDAcceso;
import sqlite.EnfResp004;
import sqlite.EnfResp005;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;

import com.app.neumocuest.R;

public class FEnfResp005 extends Fragment{
	View rootView;
	EnfResp005 ER5;
	CheckBox SII;
	EditText fiebreactual;
	EditText numdias;
	CheckBox dolorgarg;
	CheckBox malestargen;
	EditText otros_sintomas;
	CheckBox ausenciasintomas;
	public static FEnfResp005 newInstance() {
		FEnfResp005 frag = new FEnfResp005();
   		
   		Bundle args = frag.getArguments();
   		if(args == null)
   			args = new Bundle();	  		
   		
   		frag.setArguments(args);
   		
   		return frag;
   	}
	
	public static FEnfResp005 newInstanceArgs(String caso_id) {
   		FEnfResp005 frag = new FEnfResp005();
		
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
   	rootView = inflater.inflate(R.layout.enfresp005f, container,false);	
   	SII=(CheckBox)rootView.findViewById(R.id.CheckBox10);
   	fiebreactual=(EditText)rootView.findViewById(R.id.EditText0_2);
   	numdias=(EditText)rootView.findViewById(R.id.EditText01);
   	dolorgarg=(CheckBox)rootView.findViewById(R.id.CheckBox0_61);
   	malestargen=(CheckBox)rootView.findViewById(R.id.CheckBox091);
   	otros_sintomas=(EditText)rootView.findViewById(R.id.editText1);
   	ausenciasintomas=(CheckBox)rootView.findViewById(R.id.CheckBox01);
    if(getArguments().isEmpty()==false)
    {
   	 BDAcceso bd=new BDAcceso(rootView.getContext());
   	 bd.open();
   	 EnfResp005 er5=new EnfResp005();
   	 er5=er5.selectEnfResp005(Long.valueOf(getArguments().getString("caso_id")), bd.getBD());
   	 bd.close();
   	SII.setChecked(er5.getSII());
   	fiebreactual.setText(er5.getfiebreactual());
   	numdias.setText(er5.getnumdias());
   	dolorgarg.setChecked(er5.getdolorgarg());
   	malestargen.setChecked(er5.getmalestargen());
   	otros_sintomas.setText(er5.getotros_sintomas());
   	ausenciasintomas.setChecked(er5.getausenciasintomas());
    getArguments().clear();
    }
   	   
   	   return rootView;
	}
	
	public void Createvars() {
		
		ER5=new EnfResp005("0", SII.isChecked(), fiebreactual.getText().toString(), numdias.getText().toString(), dolorgarg.isChecked(), malestargen.isChecked(), otros_sintomas.getText().toString(), ausenciasintomas.isChecked());
	}

}

