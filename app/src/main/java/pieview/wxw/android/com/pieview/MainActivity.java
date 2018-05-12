package pieview.wxw.android.com.pieview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        PieView pieView = findViewById(R.id.pieview1);
        List<PieView.PieData> list = new ArrayList<>();
        int[] colors = {R.color.color1, R.color.color2, R.color.color3, R.color.color4, R.color.color5};
        for(int i=0; i<5; i++){
            PieView.PieData pd = new PieView.PieData();

            pd.progress = (float) (Math.random() *500);
            pd.text = "进度：" + (int)pd.progress;
            pd.color = ContextCompat.getColor(this, colors[i]);
            if(pd.progress == 0) continue;

            list.add(pd);
        }
        pieView.setData(list);
    }
}
