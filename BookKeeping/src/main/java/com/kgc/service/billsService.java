package com.kgc.service;

import com.kgc.entity.Bills;
import com.kgc.entity.BillsExample;

import java.util.List;

public interface billsService {
    List<Bills> selectByExample2(BillsExample example);
    int insert(Bills record);
}
