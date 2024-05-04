/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykinhdoanhdochoitreem;

import java.io.Serializable;
import java.util.Scanner;

public class DOCHOIBAN extends DoChoi implements Serializable{
    private float Giamgia;
    
    public DOCHOIBAN(){
        Giamgia = 0;
        
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap giam gia: ");
        Giamgia = sc.nextFloat();
    }
    public void xuat(){
        super.xuat();
        System.out.printf("%5.1f", Giamgia);
        System.out.printf("%6.1f", TinhTienGG());
    }
    public float TinhTienGG(){
        return Gia * SoLuong * Giamgia;
    }
}
