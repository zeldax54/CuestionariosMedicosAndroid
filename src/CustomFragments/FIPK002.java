package CustomFragments;

import sqlite.BDAcceso;
import sqlite.EIPK001;
import sqlite.EIPK002;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;

import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

public class FIPK002 extends Fragment implements OnClickListener{

	EIPK002 e2;
	View rootView;
	EditText diagnostico;
	EditText fecha;
	CheckBox fiebre;
	CheckBox mialgia;
	CheckBox cefalea;
	CheckBox linfoadenop;
	CheckBox malestarg;
	CheckBox vomitos;
	CheckBox rash;
	CheckBox petequias;
	CheckBox diarreas;
	CheckBox artalgia;
	CheckBox esplenomeg;
	CheckBox anorexia;
	CheckBox ictero;
	CheckBox hepatomeg;
	CheckBox astenia;
	CheckBox escalofrios;
	CheckBox sangramiento;
	CheckBox dolorabd;
	CheckBox aumentovol;
	CheckBox tos;
	CheckBox disnea;
	CheckBox expect;
	CheckBox laringitis;
	CheckBox faringitis;
	CheckBox rinorrea;
	CheckBox otitis;
	CheckBox coquel;
	CheckBox amigdalitis;
	CheckBox laringotraq;
	CheckBox estornudos;
	CheckBox vacunacion;
	CheckBox desorientac;
	CheckBox rigidezn;
	CheckBox convulciones;
	CheckBox perdidaconc;
	CheckBox trastornoscond;
	CheckBox dificultadmarcha;
	CheckBox secreciong;
	CheckBox lesiong;
	CheckBox disuria;
	EditText otros;
	
	ImageButton bfecha;
	 public static FIPK002 newInstanceArgs(String caso_id) {
		 FIPK002 frag = new FIPK002();
			
			Bundle args = frag.getArguments();
			if(args == null)
				args = new Bundle();
			
			args.putString("caso_id",caso_id);
			frag.setArguments(args);
			
			return frag;
		}
	 
	
	  	public static FIPK002 newInstance() {
	  		FIPK002 frag = new FIPK002();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflamos la Vista que se debe mostrar en pantalla.
		 
	     rootView = inflater.inflate(R.layout.eipk002,container,false);
	     bfecha=(ImageButton)rootView.findViewById(R.id.ImageButton01);
	     bfecha.setOnClickListener(this);
	     
	     diagnostico=(EditText)rootView.findViewById(R.id.EditText04);
	     fecha=(EditText)rootView.findViewById(R.id.EditText05);
	     fiebre=(CheckBox)rootView.findViewById(R.id.CheckBox08);
	     mialgia=(CheckBox)rootView.findViewById(R.id.CheckBox01);
	     cefalea=(CheckBox)rootView.findViewById(R.id.CheckBox02);
	     linfoadenop=(CheckBox)rootView.findViewById(R.id.CheckBox03);
	     malestarg=(CheckBox)rootView.findViewById(R.id.CheckBox04);
	     vomitos=(CheckBox)rootView.findViewById(R.id.CheckBox05);
	     rash=(CheckBox)rootView.findViewById(R.id.CheckBox06);
	     petequias=(CheckBox)rootView.findViewById(R.id.CheckBox07);
	     diarreas=(CheckBox)rootView.findViewById(R.id.CheckBox09);
	     artalgia=(CheckBox)rootView.findViewById(R.id.CheckBox10);
	     esplenomeg=(CheckBox)rootView.findViewById(R.id.CheckBox11);
	     anorexia=(CheckBox)rootView.findViewById(R.id.CheckBox12);
	     ictero=(CheckBox)rootView.findViewById(R.id.CheckBox13);
	     hepatomeg=(CheckBox)rootView.findViewById(R.id.CheckBox14);
	     astenia=(CheckBox)rootView.findViewById(R.id.CheckBox15);
	     escalofrios=(CheckBox)rootView.findViewById(R.id.CheckBox16);
	     sangramiento=(CheckBox)rootView.findViewById(R.id.CheckBox17);
	     dolorabd=(CheckBox)rootView.findViewById(R.id.CheckBox18);
	     aumentovol=(CheckBox)rootView.findViewById(R.id.CheckBox19);
	   
	     tos=(CheckBox)rootView.findViewById(R.id.CheckBox20);
	     disnea=(CheckBox)rootView.findViewById(R.id.CheckBox21);
	     expect=(CheckBox)rootView.findViewById(R.id.CheckBox22);
	     laringitis=(CheckBox)rootView.findViewById(R.id.CheckBox23);
	     faringitis=(CheckBox)rootView.findViewById(R.id.CheckBox24);
	     rinorrea=(CheckBox)rootView.findViewById(R.id.CheckBox25);
	     otitis=(CheckBox)rootView.findViewById(R.id.CheckBox26);
	     coquel=(CheckBox)rootView.findViewById(R.id.CheckBox27);
	     amigdalitis=(CheckBox)rootView.findViewById(R.id.CheckBox28);
	     laringotraq=(CheckBox)rootView.findViewById(R.id.CheckBox29);
	     estornudos=(CheckBox)rootView.findViewById(R.id.CheckBox30);
	     vacunacion=(CheckBox)rootView.findViewById(R.id.CheckBox31);
	    
	     desorientac=(CheckBox)rootView.findViewById(R.id.CheckBox32);
	     rigidezn=(CheckBox)rootView.findViewById(R.id.CheckBox33);
	     convulciones=(CheckBox)rootView.findViewById(R.id.CheckBox34);
	     perdidaconc=(CheckBox)rootView.findViewById(R.id.CheckBox35);
	     trastornoscond=(CheckBox)rootView.findViewById(R.id.CheckBox36);
	     dificultadmarcha=(CheckBox)rootView.findViewById(R.id.CheckBox37);
	     
	     secreciong=(CheckBox)rootView.findViewById(R.id.CheckBox38);
	     lesiong=(CheckBox)rootView.findViewById(R.id.CheckBox39);
	     disuria=(CheckBox)rootView.findViewById(R.id.CheckBox40);
	     otros=(EditText)rootView.findViewById(R.id.EditText01);
	     if(getArguments().isEmpty()==false)
	     {
	    	 BDAcceso bd=new BDAcceso(rootView.getContext());
	 			EIPK002 ee2=new EIPK002();
	 			bd.open();
	 			ee2=ee2.selectEIPK002(getArguments().getString("caso_id"), bd.getBD());
	 			bd.close();
	 		 diagnostico.setText(ee2.getdiagnostico());
	    	 fecha.setText(ee2.getfecha());
	    	 fiebre.setChecked(ee2.getfiebre());
	    	 mialgia.setChecked(ee2.getmialgia());
	    	 cefalea.setChecked(ee2.getcefalea());
	    	 linfoadenop.setChecked(ee2.getlinfoadenop());
	    	 malestarg.setChecked(ee2.getmalestarg());
	    	 vomitos.setChecked(ee2.getvomitos());
	    	 rash.setChecked(ee2.getrash());
	    	 petequias.setChecked(ee2.getpetequias());
	    	 diarreas.setChecked(ee2.getdiarreas());
	    	 artalgia.setChecked(ee2.getartalgia());
	    	 esplenomeg.setChecked(ee2.getesplenomeg());
	    	 anorexia.setChecked(ee2.getanorexia());
	    	 ictero.setChecked(ee2.getictero());
	    	 hepatomeg.setChecked(ee2.gethepatomeg());
	    	 astenia.setChecked(ee2.getastenia());
	    	 escalofrios.setChecked(ee2.getescalofrios());
	    	 sangramiento.setChecked(ee2.getsangramiento());
	    	 dolorabd.setChecked(ee2.getdolorabd());
	    	 aumentovol.setChecked(ee2.getaumentovol());
	    	 tos.setChecked(ee2.gettos());
	    	 disnea.setChecked(ee2.getdisnea());
	    	 expect.setChecked(ee2.getexpect());
	    	 laringitis.setChecked(ee2.getlaringitis());
	    	 faringitis.setChecked(ee2.getfaringitis());
	    	 rinorrea.setChecked(ee2.getrinorrea());
	    	 otitis.setChecked(ee2.getotitis());
	    	 coquel.setChecked(ee2.getcoquel());
	    	 amigdalitis.setChecked(ee2.getamigdalitis());
	    	 laringotraq.setChecked(ee2.getlaringotraq());
	    	 estornudos.setChecked(ee2.getestornudos());
	    	 vacunacion.setChecked(ee2.getvacunacion());
	    	 desorientac.setChecked(ee2.getdesorientac());
	    	 rigidezn.setChecked(ee2.getrigidezn());
	    	 convulciones.setChecked(ee2.getconvulciones());
	    	 perdidaconc.setChecked(ee2.getperdidaconc());
	    	 trastornoscond.setChecked(ee2.gettrastornoscond());
	    	 dificultadmarcha.setChecked(ee2.getdificultadmarcha());
	    	 secreciong.setChecked(ee2.getsecreciong());
	    	 lesiong.setChecked(ee2.getlesiong());
	    	 disuria.setChecked(ee2.getdisuria());
	    	 otros.setText(ee2.getotros());
	     }
	     
	    

	     return rootView;
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.ImageButton01)
		{
			SelectorFecha s=new SelectorFecha();
			s.InsertFecha(fecha, rootView);
			s=null;
		}
		
	
		
	}
	public void CreateVars()
	{
	e2=new EIPK002("0", diagnostico.getText().toString(),fecha.getText().toString(), fiebre.isChecked(), mialgia.isChecked(), cefalea.isChecked(), linfoadenop.isChecked(), malestarg.isChecked(), vomitos.isChecked(), rash.isChecked(), petequias.isChecked(), diarreas.isChecked(), artalgia.isChecked(), esplenomeg.isChecked(), anorexia.isChecked(), ictero.isChecked(), hepatomeg.isChecked(), astenia.isChecked(), escalofrios.isChecked(), sangramiento.isChecked(), dolorabd.isChecked(), aumentovol.isChecked(), tos.isChecked(), disnea.isChecked(), expect.isChecked(), laringitis.isChecked(), faringitis.isChecked(), rinorrea.isChecked(), otitis.isChecked(), coquel.isChecked(), amigdalitis.isChecked(), laringotraq.isChecked(), estornudos.isChecked(), vacunacion.isChecked(), desorientac.isChecked(), rigidezn.isChecked(), convulciones.isChecked(), perdidaconc.isChecked(), trastornoscond.isChecked(), dificultadmarcha.isChecked(), secreciong.isChecked(), lesiong.isChecked(), disuria.isChecked(), otros.getText().toString());
	}
	
	
}

