package BAI3;

import java.util.ArrayList;


public class Danh_Sach_GD {
	
	private ArrayList<Giao_Dich> giaodich;
	
	public Danh_Sach_GD() {
		this.giaodich = new ArrayList<>();
	}
	

	// them Hinh
	public void Them(Giao_Dich gd) {
		this.giaodich.add(gd);
	}
	
	// in Danh Sach
	public void inDanhSach() {
		for(Giao_Dich h1 : giaodich) {
			System.out.println(h1);
		}
	}
	
	
	public int size() {
		return this.giaodich.size();
	}
	
	
}
