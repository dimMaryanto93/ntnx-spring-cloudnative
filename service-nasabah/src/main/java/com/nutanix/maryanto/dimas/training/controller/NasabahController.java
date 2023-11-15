package com.nutanix.maryanto.dimas.training.controller;

import com.nutanix.maryanto.dimas.training.dto.NasabahDto;
import com.nutanix.maryanto.dimas.training.model.Kota;
import com.nutanix.maryanto.dimas.training.model.MessageError;
import com.nutanix.maryanto.dimas.training.model.Nasabah;
import com.nutanix.maryanto.dimas.training.service.KotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/nasabah")
public class NasabahController {

    private KotaService serviceKota;

    @Autowired
    public NasabahController(KotaService serviceKota) {
        this.serviceKota = serviceKota;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerNasabah(@RequestBody @Validated NasabahDto.RegisterNasabah dto) {
        Optional<Kota> kotaOptional = this.serviceKota.findKotaById(dto.getIdKota());
        if (kotaOptional.isEmpty()) return ResponseEntity.badRequest().body(MessageError.builder()
                .statusCode(11)
                .message("ID Kota is invalid!")
                .build());

        return ResponseEntity.ok(Nasabah.builder()
                .nik(dto.getNik())
                .namaLengkap(dto.getNamaLengkap())
                .kota(kotaOptional.get())
                .alamat(dto.getAlamat())
                .build());
    }
}
