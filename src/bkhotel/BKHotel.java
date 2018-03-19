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
public class BKHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = 0;
        QuanLyHoaDon qlhd = new QuanLyHoaDon();
        
        do{
            choice = Integer.parseInt(JOptionPane.showInputDialog("Chuong Trinh Quan Ly Hoa Don Khach San\n"
            + "0. Exit\n"
            + "1. Them Hoa Don Gio\n"
            + "2. Them Hoa Don Ngay\n"
            + "3. Xuat Danh Sach Hoa Don Gio\n"
            + "4. Xuat Danh Sach Hoa Don Ngay\n"
            + "5. Tinh Tong Thanh Tien Hoa Don Gio\n"
            + "6. Tinh Tong Thanh Tien Hoa Don Ngay\n"
            + "7. Tinh Trung Binh Thanh Tien Hoa Don Theo Thang\n"));
            switch(choice){
                case 0:
                    break;
                case 1:
                    qlhd.nhapHoaDon(0);
                    break;
                case 2:
                    qlhd.nhapHoaDon(1);
                    break;
                case 3:
                    qlhd.xuatDanhSachHoaDon(0);
                    break;
                case 4:
                    qlhd.xuatDanhSachHoaDon(1);
                    break;
                case 5:
                    qlhd.getTongThanhTienGio();
                    break;
                case 6:
                    qlhd.getTongThanhTienNgay();
                    break;
                case 7:
                    qlhd.thanhTienTBTheoThang();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Lua chon khong hop le!");
            }
        }while(choice != 0);
    }
}
