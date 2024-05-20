package com.example.tiendaweb.service;

import com.example.tiendaweb.entidades.Factura;
import com.example.tiendaweb.entidades.FacturaDetalle;
import com.example.tiendaweb.entidades.Producto;
import com.example.tiendaweb.entidades.Usuario;
import com.example.tiendaweb.repositorios.FacturaDetalleRepository;
import com.example.tiendaweb.repositorios.FacturaRepository;
import com.example.tiendaweb.repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private FacturaDetalleRepository facturaDetalleRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Transactional
    public Factura createFactura(Long usuarioId, List<FacturaDetalle> detalles) {
        Factura factura = new Factura();
        factura.setUsuario(new Usuario());
        factura.getUsuario().setUsuarioId(usuarioId);
        factura.setFecha(new Date());
        factura.setTotal(0.0);
        factura = facturaRepository.save(factura);

        double total = 0.0;
        for (FacturaDetalle detalle : detalles) {
            Producto producto = productoRepository.findById(detalle.getProducto().getProductoID()).orElse(null);
            if (producto != null) {
                detalle.setFactura(factura);
                detalle.setProducto(producto);
                detalle.setSubtotal(producto.getPrecio() * detalle.getCantidad());
                total += detalle.getSubtotal();
                facturaDetalleRepository.save(detalle);
            }
        }

        factura.setTotal(total);
        return facturaRepository.save(factura);
    }
}