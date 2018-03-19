/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkhotel;

import javax.swing.JOptionPane;

/**
 *
 * @author hoanganh
 */
public class QuanLyHoaDon {
    private HoaDon[] dsHoaDon = new HoaDon[100];
    private int[] loaiHoaDon = new int[100];
    private int soHoaDon = 0;
    private double tongThanhTienGio, tongThanhTienNgay;
    //getters
    public int getSoHoaDon(){
        return this.soHoaDon;
    }
    
    public double getTongThanhTienGio(){
        return this.tongThanhTienGio;
    }
    
    public double getTongThanhTienNgay(){
        return this.tongThanhTienNgay;
    }
    // methods
    public void nhapHoaDon(int mode){
        switch(mode){   // 0: hoa don gio, 1: hoa don ngay
            case 0: 
                this.dsHoaDon[soHoaDon] = new HoaDon();
                this.loaiHoaDon[soHoaDon] = 0;
                HoaDonGio hdg = new HoaDonGio();
                hdg.nhapHoaDon();
                this.dsHoaDon[soHoaDon++] = hdg;
                this.tongThanhTienGio += hdg.getThanhTien();
                break;
            case 1:
                this.dsHoaDon[soHoaDon] = new HoaDonGio();
                this.loaiHoaDon[soHoaDon] = 1;
                HoaDonNgay hdn = new HoaDonNgay();
                hdn.nhapHoaDon();
                this.dsHoaDon[soHoaDon++] = hdn;
                this.tongThanhTienNgay += hdn.getThanhTien();
                break;
            default:
        }
    }
    
    public void xuatDanhSachHoaDon(int mode){
        for(int i = 0; i < this.soHoaDon; i++){
            if(this.loaiHoaDon[i] == mode){
                System.out.println("--------------------/------/-----------------------");
                System.out.println(dsHoaDon[i].xuatHoaDon());
            }   
        }
    }
    
    public double thanhTienTBTheoThang(){
        double dgtb = 0, sum = 0;
        int count = 0;
        int thang = Integer.parseInt(JOptionPane.showInputDialog("Thang: "));
        int nam = Integer.parseInt(JOptionPane.showInputDialog("Nam: "));
        for(int i = 0; i < this.getSoHoaDon(); i++){
            if(dsHoaDon[i].ngayHoaDon.getMonthValue() == thang
                    && dsHoaDon[i].ngayHoaDon.getYear() == nam){
                count++;
                sum += dsHoaDon[i].getThanhTien();
            }
        }
        dgtb = sum/count;
        return dgtb;
    }
}
