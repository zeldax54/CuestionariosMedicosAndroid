package CustomFragments;

import sqlite.BDAcceso;
import sqlite.EnfResp002;
import sqlite.EnfResp003;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.app.neumocuest.R;

public class FEnfResp003 extends Fragment{
	
	EnfResp003 ER3;
	View rootView;
	Spinner sclasifresult;
	String [] cadena={"","Adecuada","Sub-optima","No se puede informar"};
	ArrayAdapter<String> adaptador;
		
	CheckBox Consolidacion;
	CheckBox DerramePleural;
	CheckBox BroncogramaAereo;
	CheckBox InfiltradoIntersticial; 
	CheckBox Empiema;
	CheckBox Atelectasia;
	EditText Otro;
	CheckBox CasoProbableNeumoniaBacteriana;
	 
	public static FEnfResp003 newInstance() {
		FEnfResp003 frag = new FEnfResp003();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		
		frag.setArguments(args);
		
		return frag;
	}
	
	public static FEnfResp003 newInstanceArgs(String caso_id) {
   		FEnfResp003 frag = new FEnfResp003();
		
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
		   rootView = inflater.inflate(R.layout.enfresp003f, container,false);
		   sclasifresult=(Spinner) rootView.findViewById(R.id.spinner11);
		   adaptador=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadena);
		   sclasifresult.setAdapter(adaptador);
		   
		   Consolidacion=(CheckBox)rootView.findViewById(R.id.CheckBox06);
		   DerramePleural=(CheckBox)rootView.findViewById(R.id.CheckBox05);
		   BroncogramaAereo=(CheckBox)rootView.findViewById(R.id.CheckBox13);
		   InfiltradoIntersticial=(CheckBox)rootView.findViewById(R.id.CheckBox12);
		   Empiema=(CheckBox)rootView.findViewById(R.id.CheckBox11);
		   Atelectasia=(CheckBox)rootView.findViewById(R.id.CheckBox04);
		   Otro=(EditText)rootView.findViewById(R.id.EditText01);
		   CasoProbableNeumoniaBacteriana=(CheckBox)rootView.findViewById(R.id.CheckBox03);
		 
		   if(getArguments().isEmpty()==false)
		     {
			   BDAcceso bd=new BDAcceso(rootView.getContext());
		    	 bd.open();
		    	 EnfResp003 er3=new EnfResp003();
		    	 er3=er3.selectEnfResp003(Long.valueOf(getArguments().getString("caso_id")), bd.getBD());
		    	 bd.close();
		    	 sclasifresult.setSelection(Integer.valueOf(er3.getClasifRx()));
		    	 Consolidacion.setChecked(er3.getConsolidacion());
		    	 DerramePleural.setChecked(er3.getDerramePleural());
		    	 BroncogramaAereo.setChecked(er3.getBroncogramaAereo());
		    	 InfiltradoIntersticial.setChecked(er3.getInfiltradoIntersticial());
		    	 Empiema.setChecked(er3.getEmpiema());
		    	 Atelectasia.setChecked(er3.getAtelectasia());
		    	 Otro.setText(er3.getOtro());
		    	 CasoProbableNeumoniaBacteriana.setChecked(er3.getCasoProbableNeumoniaBacteriana());
		    	 getArguments().clear();
		     }
		   
		   return rootView;

}
	
	public void CreateVars()
	{
		ER3=new EnfResp003("0", Consolidacion.isChecked(), DerramePleural.isChecked(), BroncogramaAereo.isChecked(), InfiltradoIntersticial.isChecked(), Empiema.isChecked(), Atelectasia.isChecked(), Otro.getText().toString(), String.valueOf(sclasifresult.getSelectedItemPosition()), CasoProbableNeumoniaBacteriana.isChecked());
	}
}

