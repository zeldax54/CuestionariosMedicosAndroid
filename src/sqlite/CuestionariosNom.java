package sqlite;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.app.neumocuest.R;

public class CuestionariosNom {

	private static final String N_Tabla="Cuestionarios";
	private  int cuestionario_id;
	private  String Nombre;
	
	 private int getCuestionario_id() {
		return cuestionario_id;
	}

	private void setCuestionario_id(int cuestionario_id) {
		this.cuestionario_id = cuestionario_id;
	}

	private String getNombre() {
		return Nombre;
	}

	private void setNombre(String nombre) {
		Nombre = nombre;
	}

	public CuestionariosNom(int pidcuestionario, String pNombre)
	 {
		 setCuestionario_id(pidcuestionario);
		 setNombre(pNombre);
	 }
	 
	 public CuestionariosNom(){}
	 
	 public String Crear()
	 {
		 String fin="CREATE TABLE CuestionariosNom(cuestionario_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,Nombre TEXT)";
		 return fin;
	 }
	 
	 public long insert(CuestionariosNom tipo, SQLiteDatabase db)
		{
		ContentValues values = new ContentValues();		
		values.put("Nombre",tipo. getNombre());		
		 long id = db.insert("CuestionariosNom", null, values);
		 return id;
		}
	
}
