package com.example.tiendaweb.controller;

import com.example.tiendaweb.entidades.Factura;
import com.example.tiendaweb.entidades.FacturaDetalle;
import com.example.tiendaweb.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {
    @Autowired
    private FacturaService facturaService;

    @PostMapping
    public Factura createFactura(@RequestParam Long usuarioId, @RequestBody List<FacturaDetalle> detalles) {
        return facturaService.createFactura(usuarioId, detalles);
    }
}
