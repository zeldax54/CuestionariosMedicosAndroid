package CustomFragments;


import sqlite.BDAcceso;
import sqlite.Mening002;
import sqlite.Mening003;

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

public class FMening003 extends Fragment implements OnClickListener,OnCheckedChangeListener{

	Mening003 m003;
	 View rootView;
	
	 CheckBox MeningHInfluenzae;
	 CheckBox EnfermMening;
	 CheckBox MM;
	 CheckBox MC;
	 CheckBox MeninguitisViral;
	 EditText OtraEtiolog;
	 

	 public static FMening003 newInstanceArgs(String caso_id) {
		 FMening003 frag = new FMening003();
			
			Bundle args = frag.getArguments();
			if(args == null)
				args = new Bundle();
			
			args.putString("caso_id",caso_id);
			frag.setArguments(args);
			
			return frag;
		}

		public static FMening003 newInstance() {
	  		FMening003 frag = new FMening003();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflamos la Vista que se debe mostrar en pantalla.
	     rootView = inflater.inflate(R.layout.mening003, container,false);
	    
	     MeningHInfluenzae=(CheckBox)rootView.findViewById(R.id.checkBox1);
	     EnfermMening=(CheckBox)rootView.findViewById(R.id.checkBox2);
	     MM=(CheckBox)rootView.findViewById(R.id.checkBox3);
	     MC=(CheckBox)rootView.findViewById(R.id.checkBox4);
	     MeninguitisViral=(CheckBox)rootView.findViewById(R.id.checkBox5);    
	     OtraEtiolog=(EditText)rootView.findViewById(R.id.editText1);

	     if(getArguments().isEmpty()==false)
	     {
	    	 Mening003 m3=new Mening003();
	    	 BDAcceso bd=new BDAcceso(rootView.getContext());
	    	 bd.open();
	    	 m3=m3.selectMening003(getArguments().getString("caso_id"), bd.getBD());
	    	 bd.close();
	    	 MeningHInfluenzae.setChecked(m3.getMeningHInfluenzae());
	    	 EnfermMening.setChecked(m3.getEnfermMening());
	    	 MM.setChecked(m3.getMM());
	    	 MC.setChecked(m3.getMC());
	    	 MeninguitisViral.setChecked(m3.getMeninguitisViral());
	    	 OtraEtiolog.setText(m3.getOtraEtiolog());
	    	 m3=null;
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
	  		
	  	}
	  	
	  	public void CreateVars()
	  	{	  	
	  		m003=new Mening003("0",MeningHInfluenzae.isChecked(),EnfermMening.isChecked(),MM.isChecked(),MC.isChecked(),
	  				MeninguitisViral.isChecked(),OtraEtiolog.getText().toString());
	  	}
}
