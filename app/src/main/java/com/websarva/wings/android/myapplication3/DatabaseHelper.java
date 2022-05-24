package com.websarva.wings.android.myapplication3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    //データベース名の定数フィールド
    private static final String DATABASE_NAME="ShoppingList.db";
    //バージョン情報の定数フィールド
    private static final int DATABASE_VERSION=1;

    //コンストラクタ
    public DatabaseHelper(Context context){
        //親クラスのコンストラクタ呼び出し
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        //テーブル作成用SQL文字列の作成
        StringBuilder sb= new StringBuilder();
        sb.append("CREATE TABLE ShoppingLists (");
        sb.append("_id INTEGER PRIMARY KEY,");
        sb.append("name TEXT,");
        sb.append("unit TEXT,");
        sb.append("category TEXT");
        sb.append(");");
//        sb.append("INSERT INTO ShoppingLists (_id, name, unit, category) VALUES (1,'牛肉','グラム','食べ物');");
//        sb.append("INSERT INTO ShoppingLists (_id, name, unit, category) VALUES (2,'たまねぎ','個','食べ物');");


        //                + "INSERT INTO ShoppingList VALUES (3,'バター','グラム','食べ物');"
//                + "INSERT INTO ShoppingList VALUES (4,'ウスターソース','本','食べ物');"
//                + "INSERT INTO ShoppingList VALUES (5,'卵','個','食べ物');"
//                + "INSERT INTO ShoppingList VALUES (6,'長ネギ','本','食べ物');"
//                + "INSERT INTO ShoppingList VALUES (7,'お茶','本','飲み物');"
//                + "INSERT INTO ShoppingList VALUES (8,'糸とうがらし','袋','食べ物');"
//                + "INSERT INTO ShoppingList VALUES (9,'トイレットペーパー','個','日用品');"
//                + "INSERT INTO ShoppingList VALUES (10,'シャープペンシル','本','日用品');");

//        INSERT INTO ShoppingList VALUES (11,'歯ブラシ','本','日用品');
//        INSERT INTO ShoppingList VALUES (12,'タオル','枚','日用品');
//        INSERT INTO ShoppingList VALUES (13,'洗剤','本','日用品');
//        INSERT INTO ShoppingList VALUES (14,'シャンプー','本','日用品');
//        INSERT INTO ShoppingList VALUES (15,'単三電池','本','日用品');
//        INSERT INTO ShoppingList VALUES (16,'納豆','パック','食べ物');
//        INSERT INTO ShoppingList VALUES (17,'鮭の切り身','切れ','食べ物');");
        String sql = sb.toString();

        //SQL実行
        db.execSQL(sql);


    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
    }

}

