package com.websarva.wings.android.myapplication3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.websarva.wings.android.myapplication3.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

//    // Mapのキー
//    private final String[] FROM = {"title","name","check"};
//    // リソースのコントロールID
//    private final int[] TO = {R.id.textView, R.id.textView2,R.id.checkBox};

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





//        // イベント
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                MainActivity.this.setTitle(String.valueOf(position)+"番目がクリックされました。");
//            }
//        });
//
//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                // リストビューのチェック状態をログに出力する
//                ListView lv = findViewById(R.id.lvBuyList);
//                List<Integer> checked_list = new ArrayList<>();
//                int cnt = lv.getCount();
//                for(int i = 0;i < cnt;i++) {
//                    MyAdapter adapter = (MyAdapter)lv.getAdapter();
//                    View view = adapter.getView(i,null,lv);
//                    TextView tv = view.findViewById(R.id.textView);
//                    checked_list.add(i);
//                    if(adapter.checkList.get(i)) {
//                        Log.i("MyTAG", tv.getText().toString() + "はtrueです。");
//                        // 削除
//                        list.remove(i);
//                        cnt--;
//                    }else{
//                        Log.i("MyTAG", tv.getText().toString()+"はfalseです。");
//                    }
//                }
//                // 更新
//                adapter.notifyDataSetChanged();
//
//            }
//        });
    }
}

