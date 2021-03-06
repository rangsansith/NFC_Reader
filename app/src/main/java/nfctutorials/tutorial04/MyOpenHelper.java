package nfctutorials.tutorial04;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 11/10/15 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    private static final String DATABASE_NAME = "golf.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_USER_TABLE = "create table userTABLE (_id integer primary key, Firstname text, Lastname text, User text, Password text, UserType text);";
    private static final String CREATE_DEVICE_TABLE = "create table deviceTABLE (_id integer primary key, tagNFC text, Name text, Location text, Status text);";
    private static final String CREATE_ASSIGN_TABLE = "create table assignTABLE (_id integer primary key, User_id text, device_id text, Assigned_date text, checkStatus text, Comment text);";

    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_USER_TABLE);
        sqLiteDatabase.execSQL(CREATE_DEVICE_TABLE);
        sqLiteDatabase.execSQL(CREATE_ASSIGN_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
