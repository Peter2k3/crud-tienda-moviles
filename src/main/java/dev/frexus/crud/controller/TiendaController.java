package dev.frexus.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import dev.frexus.crud.entity.TiendaEntity;
import dev.frexus.crud.service.TiendaService;

@RestController
@RequestMapping("/tiendas")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE, RequestMethod.OPTIONS })
public class TiendaController {

    private final TiendaService tiendaService;

    public TiendaController(TiendaService tiendaService) {
        this.tiendaService = tiendaService;
    }

    @PostMapping
    public TiendaEntity createTienda(@RequestBody TiendaEntity tienda) {
        return tiendaService.save(tienda);
    }

    @DeleteMapping("/{id}")
    public void deleteTienda(@PathVariable Integer id) {
        tiendaService.deleteById(id);
    }

    @GetMapping
    public List<TiendaEntity> getAllTiendas() {
        return tiendaService.findAll();
    }

    @GetMapping("/{id}")
    public TiendaEntity getTiendaById(@PathVariable Integer id) {
        return tiendaService.findById(id);
    }

    @PutMapping("/{id}")
    public TiendaEntity updateTienda(@PathVariable Integer id, @RequestBody TiendaEntity tienda) {
        tienda.setId(id);
        return tiendaService.save(tienda);
    }
}
