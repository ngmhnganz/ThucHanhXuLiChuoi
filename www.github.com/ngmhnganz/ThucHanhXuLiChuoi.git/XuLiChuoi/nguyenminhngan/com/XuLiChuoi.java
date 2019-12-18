package nguyenminhngan.com;

import java.util.Scanner;

public class XuLiChuoi {

	public static void main(String[] args) {
		int demChuHoa, demChuThuong, demChuSo, demNguyenAm, demKyTu, demKhoangTrang, demPhuAm;
		demChuHoa=0; demChuThuong=0; demChuSo=0; demNguyenAm=0;  demKyTu=0; demKhoangTrang=0; demPhuAm=0;
		System.out.println("Nhập vào chuỗi: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
        String ChuHoa="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ChuThuong ="abcdefghihjklmnopqrstuvwxyz";
        String ChuSo ="1234567890";
        String NguyenAm="ueoaiUEOAI";
        for (int i=0;i<s.length();i++) {
        	String the=s.substring(i,i+1);
        	if (ChuHoa.contains(the)) {
        		demChuHoa++;
        		if (NguyenAm.contains(the)) demNguyenAm++;
        		else demPhuAm++;
        	}
        	else if (ChuThuong.contains(the)) {
        		demChuThuong++;
        		if (NguyenAm.contains(the)) demNguyenAm++;
            	else demPhuAm++;
        	}
        	else if (ChuSo.contains(the)) demChuSo++;
        	else if (the.contains(" ")) demKhoangTrang++;
        	else demKyTu++;
        }
        System.out.println("Chữ hoa " + demChuHoa);
        System.out.println("Chữ thường " + demChuThuong);
        System.out.println("Chữ số "+demChuSo);
        System.out.println("Nguyên Âm "+demNguyenAm);
        System.out.println("Phụ Âm "+ demPhuAm);
        System.out.println("Ký Tự "+demKyTu);
        System.out.println("Khoảng trắng "+demKhoangTrang);
	}

}
