package com.app.neumocuest;




import java.util.Calendar;



import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;



public class SelectorFecha extends Activity   {

    int year,month,day;
    

	public void InsertFecha(final EditText e,View rootView)
	{
         
		 final Calendar c = Calendar.getInstance();
         year = c.get(Calendar.YEAR);
         month = c.get(Calendar.MONTH);
         day = c.get(Calendar.DAY_OF_MONTH);
       OnDateSetListener callback;
       callback=new OnDateSetListener() {
			
			@Override
			public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
				year=arg1;
				month=arg2+1;
				day=arg3;	
				e.setText(day+"-"+Meses(month)+"-"+year+"");
				e.requestFocusFromTouch();
				e.requestFocus();
				
			}
			
		}; 
		
       DatePickerDialog dp=new DatePickerDialog(rootView.getContext(), callback, year, month, day);	        
       dp.show();
       
	}
	
	public void InsertFechaView(final EditText e,Context context)
	{
         
		 final Calendar c = Calendar.getInstance();
         year = c.get(Calendar.YEAR);
         month = c.get(Calendar.MONTH);
         day = c.get(Calendar.DAY_OF_MONTH);
       OnDateSetListener callback;
       callback=new OnDateSetListener() {
			
			@Override
			public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
				year=arg1;
				month=arg2+1;
				day=arg3;	
				e.setText(day+"-"+Meses(month)+"-"+year+"");
				e.requestFocusFromTouch();
				e.requestFocus();
				
			}
			
		}; 
		
       DatePickerDialog dp=new DatePickerDialog(context, callback, year, month, day);	        
       dp.show();
       
	}
	
	public String Meses(int mes)
	{
		switch(mes)
		{
		case 1:
			return "Ene";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return"Abr";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "Ago";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dic";
		 
		}
		return "";
	}
	
	
	 }
	        

	        


	

	
	

	
	

