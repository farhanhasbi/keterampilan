package windows.example.m.tugasketerampilan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView rvice;
    private ArrayList<BR> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rvice = findViewById(R.id.rv_ice);
        rvice.setHasFixedSize(true);

        list.addAll(BRData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvice.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewAdapter = new CardViewAdapter(list);
        rvice.setAdapter(cardViewAdapter);
    }
}
