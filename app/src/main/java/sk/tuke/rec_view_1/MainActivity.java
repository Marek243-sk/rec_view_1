package sk.tuke.rec_view_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecycleViewInterface{

    ArrayList<DbModel> dbModels = new ArrayList<>();
    int[] iconImages = {R.drawable.baseline_10k_24, R.drawable.baseline_10mp_24, R.drawable.baseline_11mp_24,
    R.drawable.baseline_123_24, R.drawable.baseline_12mp_24,R.drawable.baseline_13mp_24, R.drawable.baseline_14mp_24,
    R.drawable.baseline_15mp_24, R.drawable.baseline_16mp_24, R.drawable.baseline_17mp_24, R.drawable.baseline_18_up_rating_24,
    R.drawable.baseline_18mp_24, R.drawable.baseline_19mp_24, R.drawable.baseline_1k_24, R.drawable.baseline_1k_plus_24,
    R.drawable.baseline_20mp_24, R.drawable.baseline_21mp_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.myRecycleView);

        setUpDbModels();

        DbRecycleViewAdapter adapter = new DbRecycleViewAdapter(this, dbModels,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setUpDbModels() {
        String[] iconNames = getResources().getStringArray(R.array.icons_full_names);
        String[] iconNamesShort = getResources().getStringArray(R.array.icons_short_names);
        String[] iconNames1 = getResources().getStringArray(R.array.icons_1_names);

        for (int i = 0; i < iconNames.length && i < iconImages.length; i++) {
            dbModels.add(new DbModel(iconNames[i], iconNamesShort[i], iconNames1[i], iconImages[i]));
        }

    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this,)
    }
}