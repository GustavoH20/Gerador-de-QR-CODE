package com.gustavo.henrique.qrcode.generate.controller;

import com.gustavo.henrique.qrcode.generate.dto.QrCodeGenerateReponse;
import com.gustavo.henrique.qrcode.generate.dto.QrCodeGenerateRequest;
import com.gustavo.henrique.qrcode.generate.service.QrCodeGenerateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGenerateService qrCodeGenerateService;

    public QrCodeController(QrCodeGenerateService qrCodeService) {
        this.qrCodeGenerateService = qrCodeService;
    }


    @PostMapping
    public ResponseEntity<QrCodeGenerateReponse> generateQrCode(@RequestBody QrCodeGenerateRequest request) {

        try {
            QrCodeGenerateReponse reponse = this.qrCodeGenerateService.generateAndUploadQrCode(request.text());
            return ResponseEntity.ok(reponse);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }

    }
}
