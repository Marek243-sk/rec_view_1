package sk.tuke.rec_view_1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String name = getIntent().getStringExtra("NAME");
        String iconBig = getIntent().getStringExtra("ICON_BIG");
        String iconSmall = getIntent().getStringExtra("ICON_SMALL");
        String description = getIntent().getStringExtra("DESCRIPTION");
        int image = getIntent().getIntExtra("IMAGE",0);

        TextView nameTextView = findViewById(R.id.textView);
        TextView letter3TextView = findViewById(R.id.textView2);
        TextView letter1TextView = findViewById(R.id.textView3);
    }
}
