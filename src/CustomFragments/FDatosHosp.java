package CustomFragments;

import sqlite.BDAcceso;
import sqlite.DatosHospC;
import sqlite.GrupoEdades;

import com.app.neumocuest.DatosHosp;
import com.app.neumocuest.R;
import com.app.neumocuest.SelectorFecha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

public class FDatosHosp extends Fragment implements OnClickListener{
	
	 View rootView;
	 DatosHospC dh;
	 GrupoEdades gTA;
	 GrupoEdades gTH;
	 GrupoEdades gTH_I;
	 GrupoEdades gTH_N;
	 GrupoEdades gTH_M;
	 GrupoEdades gTH_B;
	 GrupoEdades gTH_O;
	 GrupoEdades gTH_If;
	 
	 
   	public static FDatosHosp newInstance() {
   		FDatosHosp frag = new FDatosHosp();
   		
   		Bundle args = frag.getArguments();
   		if(args == null)
   			args = new Bundle();	  		
   		
   		frag.setArguments(args);
   		
   		return frag;
   	}
   	
   	public static FDatosHosp newInstanceArgs(String caso_id) {
   		FDatosHosp frag = new FDatosHosp();
		
		Bundle args = frag.getArguments();
		if(args == null)
			args = new Bundle();	
		
		args.putString("caso_id", caso_id);
		frag.setArguments(args);
		
		return frag;
	}
   	
ImageButton fecha;


EditText Semanaepid;
EditText Fecha;
EditText NombreHosp;
EditText TA;
EditText TA_M_Num;
EditText TA_M_Por;
EditText TA_F_Num;
EditText TA_F_Por;
EditText TA_Observ;
EditText TH;
EditText TH_M_Num;
EditText TH_M_Por;
EditText TH_F_Num;
EditText TH_F_Por;
EditText TH_Observ;
EditText TH_IragNum;
EditText TH_IragPor;
EditText TH_NeumbactNum;
EditText TH_NeumbacPor;
EditText TH_MeninNum;
EditText TH_MeninPor;
EditText TH_BacterNum;
EditText TH_BacterPor;
EditText TH_OtitisNum;
EditText TH_OtitisPor;
EditText TH_InfeccionNum;
EditText TH_InfeccionPor;
//Edades
EditText TA0_5;
EditText TA6_11;
EditText TA12_23;
EditText TA2_4;
EditText TA5_9;
EditText TA10_14;
EditText TA15_18;

EditText TH0_5;
EditText TH6_11;
EditText TH12_23;
EditText TH2_4;
EditText TH5_9;
EditText TH10_14;
EditText TH15_18;
///TH
EditText TH_I_0_5;
EditText TH_I_6_11;
EditText TH_I_12_23;
EditText TH_I_2_4;
EditText TH_I_5_9;
EditText TH_I_10_14;
EditText TH_I_15_18;

EditText TH_N_0_5;
EditText TH_N_6_11;
EditText TH_N_12_23;
EditText TH_N_2_4;
EditText TH_N_5_9;
EditText TH_N_10_14;
EditText TH_N_15_18;

EditText TH_M_0_5;
EditText TH_M_6_11;
EditText TH_M_12_23;
EditText TH_M_2_4;
EditText TH_M_5_9;
EditText TH_M_10_14;
EditText TH_M_15_18;

EditText TH_B_0_5;
EditText TH_B_6_11;
EditText TH_B_12_23;
EditText TH_B_2_4;
EditText TH_B_5_9;
EditText TH_B_10_14;
EditText TH_B_15_18;

EditText TH_O_0_5;
EditText TH_O_6_11;
EditText TH_O_12_23;
EditText TH_O_2_4;
EditText TH_O_5_9;
EditText TH_O_10_14;
EditText TH_O_15_18;

EditText TH_If_0_5;
EditText TH_If_6_11;
EditText TH_If_12_23;
EditText TH_If_2_4;
EditText TH_If_5_9;
EditText TH_If_10_14;
EditText TH_If_15_18;

 	
   	@Override
   	public View onCreateView(LayoutInflater inflater, ViewGroup container,
   			Bundle savedInstanceState) {
   	   rootView = inflater.inflate(R.layout.datoshosp, container,false);	
   	Semanaepid=(EditText)rootView.findViewById(R.id.editText2);
   	fecha=(ImageButton)rootView.findViewById(R.id.ImageButton04);
    fecha.setOnClickListener(this);
   	
   	Fecha=(EditText)rootView.findViewById(R.id.EditText04);
   	NombreHosp=(EditText)rootView.findViewById(R.id.editText5);
   	TA=(EditText)rootView.findViewById(R.id.editText1);
   	TA_M_Num=(EditText)rootView.findViewById(R.id.EditText01);
   	TA_M_Por=(EditText)rootView.findViewById(R.id.EditText03);
   	TA_F_Num=(EditText)rootView.findViewById(R.id.EditText02);
   	TA_F_Por=(EditText)rootView.findViewById(R.id.EditText05);
   	TA_Observ=(EditText)rootView.findViewById(R.id.editText3);
   	TH=(EditText)rootView.findViewById(R.id.EditText17);
   	TH_M_Num=(EditText)rootView.findViewById(R.id.EditText12);
   	TH_M_Por=(EditText)rootView.findViewById(R.id.EditText16);
   	TH_F_Num=(EditText)rootView.findViewById(R.id.EditText13);
   	TH_F_Por=(EditText)rootView.findViewById(R.id.EditText15);
   	TH_Observ=(EditText)rootView.findViewById(R.id.EditText14);
   	TH_IragNum=(EditText)rootView.findViewById(R.id.EditText24);
   	TH_IragPor=(EditText)rootView.findViewById(R.id.EditText25);
   	TH_NeumbactNum=(EditText)rootView.findViewById(R.id.EditText43);
   	TH_NeumbacPor=(EditText)rootView.findViewById(R.id.EditText36);
   	TH_MeninNum=(EditText)rootView.findViewById(R.id.EditText49);
   	TH_MeninPor=(EditText)rootView.findViewById(R.id.EditText52);
   	TH_BacterNum=(EditText)rootView.findViewById(R.id.EditText56);
   	TH_BacterPor=(EditText)rootView.findViewById(R.id.EditText58);
   	TH_OtitisNum=(EditText)rootView.findViewById(R.id.EditText62);
   	TH_OtitisPor=(EditText)rootView.findViewById(R.id.EditText69);
   	TH_InfeccionNum=(EditText)rootView.findViewById(R.id.EditText79);
   	TH_InfeccionPor=(EditText)rootView.findViewById(R.id.EditText72);
   	
   	 TA0_5=(EditText)rootView.findViewById(R.id.EditText06);
   	 TA6_11=(EditText)rootView.findViewById(R.id.EditText07);
   	 TA12_23=(EditText)rootView.findViewById(R.id.EditText08);
   	 TA2_4=(EditText)rootView.findViewById(R.id.EditText33);
   	 TA5_9=(EditText)rootView.findViewById(R.id.EditText09);
   	 TA10_14=(EditText)rootView.findViewById(R.id.EditText10);
   	 TA15_18=(EditText)rootView.findViewById(R.id.EditText11);
   	
   	 TH0_5=(EditText)rootView.findViewById(R.id.EditText20);
   	 TH6_11=(EditText)rootView.findViewById(R.id.EditText22);
   	 TH12_23=(EditText)rootView.findViewById(R.id.EditText23);
   	 TH2_4=(EditText)rootView.findViewById(R.id.EditText34);
   	 TH5_9=(EditText)rootView.findViewById(R.id.EditText18);
   	 TH10_14=(EditText)rootView.findViewById(R.id.EditText21);
   	 TH15_18=(EditText)rootView.findViewById(R.id.EditText19);
   	 
   	 //Edades TH
   	 
   	 TH_I_0_5=(EditText)rootView.findViewById(R.id.EditText26);
   	 TH_I_6_11=(EditText)rootView.findViewById(R.id.EditText27);
   	 TH_I_12_23=(EditText)rootView.findViewById(R.id.EditText29);
   	 TH_I_2_4=(EditText)rootView.findViewById(R.id.EditText28);
   	 TH_I_5_9=(EditText)rootView.findViewById(R.id.EditText30);
   	 TH_I_10_14=(EditText)rootView.findViewById(R.id.EditText31);
   	 TH_I_15_18=(EditText)rootView.findViewById(R.id.EditText32);

   	 TH_N_0_5=(EditText)rootView.findViewById(R.id.EditText42);
   	 TH_N_6_11=(EditText)rootView.findViewById(R.id.EditText41);
   	 TH_N_12_23=(EditText)rootView.findViewById(R.id.EditText35);
   	 TH_N_2_4=(EditText)rootView.findViewById(R.id.EditText39);
   	 TH_N_5_9=(EditText)rootView.findViewById(R.id.EditText38);
   	 TH_N_10_14=(EditText)rootView.findViewById(R.id.EditText40);
   	 TH_N_15_18=(EditText)rootView.findViewById(R.id.EditText37);

   	 TH_M_0_5=(EditText)rootView.findViewById(R.id.EditText48);
   	 TH_M_6_11=(EditText)rootView.findViewById(R.id.EditText46);
   	 TH_M_12_23=(EditText)rootView.findViewById(R.id.EditText51);
   	 TH_M_2_4=(EditText)rootView.findViewById(R.id.EditText50);
   	 TH_M_5_9=(EditText)rootView.findViewById(R.id.EditText45);
   	 TH_M_10_14=(EditText)rootView.findViewById(R.id.EditText44);
   	 TH_M_15_18=(EditText)rootView.findViewById(R.id.EditText47);

   	 TH_B_0_5=(EditText)rootView.findViewById(R.id.EditText54);
   	 TH_B_6_11=(EditText)rootView.findViewById(R.id.EditText60);
   	 TH_B_12_23=(EditText)rootView.findViewById(R.id.EditText53);
   	 TH_B_2_4=(EditText)rootView.findViewById(R.id.EditText61);
   	 TH_B_5_9=(EditText)rootView.findViewById(R.id.EditText55);
   	 TH_B_10_14=(EditText)rootView.findViewById(R.id.EditText57);
   	 TH_B_15_18=(EditText)rootView.findViewById(R.id.EditText59);

   	 TH_O_0_5=(EditText)rootView.findViewById(R.id.EditText68);
   	 TH_O_6_11=(EditText)rootView.findViewById(R.id.EditText66);
   	 TH_O_12_23=(EditText)rootView.findViewById(R.id.EditText64);
   	 TH_O_2_4=(EditText)rootView.findViewById(R.id.EditText67);
   	 TH_O_5_9=(EditText)rootView.findViewById(R.id.EditText65);
   	 TH_O_10_14=(EditText)rootView.findViewById(R.id.EditText63);
   	 TH_O_15_18=(EditText)rootView.findViewById(R.id.EditText70);

   	 TH_If_0_5=(EditText)rootView.findViewById(R.id.EditText76);
   	 TH_If_6_11=(EditText)rootView.findViewById(R.id.EditText74);
   	 TH_If_12_23=(EditText)rootView.findViewById(R.id.EditText73);
   	 TH_If_2_4=(EditText)rootView.findViewById(R.id.EditText77);
   	 TH_If_5_9=(EditText)rootView.findViewById(R.id.EditText78);
   	 TH_If_10_14=(EditText)rootView.findViewById(R.id.EditText75);
   	 TH_If_15_18=(EditText)rootView.findViewById(R.id.EditText71);
   	 
   	 if(getArguments().isEmpty()==false)
   	 {
   		BDAcceso bd=new BDAcceso(rootView.getContext());
   		bd.open();
   		DatosHospC ddh=new DatosHospC();
   		ddh=ddh.selectDatosHosp(getArguments().getString("caso_id"), bd.getBD());
   		bd.close();
   		Semanaepid.setText(ddh.getSemanaepid());
   		Fecha.setText(ddh.getFecha());
   		NombreHosp.setText(ddh.getNombreHosp());
   		TA.setText(ddh.getTA());
   		TA_M_Num.setText(ddh.getTA_M_Num());
   		TA_M_Por.setText(ddh.getTA_M_Por());
   		TA_F_Num.setText(ddh.getTA_F_Num());
   		TA_F_Por.setText(ddh.getTA_F_Por());
   		TA_Observ.setText(ddh.getTA_Observ());
   		TH.setText(ddh.getTH());
   		TH_M_Num.setText(ddh.getTH_M_Num());
   		TH_M_Por.setText(ddh.getTH_M_Por());
   		TH_F_Num.setText(ddh.getTH_F_Num());
   		TH_F_Por.setText(ddh.getTH_F_Por());
   		TH_Observ.setText(ddh.getTH_Observ());
   		TH_IragNum.setText(ddh.getTH_IragNum());
   		TH_IragPor.setText(ddh.getTH_IragPor());
   		TH_NeumbactNum.setText(ddh.getTH_NeumbactNum());
   		TH_NeumbacPor.setText(ddh.getTH_NeumbacPor());
   		TH_MeninNum.setText(ddh.getTH_MeninNum());
   		TH_MeninPor.setText(ddh.getTH_MeninPor());
   		TH_BacterNum.setText(ddh.getTH_BacterNum());
   		TH_BacterPor.setText(ddh.getTH_BacterPor());
   		TH_OtitisNum.setText(ddh.getTH_OtitisNum());
   		TH_OtitisPor.setText(ddh.getTH_OtitisPor());
   		TH_InfeccionNum.setText(ddh.getTH_InfeccionNum());
   		TH_InfeccionPor.setText(ddh.getTH_InfeccionPor());
   		
   		GrupoEdades geTA=new GrupoEdades();
   		bd.open();
   		geTA=geTA.selectGrupoEdades(getArguments().getString("caso_id"), "TA", bd.getBD());
   		TA0_5.setText(geTA.gete0_5m());
   		TA6_11.setText(geTA.gete6_11m());
   		TA12_23.setText(geTA.gete12_23m());
   		TA2_4.setText(geTA.gete2_4a());
   		TA5_9.setText(geTA.gete5_9a());
   		TA10_14.setText(geTA.gete10_14a());
   		TA15_18.setText(geTA.gete15_18a());
   		
   		GrupoEdades geTH=new GrupoEdades();
   		geTH=geTH.selectGrupoEdades(getArguments().getString("caso_id"), "TH", bd.getBD());
   		TH0_5.setText(geTH.gete0_5m());
   		TH6_11.setText(geTH.gete6_11m());
   		TH12_23.setText(geTH.gete12_23m());
   		TH2_4.setText(geTH.gete2_4a());
   		TH5_9.setText(geTH.gete5_9a());
   		TH10_14.setText(geTH.gete10_14a());
   		TH15_18.setText(geTH.gete15_18a());
   		
   		GrupoEdades geTH_I=new GrupoEdades();
   		geTH_I=geTH_I.selectGrupoEdades(getArguments().getString("caso_id"), "TH_I", bd.getBD());
   		TH_I_0_5.setText(geTH_I.gete0_5m());
   		TH_I_6_11.setText(geTH_I.gete6_11m());
   		TH_I_12_23.setText(geTH_I.gete12_23m());
   		TH_I_2_4.setText(geTH_I.gete2_4a());
   		TH_I_5_9.setText(geTH_I.gete5_9a());
   		TH_I_10_14.setText(geTH_I.gete10_14a());
   		TH_I_15_18.setText(geTH_I.gete15_18a());
   		
   		GrupoEdades geTH_N=new GrupoEdades();
   		geTH_N=geTH_N.selectGrupoEdades(getArguments().getString("caso_id"), "TH_N", bd.getBD());
   		TH_N_0_5.setText(geTH_N.gete0_5m());
   		TH_N_6_11.setText(geTH_N.gete6_11m());
   		TH_N_12_23.setText(geTH_N.gete12_23m());
   		TH_N_2_4.setText(geTH_N.gete2_4a());
   		TH_N_5_9.setText(geTH_N.gete5_9a());
   		TH_N_10_14.setText(geTH_N.gete10_14a());
   		TH_N_15_18.setText(geTH_N.gete15_18a());
   		
   		GrupoEdades geTH_M=new GrupoEdades();
   		geTH_M=geTH_M.selectGrupoEdades(getArguments().getString("caso_id"), "TH_M", bd.getBD());
   		TH_M_0_5.setText(geTH_M.gete0_5m());
   		TH_M_6_11.setText(geTH_M.gete6_11m());
   		TH_M_12_23.setText(geTH_M.gete12_23m());
   		TH_M_2_4.setText(geTH_M.gete2_4a());
   		TH_M_5_9.setText(geTH_M.gete5_9a());
   		TH_M_10_14.setText(geTH_M.gete10_14a());
   		TH_M_15_18.setText(geTH_M.gete15_18a());
   		
   		GrupoEdades geTH_B=new GrupoEdades();
   		geTH_B=geTH_B.selectGrupoEdades(getArguments().getString("caso_id"), "TH_B", bd.getBD());
   		TH_B_0_5.setText(geTH_B.gete0_5m());
   		TH_B_6_11.setText(geTH_B.gete6_11m());
   		TH_B_12_23.setText(geTH_B.gete12_23m());
   		TH_B_2_4.setText(geTH_B.gete2_4a());
   		TH_B_5_9.setText(geTH_B.gete5_9a());
   		TH_B_10_14.setText(geTH_B.gete10_14a());
   		TH_B_15_18.setText(geTH_B.gete15_18a());
   		
   		GrupoEdades geTH_O=new GrupoEdades();
   		geTH_O=geTH_O.selectGrupoEdades(getArguments().getString("caso_id"), "TH_O", bd.getBD());
   		TH_O_0_5.setText(geTH_O.gete0_5m());
   		TH_O_6_11.setText(geTH_O.gete6_11m());
   		TH_O_12_23.setText(geTH_O.gete12_23m());
   		TH_O_2_4.setText(geTH_O.gete2_4a());
   		TH_O_5_9.setText(geTH_O.gete5_9a());
   		TH_O_10_14.setText(geTH_O.gete10_14a());
   		TH_O_15_18.setText(geTH_O.gete15_18a());
   		
   		GrupoEdades geTH_If=new GrupoEdades();
   		geTH_If=geTH_If.selectGrupoEdades(getArguments().getString("caso_id"), "TH_If", bd.getBD());
   		TH_If_0_5.setText(geTH_If.gete0_5m());
   		TH_If_6_11.setText(geTH_If.gete6_11m());
   		TH_If_12_23.setText(geTH_If.gete12_23m());
   		TH_If_2_4.setText(geTH_If.gete2_4a());
   		TH_If_5_9.setText(geTH_If.gete5_9a());
   		TH_If_10_14.setText(geTH_If.gete10_14a());
   		TH_If_15_18.setText(geTH_If.gete15_18a());
   		
   		bd.close();
   	    getArguments().clear();
   	 
   	 }
 
   	 return rootView;
   	}
   	
   	
   	public void CreateVars(String idcuest)
   	{
   	dh=new DatosHospC("0",idcuest, Semanaepid.getText().toString(), Fecha.getText().toString(), NombreHosp.getText().toString(), TA.getText().toString(), TA_M_Num.getText().toString(), TA_M_Por.getText().toString(), TA_F_Num.getText().toString(), TA_F_Por.getText().toString(), TA_Observ.getText().toString(), TH.getText().toString(), TH_M_Num.getText().toString(), TH_M_Por.getText().toString(), TH_F_Num.getText().toString(), TH_F_Por.getText().toString(), TH_Observ.getText().toString(), TH_IragNum.getText().toString(), TH_IragPor.getText().toString(), TH_NeumbactNum.getText().toString(), TH_NeumbacPor.getText().toString(), TH_MeninNum.getText().toString(), TH_MeninPor.getText().toString(), TH_BacterNum.getText().toString(), TH_BacterPor.getText().toString(), TH_OtitisNum.getText().toString(), TH_OtitisPor.getText().toString(), TH_InfeccionNum.getText().toString(), TH_InfeccionPor.getText().toString());
	gTA=new GrupoEdades("0","0","TA", TA0_5.getText().toString(), TA6_11.getText().toString(), TA12_23.getText().toString(), TA2_4.getText().toString(), TA5_9.getText().toString(), TA10_14.getText().toString(), TA15_18.getText().toString());
	gTH=new GrupoEdades("0","0","TH", TH0_5.getText().toString(), TH6_11.getText().toString(), TH12_23.getText().toString(), TH2_4.getText().toString(), TH5_9.getText().toString(), TH10_14.getText().toString(), TH15_18.getText().toString());
	gTH_I=new GrupoEdades("0","0","TH_I", TH_I_0_5.getText().toString(), TH_I_6_11.getText().toString(), TH_I_12_23.getText().toString(), TH_I_2_4.getText().toString(), TH_I_5_9.getText().toString(), TH_I_10_14.getText().toString(), TH_I_15_18.getText().toString());
	gTH_N=new GrupoEdades("0","0","TH_N", TH_N_0_5.getText().toString(), TH_N_6_11.getText().toString(), TH_N_12_23.getText().toString(), TH_N_2_4.getText().toString(), TH_N_5_9.getText().toString(), TH_N_10_14.getText().toString(), TH_N_15_18.getText().toString());
	gTH_M=new GrupoEdades("0","0","TH_M", TH_M_0_5.getText().toString(), TH_M_6_11.getText().toString(), TH_M_12_23.getText().toString(), TH_M_2_4.getText().toString(), TH_M_5_9.getText().toString(), TH_M_10_14.getText().toString(), TH_M_15_18.getText().toString());
	gTH_B=new GrupoEdades("0","0","TH_B", TH_B_0_5.getText().toString(), TH_B_6_11.getText().toString(), TH_B_12_23.getText().toString(), TH_B_2_4.getText().toString(), TH_B_5_9.getText().toString(), TH_B_10_14.getText().toString(), TH_B_15_18.getText().toString());
	gTH_O=new GrupoEdades("0","0","TH_O", TH_O_0_5.getText().toString(), TH_O_6_11.getText().toString(), TH_O_12_23.getText().toString(), TH_O_2_4.getText().toString(), TH_O_5_9.getText().toString(), TH_O_10_14.getText().toString(), TH_O_15_18.getText().toString());
	gTH_If=new GrupoEdades("0","0","TH_If", TH_If_0_5.getText().toString(), TH_If_6_11.getText().toString(), TH_If_12_23.getText().toString(), TH_If_2_4.getText().toString(), TH_If_5_9.getText().toString(), TH_If_10_14.getText().toString(), TH_If_15_18.getText().toString());
   	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.ImageButton04)
		{
			SelectorFecha s=new SelectorFecha();
			s.InsertFecha(Fecha, rootView);
			s=null;
		}
	}
   	
   	
   	
   	

}
