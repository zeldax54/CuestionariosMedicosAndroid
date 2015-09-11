package CustomFragments;

import sqlite.BDAcceso;
import sqlite.EnfResp004;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.neumocuest.R;

public class FAps004 extends Fragment{
	
	View rootView;
	RelativeLayout lhide;
	CheckBox SI;
	TextView texthide;
	RelativeLayout cont;
	EnfResp004 ER4;
	
	CheckBox SIN;
	CheckBox N;
	CheckBox SNI_Ndolortoracico;
	CheckBox SNI_estertores;
	CheckBox SNI_Ncatarroprev;
	CheckBox SNI_Nfiebremas39;
	CheckBox SNI_Ndificultadresp;
	CheckBox SNI_Ntiraje;
	CheckBox SNI_Niractratprevio;
	EditText SNI_Notro;
	/*O*/
    CheckBox O;
	CheckBox SNI_Omembranaroja;
	CheckBox SNI_Omembranaabombada;
	CheckBox SNI_Omembranaperforada;
	CheckBox SNI_Ofiebremas38;
	CheckBox SNI_Ootalgia;
	CheckBox SNI_Oantecednetesira;
	EditText SNI_Ootro;
	CheckBox SNI_OantecedentesOMA;
	CheckBox SNI_Oconsumoantib;
	 /*R*/
	CheckBox Rr;
	EditText SNI_Rfiebre;
	EditText SNI_Rnumdias;
	CheckBox SNI_Rdolorgarg;
	CheckBox SI_Rmalestargen;
	CheckBox SNI_Rsecrecionmucop;
	CheckBox SNI_Rotalgia;
	CheckBox SNI_Riraanterior;
	EditText SNI_Rotros;
	
	public static FAps004 newInstance() {
		FAps004 frag = new FAps004();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	 

		public static FAps004 newInstanceArgs(String caso_id) {
			FAps004 frag = new FAps004();
			
			Bundle args = frag.getArguments();
			if(args == null)
				args = new Bundle();	
			
			args.putString("caso_id", caso_id);
			frag.setArguments(args);
			
			return frag;
		}
	 
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {		
	     rootView = inflater.inflate(R.layout.enfresp004f, container,false);
	     
	     lhide=(RelativeLayout)rootView.findViewById(R.id.relativeLayout1);
	     lhide.setVisibility(View.INVISIBLE);
	     lhide.setLayoutParams(new LayoutParams(0, 0));
	     
	     SI=(CheckBox)rootView.findViewById(R.id.CheckBox10);
	     SI.setVisibility(View.INVISIBLE);
		 texthide=(TextView)rootView.findViewById(R.id.textView1);
		 texthide.setText(""
		 		+ "        IV. Caracterización clínica Enfermedad Neumocócica no invasiva");
 
		 cont=(RelativeLayout)rootView.findViewById(R.id.relativeLayout3);		 
		 SIN=(CheckBox)rootView.findViewById(R.id.CheckBox01);   
	
	
		texthide.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
	    //SIN.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
		
		//cont.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, 1300));	
		 
		 N=(CheckBox)rootView.findViewById(R.id.CheckBox02);   
		 SNI_Ndolortoracico=(CheckBox)rootView.findViewById(R.id.CheckBox11);   
		 SNI_estertores=(CheckBox)rootView.findViewById(R.id.CheckBox03);   
		 SNI_Ncatarroprev=(CheckBox)rootView.findViewById(R.id.CheckBox05);   
		 SNI_Nfiebremas39=(CheckBox)rootView.findViewById(R.id.CheckBox04);   
		 SNI_Ndificultadresp=(CheckBox)rootView.findViewById(R.id.CheckBox044);   
		 SNI_Ntiraje=(CheckBox)rootView.findViewById(R.id.CheckBox0_6);   
		 SNI_Niractratprevio=(CheckBox)rootView.findViewById(R.id.CheckBox055); 
		 SNI_Notro=(EditText)rootView.findViewById(R.id.editText2);   
		  /*O*/
	     O=(CheckBox)rootView.findViewById(R.id.CheckBox06); 
		 SNI_Omembranaroja=(CheckBox)rootView.findViewById(R.id.CheckBox07); 
		 SNI_Omembranaabombada=(CheckBox)rootView.findViewById(R.id.CheckBox08); 
		 SNI_Omembranaperforada=(CheckBox)rootView.findViewById(R.id.CheckBox09); 
		 SNI_Ofiebremas38=(CheckBox)rootView.findViewById(R.id.CheckBox20); 
		 SNI_Ootalgia=(CheckBox)rootView.findViewById(R.id.CheckBox12); 
		 SNI_Oantecednetesira=(CheckBox)rootView.findViewById(R.id.CheckBox25); 
		 SNI_Ootro=(EditText)rootView.findViewById(R.id.EditText021);   
		 SNI_OantecedentesOMA=(CheckBox)rootView.findViewById(R.id.CheckBox13); 
		 SNI_Oconsumoantib=(CheckBox)rootView.findViewById(R.id.CheckBox14); 
		  /*R*/
		 Rr=(CheckBox)rootView.findViewById(R.id.CheckBox21); 
		 SNI_Rfiebre=(EditText)rootView.findViewById(R.id.editText1);   
		 SNI_Rnumdias=(EditText)rootView.findViewById(R.id.editText32);   
		 SNI_Rdolorgarg=(CheckBox)rootView.findViewById(R.id.CheckBox19); 
		 SI_Rmalestargen=(CheckBox)rootView.findViewById(R.id.CheckBox16); 
		 SNI_Rsecrecionmucop=(CheckBox)rootView.findViewById(R.id.CheckBox18); 
		 SNI_Rotalgia=(CheckBox)rootView.findViewById(R.id.CheckBox17); 
		 SNI_Riraanterior=(CheckBox)rootView.findViewById(R.id.CheckBox15); 
		 SNI_Rotros=(EditText)rootView.findViewById(R.id.EditText01);  
		 /*Layouts*/
		 
		 if(getArguments().isEmpty()==false)
		 {
			 BDAcceso bd=new BDAcceso(rootView.getContext());
	    	 bd.open();
	    	 EnfResp004 er4=new EnfResp004();
	    	 er4=er4.selectEnfResp004(Long.valueOf(getArguments().getString("caso_id")), bd.getBD());
	    	 bd.close();
	    	 SIN.setChecked(er4.getSIN());
	    	 N.setChecked(er4.getN());
	    	 SNI_Ndolortoracico.setChecked(er4.getSNI_Ndolortoracico());
	    	 SNI_estertores.setChecked(er4.getSNI_estertores());
	    	 SNI_Ncatarroprev.setChecked(er4.getSNI_Ncatarroprev());
	    	 SNI_Nfiebremas39.setChecked(er4.getSNI_Nfiebremas39());
	    	 SNI_Ndificultadresp.setChecked(er4.getSNI_Ndificultadresp());
	    	 SNI_Ntiraje.setChecked(er4.getSNI_Ntiraje());
	    	 SNI_Niractratprevio.setChecked(er4.getSNI_Niractratprevio());
	    	 SNI_Notro.setText(er4.getSNI_Notro());
	    	 O.setChecked(er4.getO());
	    	 SNI_Omembranaroja.setChecked(er4.getSNI_Omembranaroja());
	    	 SNI_Omembranaabombada.setChecked(er4.getSNI_Omembranaabombada());
	    	 SNI_Omembranaperforada.setChecked(er4.getSNI_Omembranaperforada());
	    	 SNI_Ofiebremas38.setChecked(er4.getSNI_Ofiebremas38());
	    	 SNI_Ootalgia.setChecked(er4.getSNI_Ootalgia());
	    	 SNI_Oantecednetesira.setChecked(er4.getSNI_Oantecednetesira());
	    	 SNI_Ootro.setText(er4.getSNI_Ootro());
	    	 SNI_OantecedentesOMA.setChecked(er4.getSNI_OantecedentesOMA());
	    	 SNI_Oconsumoantib.setChecked(er4.getSNI_Oconsumoantib());
	    	 Rr.setChecked(er4.getR());
	    	 SNI_Rfiebre.setText(er4.getSNI_Rfiebre());
	    	 SNI_Rnumdias.setText(er4.getSNI_Rnumdias());
	    	 SNI_Rdolorgarg.setChecked(er4.getSNI_Rdolorgarg());
	    	 SI_Rmalestargen.setChecked(er4.getSI_Rmalestargen());
	    	 SNI_Rsecrecionmucop.setChecked(er4.getSNI_Rsecrecionmucop());
	    	 SNI_Rotalgia.setChecked(er4.getSNI_Rotalgia());
	    	 SNI_Riraanterior.setChecked(er4.getSNI_Riraanterior());
	    	 SNI_Rotros.setText(er4.getSNI_Rotros());
	    	 getArguments().clear();
		 }
	     return rootView;
	}
	
	
	
	
	
	public void CreateVrs()
	{
		ER4=new EnfResp004("0",false,false, false, false, 
				false, false, "", false, "",false, 
				"", false, false, false, false, false,
				false, SIN.isChecked(), N.isChecked(), SNI_Ndolortoracico.isChecked(), SNI_estertores.isChecked(), SNI_Ncatarroprev.isChecked(), SNI_Nfiebremas39.isChecked(),
				SNI_Ndificultadresp.isChecked(), SNI_Ntiraje.isChecked(), SNI_Niractratprevio.isChecked(), SNI_Notro.getText().toString(), O.isChecked(), SNI_Omembranaroja.isChecked(), SNI_Omembranaabombada.isChecked(), 
				SNI_Omembranaperforada.isChecked(), SNI_Ofiebremas38.isChecked(), SNI_Ootalgia.isChecked(), SNI_Oantecednetesira.isChecked(), 
				SNI_Ootro.getText().toString(), SNI_OantecedentesOMA.isChecked(), SNI_Oconsumoantib.isChecked(), Rr.isChecked(), SNI_Rfiebre.getText().toString(), SNI_Rnumdias.getText().toString(), SNI_Rdolorgarg.isChecked(), 
				SI_Rmalestargen.isChecked(), SNI_Rsecrecionmucop.isChecked(), SNI_Rotalgia.isChecked(), SNI_Riraanterior.isChecked(), SNI_Rotros.getText().toString());
	}

	
	
	
	
	
	
	
	
	

}
