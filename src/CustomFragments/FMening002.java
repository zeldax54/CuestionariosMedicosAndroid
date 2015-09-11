package CustomFragments;

import sqlite.BDAcceso;
import sqlite.Mening002;

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


public class FMening002 extends Fragment implements OnClickListener,OnCheckedChangeListener {

	Mening002 m002;
	 View rootView;
	
	 CheckBox SospechaEnfNeumInvasiva;
	 CheckBox Bacterminia;
	 CheckBox HemocultivoPositivo;
	 CheckBox FiebreCUnicaManifestacion;
	 CheckBox Sepsis;
	 CheckBox Distermia;
	 EditText temperatura;
	 CheckBox Taquicardia;
	 EditText FrecRespiratoria;
	 CheckBox TaquipneaPEdad;
	 EditText FrecuenciaCardiaca;
	 CheckBox AlteracionesFLeucocitaria;
	 CheckBox PExcesoLeucocitosis;
	 CheckBox Leucopenia;
	 CheckBox M10PFormasInmaduras;
	 CheckBox SepsisSevera;
	 CheckBox ShockSeptico;

	
	
	public static FMening002 newInstance() {
		FMening002 frag = new FMening002();
   		
   		Bundle args = frag.getArguments();
   		if(args == null)
   			args = new Bundle();	
   		
   		
   		frag.setArguments(args);
   		
   		return frag;
   	}
	

	 public static FMening002 newInstanceArgs(String caso_id) {
		 FMening002 frag = new FMening002();
			
			Bundle args = frag.getArguments();
			if(args == null)
				args = new Bundle();
			
			args.putString("caso_id",caso_id);
			frag.setArguments(args);
			
			return frag;
		}
	 
	
	
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	
     rootView = inflater.inflate(R.layout.mening002, container,false);
     
     SospechaEnfNeumInvasiva=(CheckBox)rootView.findViewById(R.id.checkBox1);
     Bacterminia=(CheckBox)rootView.findViewById(R.id.checkBox2);
     HemocultivoPositivo=(CheckBox)rootView.findViewById(R.id.checkBox3);
     FiebreCUnicaManifestacion=(CheckBox)rootView.findViewById(R.id.checkBox4);
     Sepsis=(CheckBox)rootView.findViewById(R.id.checkBox5);
     Distermia=(CheckBox)rootView.findViewById(R.id.checkBox6);
     temperatura=(EditText)rootView.findViewById(R.id.editText1);
     Taquicardia=(CheckBox)rootView.findViewById(R.id.checkBox7);
     FrecRespiratoria=(EditText)rootView.findViewById(R.id.editText2);
     TaquipneaPEdad=(CheckBox)rootView.findViewById(R.id.checkBox9);
     FrecuenciaCardiaca=(EditText)rootView.findViewById(R.id.editText3);
     AlteracionesFLeucocitaria=(CheckBox)rootView.findViewById(R.id.checkBox11);
     PExcesoLeucocitosis=(CheckBox)rootView.findViewById(R.id.checkBox12);
     Leucopenia=(CheckBox)rootView.findViewById(R.id.checkBox13);
     M10PFormasInmaduras=(CheckBox)rootView.findViewById(R.id.checkBox14);
     SepsisSevera=(CheckBox)rootView.findViewById(R.id.checkBox15);
     ShockSeptico=(CheckBox)rootView.findViewById(R.id.checkBox16);
    
     if(getArguments().isEmpty()==false)
     {
    	 Mening002 m2=new Mening002();
    	 BDAcceso bd=new BDAcceso(rootView.getContext());
    	 bd.open();
    	 m2=m2.selectMening002(getArguments().getString("caso_id"), bd.getBD());
    	 bd.close();
    	 SospechaEnfNeumInvasiva.setChecked(m2.getSospechaEnfNeumInvasiva());
    	 Bacterminia.setChecked(m2.getBacterminia());
    	 HemocultivoPositivo.setChecked(m2.getHemocultivoPositivo());
    	 FiebreCUnicaManifestacion.setChecked(m2.getFiebreCUnicaManifestacion());
    	 Sepsis.setChecked(m2.getSepsis());
    	 Distermia.setChecked(m2.getDistermia());
    	 temperatura.setText(m2.gettemperatura());
    	 Taquicardia.setChecked(m2.getTaquicardia());
    	 FrecRespiratoria.setText(m2.getFrecRespiratoria());
    	 TaquipneaPEdad.setChecked(m2.getTaquipneaPEdad());
    	 FrecuenciaCardiaca.setText(m2.getFrecuenciaCardiaca());
    	 AlteracionesFLeucocitaria.setChecked(m2.getAlteracionesFLeucocitaria());
    	 PExcesoLeucocitosis.setChecked(m2.getPExcesoLeucocitosis());
    	 Leucopenia.setChecked(m2.getLeucopenia());
    	 M10PFormasInmaduras.setChecked(m2.getM10PFormasInmaduras());
    	 SepsisSevera.setChecked(m2.getSepsisSevera());
    	 ShockSeptico.setChecked(m2.getShockSeptico());
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
 m002=new Mening002("0",SospechaEnfNeumInvasiva.isChecked(),Bacterminia.isChecked(),HemocultivoPositivo.isChecked(),FiebreCUnicaManifestacion.isChecked(),Sepsis.isChecked(),Distermia.isChecked(),temperatura.getText().toString(),Taquicardia.isChecked(),FrecRespiratoria.getText().toString(),TaquipneaPEdad.isChecked(),FrecuenciaCardiaca.getText().toString(),AlteracionesFLeucocitaria.isChecked(),PExcesoLeucocitosis.isChecked(),Leucopenia.isChecked(),M10PFormasInmaduras.isChecked(),SepsisSevera.isChecked(),ShockSeptico.isChecked());
}
	
	
}
