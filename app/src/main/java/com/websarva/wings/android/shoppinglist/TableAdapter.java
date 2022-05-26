package com.websarva.wings.android.shoppinglist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// カスタムアダプター
public class TableAdapter extends  SimpleAdapter{

    // 外部から呼び出し可能なマップ
    public Map<Integer,Boolean> checkList = new HashMap<>();

    public TableAdapter(Context context, List<? extends Map<String, ?>> data,
                     int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);

        // 初期値を設定する
        for(int i=0; i<data.size();i++){
            Map map = (Map)data.get(i);
            checkList.put(i,(Boolean)map.get("check"));
        }
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        CheckBox ch = view.findViewById(R.id.cbTable);

        // チェックの状態が変化した場合はマップに記憶する
        ch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkList.put(position,isChecked);
            }
        });
        return view;
    }
}

