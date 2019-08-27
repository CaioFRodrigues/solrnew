package com.solr.repository;

import java.util.List;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import com.solr.model.Document;


public interface DocumentRepository extends SolrCrudRepository<Document, Long>  {
	
	public Document findById(String id);
	
	@Query(name = "Document.findByMetadata.findByTitle")
	public List<Document> findByAnnotatedNamedQueryTitle(String name);
	
	@Query(name = "Document.findByMetadata.findByLanguage")
	public List<Document> findByAnnotatedNamedQueryLanguage(String name);
	
	@Query(name = "Document.findByMetadata.findByAggregationLevel")
	public List<Document> findByAnnotatedNamedQueryAggregationLevel(String name);
	
	@Query(name = "Document.findByMetadata.findByStructure")
	public List<Document> findByAnnotatedNamedQueryStructure(String name);
	
	@Query(name = "Document.findByMetadata.findByAuthor")
	public List<Document> findByAnnotatedNamedQueryAuthor(String name);
	
	@Query(name = "Document.findByMetadata.findByData")
	public List<Document> findByAnnotatedNamedQueryData(String name);
	
	@Query(name = "Document.findByMetadata.findByInteractivityType")
	public List<Document> findByAnnotatedNamedQueryInteractivityType(String name);
	
	@Query(name = "Document.findByMetadata.findByInteractivityLevel")
	public List<Document> findByAnnotatedNamedQueryInteractivityLevel(String name);
	
	@Query(name = "Document.findByMetadata.findByPerception")
	public List<Document> findByAnnotatedNamedQueryPerception(String name);
	
	@Query(name = "Document.findByMetadata.findByCopresense")
	public List<Document> findByAnnotatedNamedQueryCopresense(String name);
	
	@Query(name = "Document.findByMetadata.findByReciprocity")
	public List<Document> findByAnnotatedNamedQueryReciprocity(String name);
	
	@Query(name = "Document.findByMetadata.findByTipicalLearningTime")
	public List<Document> findByAnnotatedNamedQueryTipicalLearningTime(String name);
	
	@Query(name = "Document.findByMetadata.findByEduLanguage")
	public List<Document> findByAnnotatedNamedQueryEduLanguage(String name);
	
	@Query(name = "Document.findByMetadata.findBySynchronism")
	public List<Document> findByAnnotatedNamedQuerySynchronism(String name);
	
	@Query(name = "Document.findByMetadata.findByVisual")
	public List<Document> findByAnnotatedNamedQueryVisual(String name);
	
	@Query(name = "Document.findByMetadata.findByAuditory")
	public List<Document> findByAnnotatedNamedQueryAuditory(String name);
	
	@Query(name = "Document.findByMetadata.findByTextual")
	public List<Document> findByAnnotatedNamedQueryTextual(String name);
	
	@Query(name = "Document.findByMetadata.findByTactil")
	public List<Document> findByAnnotatedNamedQueryTactil(String name);
	
	@Query(name = "Document.findByMetadata.findBySize")
	public List<Document> findByAnnotatedNamedQuerySize(String name);
	
	@Query(name = "Document.findByMetadata.findByFormat")
	public List<Document> findByAnnotatedNamedQueryFormat(String name);
	
	@Query(name = "Document.findByMetadata.findByRequirementsType")
	public List<Document> findByAnnotatedNamedQueryRequirementsType(String name);
	
	@Query(name = "Document.findByMetadata.findByRequirementsName")
	public List<Document> findByAnnotatedNamedQueryRequirementsName(String name);
	
	@Query(name = "Document.findByMetadata.findByRequirementsMinimumVersion")
	public List<Document> findByAnnotatedNamedQueryRequirementsMinimumVersion(String name);
	
	@Query(name = "Document.findByMetadata.findByInstallationRemarks")
	public List<Document> findByAnnotatedNamedQueryInstallationRemarks(String name);
	
	@Query(name = "Document.findByMetadata.findByDuration")
	public List<Document> findByAnnotatedNamedQueryDuration(String name);
	
	@Query(name = "Document.findByMetadata.findByOtherPlatformRequirements")
	public List<Document> findByAnnotatedNamedQueryOtherPlatformRequirements(String name);
	
	@Query(name = "Document.findByMetadata.findBySupportedPlatforms")
	public List<Document> findByAnnotatedNamedQuerySupportedPlatforms(String name);
	
	
}
