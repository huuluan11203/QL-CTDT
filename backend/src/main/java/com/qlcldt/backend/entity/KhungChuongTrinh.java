package com.qlcldt.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "ctdt_khungchuongtrinh")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhungChuongTrinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "ctdt_id", nullable = false)
    private ThongTinChung thongTinChung;
    
    @Column(name = "ma_nhom", nullable = false, length = 50)
    private String maNhom;
    
    @Column(name = "ten_nhom", nullable = false)
    private String tenNhom;
    
    @Column(name = "so_tin_chi_toi_thieu")
    private Integer soTinChiToiThieu;
    
    @OneToMany(mappedBy = "khungChuongTrinh", cascade = CascadeType.ALL)
    private List<KhungChuongTrinhNhomKienThuc> khungChuongTrinhNhomKienThucs;
    
    @OneToMany(mappedBy = "khungChuongTrinh", cascade = CascadeType.ALL)
    private List<HocPhan> hocPhans;
}