package com.example.prac02;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import java.util.ArrayList;

public class StaffViewModel extends ViewModel {
    private final MutableLiveData<List<Staff>> staffList;
    private final MutableLiveData<String> message = new MutableLiveData<>();
    private List<Staff> currentList;


    public StaffViewModel() {

        staffList = new MutableLiveData<>();
        //initData();
    }

//    private void initData() {
//        currentList = new ArrayList<>();
//        currentList.add(new Staff("1","dung","03","1000"));
//        staffList.setValue(currentList);
//    }

    public MutableLiveData<List<Staff>> getStaffList() {
        return staffList;
    }

    public MutableLiveData<String> message(){
        return message;
    }

    public void addStaff(Staff staff){
        currentList = staffList.getValue();
        if(currentList != null){
            currentList.add(staff);
            staffList.setValue(currentList);
            message.setValue("Sau khi bam nut them");
        }
    }

    public void checkInput(String id, String name, String bd, String salary){
        if(id.isEmpty() || name.isEmpty() || bd.isEmpty() || salary.isEmpty())
            message.setValue("Chua nhap du lieu");
        else message.setValue(("Nhap du lieu nhung chua an nut them"));
    }


}
