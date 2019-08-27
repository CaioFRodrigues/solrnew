package com.solr.controller;

import java.util.HashMap;
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
import com.solr.model.Files;
import com.solr.repository.FilesRepository;

@RestController
@RequestMapping("/files")
public class FilesController {
	@Autowired
	FilesRepository solrFilesRepository;
	
	@PostMapping("")
	public ResponseEntity<Files> createFiles(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  metadata = (Map<String, Object>) doc.get("metadata");
			
			Files filesModel = new Files();
			
		    Map<String, Object> document = new HashMap<String, Object>(); 
			for (Map.Entry<String, Object> entry : metadata.entrySet()) {
			     document.put("metadata_" + entry.getKey(), (String) entry.getValue());
			}	
			filesModel.setDocument(document);
			filesModel = solrFilesRepository.save(filesModel);
			return new ResponseEntity<Files>(filesModel, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@PostMapping("/title")
	public ResponseEntity<List<Files>>  findFilesByTitle(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");
			
			List<Files> list = solrFilesRepository.findByAnnotatedNamedQuery(meta.get("title").toString());
		
			return new ResponseEntity<List<Files>>(list, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/language")
	public ResponseEntity<List<Files>>  findDocumentByLanguage(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");
			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryLanguage(meta.get("language").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/aggregationLevel")
	public ResponseEntity<List<Files>>  findDocumentByAggregationLevel(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryAggregationLevel(meta.get("aggregationLevel").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/structure")
	public ResponseEntity<List<Files>>  findDocumentByStructure(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryStructure(meta.get("structure").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/author")
	public ResponseEntity<List<Files>>  findDocumentByAuthor(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryAuthor(meta.get("author").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/data")
	public ResponseEntity<List<Files>>  findDocumentByData(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryData(meta.get("data").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/interactivityType")
	public ResponseEntity<List<Files>>  findDocumentByInteractivityType(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryInteractivityType(meta.get("interactivityType").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/interactivityLevel")
	public ResponseEntity<List<Files>>  findDocumentByInteractivityLevel(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryInteractivityLevel(meta.get("interactivityLevel").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/perception")
	public ResponseEntity<List<Files>>  findDocumentByPerception(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryPerception(meta.get("perception").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/copresense")
	public ResponseEntity<List<Files>>  findDocumentByCopresense(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryCopresense(meta.get("copresense").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/reciprocity")
	public ResponseEntity<List<Files>>  findDocumentByReciprocity(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryReciprocity(meta.get("reciprocity").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/tipicalLearningTime")
	public ResponseEntity<List<Files>>  findDocumentByTipicalLearningTime(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryTipicalLearningTime(meta.get("tipicalLearningTime").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/eduLanguage")
	public ResponseEntity<List<Files>>  findDocumentByEduLanguage(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryEduLanguage(meta.get("eduLanguage").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/synchronism")
	public ResponseEntity<List<Files>>  findDocumentBySynchronism(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQuerySynchronism(meta.get("synchronism").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/visual")
	public ResponseEntity<List<Files>>  findDocumentByVisual(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryVisual(meta.get("visual").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/auditory")
	public ResponseEntity<List<Files>>  findDocumentByAuditory(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryAuditory(meta.get("auditory").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/textual")
	public ResponseEntity<List<Files>>  findDocumentByTextual(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryTextual(meta.get("textual").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/tactil")
	public ResponseEntity<List<Files>>  findDocumentByTactil(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryTactil(meta.get("tactil").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/size")
	public ResponseEntity<List<Files>>  findDocumentBySize(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQuerySize(meta.get("size").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/format")
	public ResponseEntity<List<Files>>  findDocumentByFormat(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryFormat(meta.get("format").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/requirementsType")
	public ResponseEntity<List<Files>>  findDocumentByRequirementsType(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryRequirementsType(meta.get("requirementsType").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/requirementsName")
	public ResponseEntity<List<Files>>  findDocumentByRequirementsName(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryRequirementsName(meta.get("requirementsName").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/requirementsMinimumVersion")
	public ResponseEntity<List<Files>>  findDocumentByRequirementsMinimumVersion(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryRequirementsMinimumVersion(meta.get("requirementsMinimumVersion").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/installationRemarks")
	public ResponseEntity<List<Files>>  findDocumentByInstallationRemarks(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryInstallationRemarks(meta.get("installationRemarks").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/duration")
	public ResponseEntity<List<Files>>  findDocumentByDuration(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryDuration(meta.get("duration").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/otherPlatformRequirements")
	public ResponseEntity<List<Files>>  findDocumentByOtherPlatformRequirements(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQueryOtherPlatformRequirements(meta.get("otherPlatformRequirements").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/supportedPlatforms")
	public ResponseEntity<List<Files>>  findDocumentBySupportedPlatforms(@RequestBody Map<String, Object> files){
		try {
			Map<String, Object>  doc = (Map<String, Object>) files.get("document");
			Map<String, Object>  meta = (Map<String, Object>) doc.get("metadata");			
			List<Files> docs = solrFilesRepository.findByAnnotatedNamedQuerySupportedPlatforms(meta.get("supportedPlatforms").toString());
			
			return new ResponseEntity<List<Files>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/all")
	public Iterable<Files> getAllFiles(){
		try {
			Iterable<Files> docs = solrFilesRepository.findAll();
			return docs;
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	@DeleteMapping("/{id}")
	public String deleteFiles(@PathVariable String id){
		try {
			solrFilesRepository.delete(solrFilesRepository.findById(id));
			String description = "Files Deleted";
			return description;
		}catch (Exception e) {
			return e.getLocalizedMessage();
		}
	}
	
	@DeleteMapping("/all")
	public String deleteAllFiles(){
		try {
			String description = "Files Deleted";
			solrFilesRepository.deleteAll();
			return description;
		}catch (Exception e) {
			return e.getLocalizedMessage();
		}
	}
		
		
}
