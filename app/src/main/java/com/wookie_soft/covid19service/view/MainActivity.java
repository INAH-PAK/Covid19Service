package com.wookie_soft.covid19service.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.CameraPosition;
import com.naver.maps.map.MapFragment;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.NaverMapOptions;
import com.naver.maps.map.NaverMapSdk;
import com.naver.maps.map.OnMapReadyCallback;
import com.wookie_soft.covid19service.R;
import com.wookie_soft.covid19service.databinding.ActivityMainBinding;
import com.wookie_soft.covid19service.viewModel.FacilityViewModel;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    ActivityMainBinding binding;

    // 참고 블로그
    // : https://github.com/Corona-Respiratorycare/Corona_Respiratorycare_android


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // 퍼미션 코드 필요

        // ViewModel : https://developer.android.com/topic/libraries/architecture/viewmodel#implement
        FacilityViewModel vm = new ViewModelProvider(this).get(FacilityViewModel.class);
        vm.getDatas().observe(this, datas -> {
            // 이 데이터들이 변할 때, 업데이트 될 내용을 정리.
        });

        // naver map 설정


        NaverMapSdk.getInstance(this).setClient(
                new NaverMapSdk.NaverCloudPlatformClient("n68azqu7ey"));
        FragmentManager fm = getSupportFragmentManager();
        MapFragment map = (MapFragment) fm.findFragmentById(R.id.main_map);
        if(map == null){
            map = map.newInstance();
            fm.beginTransaction().add(R.id.main_map, map).commit();
        }

        map.getMapAsync(this);


    }

    @Override // 네이버 맵 객체 획득 후, 이벤트 코드.
    public void onMapReady(@NonNull NaverMap naverMap) {


        naverMap.setNightModeEnabled(true);// 이쁜 야간모드 지원 ㅎㅎ
        // 요기서 마커 불러오고.. 말풍선도 만들기..


    }
}