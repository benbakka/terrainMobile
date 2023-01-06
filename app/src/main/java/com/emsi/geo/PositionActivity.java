package com.emsi.geo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.List;

import com.emsi.geo.adapters.PositionAdpater;
import com.emsi.geo.beans.Position;
import com.emsi.geo.beans.Restaurant;

public class PositionActivity extends AppCompatActivity {
    private PositionAdpater positionAdpater;
    private ConstraintLayout layout;
    private RecyclerView rvPositon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position);

        this.rvPositon = findViewById(R.id.rv_position);
        this.layout = findViewById(R.id.position_activity_layout);
        rvPositon.setLayoutManager(new LinearLayoutManager(this));
        List<Restaurant> positions = (List<Restaurant>) this.getIntent().getSerializableExtra("positions");
        this.positionAdpater = new PositionAdpater(this, positions);
        rvPositon.setAdapter(positionAdpater);
    }
}