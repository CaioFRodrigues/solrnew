package com.solr.controller;

import java.util.List; 
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.solr.model.Document;
import com.solr.repository.DocumentRepository;


@RestController
@RequestMapping("/document")
public class DocumentController {
	@Autowired
	DocumentRepository solrDocumentRepository;
	
	@PostMapping("")
	public ResponseEntity<Document> createDocument(@RequestBody Map<String, Object> document){
		try {
			Document documentModel = new Document();
			documentModel.setMetadata((Map<String, Object>) document.get("metadata"));
			documentModel = solrDocumentRepository.save(documentModel);
			

			return new ResponseEntity<Document>(documentModel, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@PostMapping("/title")
	public ResponseEntity<List<Document>>  findDocumentByTitle(@RequestBody Map<String, Object> document){
		try {
			Map<String, Object> meta = (Map<String, Object>) document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryTitle(meta.get("title").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/language")
	public ResponseEntity<List<Document>>  findDocumentByLanguage(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryLanguage(meta.get("language").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/aggregationLevel")
	public ResponseEntity<List<Document>>  findDocumentByAggregationLevel(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryAggregationLevel(meta.get("aggregationLevel").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/structure")
	public ResponseEntity<List<Document>>  findDocumentByStructure(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryStructure(meta.get("structure").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/author")
	public ResponseEntity<List<Document>>  findDocumentByAuthor(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryAuthor(meta.get("author").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/data")
	public ResponseEntity<List<Document>>  findDocumentByData(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryData(meta.get("data").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/interactivityType")
	public ResponseEntity<List<Document>>  findDocumentByInteractivityType(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryInteractivityType(meta.get("interactivityType").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/interactivityLevel")
	public ResponseEntity<List<Document>>  findDocumentByInteractivityLevel(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryInteractivityLevel(meta.get("interactivityLevel").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/perception")
	public ResponseEntity<List<Document>>  findDocumentByPerception(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryPerception(meta.get("perception").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/copresense")
	public ResponseEntity<List<Document>>  findDocumentByCopresense(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryCopresense(meta.get("copresense").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/reciprocity")
	public ResponseEntity<List<Document>>  findDocumentByReciprocity(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryReciprocity(meta.get("reciprocity").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/tipicalLearningTime")
	public ResponseEntity<List<Document>>  findDocumentByTipicalLearningTime(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryTipicalLearningTime(meta.get("tipicalLearningTime").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/eduLanguage")
	public ResponseEntity<List<Document>>  findDocumentByEduLanguage(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryEduLanguage(meta.get("eduLanguage").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/synchronism")
	public ResponseEntity<List<Document>>  findDocumentBySynchronism(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQuerySynchronism(meta.get("synchronism").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/visual")
	public ResponseEntity<List<Document>>  findDocumentByVisual(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryVisual(meta.get("visual").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/auditory")
	public ResponseEntity<List<Document>>  findDocumentByAuditory(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryAuditory(meta.get("auditory").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/textual")
	public ResponseEntity<List<Document>>  findDocumentByTextual(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryTextual(meta.get("textual").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/tactil")
	public ResponseEntity<List<Document>>  findDocumentByTactil(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryTactil(meta.get("tactil").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/size")
	public ResponseEntity<List<Document>>  findDocumentBySize(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQuerySize(meta.get("size").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/format")
	public ResponseEntity<List<Document>>  findDocumentByFormat(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryFormat(meta.get("format").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/requirementsType")
	public ResponseEntity<List<Document>>  findDocumentByRequirementsType(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryRequirementsType(meta.get("requirementsType").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/requirementsName")
	public ResponseEntity<List<Document>>  findDocumentByRequirementsName(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryRequirementsName(meta.get("requirementsName").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/requirementsMinimumVersion")
	public ResponseEntity<List<Document>>  findDocumentByRequirementsMinimumVersion(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryRequirementsMinimumVersion(meta.get("requirementsMinimumVersion").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/installationRemarks")
	public ResponseEntity<List<Document>>  findDocumentByInstallationRemarks(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryInstallationRemarks(meta.get("installationRemarks").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/duration")
	public ResponseEntity<List<Document>>  findDocumentByDuration(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryDuration(meta.get("duration").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/otherPlatformRequirements")
	public ResponseEntity<List<Document>>  findDocumentByOtherPlatformRequirements(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQueryOtherPlatformRequirements(meta.get("otherPlatformRequirements").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/supportedPlatforms")
	public ResponseEntity<List<Document>>  findDocumentBySupportedPlatforms(@RequestBody Map<String, Object> Document){
		try {
			Map<String, Object> meta = (Map<String, Object>) Document.get("metadata");
			List<Document> docs = solrDocumentRepository.findByAnnotatedNamedQuerySupportedPlatforms(meta.get("supportedPlatforms").toString());
			
			return new ResponseEntity<List<Document>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/all")
	public Iterable<Document> getAllDocument(){
		try {
			Iterable<Document> docs = solrDocumentRepository.findAll();
			return docs;
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	@DeleteMapping("/{id}")
	public String deleteDocument(@PathVariable String id){
		try {
			solrDocumentRepository.delete(solrDocumentRepository.findById(id));
			String description = "Document Deleted";
			return description;
		}catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@DeleteMapping("/all")
	public String deleteAllDocument(){
		try {
			String description = "Document Deleted";
			solrDocumentRepository.deleteAll();
			return description;
		}catch (Exception e) {
			return e.getMessage();
		}
	}
		
		
}
