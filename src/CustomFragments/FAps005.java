package CustomFragments;

import java.util.ArrayList;

import sqlite.BDAcceso;
import sqlite.EnfResp007;
import sqlite.Susceptibilidad;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class FAps005 extends Fragment  implements OnItemSelectedListener,OnClickListener{

	View rootView;
	EnfResp007 ER007;
	
	RelativeLayout ocult1;
	RelativeLayout ocult2;
	
	TextView t1;
	TextView t2;
	TextView t3;
	TextView t4;
	TextView t5;
	 Spinner svirusidentif;
	  Spinner sbacteriaidentificativa;
	  String [] cadenabacteria={"","Si","No","Indeterminado"};
	     ArrayAdapter<String> adaptadorbacteria;
	     
	     Susceptibilidad [] suscbaislamiento=new Susceptibilidad[5];
	 	Susceptibilidad [] suscantiviral=new Susceptibilidad[5];
	 	String suscbaislamientoid1="0";String suscbaislamientoid2="0";String suscbaislamientoid3="0";String suscbaislamientoid4="0";String suscbaislamientoid5="0";
		String suscantiviralid1="0";String suscantiviralid2="0";String suscantiviralid3="0";String suscantiviralid4="0";String suscantiviralid5="0";
	     
	     
	     /*LK*/
	     CheckBox LK_Cspneumoniae;
	     EditText LK_Cserotipo;
	     EditText LK_Cotra;
	     EditText LK_Cotraserotipo;
	     CheckBox LK_Cnoclonizado;
	     EditText LK_Cfecharesultado;
	      ImageButton bLK_Cfecharesultado;
	    
	     CheckBox LK_ABhinfluenzae;
	     EditText LK_ABhinfserotipo;
	     CheckBox LK_ABspneumoniae;
	     EditText LK_ABspneumonserotipo;
	     CheckBox LK_ABnmeningiditis;
	     EditText LK_ABnmeningserotipo;
	     EditText LK_ABotra;
	     EditText LK_ABotraserotipo;
	     EditText LK_ABfecharesult;
	      ImageButton bLK_ABfecharesult;
	    
	     EditText LK_VRtipovirus;
	     EditText LK_VRtiposubtipo;
	     EditText LK_VRfecharesultado;
	      ImageButton bLK_VRfecharesultado;
	     EditText LK_analisisvarianteresist;
	     
	     /*Susceptibilidad Antib bacterias*/
	     EditText antib1;
	     EditText antib2;
	     EditText antib3;
	     EditText antib4;
	     EditText antib5;
	     EditText fecharesult;
	     ImageButton bfecharesult;
	     
	     /*Susceptibilidad Antib Aislamiento*/
	     EditText antibbact1;
	     EditText antibbact2;
	     EditText antibbact3;
	     EditText antibbact4;
	     EditText antibbact5;
	     EditText fechasabb;
	     ImageButton bfechasabb;
	     
	     /*Susceptibilidad Antiviral Aislamiento*/
	     EditText antiv1;
	     EditText antiv2;
	     EditText antiv3;
	     EditText antiv4;
	     EditText antiv5;
	     EditText fechaantiv;
	     ImageButton bfechaantiv;
	     
	
	
	public static FAps005 newInstance() {
		FAps005 frag = new FAps005();
   		
   		Bundle args = frag.getArguments();
   		if(args == null)
   			args = new Bundle();	  		
   		
   		frag.setArguments(args);
   		
   		return frag;
   	}
    	
    	public static FAps005 newInstanceArgs(String caso_id) {
    		FAps005 frag = new FAps005();
    		
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
    rootView = inflater.inflate(R.layout.enfresp007f, container,false);	
   	ocult1=(RelativeLayout)rootView.findViewById(R.id.relativeLayout2);  
   	ocult2=(RelativeLayout)rootView.findViewById(R.id.relativeLayout3);
 	ocult1.setLayoutParams(new LayoutParams(0, 0));
 	ocult2.setLayoutParams(new LayoutParams(0, 0));
 	 

	 t1=(TextView)rootView.findViewById(R.id.textView1);  
	 t2=(TextView)rootView.findViewById(R.id.TextView01);  
	 t3=(TextView)rootView.findViewById(R.id.TextView07); 
	 t4=(TextView)rootView.findViewById(R.id.TextView05);  
	 t5=(TextView)rootView.findViewById(R.id.TextView23); 
	 
	 t1.setLayoutParams(new LayoutParams(0, 0));
	 t2.setLayoutParams(new LayoutParams(0, 0));
	 t3.setLayoutParams(new LayoutParams(0, 0));
	 t4.setLayoutParams(new LayoutParams(0, 0));
	 t5.setText("VII. Resultado de Laboratorio (Laboratorio de Referencia-IPK)");
   	 
	 adaptadorbacteria=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadenabacteria);
	 sbacteriaidentificativa=(Spinner)rootView.findViewById(R.id.Spinner02);
	 svirusidentif=(Spinner)rootView.findViewById(R.id.Spinner03);
	 svirusidentif.setAdapter(adaptadorbacteria);
	 sbacteriaidentificativa.setAdapter(adaptadorbacteria);
	 
	 LK_Cspneumoniae=(CheckBox)rootView.findViewById(R.id.CheckBox16);
     LK_Cserotipo=(EditText)rootView.findViewById(R.id.EditText16);
     LK_Cotra=(EditText)rootView.findViewById(R.id.EditText15);
     LK_Cotraserotipo=(EditText)rootView.findViewById(R.id.EditText17);
     LK_Cnoclonizado=(CheckBox)rootView.findViewById(R.id.CheckBox15);
     LK_Cfecharesultado=(EditText)rootView.findViewById(R.id.EditText25);
      bLK_Cfecharesultado=(ImageButton)rootView.findViewById(R.id.ImageButton07);
      bLK_Cfecharesultado.setOnClickListener(this);
    
     LK_ABhinfluenzae=(CheckBox)rootView.findViewById(R.id.CheckBox20);
     LK_ABhinfserotipo=(EditText)rootView.findViewById(R.id.EditText18);
     LK_ABspneumoniae=(CheckBox)rootView.findViewById(R.id.CheckBox18);
     LK_ABspneumonserotipo=(EditText)rootView.findViewById(R.id.EditText19);
     LK_ABnmeningiditis=(CheckBox)rootView.findViewById(R.id.CheckBox19);
     LK_ABnmeningserotipo=(EditText)rootView.findViewById(R.id.EditText20);
     LK_ABotra=(EditText)rootView.findViewById(R.id.EditText21);
     LK_ABotraserotipo=(EditText)rootView.findViewById(R.id.EditText22);
      bLK_ABfecharesult=(ImageButton)rootView.findViewById(R.id.ImageButton06);
      bLK_ABfecharesult.setOnClickListener(this);
     LK_ABfecharesult=(EditText)rootView.findViewById(R.id.EditText24);
     
    
     LK_VRtipovirus=(EditText)rootView.findViewById(R.id.editText4);
     LK_VRtiposubtipo=(EditText)rootView.findViewById(R.id.editText5);
     LK_VRfecharesultado=(EditText)rootView.findViewById(R.id.EditText32);
      bLK_VRfecharesultado=(ImageButton)rootView.findViewById(R.id.ImageButton09);
      bLK_VRfecharesultado.setOnClickListener(this);
     LK_analisisvarianteresist=(EditText)rootView.findViewById(R.id.editText6);
  
     /*Susceptibilidad Antibioticos Bacterias*/
      antib1=(EditText)rootView.findViewById(R.id.editText1);
      antib2=(EditText)rootView.findViewById(R.id.EditText11);
      antib3=(EditText)rootView.findViewById(R.id.EditText12);
      antib4=(EditText)rootView.findViewById(R.id.EditText13);
      antib5=(EditText)rootView.findViewById(R.id.EditText14);
      fecharesult=(EditText)rootView.findViewById(R.id.EditText23);
       bfecharesult=(ImageButton)rootView.findViewById(R.id.ImageButton05);
       bfecharesult.setOnClickListener(this);
 
       /*Susceptibilidad Antib Aislamiento*/     
        antibbact1=(EditText)rootView.findViewById(R.id.EditText31);
        antibbact2=(EditText)rootView.findViewById(R.id.EditText30);
        antibbact3=(EditText)rootView.findViewById(R.id.EditText27);
        antibbact4=(EditText)rootView.findViewById(R.id.EditText26);
        antibbact5=(EditText)rootView.findViewById(R.id.EditText29);
        fechasabb=(EditText)rootView.findViewById(R.id.EditText28);
         bfechasabb=(ImageButton)rootView.findViewById(R.id.ImageButton08);
         bfechasabb.setOnClickListener(this);
         
         /*Susceptibilidad Antiviral Asialmiento*/
          antiv1=(EditText)rootView.findViewById(R.id.EditText35);
          antiv2=(EditText)rootView.findViewById(R.id.EditText33);
          antiv3=(EditText)rootView.findViewById(R.id.EditText34);
          antiv4=(EditText)rootView.findViewById(R.id.EditText37);
          antiv5=(EditText)rootView.findViewById(R.id.EditText38);
          fechaantiv=(EditText)rootView.findViewById(R.id.EditText36);
          bfechaantiv=(ImageButton)rootView.findViewById(R.id.ImageButton10);
          bfechaantiv.setOnClickListener(this);
          if(getArguments().isEmpty()==false)
          {
        	  BDAcceso bd=new BDAcceso(rootView.getContext());
			   	 bd.open();
			   	 EnfResp007 er7=new EnfResp007();
			   	 er7=er7.selectEnfResp007(Long.valueOf(getArguments().getString("caso_id")), bd.getBD());
			   	 Susceptibilidad s=new Susceptibilidad();
			   
			   	
			   	 ArrayList<Susceptibilidad> Aantib=s.selectSuseptibilidad(getArguments().getString("caso_id"), "A","ANTIBIOTICO", bd.getBD());
			   	 ArrayList<Susceptibilidad> antiviral=s.selectSuseptibilidad(getArguments().getString("caso_id"), "A","ANTIVIRAL", bd.getBD());
			   	 bd.close();
			   	 
			 	sbacteriaidentificativa.setSelection(Integer.valueOf(er7.getLK_ABbactidentif()));
			   	svirusidentif.setSelection(Integer.valueOf(er7.getLK_VRvirusidentif()));
				LK_Cspneumoniae.setChecked(er7.getLK_Cspneumoniae());
			   	LK_Cserotipo.setText(er7.getLK_Cserotipo());
			   	LK_Cotra.setText(er7.getLK_Cotra());
			   	LK_Cotraserotipo.setText(er7.getLK_Cotraserotipo());
			   	LK_Cnoclonizado.setChecked(er7.getLK_Cnoclonizado());
			   	LK_Cfecharesultado.setText(er7.getLK_Cfecharesultado());
			   	LK_ABhinfluenzae.setChecked(er7.getLK_ABhinfluenzae());
			   	LK_ABhinfserotipo.setText(er7.getLK_ABhinfserotipo());
			   	LK_ABspneumoniae.setChecked(er7.getLK_ABspneumoniae());
			   	LK_ABspneumonserotipo.setText(er7.getLK_ABspneumonserotipo());
			   	LK_ABnmeningiditis.setChecked(er7.getLK_ABnmeningiditis());
			   	LK_ABnmeningserotipo.setText(er7.getLK_ABnmeningserotipo());
			   	LK_ABotra.setText(er7.getLK_ABotra());
			   	LK_ABotraserotipo.setText(er7.getLK_ABotraserotipo());
			   	LK_ABfecharesult.setText(er7.getLK_ABfecharesult());
			   	LK_VRtipovirus.setText(er7.getLK_VRtipovirus());
			   	LK_VRtiposubtipo.setText(er7.getLK_VRtiposubtipo());
			   	LK_VRfecharesultado.setText(er7.getLK_VRfecharesultado());
			   	LK_analisisvarianteresist.setText(er7.getLK_analisisvarianteresist());			   	
			   
			   	if(Aantib.size()>0)
			   	{
			   		antibbact1.setText(Aantib.get(0).getNombre());
			   		fechasabb.setText(Aantib.get(0).getfecharesult());
			   		suscbaislamientoid1=Aantib.get(0).getidreg();
			   		if(Aantib.size()>1)
			   		{
			   			antibbact2.setText(Aantib.get(1).getNombre());
			   			suscbaislamientoid2=Aantib.get(1).getidreg();
			   		}
			   		if(Aantib.size()>2)
			   		{
			   			antibbact3.setText(Aantib.get(2).getNombre());
			   			suscbaislamientoid3=Aantib.get(2).getidreg();
			   		}
			   		if(Aantib.size()>3)
			   		{
			   			antibbact4.setText(Aantib.get(3).getNombre());
			   			suscbaislamientoid4=Aantib.get(3).getidreg();
			   		}
			   		if(Aantib.size()>4)
			   		{
			   			antibbact5.setText(Aantib.get(4).getNombre());
			   			suscbaislamientoid5=Aantib.get(4).getidreg();
			   		}
			   	}
			   	if(antiviral.size()>0)
			   	{
			   		antiv1.setText(antiviral.get(0).getNombre());			      
			        fechaantiv.setText(antiviral.get(0).getfecharesult());
			        suscantiviralid1=antiviral.get(0).getidreg();
			        if(antiviral.size()>1)
			        {
			        	antiv2.setText(antiviral.get(1).getNombre());	
			            suscantiviralid2=antiviral.get(1).getidreg();
			        }
			        if(antiviral.size()>2)
			        {
			        	antiv3.setText(antiviral.get(2).getNombre());	
			        	suscantiviralid3=antiviral.get(2).getidreg();
			        }
			        if(antiviral.size()>3)
			        {
			        	antiv4.setText(antiviral.get(3).getNombre());
			        	suscantiviralid4=antiviral.get(3).getidreg();
			        }
			        if(antiviral.size()>4)
			        {
			        	antiv5.setText(antiviral.get(4).getNombre());	
			        	suscantiviralid5=antiviral.get(4).getidreg();
			        }
			   	}
			   	
			   	
			   	
          }
	 return rootView;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		SelectorFecha s=new SelectorFecha();
		
		if(arg0.getId()==R.id.ImageButton07)
		{
			s.InsertFecha(LK_Cfecharesultado, rootView);
		}
		if(arg0.getId()==R.id.ImageButton06)
		{
			s.InsertFecha(LK_ABfecharesult, rootView);
		}
		if(arg0.getId()==R.id.ImageButton09)
		{
			s.InsertFecha(LK_VRfecharesultado, rootView);
		}
		
		if(arg0.getId()==R.id.ImageButton05)
		{
			s.InsertFecha(fecharesult, rootView);
		}
		if(arg0.getId()==R.id.ImageButton08)
		{
			s.InsertFecha(fechasabb, rootView);
		}
		
		if(arg0.getId()==R.id.ImageButton10)
		{
			s.InsertFecha(fechaantiv, rootView);
		}
	    s=null;
		
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

public void CreateVars()
{
	Susceptibilidad aa1=new Susceptibilidad(suscbaislamientoid1, "0", antibbact1.getText().toString(), "ANTIBIOTICO", "A", fechasabb.getText().toString());
	Susceptibilidad aa2=new Susceptibilidad(suscbaislamientoid2, "0", antibbact2.getText().toString(), "ANTIBIOTICO", "A", fechasabb.getText().toString());
	Susceptibilidad aa3=new Susceptibilidad(suscbaislamientoid3, "0", antibbact3.getText().toString(), "ANTIBIOTICO", "A", fechasabb.getText().toString());
	Susceptibilidad aa4=new Susceptibilidad(suscbaislamientoid4, "0", antibbact4.getText().toString(), "ANTIBIOTICO", "A", fechasabb.getText().toString());
	Susceptibilidad aa5=new Susceptibilidad(suscbaislamientoid5, "0", antibbact5.getText().toString(), "ANTIBIOTICO", "A", fechasabb.getText().toString());
	suscbaislamiento[0]=aa1;suscbaislamiento[1]=aa2;suscbaislamiento[2]=aa3;suscbaislamiento[3]=aa4;suscbaislamiento[4]=aa5;
	
	Susceptibilidad sav1=new Susceptibilidad(suscantiviralid1, "0", antiv1.getText().toString(), "ANTIVIRAL", "A",fechaantiv.getText().toString());
	Susceptibilidad sav2=new Susceptibilidad(suscantiviralid2, "0", antiv2.getText().toString(), "ANTIVIRAL", "A",fechaantiv.getText().toString());	
	Susceptibilidad sav3=new Susceptibilidad(suscantiviralid3, "0", antiv3.getText().toString(), "ANTIVIRAL", "A",fechaantiv.getText().toString());
	Susceptibilidad sav4=new Susceptibilidad(suscantiviralid4, "0", antiv4.getText().toString(), "ANTIVIRAL", "A",fechaantiv.getText().toString());
	Susceptibilidad sav5=new Susceptibilidad(suscantiviralid5, "0", antiv5.getText().toString(), "ANTIVIRAL", "A",fechaantiv.getText().toString());
	suscantiviral[0]=sav1;	suscantiviral[1]=sav2;	suscantiviral[2]=sav3;	suscantiviral[3]=sav4;	suscantiviral[4]=sav5;
	
	ER007=new EnfResp007("0", false,"", 
			false, "", 
			false,"", false, 
			"", false,"", 
			"", "","", "", 
			false, false,false,false,
			"", "","", 
			"", false, false,false,
			false, "","",
			LK_Cspneumoniae.isChecked(), LK_Cserotipo.getText().toString(), LK_Cotra.getText().toString(), LK_Cotraserotipo.getText().toString(), 
			LK_Cnoclonizado.isChecked(), LK_Cfecharesultado.getText().toString(), String.valueOf(sbacteriaidentificativa.getSelectedItemPosition()), 
			LK_ABhinfluenzae.isChecked(), LK_ABhinfserotipo.getText().toString(), LK_ABspneumoniae.isChecked(), LK_ABspneumonserotipo.getText().toString(), 
			LK_ABnmeningiditis.isChecked(), LK_ABnmeningserotipo.getText().toString(), LK_ABotra.getText().toString(), LK_ABotraserotipo.getText().toString(),
			LK_ABfecharesult.getText().toString(), String.valueOf(svirusidentif.getSelectedItemPosition()), LK_VRtipovirus.getText().toString(), LK_VRtiposubtipo.getText().toString(), 
			LK_VRfecharesultado.getText().toString(), LK_analisisvarianteresist.getText().toString());
}


}
