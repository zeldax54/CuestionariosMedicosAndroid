package com.app.neumocuest;
import java.util.ArrayList;
import sqlite.BDAcceso;
import com.app.neumocuest.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Datos extends FragmentActivity implements OnClickListener,OnItemClickListener{
	
	 ImageButton buscar_editar;
	 ListView lista;
	 Bundle salvados;
	 Button eliminar;
	 FrameLayout layout;
	 TextView text;
	 
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	        setContentView(R.layout.datos);   
	        lista=(ListView)findViewById(R.id.listView1);
	        lista.setOnItemClickListener(this);
	        ArrayList<String > mostrar=new ArrayList<String>();
	        mostrar.add("Cuestionarios");
	        mostrar.add("Extraer Datos");
	        mostrar.add("Limpiar Datos");
	        mostrar.add("Salir");
	        ListAdapter a=new ArrayAdapter<String>(this,R.drawable.despleg1,mostrar);	         
			lista.setAdapter(a);					
	        salvados=savedInstanceState;
	        eliminar=(Button)findViewById(R.id.button1);
	        eliminar.setOnClickListener(this);
	        layout=(FrameLayout)findViewById(R.id.fragment_container);
	        text=(TextView)findViewById(R.id.TextView02);
	        text.setVisibility(View.INVISIBLE);
	    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0.getId()==R.id.imageButton1)
		{
			Intent intent=new Intent("com.app.neumocuest.BUSCARSQL");
			startActivity(intent);
		}
		
		if(arg0.getId()==R.id.button1)
		{
			BDAcceso bd=new BDAcceso(this);
			try {
				bd.BorraBD();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Toast t=Toast.makeText(this, e.getMessage(),Toast.LENGTH_LONG);
				t.show();
			}
		}
	}
	
	
	
		
		
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {		
		// TODO Auto-generated method stub
		
		if(arg0.getId()==R.id.listView1)
		{
			if(arg2==0)
			{
				text.setVisibility(View.INVISIBLE);
				eliminar.setVisibility(View.INVISIBLE);
				arg0.getChildAt(0).setBackgroundColor(R.drawable.list);
				arg0.getChildAt(1).setBackgroundColor(Color.TRANSPARENT);
				arg0.getChildAt(2).setBackgroundColor(Color.TRANSPARENT);
				
		        if (findViewById(R.id.fragment_container) != null) {
		            // Si estamos restaurando de una instancia anterior,
		            // no cesitamos hacer nada y podemos salir,
		            // caso contrario, procedemos a superponer un fragment.
		            if (salvados != null) {
		               return;
		            }
		            // Crear una instancia de ExampleFragment
		            Buscarsql firstFragment = new Buscarsql();
		            // Si nuestra Activity se inició con instrucciones especiales desde un Intent,
		            // pasar los argumentos al nuevo Fragment
		            firstFragment.setArguments(getIntent().getExtras());

		            // Agregar 'fragment_container' al FrameLayout
		            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
			         // Reemplazar en fragment_container cualquier Fragment con este
			         // y agregar esta transacción a la pila de retroceso
			         transaction.replace(R.id.fragment_container, firstFragment);
			         transaction.addToBackStack(null);
			         // Realizar la transacción
			         transaction.commit();
		        }
			}
			if(arg2==1)
			{
				  text.setVisibility(View.INVISIBLE);
				eliminar.setVisibility(View.INVISIBLE);
				arg0.getChildAt(1).setBackgroundColor(R.drawable.list);
				arg0.getChildAt(0).setBackgroundColor(Color.TRANSPARENT);
				arg0.getChildAt(2).setBackgroundColor(Color.TRANSPARENT);
				
				if (findViewById(R.id.fragment_container) != null) {
		            // Si estamos restaurando de una instancia anterior,
		            // no cesitamos hacer nada y podemos salir,
		            // caso contrario, procedemos a superponer un fragment.
		            if (salvados != null) {
		               return;
		            }
		            // Crear una instancia de ExampleFragment
		            ExtraerDatos secondtFragment = new ExtraerDatos();
		            // Si nuestra Activity se inició con instrucciones especiales desde un Intent,
		            // pasar los argumentos al nuevo Fragment
		            secondtFragment.setArguments(getIntent().getExtras());

		            // Agregar 'fragment_container' al FrameLayout		           
		            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		         // Reemplazar en fragment_container cualquier Fragment con este
		         // y agregar esta transacción a la pila de retroceso
		         transaction.replace(R.id.fragment_container, secondtFragment);
		         transaction.addToBackStack(null);
		         // Realizar la transacción
		         transaction.commit();
				}
			}
			
			
			if(arg2==2)
			{
				arg0.getChildAt(2).setBackgroundColor(R.drawable.list);
				arg0.getChildAt(1).setBackgroundColor(Color.TRANSPARENT);
				arg0.getChildAt(0).setBackgroundColor(Color.TRANSPARENT);
			    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
			    Fragment f=new Fragment();
			    transaction.replace(R.id.fragment_container,f);
			    transaction.addToBackStack(null);
		        transaction.commit();
		        text.setVisibility(View.VISIBLE);
				eliminar.setVisibility(View.VISIBLE);
			}
			
			if(arg2==3)
			{
				Salir();
			}
				
			
			
		}
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Salir();
	}

	public void aceptar() {
		 finish();
    }
    
    public void cancelar() {
       
    }
    
    public void Salir()
    {
    	AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
        dialogo1.setTitle("Mensaje");  
        dialogo1.setMessage("Esta seguro de que desea Salir?");            
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

}
