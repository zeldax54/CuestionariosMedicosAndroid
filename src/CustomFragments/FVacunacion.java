package CustomFragments;

import java.sql.Date;

import sqlite.BDAcceso;
import sqlite.EnfResp005;
import sqlite.VacunacionEnt;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CompoundButton.OnCheckedChangeListener;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;


/*Vacunacion*/
public class FVacunacion extends Fragment implements OnItemSelectedListener,OnCheckedChangeListener,OnClickListener {
	
	/*vars*/
	
	VacunacionEnt VAC;
	String CarnetVacunacion="No";
	private boolean VacunacionNoPrecisada=false;
	
	private boolean VPV=false;
	private boolean AMC=false;
	private boolean HyD=false;
	private boolean ANC=false;
	private boolean AI=false;
	/**/
	
	
	
	
	EditText vanpent1rados;
	EditText vanpent2dados;
	EditText vanpent3raados;
	
	EditText antimen1rados;
	EditText antimen2dados;
	EditText antimen3rados;
	
	EditText hidydtp;
	
	EditText antineu1rados;
	EditText antineu2dados;
	EditText antineu3rados;
	
	EditText antinf1rados;
	EditText antinf2dados;
	EditText antinf3rados;
	
	 /*Botones Vacunas*/
	 ImageButton vanpent1radosb;
	 ImageButton vanpent2dadosb;
	 ImageButton vanpent3raadosb;
		
	 ImageButton antimen1radosb;
	 ImageButton antimen2dadosb;
	 ImageButton antimen3radosb;
		
	 ImageButton hidydtpb;
		
	 ImageButton antineu1radosb;
	 ImageButton antineu2dadosb;
	 ImageButton antineu3radosb;
	 ImageButton antinf1radosb;
	 ImageButton antinf2dadosb;
	 ImageButton antinf3radosb;
	 /* Fin Botones*/
	/**/
       LinearLayout vacpent;
       LinearLayout antimen;
       LinearLayout hib;
       LinearLayout antineu;
       LinearLayout antiinf;
       
	 /*Layouts*/
	Spinner carne;
	String [] cadena={"No","Si","No Sabe"};
	
	View rootView;
	/*cheks*/
	CheckBox vacnoprec;
	CheckBox  cVPV;	
	CheckBox  cAMC;	
	CheckBox  cHyD;	
	CheckBox  cANC;
	CheckBox  cAI;
	/*checks*/

	
	public static FVacunacion newInstance() {
		FVacunacion frag = new FVacunacion();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		
		frag.setArguments(args);
		
		return frag;
	}
	
	public static FVacunacion newInstanceArgs(String caso_id) {
		FVacunacion frag = new FVacunacion();
		
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
	    
		
		rootView = inflater.inflate(R.layout.vacunacion, container,false);		
		/*Lays*/
		  vacpent=(LinearLayout)rootView.findViewById(R.id.linearLayout4);
	      antimen=(LinearLayout)rootView.findViewById(R.id.linearLayout5);
	      hib=(LinearLayout)rootView.findViewById(R.id.linearLayout2);
	      antineu=(LinearLayout)rootView.findViewById(R.id.linearLayout6);
	      antiinf=(LinearLayout)rootView.findViewById(R.id.linearLayout1);
	      
	       vacpent.setVisibility(View.INVISIBLE);
	        antimen.setVisibility(View.INVISIBLE);
	        hib.setVisibility(View.INVISIBLE);
	        antineu.setVisibility(View.INVISIBLE);
	        antiinf.setVisibility(View.INVISIBLE);
		/*Lays*/
		ArrayAdapter<String> adaptador=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadena);	
		
		/*spinners*/
		carne=(Spinner)rootView.findViewById(R.id.spinner11);
		carne.setOnItemSelectedListener(this);
		carne.setAdapter(adaptador);
		
		
		/*spinners*/
		
		vacnoprec=(CheckBox)rootView.findViewById(R.id.CheckBox01);
		vacnoprec.setOnCheckedChangeListener(this);
		

		cVPV=(CheckBox)rootView.findViewById(R.id.CheckBox02);	
		cVPV.setOnCheckedChangeListener(this);
		
		cAMC=(CheckBox)rootView.findViewById(R.id.CheckBox03);	
		cAMC.setOnCheckedChangeListener(this);
		
		cHyD=(CheckBox)rootView.findViewById(R.id.CheckBox04);	
		cHyD.setOnCheckedChangeListener(this); 		
		
		cANC=(CheckBox)rootView.findViewById(R.id.CheckBox05);
		cANC.setOnCheckedChangeListener(this); 
		
		cAI=(CheckBox)rootView.findViewById(R.id.CheckBox06);
		cAI.setOnCheckedChangeListener(this); 
		/*Editexts vacunas*/
		 vanpent1rados=(EditText)rootView.findViewById(R.id.editText1);		 
		 vanpent2dados=(EditText)rootView.findViewById(R.id.EditText01);
		 vanpent3raados=(EditText)rootView.findViewById(R.id.EditText02);
		 
		 antimen1rados=(EditText)rootView.findViewById(R.id.EditText03);
		 antimen2dados=(EditText)rootView.findViewById(R.id.EditText04);
		 antimen3rados=(EditText)rootView.findViewById(R.id.EditText05);
		 
		 hidydtp=(EditText)rootView.findViewById(R.id.EditText06);
		 

			 antineu1rados=(EditText)rootView.findViewById(R.id.EditText09);
			 antineu2dados=(EditText)rootView.findViewById(R.id.EditText10);
			 antineu3rados=(EditText)rootView.findViewById(R.id.EditText11);
			 

			 antinf1rados=(EditText)rootView.findViewById(R.id.EditText07);
			 antinf2dados=(EditText)rootView.findViewById(R.id.EditText08);
			 antinf3rados=(EditText)rootView.findViewById(R.id.EditText12);
			 
			 /*Fin editTexts*/
			/*Botones */
			 vanpent1radosb=(ImageButton)rootView.findViewById(R.id.boton1v);		 
			 vanpent2dadosb=(ImageButton)rootView.findViewById(R.id.boton6);
			 vanpent3raadosb=(ImageButton)rootView.findViewById(R.id.boton10);
			 
			 vanpent1radosb.setOnClickListener(this);
			 vanpent2dadosb.setOnClickListener(this);
			 vanpent3raadosb.setOnClickListener(this);
			 
			 antimen1radosb=(ImageButton)rootView.findViewById(R.id.ImageButton03);
			 antimen2dadosb=(ImageButton)rootView.findViewById(R.id.ImageButton02);
			 antimen3radosb=(ImageButton)rootView.findViewById(R.id.ImageButton01);
			 
			 antimen1radosb.setOnClickListener(this);
			 antimen2dadosb.setOnClickListener(this);
			 antimen3radosb.setOnClickListener(this);
			 
			 hidydtpb=(ImageButton)rootView.findViewById(R.id.boton4);
			 
			 hidydtpb.setOnClickListener(this);

			 antineu1radosb=(ImageButton)rootView.findViewById(R.id.boton3);
			 antineu2dadosb=(ImageButton)rootView.findViewById(R.id.boton8);
			 antineu3radosb=(ImageButton)rootView.findViewById(R.id.boton12);
				
			 antineu1radosb.setOnClickListener(this);
			 antineu2dadosb.setOnClickListener(this);
			 antineu3radosb.setOnClickListener(this);

				 antinf1radosb=(ImageButton)rootView.findViewById(R.id.boton5);
				 antinf2dadosb=(ImageButton)rootView.findViewById(R.id.boton9);
				 antinf3radosb=(ImageButton)rootView.findViewById(R.id.boton13);
				 
				 antinf1radosb.setOnClickListener(this);
				 antinf2dadosb.setOnClickListener(this);
				 antinf3radosb.setOnClickListener(this);
				 
				  if(getArguments().isEmpty()==false)
				    {
				   	 BDAcceso bd=new BDAcceso(rootView.getContext());
				   	 bd.open();
				   	 VacunacionEnt vac=new VacunacionEnt();
				   	 vac=vac.selectVacunacionEnt(getArguments().getString("caso_id"), bd.getBD());
				   	 bd.close();
				   	 if(vac!=null)
				   	 {
				   	 carne.setSelection(Integer.valueOf(vac.getCarnetVacunacion()));
				   	vacnoprec.setChecked(vac.getVacunacionNoPrecisada());
				   	cVPV.setChecked(vac.getVPV());
				    vanpent1rados.setText(vac.getVPV1df());
				   	vanpent2dados.setText(vac.getVPV2df());
				   	vanpent3raados.setText(vac.getVPV3DF());
				   	cAMC.setChecked(vac.getAMC());
				   	antimen1rados.setText(vac.getAMC1DF());
				   	antimen2dados.setText(vac.getAMC2DF());
				   	antimen3rados.setText(vac.getAMC3DF());
				   	cHyD.setChecked(vac.getHyD());
				   	hidydtp.setText(vac.getHyD1DF());
				   	cANC.setChecked(vac.getANC());
				   	antineu1rados.setText(vac.getANC1DF());
				   	antineu2dados.setText(vac.getANC2DF());
				   	antineu3rados.setText(vac.getANC3DF());
				   	cAI.setChecked(vac.getAI());
				   	antinf1rados.setText(vac.getAI1DF());
				   	antinf2dados.setText(vac.getAI2DF());
				   	antinf3rados.setText(vac.getAI3DF());

				   	 }
					
					 getArguments().clear();
					
				 }
			 
			 /*fin Botones*/
		
		return rootView;
	}
	
	public int AsigSipin(String val)
	{
		if(val.equals("No"))
	    	return 0;		
		if(val.equals("Si"))
			return 1;		
		return 2;
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
			CarnetVacunacion=carne.getSelectedItem().toString();
		
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.CheckBox01)
		{			
			if(arg1)
			{
				 /* vacpent.setVisibility(View.INVISIBLE);
			      antimen.setVisibility(View.INVISIBLE);
			      hib.setVisibility(View.INVISIBLE);
			      antineu.setVisibility(View.INVISIBLE);
			      antiinf.setVisibility(View.INVISIBLE);*/
			      
			  	 
				  cVPV.setChecked(false);	
				  cAMC.setChecked(false);
				  cHyD.setChecked(false);	
				  cANC.setChecked(false);
				  cAI.setChecked(false);
				  VacunacionNoPrecisada=true;
			}
			else
				VacunacionNoPrecisada=false;
			
			
		}
		if(arg0.getId()==R.id.CheckBox02)
		{
			if(arg1)
			{
				 vacpent.setVisibility(View.VISIBLE);
			
				 VPV=true;
					
			}
			else
			{
				 vacpent.setVisibility(View.INVISIBLE);		     
			      
				 vanpent1rados.setText("");
				 vanpent2dados.setText("");
				 vanpent3raados.setText("");
				 VPV=false;
			    
			}
		}
		if(arg0.getId()==R.id.CheckBox03)
		{
			if(arg1)
			{
				antimen.setVisibility(View.VISIBLE);
				AMC=true;
			}
			else
			{
				antimen.setVisibility(View.INVISIBLE);
				 antimen1rados.setText("");
				 antimen2dados.setText("");
				 antimen3rados.setText("");
				 AMC=false;
			}
		}
		if(arg0.getId()==R.id.CheckBox04)
		{
			if(arg1)
			{
				hib.setVisibility(View.VISIBLE);
				HyD=true;
			}
			else
			{
				hib.setVisibility(View.INVISIBLE);
				hidydtp.setText("");
				hidydtp.setText("");
				hidydtp.setText("");
				HyD=false;
			}
		}
		if(arg0.getId()==R.id.CheckBox05)
		{
			if(arg1)
			{
				ANC=true;
				antineu.setVisibility(View.VISIBLE);
			}
			else
			{
				ANC=false;
				antineu.setVisibility(View.INVISIBLE);
				antineu1rados.setText("");
				antineu2dados.setText("");
				antineu3rados.setText("");
			}
		}
		if(arg0.getId()==R.id.CheckBox06)
		{
			if(arg1)
			{
				antiinf.setVisibility(View.VISIBLE);
				AI=true;
			}
			else
			{
				AI=false;
				antiinf.setVisibility(View.INVISIBLE);
				antinf1rados.setText("");
				antinf2dados.setText("");
				antinf3rados.setText("");
			}
		}
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		SelectorFecha s=new SelectorFecha();
			 
		 
		
		if(arg0.getId()==R.id.boton1v)
		{
			s.InsertFecha(vanpent1rados, rootView);
		}	
		 
		if(arg0.getId()==R.id.boton6)
		{
			s.InsertFecha(vanpent2dados, rootView);
		}		
		if(arg0.getId()==R.id.boton10)
		{
			s.InsertFecha(vanpent3raados, rootView);
		}
		
		
		
		
		if(arg0.getId()==R.id.ImageButton03)
		{
			s.InsertFecha(antimen1rados, rootView);
		}

		if(arg0.getId()==R.id.ImageButton02)
		{
			s.InsertFecha(antimen2dados, rootView);
		}
		if(arg0.getId()==R.id.ImageButton01)
		{
			s.InsertFecha(antimen3rados, rootView);
		}	
		
		
		if(arg0.getId()==R.id.boton4)
		{
			s.InsertFecha(hidydtp, rootView);
		}	
		
		
		
		 if(arg0.getId()==R.id.boton3)
			{
				s.InsertFecha(antineu1rados, rootView);
			}
		 if(arg0.getId()==R.id.boton8)
			{
				s.InsertFecha(antineu2dados, rootView);
			}
	
	   if(arg0.getId()==R.id.boton12)
		{
			s.InsertFecha(antineu3rados, rootView);
		}	 

		   if(arg0.getId()==R.id.boton5)
			{
				s.InsertFecha(antinf1rados, rootView);
			}
		   if(arg0.getId()==R.id.boton9)
			{
				s.InsertFecha(antinf2dados, rootView);
			}
		   if(arg0.getId()==R.id.boton13)
			{
				s.InsertFecha(antinf3rados, rootView);
			}
		
		
		
	}
	
	
	
	
	
	
	
	public void CreateVars()
	{
	 	
		
		 VAC=new VacunacionEnt(String.valueOf(carne.getSelectedItemPosition()), VacunacionNoPrecisada, VPV, vanpent1rados.getText().toString(), vanpent2dados.getText().toString(), vanpent3raados.getText().toString(), AMC, antimen1rados.getText().toString(), antimen2dados.getText().toString(), antimen3rados.getText().toString(), HyD, hidydtp.getText().toString(),
				 ANC, antineu1rados.getText().toString(), antineu2dados.getText().toString(), antineu3rados.getText().toString(), AI, antinf1rados.getText().toString(),
				 antinf2dados.getText().toString(), antinf3rados.getText().toString());
		 
		 
		 
	}
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		/*Vars*/
		
		super.onActivityCreated(savedInstanceState);
		CreateVars();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
/*Vacunacion*/