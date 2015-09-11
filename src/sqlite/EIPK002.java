package sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class EIPK002 {
	
	private String caso_id;
	private String diagnostico;
	private String fecha;
	private boolean fiebre;
	private boolean mialgia;
	private boolean cefalea;
	private boolean linfoadenop;
	private boolean malestarg;
	private boolean vomitos;
	private boolean rash;
	private boolean petequias;
	private boolean diarreas;
	private boolean artalgia;
	private boolean esplenomeg;
	private boolean anorexia;
	private boolean ictero;
	private boolean hepatomeg;
	private boolean astenia;
	private boolean escalofrios;
	private boolean sangramiento;
	private boolean dolorabd;
	private boolean aumentovol;
	private boolean tos;
	private boolean disnea;
	private boolean expect;
	private boolean laringitis;
	private boolean faringitis;
	private boolean rinorrea;
	private boolean otitis;
	private boolean coquel;
	private boolean amigdalitis;
	private boolean laringotraq;
	private boolean estornudos;
	private boolean vacunacion;
	private boolean desorientac;
	private boolean rigidezn;
	private boolean convulciones;
	private boolean perdidaconc;
	private boolean trastornoscond;
	private boolean dificultadmarcha;
	private boolean secreciong;
	private boolean lesiong;
	private boolean disuria;
	private String otros;
	
	
	public EIPK002(){}
	public EIPK002(String caso_id,String diagnostico,String fecha,boolean fiebre,boolean mialgia,boolean cefalea,boolean linfoadenop,boolean malestarg,boolean vomitos,boolean rash,boolean petequias,boolean diarreas,boolean artalgia,boolean esplenomeg,boolean anorexia,boolean ictero,boolean hepatomeg,boolean astenia,boolean escalofrios,boolean sangramiento,boolean dolorabd,boolean aumentovol,boolean tos,boolean disnea,boolean expect,boolean laringitis,boolean faringitis,boolean rinorrea,boolean otitis,boolean coquel,boolean amigdalitis,boolean laringotraq,boolean estornudos,boolean vacunacion,boolean desorientac,boolean rigidezn,boolean convulciones,boolean perdidaconc,boolean trastornoscond,boolean dificultadmarcha,boolean secreciong,boolean lesiong,boolean disuria,String otros)
	{
	this.caso_id=caso_id;
	this.diagnostico=diagnostico;
	this.fecha=fecha;
	this.fiebre=fiebre;
	this.mialgia=mialgia;
	this.cefalea=cefalea;
	this.linfoadenop=linfoadenop;
	this.malestarg=malestarg;
	this.vomitos=vomitos;
	this.rash=rash;
	this.petequias=petequias;
	this.diarreas=diarreas;
	this.artalgia=artalgia;
	this.esplenomeg=esplenomeg;
	this.anorexia=anorexia;
	this.ictero=ictero;
	this.hepatomeg=hepatomeg;
	this.astenia=astenia;
	this.escalofrios=escalofrios;
	this.sangramiento=sangramiento;
	this.dolorabd=dolorabd;
	this.aumentovol=aumentovol;
	this.tos=tos;
	this.disnea=disnea;
	this.expect=expect;
	this.laringitis=laringitis;
	this.faringitis=faringitis;
	this.rinorrea=rinorrea;
	this.otitis=otitis;
	this.coquel=coquel;
	this.amigdalitis=amigdalitis;
	this.laringotraq=laringotraq;
	this.estornudos=estornudos;
	this.vacunacion=vacunacion;
	this.desorientac=desorientac;
	this.rigidezn=rigidezn;
	this.convulciones=convulciones;
	this.perdidaconc=perdidaconc;
	this.trastornoscond=trastornoscond;
	this.dificultadmarcha=dificultadmarcha;
	this.secreciong=secreciong;
	this.lesiong=lesiong;
	this.disuria=disuria;
	this.otros=otros;

	}
	
	public String getcaso_id()
	{
	return caso_id;
	}
	public void setcaso_id(String caso_id)
	{
	this.caso_id=caso_id;
	}
	public String getdiagnostico()
	{
	return diagnostico;
	}
	public void setdiagnostico(String diagnostico)
	{
	this.diagnostico=diagnostico;
	}
	public String getfecha()
	{
	return fecha;
	}
	public void setfecha(String fecha)
	{
	this.fecha=fecha;
	}
	public boolean getfiebre()
	{
	return fiebre;
	}
	public void setfiebre(boolean fiebre)
	{
	this.fiebre=fiebre;
	}
	public boolean getmialgia()
	{
	return mialgia;
	}
	public void setmialgia(boolean mialgia)
	{
	this.mialgia=mialgia;
	}
	public boolean getcefalea()
	{
	return cefalea;
	}
	public void setcefalea(boolean cefalea)
	{
	this.cefalea=cefalea;
	}
	public boolean getlinfoadenop()
	{
	return linfoadenop;
	}
	public void setlinfoadenop(boolean linfoadenop)
	{
	this.linfoadenop=linfoadenop;
	}
	public boolean getmalestarg()
	{
	return malestarg;
	}
	public void setmalestarg(boolean malestarg)
	{
	this.malestarg=malestarg;
	}
	public boolean getvomitos()
	{
	return vomitos;
	}
	public void setvomitos(boolean vomitos)
	{
	this.vomitos=vomitos;
	}
	public boolean getrash()
	{
	return rash;
	}
	public void setrash(boolean rash)
	{
	this.rash=rash;
	}
	public boolean getpetequias()
	{
	return petequias;
	}
	public void setpetequias(boolean petequias)
	{
	this.petequias=petequias;
	}
	public boolean getdiarreas()
	{
	return diarreas;
	}
	public void setdiarreas(boolean diarreas)
	{
	this.diarreas=diarreas;
	}
	public boolean getartalgia()
	{
	return artalgia;
	}
	public void setartalgia(boolean artalgia)
	{
	this.artalgia=artalgia;
	}
	public boolean getesplenomeg()
	{
	return esplenomeg;
	}
	public void setesplenomeg(boolean esplenomeg)
	{
	this.esplenomeg=esplenomeg;
	}
	public boolean getanorexia()
	{
	return anorexia;
	}
	public void setanorexia(boolean anorexia)
	{
	this.anorexia=anorexia;
	}
	public boolean getictero()
	{
	return ictero;
	}
	public void setictero(boolean ictero)
	{
	this.ictero=ictero;
	}
	public boolean gethepatomeg()
	{
	return hepatomeg;
	}
	public void sethepatomeg(boolean hepatomeg)
	{
	this.hepatomeg=hepatomeg;
	}
	public boolean getastenia()
	{
	return astenia;
	}
	public void setastenia(boolean astenia)
	{
	this.astenia=astenia;
	}
	public boolean getescalofrios()
	{
	return escalofrios;
	}
	public void setescalofrios(boolean escalofrios)
	{
	this.escalofrios=escalofrios;
	}
	public boolean getsangramiento()
	{
	return sangramiento;
	}
	public void setsangramiento(boolean sangramiento)
	{
	this.sangramiento=sangramiento;
	}
	public boolean getdolorabd()
	{
	return dolorabd;
	}
	public void setdolorabd(boolean dolorabd)
	{
	this.dolorabd=dolorabd;
	}
	public boolean getaumentovol()
	{
	return aumentovol;
	}
	public void setaumentovol(boolean aumentovol)
	{
	this.aumentovol=aumentovol;
	}
	public boolean gettos()
	{
	return tos;
	}
	public void settos(boolean tos)
	{
	this.tos=tos;
	}
	public boolean getdisnea()
	{
	return disnea;
	}
	public void setdisnea(boolean disnea)
	{
	this.disnea=disnea;
	}
	public boolean getexpect()
	{
	return expect;
	}
	public void setexpect(boolean expect)
	{
	this.expect=expect;
	}
	public boolean getlaringitis()
	{
	return laringitis;
	}
	public void setlaringitis(boolean laringitis)
	{
	this.laringitis=laringitis;
	}
	public boolean getfaringitis()
	{
	return faringitis;
	}
	public void setfaringitis(boolean faringitis)
	{
	this.faringitis=faringitis;
	}
	public boolean getrinorrea()
	{
	return rinorrea;
	}
	public void setrinorrea(boolean rinorrea)
	{
	this.rinorrea=rinorrea;
	}
	public boolean getotitis()
	{
	return otitis;
	}
	public void setotitis(boolean otitis)
	{
	this.otitis=otitis;
	}
	public boolean getcoquel()
	{
	return coquel;
	}
	public void setcoquel(boolean coquel)
	{
	this.coquel=coquel;
	}
	public boolean getamigdalitis()
	{
	return amigdalitis;
	}
	public void setamigdalitis(boolean amigdalitis)
	{
	this.amigdalitis=amigdalitis;
	}
	public boolean getlaringotraq()
	{
	return laringotraq;
	}
	public void setlaringotraq(boolean laringotraq)
	{
	this.laringotraq=laringotraq;
	}
	public boolean getestornudos()
	{
	return estornudos;
	}
	public void setestornudos(boolean estornudos)
	{
	this.estornudos=estornudos;
	}
	public boolean getvacunacion()
	{
	return vacunacion;
	}
	public void setvacunacion(boolean vacunacion)
	{
	this.vacunacion=vacunacion;
	}
	public boolean getdesorientac()
	{
	return desorientac;
	}
	public void setdesorientac(boolean desorientac)
	{
	this.desorientac=desorientac;
	}
	public boolean getrigidezn()
	{
	return rigidezn;
	}
	public void setrigidezn(boolean rigidezn)
	{
	this.rigidezn=rigidezn;
	}
	public boolean getconvulciones()
	{
	return convulciones;
	}
	public void setconvulciones(boolean convulciones)
	{
	this.convulciones=convulciones;
	}
	public boolean getperdidaconc()
	{
	return perdidaconc;
	}
	public void setperdidaconc(boolean perdidaconc)
	{
	this.perdidaconc=perdidaconc;
	}
	public boolean gettrastornoscond()
	{
	return trastornoscond;
	}
	public void settrastornoscond(boolean trastornoscond)
	{
	this.trastornoscond=trastornoscond;
	}
	public boolean getdificultadmarcha()
	{
	return dificultadmarcha;
	}
	public void setdificultadmarcha(boolean dificultadmarcha)
	{
	this.dificultadmarcha=dificultadmarcha;
	}
	public boolean getsecreciong()
	{
	return secreciong;
	}
	public void setsecreciong(boolean secreciong)
	{
	this.secreciong=secreciong;
	}
	public boolean getlesiong()
	{
	return lesiong;
	}
	public void setlesiong(boolean lesiong)
	{
	this.lesiong=lesiong;
	}
	public boolean getdisuria()
	{
	return disuria;
	}
	public void setdisuria(boolean disuria)
	{
	this.disuria=disuria;
	}
	public String getotros()
	{
	return otros;
	}
	public void setotros(String otros)
	{
	this.otros=otros;
	}
	
	public String Crear()
	{
		return "CREATE TABLE EIPK002 (caso_id INTEGER PRIMARY KEY ,diagnostico TEXT, fecha TEXT, fiebre boolean, mialgia boolean, cefalea boolean, linfoadenop boolean, malestarg boolean, vomitos boolean, rash boolean, petequias boolean, diarreas boolean, artalgia boolean, esplenomeg boolean, anorexia boolean, ictero boolean, hepatomeg boolean, astenia boolean, escalofrios boolean, sangramiento boolean, dolorabd boolean, aumentovol boolean, tos boolean, disnea boolean, expect boolean, laringitis boolean, faringitis boolean, rinorrea boolean, otitis boolean, coquel boolean, amigdalitis boolean, laringotraq boolean, estornudos boolean, vacunacion boolean, desorientac boolean, rigidezn boolean, convulciones boolean, perdidaconc boolean, trastornoscond boolean, dificultadmarcha boolean, secreciong boolean, lesiong boolean, disuria boolean, otros TEXT)";
	}
	
	public long insertEIPK002(EIPK002 tipo, SQLiteDatabase db,boolean act,String caso_id)
	{
	ContentValues values = new ContentValues();
	values.put("caso_id",tipo.getcaso_id());
	values.put("diagnostico",tipo.getdiagnostico());
	values.put("fecha",tipo.getfecha());
	values.put("fiebre",tipo.getfiebre());
	values.put("mialgia",tipo.getmialgia());
	values.put("cefalea",tipo.getcefalea());
	values.put("linfoadenop",tipo.getlinfoadenop());
	values.put("malestarg",tipo.getmalestarg());
	values.put("vomitos",tipo.getvomitos());
	values.put("rash",tipo.getrash());
	values.put("petequias",tipo.getpetequias());
	values.put("diarreas",tipo.getdiarreas());
	values.put("artalgia",tipo.getartalgia());
	values.put("esplenomeg",tipo.getesplenomeg());
	values.put("anorexia",tipo.getanorexia());
	values.put("ictero",tipo.getictero());
	values.put("hepatomeg",tipo.gethepatomeg());
	values.put("astenia",tipo.getastenia());
	values.put("escalofrios",tipo.getescalofrios());
	values.put("sangramiento",tipo.getsangramiento());
	values.put("dolorabd",tipo.getdolorabd());
	values.put("aumentovol",tipo.getaumentovol());
	values.put("tos",tipo.gettos());
	values.put("disnea",tipo.getdisnea());
	values.put("expect",tipo.getexpect());
	values.put("laringitis",tipo.getlaringitis());
	values.put("faringitis",tipo.getfaringitis());
	values.put("rinorrea",tipo.getrinorrea());
	values.put("otitis",tipo.getotitis());
	values.put("coquel",tipo.getcoquel());
	values.put("amigdalitis",tipo.getamigdalitis());
	values.put("laringotraq",tipo.getlaringotraq());
	values.put("estornudos",tipo.getestornudos());
	values.put("vacunacion",tipo.getvacunacion());
	values.put("desorientac",tipo.getdesorientac());
	values.put("rigidezn",tipo.getrigidezn());
	values.put("convulciones",tipo.getconvulciones());
	values.put("perdidaconc",tipo.getperdidaconc());
	values.put("trastornoscond",tipo.gettrastornoscond());
	values.put("dificultadmarcha",tipo.getdificultadmarcha());
	values.put("secreciong",tipo.getsecreciong());
	values.put("lesiong",tipo.getlesiong());
	values.put("disuria",tipo.getdisuria());
	values.put("otros",tipo.getotros());
	long id=0;
	if(act)
	{
		String[] args = new String[] {caso_id};		
	     id = db.update("EIPK002",values,"caso_id=?",args);
	}
	else
	{
	 id = db.insert("EIPK002", null, values);
	}
	
	return id;
	}
	
	
	public EIPK002 selectEIPK002(String caso_id,SQLiteDatabase db)
	{
	EIPK002 tipo=null;
	Cursor cursor=db.query("EIPK002" ,null,"caso_id=?",new String[] {caso_id},null, null, null);
	cursor.moveToFirst();
	tipo=new EIPK002(cursor.getString(0),cursor.getString(1),cursor.getString(2),Booleanos(cursor.getString(3)),Booleanos(cursor.getString(4)),Booleanos(cursor.getString(5)),Booleanos(cursor.getString(6)),Booleanos(cursor.getString(7)),Booleanos(cursor.getString(8)),Booleanos(cursor.getString(9)),Booleanos(cursor.getString(10)),Booleanos(cursor.getString(11)),Booleanos(cursor.getString(12)),Booleanos(cursor.getString(13)),Booleanos(cursor.getString(14)),Booleanos(cursor.getString(15)),Booleanos(cursor.getString(16)),Booleanos(cursor.getString(17)),Booleanos(cursor.getString(18)),Booleanos(cursor.getString(19)),Booleanos(cursor.getString(20)),Booleanos(cursor.getString(21)),Booleanos(cursor.getString(22)),Booleanos(cursor.getString(23)),Booleanos(cursor.getString(24)),Booleanos(cursor.getString(25)),Booleanos(cursor.getString(26)),Booleanos(cursor.getString(27)),Booleanos(cursor.getString(28)),Booleanos(cursor.getString(29)),Booleanos(cursor.getString(30)),Booleanos(cursor.getString(31)),Booleanos(cursor.getString(32)),Booleanos(cursor.getString(33)),Booleanos(cursor.getString(34)),Booleanos(cursor.getString(35)),Booleanos(cursor.getString(36)),Booleanos(cursor.getString(37)),Booleanos(cursor.getString(38)),Booleanos(cursor.getString(39)),Booleanos(cursor.getString(40)),Booleanos(cursor.getString(41)),Booleanos(cursor.getString(42)),cursor.getString(43));
	return tipo;
	}
	
	public boolean Booleanos(String x)
	{
		if(x.equals("1"))
			return true;
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
