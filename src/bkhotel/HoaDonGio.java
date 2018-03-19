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
public class HoaDonGio extends HoaDon{
    private double soGioThue;
    
    // setters
    public void setSoGioThue(double hours){
        this.soGioThue = hours;
    }
    // getters
    public double getSoGioThue(){
        return this.soGioThue;
    }
    //constructors
    public HoaDonGio(){
        super();
        this.setSoGioThue(0);
    }
    
    public HoaDonGio(String mhd, String name, String maP, int ngay, int thang, int nam, 
            double dg, double hours){
        super(mhd, name, maP, ngay, thang, nam, dg);
        this.setSoGioThue(hours);
    }
    //methods
    @Override
    public void nhapHoaDon(){
        super.nhapHoaDon();
        this.setSoGioThue(Double.parseDouble(JOptionPane.showInputDialog("So Gio Thue: ")));
    }
    
    @Override
    public double getThanhTien(){
        if(this.getSoGioThue() <= 24 ) return this.getSoGioThue() * this.getDonGia();
        else if(this.getSoGioThue() > 24 && this.getSoGioThue() < 30) return this.getDonGia() * 24;
        else return -1;
    }
    
    @Override
    public String xuatHoaDon(){
        return super.xuatHoaDon() + "\nSo Gio Thue: " + this.getSoGioThue()
                + "\nThanh Tien: " + this.getThanhTien();        
    }
}
