package CustomFragments;

import sqlite.BDAcceso;
import sqlite.EnfResp001;
import sqlite.EnfResp002;

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

public class FEnfResp002 extends Fragment implements OnCheckedChangeListener{
	EnfResp002 ER2;
	View rootView;
	/*ISNB*/
	CheckBox ISNB;
	CheckBox ISNBcomiezorep;
	EditText ISNBfiebre;
	CheckBox ISNBescalofrios;
	CheckBox ISNBmalestargen;
	CheckBox ISNBmialgias;
	CheckBox ISNBdolorp;
	CheckBox ISNBtaquipnea;
	CheckBox ISNBtoscesp;
	CheckBox ISNBvomitos;
	CheckBox ISNBconvulciones;
	CheckBox ISNBsatoxigeno;
	EditText ISNBotros;	
	/*IOIB*/
	CheckBox IOIB;
	CheckBox IOIB_SNPbronquitisaguda;
	CheckBox IOIB_SNPbronconeumonia;
	CheckBox IOIB_SNPneumoniaviral;
	CheckBox IOIB_SNPneumoniainterst;
	CheckBox IOIB_SNPtraqueobronquitis;
	CheckBox IOIB_SNPbronquiolitis;
	CheckBox IOIB_SCepiglotitis;
	CheckBox IOIB_SClaringitis;
	CheckBox IOIB_SClaringotraqueobronq;
	CheckBox IOIBsindromcoqueluchoide;
	CheckBox IOIBsindrominterpliquida;
	CheckBox IOIBsindrominterpgaseosa;
	/*IAH*/
	CheckBox IAH;
	EditText IAHcual;
	/*Layouts*/
	RelativeLayout layISNB;
	RelativeLayout layIOIB1;
	RelativeLayout layIOIB2;
	RelativeLayout layIAH;
	
	
	public static FEnfResp002 newInstance() {
		FEnfResp002 frag = new FEnfResp002();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		
		frag.setArguments(args);
		
		return frag;
	}
	
	public static FEnfResp002 newInstanceArgs(String caso_id) {
   		FEnfResp002 frag = new FEnfResp002();
		
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
		// Inflamos la Vista que se debe mostrar en pantalla.
	
		//Spinners
		   rootView = inflater.inflate(R.layout.enfresp002f, container,false);
		   /*ISNB*/
		   ISNB=(CheckBox)rootView.findViewById(R.id.CheckBox09);
		   ISNB.setOnCheckedChangeListener(this);
		   ISNBcomiezorep=(CheckBox)rootView.findViewById(R.id.checkBox1);
		   ISNBfiebre=(EditText)rootView.findViewById(R.id.editText001);
		   ISNBescalofrios=(CheckBox)rootView.findViewById(R.id.checkBox2);
		   ISNBmalestargen=(CheckBox)rootView.findViewById(R.id.CheckBox01);
		   ISNBmialgias=(CheckBox)rootView.findViewById(R.id.CheckBox02);
		   ISNBdolorp=(CheckBox)rootView.findViewById(R.id.CheckBox03);
		   ISNBtaquipnea=(CheckBox)rootView.findViewById(R.id.CheckBox04);
		   ISNBtoscesp=(CheckBox)rootView.findViewById(R.id.CheckBox05);
		   ISNBvomitos=(CheckBox)rootView.findViewById(R.id.CheckBox06);
		   ISNBconvulciones=(CheckBox)rootView.findViewById(R.id.CheckBox07);
		   ISNBsatoxigeno=(CheckBox)rootView.findViewById(R.id.CheckBox08);
		   ISNBotros=(EditText)rootView.findViewById(R.id.editText2);		   
		   /*IOIB*/
		   IOIB=(CheckBox)rootView.findViewById(R.id.CheckBox10);
		   IOIB.setOnCheckedChangeListener(this);
		   IOIB_SNPbronquitisaguda=(CheckBox)rootView.findViewById(R.id.CheckBox11);
		   IOIB_SNPbronconeumonia=(CheckBox)rootView.findViewById(R.id.CheckBox12);
		   IOIB_SNPneumoniaviral=(CheckBox)rootView.findViewById(R.id.CheckBox13);
		   IOIB_SNPneumoniainterst=(CheckBox)rootView.findViewById(R.id.CheckBox14);
		   IOIB_SNPtraqueobronquitis=(CheckBox)rootView.findViewById(R.id.CheckBox15);
		   IOIB_SNPbronquiolitis=(CheckBox)rootView.findViewById(R.id.CheckBox16);
		   IOIB_SCepiglotitis=(CheckBox)rootView.findViewById(R.id.CheckBox17);
		   IOIB_SClaringitis=(CheckBox)rootView.findViewById(R.id.CheckBox18);
		   IOIB_SClaringotraqueobronq=(CheckBox)rootView.findViewById(R.id.CheckBox19);
		   IOIBsindromcoqueluchoide=(CheckBox)rootView.findViewById(R.id.CheckBox20);
		   IOIBsindrominterpliquida=(CheckBox)rootView.findViewById(R.id.CheckBox21);
		   IOIBsindrominterpgaseosa=(CheckBox)rootView.findViewById(R.id.CheckBox22);
		   /*IAH*/
		   IAH=(CheckBox)rootView.findViewById(R.id.CheckBox23);
		   IAH.setOnCheckedChangeListener(this);
		   IAHcual=(EditText)rootView.findViewById(R.id.EditText01);
		   /*layouts*/
		   layISNB=(RelativeLayout)rootView.findViewById(R.id.relativeLayout1);
		   layISNB.setAlpha((float) 0.5);
		   layIOIB1=(RelativeLayout)rootView.findViewById(R.id.relativeLayout3);
		   layIOIB1.setAlpha((float) 0.5);
		   layIOIB2=(RelativeLayout)rootView.findViewById(R.id.relativeLayout4);
		   layIOIB2.setAlpha((float) 0.5);
		   layIAH=(RelativeLayout)rootView.findViewById(R.id.RelativeLayout01);
		   layIAH.setAlpha((float) 0.5);
			 if(getArguments().isEmpty()==false)
		     {
		    	 BDAcceso bd=new BDAcceso(rootView.getContext());
		    	 bd.open();
		    	 EnfResp002 er2=new EnfResp002();
		    	 er2=er2.selectEnfResp002(Long.valueOf(getArguments().getString("caso_id")), bd.getBD());
		    	 bd.close();
		    	 ISNB.setChecked(er2.getISNB());
		    	 ISNBcomiezorep.setChecked(er2.getISNBcomiezorep());
		    	 ISNBfiebre.setText(er2.getISNBfiebre());
		    	 ISNBescalofrios.setChecked(er2.getISNBescalofrios());
		    	 ISNBmalestargen.setChecked(er2.getISNBmalestargen());
		    	 ISNBmialgias.setChecked(er2.getISNBmialgias());
		    	 ISNBdolorp.setChecked(er2.getISNBdolorp());
		    	 ISNBtaquipnea.setChecked(er2.getISNBtaquipnea());
		    	 ISNBtoscesp.setChecked(er2.getISNBtoscesp());
		    	 ISNBvomitos.setChecked(er2.getISNBvomitos());
		    	 ISNBconvulciones.setChecked(er2.getISNBconvulciones());
		    	 ISNBsatoxigeno.setChecked(er2.getISNBsatoxigeno());
		    	 ISNBotros.setText(er2.getISNBotros());
		    	 IOIB.setChecked(er2.getIOIB());
		    	 IOIB_SNPbronquitisaguda.setChecked(er2.getIOIB_SNPbronquitisaguda());
		    	 IOIB_SNPbronconeumonia.setChecked(er2.getIOIB_SNPbronconeumonia());
		    	 IOIB_SNPneumoniaviral.setChecked(er2.getIOIB_SNPneumoniaviral());
		    	 IOIB_SNPneumoniainterst.setChecked(er2.getIOIB_SNPneumoniainterst());
		    	 IOIB_SNPtraqueobronquitis.setChecked(er2.getIOIB_SNPtraqueobronquitis());
		    	 IOIB_SNPbronquiolitis.setChecked(er2.getIOIB_SNPbronquiolitis());
		    	 IOIB_SCepiglotitis.setChecked(er2.getIOIB_SCepiglotitis());
		    	 IOIB_SClaringitis.setChecked(er2.getIOIB_SClaringitis());
		    	 IOIB_SClaringotraqueobronq.setChecked(er2.getIOIB_SClaringotraqueobronq());
		    	 IOIBsindromcoqueluchoide.setChecked(er2.getIOIBsindromcoqueluchoide());
		    	 IOIBsindrominterpliquida.setChecked(er2.getIOIBsindrominterpliquida());
		    	 IOIBsindrominterpgaseosa.setChecked(er2.getIOIBsindrominterpgaseosa());
		    	 IAH.setChecked(er2.getIAH());
		    	 IAHcual.setText(er2.getIAHcual());
		    	 getArguments().clear();

		    	 
		     }
		   return rootView;

}
	
	public void CreateVars()
	{
		ER2=new EnfResp002("0", ISNB.isChecked(), ISNBcomiezorep.isChecked(), ISNBfiebre.getText().toString(), ISNBescalofrios.isChecked(), ISNBmalestargen.isChecked(), ISNBmialgias.isChecked(), ISNBdolorp.isChecked(), ISNBtaquipnea.isChecked(), ISNBtoscesp.isChecked(), ISNBvomitos.isChecked(),ISNBconvulciones.isChecked(), ISNBsatoxigeno.isChecked(), ISNBotros.getText().toString(), IOIB.isChecked(), IOIB_SNPbronquitisaguda.isChecked(), IOIB_SNPbronconeumonia.isChecked(), IOIB_SNPneumoniaviral.isChecked(), IOIB_SNPneumoniainterst.isChecked(), IOIB_SNPtraqueobronquitis.isChecked(), IOIB_SNPbronquiolitis.isChecked(), IOIB_SCepiglotitis.isChecked(), IOIB_SClaringitis.isChecked(), IOIB_SClaringotraqueobronq.isChecked(), IOIBsindromcoqueluchoide.isChecked(), IOIBsindrominterpliquida.isChecked(), IOIBsindrominterpgaseosa.isChecked(), IAH.isChecked(), IAHcual.getText().toString());
	}

	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.CheckBox09)
		{
			if(arg1)
				layISNB.setAlpha((float)1);
			else
				layISNB.setAlpha((float)0.5);
		}
		if(arg0.getId()==R.id.CheckBox10)
		{
			if(arg1)
			{
				layIOIB1.setAlpha((float)1);
				layIOIB2.setAlpha((float)1);
			}
			else
			{
				layIOIB1.setAlpha((float)0.5);
				layIOIB2.setAlpha((float)0.5);
			}
		}
		if(arg0.getId()==R.id.CheckBox23)
		{
			if(arg1)
				layIAH.setAlpha((float)1);
			else
				layIAH.setAlpha((float)0.5);
		}
		
	}
}
