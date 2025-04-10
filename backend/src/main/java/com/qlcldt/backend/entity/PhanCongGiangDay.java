package com.qlcldt.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ctdt_phanconggiangday")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhanCongGiangDay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "nhom_id", nullable = false)
    private KeHoachMonHom keHoachMonHom;
    
    @ManyToOne
    @JoinColumn(name = "giang_vien_id", nullable = false)
    private GiangVien giangVien;
    
    @Column(name = "vai_tro", length = 50)
    private String vaiTro;
    
    @Column(name = "so_tiet")
    private Integer soTiet;
}