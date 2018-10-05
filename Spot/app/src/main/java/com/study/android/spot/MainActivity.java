package com.study.android.spot;

import android.location.Address;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity implements onMapReadyCallback {
    private static final String TAG = "lecture";

    TextView textView;
    SupportMapFragment mapFragment;
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback() {

            @Override
            public void onMapReady(final GoogleMap googleMap) {
                Log.d(TAG, "GoogleMap is ready");

                map = googleMap;

                map.setOnMapClickListener(new GoogleMap.onMapClickListener(){
                    @Override
                    public void onMapClick(LatLng point) {
                        MarkerOptions options = new MarkerOptions();

                        // 마커 타이틀
                        options.title("마커 좌표");
                        Double latitude = point.latitude;    //위도
                        Double longitude = point.longitude;  //경도

                        //마커의 간단한 텍스트(스니펫) 설정
                        options.snippet(latitude.toString() + "," + longitude.toString());

                        // LatLng 위도 경도 쌍을 나타냄
                        options.position(new LatLng(latitude, longitude));

                        // 마커(핀) 추가
                        googleMap.addMarker(options);
                    }
                });

                button.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String str= textView.getText().toString();
                        List<Address> addressList = null;
                        try {
                            // 입력한 텍스트를 지오코딩을 이용해 변환
                            addressList = geocoder.getFromLocationName(
                                    str, 10);    // 주소와 최대 검색 결과 갯수
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println(addressList.get(0).toString());
                        // 콤마를 기준으로 split
                        String []splitStr = addressList.get(0).toString().split(",");
                        String address = splitStr[0].substring(splitStr[0].indexOf("/""") +1, splitStr[0].length() -2);
                        System.out.println(address);

                        String latitude = splitStr[10].substring(splitStr[10].indexOf("=") +1);
                        String longitude = splitStr[12].substring(splitStr[12].indexOf("=") +1);
                        System.out.println(latitude);
                        System.out.println(longitude);

                        // 좌표 생성
                        LatLng point = new LatLng(Double.parseDouble(latitude), Double.parseDouble(longitude));

                        // 마커 생성
                        MarkerOptions mOptions = new MarkerOptions();
                        mOptions.title("search result");
                        mOptions.snippet(address);
                        mOptions.position(point);

                        // 마커 추가
                        map.addMarker(mOptions);

                        // 해당 좌표로 화면 줌
                        map.moveCamera(CameraUpdateFactory.newLatLngZoom(point, 15));
                    }
                });

                LatLng sydney = new LatLng(-34, 151);
                map.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
                map.moveCamera(CameraUpdateFactory.newLatLng(sydney));
            }
        });

        try {
            MapsInitializer.initialize(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 초기화
        String bannerid = getResources().getString(R.string.ad_unit_id_1);
        MobileAds.initialize(getApplicationContext(), bannerid);

        // 테스트 광고 부르기
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().
                addTestDevice("D0AD743B0E2B7064BC370DFE81452BE1").build();
        mAdView.loadAd(adRequest);
    }
    public void onBtnClicked(View v) {

    }
}
