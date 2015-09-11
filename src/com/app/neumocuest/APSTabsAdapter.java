package com.app.neumocuest;

import CustomFragments.FAPSControl;
import CustomFragments.FAps001;
import CustomFragments.FAps002;
import CustomFragments.FAps003;
import CustomFragments.FAps004;
import CustomFragments.FAps005;
import CustomFragments.FAps006;
import CustomFragments.FEnfResp003;
import CustomFragments.FEnfResp005;
import CustomFragments.FEnfResp006;
import CustomFragments.FVacunacion;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class APSTabsAdapter extends FragmentPagerAdapter{
	   
		FragmentManager fmm;
		boolean bandera;
		String caso_id;

		public APSTabsAdapter(FragmentManager fm,boolean band,String caso_id) {
			super(fm);
			bandera=band;
			this.caso_id=caso_id;	
			fmm=fm;
		}
	    
		@Override
		public Fragment getItem(int index) {
			if(bandera==false)
			{
		      switch(index)
		      {
		      case 0:		      
				return FAps001.newInstance();	
		      case 1:
		    	  return FAps002.newInstance();
		      case 2:
		    	   return FEnfResp003.newInstance();
		      case 3:
		    	   return FAps003.newInstance();
		      case 4:
		    	  return FAps004.newInstance();
		      case 5:
				  return FEnfResp005.newInstance();
		      case 6:
		    	   return FVacunacion.newInstance();
		      case 7:
				  return FEnfResp006.newInstance();
		      case 8:
		    	  return FAps005.newInstance();
		      case 9:
		    	  return FAps006.newInstance();		    	  
		      case 10:
		    	  return FAPSControl.newInstance();	    	  
		   
		      }
			}
			
			if(bandera)
			{
				 switch(index)
				 {
			 case 0:		      
				   return  FAps001.newInstanceArgs(caso_id);
			 case 1:
				 return FAps002.newInstanceArgs(caso_id);
			 case 2:
				  return FEnfResp003.newInstanceArgs(caso_id);
			 case 3:
				  return FAps003.newInstanceArgs(caso_id);
			 case 4:
				 return FAps004.newInstanceArgs(caso_id);
			 case 5:
				  return FEnfResp005.newInstanceArgs(caso_id);
			 case 6:
				  return FVacunacion.newInstanceArgs(caso_id);
			 case 7:
				  return FEnfResp006.newInstanceArgs(caso_id);
			 case 8:
				 return FAps005.newInstanceArgs(caso_id);
			 case 9:
				 return FAps006.newInstanceArgs(caso_id);
			 case 10:
				   return FAPSControl.newInstanceArgs(caso_id);
		
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