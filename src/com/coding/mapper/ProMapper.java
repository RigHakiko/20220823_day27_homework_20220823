package com.coding.mapper;

import com.coding.model.Pro;

import java.util.List;

public interface ProMapper {
    List<Pro> selectDynamic(Pro pro);
}
