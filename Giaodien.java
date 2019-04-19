package giaiphuongtrinh;
import java.io.*;
public class Giaodien {
    BufferedReader stdIn=new BufferedReader(new InputStreamReader(System.in));//gọi đối tượng để nhập gán dữ liệu từ bàn phím
    public void xuat(String chuoi){
        System.out.println(chuoi);
    }//xuất ra một chuỗi
    public float NhapSothuc(String chuoi)
            //throws IOException
    {
        String s;
        float a=0;
        int flag=0;
        do {
            this.xuat(chuoi);       
            try{
                flag=1;
                s=stdIn.readLine();//nhap dang chuoi
                a=Float.parseFloat(s);//nếu dữ liệu dang số thì flag=1 kết thúc vòng lặp
            }
            catch (Exception e){
                this.xuat("du lieu khong hop le");
                flag=0;//không hoàn toàn là dạng số xuất thông báo
            }
            
        } while (flag==0);
        //vog lap kiem tra dữ liệu nhập vào
        return a;    
        
        
        
        
        
    }
}
