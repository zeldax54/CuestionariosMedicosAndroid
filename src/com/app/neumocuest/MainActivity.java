package com.app.neumocuest;
import sqlite.BDAcceso;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener{
	
	

	ImageButton cuestionario;
	ImageButton datos;
	ImageButton estad;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);     
        BDAcceso bd=new BDAcceso(this);
        bd.open();
        bd.close();
        cuestionario=(ImageButton)findViewById(R.id.boton1);        
        cuestionario.setOnClickListener(this);
        datos=(ImageButton)findViewById(R.id.imageButton2);
        datos.setOnClickListener(this);
        estad=(ImageButton)findViewById(R.id.imageButton3);
        estad.setOnClickListener(this);

        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

   
    public static class PlaceholderFragment extends Fragment {
    	
    	

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            
            return rootView;
        }
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.boton1)
		{
			Intent intent=new Intent("com.app.neumocuest.CUESTIONARIOS");
			startActivity(intent);
		}
		if(arg0.getId()==R.id.imageButton2)
		{
			Intent intent=new Intent("com.app.neumocuestl.DATOS");
			startActivity(intent);
		}		
		
		if(arg0.getId()==R.id.imageButton3)
		{
			Toast t=Toast.makeText(this, "No implementado", Toast.LENGTH_LONG);
			t.show();
		}	
	}
     

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
        dialogo1.setTitle("Mensaje");  
        dialogo1.setMessage("Deasea Cerrar la Aplicación");            
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
  


	

}
