package CustomFragments;

import java.util.ArrayList;

import sqlite.Antibioticos;
import sqlite.BDAcceso;
import sqlite.ConsumoMedicamentos;
import sqlite.EnfResp006;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

public class FEnfResp006 extends Fragment implements OnItemSelectedListener,OnClickListener{
	

	String id1="0";
	String id2="0";
	String id3="0";
	
	String ida1="0";
	String ida2="0";
	String ida3="0";

	
	View rootView;	
    EnfResp006 ER6;
    Antibioticos[] ants=new Antibioticos[3];
    ConsumoMedicamentos[] med=new ConsumoMedicamentos[3];
	ScrollView sv;
	
	CheckBox ERasma;
	CheckBox ERotraenfpulm;
	CheckBox ERinmunodef;
	CheckBox ERcard;
	CheckBox ERdiab;
	EditText ERotra1;
	CheckBox ERenfhep;
	CheckBox ERenfNeurolg;
	EditText ERotra2;
	CheckBox ERenfrenal;
	CheckBox ERobesidad;
	EditText ERotra3;
	
	/*Antibioticos*/
	EditText ant1;
	EditText ant2;
	EditText ant3;
	EditText dias1;
	EditText dias2;
	EditText dias3;
	
	EditText fechainicio;
	ImageButton bfecfainicio;
	
	/*Antibioticos Final*/
	CheckBox ultdias;
	EditText antib1;
	EditText antib2;
	EditText antib3;
	EditText fecha1_1ra;
	EditText fecha1_2da;
	EditText fecha2_1ra;
	EditText fecha2_2da;
	EditText fecha3_1ra;
	EditText fecha3_2da;
	
	ImageButton bfecha1_1ra;
	ImageButton bfecha1_2da;
	ImageButton becha2_1ra;
	ImageButton becha2_2da;
	ImageButton becha3_1ra;
	ImageButton becha3_2da;
	/*spinners, cadenas y adaptadores correspondientes*/
	Spinner spersonasdorm;
	String [] cadenapersonasdorm={"no sabe","mas de 3 personas","mas de 4 personas"," menos de 4 personas"};
    ArrayAdapter<String> adaptadorpersonasdorm;
    
    Spinner sconvivientescasa;
    String [] cadenaconvivientes={"no sabe","abuelos","menor 5 años de edad","ninguno"};
    ArrayAdapter<String> adaptadorconvivientes;
    
    Spinner sfumadorescasa;
    String [] cadenafumadorescasa={"No","Si","No Sabe"};
    ArrayAdapter<String> adaptadorfumadorescasa;
    
    Spinner sasistenciacirc;    
    Spinner slactanciamat;    
    Spinner sbajopeso;    
    Spinner smadrevacunada;
    
    Spinner sepisodios;
    String [] cadenaepisodios={"No sabe","menos de 5 episodios","de 6 a 8 episodios","mayor de 8 episodios"};
    ArrayAdapter<String> adaptadorepisodios;
    
    Spinner santecedentesrinitis;
    Spinner sconsumoantib;
    Spinner soserltamiv;
    
    Spinner sviaadmin;
    String [] cadenaviaadmin={"No sabe","Oral","Intravenoso","Ambas"};
    ArrayAdapter<String> adaptadorviaadmin;

	/*sppinners*/
    
    RelativeLayout layantib1;
    	public static FEnfResp006 newInstance() {
		FEnfResp006 frag = new FEnfResp006();
   		
   		Bundle args = frag.getArguments();
   		if(args == null)
   			args = new Bundle();	  		
   		
   		frag.setArguments(args);
   		
   		return frag;
   	}
    	
    	public static FEnfResp006 newInstanceArgs(String caso_id) {
       		FEnfResp006 frag = new FEnfResp006();
    		
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
   	   rootView = inflater.inflate(R.layout.enfresp006f, container,false);	   	
   	sv=(ScrollView)rootView.findViewById(R.id.scrollView11);
   	
 
    ERasma=(CheckBox)rootView.findViewById(R.id.CheckBox01);
    ERotraenfpulm=(CheckBox)rootView.findViewById(R.id.CheckBox08);
    ERinmunodef=(CheckBox)rootView.findViewById(R.id.CheckBox09);
    ERcard=(CheckBox)rootView.findViewById(R.id.CheckBox10);
    ERdiab=(CheckBox)rootView.findViewById(R.id.CheckBox11);
    ERotra1=(EditText)rootView.findViewById(R.id.EditText14);
    ERenfhep=(CheckBox)rootView.findViewById(R.id.CheckBox12);
    ERenfNeurolg=(CheckBox)rootView.findViewById(R.id.CheckBox13);
    ERotra2=(EditText)rootView.findViewById(R.id.EditText13);
    ERenfrenal=(CheckBox)rootView.findViewById(R.id.CheckBox14);
    ERobesidad=(CheckBox)rootView.findViewById(R.id.CheckBox15);
    ERotra3=(EditText)rootView.findViewById(R.id.EditText15);
    
    /*Antibioticos consumo*/
     ant1=(EditText)rootView.findViewById(R.id.editText1);
	 ant2=(EditText)rootView.findViewById(R.id.EditText01);
	 ant3=(EditText)rootView.findViewById(R.id.EditText03);
	 dias1=(EditText)rootView.findViewById(R.id.editText2);
	 dias2=(EditText)rootView.findViewById(R.id.EditText02);
	 dias3=(EditText)rootView.findViewById(R.id.EditText04);
	 

	    fechainicio=(EditText)rootView.findViewById(R.id.EditText10);	    
	    bfecfainicio=(ImageButton)rootView.findViewById(R.id.ImageButton01v);
	    bfecfainicio.setOnClickListener(this);
   	   
   	   /*spinners*/				
		spersonasdorm=(Spinner)rootView.findViewById(R.id.spinner1);
		adaptadorpersonasdorm=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadenapersonasdorm);
		spersonasdorm.setAdapter(adaptadorpersonasdorm);
		
		
		sconvivientescasa=(Spinner)rootView.findViewById(R.id.Spinner01);
		adaptadorconvivientes=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadenaconvivientes);
		sconvivientescasa.setAdapter(adaptadorconvivientes);
		sconvivientescasa.setOnItemSelectedListener(this);
		
		sfumadorescasa=(Spinner)rootView.findViewById(R.id.Spinner02);
		adaptadorfumadorescasa=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadenafumadorescasa);
		sfumadorescasa.setAdapter(adaptadorfumadorescasa);
		sfumadorescasa.setOnItemSelectedListener(this);
		
		sasistenciacirc=(Spinner)rootView.findViewById(R.id.Spinner03);
		sasistenciacirc.setAdapter(adaptadorfumadorescasa);
		sasistenciacirc.setOnItemSelectedListener(this);
		
		slactanciamat=(Spinner)rootView.findViewById(R.id.Spinner04);
		slactanciamat.setAdapter(adaptadorfumadorescasa);
		slactanciamat.setOnItemSelectedListener(this);
		
		sbajopeso=(Spinner)rootView.findViewById(R.id.Spinner05);
		sbajopeso.setAdapter(adaptadorfumadorescasa);
		sbajopeso.setOnItemSelectedListener(this);
		
		smadrevacunada=(Spinner)rootView.findViewById(R.id.Spinner06);
		smadrevacunada.setAdapter(adaptadorfumadorescasa);
		smadrevacunada.setOnItemSelectedListener(this);
		
		sepisodios=(Spinner)rootView.findViewById(R.id.Spinner07);
		adaptadorepisodios=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadenaepisodios);
		sepisodios.setAdapter(adaptadorepisodios);
		sepisodios.setOnItemSelectedListener(this);
		
		santecedentesrinitis=(Spinner)rootView.findViewById(R.id.Spinner08);
		santecedentesrinitis.setAdapter(adaptadorfumadorescasa);
		santecedentesrinitis.setOnItemSelectedListener(this);
		
		sconsumoantib=(Spinner)rootView.findViewById(R.id.Spinner09);
		sconsumoantib.setAdapter(adaptadorfumadorescasa);
		sconsumoantib.setOnItemSelectedListener(this);
		sconsumoantib.setOnItemSelectedListener(this);
		
		soserltamiv=(Spinner)rootView.findViewById(R.id.Spinner05a);
		soserltamiv.setAdapter(adaptadorfumadorescasa);
		soserltamiv.setOnItemSelectedListener(this);
		
		sviaadmin=(Spinner)rootView.findViewById(R.id.Spinnervia);
		adaptadorviaadmin=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadenaviaadmin);
		sviaadmin.setAdapter(adaptadorviaadmin);
		sviaadmin.setOnItemSelectedListener(this);
		
		spersonasdorm.setOnItemSelectedListener(this);
		/*spinners*/
		
		/*Consumo actual medicamentos*/
		 ultdias=(CheckBox)rootView.findViewById(R.id.CheckBox03);
	     antib1=(EditText)rootView.findViewById(R.id.EditText05);
		 antib2=(EditText)rootView.findViewById(R.id.EditText06);
		 antib3=(EditText)rootView.findViewById(R.id.EditText07);
		 fecha1_1ra=(EditText)rootView.findViewById(R.id.EditText08);
		 fecha1_2da=(EditText)rootView.findViewById(R.id.editText32);
		 fecha2_1ra=(EditText)rootView.findViewById(R.id.EditText066);
		 fecha2_2da=(EditText)rootView.findViewById(R.id.EditText077);
		 fecha3_1ra=(EditText)rootView.findViewById(R.id.EditText088);
		 fecha3_2da=(EditText)rootView.findViewById(R.id.EditText09);
		
		 bfecha1_1ra=(ImageButton)rootView.findViewById(R.id.boton3);
		 bfecha1_1ra.setOnClickListener(this);
		 
		 bfecha1_2da=(ImageButton)rootView.findViewById(R.id.boton1abm);
		 bfecha1_2da.setOnClickListener(this);
		 
		 becha2_1ra=(ImageButton)rootView.findViewById(R.id.boton4);
		 becha2_1ra.setOnClickListener(this);
		 
		 becha2_2da=(ImageButton)rootView.findViewById(R.id.boton6);
		 becha2_2da.setOnClickListener(this);
		 
		 becha3_1ra=(ImageButton)rootView.findViewById(R.id.boton5);
		 becha3_1ra.setOnClickListener(this);
		 
		 becha3_2da=(ImageButton)rootView.findViewById(R.id.Iboton2);
		 becha3_2da.setOnClickListener(this);
		layantib1=(RelativeLayout)rootView.findViewById(R.id.layantibs);
		layantib1.setAlpha((float) 0.3);
		 if(getArguments().isEmpty()==false)
		    {
		   	 BDAcceso bd=new BDAcceso(rootView.getContext());
		   	 bd.open();
		   	 EnfResp006 er6=new EnfResp006();
		   	 er6=er6.selectEnfResp006(Long.valueOf(getArguments().getString("caso_id")), bd.getBD());
		   	 ConsumoMedicamentos cm=new ConsumoMedicamentos();
		   	 ArrayList<ConsumoMedicamentos> consumomed=cm.selectConsumo(getArguments().getString("caso_id"),  bd.getBD());
		   	 Antibioticos A=new Antibioticos();
		   	 ArrayList<Antibioticos> ants=A.selectAntibioticos(getArguments().getString("caso_id"),  bd.getBD());
		 	 bd.close();
		    ERasma.setChecked(er6.getERasma());
		   	ERotraenfpulm.setChecked(er6.getERotraenfpulm());
		   	ERinmunodef.setChecked(er6.getERinmunodef());
		   	ERcard.setChecked(er6.getERcard());
		   	ERdiab.setChecked(er6.getERdiab());
		   	ERotra1.setText(er6.getERotra1());
		   	ERenfhep.setChecked(er6.getERenfhep());
		   	ERenfNeurolg.setChecked(er6.getERenfNeurolg());
		   	ERotra2.setText(er6.getERotra2());
		   	ERenfrenal.setChecked(er6.getERenfrenal());
		   	ERobesidad.setChecked(er6.getERobesidad());
		   	ERotra3.setText(er6.getERotra3());		   	
		   	spersonasdorm.setSelection(Integer.valueOf(er6.getFRpersonasdorm()));
		   	sconvivientescasa.setSelection(Integer.valueOf(er6.getFRconvivientes()));
		   	sfumadorescasa.setSelection(Integer.valueOf(er6.getFRfumadores()));
		   	sasistenciacirc.setSelection(Integer.valueOf(er6.getFRasistenciacirc()));
		   	slactanciamat.setSelection(Integer.valueOf(er6.getFRlactancia()));
		   	sbajopeso.setSelection(Integer.valueOf(er6.getFRbajopeso()));
		   	smadrevacunada.setSelection(Integer.valueOf(er6.getFRmadrevac()));
		   	sepisodios.setSelection(Integer.valueOf(er6.getFRepisodiosira()));
		   	santecedentesrinitis.setSelection(Integer.valueOf(er6.getFRantecedentesrinitis()));
		   	sconsumoantib.setSelection(Integer.valueOf(er6.getConsumo()));
		   	soserltamiv.setSelection(Integer.valueOf(er6.getoseltamivir()));
		   	fechainicio.setText(er6.getfechainiciooselt());
		   	if(consumomed.size()!=0)
		   	{
		   			ant1.setText(consumomed.get(0).getnom_ant());
		   			dias1.setText(consumomed.get(0).getdiasconsumo());
		   			id1=consumomed.get(0).GetIDreg();
		   				   		
		   		if(consumomed.size()>1)
		   		{
		   			ant2.setText(consumomed.get(1).getnom_ant());
		   			dias2.setText(consumomed.get(1).getdiasconsumo());
		   			id2=consumomed.get(1).GetIDreg();
		   		}
		   		if(consumomed.size()>2)
		   		{
		   			ant3.setText(consumomed.get(2).getnom_ant());
		   			dias3.setText(consumomed.get(2).getdiasconsumo());
		   			id3=consumomed.get(2).GetIDreg();
		   		}
		   	}
		   	if(ants.size()>0)
		   	{
		   		ultdias.setChecked(ants.get(0).getUlt7Dias());
		   		antib1.setText(ants.get(0).getNombreAnt());
		   		fecha1_1ra.setText(ants.get(0).getFecha1raDos());
		   		fecha1_2da.setText(ants.get(0).getFecha2daDos());
		   		ida1=ants.get(0).GetIDreg();
		   		if(ants.size()>1)
		   		{
		   			antib2.setText(ants.get(1).getNombreAnt());
		   			fecha2_1ra.setText(ants.get(1).getFecha1raDos());
		   			fecha2_2da.setText(ants.get(1).getFecha2daDos());
		   			ida2=ants.get(1).GetIDreg();
		   		}
		   		if(ants.size()>2)
		   		{
		   			antib3.setText(ants.get(2).getNombreAnt());
		   			fecha3_1ra.setText(ants.get(2).getFecha1raDos());
		   			fecha3_2da.setText(ants.get(2).getFecha2daDos());
		   			ida3=ants.get(2).GetIDreg();
		   		}
		   		
		   	}

		  
		    }
		getArguments().clear();
   	   return rootView;
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, final View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
			if(sconsumoantib.getSelectedItem().toString()=="Si")
				layantib1.setAlpha((float) 1);
			if(sconsumoantib.getSelectedItem().toString()=="No")
				layantib1.setAlpha((float) 0.3);
			if(sconsumoantib.getSelectedItem().toString()=="No Sabe")
				layantib1.setAlpha((float) 0.3);
		   
			arg0.post(new Runnable() 
			 { 
				@Override public void run()
			 { 
					arg1.setFocusableInTouchMode(true);
					arg1.requestFocusFromTouch(); 
					arg1.requestFocus();
					
					} 
				}); 
			
			
	} 
		
	 

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		SelectorFecha s=new SelectorFecha();
		if(arg0.getId()==R.id.ImageButton01v)
		{
		  s.InsertFecha(fechainicio, rootView);
		 
		}
		if(arg0.getId()==R.id.boton3)
		{
		  s.InsertFecha(fecha1_1ra, rootView);
		}
		if(arg0.getId()==R.id.boton1abm)
		{
		  s.InsertFecha(fecha1_2da, rootView);
		}
		if(arg0.getId()==R.id.boton4)
		{
		  s.InsertFecha(fecha2_1ra, rootView);
		}
		if(arg0.getId()==R.id.boton6)
		{
		  s.InsertFecha(fecha2_2da, rootView);
		}
		if(arg0.getId()==R.id.boton5)
		{
		  s.InsertFecha(fecha3_1ra, rootView);
		}
		if(arg0.getId()==R.id.Iboton2)
		{
		  s.InsertFecha(fecha3_2da, rootView);
		}
		 arg0.requestFocusFromTouch();
		s=null;
	}

	
	public void CreateVars()
	{
		Antibioticos A1=new Antibioticos(ida1, "0", ultdias.isChecked(), String.valueOf(sviaadmin.getSelectedItem()), antib1.getText().toString(), fecha1_1ra.getText().toString(), fecha1_2da.getText().toString());
		Antibioticos A2=new Antibioticos(ida2, "0", ultdias.isChecked(),  String.valueOf(sviaadmin.getSelectedItem()), antib2.getText().toString(), fecha2_1ra.getText().toString(), fecha2_2da.getText().toString());
		Antibioticos A3=new Antibioticos(ida3, "0", ultdias.isChecked(),  String.valueOf(sviaadmin.getSelectedItem()), antib3.getText().toString(), fecha3_1ra.getText().toString(), fecha3_2da.getText().toString());
		ants[0]=A1; ants[1]=A2; ants[2]=A3;
		
		ConsumoMedicamentos M1=new ConsumoMedicamentos(id1, "0", ant1.getText().toString(), dias1.getText().toString());
		ConsumoMedicamentos M2=new ConsumoMedicamentos(id2, "0", ant2.getText().toString(), dias2.getText().toString());
		ConsumoMedicamentos M3=new ConsumoMedicamentos(id3, "0", ant3.getText().toString(), dias3.getText().toString());
		med[0]=M1;med[1]=M2;med[2]=M3;
		ER6=new EnfResp006("0", ERasma.isChecked(), ERotraenfpulm.isChecked(), ERinmunodef.isChecked(), ERcard.isChecked(), ERdiab.isChecked(), ERotra1.getText().toString(), ERenfhep.isChecked(), ERenfNeurolg.isChecked(), ERotra2.getText().toString(), ERenfrenal.isChecked(), ERobesidad.isChecked(), ERotra3.getText().toString(),String.valueOf(spersonasdorm.getSelectedItemPosition()), String.valueOf(sconvivientescasa.getSelectedItemPosition()),String.valueOf(sfumadorescasa.getSelectedItemPosition()),String.valueOf(sasistenciacirc.getSelectedItemPosition()),String.valueOf(slactanciamat.getSelectedItemPosition()),String.valueOf(sbajopeso.getSelectedItemPosition()), String.valueOf(smadrevacunada.getSelectedItemPosition()),String.valueOf(sepisodios.getSelectedItemPosition()), String.valueOf(santecedentesrinitis.getSelectedItemPosition()), String.valueOf(sconsumoantib.getSelectedItemPosition()), String.valueOf(soserltamiv.getSelectedItemPosition()),fechainicio.getText().toString());
	}
	
	
	
	 
	

	
	
	
	
	
	

}