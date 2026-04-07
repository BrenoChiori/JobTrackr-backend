package jobtrackr.Entity;

import jakarta.persistence.*;
import jobtrackr.Dto.VagaCandidatadaCreateDTO;
import jobtrackr.Enuns.NivelProfissional;
import jobtrackr.Enuns.PlataformaCandidatura;
import jobtrackr.Enuns.StatusCandidatura;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "VAGACANDIDATADA")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VagaCandidatada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeEmpresa;

    private String cargo;

    @Enumerated(EnumType.STRING)
    private NivelProfissional nivel;

    @Enumerated(EnumType.STRING)
    private PlataformaCandidatura plataforma;

    private String linkVaga;

    private LocalDate dataCandidatura;

    @Enumerated(EnumType.STRING)
    private StatusCandidatura status;

    private String descricaoVaga;

    public VagaCandidatada(VagaCandidatadaCreateDTO dto) {
        setNomeEmpresa(dto.nomeEmpresa());
        setCargo(dto.cargo());
        setNivel(dto.nivel());
        setPlataforma(dto.plataforma());
        setLinkVaga(dto.linkVaga());
        setDataCandidatura(dto.dataCandidatura() != null ? dto.dataCandidatura() : LocalDate.now());
        setStatus(dto.status() != null ? dto.status() : StatusCandidatura.EM_ANDAMENTO);
        setDescricaoVaga(dto.descricaoVaga());
    }
}
