package com.websarva.wings.android.shoppinglist.ui.dashboard;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.websarva.wings.android.shoppinglist.MainActivity;
import com.websarva.wings.android.shoppinglist.MyData;
import com.websarva.wings.android.shoppinglist.R;
import com.websarva.wings.android.shoppinglist.TableAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DashboardFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //このフラグメントが所属するアクティビティオブジェクトを取得
        Activity parentActivity = getActivity();
        //フラグメントで表示する画面をXMLファイルからインフレートする
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        //画面部品リストビューを取得
        ListView lvTable = view.findViewById(R.id.lvTable);
        // メインアクティビティが持つリストの取得
        List<Map<String, Object>> dbList = MainActivity.getList();

        List<MyData> list = new ArrayList<>();

        int i = 0;
        while(i < dbList.size()){
            MyData myData = new MyData();
            myData.set_textName((String) dbList.get(i).get("name"));
            myData.setChecked(false);
            list.add(myData);
            i++;
        }

        TableAdapter adapter = new TableAdapter(parentActivity,R.layout.table,list);
        lvTable.setAdapter(adapter);

        // イベント
        lvTable.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });

        view.findViewById(R.id.btAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*



                // リストビューのチェック状態を確認し、チェックのあるものを削除
                ListView lv = view.findViewById(R.id.lvTable);
                List<Integer> checked_list = new ArrayList<>();
                int cnt = lv.getCount();
                for (int i = 0; i < cnt; i++) {
                    TableAdapter adapter = (TableAdapter) lv.getAdapter();
                    checked_list.add(i);
                    if (adapter.checkList.get(i)) {
                            dbList.remove(i);
                        cnt--;
                    }
                }
                // 更新
                adapter.notifyDataSetChanged();
*/


            }

        });
        return view;


    }
}