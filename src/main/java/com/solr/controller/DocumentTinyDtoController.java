package com.solr.controller;

import java.util.List;
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

import com.solr.model.dto.DocumentTinyDto;
import com.solr.repository.DocumentTinyDtoRepository;


@RestController
@RequestMapping("/documentTinyDto")
public class DocumentTinyDtoController {
	@Autowired
	DocumentTinyDtoRepository solrDocumentRepository;
	
	
	@PostMapping("")
	public ResponseEntity<DocumentTinyDto> createDocument(@RequestBody DocumentTinyDto documentTinyDto){
		try {
			documentTinyDto = solrDocumentRepository.save(documentTinyDto);
			
			return new ResponseEntity<DocumentTinyDto>(documentTinyDto, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

	
	@PostMapping("/title")
	public ResponseEntity<List<DocumentTinyDto>>  findDocumentByTitle(@RequestBody DocumentTinyDto documentTinyDto){
		try {
			List<DocumentTinyDto> docs = solrDocumentRepository.findByTitle(documentTinyDto.getTitle());
			return new ResponseEntity<List<DocumentTinyDto>>(docs, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@GetMapping("/all")
	public Iterable<DocumentTinyDto> getAllDocument(){
		try {
			Iterable<DocumentTinyDto> docs = solrDocumentRepository.findAll();
			return docs;
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	@DeleteMapping("/{id}")
	public String deleteDocument(@PathVariable String id){
		try {
			//solrDocumentRepository.delete(solrDocumentRepository.findById(id));
			String description = "Document Deleted";
			return description;
		}catch (Exception e) {
			return e.getLocalizedMessage();
		}
	}
	
	@DeleteMapping("/all")
	public String deleteAllDocument(){
		try {
			solrDocumentRepository.deleteAll();
			String description = "DocumentTinyDto Deleted";
			return description;
		}catch (Exception e) {
			return e.getLocalizedMessage();
		}
	}
		
		
}
