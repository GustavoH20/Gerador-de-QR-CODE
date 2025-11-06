package com.gustavo.henrique.qrcode.generate.ports;

public interface StoragePort {
    String uploadFile(byte[] fileData, String fileName, String contentType);
}
