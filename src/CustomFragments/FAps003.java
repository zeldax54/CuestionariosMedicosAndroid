package CustomFragments;
import sqlite.Aps003;
import sqlite.BDAcceso;

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

public class FAps003 extends Fragment implements OnClickListener,OnCheckedChangeListener{

	 Aps003 aps003;
	 View rootView;
	 
	 CheckBox OtMediaAgBacter;
	 CheckBox RinosinuAgBacter;
	 CheckBox ETI;
	 EditText fiebre;
	 EditText NoDias;
	 CheckBox dolorGarg;
	 CheckBox malesGeneral;
	 CheckBox secrecMucu;
	 CheckBox Otalg;
	 CheckBox AntecedIRAAnt;
	 EditText Otros;
	 CheckBox MrespEVir;
	 CheckBox MrespEBact;
	 EditText fecEXVirolog;
	 ImageButton IBFechaEV;
	 
	 EditText FecEXBacteriol;
	 ImageButton IBFechaEB;
	
	 public static FAps003 newInstance() {
		 FAps003 frag = new FAps003();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	 

		public static FAps003 newInstanceArgs(String caso_id) {
			FAps003 frag = new FAps003();
			
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
	     rootView = inflater.inflate(R.layout.aps003, container,false);
	     
	     OtMediaAgBacter=(CheckBox)rootView.findViewById(R.id.checkBox9);
	     RinosinuAgBacter=(CheckBox)rootView.findViewById(R.id.checkBox14f);
	     ETI=(CheckBox)rootView.findViewById(R.id.checkBox16);
	     fiebre=(EditText)rootView.findViewById(R.id.EditText01);
	     NoDias=(EditText)rootView.findViewById(R.id.EditText02);
	     dolorGarg=(CheckBox)rootView.findViewById(R.id.CheckBox05);
	     malesGeneral=(CheckBox)rootView.findViewById(R.id.CheckBox02);
	     secrecMucu=(CheckBox)rootView.findViewById(R.id.CheckBox07);
	     Otalg=(CheckBox)rootView.findViewById(R.id.CheckBox01);
	     AntecedIRAAnt=(CheckBox)rootView.findViewById(R.id.CheckBox03);
	     Otros=(EditText)rootView.findViewById(R.id.editText1);
	     MrespEVir=(CheckBox)rootView.findViewById(R.id.CheckBox09);
	     MrespEBact=(CheckBox)rootView.findViewById(R.id.CheckBox04);
	     
	     fecEXVirolog=(EditText)rootView.findViewById(R.id.EditText022);
	     IBFechaEV=(ImageButton)rootView.findViewById(R.id.ImageButton02);
	     IBFechaEV.setOnClickListener(this);
	     
	     FecEXBacteriol=(EditText)rootView.findViewById(R.id.EditText033);
	     IBFechaEB=(ImageButton)rootView.findViewById(R.id.ImageButton033);
	     IBFechaEB.setOnClickListener(this);
	     if(getArguments().isEmpty()==false)
	     {
	    	 BDAcceso bd=new BDAcceso(rootView.getContext());
	    	 Aps003 a3=new Aps003();
	    	 bd.open();
	    	 a3=a3.selectAps003(getArguments().getString("caso_id"), bd.getBD());
	    	 bd.close();
	    	 OtMediaAgBacter.setChecked(a3.getOtMediaAgBacter());
	    	 RinosinuAgBacter.setChecked(a3.getRinosinuAgBacter());
	    	 ETI.setChecked(a3.getETI());
	    	 fiebre.setText(a3.getfiebre());
	    	 NoDias.setText(a3.getNoDias());
	    	 dolorGarg.setChecked(a3.getdolorGarg());
	    	 malesGeneral.setChecked(a3.getmalesGeneral());
	    	 secrecMucu.setChecked(a3.getsecrecMucu());
	    	 Otalg.setChecked(a3.getOtalg());
	    	 AntecedIRAAnt.setChecked(a3.getAntecedIRAAnt());
	    	 Otros.setText(a3.getOtros());
	    	 MrespEVir.setChecked(a3.getMrespEVir());
	    	 MrespEBact.setChecked(a3.getMrespEBact());
	    	 fecEXVirolog.setText(a3.getfecEXVirolog());
	    	 FecEXBacteriol.setText(a3.getFecEXBacteriol());
	     }
	     
	     return rootView;
	  	}
	  	
	  	@Override
	  	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
	  		// TODO Auto-generated method stub
	  		
	  	}

	  	public void onClick(View arg0) {
			// TODO Auto-generated method stub
			SelectorFecha s=new SelectorFecha();
			
			if(arg0.getId()==R.id.ImageButton02)
			{
			  s.InsertFecha(fecEXVirolog, rootView);
			}
			if(arg0.getId()==R.id.ImageButton033)
			{
			  s.InsertFecha(FecEXBacteriol, rootView);
			}			
			
			s=null;
		}
	
	  	public void CreateVars()
	  	{
	  	aps003=new Aps003("0",OtMediaAgBacter.isChecked(),RinosinuAgBacter.isChecked(),ETI.isChecked(),
	  			fiebre.getText().toString(),NoDias.getText().toString(),dolorGarg.isChecked(),malesGeneral.isChecked(),
	  			secrecMucu.isChecked(),Otalg.isChecked(),AntecedIRAAnt.isChecked(),Otros.getText().toString(),
	  			MrespEVir.isChecked(),MrespEBact.isChecked(),fecEXVirolog.getText().toString(),
	  			FecEXBacteriol.getText().toString());
	  	}
	
	
	
	
	
	

}
