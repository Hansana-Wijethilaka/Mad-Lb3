package mad.example.firstmyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

    Intent intent = getIntent();
    String text = intent.getStringExtra(MainActivity.Extra_Message);
    TextView textview = findViewById(R.id.textView);
    textview.setText(text);


    }
}
