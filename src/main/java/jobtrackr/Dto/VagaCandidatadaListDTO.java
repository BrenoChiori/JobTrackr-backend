package jobtrackr.Dto;

import jobtrackr.Entity.VagaCandidatada;
import jobtrackr.Enuns.NivelProfissional;
import jobtrackr.Enuns.PlataformaCandidatura;
import jobtrackr.Enuns.StatusCandidatura;

import java.time.LocalDate;

public record VagaCandidatadaListDTO(
        Integer id,
        
        String nomeEmpresa,

        String cargo,

        NivelProfissional nivel,

        PlataformaCandidatura plataforma,

        String linkVaga,

        LocalDate dataCandidatura,

        StatusCandidatura status,

        String descricaoVaga
) {
    public VagaCandidatadaListDTO(VagaCandidatada vagaCandidatada) {
        this(
                vagaCandidatada.getId(),
                vagaCandidatada.getNomeEmpresa(),
                vagaCandidatada.getCargo(),
                vagaCandidatada.getNivel(),
                vagaCandidatada.getPlataforma(),
                vagaCandidatada.getLinkVaga(),
                vagaCandidatada.getDataCandidatura(),
                vagaCandidatada.getStatus(),
                vagaCandidatada.getDescricaoVaga()
        );
    }
}
