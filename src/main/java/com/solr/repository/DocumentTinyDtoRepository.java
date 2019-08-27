package com.solr.repository;

import java.util.List;
import org.springframework.data.solr.repository.SolrCrudRepository;
import com.solr.model.dto.DocumentTinyDto;;

public interface DocumentTinyDtoRepository extends SolrCrudRepository<DocumentTinyDto, Long>  {
	public List<DocumentTinyDto> findByTitle(String title);
	public DocumentTinyDto findById(String id);
}
