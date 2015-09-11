package CustomFragments;



import sqlite.BDAcceso;
import sqlite.EnfResp008;
import sqlite.EnfResp009;
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
import android.widget.RelativeLayout;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;


/*EnfResp007*/
public  class FEnfResp008  extends Fragment implements OnClickListener,OnCheckedChangeListener{
	

	View rootView;
    
	/*vars 006*/
	  RelativeLayout lay1;
	  EnfResp008 ER8;
	  EnfResp009 ER009;
	/*Chekcs*/
     CheckBox cHospitalizacionUCI;
	 CheckBox cVentilacionMecanica;
	 CheckBox ceCurado;
	 CheckBox ceAltaVoluntaria;
	 CheckBox ceReferidoOtroHosp;
	 CheckBox ceFallecido;
	  /*editTexts*/
	    EditText eNumeroDiasUCI;
	    EditText eNumeroDiasVentilacionMec;
	   

	/**/
	/*Botones*/
	ImageButton fechaingb;
	ImageButton fechaegb;
	ImageButton curadob;
	ImageButton altavolb;
	ImageButton otrohospb;
	ImageButton fallb;
	/*editTexts*/
	EditText fechaingt;
	EditText fechaegt;
	EditText curadot;
	EditText altavolt;
	EditText otrohospt;
	EditText fallt;
	 /*Vars007*/
	 CheckBox cIRAG;
	 CheckBox ccnSospBacteriana;
	 CheckBox ccnSospProbableNeumoniaBacteriana;
	 CheckBox ccclHinfluenzae;
	 CheckBox ccclSpneumoniae;
	 CheckBox ccclNmeningitidis;
	
	 CheckBox cCasoDescartadoNeumBact;
	 CheckBox cCasoNeumoniaInadecuadamenteInvest;
	 CheckBox cCasoConfVirusRespLab;
	 
	 

	 EditText eVirus;
	 EditText eTipoySubtipo;
	 EditText ecclOtra;
	 EditText ecclSerotipo_Subtipo;
	
	
		 CheckBox otrabactconf;
		 EditText otrabactbact;
		 EditText otrabactstipos;

	public static FEnfResp008 newInstance() {
		FEnfResp008 frag = new FEnfResp008();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		
		frag.setArguments(args);
		
		return frag;
	}
	public static FEnfResp008 newInstanceArgs(long caso_id) {
		FEnfResp008 frag = new FEnfResp008();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		args.putLong("caso_id", caso_id);
		frag.setArguments(args);
		
		return frag;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflamos la Vista que se debe mostrar en pantalla.
	     rootView = inflater.inflate(R.layout.enfresp008f, container,false);
	     /*Botones*/
	     fechaingb=(ImageButton)rootView.findViewById(R.id.ImageButton02);
	     fechaingb.setOnClickListener(this);
	     
		 fechaegb=(ImageButton)rootView.findViewById(R.id.ImageButton01);
		 fechaegb.setOnClickListener(this);
		 
		 curadob=(ImageButton)rootView.findViewById(R.id.ImageButton03);
		 curadob.setOnClickListener(this);
		 curadob.setVisibility(View.INVISIBLE);
		 
		 
		 altavolb=(ImageButton)rootView.findViewById(R.id.ImageButton04);
		 altavolb.setOnClickListener(this);
		 altavolb.setVisibility(View.INVISIBLE);
		 
		 otrohospb=(ImageButton)rootView.findViewById(R.id.ImageButton05);
		 otrohospb.setOnClickListener(this);
		 otrohospb.setVisibility(View.INVISIBLE);
		 
		 fallb=(ImageButton)rootView.findViewById(R.id.ImageButton06);
		 fallb.setOnClickListener(this);
		 fallb.setVisibility(View.INVISIBLE);
		 /*Editexts*/
		    fechaingt=(EditText)rootView.findViewById(R.id.editText1);
	     	 fechaegt=(EditText)rootView.findViewById(R.id.EditText01);
			 curadot=(EditText)rootView.findViewById(R.id.EditText02);
			 curadot.setVisibility(View.INVISIBLE);
			 
			 altavolt=(EditText)rootView.findViewById(R.id.EditText03);
			 altavolt.setVisibility(View.INVISIBLE);
			 
			 otrohospt=(EditText)rootView.findViewById(R.id.EditText04);
			 otrohospt.setVisibility(View.INVISIBLE);
			 
			 fallt=(EditText)rootView.findViewById(R.id.EditText05);
			 fallt.setVisibility(View.INVISIBLE);
			 /*Cheks*/
		              cHospitalizacionUCI=(CheckBox)rootView.findViewById(R.id.CheckBox07);
		              cHospitalizacionUCI.setOnCheckedChangeListener(this);
		              
		    		  cVentilacionMecanica=(CheckBox)rootView.findViewById(R.id.CheckBox01);
		    		  cVentilacionMecanica.setOnCheckedChangeListener(this);
		    		  
		    		  ceCurado=(CheckBox)rootView.findViewById(R.id.CheckBox02);
		    		  ceCurado.setOnCheckedChangeListener(this);
		    		  
		    		  ceAltaVoluntaria=(CheckBox)rootView.findViewById(R.id.CheckBox03);
		    		  ceAltaVoluntaria.setOnCheckedChangeListener(this);
		    		  
		    		  ceReferidoOtroHosp=(CheckBox)rootView.findViewById(R.id.CheckBox04);
		    		  ceReferidoOtroHosp.setOnCheckedChangeListener(this);
		    		  
		    		  ceFallecido=(CheckBox)rootView.findViewById(R.id.CheckBox05);
		    		  ceFallecido.setOnCheckedChangeListener(this);
		    		  /*Lay*/
		    		  lay1=(RelativeLayout)rootView.findViewById(R.id.lay1);
		    	      
		    		  /*lay1.setVisibility(View.INVISIBLE);*/
		    		    /*editexts 006*/
		    		   eNumeroDiasUCI=(EditText)rootView.findViewById(R.id.editText2);
		    		   eNumeroDiasVentilacionMec=(EditText)rootView.findViewById(R.id.editText3);
		    		   eNumeroDiasVentilacionMec.setVisibility(View.INVISIBLE);
		    		   
		    		    /*007*/
		    			  cIRAG=(CheckBox)rootView.findViewById(R.id.CheckBox06);
		    			  ccnSospBacteriana=(CheckBox)rootView.findViewById(R.id.CheckBox10);
		    			  ccnSospProbableNeumoniaBacteriana=(CheckBox)rootView.findViewById(R.id.CheckBox08);
		    			  ccclHinfluenzae=(CheckBox)rootView.findViewById(R.id.CheckBox09);
		    			  ccclSpneumoniae=(CheckBox)rootView.findViewById(R.id.CheckBox11);
		    			  ccclNmeningitidis=(CheckBox)rootView.findViewById(R.id.CheckBox12);
		    			
		    			  cCasoDescartadoNeumBact=(CheckBox)rootView.findViewById(R.id.CheckBox13);
		    			  cCasoNeumoniaInadecuadamenteInvest=(CheckBox)rootView.findViewById(R.id.CheckBox14);
		    			  cCasoConfVirusRespLab=(CheckBox)rootView.findViewById(R.id.CheckBox15);
		    			  
		    			  /*EditTexts*/
		    				  eVirus=(EditText)rootView.findViewById(R.id.editText4);
		    				  eTipoySubtipo=(EditText)rootView.findViewById(R.id.EditText06);
		    				  ecclOtra=(EditText)rootView.findViewById(R.id.EditText07);
		    				  ecclSerotipo_Subtipo=(EditText)rootView.findViewById(R.id.EditText08);
		    				  
		    					
		    					  otrabactconf=(CheckBox)rootView.findViewById(R.id.CheckBox16);
		    					  otrabactbact=(EditText)rootView.findViewById(R.id.EditText10);
		    					  otrabactstipos=(EditText)rootView.findViewById(R.id.EditText09);
		    			
                		  if(getArguments().isEmpty()==false)
                		  {
                			
                			BDAcceso bd=new BDAcceso(rootView.getContext());
                			EnfResp008 er6=new EnfResp008();
                			er6=bd.Select006(getArguments().getLong("caso_id"),er6);
                			cHospitalizacionUCI.setChecked(er6.getHospitalizacionUCI());
                			
                				fechaingt.setText(er6.getFechaIngresoUCI().toString());
                			
                				fechaegt.setText(er6.getFechaEgresoUCI().toString());
                			if(er6.getNumeroDiasUCI()!=0)
                				eNumeroDiasUCI.setText(er6.getNumeroDiasUCI()+"");
                			cVentilacionMecanica.setChecked(er6.getVentilacionMecanica());
                			if(er6.getNumeroDiasVentilacionMec()!=0)
                				eNumeroDiasVentilacionMec.setText(er6.getNumeroDiasVentilacionMec()+"");
                			ceCurado.setChecked(er6.geteCurado());
                		
                				curadot.setText(er6.geteFechaeCurado().toString());
                			ceAltaVoluntaria.setChecked(er6.geteAltaVoluntaria());
                		
                				altavolt.setText(er6.geteFechaAltaVolunt().toString());
                			ceReferidoOtroHosp.setChecked(er6.geteReferidoOtroHosp());
                		
                				otrohospt.setText(er6.geteFechaRefOtroHosp().toString());
                			ceFallecido.setChecked(er6.geteFallecido());
                		
                				fallt.setText(er6.geteFallecidoFecha().toString());
                			
                			EnfResp009 er7=new EnfResp009();
                			
                			er7=bd.Select007(getArguments().getLong("caso_id"), er7);
                			cIRAG.setChecked(er7.getIRAG());
                			ccnSospBacteriana.setChecked(er7.getcnSospBacteriana());
                			ccnSospProbableNeumoniaBacteriana.setChecked(er7.getcnSospProbableNeumoniaBacteriana());
                			ccclHinfluenzae.setChecked(er7.getcclHinfluenzae());
                			ccclSpneumoniae.setChecked(er7.getcclSpneumoniae());
                			ccclNmeningitidis.setChecked(er7.getcclNmeningitidis());
                			ecclOtra.setText(er7.getcclOtra());
                			ecclSerotipo_Subtipo.setText(er7.getcclSerotipo_Subtipo());
                			cCasoDescartadoNeumBact.setChecked(er7.getCasoDescartadoNeumBact());
                			cCasoNeumoniaInadecuadamenteInvest.setChecked(er7.getCasoNeumoniaInadecuadamenteInvest());
                			cCasoConfVirusRespLab.setChecked(er7.getCasoConfVirusRespLab());
                			eVirus.setText(er7.getVirus());
                			eTipoySubtipo.setText(er7.getTipoySubtipo());

                			  otrabactconf.setChecked(er7.getotrabactconf());;
                			  otrabactbact.setText(er7.getotrabactbact());
                			  otrabactstipos.setText(er7.getotrabactstipos());
                		  }
	    return rootView;
	    
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		SelectorFecha s=new SelectorFecha();
		if(arg0.getId()==R.id.ImageButton02)
		{
			s.InsertFecha(fechaingt, rootView);
		}
		if(arg0.getId()==R.id.ImageButton01)
		{
			s.InsertFecha(fechaegt, rootView);
		}
		if(arg0.getId()==R.id.ImageButton03)
		{
			s.InsertFecha(curadot, rootView);
		}
		if(arg0.getId()==R.id.ImageButton04)
		{
			s.InsertFecha(altavolt, rootView);
		}
		if(arg0.getId()==R.id.ImageButton05)
		{
			s.InsertFecha(otrohospt, rootView);
		}
		if(arg0.getId()==R.id.ImageButton06)
		{
			s.InsertFecha(fallt, rootView);
		}	
		
	}
	
	public void CreateVars()
	{
	
	
	boolean VentilacionMecanica=cVentilacionMecanica.isChecked();

	 boolean Curado=ceCurado.isChecked();

	int numdias=0;
	if(eNumeroDiasUCI.getText().toString().isEmpty()==false)
		numdias=Integer.valueOf(eNumeroDiasUCI.getText().toString());
	int ventmec=0;
	if(eNumeroDiasVentilacionMec.getText().toString().isEmpty()==false)
		ventmec= Integer.valueOf(eNumeroDiasVentilacionMec.getText().toString());
   boolean AltaVoluntaria=ceAltaVoluntaria.isChecked(); 
	boolean eReferidoOtroHosp=ceReferidoOtroHosp.isChecked();
	boolean eFallecido=ceFallecido.isChecked();	
	int x=0;
	ER8=new EnfResp008(cHospitalizacionUCI.isChecked(),fechaingt.getText().toString(), fechaegt.getText().toString(),numdias, VentilacionMecanica, ventmec, Curado, curadot.getText().toString(), AltaVoluntaria, altavolt.getText().toString(),eReferidoOtroHosp, otrohospt.getText().toString(), eFallecido, fallt.getText().toString(), 0);
	
	
	/*007*/

	
	 boolean IRAG=cIRAG.isChecked();
	 boolean cnSospBacteriana=ccnSospBacteriana.isChecked();
	 boolean cnSospProbableNeumoniaBacteriana=ccnSospBacteriana.isChecked();
	 boolean cclHinfluenzae=ccclHinfluenzae.isChecked();
	 boolean cclSpneumoniae=ccclSpneumoniae.isChecked();
	 boolean cclNmeningitidis=ccclNmeningitidis.isChecked();
	 
	 String cclOtra=ecclOtra.getText().toString();
	 String cclSerotipo_Subtipo=ecclSerotipo_Subtipo.getText().toString();
	
	 boolean CasoDescartadoNeumBact=cCasoDescartadoNeumBact.isChecked();
	 boolean CasoNeumoniaInadecuadamenteInvest=cCasoNeumoniaInadecuadamenteInvest.isChecked();
	 boolean CasoConfVirusRespLab=cCasoConfVirusRespLab.isChecked();
	 
	 String Viruev=eVirus.getText().toString();
	 String TipoySubtipo=eTipoySubtipo.getText().toString();
	 ER009=new EnfResp009(IRAG, cnSospBacteriana, cnSospProbableNeumoniaBacteriana, cclHinfluenzae, cclSpneumoniae, cclNmeningitidis, cclOtra, cclSerotipo_Subtipo, CasoDescartadoNeumBact, CasoNeumoniaInadecuadamenteInvest, CasoConfVirusRespLab, Viruev, TipoySubtipo, x,otrabactconf.isChecked(),otrabactbact.getText().toString(),otrabactstipos.getText().toString());
	
	}

	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.CheckBox07)
		{
			
			if(arg1)
			{
				
			lay1.setAlpha(1);
			
			}
			else
			{
				  lay1.setAlpha((float) 0.5);
				  cVentilacionMecanica.setChecked(false);
				  eNumeroDiasUCI.setText("");
			       eNumeroDiasVentilacionMec.setText("");
				     fechaingt.setText("");
					 fechaegt.setText("");
			}
				
		}
		if(arg0.getId()==R.id.CheckBox01)
		{
			if(arg1)
				eNumeroDiasVentilacionMec.setVisibility(View.VISIBLE);
			else
			{
				eNumeroDiasVentilacionMec.setText("");
				eNumeroDiasVentilacionMec.setVisibility(View.INVISIBLE);
			}
				
		}
		if(arg0.getId()==R.id.CheckBox02)
		{
			if(arg1)
			{
				curadot.setVisibility(View.VISIBLE);
				curadob.setVisibility(View.VISIBLE);
			}
			else
			{
				curadot.setVisibility(View.INVISIBLE);
				curadob.setVisibility(View.INVISIBLE);
				curadot.setText("");
			}
				
		}
		if(arg0.getId()==R.id.CheckBox03)
		{
			if(arg1)
			{
				altavolt.setVisibility(View.VISIBLE);
				altavolb.setVisibility(View.VISIBLE);
			}
			else
			{
				altavolt.setVisibility(View.INVISIBLE);
				altavolb.setVisibility(View.INVISIBLE);
				altavolt.setText("");
			}
				
		}
		if(arg0.getId()==R.id.CheckBox04)
		{
			if(arg1)
			{
				otrohospt.setVisibility(View.VISIBLE);
				otrohospb.setVisibility(View.VISIBLE);
			}
			else
			{
				otrohospt.setVisibility(View.INVISIBLE);
				otrohospb.setVisibility(View.INVISIBLE);
				otrohospt.setText("");
			}
				
		}
		if(arg0.getId()==R.id.CheckBox05)
		{
			if(arg1)
			{
				fallb.setVisibility(View.VISIBLE);
				fallt.setVisibility(View.VISIBLE);
			}
			else
			{
				fallt.setVisibility(View.INVISIBLE);
				fallb.setVisibility(View.INVISIBLE);
				fallt.setText("");
			}
				
		}
		
	}
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		CreateVars();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}