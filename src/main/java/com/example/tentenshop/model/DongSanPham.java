package com.example.tentenshop.model;

public class DongSanPham {

    private int id;
    private String maDongSanPham;
    private String tenDongSanPham;

    public DongSanPham(){}

    public DongSanPham(int id, String maDongSanPham, String tenDongSanPham) {
        this.id = id;
        this.maDongSanPham = maDongSanPham;
        this.tenDongSanPham = tenDongSanPham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaDongSanPham() {
        return maDongSanPham;
    }

    public void setMaDongSanPham(String maDongSanPham) {
        this.maDongSanPham = maDongSanPham;
    }

    public String getTenDongSanPham() {
        return tenDongSanPham;
    }

    public void setTenDongSanPham(String tenDongSanPham) {
        this.tenDongSanPham = tenDongSanPham;
    }
}
