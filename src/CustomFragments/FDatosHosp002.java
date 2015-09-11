package CustomFragments;

import java.util.ArrayList;

import sqlite.BDAcceso;
import sqlite.DatosHosp001;
import sqlite.DatosHosp002;
import sqlite.GrupoEdades;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.app.neumocuest.R;

public class FDatosHosp002 extends Fragment {
	
	 View rootView;
	 DatosHosp002 dh2;
	 GrupoEdades gTD;
	 GrupoEdades gTD_I;
	 GrupoEdades gTD_N;
	 GrupoEdades gTD_M;
	 GrupoEdades gTD_B;
	 GrupoEdades gTD_S;
	 GrupoEdades gTD_Ss;
	 GrupoEdades gTD_If;
	 ArrayList<GrupoEdades> lista;
	 
	 EditText TD;
	 EditText TD_M_Num;
	 EditText TD_M_Por;
	 EditText TD_F_Num;
	 EditText TD_F_Por;
	 EditText TD_Observ;
	 EditText TD_Irag;
	 EditText TD_IragPor;
	 EditText TD_NeumbacNum;
	 EditText TD_NeumonbactPor;
	 EditText TD_MeninbactNum;
	 EditText TD_MeninbactPor;
	 EditText TD_BacterNum;
	 EditText TD_BacterPor;
	 EditText TD_SepsisNum;
	 EditText TD_SepsisPor;
	 EditText TD_ShockNum;
	 EditText TD_ShockPor;
	 EditText TD_InfeccNum;
	 EditText TD_InfeccPor;
	 
	 /*Edades*/
	 EditText TD0_5;
	 EditText TD6_11;
	 EditText TD12_23;
	 EditText TD2_4;
	 EditText TD5_9;
	 EditText TD10_14;
	 EditText TD15_18;
	 
	 EditText TD_I_0_5;
	 EditText TD_I_6_11;
	 EditText TD_I_12_23;
	 EditText TD_I_2_4;
	 EditText TD_I_5_9;
	 EditText TD_I_10_14;
	 EditText TD_I_15_18;

	 EditText TD_N_0_5;
	 EditText TD_N_6_11;
	 EditText TD_N_12_23;
	 EditText TD_N_2_4;
	 EditText TD_N_5_9;
	 EditText TD_N_10_14;
	 EditText TD_N_15_18;

	 EditText TD_M_0_5;
	 EditText TD_M_6_11;
	 EditText TD_M_12_23;
	 EditText TD_M_2_4;
	 EditText TD_M_5_9;
	 EditText TD_M_10_14;
	 EditText TD_M_15_18;

	 EditText TD_B_0_5;
	 EditText TD_B_6_11;
	 EditText TD_B_12_23;
	 EditText TD_B_2_4;
	 EditText TD_B_5_9;
	 EditText TD_B_10_14;
	 EditText TD_B_15_18;
	 
	 EditText TD_S_0_5;
	 EditText TD_S_6_11;
	 EditText TD_S_12_23;
	 EditText TD_S_2_4;
	 EditText TD_S_5_9;
	 EditText TD_S_10_14;
	 EditText TD_S_15_18;
	 
	 EditText TD_Ss_0_5;
	 EditText TD_Ss_6_11;
	 EditText TD_Ss_12_23;
	 EditText TD_Ss_2_4;
	 EditText TD_Ss_5_9;
	 EditText TD_Ss_10_14;
	 EditText TD_Ss_15_18;
	 
	 EditText TD_If_0_5;
	 EditText TD_If_6_11;
	 EditText TD_If_12_23;
	 EditText TD_If_2_4;
	 EditText TD_If_5_9;
	 EditText TD_If_10_14;
	 EditText TD_If_15_18;
	 
	 
 	public static FDatosHosp002 newInstance() {
 		FDatosHosp002 frag = new FDatosHosp002();
 		
 		Bundle args = frag.getArguments();
 		if(args == null)
 			args = new Bundle();	  		
 		
 		frag.setArguments(args);
 		
 		return frag;
 	}
 	
 	public static FDatosHosp002 newInstanceArgs(String caso_id) {
 		FDatosHosp002 frag = new FDatosHosp002();
		
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
 	   rootView = inflater.inflate(R.layout.datoshosp002, container,false);	
 	   
 	  TD=(EditText)rootView.findViewById(R.id.EditText17);
 	  	TD_M_Num=(EditText)rootView.findViewById(R.id.EditText12);
 	  	TD_M_Por=(EditText)rootView.findViewById(R.id.EditText16);
 	  	TD_F_Num=(EditText)rootView.findViewById(R.id.EditText13);
 	  	TD_F_Por=(EditText)rootView.findViewById(R.id.EditText15);
 	  	
 	  	TD_Observ=(EditText)rootView.findViewById(R.id.EditText14);
 	  	TD_Irag=(EditText)rootView.findViewById(R.id.EditText24);
 	  	TD_IragPor=(EditText)rootView.findViewById(R.id.EditText25);
 	  	TD_NeumbacNum=(EditText)rootView.findViewById(R.id.EditText43);
 	  	TD_NeumonbactPor=(EditText)rootView.findViewById(R.id.EditText36);
 	  	TD_MeninbactNum=(EditText)rootView.findViewById(R.id.EditText49);
 	  	TD_MeninbactPor=(EditText)rootView.findViewById(R.id.EditText52);
 	  	TD_BacterNum=(EditText)rootView.findViewById(R.id.EditText56);
 	  	TD_BacterPor=(EditText)rootView.findViewById(R.id.EditText58);
 	  	TD_SepsisNum=(EditText)rootView.findViewById(R.id.EditText62);
 	  	TD_SepsisPor=(EditText)rootView.findViewById(R.id.EditText69);
 	  	TD_ShockNum=(EditText)rootView.findViewById(R.id.EditText79);
 	  	TD_ShockPor=(EditText)rootView.findViewById(R.id.EditText72);
 	  	TD_InfeccNum=(EditText)rootView.findViewById(R.id.EditText02);
 	  	TD_InfeccPor=(EditText)rootView.findViewById(R.id.EditText06);
 	  	
 	 //Edaddes
 	  	  TD0_5=(EditText)rootView.findViewById(R.id.EditText20);
 	  	  TD6_11=(EditText)rootView.findViewById(R.id.EditText22);
 	  	  TD12_23=(EditText)rootView.findViewById(R.id.EditText23);
 	  	  TD2_4=(EditText)rootView.findViewById(R.id.EditText34);
 	  	  TD5_9=(EditText)rootView.findViewById(R.id.EditText18);
 	  	  TD10_14=(EditText)rootView.findViewById(R.id.EditText21);
 	  	  TD15_18=(EditText)rootView.findViewById(R.id.EditText19);
 	  	 
 	  	  TD_I_0_5=(EditText)rootView.findViewById(R.id.EditText26);
 	  	  TD_I_6_11=(EditText)rootView.findViewById(R.id.EditText27);
 	  	  TD_I_12_23=(EditText)rootView.findViewById(R.id.EditText29);
 	  	  TD_I_2_4=(EditText)rootView.findViewById(R.id.EditText28);
 	  	  TD_I_5_9=(EditText)rootView.findViewById(R.id.EditText30);
 	  	  TD_I_10_14=(EditText)rootView.findViewById(R.id.EditText31);
 	  	  TD_I_15_18=(EditText)rootView.findViewById(R.id.EditText32);

 	  	  TD_N_0_5=(EditText)rootView.findViewById(R.id.EditText42);
 	  	  TD_N_6_11=(EditText)rootView.findViewById(R.id.EditText41);
 	  	  TD_N_12_23=(EditText)rootView.findViewById(R.id.EditText35);
 	  	  TD_N_2_4=(EditText)rootView.findViewById(R.id.EditText39);
 	  	  TD_N_5_9=(EditText)rootView.findViewById(R.id.EditText38);
 	  	  TD_N_10_14=(EditText)rootView.findViewById(R.id.EditText40);
 	  	  TD_N_15_18=(EditText)rootView.findViewById(R.id.EditText37);

 	  	  TD_M_0_5=(EditText)rootView.findViewById(R.id.EditText48);
 	  	  TD_M_6_11=(EditText)rootView.findViewById(R.id.EditText46);
 	  	  TD_M_12_23=(EditText)rootView.findViewById(R.id.EditText51);
 	  	  TD_M_2_4=(EditText)rootView.findViewById(R.id.EditText50);
 	  	  TD_M_5_9=(EditText)rootView.findViewById(R.id.EditText45);
 	  	  TD_M_10_14=(EditText)rootView.findViewById(R.id.EditText44);
 	  	  TD_M_15_18=(EditText)rootView.findViewById(R.id.EditText47);

 	  	  TD_B_0_5=(EditText)rootView.findViewById(R.id.EditText54);
 	  	  TD_B_6_11=(EditText)rootView.findViewById(R.id.EditText60);
 	  	  TD_B_12_23=(EditText)rootView.findViewById(R.id.EditText53);
 	  	  TD_B_2_4=(EditText)rootView.findViewById(R.id.EditText61);
 	  	  TD_B_5_9=(EditText)rootView.findViewById(R.id.EditText55);
 	  	  TD_B_10_14=(EditText)rootView.findViewById(R.id.EditText57);
 	  	  TD_B_15_18=(EditText)rootView.findViewById(R.id.EditText59);
 	  	 
 	  	  TD_S_0_5=(EditText)rootView.findViewById(R.id.EditText68);
 	  	  TD_S_6_11=(EditText)rootView.findViewById(R.id.EditText66);
 	  	  TD_S_12_23=(EditText)rootView.findViewById(R.id.EditText64);
 	  	  TD_S_2_4=(EditText)rootView.findViewById(R.id.EditText67);
 	  	  TD_S_5_9=(EditText)rootView.findViewById(R.id.EditText65);
 	  	  TD_S_10_14=(EditText)rootView.findViewById(R.id.EditText63);
 	  	  TD_S_15_18=(EditText)rootView.findViewById(R.id.EditText70);
 	  	 
 	  	  TD_Ss_0_5=(EditText)rootView.findViewById(R.id.EditText76);
 	  	  TD_Ss_6_11=(EditText)rootView.findViewById(R.id.EditText74);
 	  	  TD_Ss_12_23=(EditText)rootView.findViewById(R.id.EditText73);
 	  	  TD_Ss_2_4=(EditText)rootView.findViewById(R.id.EditText77);
 	  	  TD_Ss_5_9=(EditText)rootView.findViewById(R.id.EditText78);
 	  	  TD_Ss_10_14=(EditText)rootView.findViewById(R.id.EditText75);
 	  	  TD_Ss_15_18=(EditText)rootView.findViewById(R.id.EditText71);
 	  	 
 	  	  TD_If_0_5=(EditText)rootView.findViewById(R.id.EditText03);
 	  	  TD_If_6_11=(EditText)rootView.findViewById(R.id.EditText08);
 	  	  TD_If_12_23=(EditText)rootView.findViewById(R.id.EditText04);
 	  	  TD_If_2_4=(EditText)rootView.findViewById(R.id.EditText07);
 	  	  TD_If_5_9=(EditText)rootView.findViewById(R.id.EditText09);
 	  	  TD_If_10_14=(EditText)rootView.findViewById(R.id.EditText05);
 	  	  TD_If_15_18=(EditText)rootView.findViewById(R.id.EditText01);
 	  	  
 	  	 if(getArguments().isEmpty()==false)
 	  	   {
 	  		 BDAcceso bd=new BDAcceso(rootView.getContext());
 	    		bd.open();
 	    		DatosHosp002 d1=new DatosHosp002();
 	    		d1=d1.selectDatosHosp002(getArguments().getString("caso_id"), bd.getBD());
 	    		bd.close();
 	  		
 	    	TD.setText(d1.getTD());
 	  		TD_M_Num.setText(d1.getTD_M_Num());
 	  		TD_M_Por.setText(d1.getTD_M_Por());
 	  		TD_F_Num.setText(d1.getTD_F_Num());
 	  		TD_F_Por.setText(d1.getTD_F_Por());
 	  		TD_Observ.setText(d1.getTD_Observ());
 	  		TD_Irag.setText(d1.getTD_Irag());
 	  		TD_IragPor.setText(d1.getTD_IragPor());
 	  		TD_NeumbacNum.setText(d1.getTD_NeumbacNum());
 	  		TD_NeumonbactPor.setText(d1.getTD_NeumonbactPor());
 	  		TD_MeninbactNum.setText(d1.getTD_MeninbactNum());
 	  		TD_MeninbactPor.setText(d1.getTD_MeninbactPor());
 	  		TD_BacterNum.setText(d1.getTD_BacterNum());
 	  		TD_BacterPor.setText(d1.getTD_BacterPor());
 	  		TD_SepsisNum.setText(d1.getTD_SepsisNum());
 	  		TD_SepsisPor.setText(d1.getTD_SepsisPor());
 	  		TD_ShockNum.setText(d1.getTD_ShockNum());
 	  		TD_ShockPor.setText(d1.getTD_ShockPor());
 	  		TD_InfeccNum.setText(d1.getTD_InfeccNum());
 	  		TD_InfeccPor.setText(d1.getTD_InfeccPor());
 	  		
 	  		bd.open();
 	  		GrupoEdades geTD=new GrupoEdades();   	
 	   		geTD=geTD.selectGrupoEdades(getArguments().getString("caso_id"), "TD", bd.getBD());
 	   		TD0_5.setText(geTD.gete0_5m());
 	   		TD6_11.setText(geTD.gete6_11m());
 	   		TD12_23.setText(geTD.gete12_23m());
 	   		TD2_4.setText(geTD.gete2_4a());
 	   		TD5_9.setText(geTD.gete5_9a());
 	   		TD10_14.setText(geTD.gete10_14a());
 	   		TD15_18.setText(geTD.gete15_18a());
 	   		geTD=null;
 	   		
 	   		GrupoEdades geTD_I_=new GrupoEdades();   	
 	   		geTD_I_=geTD_I_.selectGrupoEdades(getArguments().getString("caso_id"), "TD_I", bd.getBD());
 	   		TD_I_0_5.setText(geTD_I_.gete0_5m());
 	   		TD_I_6_11.setText(geTD_I_.gete6_11m());
 	   		TD_I_12_23.setText(geTD_I_.gete12_23m());
 	   		TD_I_2_4.setText(geTD_I_.gete2_4a());
 	   		TD_I_5_9.setText(geTD_I_.gete5_9a());
 	   		TD_I_10_14.setText(geTD_I_.gete10_14a());
 	   		TD_I_15_18.setText(geTD_I_.gete15_18a());
 	   		geTD_I_=null;
 	   		
 	   		GrupoEdades geTD_N_=new GrupoEdades();   	
 	   		geTD_N_=geTD_N_.selectGrupoEdades(getArguments().getString("caso_id"), "TD_N", bd.getBD());
 	   		TD_N_0_5.setText(geTD_N_.gete0_5m());
 	   		TD_N_6_11.setText(geTD_N_.gete6_11m());
 	   		TD_N_12_23.setText(geTD_N_.gete12_23m());
 	   		TD_N_2_4.setText(geTD_N_.gete2_4a());
 	   		TD_N_5_9.setText(geTD_N_.gete5_9a());
 	   		TD_N_10_14.setText(geTD_N_.gete10_14a());
 	   		TD_N_15_18.setText(geTD_N_.gete15_18a());
 	   		geTD_N_=null;
 	   		
 	   		GrupoEdades geTD_M_=new GrupoEdades();   	
 	   		geTD_M_=geTD_M_.selectGrupoEdades(getArguments().getString("caso_id"), "TD_M", bd.getBD());
 	   		TD_M_0_5.setText(geTD_M_.gete0_5m());
 	   		TD_M_6_11.setText(geTD_M_.gete6_11m());
 	   		TD_M_12_23.setText(geTD_M_.gete12_23m());
 	   		TD_M_2_4.setText(geTD_M_.gete2_4a());
 	   		TD_M_5_9.setText(geTD_M_.gete5_9a());
 	   		TD_M_10_14.setText(geTD_M_.gete10_14a());
 	   		TD_M_15_18.setText(geTD_M_.gete15_18a());
 	   		geTD_M_=null;
 	   		
 	   		GrupoEdades geTD_B_=new GrupoEdades();   	
 	   		geTD_B_=geTD_B_.selectGrupoEdades(getArguments().getString("caso_id"), "TD_B", bd.getBD());
 	   		TD_B_0_5.setText(geTD_B_.gete0_5m());
 	   		TD_B_6_11.setText(geTD_B_.gete6_11m());
 	   		TD_B_12_23.setText(geTD_B_.gete12_23m());
 	   		TD_B_2_4.setText(geTD_B_.gete2_4a());
 	   		TD_B_5_9.setText(geTD_B_.gete5_9a());
 	   		TD_B_10_14.setText(geTD_B_.gete10_14a());
 	   		TD_B_15_18.setText(geTD_B_.gete15_18a());
 	   		geTD_B_=null;
 	   		
 	   		GrupoEdades geTD_S_=new GrupoEdades();   	
 	   		geTD_S_=geTD_S_.selectGrupoEdades(getArguments().getString("caso_id"), "TD_S", bd.getBD());
 	   		TD_S_0_5.setText(geTD_S_.gete0_5m());
 	   		TD_S_6_11.setText(geTD_S_.gete6_11m());
 	   		TD_S_12_23.setText(geTD_S_.gete12_23m());
 	   		TD_S_2_4.setText(geTD_S_.gete2_4a());
 	   		TD_S_5_9.setText(geTD_S_.gete5_9a());
 	   		TD_S_10_14.setText(geTD_S_.gete10_14a());
 	   		TD_S_15_18.setText(geTD_S_.gete15_18a());
 	   		geTD_S_=null;
 	   		
 	   		GrupoEdades geTD_Ss_=new GrupoEdades();   	
 	   		geTD_Ss_=geTD_Ss_.selectGrupoEdades(getArguments().getString("caso_id"), "TD_Ss", bd.getBD());
 	   		TD_Ss_0_5.setText(geTD_Ss_.gete0_5m());
 	   		TD_Ss_6_11.setText(geTD_Ss_.gete6_11m());
 	   		TD_Ss_12_23.setText(geTD_Ss_.gete12_23m());
 	   		TD_Ss_2_4.setText(geTD_Ss_.gete2_4a());
 	   		TD_Ss_5_9.setText(geTD_Ss_.gete5_9a());
 	   		TD_Ss_10_14.setText(geTD_Ss_.gete10_14a());
 	   		TD_Ss_15_18.setText(geTD_Ss_.gete15_18a());
 	   		geTD_Ss_=null;
 	   		
 	   		GrupoEdades geTD_If_=new GrupoEdades();   	
 	   		geTD_If_=geTD_If_.selectGrupoEdades(getArguments().getString("caso_id"), "TD_If", bd.getBD());
 	   		TD_If_0_5.setText(geTD_If_.gete0_5m());
 	   		TD_If_6_11.setText(geTD_If_.gete6_11m());
 	   		TD_If_12_23.setText(geTD_If_.gete12_23m());
 	   		TD_If_2_4.setText(geTD_If_.gete2_4a());
 	   		TD_If_5_9.setText(geTD_If_.gete5_9a());
 	   		TD_If_10_14.setText(geTD_If_.gete10_14a());
 	   		TD_If_15_18.setText(geTD_If_.gete15_18a());
 	   		geTD_If_=null;
 	   		
 	   		
 	  		getArguments().clear();

 	  	   }
 	   
 	   return rootView;
 	}
 	
 	
 	public void CreateVars()
  	{
  	  dh2=new DatosHosp002("0", TD.getText().toString(), TD_M_Num.getText().toString(), TD_M_Por.getText().toString(), TD_F_Num.getText().toString(), TD_F_Por.getText().toString(), TD_Observ.getText().toString(), TD_Irag.getText().toString(), TD_IragPor.getText().toString(), TD_NeumbacNum.getText().toString(), TD_NeumonbactPor.getText().toString(), TD_MeninbactNum.getText().toString(), TD_MeninbactPor.getText().toString(), TD_BacterNum.getText().toString(), TD_BacterPor.getText().toString(), TD_SepsisNum.getText().toString(), TD_SepsisPor.getText().toString(), TD_ShockNum.getText().toString(), TD_ShockPor.getText().toString(), TD_InfeccNum.getText().toString(), TD_InfeccPor.getText().toString());
  	  gTD=new GrupoEdades("0","0","TD", TD0_5.getText().toString(), TD6_11.getText().toString(), TD12_23.getText().toString(), TD2_4.getText().toString(), TD5_9.getText().toString(), TD10_14.getText().toString(), TD15_18.getText().toString());
	  gTD_I=new GrupoEdades("0","0","TD_I", TD_I_0_5.getText().toString(), TD_I_6_11.getText().toString(), TD_I_12_23.getText().toString(), TD_I_2_4.getText().toString(), TD_I_5_9.getText().toString(), TD_I_10_14.getText().toString(), TD_I_15_18.getText().toString());
	  gTD_N=new GrupoEdades("0","0","TD_N", TD_N_0_5.getText().toString(), TD_N_6_11.getText().toString(), TD_N_12_23.getText().toString(), TD_N_2_4.getText().toString(), TD_N_5_9.getText().toString(), TD_N_10_14.getText().toString(), TD_N_15_18.getText().toString());
	  gTD_M=new GrupoEdades("0","0","TD_M", TD_M_0_5.getText().toString(), TD_M_6_11.getText().toString(), TD_M_12_23.getText().toString(), TD_M_2_4.getText().toString(), TD_M_5_9.getText().toString(), TD_M_10_14.getText().toString(), TD_M_15_18.getText().toString());
	  gTD_B=new GrupoEdades("0","0","TD_B", TD_B_0_5.getText().toString(), TD_B_6_11.getText().toString(), TD_B_12_23.getText().toString(), TD_B_2_4.getText().toString(), TD_B_5_9.getText().toString(), TD_B_10_14.getText().toString(), TD_B_15_18.getText().toString());
	  gTD_S=new GrupoEdades("0","0","TD_S", TD_S_0_5.getText().toString(), TD_S_6_11.getText().toString(), TD_S_12_23.getText().toString(), TD_S_2_4.getText().toString(), TD_S_5_9.getText().toString(), TD_S_10_14.getText().toString(), TD_S_15_18.getText().toString());
	  gTD_Ss=new GrupoEdades("0","0","TD_Ss", TD_Ss_0_5.getText().toString(), TD_Ss_6_11.getText().toString(), TD_Ss_12_23.getText().toString(), TD_Ss_2_4.getText().toString(), TD_Ss_5_9.getText().toString(), TD_Ss_10_14.getText().toString(), TD_Ss_15_18.getText().toString());
	  gTD_If=new GrupoEdades("0","0","TD_If", TD_If_0_5.getText().toString(), TD_If_6_11.getText().toString(), TD_If_12_23.getText().toString(), TD_If_2_4.getText().toString(), TD_If_5_9.getText().toString(), TD_If_10_14.getText().toString(), TD_If_15_18.getText().toString());
	  
	  lista=new ArrayList<GrupoEdades>();
	  lista.add(gTD); lista.add(gTD_I); lista.add(gTD_N); lista.add(gTD_M); lista.add(gTD_B);
	  lista.add(gTD_S); lista.add(gTD_Ss); lista.add(gTD_If);
	  
  	}
 	   

}
