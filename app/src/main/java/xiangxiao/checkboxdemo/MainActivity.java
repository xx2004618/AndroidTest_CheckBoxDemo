package xiangxiao.checkboxdemo;

import android.icu.text.CollationKey;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxBasketball;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxBasketball = (CheckBox) findViewById(R.id.checkboxBasketball);
        checkBoxBasketball.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // get the content in checkbox
                    String text = checkBoxBasketball.getText().toString();
                    Log.i("tag", text);
                }
            }
        });
    }
}
