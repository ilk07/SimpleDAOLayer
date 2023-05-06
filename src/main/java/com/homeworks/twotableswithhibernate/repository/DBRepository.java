package com.homeworks.twotableswithhibernate.repository;

import java.util.List;

public interface DBRepository {
    List<String> getProductName(String name);
}
