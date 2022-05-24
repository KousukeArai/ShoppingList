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
        String sql = sb.toString();

        //SQL実行
        db.execSQL(sql);

        //インサート用SQL文字列の用意
        String addSQL = "INSERT INTO ShoppingLists (name, unit, category) VALUES" +

                "('たまねぎ', '個', '食べ物')," +
                "('トマト', '個', '食べ物')," +
                "('じゃがいも', '個', '食べ物')," +
                "('にんじん', '個', '食べ物')," +
                "('キャベツ', '個', '食べ物')," +
                "('レタス', '個', '食べ物')," +
                "('ねぎ', '本', '食べ物')," +
                "('ニラ', '本', '食べ物')," +
                "('だいこん', '本', '食べ物')," +
                "('なす', '本', '食べ物')," +
                "('きゅうり', '本', '食べ物')," +
                "('かぼちゃ', '個', '食べ物')," +
                "('もやし', '個', '食べ物')," +
                "('ほうれん草', '個', '食べ物')," +
                "('ピーマン', '個', '食べ物')," +
                "('りんご', '個', '食べ物')," +
                "('いちご', 'パック', '食べ物')," +
                "('みかん', '個', '食べ物')," +
                "('メロン', '個', '食べ物')," +
                "('スイカ', '個', '食べ物')," +
                "('レモン', '個', '食べ物')," +
                "('鮭', 'パック', '食べ物')," +
                "('サバ', 'パック', '食べ物')," +
                "('タラ', 'パック', '食べ物')," +
                "('牛肉','グラム','食べ物')," +
                "('豚肉','グラム','食べ物')," +
                "('鶏肉', 'グラム', '食べ物')," +
                "('お米', 'kg', '食べ物')," +
                "('パスタ', 'kg', '食べ物')," +
                "('パン', '個', '食べ物')," +
                "('シリアル', '個', '食べ物')," +
                "('チーズ', '個', '食べ物')," +
                "('お菓子', '個', '食べ物')," +
                "('水', '本', '飲み物')," +
                "('お茶', '本', '飲み物')," +
                "('紅茶' ,'パック', '飲み物')," +
                "('牛乳', '本', '飲み物')," +
                "('オレンジジュース', '本', '飲み物')," +
                "('コーラ', '本', '飲み物')," +
                "('コーヒー', '本', '飲み物')," +
                "('ビール', '本', '飲み物')," +
                "('焼酎', '本', '飲み物')," +
                "('日本酒', '本', '飲み物')," +
                "('ワイン', '本', '飲み物')," +
                "('塩', '個', '調味料')," +
                "('コショウ', '個', '調味料')," +
                "('砂糖', '個', '調味料')," +
                "('しょうゆ', '本', '調味料')," +
                "('酢', '本', '調味料')," +
                "('みりん', '本', '調味料')," +
                "('マヨネーズ', '本', '調味料')," +
                "('ケチャップ', '本', '調味料')," +
                "('サラダ油', '本', '調味料')," +
                "('ごま油', '本', '調味料')," +
                "('料理酒', '本', '調味料')," +
                "('キッチンペーパー', '個', '日用品')," +
                "('マスク', '個', '日用品')," +
                "('絆創膏', '個', '日用品')," +
                "('トイレットペーパー', 'ロール', '日用品')," +
                "('洗濯用洗剤', '本', '日用品')," +
                "('台所用洗剤', '本', '日用品')," +
                "('スポンジ', '個', '日用品')," +
                "('シャンプー', '本', '日用品')," +
                "('リンス', '本', '日用品')," +
                "('ボディソープ', '本', '日用品')," +
                "('石鹸', '個', '日用品')," +
                "('サランラップ', '個', '日用品')," +
                "('綿棒', '個', '日用品')," +
                "('ゴミ袋', '個', '日用品')";

        //SQL実行
        db.execSQL(addSQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
    }

}

