package CustomFragments;

import sqlite.BDAcceso;
import sqlite.Mening004;

import com.app.neumocuest.R;

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
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class FMening004 extends Fragment implements OnItemSelectedListener,OnClickListener,OnCheckedChangeListener{
	View rootView;
	Mening004 m4;
	CheckBox antecedentes;
	EditText especifique;
	EditText ants;
    
	
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
    

	/*sppinners*/
	
    
    public static FMening004 newInstance() {
    	FMening004 frag = new FMening004();
   		
   		Bundle args = frag.getArguments();
   		if(args == null)
   			args = new Bundle();	  		
   		
   		frag.setArguments(args);
   		
   		return frag;
   	}
    	
    	public static FMening004 newInstanceArgs(String caso_id) {
    		FMening004 frag = new FMening004();
    		
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
   	   rootView = inflater.inflate(R.layout.mening004, container,false);	

   	   /*spinners*/				
		spersonasdorm=(Spinner)rootView.findViewById(R.id.spinner1);
		adaptadorpersonasdorm=new ArrayAdapter<String>(rootView.getContext(),R.drawable.spinner,cadenapersonasdorm);
		
		
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
		/*spinners*/
		
		 antecedentes=(CheckBox)rootView.findViewById(R.id.checkBox1);
		 antecedentes.setOnCheckedChangeListener(this);
		 especifique=(EditText)rootView.findViewById(R.id.editText2);
	     ants=(EditText)rootView.findViewById(R.id.EditText02);
	     especifique.setEnabled(false);
	     ants.setEnabled(false);
	     
	     spersonasdorm.setAdapter(adaptadorpersonasdorm);
		 spersonasdorm.setOnItemSelectedListener(this);
		 if(getArguments().isEmpty()==false)
		 {
			 Mening004 mm4=new Mening004();
			 BDAcceso bd=new BDAcceso(rootView.getContext());
			 bd.open();
			 mm4=mm4.selectMening004(getArguments().getString("caso_id"), bd.getBD());
			 bd.close();
			 antecedentes.setChecked(mm4.getantecedentes());
			 especifique.setText(mm4.getespecifique());
			 spersonasdorm.setSelection(Integer.valueOf(mm4.getFRpersonasdorm()));
			 sconvivientescasa.setSelection(Integer.valueOf(mm4.getFRconvivientes()));
			 sfumadorescasa.setSelection(Integer.valueOf(mm4.getFRfumadores()));
			 sasistenciacirc.setSelection(Integer.valueOf(mm4.getFRasistenciacirc()));
			 slactanciamat.setSelection(Integer.valueOf(mm4.getFRlactancia()));
			 sbajopeso.setSelection(Integer.valueOf(mm4.getFRbajopeso()));
			 smadrevacunada.setSelection(Integer.valueOf(mm4.getFRmadrevac()));
			 sepisodios.setSelection(Integer.valueOf(mm4.getFRepisodiosira()));
			 santecedentesrinitis.setSelection(Integer.valueOf(mm4.getFRantecedentesrinitis()));
			 sconsumoantib.setSelection(Integer.valueOf(mm4.getConsumo()));
			 ants.setText(mm4.getAntibioticos());
			 getArguments().clear();
		 }
		 
   	   return rootView;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, final View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		if(sconsumoantib.getSelectedItemPosition()==1)
		{
		  ants.setEnabled(true);
		 
		}
		else
		{
			ants.setEnabled(false);
			ants.setText("");
		}
		 
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
	
	public void CreateVars()
	{
	m4=new Mening004("0", antecedentes.isChecked(), especifique.getText().toString(),String.valueOf( spersonasdorm.getSelectedItemPosition()),String.valueOf( sconvivientescasa.getSelectedItemPosition()),String.valueOf( sfumadorescasa.getSelectedItemPosition()),String.valueOf( sasistenciacirc.getSelectedItemPosition()),String.valueOf( slactanciamat.getSelectedItemPosition()),String.valueOf( sbajopeso.getSelectedItemPosition()),String.valueOf( smadrevacunada.getSelectedItemPosition()),String.valueOf( sepisodios.getSelectedItemPosition()),String.valueOf( santecedentesrinitis.getSelectedItemPosition()),String.valueOf( sconsumoantib.getSelectedItemPosition()), ants.getText().toString());
	}

	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.checkBox1)
		{
			if(arg1)
			{
				especifique.setEnabled(true);
			}
			else
			{
				especifique.setEnabled(false);
				
			}
		}
	}

}
