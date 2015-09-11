package CustomFragments;


import sqlite.Aps002;





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

public class FAps002 extends Fragment implements OnClickListener,OnCheckedChangeListener{

	Aps002 aps002;
	View rootView;
	
	 CheckBox CasSospNeumonBact;
	 CheckBox CasSospNeumViralUOC;
	 CheckBox ComiRep;
	 EditText Fiebre;
	 CheckBox tos;
	 CheckBox dolorgarg;
	 CheckBox difResp;
	 EditText FrecResp;
	 CheckBox escalofrios;
	 CheckBox mialgias;
	 CheckBox taquipnea;
	 CheckBox vomitos;
	 EditText otros;
	 CheckBox malestGener;
	 CheckBox dolorPleurit;
	 CheckBox tosCEsputo;
	 CheckBox IndRXSI;
	 CheckBox IndRXNO;
	 EditText fechIndic;
	 ImageButton IBFechaIndic;
	
	 public static FAps002 newInstance() {
		 FAps002 frag = new FAps002();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	 

		public static FAps002 newInstanceArgs(String caso_id) {
			FAps002 frag = new FAps002();
			
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
	     rootView = inflater.inflate(R.layout.aps002, container,false);
	     
	     CasSospNeumonBact=(CheckBox)rootView.findViewById(R.id.checkBox1);
	     CasSospNeumViralUOC=(CheckBox)rootView.findViewById(R.id.checkBox4);
	     ComiRep=(CheckBox)rootView.findViewById(R.id.checkBox5);
	     Fiebre=(EditText)rootView.findViewById(R.id.editText1);
	     tos=(CheckBox)rootView.findViewById(R.id.checkBox9);
	     dolorgarg=(CheckBox)rootView.findViewById(R.id.checkBox11);
	     difResp=(CheckBox)rootView.findViewById(R.id.checkBox13);
	     FrecResp=(EditText)rootView.findViewById(R.id.EditText01);
	     escalofrios=(CheckBox)rootView.findViewById(R.id.checkBox14);
	     mialgias=(CheckBox)rootView.findViewById(R.id.checkBox16);
	     taquipnea=(CheckBox)rootView.findViewById(R.id.checkBox15);
	     vomitos=(CheckBox)rootView.findViewById(R.id.checkBox10);
	     otros=(EditText)rootView.findViewById(R.id.EditText02);
	     malestGener=(CheckBox)rootView.findViewById(R.id.CheckBox01);
	     dolorPleurit=(CheckBox)rootView.findViewById(R.id.CheckBox02);
	     tosCEsputo=(CheckBox)rootView.findViewById(R.id.CheckBox03);
	     IndRXSI=(CheckBox)rootView.findViewById(R.id.CheckBox05f);
	     IndRXNO=(CheckBox)rootView.findViewById(R.id.CheckBox07);
	     fechIndic=(EditText)rootView.findViewById(R.id.EditTex005f);
	     IBFechaIndic=(ImageButton)rootView.findViewById(R.id.ImageButtonsh);
	     IBFechaIndic.setOnClickListener(this);
	     if(getArguments().isEmpty()==false)
	     {
	    	 Aps002 aa2=new Aps002();
	    	 BDAcceso bd=new BDAcceso(rootView.getContext());
	    	 bd.open();
	    	 aa2=aa2.selectAps002(getArguments().getString("caso_id"), bd.getBD());
	    	 CasSospNeumonBact.setChecked(aa2.getCasSospNeumonBact());
	    	 CasSospNeumViralUOC.setChecked(aa2.getCasSospNeumViralUOC());
	    	 ComiRep.setChecked(aa2.getComiRep());
	    	 Fiebre.setText(aa2.getFiebre());
	    	 tos.setChecked(aa2.gettos());
	    	 dolorgarg.setChecked(aa2.getdolorgarg());
	    	 difResp.setChecked(aa2.getdifResp());
	    	 FrecResp.setText(aa2.getFrecResp());
	    	 escalofrios.setChecked(aa2.getescalofrios());
	    	 mialgias.setChecked(aa2.getmialgias());
	    	 taquipnea.setChecked(aa2.gettaquipnea());
	    	 vomitos.setChecked(aa2.getvomitos());
	    	 otros.setText(aa2.getotros());
	    	 malestGener.setChecked(aa2.getmalestGener());
	    	 dolorPleurit.setChecked(aa2.getdolorPleurit());
	    	 tosCEsputo.setChecked(aa2.gettosCEsputo());
	    	 IndRXSI.setChecked(aa2.getIndRXSI());
	    	 IndRXNO.setChecked(aa2.getIndRXNO());
	    	 fechIndic.setText(aa2.getfechIndic());

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
			
			if(arg0.getId()==R.id.ImageButtonsh)
			{
			  s.InsertFecha(fechIndic, rootView);
			}
						
			s=null;
		}
	
	
	  	public void CreateVars()
	  	{
	  	aps002=new Aps002("0",CasSospNeumonBact.isChecked(),CasSospNeumViralUOC.isChecked(),ComiRep.isChecked(),
	  			Fiebre.getText().toString(),tos.isChecked(),dolorgarg.isChecked(),difResp.isChecked(),
	  			FrecResp.getText().toString(),escalofrios.isChecked(),mialgias.isChecked(),taquipnea.isChecked(),
	  			vomitos.isChecked(),otros.getText().toString(),malestGener.isChecked(),dolorPleurit.isChecked(),
	  			tosCEsputo.isChecked(),IndRXSI.isChecked(),IndRXNO.isChecked(),fechIndic.getText().toString());
	  	}

}
