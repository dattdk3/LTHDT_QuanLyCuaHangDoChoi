package quanlykinhdoanhdochoitreem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class QuanLyKinhDoanhDoChoiTreEm {
 
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException  {
        DSHoaDon dshd = new DSHoaDon();
        DSNhanVien dsnv = new DSNhanVien();
        DSKhachHang dskh = new DSKhachHang();
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            System.out.println("\n***********MENU***********");
            System.out.println("1. Nhap va luu file danh sach nhan vien vao file nhanvien.dat");
            System.out.println("2. Nhap va luu file danh sach khach hang vao file khachhang.dat");
            System.out.println("3. Nhap danh sach hoa don");
            System.out.println("4. Doc file nhanvien.dat va xuat danh sach nhan vien");
            System.out.println("5. Doc file khachhang.dat va xuat danh sach khach hang");
            System.out.println("6. Xuat danh sach hoa don");
            System.out.println("7. Tinh tong tien tat ca hoa don");
            System.out.println("8. Tinh tong tien hoa don theo ngay");
            System.out.println("9. Tim kiem hoa don theo ma hoa don");
            System.out.println("10. Sap xep hoa don theo ma hoa don");
            System.out.println("11. Xoa hoa don theo ma hoa don");
            System.out.println("12. Them hoa don");
            System.out.println("13. Ghi danh sach hoa don vao file hoadon.dat");
            System.out.println("14. Doc danh sach hoa don tu file hoadon.dat");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            chon = sc.nextInt();
            switch(chon){
                    case 1 : {dsnv.nhap(); dsnv.luuFileNV();}    break;
                    case 2 : {dskh.nhapDSKH();  dskh.ghiDSKHfile();} break;
		    case 3 : dshd.nhapDSHD();   break;
                    case 4 : {dsnv.docFileNV();   dsnv.xuat();}  break;
                    case 5 : {dskh.docDSKHfile(); dskh.xuatDSKH(); } break;
                    case 6 : dshd.xuatDSHD();   break;
                    case 7 : dshd.tinhTongTien(); break;
                    case 8 : dshd.tinhTongTientheongay();  break;
                    case 9 : dshd.timkiem();      break;
                    case 10 : dshd.sapxep();	   break;
                    case 11 : dshd.xoa();         break;
                    case 12 : dshd.them();        break;
                    case 13 : dshd.ghiDSHDfile();  break;
                    case 14 : {dshd.docDSHDfile(); dshd.xuatDSHD();}  break;
                    case 0 : break;
                    default: System.out.print("Moi nhap lai!");  break;
			}
		}while(chon!=0);
    }
}
