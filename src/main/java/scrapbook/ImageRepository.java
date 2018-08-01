package scrapbook;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image, Long> {

	Collection<Image> findByKidId(long id);

}
