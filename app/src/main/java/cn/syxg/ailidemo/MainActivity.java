package cn.syxg.ailidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MyGridView myGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myGridView = findViewById(R.id.mGridView);

        myGridView.setAdapter(new MyAdapter(this));
    }
}
