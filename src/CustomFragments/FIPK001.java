package CustomFragments;

import sqlite.BDAcceso;
import sqlite.EIPK001;
import sqlite.Mening001;
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

public class FIPK001 extends Fragment implements OnClickListener{

	View rootView;
	EIPK001 e1;
	
	EditText Nombre;
	EditText carne;
	EditText direccion;
	EditText municipio;
	Spinner provincia;
	EditText histclinica;
	EditText edad;
	Spinner sexo;
	EditText oucpacion;
	Spinner piel;
	EditText diasingreso;
	EditText centrorem;
	EditText sala;
	EditText municipio2;
	Spinner provincia2;
	EditText fecha;
	
	 ImageButton boton;
	  String [] csexo={"Masculino","Femenino"};
	  ArrayAdapter<String>asexo;
	  String [] cpiel={"Blanca","Negra","Amarilla","Mestiza"};
	  ArrayAdapter<String>apiel;
	  String[]cprov={"Pinar del Rio","Artemisa","La Habana","Matanzas","Villa Clara","Cienfuegos",
			  "Sancti Spiritus","Ciego de Ávila","Camagüey","Las Tunas","Granma","Holguín",
			  "Santiago de Cuba","Guantánamo","Isla de La Juventud"};
	  ArrayAdapter<String>aprov;
	 
	  public static FIPK001 newInstanceArgs(String caso_id) {
		 FIPK001 frag = new FIPK001();
			
			Bundle args = frag.getArguments();
			if(args == null)
				args = new Bundle();
			
			args.putString("caso_id",caso_id);
			frag.setArguments(args);
			
			return frag;
		}
	 
	
	  	public static FIPK001 newInstance() {
	  		FIPK001 frag = new FIPK001();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflamos la Vista que se debe mostrar en pantalla.
	     rootView = inflater.inflate(R.layout.eipk001,container,false);
	     
	     Nombre=(EditText)rootView.findViewById(R.id.editText09);
	     carne=(EditText)rootView.findViewById(R.id.EditText03);
	     direccion=(EditText)rootView.findViewById(R.id.editText14);
	     municipio=(EditText)rootView.findViewById(R.id.editText12j);
	     provincia=(Spinner)rootView.findViewById(R.id.Spinner01);
	     aprov=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cprov);	
	     provincia.setAdapter(aprov);
	     
	     histclinica=(EditText)rootView.findViewById(R.id.editText7);
	     edad=(EditText)rootView.findViewById(R.id.editText116);
	     sexo=(Spinner)rootView.findViewById(R.id.spinner11);
	     asexo=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,csexo);	
	     sexo.setAdapter(asexo);
	     
	     oucpacion=(EditText)rootView.findViewById(R.id.editText15);
	     
	     piel=(Spinner)rootView.findViewById(R.id.Spinner02);
	     apiel=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cpiel);	
	     piel.setAdapter(apiel);
	     
	     diasingreso=(EditText)rootView.findViewById(R.id.editText10);
	     centrorem=(EditText)rootView.findViewById(R.id.editText11);
	     sala=(EditText)rootView.findViewById(R.id.EditText01);
	     municipio2=(EditText)rootView.findViewById(R.id.EditText02);
	     provincia2=(Spinner)rootView.findViewById(R.id.Spinner03);
	     provincia2.setAdapter(aprov);
	     fecha=(EditText)rootView.findViewById(R.id.editText169);
	     boton=(ImageButton)rootView.findViewById(R.id.boton3ps);
	     boton.setOnClickListener(this);
	     if(getArguments().isEmpty()==false)
	     {
	    	 BDAcceso bd=new BDAcceso(rootView.getContext());
	 			EIPK001 ee1=new EIPK001();
	 			bd.open();
	 			ee1=ee1.selectEIPK001(getArguments().getString("caso_id"), bd.getBD());
	 			bd.close();
	 			Nombre.setText(ee1.getNombre());
	 			carne.setText(ee1.getcarne());
	 			direccion.setText(ee1.getdireccion());
	 			municipio.setText(ee1.getmunicipio());
	 			provincia.setSelection(Integer.valueOf(ee1.getprovincia()));
	 			histclinica.setText(ee1.gethistclinica());
	 			edad.setText(ee1.getedad());
	 			sexo.setSelection(Integer.valueOf(ee1.getsexo()));
	 			oucpacion.setText(ee1.getoucpacion());
	 			piel.setSelection(Integer.valueOf(ee1.getpiel()));
	 			diasingreso.setText(ee1.getdiasingreso());
	 			centrorem.setText(ee1.getcentrorem());
	 			sala.setText(ee1.getsala());
	 			municipio2.setText(ee1.getmunicipio2());
	 			provincia2.setSelection(Integer.valueOf(ee1.getprovincia2()));
	 			fecha.setText(ee1.getfecha());
	 			getArguments().clear();
	     }
	     return rootView;
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.boton3ps)
		{
			SelectorFecha s=new SelectorFecha();
			s.InsertFecha(fecha, rootView);
			s=null;
		}
		
	}
	
	public void CreateVars()
	{
	e1=new EIPK001("0","6", Nombre.getText().toString(), carne.getText().toString(), direccion.getText().toString(), municipio.getText().toString(),String.valueOf( provincia.getSelectedItemPosition()), histclinica.getText().toString(), edad.getText().toString(),String.valueOf( sexo.getSelectedItemPosition()), oucpacion.getText().toString(),String.valueOf( piel.getSelectedItemPosition()), diasingreso.getText().toString(), centrorem.getText().toString(), sala.getText().toString(), municipio2.getText().toString(),String.valueOf( provincia2.getSelectedItemPosition()), fecha.getText().toString());
	}
}
