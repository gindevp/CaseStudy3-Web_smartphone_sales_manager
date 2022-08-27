package com.example.tentenshop.model;

public class SanPham{
    private int id;
    private String maSanPham;
    private String tenSanPham;
    private int namBaoHanh;
    private double trongLuongSanPham;
    private String moTa;
    private int soLuongSanPhamTon;
    private int giaNhap;
    private int giaBan;
    private int id_DongSanPham;

    public SanPham() {
    }

    public SanPham(int id, String maSanPham, String tenSanPham, int namBaoHanh, double trongLuongSanPham, String moTa, int soLuongSanPhamTon, int giaNhap, int giaBan, int id_DongSanPham) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.namBaoHanh = namBaoHanh;
        this.trongLuongSanPham = trongLuongSanPham;
        this.moTa = moTa;
        this.soLuongSanPhamTon = soLuongSanPhamTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.id_DongSanPham = id_DongSanPham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(int namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }

    public double getTrongLuongSanPham() {
        return trongLuongSanPham;
    }

    public void setTrongLuongSanPham(double trongLuongSanPham) {
        this.trongLuongSanPham = trongLuongSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongSanPhamTon() {
        return soLuongSanPhamTon;
    }

    public void setSoLuongSanPhamTon(int soLuongSanPhamTon) {
        this.soLuongSanPhamTon = soLuongSanPhamTon;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getId_DongSanPham() {
        return id_DongSanPham;
    }

    public void setId_DongSanPham(int id_DongSanPham) {
        this.id_DongSanPham = id_DongSanPham;
    }
}
