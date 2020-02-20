package com.robby.mobile_02_20192;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Robby
 */
public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.tv_output)
    TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        //  Make sure you use intent.hasExtra if you are using intent.putExtra on caller Activity
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && !bundle.isEmpty()) {
            String firstName = bundle.getString(MainActivity.KEY_FIRST);
            String lastName = bundle.getString(MainActivity.KEY_LAST);
            txtOutput.setText(String.format("%s %s", firstName, lastName));
        }
    }
}
