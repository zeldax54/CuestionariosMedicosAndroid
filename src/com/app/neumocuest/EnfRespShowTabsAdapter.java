package com.app.neumocuest;

import CustomFragments.FDatosCaso;
import CustomFragments.FEnfResp001;
import CustomFragments.FEnfResp002;
import CustomFragments.FEnfResp003;
import CustomFragments.FEnfResp004;
import CustomFragments.FEnfResp005;
import CustomFragments.FEnfResp006;
import CustomFragments.FEnfResp007;
import CustomFragments.FEnfResp008;
import CustomFragments.FEnfResp009;
import CustomFragments.FVacunacion;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
public class EnfRespShowTabsAdapter extends FragmentPagerAdapter {	
	String caso_id;

	public EnfRespShowTabsAdapter(FragmentManager fm,String caso_id) {
		super(fm);
		// TODO Auto-generated constructor stub
		this.caso_id=caso_id;
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		switch(arg0)
		{
		case 0:		
			return FDatosCaso.newInstanceArgs(caso_id);			
		case 1:
			return FEnfResp001.newInstanceArgs(caso_id);
		case 2:	
			return FEnfResp002.newInstanceArgs(caso_id);
		case 3:
			return FEnfResp003.newInstanceArgs(caso_id);
		case 4:
			return FEnfResp004.newInstanceArgs(caso_id);
		case 5:
			return FEnfResp005.newInstanceArgs(caso_id);
		case 6:
			 return FVacunacion.newInstanceArgs(caso_id);
		case 7:
			 return FEnfResp006.newInstanceArgs(caso_id);
		case 8:
			return FEnfResp007.newInstanceArgs(caso_id);
		case 9:
			return FEnfResp008.newInstanceArgs(Long.valueOf(caso_id));
		case 10:
		   return FEnfResp009.newInstanceArgs(caso_id);
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 11;
	}

}
