package com.app.neumocuest;

import CustomFragments.FEnfResp006;
import CustomFragments.FEnfResp007;
import CustomFragments.FEnfResp008;
import CustomFragments.FEnfResp009;
import CustomFragments.FVacunacion;
import CustomFragments.FDatosCaso;
import CustomFragments.FEnfResp001;
import CustomFragments.FEnfResp002;
import CustomFragments.FEnfResp003;
import CustomFragments.FEnfResp004;
import CustomFragments.FEnfResp005;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class EnfRespTabsAdapter extends FragmentPagerAdapter{

	public EnfRespTabsAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int index) {
		if(index <11) {
			if(index==0)		
			{			
	    	return FDatosCaso.newInstance();		      
						
			}
			if(index==1)		
			{			
	    	return FEnfResp001.newInstance();		      
						
			}
			if(index==2)		
			{			
	    	return FEnfResp002.newInstance();		      
						
			}
			if(index==3)		
			{			
	    	return FEnfResp003.newInstance();		      
						
			}
			if(index==4)		
			{			
	    	return FEnfResp004.newInstance();		      
						
			}
			if(index==5)		
			{			
	    	return FEnfResp005.newInstance();		      
						
			}
			if(index==6)
			{
				return FVacunacion.newInstance();
			}
			if(index==7)
			{
				return FEnfResp006.newInstance();
			}
			if(index==8)
			{
				return FEnfResp007.newInstance();
			}
			if(index==9)
			{
				return FEnfResp008.newInstance();
			}
			if(index==10)
			{
				return FEnfResp009.newInstance();
			}
			
			
			
			
	  }
		return null;
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 11;
	}

}
