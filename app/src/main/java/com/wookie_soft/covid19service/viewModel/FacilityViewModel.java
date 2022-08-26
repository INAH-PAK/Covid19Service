package com.wookie_soft.covid19service.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wookie_soft.covid19service.model.FacilityData;

import java.util.List;

public class FacilityViewModel extends ViewModel {

    // ViewModel : 라이프사이클을 고려하여, UI 관련 데이터를 저장하고 관리하는 컴포넌트

    private MutableLiveData<List<FacilityData>> facilityDatas;
    public LiveData<List<FacilityData>> getDatas(){
        if(facilityDatas == null){
            facilityDatas = new MutableLiveData<List<FacilityData>>();
            loadFacilityDatas();
        }
        return facilityDatas;

    }

    private void loadFacilityDatas(){


    }


}
