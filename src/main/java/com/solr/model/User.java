
package com.solr.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "User")
public class User {

	@Id
	@Indexed(name = "id", type = "string")
	private String id;
		
	@Indexed(name = "parent", type = "boolean")
	private boolean parent;
	
	@Indexed(name = "document", type = "boolean")
	private List<Document> document;
    
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Document> getDocument() {
		return document;
	}
	public void setDocument(List<Document> document) {
		this.document = document;
	}
	public boolean isParent() {
		return parent;
	}
	public void setParent(boolean parent) {
		this.parent = parent;
	}
	
	
	
}
