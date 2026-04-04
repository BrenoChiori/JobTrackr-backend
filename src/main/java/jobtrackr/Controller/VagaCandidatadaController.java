package jobtrackr.Controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jobtrackr.Dto.VagaCandidatadaCreateDTO;
import jobtrackr.Dto.VagaCandidatadaListDTO;
import jobtrackr.Dto.VagaCandidatadaUpdateDTO;
import jobtrackr.Entity.VagaCandidatada;
import jobtrackr.Service.VagaCandidatadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaCandidatadaController {

    @Autowired
    private VagaCandidatadaService vagaCandidatadaService;

    @PostMapping
    @Transactional
    public ResponseEntity<VagaCandidatadaListDTO> create(@RequestBody @Valid VagaCandidatadaCreateDTO vagaCandidatadaCreateDTO) {
        VagaCandidatada obj = vagaCandidatadaService.create(vagaCandidatadaCreateDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(new VagaCandidatadaListDTO(obj).id()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public ResponseEntity<List<VagaCandidatadaListDTO>> findAll() {
        return ResponseEntity.ok(vagaCandidatadaService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<VagaCandidatadaListDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(vagaCandidatadaService.findById(id));
    }

    @PutMapping("{id}")
    @Transactional
    public ResponseEntity<VagaCandidatadaListDTO> update(@PathVariable Integer id, @RequestBody VagaCandidatadaUpdateDTO vagaCandidatadaUpdateDTO) {
        return ResponseEntity.ok(vagaCandidatadaService.update(id, vagaCandidatadaUpdateDTO));
    }

    @DeleteMapping("{id}")
    @Transactional
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        vagaCandidatadaService.delete(id);
        return ResponseEntity.ok().build();
    }
}
