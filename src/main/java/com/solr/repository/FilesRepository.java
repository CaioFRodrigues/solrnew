package com.solr.repository;

import java.util.List;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import com.solr.model.Files;


public interface FilesRepository extends SolrCrudRepository<Files, Long>  {
	public Files findById(String id);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByTitle")
	public List<Files> findByAnnotatedNamedQuery(String name);	
	
	@Query(name = "Files.findByDocument.findByMetadata.findByLanguage")
	public List<Files> findByAnnotatedNamedQueryLanguage(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByAggregationLevel")
	public List<Files> findByAnnotatedNamedQueryAggregationLevel(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByStructure")
	public List<Files> findByAnnotatedNamedQueryStructure(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByAuthor")
	public List<Files> findByAnnotatedNamedQueryAuthor(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByData")
	public List<Files> findByAnnotatedNamedQueryData(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByInteractivityType")
	public List<Files> findByAnnotatedNamedQueryInteractivityType(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByInteractivityLevel")
	public List<Files> findByAnnotatedNamedQueryInteractivityLevel(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByPerception")
	public List<Files> findByAnnotatedNamedQueryPerception(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByCopresense")
	public List<Files> findByAnnotatedNamedQueryCopresense(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByReciprocity")
	public List<Files> findByAnnotatedNamedQueryReciprocity(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByTipicalLearningTime")
	public List<Files> findByAnnotatedNamedQueryTipicalLearningTime(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByEduLanguage")
	public List<Files> findByAnnotatedNamedQueryEduLanguage(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findBySynchronism")
	public List<Files> findByAnnotatedNamedQuerySynchronism(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByVisual")
	public List<Files> findByAnnotatedNamedQueryVisual(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByAuditory")
	public List<Files> findByAnnotatedNamedQueryAuditory(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByTextual")
	public List<Files> findByAnnotatedNamedQueryTextual(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByTactil")
	public List<Files> findByAnnotatedNamedQueryTactil(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findBySize")
	public List<Files> findByAnnotatedNamedQuerySize(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByFormat")
	public List<Files> findByAnnotatedNamedQueryFormat(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByRequirementsType")
	public List<Files> findByAnnotatedNamedQueryRequirementsType(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByRequirementsName")
	public List<Files> findByAnnotatedNamedQueryRequirementsName(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByRequirementsMinimumVersion")
	public List<Files> findByAnnotatedNamedQueryRequirementsMinimumVersion(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByInstallationRemarks")
	public List<Files> findByAnnotatedNamedQueryInstallationRemarks(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByDuration")
	public List<Files> findByAnnotatedNamedQueryDuration(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findByOtherPlatformRequirements")
	public List<Files> findByAnnotatedNamedQueryOtherPlatformRequirements(String name);
	
	@Query(name = "Files.findByDocument.findByMetadata.findBySupportedPlatforms")
	public List<Files> findByAnnotatedNamedQuerySupportedPlatforms(String name);
}
