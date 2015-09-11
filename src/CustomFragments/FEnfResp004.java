package CustomFragments;
import sqlite.BDAcceso;
import sqlite.EnfResp004;
import com.app.neumocuest.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class FEnfResp004  extends Fragment implements OnCheckedChangeListener{
	View rootView;
	EnfResp004 ER4;
	/*SI*/
	CheckBox SI;
	CheckBox SIbacteriminia;
	CheckBox SIhemocultivopos;
	CheckBox SIfiebreunicamanif;
	CheckBox SIsepsis;
	CheckBox SIdistermia;
	EditText SItemperatura;
	CheckBox SItaquicardiaedad;
	EditText SIfrecuanciaresp;
	CheckBox SItaquipneaedad;
	EditText SIfrecuanciacard;
	CheckBox SIalteracionesfleuc;
	CheckBox SIexceso;
	CheckBox SIdefecto;
	CheckBox SIformasinmaduras;
	CheckBox SIsepsissevera;
	CheckBox SIsockseptico;
	 /*SIN*/
	   /*N*/
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
	/*Lays*/
	RelativeLayout laySI;
	RelativeLayout laySIN;
	
	public static FEnfResp004 newInstance() {
		FEnfResp004 frag = new FEnfResp004();
   		
   		Bundle args = frag.getArguments();
   		if(args == null)
   			args = new Bundle();	  		
   		
   		frag.setArguments(args);
   		
   		return frag;
   	}
	
	public static FEnfResp004 newInstanceArgs(String caso_id) {
   		FEnfResp004 frag = new FEnfResp004();
		
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
   	   rootView = inflater.inflate(R.layout.enfresp004f, container,false);	
   	   /*SI*/
   	SI=(CheckBox)rootView.findViewById(R.id.CheckBox10);
   	SI.setOnCheckedChangeListener(this);
    SIbacteriminia=(CheckBox)rootView.findViewById(R.id.CheckBox37);
   	SIhemocultivopos=(CheckBox)rootView.findViewById(R.id.CheckBox27);
   	SIfiebreunicamanif=(CheckBox)rootView.findViewById(R.id.CheckBox33);
   	SIsepsis=(CheckBox)rootView.findViewById(R.id.CheckBox38);
   	SIdistermia=(CheckBox)rootView.findViewById(R.id.CheckBox32);
   	SItemperatura=(EditText)rootView.findViewById(R.id.EditText03);
   	SItaquicardiaedad=(CheckBox)rootView.findViewById(R.id.CheckBox36);
   	SIfrecuanciaresp=(EditText)rootView.findViewById(R.id.EditText021f);
   	SItaquipneaedad=(CheckBox)rootView.findViewById(R.id.CheckBox34);   
   	SIfrecuanciacard=(EditText)rootView.findViewById(R.id.EditText02);
	 SIalteracionesfleuc=(CheckBox)rootView.findViewById(R.id.CheckBox26);   
	 SIexceso=(CheckBox)rootView.findViewById(R.id.CheckBox28);   
	 SIdefecto=(CheckBox)rootView.findViewById(R.id.CheckBox35);   
	 SIformasinmaduras=(CheckBox)rootView.findViewById(R.id.CheckBox39);   
	 SIsepsissevera=(CheckBox)rootView.findViewById(R.id.CheckBox29);   
	 SIsockseptico=(CheckBox)rootView.findViewById(R.id.CheckBox30);   
	 /*SIN*/
	  /*N*/
	 SIN=(CheckBox)rootView.findViewById(R.id.CheckBox01);   
	 SIN.setOnCheckedChangeListener(this);
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
	 laySI=(RelativeLayout)rootView.findViewById(R.id.relativeLayout1); 
	 laySI.setAlpha((float)0.5);
	 laySIN=(RelativeLayout)rootView.findViewById(R.id.relativeLayout3); 
	 laySIN.setAlpha((float)0.5);
	 if(getArguments().isEmpty()==false)
     {
    	 BDAcceso bd=new BDAcceso(rootView.getContext());
    	 bd.open();
    	 EnfResp004 er4=new EnfResp004();
    	 er4=er4.selectEnfResp004(Long.valueOf(getArguments().getString("caso_id")), bd.getBD());
    	 bd.close();
    	 SI.setChecked(er4.getSI());
    	 SIbacteriminia.setChecked(er4.getSIbacteriminia());
    	 SIhemocultivopos.setChecked(er4.getSIhemocultivopos());
    	 SIfiebreunicamanif.setChecked(er4.getSIfiebreunicamanif());
    	 SIsepsis.setChecked(er4.getSIsepsis());
    	 SIdistermia.setChecked(er4.getSIdistermia());
    	 SItemperatura.setText(er4.getSItemperatura());
    	 SItaquicardiaedad.setChecked(er4.getSItaquicardiaedad());
    	 SIfrecuanciaresp.setText(er4.getSIfrecuanciaresp());
    	 SItaquipneaedad.setChecked(er4.getSItaquipneaedad());
    	 SIfrecuanciacard.setText(er4.getSIfrecuanciacard());
    	 SIalteracionesfleuc.setChecked(er4.getSIalteracionesfleuc());
    	 SIexceso.setChecked(er4.getSIexceso());
    	 SIdefecto.setChecked(er4.getSIdefecto());
    	 SIformasinmaduras.setChecked(er4.getSIformasinmaduras());
    	 SIsepsissevera.setChecked(er4.getSIsepsissevera());
    	 SIsockseptico.setChecked(er4.getSIsockseptico());
    	 
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

	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.CheckBox10)
		{
			if(arg1)
				 laySI.setAlpha((float)1);
			else
				laySI.setAlpha((float)0.5);
				
		}
		if(arg0.getId()==R.id.CheckBox01)
		{
			if(arg1)
				 laySIN.setAlpha((float)1);
			else
				laySIN.setAlpha((float)0.5);
				
		}
		
	}
	
	public void CreateVrs()
	{
		ER4=new EnfResp004("0", SI.isChecked(), SIbacteriminia.isChecked(), SIhemocultivopos.isChecked(), SIfiebreunicamanif.isChecked(), 
				SIsepsis.isChecked(), SIdistermia.isChecked(), SItemperatura.getText().toString(), SItaquicardiaedad.isChecked(), SIfrecuanciaresp.getText().toString(),SItaquipneaedad.isChecked(), 
				SIfrecuanciacard.getText().toString(), SIalteracionesfleuc.isChecked(), SIexceso.isChecked(), SIdefecto.isChecked(), SIformasinmaduras.isChecked(), SIsepsissevera.isChecked(),
				SIsockseptico.isChecked(), SIN.isChecked(), N.isChecked(), SNI_Ndolortoracico.isChecked(), SNI_estertores.isChecked(), SNI_Ncatarroprev.isChecked(), SNI_Nfiebremas39.isChecked(),
				SNI_Ndificultadresp.isChecked(), SNI_Ntiraje.isChecked(), SNI_Niractratprevio.isChecked(), SNI_Notro.getText().toString(), O.isChecked(), SNI_Omembranaroja.isChecked(), SNI_Omembranaabombada.isChecked(), 
				SNI_Omembranaperforada.isChecked(), SNI_Ofiebremas38.isChecked(), SNI_Ootalgia.isChecked(), SNI_Oantecednetesira.isChecked(), 
				SNI_Ootro.getText().toString(), SNI_OantecedentesOMA.isChecked(), SNI_Oconsumoantib.isChecked(), Rr.isChecked(), SNI_Rfiebre.getText().toString(), SNI_Rnumdias.getText().toString(), SNI_Rdolorgarg.isChecked(), 
				SI_Rmalestargen.isChecked(), SNI_Rsecrecionmucop.isChecked(), SNI_Rotalgia.isChecked(), SNI_Riraanterior.isChecked(), SNI_Rotros.getText().toString());
	}

}
