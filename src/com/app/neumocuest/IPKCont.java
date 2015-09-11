package com.app.neumocuest;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;


import com.app.neumocuest.R;

public class IPKCont extends FragmentActivity implements TabListener{
		private ViewPager vPager;
		private IPKTabsAdapter tAdapter;
		private ActionBar aBar;
		boolean bandera;
		String caso_id;
		
		
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
			super.onCreate(savedInstanceState);
			
			setContentView(R.layout.eipk);
			vPager=(ViewPager)findViewById(R.id.pager);
			vPager.setOffscreenPageLimit(5);
			Bundle vars=getIntent().getExtras();
			
			if(vars!=null)
			{
			caso_id=vars.getString("caso_id");	
			bandera=vars.getBoolean("bandera");	
			}
			tAdapter = new IPKTabsAdapter(getSupportFragmentManager(),bandera,caso_id);
			
			aBar = getActionBar();		
			vPager.setAdapter(tAdapter);
			
			
			aBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
			for (String title : getResources().getStringArray(R.array.cinco)) {
				aBar.addTab(aBar.newTab().setText(title).setTabListener(this));		
				
			}
			
			
			
			vPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
	        
				@Override
				public void onPageSelected(int position) {
					
					aBar.setSelectedNavigationItem(position);
				}

				@Override
				public void onPageScrolled(int arg0, float arg1, int arg2) {
				}

				@Override
				public void onPageScrollStateChanged(int arg0) {
				}
			});
			
					
			/*vPager.setPageTransformer(false, new ViewPager.PageTransformer() {
			    @Override
			    public void transformPage(View page, float position) {
			        // do transformation here
			    	
			    	final float normalizedposition = Math.abs(Math.abs(position) - 1);
			    	 page.setScaleX(normalizedposition / 2 + 0.5f);
			    	    page.setScaleY(normalizedposition / 2 + 0.5f);
			        }
			});*/
		   
		   	
		    	
				
			
			
		}

		@Override
		public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTabSelected(Tab tab, FragmentTransaction arg1) {
			// TODO Auto-generated method stub		
			
		    vPager.setCurrentItem(tab.getPosition());
			
			
			
		}

		@Override
		public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			
		}



		

		@Override
		public void onBackPressed() {
			// TODO Auto-generated method stub
			AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
	        dialogo1.setTitle("Importante");  
	        dialogo1.setMessage("Si cierra el Cuestionario sin haber guardado los datos estos se Perderán. Desea Cerrar?");            
	        dialogo1.setCancelable(false);  
	        dialogo1.setPositiveButton("Si", new DialogInterface.OnClickListener() {  
	            public void onClick(DialogInterface dialogo1, int id) {  
	                aceptar();  
	            }  
	        });  
	        dialogo1.setNegativeButton("No", new DialogInterface.OnClickListener() {  
	            public void onClick(DialogInterface dialogo1, int id) {  
	                cancelar();
	            }  
	        });            
	        dialogo1.show();   
		}

		public void aceptar() {
			 finish();
	    }
	    
	    public void cancelar() {
	       
	    }
	  

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		
		
		         
					/*boolean bandera=false;
					bandera=Frags.isEmpty();*/
					/*Toast t=Toast.makeText(this,Frags.size()+"", Toast.LENGTH_LONG);
					t.show();
					/*if(i==0)
					{
						CustomFragmentEnfRespCuest enfrc=(CustomFragmentEnfRespCuest)Frags.get(0);
						getSupportFragmentManager().putFragment(enfrc.getArguments(), "", enfrc);
						getSupportFragmentManager().saveFragmentInstanceState(enfrc);
					}*/
	             }

	   
	}
		





		



		

		

		

		

		
		
		
		




