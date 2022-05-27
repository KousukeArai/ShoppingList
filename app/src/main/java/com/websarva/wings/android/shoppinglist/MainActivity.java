package com.websarva.wings.android.shoppinglist;

import static com.websarva.wings.android.shoppinglist.CursorToList.makeList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.websarva.wings.android.shoppinglist.databinding.ActivityMainBinding;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //選択されたアイテムの主キーIDを表すフィールド
    private int _kaimonoID = -1;

    //選択されたアイテム名を表すフィールド
    private String _kaimonoName = "";
    private String _kaimonoUnit="";
    private String _kaimonoCategory="";

    //データベースヘルパーオブジェクト
    private DatabaseHelper _helper;

    //データベースの情報を格納するリスト
    private static List<Map<String,String>> _dbList = new ArrayList<>();
    //買い物リストを格納するリスト
    public static List<Map<String, Object>> buyList = new ArrayList<>();

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


        //DBヘルパーオブジェクトを生成
        _helper = new DatabaseHelper(MainActivity.this);
        SQLiteDatabase db = _helper.getWritableDatabase();

        //主キーによる検索SQL文字列の用意
        String sql = "SELECT * FROM ShoppingLists";
        //SQL実行
        Cursor cursor = db.rawQuery(sql, null);

        _dbList = makeList(cursor);

        Map<String,Object> map = new HashMap<>();
        map.put("title","NO.00001");
        map.put("name","あいうえお");
        map.put("check",false);
        buyList.add(map);

        map =  new HashMap<>();
        map.put("title","NO.00002");
        map.put("name","かきくけこ");
        map.put("check",false);
        buyList.add(map);

        map =  new HashMap<>();
        map.put("title","NO.00003");
        map.put("name","さしすせそ");
        map.put("check",false);
        buyList.add(map);

        map.put("title","NO.00004");
        map.put("name","あいうえp");
        map.put("check",false);
        buyList.add(map);

        map =  new HashMap<>();
        map.put("title","NO.00005");
        map.put("name","かきくけo");
        map.put("check",false);
        buyList.add(map);

        map =  new HashMap<>();
        map.put("title","NO.00006");
        map.put("name","さしすせそ");
        map.put("check",false);
        buyList.add(map);

    }

    @Override
    protected void onDestroy () {
        //DBヘルパーオブジェクトの解放
        _helper.close();
        super.onDestroy();
    }

    public static List<Map<String, String>> createList () {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        return list;

    }

    public static List getList() {
        return _dbList;
    }

    //オプションメニューの追加
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

//メニューインフレーターの取得
        MenuInflater inflater=getMenuInflater();
        //オプションメニュー用.xmlファイルをインフレート
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    }


/*
//    //リストがタップされた時の処理メソッド
//    private class ListItemClickListener implements AdapterView.OnItemClickListener {
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            //タップされた行番号をフィールドの主キーIDに代入
//            _kaimonoID = position;
//            //タップされた行のデータを取得。これがアイテム名となるのでフィールド代入
//            _kaimonoName = (String) parent.getItemAtPosition(position);
//            //アイテム名をひょうじするTextviewに表示アイテム名を設定
//            TextView tvKaimonoName = findViewById(R.id.tvKaimonoName);
//            tvKaimonoName.setText(_kaimonoName);
//            //「保存」ボタンをタップできるように設定
//            Button btnSave = findViewById(R.id.btnSave);
//            btnSave.setEnabled(true);
//
//
//        }
//    }
//    //保存ボタンがタップされた時の処理メソッド
//    public void onSaveButtonClick(View view) {
//        //アイテム名を「未選択」
//        TextView tvKaimonoName = findViewById(R.id.tvKaimonoName);
//        tvKaimonoName.setText(getString(R.string.tv_name));
//        //保存ボタンタップできないようにする
//        Button btnSave = findViewById(R.id.btnSave);
//        btnSave.setEnabled(false);
//
//
//
//
//    }


    //オプションメニューの追加
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

//        //データベースヘルパーオブジェクトからデータベース接続オブジェクトを取得
//        SQLiteDatabase db = _helper.getWritableDatabase();
//        //主キーによる検索SQL文字列の用意
//        String sql ="SELECT * FROM ShoppingLists WHERE category";
//        //SQL実行
//        Cursor cursor = db.rawQuery(sql, null);
//        //データベースから取得した値を格納する変数の用意。データがなかった時のための初期値も用意
//        CursorToList makeList
//
//        //SQL実行の戻り値であるカーソルオブジェクトをループさせてデータベース内のデータを取得
//        while (cursor.moveToNext()) {
//            //カラムのインデックス値を取得
//            int idxName = cursor.getColumnIndex("name");
//            name = getString(idxName);
//            int idxUnit = cursor.getColumnIndex("unit");
//            unit = getString(idxUnit);
//
//        }

        //メニューインフレーターの取得
        MenuInflater inflater=getMenuInflater();
        //オプションメニュー用.xmlファイルをインフレート
        inflater.inflate(R.menu.menu_list,menu);
        return true;
    }


    //メニューボタンを押したときの反応を定義するメソッド
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        boolean returnVal=true;

        int itemId= item.getItemId();
//DBヘルパーオブジェクトを生成
        _helper = new DatabaseHelper(MainActivity.this);
        SQLiteDatabase db = _helper.getWritableDatabase();
        String sql;
        Cursor cursor = null;
        switch (itemId){
            case R.id.menulisttabemono:
                //主キーによる検索SQL文字列の用意
                sql = "SELECT name,unit FROM kaimonomemos WHERE _category = 食べ物";
                //SQL実行
                cursor = db.rawQuery(sql, null);

                break;

            case  R.id.menulistnomimono:
//主キーによる検索SQL文字列の用意
                sql = "SELECT name,unit FROM kaimonomemos WHERE _category = 飲み物";
                //SQL実行
                cursor = db.rawQuery(sql, null);
                break;

            case R.id.menulistnitiyouhin:
//主キーによる検索SQL文字列の用意
                sql = "SELECT name, unit FROM kaimonomemos WHERE _category = 日用品";
                //SQL実行
                cursor = db.rawQuery(sql, null);
                break;


            default:

                returnVal=super.onOptionsItemSelected(item);
                break;


        }
        _dbList = makeList(cursor);

        String[] from = {"name", "unit"};
        int[] to = {android.R.id.text1, android.R.id.text2};
        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(), _dbList,
                android.R.layout.simple_list_item_1, from, to);

        _lvkaimono.setAdapter(adapter);
        //lvKaimonoにリスナ登録
        _lvkaimono.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        return returnVal;
    }
    //
    // --------------------
    // -----水谷追加分2終了-----
    // --------------------
    //

 */


