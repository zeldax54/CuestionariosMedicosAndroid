package CustomFragments;

import sqlite.BDAcceso;
import sqlite.DatosHosp002;
import sqlite.DatosHosp003;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.app.neumocuest.R;

public class FDatosHosp003 extends Fragment {
	
	 View rootView;
	 DatosHosp003 d3;
	 EditText MuestasNum;
	 EditText MuestasPor;
	 EditText HemosNum;
	 EditText HemosPor;
	 EditText RespNum;
	 EditText RespPor;
	 EditText LCRNum;
	 EditText LCRPor;
	 EditText Observ;
	 
	public static FDatosHosp003 newInstance() {
		FDatosHosp003 frag = new FDatosHosp003();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	  		
		
		frag.setArguments(args);
		
		return frag;
	}
	
	public static FDatosHosp003 newInstanceArgs(String caso_id) {
		FDatosHosp003 frag = new FDatosHosp003();
		
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
	   rootView = inflater.inflate(R.layout.datoshosp003, container,false);	
	   MuestasNum=(EditText)rootView.findViewById(R.id.EditText12);
	   MuestasPor=(EditText)rootView.findViewById(R.id.EditText16);
	   HemosNum=(EditText)rootView.findViewById(R.id.EditText13);
	   HemosPor=(EditText)rootView.findViewById(R.id.EditText15);
	   RespNum=(EditText)rootView.findViewById(R.id.EditText01);
	   RespPor=(EditText)rootView.findViewById(R.id.EditText02);
	   LCRNum=(EditText)rootView.findViewById(R.id.EditText03);
	   LCRPor=(EditText)rootView.findViewById(R.id.EditText04);
	   Observ=(EditText)rootView.findViewById(R.id.EditText14);
	   
	   if(getArguments().isEmpty()==false)
	   {
		   
	 	  	BDAcceso bd=new BDAcceso(rootView.getContext());
	 	   	bd.open();
	 	  	DatosHosp003 dh3=new DatosHosp003();
	 	   	dh3=dh3.selectDatosHosp003(getArguments().getString("caso_id"), bd.getBD());
	 	   bd.close();
		   MuestasNum.setText(dh3.getMuestasNum());
		   MuestasPor.setText(dh3.getMuestasPor());
		   HemosNum.setText(dh3.getHemosNum());
		   HemosPor.setText(dh3.getHemosPor());
		   RespNum.setText(dh3.getRespNum());
		   RespPor.setText(dh3.getRespPor());
		   LCRNum.setText(dh3.getLCRNum());
		   LCRPor.setText(dh3.getLCRPor());
		   Observ.setText(dh3.getObserv());
		   
		   getArguments().clear();
	   }
	   
	   return rootView;
	}
	public void CreateVars()
	{
	d3=new DatosHosp003("0", MuestasNum.getText().toString(), MuestasPor.getText().toString(), HemosNum.getText().toString(), HemosPor.getText().toString(), RespNum.getText().toString(), RespPor.getText().toString(), LCRNum.getText().toString(), LCRPor.getText().toString(), Observ.getText().toString(),"","");
	}

}

