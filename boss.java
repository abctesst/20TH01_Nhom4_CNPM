/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaiphuongtrinh;

/**
 *
 * @author Tran Thang
 */
public class boss {
	private Giaodien gd;
	private PTbac_1 ptb1;
	public boss(Giaodien gd, PTbac_1 ptb1) {
		this.gd = gd;
		this.ptb1 = ptb1;
	}
	
	public void xuat() {
		String kq = ptb1.ketqua();
		gd.xuat(kq);
	}
	
	public void nhaphsA() {
		float a = gd.NhapSothuc("nhap a: ");
		ptb1.setA(a);
	}
	
	public void nhaphsB() {
		float b = gd.NhapSothuc("nhap b: ");
		ptb1.setA(b);
	}
	
	public void nhap() {
		nhaphsA();
		nhaphsB();
	}
	

}
