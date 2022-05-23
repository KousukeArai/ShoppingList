package com.websarva.wings.android.myapplication3.ui.dashboard;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.websarva.wings.android.myapplication3.MainActivity;
import com.websarva.wings.android.myapplication3.MyAdapter;
import com.websarva.wings.android.myapplication3.R;
import com.websarva.wings.android.myapplication3.databinding.FragmentDashboardBinding;

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
        List<Map<String, Object>> list = MainActivity.list;

        // Mapのキー
        String[] FROM = {"name", "check"};
        // リソースのコントロールID
        int[] TO = {R.id.tvTable, R.id.cbTable};

        // アダプターの設定
        MyAdapter adapter = new MyAdapter(parentActivity,
                list, R.layout.list, FROM, TO);
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

            }
        });
        return view;
    }
}