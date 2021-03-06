package com.websarva.wings.android.shoppinglist.ui.home;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.websarva.wings.android.shoppinglist.MainActivity;
import com.websarva.wings.android.shoppinglist.MyAdapter;
import com.websarva.wings.android.shoppinglist.MyData;
import com.websarva.wings.android.shoppinglist.R;
import com.websarva.wings.android.shoppinglist.TableAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HomeFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //このフラグメントが所属するアクティビティオブジェクトを取得
        Activity parentActivity = getActivity();
        //フラグメントで表示する画面をXMLファイルからインフレートする
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //画面部品リストビューを取得
        ListView lvBuyList = view.findViewById(R.id.lvBuyList);
        // メインアクティビティが持つリストの取得
        List<Map<String, Object>> buyList = MainActivity.buyList;

        List<MyData> list = new ArrayList<>();

        int i = 0;
        while(i < buyList.size()){
            MyData myData = new MyData();
            myData.set_textName((String) buyList.get(i).get("name"));
            myData.setChecked(false);
            list.add(myData);
            i++;
        }

        MyAdapter adapter = new MyAdapter(parentActivity,R.layout.list,list);
        lvBuyList.setAdapter(adapter);

        // イベント
        lvBuyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });

        view.findViewById(R.id.btEnd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//
//                // リストビューのチェック状態を確認し、チェックのあるものを削除
//                ListView lv = view.findViewById(R.id.lvBuyList);
//                List<Integer> checked_list = new ArrayList<>();
//                int cnt = lv.getCount();
//                for (int i = 0; i < cnt; i++) {
//                    MyAdapter adapter = (MyAdapter) lv.getAdapter();
//                    checked_list.add(i);
//                    if (adapter.checkList.get(i)) {
//                        list.remove(i);
//                        cnt--;
//                    }
//                }
//                // 更新
//                adapter.notifyDataSetChanged();
//


            }
        });
        return view;
    }
}