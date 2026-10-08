package com.felipemamani.primerparcialsis414.service;
import com.felipemamani.primerparcialsis414.repository.UniversidadRepository;
import com.felipemamani.primerparcialsis414.entity.Universidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversidadService {

    @Autowired
    private UniversidadRepository universidadRepository;

    // 1. Obtener todas las universidades (Para el GET)
    public List<Universidad> listarTodas() {
        return universidadRepository.findAll();
    }

    // 2. Guardar o actualizar una universidad (Para el POST y PUT)
    public com.felipemamani.primerparcialsis414.entity.Universidad guardar(Universidad universidad) {
        return universidadRepository.save(universidad);
    }

    // 3. Buscar una universidad por su ID
    public Optional<Universidad> buscarPorId(Long id) {
        return universidadRepository.findById(id);
    }

    // 4. Eliminar una universidad (Para el DELETE)
    public void eliminar(Long id) {
        universidadRepository.deleteById(id);
    }
}