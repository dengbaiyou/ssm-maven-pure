package com.java.service;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<Map<String, Object>> findUser(Integer pageNum, Integer pageSize);
}
