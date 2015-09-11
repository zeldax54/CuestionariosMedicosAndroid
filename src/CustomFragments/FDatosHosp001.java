package CustomFragments;

import java.util.ArrayList;

import sqlite.BDAcceso;
import sqlite.DatosHosp001;
import sqlite.DatosHospC;
import sqlite.GrupoEdades;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.app.neumocuest.DatosHosp;
import com.app.neumocuest.R;

public class FDatosHosp001 extends Fragment {
	
	 View rootView;
	 DatosHosp001 dh1;
	 GrupoEdades gTU;
	 GrupoEdades gTU_I;
	 GrupoEdades gTU_N;
	 GrupoEdades gTU_M;
	 GrupoEdades gTU_B;
	 GrupoEdades gTU_S;
	 GrupoEdades gTU_Ss;
	 GrupoEdades gTU_If;
	 ArrayList<GrupoEdades> lista;
	 
	 
	 
	 
	 
	 
	 
	 EditText TU;
	 EditText TU_M_Num;
	 EditText TU_M_Por;
	 EditText TU_F_Num;
	 EditText TU_F_Por;
	 EditText TU_Observ;
	 EditText TU_Irag;
	 EditText TU_IragPor;
	 EditText TU_NeumbacNum;
	 EditText TU_NeumonbactPor;
	 EditText TU_MeninbactNum;
	 EditText TU_MeninbactPor;
	 EditText TU_BacterNum;
	 EditText TU_BacterPor;
	 EditText TU_SepsisNum;
	 EditText TU_SepsisPor;
	 EditText TU_ShockNum;
	 EditText TU_ShockPor;
	 EditText TU_InfeccNum;
	 EditText TU_InfeccPor;
	 
	 /*Edades*/
	 EditText TU0_5;
	 EditText TU6_11;
	 EditText TU12_23;
	 EditText TU2_4;
	 EditText TU5_9;
	 EditText TU10_14;
	 EditText TU15_18;
	 
	 EditText TU_I_0_5;
	 EditText TU_I_6_11;
	 EditText TU_I_12_23;
	 EditText TU_I_2_4;
	 EditText TU_I_5_9;
	 EditText TU_I_10_14;
	 EditText TU_I_15_18;

	 EditText TU_N_0_5;
	 EditText TU_N_6_11;
	 EditText TU_N_12_23;
	 EditText TU_N_2_4;
	 EditText TU_N_5_9;
	 EditText TU_N_10_14;
	 EditText TU_N_15_18;

	 EditText TU_M_0_5;
	 EditText TU_M_6_11;
	 EditText TU_M_12_23;
	 EditText TU_M_2_4;
	 EditText TU_M_5_9;
	 EditText TU_M_10_14;
	 EditText TU_M_15_18;

	 EditText TU_B_0_5;
	 EditText TU_B_6_11;
	 EditText TU_B_12_23;
	 EditText TU_B_2_4;
	 EditText TU_B_5_9;
	 EditText TU_B_10_14;
	 EditText TU_B_15_18;
	 
	 EditText TU_S_0_5;
	 EditText TU_S_6_11;
	 EditText TU_S_12_23;
	 EditText TU_S_2_4;
	 EditText TU_S_5_9;
	 EditText TU_S_10_14;
	 EditText TU_S_15_18;
	 
	 EditText TU_Ss_0_5;
	 EditText TU_Ss_6_11;
	 EditText TU_Ss_12_23;
	 EditText TU_Ss_2_4;
	 EditText TU_Ss_5_9;
	 EditText TU_Ss_10_14;
	 EditText TU_Ss_15_18;
	 
	 EditText TU_If_0_5;
	 EditText TU_If_6_11;
	 EditText TU_If_12_23;
	 EditText TU_If_2_4;
	 EditText TU_If_5_9;
	 EditText TU_If_10_14;
	 EditText TU_If_15_18;

  	public static FDatosHosp001 newInstance() {
  		FDatosHosp001 frag = new FDatosHosp001();
  		
  		Bundle args = frag.getArguments();
  		if(args == null)
  			args = new Bundle();	  		
  		
  		frag.setArguments(args);
  		
  		return frag;
  	}
  	
  	public static FDatosHosp001 newInstanceArgs(String caso_id) {
  		FDatosHosp001 frag = new FDatosHosp001();
		
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
  	   rootView = inflater.inflate(R.layout.datoshosp001, container,false);	
  	 TU=(EditText)rootView.findViewById(R.id.EditText17);
  	TU_M_Num=(EditText)rootView.findViewById(R.id.EditText12);
  	TU_M_Por=(EditText)rootView.findViewById(R.id.EditText16);
  	TU_F_Num=(EditText)rootView.findViewById(R.id.EditText13);
  	TU_F_Por=(EditText)rootView.findViewById(R.id.EditText15);
  	TU_Observ=(EditText)rootView.findViewById(R.id.EditText14);
  	TU_Irag=(EditText)rootView.findViewById(R.id.EditText24);
  	TU_IragPor=(EditText)rootView.findViewById(R.id.EditText25);
  	TU_NeumbacNum=(EditText)rootView.findViewById(R.id.EditText43);
  	TU_NeumonbactPor=(EditText)rootView.findViewById(R.id.EditText36);
  	TU_MeninbactNum=(EditText)rootView.findViewById(R.id.EditText49);
  	TU_MeninbactPor=(EditText)rootView.findViewById(R.id.EditText52);
  	TU_BacterNum=(EditText)rootView.findViewById(R.id.EditText56);
  	TU_BacterPor=(EditText)rootView.findViewById(R.id.EditText58);
  	TU_SepsisNum=(EditText)rootView.findViewById(R.id.EditText62);
  	TU_SepsisPor=(EditText)rootView.findViewById(R.id.EditText69);
  	TU_ShockNum=(EditText)rootView.findViewById(R.id.EditText79);
  	TU_ShockPor=(EditText)rootView.findViewById(R.id.EditText72);
  	TU_InfeccNum=(EditText)rootView.findViewById(R.id.EditText02);
  	TU_InfeccPor=(EditText)rootView.findViewById(R.id.EditText06);
  	
  	//Edaddes
  	  TU0_5=(EditText)rootView.findViewById(R.id.EditText20);
  	  TU6_11=(EditText)rootView.findViewById(R.id.EditText22);
  	  TU12_23=(EditText)rootView.findViewById(R.id.EditText23);
  	  TU2_4=(EditText)rootView.findViewById(R.id.EditText34);
  	  TU5_9=(EditText)rootView.findViewById(R.id.EditText18);
  	  TU10_14=(EditText)rootView.findViewById(R.id.EditText21);
  	  TU15_18=(EditText)rootView.findViewById(R.id.EditText19);
  	 
  	  TU_I_0_5=(EditText)rootView.findViewById(R.id.EditText26);
  	  TU_I_6_11=(EditText)rootView.findViewById(R.id.EditText27);
  	  TU_I_12_23=(EditText)rootView.findViewById(R.id.EditText29);
  	  TU_I_2_4=(EditText)rootView.findViewById(R.id.EditText28);
  	  TU_I_5_9=(EditText)rootView.findViewById(R.id.EditText30);
  	  TU_I_10_14=(EditText)rootView.findViewById(R.id.EditText31);
  	  TU_I_15_18=(EditText)rootView.findViewById(R.id.EditText32);

  	  TU_N_0_5=(EditText)rootView.findViewById(R.id.EditText42);
  	  TU_N_6_11=(EditText)rootView.findViewById(R.id.EditText41);
  	  TU_N_12_23=(EditText)rootView.findViewById(R.id.EditText35);
  	  TU_N_2_4=(EditText)rootView.findViewById(R.id.EditText39);
  	  TU_N_5_9=(EditText)rootView.findViewById(R.id.EditText38);
  	  TU_N_10_14=(EditText)rootView.findViewById(R.id.EditText40);
  	  TU_N_15_18=(EditText)rootView.findViewById(R.id.EditText37);

  	  TU_M_0_5=(EditText)rootView.findViewById(R.id.EditText48);
  	  TU_M_6_11=(EditText)rootView.findViewById(R.id.EditText46);
  	  TU_M_12_23=(EditText)rootView.findViewById(R.id.EditText51);
  	  TU_M_2_4=(EditText)rootView.findViewById(R.id.EditText50);
  	  TU_M_5_9=(EditText)rootView.findViewById(R.id.EditText45);
  	  TU_M_10_14=(EditText)rootView.findViewById(R.id.EditText44);
  	  TU_M_15_18=(EditText)rootView.findViewById(R.id.EditText47);

  	  TU_B_0_5=(EditText)rootView.findViewById(R.id.EditText54);
  	  TU_B_6_11=(EditText)rootView.findViewById(R.id.EditText60);
  	  TU_B_12_23=(EditText)rootView.findViewById(R.id.EditText53);
  	  TU_B_2_4=(EditText)rootView.findViewById(R.id.EditText61);
  	  TU_B_5_9=(EditText)rootView.findViewById(R.id.EditText55);
  	  TU_B_10_14=(EditText)rootView.findViewById(R.id.EditText57);
  	  TU_B_15_18=(EditText)rootView.findViewById(R.id.EditText59);
  	 
  	  TU_S_0_5=(EditText)rootView.findViewById(R.id.EditText68);
  	  TU_S_6_11=(EditText)rootView.findViewById(R.id.EditText66);
  	  TU_S_12_23=(EditText)rootView.findViewById(R.id.EditText64);
  	  TU_S_2_4=(EditText)rootView.findViewById(R.id.EditText67);
  	  TU_S_5_9=(EditText)rootView.findViewById(R.id.EditText65);
  	  TU_S_10_14=(EditText)rootView.findViewById(R.id.EditText63);
  	  TU_S_15_18=(EditText)rootView.findViewById(R.id.EditText70);
  	 
  	  TU_Ss_0_5=(EditText)rootView.findViewById(R.id.EditText76);
  	  TU_Ss_6_11=(EditText)rootView.findViewById(R.id.EditText74);
  	  TU_Ss_12_23=(EditText)rootView.findViewById(R.id.EditText73);
  	  TU_Ss_2_4=(EditText)rootView.findViewById(R.id.EditText77);
  	  TU_Ss_5_9=(EditText)rootView.findViewById(R.id.EditText78);
  	  TU_Ss_10_14=(EditText)rootView.findViewById(R.id.EditText75);
  	  TU_Ss_15_18=(EditText)rootView.findViewById(R.id.EditText71);
  	 
  	  TU_If_0_5=(EditText)rootView.findViewById(R.id.EditText03);
  	  TU_If_6_11=(EditText)rootView.findViewById(R.id.EditText08);
  	  TU_If_12_23=(EditText)rootView.findViewById(R.id.EditText04);
  	  TU_If_2_4=(EditText)rootView.findViewById(R.id.EditText07);
  	  TU_If_5_9=(EditText)rootView.findViewById(R.id.EditText09);
  	  TU_If_10_14=(EditText)rootView.findViewById(R.id.EditText05);
  	  TU_If_15_18=(EditText)rootView.findViewById(R.id.EditText01);

  	   
  	   if(getArguments().isEmpty()==false)
  	   {
  		 BDAcceso bd=new BDAcceso(rootView.getContext());
    		bd.open();
    		DatosHosp001 d1=new DatosHosp001();
    		d1=d1.selectDatosHosp001(getArguments().getString("caso_id"), bd.getBD());
    		bd.close();
  		
    	TU.setText(d1.getTU());
  		TU_M_Num.setText(d1.getTU_M_Num());
  		TU_M_Por.setText(d1.getTU_M_Por());
  		TU_F_Num.setText(d1.getTU_F_Num());
  		TU_F_Por.setText(d1.getTU_F_Por());
  		TU_Observ.setText(d1.getTU_Observ());
  		TU_Irag.setText(d1.getTU_Irag());
  		TU_IragPor.setText(d1.getTU_IragPor());
  		TU_NeumbacNum.setText(d1.getTU_NeumbacNum());
  		TU_NeumonbactPor.setText(d1.getTU_NeumonbactPor());
  		TU_MeninbactNum.setText(d1.getTU_MeninbactNum());
  		TU_MeninbactPor.setText(d1.getTU_MeninbactPor());
  		TU_BacterNum.setText(d1.getTU_BacterNum());
  		TU_BacterPor.setText(d1.getTU_BacterPor());
  		TU_SepsisNum.setText(d1.getTU_SepsisNum());
  		TU_SepsisPor.setText(d1.getTU_SepsisPor());
  		TU_ShockNum.setText(d1.getTU_ShockNum());
  		TU_ShockPor.setText(d1.getTU_ShockPor());
  		TU_InfeccNum.setText(d1.getTU_InfeccNum());
  		TU_InfeccPor.setText(d1.getTU_InfeccPor());
  		
  		bd.open();
  		GrupoEdades geTU=new GrupoEdades();   	
   		geTU=geTU.selectGrupoEdades(getArguments().getString("caso_id"), "TU", bd.getBD());
   		TU0_5.setText(geTU.gete0_5m());
   		TU6_11.setText(geTU.gete6_11m());
   		TU12_23.setText(geTU.gete12_23m());
   		TU2_4.setText(geTU.gete2_4a());
   		TU5_9.setText(geTU.gete5_9a());
   		TU10_14.setText(geTU.gete10_14a());
   		TU15_18.setText(geTU.gete15_18a());
   		geTU=null;
   		
   		GrupoEdades geTU_I_=new GrupoEdades();   	
   		geTU_I_=geTU_I_.selectGrupoEdades(getArguments().getString("caso_id"), "TU_I", bd.getBD());
   		TU_I_0_5.setText(geTU_I_.gete0_5m());
   		TU_I_6_11.setText(geTU_I_.gete6_11m());
   		TU_I_12_23.setText(geTU_I_.gete12_23m());
   		TU_I_2_4.setText(geTU_I_.gete2_4a());
   		TU_I_5_9.setText(geTU_I_.gete5_9a());
   		TU_I_10_14.setText(geTU_I_.gete10_14a());
   		TU_I_15_18.setText(geTU_I_.gete15_18a());
   		geTU_I_=null;
   		
   		GrupoEdades geTU_N_=new GrupoEdades();   	
   		geTU_N_=geTU_N_.selectGrupoEdades(getArguments().getString("caso_id"), "TU_N", bd.getBD());
   		TU_N_0_5.setText(geTU_N_.gete0_5m());
   		TU_N_6_11.setText(geTU_N_.gete6_11m());
   		TU_N_12_23.setText(geTU_N_.gete12_23m());
   		TU_N_2_4.setText(geTU_N_.gete2_4a());
   		TU_N_5_9.setText(geTU_N_.gete5_9a());
   		TU_N_10_14.setText(geTU_N_.gete10_14a());
   		TU_N_15_18.setText(geTU_N_.gete15_18a());
   		geTU_N_=null;
   		
   		GrupoEdades geTU_M_=new GrupoEdades();   	
   		geTU_M_=geTU_M_.selectGrupoEdades(getArguments().getString("caso_id"), "TU_M", bd.getBD());
   		TU_M_0_5.setText(geTU_M_.gete0_5m());
   		TU_M_6_11.setText(geTU_M_.gete6_11m());
   		TU_M_12_23.setText(geTU_M_.gete12_23m());
   		TU_M_2_4.setText(geTU_M_.gete2_4a());
   		TU_M_5_9.setText(geTU_M_.gete5_9a());
   		TU_M_10_14.setText(geTU_M_.gete10_14a());
   		TU_M_15_18.setText(geTU_M_.gete15_18a());
   		geTU_M_=null;
   		
   		GrupoEdades geTU_B_=new GrupoEdades();   	
   		geTU_B_=geTU_B_.selectGrupoEdades(getArguments().getString("caso_id"), "TU_B", bd.getBD());
   		TU_B_0_5.setText(geTU_B_.gete0_5m());
   		TU_B_6_11.setText(geTU_B_.gete6_11m());
   		TU_B_12_23.setText(geTU_B_.gete12_23m());
   		TU_B_2_4.setText(geTU_B_.gete2_4a());
   		TU_B_5_9.setText(geTU_B_.gete5_9a());
   		TU_B_10_14.setText(geTU_B_.gete10_14a());
   		TU_B_15_18.setText(geTU_B_.gete15_18a());
   		geTU_B_=null;
   		
   		GrupoEdades geTU_S_=new GrupoEdades();   	
   		geTU_S_=geTU_S_.selectGrupoEdades(getArguments().getString("caso_id"), "TU_S", bd.getBD());
   		TU_S_0_5.setText(geTU_S_.gete0_5m());
   		TU_S_6_11.setText(geTU_S_.gete6_11m());
   		TU_S_12_23.setText(geTU_S_.gete12_23m());
   		TU_S_2_4.setText(geTU_S_.gete2_4a());
   		TU_S_5_9.setText(geTU_S_.gete5_9a());
   		TU_S_10_14.setText(geTU_S_.gete10_14a());
   		TU_S_15_18.setText(geTU_S_.gete15_18a());
   		geTU_S_=null;
   		
   		GrupoEdades geTU_Ss_=new GrupoEdades();   	
   		geTU_Ss_=geTU_Ss_.selectGrupoEdades(getArguments().getString("caso_id"), "TU_Ss", bd.getBD());
   		TU_Ss_0_5.setText(geTU_Ss_.gete0_5m());
   		TU_Ss_6_11.setText(geTU_Ss_.gete6_11m());
   		TU_Ss_12_23.setText(geTU_Ss_.gete12_23m());
   		TU_Ss_2_4.setText(geTU_Ss_.gete2_4a());
   		TU_Ss_5_9.setText(geTU_Ss_.gete5_9a());
   		TU_Ss_10_14.setText(geTU_Ss_.gete10_14a());
   		TU_Ss_15_18.setText(geTU_Ss_.gete15_18a());
   		geTU_Ss_=null;
   		
   		GrupoEdades geTU_If_=new GrupoEdades();   	
   		geTU_If_=geTU_If_.selectGrupoEdades(getArguments().getString("caso_id"), "TU_If", bd.getBD());
   		TU_If_0_5.setText(geTU_If_.gete0_5m());
   		TU_If_6_11.setText(geTU_If_.gete6_11m());
   		TU_If_12_23.setText(geTU_If_.gete12_23m());
   		TU_If_2_4.setText(geTU_If_.gete2_4a());
   		TU_If_5_9.setText(geTU_If_.gete5_9a());
   		TU_If_10_14.setText(geTU_If_.gete10_14a());
   		TU_If_15_18.setText(geTU_If_.gete15_18a());
   		geTU_If_=null;
   		
   		
  		getArguments().clear();

  	   }
  	   return rootView;
  	}
  	   
  	public void CreateVars()
  	{
  	dh1=new DatosHosp001("0", TU.getText().toString(), TU_M_Num.getText().toString(), TU_M_Por.getText().toString(), TU_F_Num.getText().toString(), TU_F_Por.getText().toString(), TU_Observ.getText().toString(), TU_Irag.getText().toString(), TU_IragPor.getText().toString(), TU_NeumbacNum.getText().toString(), TU_NeumonbactPor.getText().toString(), TU_MeninbactNum.getText().toString(), TU_MeninbactPor.getText().toString(), TU_BacterNum.getText().toString(), TU_BacterPor.getText().toString(), TU_SepsisNum.getText().toString(), TU_SepsisPor.getText().toString(), TU_ShockNum.getText().toString(), TU_ShockPor.getText().toString(), TU_InfeccNum.getText().toString(), TU_InfeccPor.getText().toString());
  	  gTU=new GrupoEdades("0","0","TU", TU0_5.getText().toString(), TU6_11.getText().toString(), TU12_23.getText().toString(), TU2_4.getText().toString(), TU5_9.getText().toString(), TU10_14.getText().toString(), TU15_18.getText().toString());
	  gTU_I=new GrupoEdades("0","0","TU_I", TU_I_0_5.getText().toString(), TU_I_6_11.getText().toString(), TU_I_12_23.getText().toString(), TU_I_2_4.getText().toString(), TU_I_5_9.getText().toString(), TU_I_10_14.getText().toString(), TU_I_15_18.getText().toString());
	  gTU_N=new GrupoEdades("0","0","TU_N", TU_N_0_5.getText().toString(), TU_N_6_11.getText().toString(), TU_N_12_23.getText().toString(), TU_N_2_4.getText().toString(), TU_N_5_9.getText().toString(), TU_N_10_14.getText().toString(), TU_N_15_18.getText().toString());
	  gTU_M=new GrupoEdades("0","0","TU_M", TU_M_0_5.getText().toString(), TU_M_6_11.getText().toString(), TU_M_12_23.getText().toString(), TU_M_2_4.getText().toString(), TU_M_5_9.getText().toString(), TU_M_10_14.getText().toString(), TU_M_15_18.getText().toString());
	  gTU_B=new GrupoEdades("0","0","TU_B", TU_B_0_5.getText().toString(), TU_B_6_11.getText().toString(), TU_B_12_23.getText().toString(), TU_B_2_4.getText().toString(), TU_B_5_9.getText().toString(), TU_B_10_14.getText().toString(), TU_B_15_18.getText().toString());
	  gTU_S=new GrupoEdades("0","0","TU_S", TU_S_0_5.getText().toString(), TU_S_6_11.getText().toString(), TU_S_12_23.getText().toString(), TU_S_2_4.getText().toString(), TU_S_5_9.getText().toString(), TU_S_10_14.getText().toString(), TU_S_15_18.getText().toString());
	  gTU_Ss=new GrupoEdades("0","0","TU_Ss", TU_Ss_0_5.getText().toString(), TU_Ss_6_11.getText().toString(), TU_Ss_12_23.getText().toString(), TU_Ss_2_4.getText().toString(), TU_Ss_5_9.getText().toString(), TU_Ss_10_14.getText().toString(), TU_Ss_15_18.getText().toString());
	  gTU_If=new GrupoEdades("0","0","TU_If", TU_If_0_5.getText().toString(), TU_If_6_11.getText().toString(), TU_If_12_23.getText().toString(), TU_If_2_4.getText().toString(), TU_If_5_9.getText().toString(), TU_If_10_14.getText().toString(), TU_If_15_18.getText().toString());
	  
	  lista=new ArrayList<GrupoEdades>();
	  lista.add(gTU); lista.add(gTU_I); lista.add(gTU_N); lista.add(gTU_M); lista.add(gTU_B);
	  lista.add(gTU_S); lista.add(gTU_Ss); lista.add(gTU_If);
	  
  	}
  	
  	
  	

}
