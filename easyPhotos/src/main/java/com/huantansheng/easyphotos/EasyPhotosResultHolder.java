package com.huantansheng.easyphotos;

import com.huantansheng.easyphotos.models.album.entity.Photo;

import java.util.List;

public class EasyPhotosResultHolder {

    private EasyPhotosResultHolder() {

    }

    private static EasyPhotosResultHolder sInstance;

    public static EasyPhotosResultHolder getInstance() {
        if (sInstance == null) {
            sInstance = new EasyPhotosResultHolder();
        }
        return sInstance;
    }

    private List<Photo> resultList;

    public void setResult(List<Photo> list) {
        resultList = list;
    }

    public List<Photo> getResult() {
        return resultList;
    }

}

