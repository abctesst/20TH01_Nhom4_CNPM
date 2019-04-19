package giaiphuongtrinh;
public class Giaiphuongtrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)             
    {
        Giaodien g = new Giaodien();//gọi lớp giao diện tạo mới lớp giao diện
        g.xuat("Giai phuong trinh bac nhat ax+b=0");//gọi phương thức giải
        float a=g.NhapSothuc("Nhap a: ");//goi phương thức nhập đã xây dựng
        float b=g.NhapSothuc("Nhap b: ");//goi phương thức nhập đã xây dựng
        PTbac_1 p = new  PTbac_1(a,b);//gọi phương thức truyền giá trị  a,b vào vì đã có constructor có tham số
       // g.xuat(p.ketqua());     //xuất kết quả  
        String kq=p.ketqua();
        g.xuat(kq);
    }
    
}
