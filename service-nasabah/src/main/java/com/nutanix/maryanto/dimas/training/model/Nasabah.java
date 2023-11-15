package com.nutanix.maryanto.dimas.training.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Nasabah {

    private String nik;
    private String namaLengkap;
    private Kota kota;
    private String alamat;

}
