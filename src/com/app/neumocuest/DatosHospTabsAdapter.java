package com.app.neumocuest;

import CustomFragments.FDatosCaso;
import CustomFragments.FDatosHosp;
import CustomFragments.FDatosHosp001;
import CustomFragments.FDatosHosp002;
import CustomFragments.FDatosHosp003;
import CustomFragments.FDatosHospControl;
import CustomFragments.FMening001;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DatosHospTabsAdapter extends FragmentPagerAdapter{
	   
		FragmentManager fmm;
		boolean bandera;
		String caso_id;


		public DatosHospTabsAdapter(FragmentManager fm,boolean band,String caso_id) {
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
				return FDatosHosp.newInstance();			
		      case 1:
					return FDatosHosp001.newInstance();	
		      case 2:
		    	  return FDatosHosp002.newInstance();
		      case 3:
		    	   return FDatosHosp003.newInstance();
		      case 4:
		    	   return FDatosHospControl.newInstance();
		     
		   
		      }
			}
			
			if(bandera)
			{
				 switch(index)
				 {
			 case 0:		      
				   return FDatosHosp.newInstanceArgs(caso_id);				
			 case 1:
				   return FDatosHosp001.newInstanceArgs(caso_id);	
			 case 2:
		    	  return FDatosHosp002.newInstanceArgs(caso_id);
		      case 3:
		    	   return FDatosHosp003.newInstanceArgs(caso_id);
		      case 4:
		    	  return FDatosHospControl.newInstanceArgs(caso_id);
			 
				 }
			}
		
			return null;
		}
		
		

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 5 ;
		}

	}