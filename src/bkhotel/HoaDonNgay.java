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
public class HoaDonNgay extends HoaDon{
    private double soNgayThue;
    
    // setters
    public void setSoNgayThue(double days){
        this.soNgayThue = days;
    }
    // getters
    public double getSoNgayThue(){
        return this.soNgayThue;
    }
    // constructors
    public HoaDonNgay(){
        super();
        this.setSoNgayThue(0);
    }
    
    public HoaDonNgay(String mhd, String name, String maP, int ngay, int thang, int nam, 
            double dg, double days){
        super(mhd, name, maP, ngay, thang, nam, dg);
        this.setSoNgayThue(days);
    }
    // methods
    public void nhapHoaDon(){
        super.nhapHoaDon();
        this.setSoNgayThue(Double.parseDouble(JOptionPane.showInputDialog("So Ngay Thue: ")));
    }
    
    public double getThanhTien(){
        if(this.getSoNgayThue() <= 7) return this.getSoNgayThue() * this.getDonGia();
        else return this.getDonGia() * 7 + (this.soNgayThue - 7) * this.getDonGia() * 0.8;
    }
    
    public String xuatHoaDon(){
        return super.xuatHoaDon() + "\nSo Ngay Thue: "+ this.getSoNgayThue() 
                + "Thanh Tien: " + this.getThanhTien();
    }
}
