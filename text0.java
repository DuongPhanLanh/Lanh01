package BAI3;

import java.util.Scanner;

public class text0 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Danh_Sach_GD dsgd = new Danh_Sach_GD();
			
			while (true) {
				System.out.println("MENU GIAO DICH");
				System.out.println("1. Nhap loai giao dich\n"
						+ "2. in danh sach giao dich\n");
				
				String luaChon = sc.nextLine();
				switch (luaChon) {
				case "1":
					System.out.println("a. Nhap Giao dich Vang\n"
							+ "b. Nhap giao dich Tien Te\n");
					String type = sc.nextLine();
					switch (type) {
					case "a":
						System.out.println("Nhap Ma Giao dich");
						String maGD = sc.nextLine();
						System.out.println("Nhap Ngay giao dich");
						int ngay = sc.nextInt();
						System.out.println("Nhap don gia");
						double donGia = sc.nextDouble();
						System.out.println("Nhap so luong");
						int sl = sc.nextInt();
						System.out.println("Nhap loai vang");
						String loaiVang = sc.next();
						
						Giao_Dich_Vang gdv = new Giao_Dich_Vang(maGD, ngay, donGia, sl, loaiVang);
						dsgd.Them(gdv);
						System.out.println(gdv.toString());
						
						System.out.println("Tong tien Vang");
						gdv.thanhTien();
						break;
						
					case "b":
						System.out.println("Nhap Ma Giao dich");
						String maGD1 = sc.nextLine();
						System.out.println("Nhap Ngay giao dich");
						int ngay1 = sc.nextInt();
						System.out.println("Nhap don gia");
						double donGia1 = sc.nextDouble();
						System.out.println("Nhap so luong");
						int sl1 = sc.nextInt();
						System.out.println("Nhap ti gia");
						double tiGia = sc.nextDouble();
						System.out.println("Nhap loai Tien Te ( 1. EURO/ 1. USD/ 2. VN) ");
						String ltt = sc.next();
						
						Giao_Dich_Tien_Te gdtt = new Giao_Dich_Tien_Te(maGD1, ngay1, donGia1, sl1, tiGia, ltt);
						dsgd.Them(gdtt);
						System.out.println(gdtt.toString());
						
						int lc = 0; lc = sc.nextInt();
						if(lc==1) {
							System.out.println("Tong tien EURO/ USD");
							gdtt.TienEuro_USD();
						}else if(lc ==2) {
							System.out.println("Tong tien VN");
							gdtt.TienVN();
						}
						
						break;

					default:
						System.out.println("Loi");
						break;
					}
				case "2": 
					dsgd.inDanhSach();
					break;
				case "3": 
					dsgd.size();
					break;

				default:
					System.out.println("Nhap lai");
					break;
				}
			}
		}
	}
}
