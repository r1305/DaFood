package comp.dafood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    CheckBox chk1,chk2,chk3,chk4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        chk1=(CheckBox)findViewById(R.id.ch_1);
        chk2=(CheckBox)findViewById(R.id.ch_2);
        chk3=(CheckBox)findViewById(R.id.ch_3);
        chk4=(CheckBox)findViewById(R.id.ch_4);

        chk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this, "Menu1", Toast.LENGTH_SHORT).show();
                chk1.setButtonDrawable(R.drawable.btn_desayuno);
                chk2.setEnabled(false);
                chk3.setEnabled(false);
                chk4.setEnabled(false);
            }
        });

        chk1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                chk1.setButtonDrawable(R.drawable.btn_almuerzo);
                chk2.setEnabled(true);
                chk3.setEnabled(true);
                chk4.setEnabled(true);
                return true;
            }
        });

        chk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this, "Menu2", Toast.LENGTH_SHORT).show();
                chk2.setButtonDrawable(R.drawable.btn_desayuno);
                chk1.setEnabled(false);
                chk3.setEnabled(false);
                chk4.setEnabled(false);
            }
        });

        chk2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                chk2.setButtonDrawable(R.drawable.btn_almuerzo);
                chk1.setEnabled(true);
                chk3.setEnabled(true);
                chk4.setEnabled(true);
                return true;
            }
        });

        chk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this, "Menu3", Toast.LENGTH_SHORT).show();
                chk3.setButtonDrawable(R.drawable.btn_desayuno);
                chk1.setEnabled(false);
                chk2.setEnabled(false);
                chk4.setEnabled(false);
            }
        });

        chk3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                chk3.setButtonDrawable(R.drawable.btn_almuerzo);
                chk1.setEnabled(true);
                chk2.setEnabled(true);
                chk4.setEnabled(true);
                return true;
            }
        });

        chk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this, "Menu4", Toast.LENGTH_SHORT).show();
                chk4.setButtonDrawable(R.drawable.btn_desayuno);
                chk1.setEnabled(false);
                chk2.setEnabled(false);
                chk3.setEnabled(false);
            }
        });

        chk4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                chk4.setButtonDrawable(R.drawable.btn_almuerzo);
                chk1.setEnabled(true);
                chk2.setEnabled(true);
                chk3.setEnabled(true);
                return true;
            }
        });
    }
}
