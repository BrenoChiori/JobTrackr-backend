package jobtrackr.Dto;

import jakarta.validation.constraints.NotBlank;
import jobtrackr.Enuns.NivelProfissional;
import jobtrackr.Enuns.PlataformaCandidatura;
import jobtrackr.Enuns.StatusCandidatura;

import java.util.Date;

public record VagaCandidatadaCreateDTO(
        @NotBlank
        String nomeEmpresa,

        @NotBlank
        String cargo,

        NivelProfissional nivel,

        PlataformaCandidatura plataforma,

        @NotBlank
        String linkVaga,

        Date dataCandidatura,

        StatusCandidatura status,

        String descricaoVaga
) {}
