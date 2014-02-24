package iutaix.cgm.octocontacts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UtilisateurBDD {
	public static final String TABLE_UTILISATEURS = "table_utilisateurs";
	public static final String COL_ID = "UtilisateurId";
	public static final String COL_PRENOM = "Prenom";
	public static final String COL_NOM = "Nom";
	// COUCOU
	//test
	// Coucou la famille
	private SQLiteDatabase bdd;
	
	private BaseDonnee maBaseSQLite;
	
	public UtilisateurBDD(Context context){
	//On créer la BDD et sa table
	maBaseSQLite = new BaseDonnee(context);
	}

	public void open() {
		bdd = maBaseSQLite.getWritableDatabase();
	}
}