package com.qlcldt.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ctdt_khungchuongtrinh_nhomkienthuc")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhungChuongTrinhNhomKienThuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_khungchuongtrinh", nullable = false)
    private KhungChuongTrinh khungChuongTrinh;
    
    @ManyToOne
    @JoinColumn(name = "id_manhom", nullable = false)
    private NhomKienThuc nhomKienThuc;
    
    @Column(name = "sotinchibatbuoc")
    private Integer soTinChiBatBuoc;
    
    @Column(name = "sotinchituchon")
    private Integer soTinChiTuChon;
}