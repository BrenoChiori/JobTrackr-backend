package jobtrackr.Dto;

import jobtrackr.Enuns.NivelProfissional;
import jobtrackr.Enuns.PlataformaCandidatura;
import jobtrackr.Enuns.StatusCandidatura;

public record VagaCandidatadaUpdateDTO(
        String nomeEmpresa,
        String cargo,
        NivelProfissional nivel,
        PlataformaCandidatura plataforma,
        String linkVaga,
        StatusCandidatura status,
        String descricaoVaga
) {}
