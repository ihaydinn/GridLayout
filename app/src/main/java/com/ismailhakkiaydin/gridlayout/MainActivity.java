package com.ismailhakkiaydin.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    private GridLayout pnl;
    private Button btn;

    private void init(){
        pnl = new GridLayout(this);
        pnl.setOrientation(GridLayout.VERTICAL);
        pnl.setColumnCount(4);
        pnl.setRowCount(3);

        for(int i = 0; i<=11; i++){
            btn= new Button(this);
            btn.setText("Deneme");
            btn.setWidth(120);
            btn.setHeight(90);
            pnl.addView(btn);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        setContentView(pnl);
    }
}
