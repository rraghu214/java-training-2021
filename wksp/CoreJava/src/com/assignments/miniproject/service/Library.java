package com.assignments.miniproject.service;

import com.assignments.miniproject.bean.MediaItem;
import com.assignments.miniproject.exception.ItemException;

import java.util.ArrayList;

public interface Library {

    void addItem(MediaItem item);
    boolean searchItemById(int id) throws ItemException;
    ArrayList<MediaItem> getItems();
    MediaItem updateItem(MediaItem item) throws ItemException;
    boolean deleteItem(int id) throws ItemException;
}
