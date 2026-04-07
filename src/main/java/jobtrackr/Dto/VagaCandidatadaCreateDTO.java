package jobtrackr.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jobtrackr.Enuns.NivelProfissional;
import jobtrackr.Enuns.PlataformaCandidatura;
import jobtrackr.Enuns.StatusCandidatura;

import java.time.LocalDate;

public record VagaCandidatadaCreateDTO(
        @NotBlank
        String nomeEmpresa,

        @NotBlank
        String cargo,

        @NotNull
        NivelProfissional nivel,

        @NotNull
        PlataformaCandidatura plataforma,

        @NotBlank
        String linkVaga,

        LocalDate dataCandidatura,

        StatusCandidatura status,

        @Size(min = 1, max = 100)
        String descricaoVaga
) {}
