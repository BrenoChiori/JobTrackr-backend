package jobtrackr.Service;

import jobtrackr.Dto.VagaCandidatadaCreateDTO;
import jobtrackr.Dto.VagaCandidatadaListDTO;
import jobtrackr.Dto.VagaCandidatadaUpdateDTO;
import jobtrackr.Entity.VagaCandidatada;
import jobtrackr.Repository.VagaCandidatadaRepository;
import jobtrackr.Exceptions.Custom.EntityNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VagaCandidatadaService {

    @Autowired
    private VagaCandidatadaRepository repository;

    public VagaCandidatadaListDTO create(VagaCandidatadaCreateDTO dto) {
        return new VagaCandidatadaListDTO(repository.save(new VagaCandidatada(dto)));
    }

    public List<VagaCandidatadaListDTO> findAll() {
        List<VagaCandidatada> list = repository.findAll();
        return list.stream().map(VagaCandidatadaListDTO::new).collect(Collectors.toList());
    }

    public VagaCandidatadaListDTO findById(Integer id) {
        VagaCandidatada vaga = repository.findById(id).orElseThrow(() -> new EntityNotFound("Vaga não encontrada"));
        return new VagaCandidatadaListDTO(vaga);
    }

    public VagaCandidatadaListDTO update(Integer id, VagaCandidatadaUpdateDTO dto) {
        VagaCandidatada vaga = repository.findById(id).orElseThrow(() -> new EntityNotFound("Vaga não encontrada"));
        vaga.updateVagaCandidatada(dto);
        repository.save(vaga);
        return new VagaCandidatadaListDTO(vaga);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
