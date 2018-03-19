/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkhotel;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author hoanganh
 */
public class HoaDon {
    protected String maHoaDon, tenKH, maPhong;
    protected LocalDate ngayHoaDon;
    protected double donGia, thanhTien;
    
    // setters
    protected void setMaHoaDon(String mhd){
        this.maHoaDon = mhd;
    }
    
    protected void setTenKH(String name){
        this.tenKH = name;
    }
    
    protected void setMaPhong(String maP){
        this.maPhong = maP;
    }
    
    protected void setNgayHoaDon(int ngay, int thang, int nam){
        this.ngayHoaDon = LocalDate.of(nam, thang, ngay);
    }
    
    protected void setDonGia(double dg){
        this.donGia = dg;
    }
    
    protected void setThanhTien(double tt){
        this.thanhTien = tt;
    }
    //getters
    protected String getMaHoaDon(){
        return this.maHoaDon;
    }
    
    protected String getTenKH(){
        return this.tenKH;
    }
    
    protected String getMaPhong(){
        return this.maPhong;
    }
    
    protected LocalDate getNgayHoaDon(){
        return this.ngayHoaDon;
    }
    
    protected double getDonGia(){
        return this.donGia;
    }
    
    protected double getThanhTien(){
        return this.thanhTien;
    }
    //constructor
    protected HoaDon(){
        this.setMaPhong("");
        this.setTenKH("");
        this.setMaHoaDon("");
        this.setNgayHoaDon(1, 1, 1);
        this.setDonGia(0);
    }
    
    protected HoaDon(String mhd, String name, String maP, int ngay, int thang, int nam, double dg){
        this.setMaHoaDon(mhd);
        this.setTenKH(name);
        this.setMaPhong(maP);
        this.setNgayHoaDon(nam, thang, ngay);
        this.setDonGia(dg);
    }
    
    //methods
    protected void nhapHoaDon(){
        this.setMaHoaDon(JOptionPane.showInputDialog(null, "Ma Hoa Don: "));
        this.setTenKH(JOptionPane.showInputDialog(null, "Ten Khach Hang: "));
        this.setMaPhong(JOptionPane.showInputDialog(null, "Ma Phong: "));
        int ngay = Integer.parseInt(JOptionPane.showInputDialog("Ngay nhap: "));
        int thang = Integer.parseInt(JOptionPane.showInputDialog("Thang nhap: "));
        int nam = Integer.parseInt(JOptionPane.showInputDialog("Nam nhap: "));
        this.setNgayHoaDon(ngay, thang, nam);
        this.setDonGia(Double.parseDouble(JOptionPane.showInputDialog("Don Gia: ")));
    }
    
    protected String xuatHoaDon(){
        return "Ma Hoa Don: " + this.getMaHoaDon() + "\nTen Khach Hang: "+ this.getTenKH()
                + "\nMa Phong: " + this.getMaPhong() + "\nNgay Nhap: " + this.getNgayHoaDon().toString()
                + "\nDon Gia: " + this.getDonGia();
    }
}
