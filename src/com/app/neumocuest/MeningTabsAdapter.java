package com.app.neumocuest;


import CustomFragments.FDatosCaso;
import CustomFragments.FMening001;
import CustomFragments.FMening002;
import CustomFragments.FMening003;
import CustomFragments.FMening004;
import CustomFragments.FMening005;
import CustomFragments.FMening006;
import CustomFragments.FMeningControl;
import CustomFragments.FVacunacion;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MeningTabsAdapter extends FragmentPagerAdapter{
	   
		FragmentManager fmm;
		boolean bandera;
		String caso_id;


		public MeningTabsAdapter(FragmentManager fm,boolean band,String caso_id) {
			super(fm);
			bandera=band;
			this.caso_id=caso_id;
			
			// TODO Auto-generated constructor stub
			fmm=fm;
		}
		
		
	    
		@Override
		public Fragment getItem(int index) {
			if(bandera==false)
			{
		      switch(index)
		      {
		      case 0:		      
				return FDatosCaso.newInstance();				
		      case 1:
					return FMening001.newInstance();	
		      case 2:
		    	  return FMening002.newInstance();
		      case 3:
		    	  return FMening003.newInstance();
		      case 4:
		    	   return FMening004.newInstance();
		      case 5:
		    	  return FVacunacion.newInstance();
		      case 6:
		    	  return FMening005.newInstance();
		      case 7:
		    	  return FMening006.newInstance();
		      case 8:		    	  
		    	  return FMeningControl.newInstance();
		      }
			}
			
			if(bandera)
			{
				 switch(index)
				 {
			 case 0:		      
				   return FDatosCaso.newInstanceArgs(caso_id);				
			 case 1:
				   return FMening001.newInstanceArgs(caso_id);	
			 case 2:
				 return FMening002.newInstanceArgs(caso_id);	
			 case 3:
				 return FMening003.newInstanceArgs(caso_id);	
			 case 4:
				 return FMening004.newInstanceArgs(caso_id);
			 case 5:
				 return FVacunacion.newInstanceArgs(caso_id);
			 case 6:
				 return FMening005.newInstanceArgs(caso_id);
			 case 7:
				 return FMening006.newInstanceArgs(caso_id);
			 case 8:
			      return FMeningControl.newInstanceArgs(caso_id);
			 
				 }
			}
		
			return null;
		}
		
		

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 9;
		}

	}