
package com.mycompany.diemhocvien;

import java.util.ArrayList;
import java.util.List;

class DiemHocVien {
    private String hoTen;
    private int namSinh;
    private List<Double> diemMonHoc;

    public DiemHocVien(String hoTen, int namSinh, List<Double> diemMonHoc) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemMonHoc = diemMonHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public List<Double> getDiemMonHoc() {
        return diemMonHoc;
    }
}


