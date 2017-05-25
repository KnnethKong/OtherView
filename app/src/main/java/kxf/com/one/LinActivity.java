package kxf.com.one;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kxf.com.otherview.R;

/**
 * Created by kxf on 2017/5/25.
 */
public class LinActivity extends AppCompatActivity {
    //x轴坐标对应的数据
    private List<String> xValue = new ArrayList<>();
    //y轴坐标对应的数据
    private List<Integer> yValue = new ArrayList<>();
    //折线对应的数据
    private Map<String, Integer> value = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lin_chat_main);
        for (int i = 0; i < 12; i++) {
            xValue.add((i + 1) + "月");
            value.put((i + 1) + "月", (int) (Math.random() * 181 + 60));//60--240
        }

        for (int i = 0; i < 6; i++) {
            yValue.add(i * 60);
        }

        LinChatView chartView = (LinChatView) findViewById(R.id.chartview);
        chartView.setValue(value, xValue, yValue);
    }
}
