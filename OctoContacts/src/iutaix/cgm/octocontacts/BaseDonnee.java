package iutaix.cgm.octocontacts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDonnee extends SQLiteOpenHelper {
	private static final String NOM_BDD = "boncoins.db";
	private static final int VERSION_BDD = 1;
	
	private static final String CREATE_BDD = "CREATE TABLE " +
		UtilisateurBDD.TABLE_UTILISATEURS+ " (" +
		UtilisateurBDD.COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
		UtilisateurBDD.COL_NOM + " TEXT NOT NULL, " +
		UtilisateurBDD.COL_PRENOM + " TEXT);";
	
	public BaseDonnee(Context context) {
	super(context, NOM_BDD, null, VERSION_BDD );
	}
	//TEST
	@Override
	public void onCreate(SQLiteDatabase db) {
	db.execSQL(CREATE_BDD);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	db.execSQL("DROP TABLE " + UtilisateurBDD.TABLE_UTILISATEURS + ";");
	onCreate(db);
	}
}
