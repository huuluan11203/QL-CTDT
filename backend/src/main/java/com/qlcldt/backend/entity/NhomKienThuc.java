package com.qlcldt.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "ctdt_nhomkienthuc")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NhomKienThuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "manhom", nullable = false, length = 50)
    private String maNhom;
    
    @Column(name = "ten_nhom", nullable = false)
    private String tenNhom;
    
    @Column(name = "trangthai", length = 20)
    private String trangThai;
    
    @OneToMany(mappedBy = "nhomKienThuc", cascade = CascadeType.ALL)
    private List<KhungChuongTrinhNhomKienThuc> khungChuongTrinhNhomKienThucs;
}