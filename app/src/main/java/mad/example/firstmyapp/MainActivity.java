package mad.example.firstmyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;




public class MainActivity extends AppCompatActivity {

    public static final String Extra_Message = "com.example.application.Extra_Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayActivity();

            }
        });

    }
        public void DisplayActivity(){
            EditText editText = (EditText)findViewById(R.id.editText);
            String text  = editText.getText().toString();

            Intent intent = new Intent(this,DisplayMessageActivity.class);
            intent.putExtra(Extra_Message,text);
            startActivity(intent);



        }


        }



