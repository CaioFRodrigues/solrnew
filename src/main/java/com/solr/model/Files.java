
package com.solr.model;


import java.util.Map;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Dynamic;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "Files")
public class Files {

	@Id
	@Indexed(name = "id", type = "string")
	private String id;
	
	@Dynamic @Field("document_*")
	private Map<String, Object> document;
    
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map<String, Object> getDocument() {
		return document;
	}
	public void setDocument(Map<String, Object> document) {
		this.document = document;
	}

}
