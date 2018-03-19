package velo.uned.velocimetro.dao;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Alvaro on 16/3/2018.
 */

public class DataBase {

    private static final String TAG = "MyDatabase";
    private static final String DATABASE_NAME = "my_database.db";
    private PostDatabaseHelper mDbHelper;
    // Increment DB Version on any schema change
    private static final int DATABASE_VERSION = 1;
    private final Context mContext;
    public SQLiteDatabase mDb;
    //public static DaoContact mUserDao;



    public DataBase open() throws SQLException {
        mDbHelper = PostDatabaseHelper.getInstance(mContext);
        mDb = mDbHelper.getWritableDatabase();

        //mUserDao = new DaoContact(mDb);

        return this;
    }

    public void close() {
        mDbHelper.close();
    }

    public DataBase(Context context) {
        this.mContext = context;
    }
}
