package CustomFragments;

import sqlite.BDAcceso;
import sqlite.EIPK002;
import sqlite.EIPK003;
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

public class FIPK003 extends Fragment implements OnClickListener{

	View rootView;
	EIPK003 e3;
	CheckBox suero;
	CheckBox sangre;
	CheckBox lcr;
	CheckBox humora;
	CheckBox orina;
	CheckBox liquidoa;
	CheckBox garg;
	CheckBox esputo;
	CheckBox heces;
	EditText exudado;
	EditText tejido;
	EditText lamina;
	EditText cepa;
	EditText fechamuestra;
	CheckBox diagnostico;
	CheckBox referencia;
	EditText suero1;
	EditText suero2;
	CheckBox confirmat;
	CheckBox referencia2;
	
	ImageButton bfechacol;
	ImageButton bsuero1;
	ImageButton bsuero2;
	
	
	 public static FIPK003 newInstanceArgs(String caso_id) {
		 FIPK003 frag = new FIPK003();
			
			Bundle args = frag.getArguments();
			if(args == null)
				args = new Bundle();
			
			args.putString("caso_id",caso_id);
			frag.setArguments(args);
			
			return frag;
		}
	 
	
	  	public static FIPK003 newInstance() {
	  		FIPK003 frag = new FIPK003();
	   		
	   		Bundle args = frag.getArguments();
	   		if(args == null)
	   			args = new Bundle();	
	   		
	   		
	   		frag.setArguments(args);
	   		
	   		return frag;
	   	}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflamos la Vista que se debe mostrar en pantalla.
	     rootView = inflater.inflate(R.layout.eipk003,container,false);
	     suero=(CheckBox)rootView.findViewById(R.id.checkBox3);
	     sangre=(CheckBox)rootView.findViewById(R.id.CheckBox01);
	     lcr=(CheckBox)rootView.findViewById(R.id.CheckBox02);
	     humora=(CheckBox)rootView.findViewById(R.id.CheckBox03);
	     orina=(CheckBox)rootView.findViewById(R.id.CheckBox04);
	     liquidoa=(CheckBox)rootView.findViewById(R.id.CheckBox05);
	     garg=(CheckBox)rootView.findViewById(R.id.CheckBox06);
	     esputo=(CheckBox)rootView.findViewById(R.id.CheckBox07);
	     heces=(CheckBox)rootView.findViewById(R.id.CheckBox08);
	     
	     exudado=(EditText)rootView.findViewById(R.id.EditText01);
	     tejido=(EditText)rootView.findViewById(R.id.EditText02);
	     lamina=(EditText)rootView.findViewById(R.id.EditText03);
	     cepa=(EditText)rootView.findViewById(R.id.EditText04);
	     fechamuestra=(EditText)rootView.findViewById(R.id.EditText05);
	     
	     diagnostico=(CheckBox)rootView.findViewById(R.id.CheckBox09);
	     referencia=(CheckBox)rootView.findViewById(R.id.CheckBox10);
	     suero1=(EditText)rootView.findViewById(R.id.EditText06);
	     suero2=(EditText)rootView.findViewById(R.id.EditText07);
	     confirmat=(CheckBox)rootView.findViewById(R.id.CheckBox11);
	     referencia2=(CheckBox)rootView.findViewById(R.id.CheckBox12);
	      
	     bfechacol=(ImageButton)rootView.findViewById(R.id.ImageButton01);
	     bfechacol.setOnClickListener(this);
	 	 bsuero1=(ImageButton)rootView.findViewById(R.id.ImageButton02);
	 	 bsuero1.setOnClickListener(this);
	 	 bsuero2=(ImageButton)rootView.findViewById(R.id.ImageButton03);
	 	 bsuero2.setOnClickListener(this);
	 	 if(getArguments().isEmpty()==false)
	 	 {
	 	 	 BDAcceso bd=new BDAcceso(rootView.getContext());
	 			EIPK003 ee3=new EIPK003();
	 			bd.open();
	 			ee3=ee3.selectEIPK003(getArguments().getString("caso_id"), bd.getBD());
	 			bd.close();
	 		suero.setChecked(ee3.getsuero());
	 		sangre.setChecked(ee3.getsangre());
	 		lcr.setChecked(ee3.getlcr());
	 		humora.setChecked(ee3.gethumora());
	 		orina.setChecked(ee3.getorina());
	 		liquidoa.setChecked(ee3.getliquidoa());
	 		garg.setChecked(ee3.getgarg());
	 		esputo.setChecked(ee3.getesputo());
	 		heces.setChecked(ee3.getheces());
	 		exudado.setText(ee3.getexudado());
	 		tejido.setText(ee3.gettejido());
	 		lamina.setText(ee3.getlamina());
	 		cepa.setText(ee3.getcepa());
	 		fechamuestra.setText(ee3.getfechamuestra());
	 		diagnostico.setChecked(ee3.getdiagnostico());
	 		referencia.setChecked(ee3.getreferencia());
	 		suero1.setText(ee3.getsuero1());
	 		suero2.setText(ee3.getsuero2());
	 		confirmat.setChecked(ee3.getconfirmat());
	 		referencia2.setChecked(ee3.getreferencia2());
	 	 }
	 	
	     

	     return rootView;
	}
	
	public void CreateVars()
	{
	e3=new EIPK003("0", suero.isChecked(), sangre.isChecked(), lcr.isChecked(), humora.isChecked(), orina.isChecked(), liquidoa.isChecked(), garg.isChecked(), esputo.isChecked(), heces.isChecked(), exudado.getText().toString(), tejido.getText().toString(), lamina.getText().toString(), cepa.getText().toString(), fechamuestra.getText().toString(), diagnostico.isChecked(), referencia.isChecked(), suero1.getText().toString(), suero2.getText().toString(), confirmat.isChecked(), referencia2.isChecked());
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		SelectorFecha s=new SelectorFecha();
		if(arg0.getId()==R.id.ImageButton01)
		{
			s.InsertFecha(fechamuestra, rootView);
		}
		if(arg0.getId()==R.id.ImageButton02)
		{
			s.InsertFecha(suero1, rootView);
		}
		if(arg0.getId()==R.id.ImageButton03)
		{
			s.InsertFecha(suero2, rootView);
		}
		s=null;
	}
}

