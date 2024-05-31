package Configuracion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteConexion  extends SQLiteOpenHelper
{
    public SQLiteConexion(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        //Aqui se crean Todas las tablas en SQLite
        db.execSQL(Trans.CreateTablePersonas);

    }

    //Aqui se eliminan las tablas Wipe Data
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL(Trans.DropTablePersonas);
        onCreate(db);

    }
}
