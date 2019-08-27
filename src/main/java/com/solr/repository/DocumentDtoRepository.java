package com.solr.repository;

import java.util.List;

import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import com.solr.model.dto.DocumentDto;

public interface DocumentDtoRepository extends SolrCrudRepository<DocumentDto, Long>  {
	
	public DocumentDto findById(String id);
	
	@Query(name = "DocumentDto.findByMetadata.findByTitle")
	public List<DocumentDto> findByAnnotatedNamedQueryTitle(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByLanguage")
	public List<DocumentDto> findByAnnotatedNamedQueryLanguage(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByAggregationLevel")
	public List<DocumentDto> findByAnnotatedNamedQueryAggregationLevel(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByStructure")
	public List<DocumentDto> findByAnnotatedNamedQueryStructure(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByAuthor")
	public List<DocumentDto> findByAnnotatedNamedQueryAuthor(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByData")
	public List<DocumentDto> findByAnnotatedNamedQueryData(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByInteractivityType")
	public List<DocumentDto> findByAnnotatedNamedQueryInteractivityType(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByInteractivityLevel")
	public List<DocumentDto> findByAnnotatedNamedQueryInteractivityLevel(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByPerception")
	public List<DocumentDto> findByAnnotatedNamedQueryPerception(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByCopresense")
	public List<DocumentDto> findByAnnotatedNamedQueryCopresense(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByReciprocity")
	public List<DocumentDto> findByAnnotatedNamedQueryReciprocity(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByTipicalLearningTime")
	public List<DocumentDto> findByAnnotatedNamedQueryTipicalLearningTime(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByEduLanguage")
	public List<DocumentDto> findByAnnotatedNamedQueryEduLanguage(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findBySynchronism")
	public List<DocumentDto> findByAnnotatedNamedQuerySynchronism(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByVisual")
	public List<DocumentDto> findByAnnotatedNamedQueryVisual(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByAuditory")
	public List<DocumentDto> findByAnnotatedNamedQueryAuditory(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByTextual")
	public List<DocumentDto> findByAnnotatedNamedQueryTextual(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByTactil")
	public List<DocumentDto> findByAnnotatedNamedQueryTactil(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findBySize")
	public List<DocumentDto> findByAnnotatedNamedQuerySize(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByFormat")
	public List<DocumentDto> findByAnnotatedNamedQueryFormat(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByRequirementsType")
	public List<DocumentDto> findByAnnotatedNamedQueryRequirementsType(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByRequirementsName")
	public List<DocumentDto> findByAnnotatedNamedQueryRequirementsName(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByRequirementsMinimumVersion")
	public List<DocumentDto> findByAnnotatedNamedQueryRequirementsMinimumVersion(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByInstallationRemarks")
	public List<DocumentDto> findByAnnotatedNamedQueryInstallationRemarks(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByDuration")
	public List<DocumentDto> findByAnnotatedNamedQueryDuration(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findByOtherPlatformRequirements")
	public List<DocumentDto> findByAnnotatedNamedQueryOtherPlatformRequirements(String name);
	
	@Query(name = "DocumentDto.findByMetadata.findBySupportedPlatforms")
	public List<DocumentDto> findByAnnotatedNamedQuerySupportedPlatforms(String name);
	
	
	
	
	
	
}
