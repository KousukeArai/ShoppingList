package com.websarva.wings.android.shoppinglist;

import android.database.Cursor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CursorToList {
    public static List makeList (Cursor cursor) {

        List list =MainActivity.createList();


        //データベースから取得した値を格納する変数の用意。データがなかった時のための初期値も用意
        int _id = 0;
        String name = "";
        String unit = "";
        String category = "";
        //SQL実行の戻り値であるカーソルオブジェクトをループさせてデータベース内のデータを取得
        while (cursor.moveToNext()) {
            Map<String, Object> map = new HashMap();
            //カラムのインデックス値を取得
            int idxId = cursor.getColumnIndex("_id");
            _id = Integer.parseInt(cursor.getString(idxId));
            map.put("_id", _id);

            int idxName = cursor.getColumnIndex("name");
            name = cursor.getString(idxName);
            map.put("name", name);

            int idxUnit = cursor.getColumnIndex("unit");
            unit = cursor.getString(idxUnit);
            map.put("unit", unit);

            int idxCategory = cursor.getColumnIndex("category");
            category = cursor.getString(idxCategory);
            map.put("category", category);

            map.put("check", false);

            list.add(map);


        }
        return list;
    }
}
