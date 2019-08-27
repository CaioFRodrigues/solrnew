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

import com.solr.model.dto.DocumentDto;
import com.solr.repository.DocumentDtoRepository;


@RestController
@RequestMapping("/documentDto")
public class DocumentDtoController {
	@Autowired
	DocumentDtoRepository solrDocumentRepository;
	
	@PostMapping("")
	public ResponseEntity<DocumentDto> createDocument(@RequestBody Map<String, Object> documentDto){
		try {
			DocumentDto documentDtoModel = new DocumentDto();
			documentDtoModel.setMetadata( (Map<String, Object>) documentDto.get("metadata"));
			documentDtoModel = solrDocumentRepository.save(documentDtoModel);
			return new ResponseEntity<DocumentDto>(documentDtoModel, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@PostMapping("/title")
	public ResponseEntity<List<DocumentDto>>  findDocumentByTitle(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryTitle(meta.get("title").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/language")
	public ResponseEntity<List<DocumentDto>>  findDocumentByLanguage(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryLanguage(meta.get("language").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/aggregationLevel")
	public ResponseEntity<List<DocumentDto>>  findDocumentByAggregationLevel(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryAggregationLevel(meta.get("aggregationLevel").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/structure")
	public ResponseEntity<List<DocumentDto>>  findDocumentByStructure(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryStructure(meta.get("structure").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/author")
	public ResponseEntity<List<DocumentDto>>  findDocumentByAuthor(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryAuthor(meta.get("author").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	} 
	
	@PostMapping("/data")
	public ResponseEntity<List<DocumentDto>>  findDocumentByData(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryData(meta.get("data").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/interactivityType")
	public ResponseEntity<List<DocumentDto>>  findDocumentByInteractivityType(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryInteractivityType(meta.get("interactivityType").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/interactivityLevel")
	public ResponseEntity<List<DocumentDto>>  findDocumentByInteractivityLevel(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryInteractivityLevel(meta.get("interactivityLevel").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/perception")
	public ResponseEntity<List<DocumentDto>>  findDocumentByPerception(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryPerception(meta.get("perception").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/copresense")
	public ResponseEntity<List<DocumentDto>>  findDocumentByCopresense(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryCopresense(meta.get("copresense").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/reciprocity")
	public ResponseEntity<List<DocumentDto>>  findDocumentByReciprocity(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryReciprocity(meta.get("reciprocity").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PostMapping("/tipicalLearningTime")
	public ResponseEntity<List<DocumentDto>>  findDocumentByTipicalLearningTime(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryTipicalLearningTime(meta.get("tipicalLearningTime").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/eduLanguage")
	public ResponseEntity<List<DocumentDto>>  findDocumentByEduLanguage(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryEduLanguage(meta.get("eduLanguage").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/synchronism")
	public ResponseEntity<List<DocumentDto>>  findDocumentBySynchronism(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQuerySynchronism(meta.get("synchronism").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/visual")
	public ResponseEntity<List<DocumentDto>>  findDocumentByVisual(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryVisual(meta.get("visual").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/auditory")
	public ResponseEntity<List<DocumentDto>>  findDocumentByAuditory(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryAuditory(meta.get("auditory").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/textual")
	public ResponseEntity<List<DocumentDto>>  findDocumentByTextual(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryTextual(meta.get("textual").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/tactil")
	public ResponseEntity<List<DocumentDto>>  findDocumentByTactil(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryTactil(meta.get("tactil").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/size")
	public ResponseEntity<List<DocumentDto>>  findDocumentBySize(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQuerySize(meta.get("size").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/format")
	public ResponseEntity<List<DocumentDto>>  findDocumentByFormat(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryFormat(meta.get("format").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/requirementsType")
	public ResponseEntity<List<DocumentDto>>  findDocumentByRequirementsType(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryRequirementsType(meta.get("requirementsType").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/requirementsName")
	public ResponseEntity<List<DocumentDto>>  findDocumentByRequirementsName(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryRequirementsName(meta.get("requirementsName").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/requirementsMinimumVersion")
	public ResponseEntity<List<DocumentDto>>  findDocumentByRequirementsMinimumVersion(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryRequirementsMinimumVersion(meta.get("requirementsMinimumVersion").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/installationRemarks")
	public ResponseEntity<List<DocumentDto>>  findDocumentByInstallationRemarks(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryInstallationRemarks(meta.get("installationRemarks").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/duration")
	public ResponseEntity<List<DocumentDto>>  findDocumentByDuration(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryDuration(meta.get("duration").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/otherPlatformRequirements")
	public ResponseEntity<List<DocumentDto>>  findDocumentByOtherPlatformRequirements(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQueryOtherPlatformRequirements(meta.get("otherPlatformRequirements").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/supportedPlatforms")
	public ResponseEntity<List<DocumentDto>>  findDocumentBySupportedPlatforms(@RequestBody Map<String, Object> documentDto){
		try {
			Map<String, Object> meta = (Map<String, Object>) documentDto.get("metadata");
			List<DocumentDto> docs = solrDocumentRepository.findByAnnotatedNamedQuerySupportedPlatforms(meta.get("supportedPlatforms").toString());
			
			return new ResponseEntity<List<DocumentDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping("/all")
	public Iterable<DocumentDto> getAllDocument(){
		try {
			Iterable<DocumentDto> docs = solrDocumentRepository.findAll();
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
			return e.getLocalizedMessage();
		}
	}
	
	@DeleteMapping("/all")
	public String deleteAllDocument(){
		try {
			String description = "DocumentDto Deleted";
			solrDocumentRepository.deleteAll();
			return description;
		}catch (Exception e) {
			return e.getLocalizedMessage();
		}
	}
		
		
}
