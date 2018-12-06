package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
