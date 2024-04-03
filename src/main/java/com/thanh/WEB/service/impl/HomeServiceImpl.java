package com.thanh.WEB.service.impl;
import com.thanh.WEB.model.Home;
import com.thanh.WEB.repository.HomeRepository;
import com.thanh.WEB.service.HomeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;
import java.util.List;
@Service
@Transactional
public class HomeServiceImpl implements HomeService{
    @Autowired
    private HomeRepository homeRepository;
    @Override
    public List<Home> findAll() {
        return homeRepository.findAll();
    }

    @Override
    public Page<Home> findAll(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo - 1, 6);
        return homeRepository.findAll(pageable);
    }

    @Override
    public Home save(MultipartFile imageHome, Home home) {
        Home newHome = new Home();
        try {
            if (imageHome == null) {
                newHome.setImgSrc(null);
            } else {
                newHome.setImgSrc(Base64.getEncoder().encodeToString(imageHome.getBytes()));
            }
            newHome.setTitle(home.getTitle());
            newHome.setLocation(home.getLocation());
            newHome.setPrice(home.getPrice());
            newHome.setSale(home.getSale());
            newHome.setRent(home.getRent());
            newHome.setBedrooms(home.getBedrooms());
            newHome.setBathrooms(home.getBathrooms());

            return homeRepository.save(newHome);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Home update(MultipartFile imageProduct, Home home) {
        return null;
    }
}
