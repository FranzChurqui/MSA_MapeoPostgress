package bo.gob.ruat.application.port.secondary.persona;

import bo.gob.ruat.domain.Entity.PersonaEntity;

public interface IPersonaRepository {
    PersonaEntity getPersona(Long pNumSecPersona);
}
