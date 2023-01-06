package com.emsi.geo;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.emsi.geo.beans.Restaurant;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import com.emsi.geo.beans.Position;
import com.emsi.geo.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private double longitude, latitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        longitude = this.getIntent().getDoubleExtra("longitude", 0.0);
        latitude = this.getIntent().getDoubleExtra("latitude", 0.0);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng positionOnMap;
        for (Restaurant p:
                (List<Restaurant>) this.getIntent().getSerializableExtra("positions")) {
           positionOnMap = new LatLng(p.getLatitude(), p.getLongitude());
            mMap.addMarker(new MarkerOptions().position(positionOnMap).title("position " + p.getNom()));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(positionOnMap));
        }
    }
}