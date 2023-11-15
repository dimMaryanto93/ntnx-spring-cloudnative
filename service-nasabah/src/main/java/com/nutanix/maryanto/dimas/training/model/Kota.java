package com.nutanix.maryanto.dimas.training.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Kota {

    private String id;
    private String nama;
    private String provinsi;
}
