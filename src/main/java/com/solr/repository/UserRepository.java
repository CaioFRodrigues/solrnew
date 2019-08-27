package com.solr.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;
import com.solr.model.User;


public interface UserRepository extends SolrCrudRepository<User, Long>  {
	
	//@Query(value = "parent:true AND metadata_title:name",  fields = {"[child parentFilter=parent:true]"})
	//public List<User> findByTitle(String value);
	
	public User findById(String id); 
	
	//@Query(name = "User.findByDocument.findByMetadata.findByTitle")
	//public List<User> findByAnnotatedNamedQuery(String title);	
 
}
