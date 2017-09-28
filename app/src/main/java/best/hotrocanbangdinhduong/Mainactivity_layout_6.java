package best.hotrocanbangdinhduong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 28/09/2017.
 */

public class Mainactivity_layout_6 extends AppCompatActivity {
    private Button btnback6;
    private Button btnnext6;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_6);
        Button btnback6= (Button) findViewById(R.id.btn_back);
        btnback6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenMainactivity_layout_5();
            }

            private void doOpenMainactivity_layout_5() {
                Intent myIntent =new Intent(Mainactivity_layout_6.this,Mainactivity_layout_5.class);
                startActivity(myIntent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layout_6, menu);
        return true;
}}