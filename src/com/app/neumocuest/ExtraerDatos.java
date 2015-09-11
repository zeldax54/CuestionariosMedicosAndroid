package com.app.neumocuest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ExtraerDatos extends Fragment implements OnClickListener {
	
	
	View rootView;
	
	Button autom;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		rootView = inflater.inflate(R.layout.extraerdatos, container,false);	
		
	
		autom=(Button)rootView.findViewById(R.id.button1);
		autom.setOnClickListener(this);
		
		return rootView;
	}







public void backupdDatabase()
{ 
	try { 
		File sd = Environment.getExternalStorageDirectory();
		File data = Environment.getDataDirectory(); 
		
		String packageName = "com.app.neumocuest"; 
		String sourceDBName = "CuestionariosBD"; 
		String targetDBName = "CuestionariosBD"; 
		if (sd.canWrite()) 
		{ Date now = new Date(); 
		String currentDBPath = "data/" + packageName + "/databases/" + sourceDBName; 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm"); 
		String backupDBPath = targetDBName + dateFormat.format(now) + ".db";
		File currentDB = new File(data, currentDBPath); 
		File backupDB = new File(sd, backupDBPath); 
		Log.i("backup","backupDB=" + backupDB.getAbsolutePath()); 
		Log.i("backup","sourceDB=" + currentDB.getAbsolutePath()); 
		FileChannel src = new FileInputStream(currentDB).getChannel(); 
		FileChannel dst = new FileOutputStream(backupDB).getChannel(); 
		dst.transferFrom(src, 0, src.size()); 
		src.close(); dst.close(); 
		Toast t=Toast.makeText(rootView.getContext(), "Datos Salvados en la raiz de la tarjeta de memoria con nombre "+backupDBPath, Toast.LENGTH_LONG);
		t.show();
		} 
		} 
	catch 
	(Exception e)
	{ Log.i("Backup", e.toString());
	} 
	}


private static String obtenerDirectorioCopias() throws Exception
{
 String estado = Environment.getExternalStorageState();
 if (estado.equals(Environment.MEDIA_MOUNTED_READ_ONLY)||estado.equals(Environment.MEDIA_REMOVED)||estado.equals(Environment.MEDIA_UNMOUNTED))
 {
  throw new Exception();
 }
 else
 {
 String dir = Environment.getExternalStorageDirectory().getAbsolutePath();
 dir+="/DatosNeumo";
 return dir;
 }
}




@Override
public void onClick(View arg0) {
	// TODO Auto-generated method stub
	
	if(arg0.getId()==R.id.button1)
	{
	
			backupdDatabase();
	
	
	}
	
}
}