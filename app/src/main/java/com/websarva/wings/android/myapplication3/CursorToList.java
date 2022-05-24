package com.websarva.wings.android.myapplication3;

        import android.database.Cursor;

        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class CursorToList {
    public static List makeList (Cursor cursor) {

        List _buyList =MainActivity.createList();


        //データベースから取得した値を格納する変数の用意。データがなかった時のための初期値も用意
        String name;
        String unit;
        //SQL実行の戻り値であるカーソルオブジェクトをループさせてデータベース内のデータを取得
        while (cursor.moveToNext()) {
            Map<String, Object> map = new HashMap();
            //カラムのインデックス値を取得
            int idxName = cursor.getColumnIndex("name");
            name = cursor.getString(idxName);
            map.put("name", name);

            int idxUnit = cursor.getColumnIndex("unit");
            unit = cursor.getString(idxUnit);
            map.put("unit", unit);

            map.put("check", false);

            _buyList.add(map);


        }
        return _buyList;
    }
}
