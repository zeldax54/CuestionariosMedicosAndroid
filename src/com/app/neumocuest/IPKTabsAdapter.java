package com.app.neumocuest;
import CustomFragments.FIPK001;
import CustomFragments.FIPK002;
import CustomFragments.FIPK003;
import CustomFragments.FIPK004;
import CustomFragments.FIPKControl;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class IPKTabsAdapter extends FragmentPagerAdapter{
	   
		FragmentManager fmm;
		boolean bandera;
		String caso_id;

		public IPKTabsAdapter(FragmentManager fm,boolean band,String caso_id) {
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
				return FIPK001.newInstance();			
		      case 1:		      
					return FIPK002.newInstance();				 
		      case 2:
		    	  return FIPK003.newInstance();		
		      case 3:
		    	  return FIPK004.newInstance();	
		      case 4:
					 return FIPKControl.newInstance();
		      }
			}
			
			if(bandera)
			{
				 switch(index)
				 {
			 case 0:		      
				   return FIPK001.newInstanceArgs(caso_id);		
			 case 1:		      
				   return FIPK002.newInstanceArgs(caso_id);					   
			 case 2:
				 return FIPK003.newInstanceArgs(caso_id);		
			 case 3:
				 return FIPK004.newInstanceArgs(caso_id);	
			 case 4:
				 return FIPKControl.newInstanceArgs(caso_id);
				 }
			}
		
			return null;
		}		

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 5;
		}

	}