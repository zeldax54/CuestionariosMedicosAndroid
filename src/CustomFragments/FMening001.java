package CustomFragments;

import sqlite.BDAcceso;
import sqlite.EnfResp008;
import sqlite.Mening001;

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

public class FMening001 extends Fragment implements OnClickListener,OnCheckedChangeListener{

	Mening001 m001;
	 View rootView;
	 

	 CheckBox sospecha;
	 EditText fiebre;
	 CheckBox RigidezNuca;
	 CheckBox Cefalea;
	 CheckBox Vomitos;
	 CheckBox Fotofobia;
	 CheckBox Convulciones;
	 CheckBox OtrosSignosMenigios;
	 CheckBox AlteracionesConciencia;
	 CheckBox PetequiasOPurpuras;
	 CheckBox TrastornosConducta;
	 EditText Otras;
	 CheckBox m1aAbombatamientoFontanela;
	 CheckBox m1aConvulciones;
	 CheckBox m1aLetargia;
	 CheckBox m1aSinJustoCausaClinica;
	 EditText m1aOtras;
	 CheckBox lcrTubridez;
	 CheckBox lcrHipertension;
	 CheckBox lcrDisminucionFluidez;
	 CheckBox lcrPleocitosisMenorA9xmm3PredoNeutrofilos;
	 CheckBox lcrProteinorraquiaMenor99mg_dl;
	 CheckBox lcrHipoglicorraquiaMenor40mg_dl;
	 EditText lcrOtras;
	 CheckBox aeContactoCasoPrevio;
	 CheckBox aeinternamiento;
	 CheckBox aeAcinamiento;
	 EditText aeOtras;

	 public static FMening001 newInstanceArgs(String caso_id) {
		 FMening001 frag = new FMening001();
			
			Bundle args = frag.getArguments();
			if(args == null)
				args = new Bundle();
			
			args.putString("caso_id",caso_id);
			frag.setArguments(args);
			
			return frag;
		}
	 
	
	  	public static FMening001 newInstance() {
	  		FMening001 frag = new FMening001();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflamos la Vista que se debe mostrar en pantalla.
	     rootView = inflater.inflate(R.layout.mening001, container,false);
	     sospecha=(CheckBox)rootView.findViewById(R.id.checkBox1);
	     fiebre=(EditText)rootView.findViewById(R.id.editText1);
	     RigidezNuca=(CheckBox)rootView.findViewById(R.id.checkBox3);
	     Cefalea=(CheckBox)rootView.findViewById(R.id.checkBox4);
	     Vomitos=(CheckBox)rootView.findViewById(R.id.checkBox5);
	     Fotofobia=(CheckBox)rootView.findViewById(R.id.checkBox6);
	     Convulciones=(CheckBox)rootView.findViewById(R.id.checkBox7);
	     OtrosSignosMenigios=(CheckBox)rootView.findViewById(R.id.checkBox8);
	     AlteracionesConciencia=(CheckBox)rootView.findViewById(R.id.checkBox9);
	     PetequiasOPurpuras=(CheckBox)rootView.findViewById(R.id.checkBox10);
	     TrastornosConducta=(CheckBox)rootView.findViewById(R.id.checkBox11);
	     Otras=(EditText)rootView.findViewById(R.id.editText2);
	    
	     m1aAbombatamientoFontanela=(CheckBox)rootView.findViewById(R.id.checkBox13);
	     m1aConvulciones=(CheckBox)rootView.findViewById(R.id.checkBox14);
	     m1aLetargia=(CheckBox)rootView.findViewById(R.id.checkBox15);
	     m1aSinJustoCausaClinica=(CheckBox)rootView.findViewById(R.id.checkBox16);
	     m1aOtras=(EditText)rootView.findViewById(R.id.editText3);
	     lcrTubridez=(CheckBox)rootView.findViewById(R.id.checkBox18);
	     lcrHipertension=(CheckBox)rootView.findViewById(R.id.checkBox19);
	     lcrDisminucionFluidez=(CheckBox)rootView.findViewById(R.id.checkBox20);
	     lcrPleocitosisMenorA9xmm3PredoNeutrofilos=(CheckBox)rootView.findViewById(R.id.checkBox21);
	     lcrProteinorraquiaMenor99mg_dl=(CheckBox)rootView.findViewById(R.id.checkBox22);
	     lcrHipoglicorraquiaMenor40mg_dl=(CheckBox)rootView.findViewById(R.id.checkBox23);
	     lcrOtras=(EditText)rootView.findViewById(R.id.editText4);
	    
	     aeContactoCasoPrevio=(CheckBox)rootView.findViewById(R.id.checkBox25);
	     aeinternamiento=(CheckBox)rootView.findViewById(R.id.checkBox26);
	     aeAcinamiento=(CheckBox)rootView.findViewById(R.id.checkBox27);
	     aeOtras=(EditText)rootView.findViewById(R.id.editText5);
	     
	     if(getArguments().isEmpty()==false)
	     {
	    	BDAcceso bd=new BDAcceso(rootView.getContext());
 			Mening001 m1=new Mening001();
 			bd.open();
 			m1=m1.selectMening001(getArguments().getString("caso_id"), bd.getBD());
 			bd.close();
 			sospecha.setChecked(m1.getsospecha());
 			fiebre.setText(m1.getfiebre());
 			RigidezNuca.setChecked(m1.getRigidezNuca());
 			Cefalea.setChecked(m1.getCefalea());
 			Vomitos.setChecked(m1.getVomitos());
 			Fotofobia.setChecked(m1.getFotofobia());
 			Convulciones.setChecked(m1.getConvulciones());
 			OtrosSignosMenigios.setChecked(m1.getOtrosSignosMenigios());
 			AlteracionesConciencia.setChecked(m1.getAlteracionesConciencia());
 			PetequiasOPurpuras.setChecked(m1.getPetequiasOPurpuras());
 			TrastornosConducta.setChecked(m1.getTrastornosConducta());
 			Otras.setText(m1.getOtras());
 			m1aAbombatamientoFontanela.setChecked(m1.getm1aAbombatamientoFontanela());
 			m1aConvulciones.setChecked(m1.getm1aConvulciones());
 			m1aLetargia.setChecked(m1.getm1aLetargia());
 			m1aSinJustoCausaClinica.setChecked(m1.getm1aSinJustoCausaClinica());
 			m1aOtras.setText(m1.getm1aOtras());
 			lcrTubridez.setChecked(m1.getlcrTubridez());
 			lcrHipertension.setChecked(m1.getlcrHipertension());
 			lcrDisminucionFluidez.setChecked(m1.getlcrDisminucionFluidez());
 			lcrPleocitosisMenorA9xmm3PredoNeutrofilos.setChecked(m1.getlcrPleocitosisMenorA9xmm3PredoNeutrofilos());
 			lcrProteinorraquiaMenor99mg_dl.setChecked(m1.getlcrProteinorraquiaMenor99mg_dl());
 			lcrHipoglicorraquiaMenor40mg_dl.setChecked(m1.getlcrHipoglicorraquiaMenor40mg_dl());
 			lcrOtras.setText(m1.getlcrOtras());
 			aeContactoCasoPrevio.setChecked(m1.getaeContactoCasoPrevio());
 			aeinternamiento.setChecked(m1.getaeinternamiento());
 			aeAcinamiento.setChecked(m1.getaeAcinamiento());
 			aeOtras.setText(m1.getaeOtras());
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
	m001=new Mening001("0", sospecha.isChecked(), fiebre.getText().toString(), RigidezNuca.isChecked(), Cefalea.isChecked(), Vomitos.isChecked(), Fotofobia.isChecked(), Convulciones.isChecked(), OtrosSignosMenigios.isChecked(), AlteracionesConciencia.isChecked(), PetequiasOPurpuras.isChecked(), TrastornosConducta.isChecked(), Otras.getText().toString(), m1aAbombatamientoFontanela.isChecked(), m1aConvulciones.isChecked(), m1aLetargia.isChecked(), m1aSinJustoCausaClinica.isChecked(), m1aOtras.getText().toString(), lcrTubridez.isChecked(), lcrHipertension.isChecked(), lcrDisminucionFluidez.isChecked(), lcrPleocitosisMenorA9xmm3PredoNeutrofilos.isChecked(), lcrProteinorraquiaMenor99mg_dl.isChecked(), lcrHipoglicorraquiaMenor40mg_dl.isChecked(), lcrOtras.getText().toString(), aeContactoCasoPrevio.isChecked(), aeinternamiento.isChecked(), aeAcinamiento.isChecked(), aeOtras.getText().toString());
	}

}
