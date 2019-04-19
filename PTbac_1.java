package giaiphuongtrinh;
public class PTbac_1 {
    private float a,b;
    public PTbac_1(){
        this.a=0;
        this.b=0;
    }//constructor không tham số gắn giá trị mặc định cho a b bằng 0
    public PTbac_1(float t, float w){
        this.a=t;
        this.b=w;
    }//constructor có tham số gắn giá trị cho a và b
    public void setA(float t){
       this.a=t;
    }//gắn giá trị cho riêng a
    public void setB(float w){
        this.b=w;
    }//gắn giá trị cho riêng b
    public float getA(){
        return this.a;
    }//lấy giá trị của a
    public float getB(){
        return this.b;
    }//lấy giá trị của b
    public String ketqua(){
        String k;
        if (this.a==0){
            if (this.b==0){
                k="Phuong trinh vo so nghiem";
                //nếu a=0 b=0 phuong trinh có vô số nghiệm
            }
            else{
                k="Phuong trinh vo nghiem";
                //a=0 b!=0 phuong trinh vô nghiệm
            }
        }
        else{
            float x=-b/a;
            k="Phuong trinh co nghiem duy nhat la "+ x;
            //a!=0 và b!=0 phuong trinh co ng la -b/a
        }
        return k;//trả về chuỗi
    }
}
