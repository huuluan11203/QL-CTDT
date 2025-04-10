package com.qlcldt.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ctdt_kehoachmonhom")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeHoachMonHom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "ma_nhom", nullable = false, length = 20)
    private String maNhom;
    
    @ManyToOne
    @JoinColumn(name = "hoc_phan_id", nullable = false)
    private HocPhan hocPhan;
    
    @Column(name = "nam_hoc", nullable = false, length = 20)
    private String namHoc;
    
    @Column(name = "hoc_ky", nullable = false)
    private Integer hocKy;
    
    @Column(name = "so_luong_sv")
    private Integer soLuongSv;
    
    @Column(name = "thoi_gian_bat_dau")
    private LocalDate thoiGianBatDau;
    
    @Column(name = "thoi_gian_ket_thuc")
    private LocalDate thoiGianKetThuc;
    
    @Column(name = "trang_thai", length = 30)
    private String trangThai;
    
    @OneToMany(mappedBy = "keHoachMonHom", cascade = CascadeType.ALL)
    private List<PhanCongGiangDay> phanCongGiangDays;
}