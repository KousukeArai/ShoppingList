package com.websarva.wings.android.shoppinglist;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class TableAdapter extends ArrayAdapter<MyData> {

    private LayoutInflater mLayoutInflater;

    public TableAdapter(Context context, int resourceId, List<MyData> objects) {
        super(context, resourceId, objects);
        // getLayoutInflater()メソッドはActivityじゃないと使えない
        mLayoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // getView()は各行を表示しようとした時に呼び出される
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // position のデータを取る
        MyData item = (MyData)getItem(position);
        // convertViewは使いまわされている可能性があるのでnullの時だけ新しく作る
        if (null == convertView) convertView = mLayoutInflater.inflate(R.layout.table, null);

        // MyDataのデータをViewの各ウィジェットにセットする
        TextView textView = convertView.findViewById(R.id.tvTable);
        textView.setText(item.get_textName());
        CheckBox checkBox = convertView.findViewById(R.id.cbTable);
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(item.isChecked());

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                MyData MyData = getItem(position);
                MyData.setChecked(b);
            }
        });

        return convertView;
    }
}