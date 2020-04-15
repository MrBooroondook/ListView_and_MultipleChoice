package mr.booroondook.listview_and_multiplechoice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] lastNames = getResources().getStringArray(R.array.last_names);
        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_multiple_choice,
                lastNames));
    }
}
