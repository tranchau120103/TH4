package LAB4;

import java.util.Scanner;

public class Giaodich {
public class giaodich{
    Scanner sc = new Scanner(System.in);
    String magiaodich;
    String ngaygiaodich;
    int dongia;
    
    public giaodich(String magiaodich, String ngaygiaodich, int dongia){
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
    }
    public giaodich(){
}    
    public String getMagiaodich(){
        return magiaodich;
    }
    public void setMagiaodich (String magiaodich){
        this.magiaodich = magiaodich;
    }
    public String getNgaygiaodich(){
        return ngaygiaodich;
    }
    public void setNgaygiaodich(String ngaygiaodich){
        this.ngaygiaodich = ngaygiaodich;
    }
    public int getDongia(){
        return dongia;
    }
    public void setDongia(int dongia){
        this.dongia = dongia;
    }

        @Override
        public String toString() {
            return "giaodich{" + "sc=" + sc + ", magiaodich=" + magiaodich + ", ngaygiaodich=" + ngaygiaodich + ", dongia=" + dongia + '}';
        }
    public class giaodichdat extends giaodich{
        float dientichdat;
        String loaidat;
        
        public giaodichdat(){
    }
        public giaodichdat(String magiaodich, String ngaygiaodich, int dongia, float dientich, String loaidat){
            super(magiaodich, ngaygiaodich, dongia);
            this.dientichdat = dientich;
            this.loaidat = loaidat;
        }
        public float getDientich(){
            return dientichdat;
        }
        public void setDientich(float dientich){
            this.dientichdat = dientich;
        }
        public String getLoaidat(){
            return loaidat;
        }
        public void nhap(){
            System.out.println("Nhap ma giao dich:");
            magiaodich = sc.nextLine();
            System.out.println("Nhap ma giao dich:");
            ngaygiaodich = sc.nextLine();
            System.out.println("Nhap don gia:");
            dongia = sc.nextInt();
            System.out.println("Nhap dien tich:");
            dientichdat = sc.nextFloat();
            System.out.println("Nhap loai dat : (A/B/C)");
            loaidat = sc.nextLine();
        }

        @Override
        public String toString() {
            return "giaodichdat{" + "dientichdat=" + dientichdat + ", loaidat=" + loaidat + '}';
        } 
   }
    public class giaodichnha extends giaodich{
        String loainha;
        String diachi;
        float dientichnha;
        int choice;
        
        public giaodichnha(String magiaodich, String ngaygiaodich, int dongia, String loainha, String diachi, float dientichnha){
            super(magiaodich, ngaygiaodich, dongia);
            this.loainha = loainha;
            this.diachi = diachi;
            this.dientichnha = dientichnha;
        }
        public String getLoainha(){
            return loainha;
        }
        public void setLoainha(String loainha){
            this.loainha = loainha;
        }
        public String getDiachi(){
            return diachi;
        }
        public void setDiachi(String diachi){
            this.diachi = diachi;
        }
        public float getDientichnha(){
            return dientichnha;
        }
        public void setDientichnha(float dientichnha){
            this.dientichnha = dientichnha;
        }
        public void nhap(){
            System.out.println("Nhap ma giao dich:");
            magiaodich = sc.nextLine();
            System.out.println("Nhap ngay giao dich:");
            ngaygiaodich = sc.nextLine();
            System.out.println("Nhap don gia:");
            dongia = sc.nextInt();
            System.out.println("Nhap dia chi");
            loainha = sc.nextLine();
            System.out.println("Nhap dien tich:");
            dientichnha = sc.nextFloat();
            System.out.println("Nhap loai nha: (cao cap/thuong)");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    loainha = "cao cap";
                    break;
                case 2:
                    loainha= "thuong";
                    break;
            }        
        }

        @Override
        public String toString() {
            return "giaodichnha{" + "loainha=" + loainha + ", diachi=" + diachi + ", dientichnha=" + dientichnha + ", choice=" + choice + '}';
        }
    }
}
}
