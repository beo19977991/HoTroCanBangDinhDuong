package best.hotrocanbangdinhduong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 27/09/2017.
 */

public class Mainactivity_layout_3 extends AppCompatActivity {
    private Button btnback3;
    private Button btnnext3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_3);
        Button btnnext3= (Button) findViewById(R.id.btn_next);
        btnnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenMainactivity_layout_4();
            }

            private void doOpenMainactivity_layout_4() {
                Intent myIntent=new Intent(Mainactivity_layout_3.this,Mainactivity_layout_4.class);
                startActivity(myIntent);
            }
        });
        Button btnback3= (Button) findViewById(R.id.btn_back);
        btnback3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenMainactivity_layout_2();
            }

            private void doOpenMainactivity_layout_2() {
                Intent myIntent=new Intent(Mainactivity_layout_3.this,Mainactivity_layout_2.class);
                startActivity(myIntent);
            }
        });

            }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layout_3, menu);
        return true;
    }

}