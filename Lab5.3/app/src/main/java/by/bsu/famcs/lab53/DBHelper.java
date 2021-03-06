package by.bsu.famcs.lab53;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Raman on 30-Oct-17.
 */
class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "belarus", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + MainActivity.TABLE_NAME + " ("
                + "id integer primary key autoincrement,"
                + "district text,"
                + "population integer,"
                + "region_code integer);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL( "DROP ТАВLЕ IF EXISTS " + MainActivity.TABLE_NAME );
        onCreate(db);
    }
}
