
package com.solr.model.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "DocumentTinyDto")
public class DocumentTinyDto {
	@Id
	@Indexed(name = "id", type = "string")
    private String id;
	
	@Indexed(name = "title", type = "string") 
    private String title;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



}
