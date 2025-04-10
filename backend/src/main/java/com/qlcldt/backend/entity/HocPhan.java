package com.qlcldt.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "ctdt_hocphan")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HocPhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "ma_hp", unique = true, nullable = false, length = 50)
    private String maHp;
    
    @Column(name = "ten_hp", nullable = false)
    private String tenHp;
    
    @Column(name = "so_tin_chi", nullable = false)
    private Integer soTinChi;
    
    @Column(name = "so_tiet_ly_thuyet")
    private Integer soTietLyThuyet;
    
    @Column(name = "so_tiet_thuc_hanh")
    private Integer soTietThucHanh;
    
    @ManyToOne
    @JoinColumn(name = "nhom_id")
    private KhungChuongTrinh khungChuongTrinh;
    
    @Column(name = "loai_hp", length = 50)
    private String loaiHp;
    
    @Column(name = "hoc_phan_tien_quyet")
    private String hocPhanTienQuyet;
    
    @OneToMany(mappedBy = "hocPhan", cascade = CascadeType.ALL)
    private List<DeCuongChiTiet> deCuongChiTiets;
    
    @OneToMany(mappedBy = "hocPhan", cascade = CascadeType.ALL)
    private List<KeHoachDayHoc> keHoachDayHocs;
    
    @OneToMany(mappedBy = "hocPhan", cascade = CascadeType.ALL)
    private List<KeHoachMonHom> keHoachMonHoms;
}