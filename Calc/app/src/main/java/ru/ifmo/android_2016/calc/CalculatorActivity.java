package ru.ifmo.android_2016.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;


public final class CalculatorActivity extends Activity {
    private TextView resultView;
    private String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        resultView = (TextView) findViewById(R.id.result);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.clear:
                        text = "";
                        break;
                    case R.id.eqv:
                        text = "TODO";
                        break;
                    default:
                        text += ((Button) v).getText();
                }
                resultView.setText(text);
            }
        };

        findViewById(R.id.d0).setOnClickListener(listener);
        findViewById(R.id.d1).setOnClickListener(listener);
        findViewById(R.id.d2).setOnClickListener(listener);
        findViewById(R.id.d3).setOnClickListener(listener);
        findViewById(R.id.d4).setOnClickListener(listener);
        findViewById(R.id.d5).setOnClickListener(listener);
        findViewById(R.id.d6).setOnClickListener(listener);
        findViewById(R.id.d7).setOnClickListener(listener);
        findViewById(R.id.d8).setOnClickListener(listener);
        findViewById(R.id.d9).setOnClickListener(listener);
        findViewById(R.id.dot).setOnClickListener(listener);
        findViewById(R.id.add).setOnClickListener(listener);
        findViewById(R.id.sub).setOnClickListener(listener);
        findViewById(R.id.mul).setOnClickListener(listener);
        findViewById(R.id.div).setOnClickListener(listener);

    }


    private void setListener(Button host) {
        host.setOnClickListener(regularListener);
    }

}
