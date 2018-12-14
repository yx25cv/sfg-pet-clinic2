package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.repositories.PetReository;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

    private final PetReository petReository;

    public PetSDJpaService(PetReository petReository) {
        this.petReository = petReository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petReository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petReository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petReository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petReository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        petReository.deleteById(aLong);

    }
}
