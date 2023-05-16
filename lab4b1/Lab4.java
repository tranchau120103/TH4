package LAB4;

import java.time.LocalDate;

public class Lab4 {

    void nhap() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void xuat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void trungbinhthanhtiendat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class giaodich {
        String magiaodich;
        LocalDate ngaygiaodich;
        int dongia;
        
        public giaodich(String magiaodich, LocalDate ngaygiaodich, int dongia) {
            this.magiaodich = magiaodich;
            this.ngaygiaodich = ngaygiaodich;
            this.dongia = dongia;
        }
        public giaodich(){
        }
        public String getMagiaodich(){
            return magiaodich;
        }
        public void setMagiaodich(String magiaodich){
            this.magiaodich = magiaodich;
        }
        public LocalDate getNgaygiaodich(){
            return ngaygiaodich;
        }
        public void setNgaygiaodich(LocalDate ngaygiaodich){
            this.ngaygiaodich = ngaygiaodich;
        }
        public int getDongia(){
            return dongia;
        }
        public void setDongia(int dongia){
            this.dongia = dongia;
        }
    }
    public class giaodichdat extends giaodich{
        float dientichdat;
        String loaidat;
        
        public giaodichdat(float dientich, String loaidat, String magiaodich, LocalDate ngaygiaodich, int dongia){
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
        public void setLoaidat(String loaidat){
            this.loaidat = loaidat;
        }
    }
    public class giaodichnha extends giaodich{
        String loainha;
        String diachi;
        float dientichnha;
        
        public giaodichnha(String loainha, String diachi, float dientichnha, String magiaodich, LocalDate ngaygiaodich, int dongia){
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
    }
}
