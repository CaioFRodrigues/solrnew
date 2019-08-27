package com.solr.controller;

import java.util.ArrayList;
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
import com.solr.model.User;
import com.solr.repository.UserRepository;
import com.solr.repository.UserRepositoryCustom;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository solrUserRepository;
	@Autowired
	UserRepositoryCustom solrUserRepositoryCustom;
	
	@PostMapping("")
	public ResponseEntity<User> createUser(@RequestBody Map<String, Object> user){
		try {
			User userModel = new User();
			
			List<Map<String, Object>>  docs = (List<Map<String, Object>>) user.get("document");
			List<Document> docsFinal = new ArrayList<Document>(); 
			
			for (Map<String, Object> doc : docs) {
				Document document = new Document(); 
				document.setId(doc.get("id").toString());
				System.out.println("tes");
				
				//document.setParent(false);
				
				Map<String, Object>  metadata = (Map<String, Object>) doc.get("metadata");
				document.setMetadata(metadata);
				
				docsFinal.add(document); 
			}
			userModel.setParent(true);
			userModel.setId(user.get("id").toString());
			userModel.setDocument(docsFinal);

			userModel = solrUserRepository.save(userModel);
			return new ResponseEntity<User>(userModel, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/title")
	public ResponseEntity<List<User>> findUserByTitle(@RequestBody Map<String, Object> User){
		
		/* DO not WORK
		try {
			List<User> listUserModel = new ArrayList<User>();
			List<Map<String, Object>>  docs = (List<Map<String, Object>>) User.get("document");
			
			for (Map<String, Object> doc : docs) {
				Map<String, Object>  metadata = (Map<String, Object>) doc.get("metadata");
				System.out.println(metadata);
				
				List<User> users = solrUserRepository.findByAnnotatedNamedQuery(metadata.get("title").toString());
						//stream().forEach(action);;
				System.out.println(metadata.get("title").toString().trim());
				
				listUserModel.addAll(users); 
			}
			return new ResponseEntity<List<User>>(listUserModel, HttpStatus.OK);
		}catch (Exception e) { 
			System.out.println(e);
			
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
		*/
		return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
	} 
	
	@GetMapping("/{id}")
	public User getfile(@PathVariable String id){
	
		return solrUserRepository.findById(id);
	}
	
	@GetMapping("/all")
	public Iterable<User> getAllUser(){
		Iterable<User> docs = solrUserRepository.findAll();
	    
		return docs;
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable String id){
		try {
			solrUserRepository.delete(solrUserRepository.findById(id));
			String description = "User Deleted";
			return description;
		}catch (Exception e) {
			return e.getLocalizedMessage();
		}
	}
	
	@DeleteMapping("/all")
	public String deleteAllUser(){
		try {
			String description = "User Deleted";
			solrUserRepository.deleteAll();
			return description;
		}catch (Exception e) {
			return e.getLocalizedMessage();
		}
	}
	/*	
	@PostMapping("")
	public ResponseEntity<User> createUser(@RequestBody Map<String, List<Object>> User){
		try {
			User UserModel = new User();
			System.out.println(User);

			List<Object> docsObject = User.get("document");
			System.out.println(docsObject);

			//List<Map<String, Object>> docsFinal = new ArrayList<Map<String,Object>>();
			Map<String, List<Object>> documentsFinal = new HashMap<String, List<Object>>();
			List<Object> listFinal = new ArrayList<Object>();
			for (Object doc : docsObject) {
				System.out.println("aq " + doc);
			
				Map<String, Object> docMap = (Map<String, Object>) doc; 
				Map<String, Object>  metadata =  (Map<String, Object>) docMap.get("metadata");
				Map<String, Object> document = new HashMap<String, Object>(); 
				document.put("id", docMap.get("id"));
				for (Map.Entry<String, Object> entry : metadata.entrySet()) {
					document.put("metadata_" + entry.getKey(), (String) entry.getValue());	
				}	
				System.out.println(document);
				Object DocFinal = document;
				listFinal.add(document);
				System.out.println(listFinal);
				
			}
			documentsFinal.put("", listFinal);
		
			//System.out.println(docsFinal);
			
			UserModel.setDocument(documentsFinal);
			solrUserRepository.save(UserModel);
			return new ResponseEntity<User>(UserModel, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	*/
}
