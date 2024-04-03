package com.thanh.WEB.model;


import jakarta.persistence.*;

@Entity
@Table(name="home")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="title")
    private String title;
    @Column(name="location")
    private String location;
    @Column(name="price")
    private double price;
    @Lob
    @Column(name="img_src", columnDefinition = "MEDIUMBLOB")
    private String imgSrc;
    @Column(name="sale")
    private Integer sale;
    @Column(name="rent")
    private Integer rent;
    @Column(name="bedrooms")
    private Integer bedrooms;
    @Column(name="bathrooms")
    private Integer bathrooms;
    @Column(name="sqft")
    private Integer sqft;
//

    public Home() {
    }
    //

    public Home(String title, String location, double price, String imgSrc, Integer sale, Integer rent, Integer bedrooms, Integer bathrooms, Integer sqft) {
        this.title = title;
        this.location = location;
        this.price = price;
        this.imgSrc = imgSrc;
        this.sale = sale;
        this.rent = rent;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.sqft = sqft;
    }
    //

    public Home(Long id, String title, String location, double price, String imgSrc, Integer sale, Integer rent, Integer bedrooms, Integer bathrooms, Integer sqft) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.price = price;
        this.imgSrc = imgSrc;
        this.sale = sale;
        this.rent = rent;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.sqft = sqft;
    }
    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getSqft() {
        return sqft;
    }

    public void setSqft(Integer sqft) {
        this.sqft = sqft;
    }
}
