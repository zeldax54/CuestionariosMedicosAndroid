package CustomFragments;

import sqlite.BDAcceso;
import sqlite.EIPK003;
import sqlite.EIPK004;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

public class FIPK004  extends Fragment implements OnClickListener{

	View rootView;
	EIPK004 e4;
	EditText app;
	Spinner enfsimilar;
	Spinner historiaviajes;
	EditText pais;
	EditText fechallegada;
	Spinner tratprev;
	EditText cuales;
	Spinner vac;
	EditText fecha2;
	EditText nombre;
	EditText result;
	
	ImageButton bfechallegada;
	ImageButton bfecha2;
	ArrayAdapter<String> adap;
	String[]cadena={"No","Si"};
	
	public static FIPK004 newInstanceArgs(String caso_id) {
		 FIPK004 frag = new FIPK004();
			
			Bundle args = frag.getArguments();
			if(args == null)
				args = new Bundle();			
			args.putString("caso_id",caso_id);
			frag.setArguments(args);			
			return frag;
		}
	 
	
	  	public static FIPK004 newInstance() {
	  		FIPK004 frag = new FIPK004();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();		   		
	   		frag.setArguments(args);	   		
	   		return frag;
	   	}
	  	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {		
	     rootView = inflater.inflate(R.layout.eipk004,container,false);
	     app=(EditText)rootView.findViewById(R.id.EditText04);
	     adap=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadena);	
		   
	     enfsimilar=(Spinner)rootView.findViewById(R.id.Spinner01);
	     enfsimilar.setAdapter(adap);
	     historiaviajes=(Spinner)rootView.findViewById(R.id.Spinner02);
	     historiaviajes.setAdapter(adap);
	     pais=(EditText)rootView.findViewById(R.id.EditText01);
	     
	     fechallegada=(EditText)rootView.findViewById(R.id.EditText02);
	     
	     tratprev=(Spinner)rootView.findViewById(R.id.Spinner03);
	     tratprev.setAdapter(adap);
	     
	       cuales=(EditText)rootView.findViewById(R.id.EditText03);
	    
	     vac=(Spinner)rootView.findViewById(R.id.Spinner04);
	     vac.setAdapter(adap);
	     fecha2=(EditText)rootView.findViewById(R.id.EditText05);
	     nombre=(EditText)rootView.findViewById(R.id.EditText06);
	     result=(EditText)rootView.findViewById(R.id.EditText07);
	     

	 	 bfechallegada=(ImageButton)rootView.findViewById(R.id.ImageButton01);
	 	 bfechallegada.setOnClickListener(this);
	 	 bfecha2=(ImageButton)rootView.findViewById(R.id.ImageButton02);
	 	 bfecha2.setOnClickListener(this);
	 	 
	 	 if(getArguments().isEmpty()==false)
	 	 {

	 	 	BDAcceso bd=new BDAcceso(rootView.getContext());
	 		EIPK004 ee4=new EIPK004();
	 		bd.open();
	 		ee4=ee4.selectEIPK004(getArguments().getString("caso_id"), bd.getBD());
	 		bd.close();
	 		app.setText(ee4.getapp());
	 		enfsimilar.setSelection(Integer.valueOf(ee4.getenfsimilar()));
	 		historiaviajes.setSelection(Integer.valueOf(ee4.gethistoriaviajes()));
	 		pais.setText(ee4.getpais());
	 		fechallegada.setText(ee4.getfechallegada());
	 		tratprev.setSelection(Integer.valueOf(ee4.gettratprev()));
	 		cuales.setText(ee4.getcuales());
	 		vac.setSelection(Integer.valueOf(ee4.getvac()));
	 		fecha2.setText(ee4.getfecha2());
	 		nombre.setText(ee4.getnombre());
	 		result.setText(ee4.getresult());
	 		getArguments().clear();
	 	 }

	     return rootView;
	}
	
	public void CreateVars()
	{
	e4=new EIPK004("0", app.getText().toString(),String.valueOf( enfsimilar.getSelectedItemPosition()),String.valueOf( historiaviajes.getSelectedItemPosition()), pais.getText().toString(), fechallegada.getText().toString(),String.valueOf( tratprev.getSelectedItemPosition()), cuales.getText().toString(),String.valueOf( vac.getSelectedItemPosition()), fecha2.getText().toString(), nombre.getText().toString(), result.getText().toString());
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		SelectorFecha s=new SelectorFecha();
	
		if(arg0.getId()==R.id.ImageButton01)
		{
			s.InsertFecha(fechallegada, rootView);
		}
		if(arg0.getId()==R.id.ImageButton02)
		{
			s.InsertFecha(fecha2, rootView);
		}
		s=null;
	}
}

