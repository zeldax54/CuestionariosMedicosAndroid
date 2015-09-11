package CustomFragments;

import sqlite.BDAcceso;
import sqlite.EnfResp001;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class FEnfResp001  extends Fragment implements OnClickListener{
	
	EnfResp001 ER1=null;
	View rootView;
	 String [] cadena={"No","Si","No Sabe"};
	 Spinner sfiebre;
	 ArrayAdapter<String> adaptador;
	 
	 EditText eFiebre;
	 CheckBox cTos;
	 CheckBox cDolorGarganta;
	 CheckBox cDificultadRespirar;
	 EditText eFrecuenciaRespiratoria;
	 CheckBox cRxTorax;
	 EditText eRxToraxFechaIndicacion;
	 ImageButton bRxToraxFechaIndicacion;
	 
	 
	 
   	public static FEnfResp001 newInstance() {
   		FEnfResp001 frag = new FEnfResp001();
   		
   		Bundle args = frag.getArguments();
   		if(args == null)
   			args = new Bundle();	  		
   		
   		frag.setArguments(args);
   		
   		return frag;
   	}
   	
   	public static FEnfResp001 newInstanceArgs(String caso_id) {
   		FEnfResp001 frag = new FEnfResp001();
		
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
   	   rootView = inflater.inflate(R.layout.enfresp001f, container,false);	
   	  adaptador=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadena);			
		sfiebre=(Spinner)rootView.findViewById(R.id.spinner11);		
		sfiebre.setAdapter(adaptador);
		
		eFiebre=(EditText)rootView.findViewById(R.id.editText1f);
		cTos=(CheckBox)rootView.findViewById(R.id.checkBox1);
		cDolorGarganta=(CheckBox)rootView.findViewById(R.id.checkBox2);
		cDificultadRespirar=(CheckBox)rootView.findViewById(R.id.checkBox3);
		eFrecuenciaRespiratoria=(EditText)rootView.findViewById(R.id.editText2);
		cRxTorax=(CheckBox)rootView.findViewById(R.id.checkBox5);
		eRxToraxFechaIndicacion=(EditText)rootView.findViewById(R.id.editText32);
		bRxToraxFechaIndicacion=(ImageButton)rootView.findViewById(R.id.boton4);
		bRxToraxFechaIndicacion.setOnClickListener(this);
		
		 if(getArguments().isEmpty()==false)
	     {
	    	 BDAcceso bd=new BDAcceso(rootView.getContext());
	    	 EnfResp001 er1=new EnfResp001();
	    	 
	    	 er1=bd.Select001(Long.valueOf(getArguments().getString("caso_id")), er1);
	    	 sfiebre.setSelection(Integer.valueOf(er1.getAntecedentesF()));
	    	 eFiebre.setText(er1.getFiebre());
	    	 cTos.setChecked(er1.getTos());
	    	 cDolorGarganta.setChecked(er1.getDolorGarganta());
	    	 cDificultadRespirar.setChecked(er1.getDificultadRespirar());
	    	 eFrecuenciaRespiratoria.setText(er1.getFrecuenciaRespiratoria());
	    	 cRxTorax.setChecked(er1.getRxTorax());
	    	 eRxToraxFechaIndicacion.setText(er1.getRxToraxFechaIndicacion());
	    	 getArguments().clear();
	     }
		
   	   return rootView;
   	}
   	
   	
   	
   	public void CreateVars()
   	{
   		ER1=new EnfResp001("0", String.valueOf(sfiebre.getSelectedItemPosition()).toString(), eFiebre.getText().toString(), cTos.isChecked(), cDolorGarganta.isChecked(), 
   				cDificultadRespirar.isChecked(), eFrecuenciaRespiratoria.getText().toString(), cRxTorax.isChecked(), eRxToraxFechaIndicacion.getText().toString());
   	}



	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		SelectorFecha s=new SelectorFecha();
		if(arg0.getId()==R.id.boton4)
		{
		  s.InsertFecha(eRxToraxFechaIndicacion, rootView);
		}
		s=null;
	}

}
