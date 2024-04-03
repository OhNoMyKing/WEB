package com.thanh.WEB.service;

import com.thanh.WEB.model.Home;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface HomeService {
    List<Home> findAll();
    Page<Home> findAll(Integer pageNo);
    //
    Home save(MultipartFile imageHome, Home home);

    Home update(MultipartFile imageHome, Home home);
}
