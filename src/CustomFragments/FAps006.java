package CustomFragments;

import sqlite.Aps004;
import sqlite.Aps005;
import sqlite.BDAcceso;
import sqlite.EnfResp007;

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
import android.widget.ImageButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
public class FAps006 extends Fragment implements OnClickListener,OnCheckedChangeListener{

	 Aps005 aps005;
	 View rootView;
	 
	 CheckBox CSospNeumBact;
	 CheckBox CProbNeumBacteriana;
	 CheckBox CLHInf;
	 CheckBox CLSPeumoniae;
	 CheckBox CLNMening;
	 EditText CLOtra;
	 EditText SEROSUBT;
	 CheckBox NeumConfLab;
	 CheckBox CasDescNeumBacter;
	 CheckBox CNeumInadecInvestig;

	 CheckBox OMAConfLab;
	 CheckBox OMANoconfLab;
	 EditText Rinosinusitis;
	 CheckBox RinoConfLab;
	 CheckBox RinoNoConfLab;
	 EditText Influenza;
	 CheckBox InfluenzConfirmuOtrosVirus;
	 EditText Virus;
	 EditText TipoSubTipo;
	 CheckBox ETINoConf;
	 CheckBox CasoConfOtraBacter;
	 EditText BacteriaConf;
	 EditText TipoSubtipo;
	 
	 Aps004 aps004;
	  
	 CheckBox ECCurado;
	 EditText FechaCurado;
	 ImageButton IBFechacurado;
	 
	 CheckBox RefHosp;
	 EditText FechaRefHosp;
	 ImageButton IBFechaRefHosp;
	 
	 public static FAps006 newInstance() {
		 FAps006 frag = new FAps006();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	 
	 public static FAps006 newInstanceArgs(String caso_id) {
		 FAps006 frag = new FAps006();
			
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
	     rootView = inflater.inflate(R.layout.aps004, container,false);
	     
	     CSospNeumBact=(CheckBox)rootView.findViewById(R.id.CheckBox01);
	     CProbNeumBacteriana=(CheckBox)rootView.findViewById(R.id.CheckBox03);
	     CLHInf=(CheckBox)rootView.findViewById(R.id.CheckBox06);
	     CLSPeumoniae=(CheckBox)rootView.findViewById(R.id.CheckBox07);
	     CLNMening=(CheckBox)rootView.findViewById(R.id.CheckBox08);
	     CLOtra=(EditText)rootView.findViewById(R.id.EditText01);
	     SEROSUBT=(EditText)rootView.findViewById(R.id.EditText03);
	     NeumConfLab=(CheckBox)rootView.findViewById(R.id.CheckBox10);
	     CasDescNeumBacter=(CheckBox)rootView.findViewById(R.id.CheckBox11);
	     CNeumInadecInvestig=(CheckBox)rootView.findViewById(R.id.CheckBox12);
	    
	     OMAConfLab=(CheckBox)rootView.findViewById(R.id.CheckBox17);
	     OMANoconfLab=(CheckBox)rootView.findViewById(R.id.CheckBox18);
	     
	     RinoConfLab=(CheckBox)rootView.findViewById(R.id.CheckBox13);
	     RinoNoConfLab=(CheckBox)rootView.findViewById(R.id.CheckBox02);
	     
	     InfluenzConfirmuOtrosVirus=(CheckBox)rootView.findViewById(R.id.CheckBox14);
	     Virus=(EditText)rootView.findViewById(R.id.EditText04);
	     TipoSubTipo=(EditText)rootView.findViewById(R.id.EditText05);
	     ETINoConf=(CheckBox)rootView.findViewById(R.id.CheckBox15);
	     CasoConfOtraBacter=(CheckBox)rootView.findViewById(R.id.check11);
	     BacteriaConf=(EditText)rootView.findViewById(R.id.EditText06);
	     TipoSubtipo=(EditText)rootView.findViewById(R.id.EditText07);
	     
	     ECCurado=(CheckBox)rootView.findViewById(R.id.CheckBox09);
	     FechaCurado=(EditText)rootView.findViewById(R.id.EditText02);
	     IBFechacurado=(ImageButton)rootView.findViewById(R.id.ImageButton02);
	     IBFechacurado.setOnClickListener(this);
	     
	     RefHosp=(CheckBox)rootView.findViewById(R.id.CheckBox04);
	     FechaRefHosp=(EditText)rootView.findViewById(R.id.EditText033);
	     IBFechaRefHosp=(ImageButton)rootView.findViewById(R.id.ImageButton033);
	     IBFechaRefHosp.setOnClickListener(this); 
	   
	     if(getArguments().isEmpty()==false)
	     {

       	  BDAcceso bd=new BDAcceso(rootView.getContext());
		  bd.open();
		  Aps005 aa5=new Aps005();
		  Aps004 aa4=new Aps004();
		 
		  aa5=aa5.selectAps005(getArguments().getString("caso_id"), bd.getBD());
		 
		  aa4=aa4.selectAps004(getArguments().getString("caso_id"), bd.getBD());
		  bd.close();
		  
		  CSospNeumBact.setChecked(aa5.getCSospNeumBact());
		  CProbNeumBacteriana.setChecked(aa5.getCProbNeumBacteriana());
		  CLHInf.setChecked(aa5.getCLHInf());
		  CLSPeumoniae.setChecked(aa5.getCLSPeumoniae());
		  CLNMening.setChecked(aa5.getCLNMening());
		  CLOtra.setText(aa5.getCLOtra());
		  SEROSUBT.setText(aa5.getSEROSUBT());
		  NeumConfLab.setChecked(aa5.getNeumConfLab());
		  CasDescNeumBacter.setChecked(aa5.getCasDescNeumBacter());
		  CNeumInadecInvestig.setChecked(aa5.getCNeumInadecInvestig());
		  OMAConfLab.setChecked(aa5.getOMAConfLab());
		  OMANoconfLab.setChecked(aa5.getOMANoconfLab());
		 
		  RinoConfLab.setChecked(aa5.getRinoConfLab());
		  RinoNoConfLab.setChecked(aa5.getRinoNoConfLab());
		 
		  InfluenzConfirmuOtrosVirus.setChecked(aa5.getInfluenzConfirmuOtrosVirus());
		  Virus.setText(aa5.getVirus());
		  TipoSubTipo.setText(aa5.getTipoSubTipo());
		  ETINoConf.setChecked(aa5.getETINoConf());
		  CasoConfOtraBacter.setChecked(aa5.getCasoConfOtraBacter());
		  BacteriaConf.setText(aa5.getBacteriaConf());
		  TipoSubtipo.setText(aa5.getTipoSubtipo());
		  
		  ECCurado.setChecked(aa4.getECCurado());
		  FechaCurado.setText(aa4.getFechaCurado());
		  RefHosp.setChecked(aa4.getRefHosp());
		  FechaRefHosp.setText(aa4.getFechaRefHosp());

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
	  		if(arg0.getId()==R.id.ImageButton02)
			{
			  s.InsertFecha(FechaCurado, rootView);
			}
			if(arg0.getId()==R.id.ImageButton033)
			{
			  s.InsertFecha(FechaRefHosp, rootView);
			}	
			
			s=null;
			
	  	}
	  	
	  	public void CreateVars()
	  	{
	  	aps005=new Aps005("0",CSospNeumBact.isChecked(),CProbNeumBacteriana.isChecked(),CLHInf.isChecked(),CLSPeumoniae.isChecked(),CLNMening.isChecked(),CLOtra.getText().toString(),SEROSUBT.getText().toString(),NeumConfLab.isChecked(),CasDescNeumBacter.isChecked(),CNeumInadecInvestig.isChecked(),OMAConfLab.isChecked(),OMANoconfLab.isChecked(),RinoConfLab.isChecked(),RinoNoConfLab.isChecked(),InfluenzConfirmuOtrosVirus.isChecked(),Virus.getText().toString(),TipoSubTipo.getText().toString(),ETINoConf.isChecked(),CasoConfOtraBacter.isChecked(),BacteriaConf.getText().toString(),TipoSubtipo.getText().toString());
	 	aps004=new Aps004("0",ECCurado.isChecked(),FechaCurado.getText().toString(),RefHosp.isChecked(),FechaRefHosp.getText().toString());
	  	}
	  	

}
