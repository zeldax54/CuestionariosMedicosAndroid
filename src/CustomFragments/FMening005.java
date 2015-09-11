package CustomFragments;

import sqlite.BDAcceso;
import sqlite.Mening004;
import sqlite.Mening005;

import com.app.neumocuest.SelectorFecha;
import com.app.neumocuest.R;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
public class FMening005 extends Fragment implements OnClickListener,OnCheckedChangeListener{

	Mening005 m005;
	 View rootView;
	 	
	 CheckBox tmExamenLiquidoCefalorr;
	 CheckBox tmPruebasDirectas;	 
	 EditText tmFechaTomaPruebasDir;
	 ImageButton IBFechaTomaPruebasDir;
	 
	 CheckBox tmCultivo;
	 CheckBox tmSangreHemocult;
	 EditText tmFechaTomaCultivo;
	 ImageButton IBFechaTomaCultivo;
	 
	 CheckBox rExamenDirectoLCR;
	 CheckBox positivolcr;
	 CheckBox rExamenDirectoPetequias;
	 CheckBox positivoPTquias;
	 CheckBox rCultivoLCR;
	 CheckBox positivo_LCR;
	 CheckBox rHemocultivo;
	 CheckBox positHemocult;
	 CheckBox rCultivoPetequias;
	 CheckBox positivoCPetequias;
	 CheckBox rLatex;
	 CheckBox positivoLatex;
	 CheckBox aNM;
	 EditText aNM_serogrupo;
	 EditText aNM_serotipo;
	 EditText aNM_subtipo;
	 EditText aNM_inmunotipo;
	 CheckBox aHinfluenzae;
	 EditText aHinfluenzae_biotipo;
	 EditText aHinfluenzae_subtipo;
	 CheckBox aSPneumoniae;
	 EditText aSPneumoniae_serotipo;
	 EditText aOtra;
	 CheckBox aNinguna;
	 EditText aFechaResultado;
	 
	 EditText Susceptibilidad;
	 EditText Metodo;
	 EditText Fechasuscept;
	 
	 
	 ImageButton IBFechaResultado;
	 ImageButton help;
	 ImageButton fechasus;
	 public static FMening005 newInstance() {
	  		FMening005 frag = new FMening005();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	 
	 public static FMening005 newInstanceArgs(String caso_id) {
 		FMening005 frag = new FMening005();
 		
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
	     rootView = inflater.inflate(R.layout.mening005, container,false);
	    
	     tmExamenLiquidoCefalorr=(CheckBox)rootView.findViewById(R.id.checkBox1);
	     tmPruebasDirectas=(CheckBox)rootView.findViewById(R.id.checkBox2);
	     tmFechaTomaPruebasDir=(EditText)rootView.findViewById(R.id.EditTexfee);
	     IBFechaTomaPruebasDir=(ImageButton)rootView.findViewById(R.id.ImageButtonfe);
	     IBFechaTomaPruebasDir.setOnClickListener(this);
	     
	     tmCultivo=(CheckBox)rootView.findViewById(R.id.checkBox3);
	     tmSangreHemocult=(CheckBox)rootView.findViewById(R.id.checkBox4);
	     tmFechaTomaCultivo=(EditText)rootView.findViewById(R.id.EditTexsh);
	     IBFechaTomaCultivo=(ImageButton)rootView.findViewById(R.id.ImageButtonsh);
	     IBFechaTomaCultivo.setOnClickListener(this);
	     
	     rExamenDirectoLCR=(CheckBox)rootView.findViewById(R.id.checkBox5);
	     positivolcr=(CheckBox)rootView.findViewById(R.id.checkBox6);
	     rExamenDirectoPetequias=(CheckBox)rootView.findViewById(R.id.checkBox7);
	     positivoPTquias=(CheckBox)rootView.findViewById(R.id.checkBox8);
	     rCultivoLCR=(CheckBox)rootView.findViewById(R.id.checkBox9);
	     positivo_LCR=(CheckBox)rootView.findViewById(R.id.checkBox10);
	     rHemocultivo=(CheckBox)rootView.findViewById(R.id.checkBox11);
	     positHemocult=(CheckBox)rootView.findViewById(R.id.checkBox12);
	     rCultivoPetequias=(CheckBox)rootView.findViewById(R.id.checkBox13);
	     positivoCPetequias=(CheckBox)rootView.findViewById(R.id.checkBox14);
	     rLatex=(CheckBox)rootView.findViewById(R.id.checkBox15);
	     positivoLatex=(CheckBox)rootView.findViewById(R.id.checkBox16);
	     aNM=(CheckBox)rootView.findViewById(R.id.checkBox17);
	     aNM_serogrupo=(EditText)rootView.findViewById(R.id.editText1);
	     aNM_serotipo=(EditText)rootView.findViewById(R.id.editText2);
	     aNM_subtipo=(EditText)rootView.findViewById(R.id.editText3);
	     aNM_inmunotipo=(EditText)rootView.findViewById(R.id.editText4);
	     aHinfluenzae=(CheckBox)rootView.findViewById(R.id.checkBox18);
	     aHinfluenzae_biotipo=(EditText)rootView.findViewById(R.id.editText5);
	     aHinfluenzae_subtipo=(EditText)rootView.findViewById(R.id.editText6);
	     aSPneumoniae=(CheckBox)rootView.findViewById(R.id.checkBox19);
	     aSPneumoniae_serotipo=(EditText)rootView.findViewById(R.id.editText7);
	     aOtra=(EditText)rootView.findViewById(R.id.editText8);
	     aNinguna=(CheckBox)rootView.findViewById(R.id.checkBox21);
	     
	     aFechaResultado=(EditText)rootView.findViewById(R.id.EditText01);
	     IBFechaResultado=(ImageButton)rootView.findViewById(R.id.ImageButton01);
	     IBFechaResultado.setOnClickListener(this);     
		  Susceptibilidad=(EditText)rootView.findViewById(R.id.editText9);
		  Metodo=(EditText)rootView.findViewById(R.id.editText13);
		  Fechasuscept=(EditText)rootView.findViewById(R.id.EditText02);
	     
	     help=(ImageButton)rootView.findViewById(R.id.imageButton1);
	     help.setOnClickListener(this);    
	     fechasus=(ImageButton)rootView.findViewById(R.id.ImageButton02);
	     fechasus.setOnClickListener(this);    
	     if(getArguments().isEmpty()==false)
	     {
	    	 Mening005 mm5=new Mening005();
			 BDAcceso bd=new BDAcceso(rootView.getContext());
			 bd.open();
			 mm5=mm5.selectMening005(getArguments().getString("caso_id"), bd.getBD());
			 bd.close();
	    	 tmExamenLiquidoCefalorr.setChecked(mm5.gettmExamenLiquidoCefalorr());
	    	 tmPruebasDirectas.setChecked(mm5.gettmPruebasDirectas());
	    	 tmFechaTomaPruebasDir.setText(mm5.gettmFechaTomaPruebasDir());
	    	 tmCultivo.setChecked(mm5.gettmCultivo());
	    	 tmSangreHemocult.setChecked(mm5.gettmSangreHemocult());
	    	 tmFechaTomaCultivo.setText(mm5.gettmFechaTomaCultivo());
	    	 rExamenDirectoLCR.setChecked(mm5.getrExamenDirectoLCR());
	    	 positivolcr.setChecked(mm5.getpositivolcr());
	    	 rExamenDirectoPetequias.setChecked(mm5.getrExamenDirectoPetequias());
	    	 positivoPTquias.setChecked(mm5.getpositivoPTquias());
	    	 rCultivoLCR.setChecked(mm5.getrCultivoLCR());
	    	 positivo_LCR.setChecked(mm5.getpositivo_LCR());
	    	 rHemocultivo.setChecked(mm5.getrHemocultivo());
	    	 positHemocult.setChecked(mm5.getpositHemocult());
	    	 rCultivoPetequias.setChecked(mm5.getrCultivoPetequias());
	    	 positivoCPetequias.setChecked(mm5.getpositivoCPetequias());
	    	 rLatex.setChecked(mm5.getrLatex());
	    	 positivoLatex.setChecked(mm5.getpositivoLatex());
	    	 aNM.setChecked(mm5.getaNM());
	    	 aNM_serogrupo.setText(mm5.getaNM_serogrupo());
	    	 aNM_serotipo.setText(mm5.getaNM_serotipo());
	    	 aNM_subtipo.setText(mm5.getaNM_subtipo());
	    	 aNM_inmunotipo.setText(mm5.getaNM_inmunotipo());
	    	 aHinfluenzae.setChecked(mm5.getaHinfluenzae());
	    	 aHinfluenzae_biotipo.setText(mm5.getaHinfluenzae_biotipo());
	    	 aHinfluenzae_subtipo.setText(mm5.getaHinfluenzae_subtipo());
	    	 aSPneumoniae.setChecked(mm5.getaSPneumoniae());
	    	 aSPneumoniae_serotipo.setText(mm5.getaSPneumoniae_serotipo());
	    	 aOtra.setText(mm5.getaOtra());
	    	 aNinguna.setChecked(mm5.getaNinguna());
	    	 aFechaResultado.setText(mm5.getaFechaResultado());
	    	 Susceptibilidad.setText(mm5.getSusceptibilidad());
	    	 Metodo.setText(mm5.getMetodo());
	    	 Fechasuscept.setText(mm5.getFechasuscept());
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
			SelectorFecha s=new SelectorFecha();
			
			if(arg0.getId()==R.id.ImageButtonfe)
			{
			  s.InsertFecha(tmFechaTomaPruebasDir, rootView);
			}
			if(arg0.getId()==R.id.ImageButtonsh)
			{
			  s.InsertFecha(tmFechaTomaCultivo, rootView);
			}			
			if(arg0.getId()==R.id.ImageButton01)
			{
			  s.InsertFecha(aFechaResultado, rootView);
			}
			if(arg0.getId()==R.id.ImageButton02)
			{
			  s.InsertFecha(Fechasuscept, rootView);
			}
			
			
			
			if(arg0.getId()==R.id.imageButton1)
			{
				AlertDialog.Builder dialogo1 = new AlertDialog.Builder(rootView.getContext());  
		        dialogo1.setTitle("Conformar Susceptibilidad Antimicrobiana");  
		        dialogo1.setMessage("Susceptibilidades: Sensible:S   Intermedia:I  Resistente:R"+"\n"+"\r"
		        		+ " Para Conformar una susceptibilidad teclar Nombre de Antibiotico:Susceptibilidad Ejemplo:"+"\n"+"\r"
		        		+"Antibiotico1:S"+"\n"+"\r"
		        		+"Antibiotico2:R"+"\n"+"\r"
		        		+"etc"+"\n"+"\r"
		        		+"....................................");            
		        dialogo1.setCancelable(false);  
		        dialogo1.setPositiveButton("Entendido", new DialogInterface.OnClickListener() {  
		            public void onClick(DialogInterface dialogo1, int id) {  
		               dialogo1.dismiss();
		            }  
		        });  
		                 
		        dialogo1.show();   
			}
			
			
			s=null;
		}
	
	  	public void CreateVars()
	  	{
	  	
	  		m005=new Mening005("0",tmExamenLiquidoCefalorr.isChecked(),tmPruebasDirectas.isChecked(),
	  				tmFechaTomaPruebasDir.getText().toString(),tmCultivo.isChecked(),tmSangreHemocult.isChecked(),
	  				tmFechaTomaCultivo.getText().toString(),rExamenDirectoLCR.isChecked(),positivolcr.isChecked(),
	  				rExamenDirectoPetequias.isChecked(),positivoPTquias.isChecked(),rCultivoLCR.isChecked(),
	  				positivo_LCR.isChecked(),rHemocultivo.isChecked(),positHemocult.isChecked(),rCultivoPetequias.isChecked(),
	  				positivoCPetequias.isChecked(),rLatex.isChecked(),positivoLatex.isChecked(),aNM.isChecked(),
	  				aNM_serogrupo.getText().toString(),aNM_serotipo.getText().toString(),aNM_subtipo.getText().toString(),
	  				aNM_inmunotipo.getText().toString(),aHinfluenzae.isChecked(),aHinfluenzae_biotipo.getText().toString(),
	  				aHinfluenzae_subtipo.getText().toString(),aSPneumoniae.isChecked(),aSPneumoniae_serotipo.getText().toString(),
	  				aOtra.getText().toString(),aNinguna.isChecked(),aFechaResultado.getText().toString(),Susceptibilidad.getText().toString(),Metodo.getText().toString(),Fechasuscept.getText().toString());
	  	}
	  	
	  	

}
