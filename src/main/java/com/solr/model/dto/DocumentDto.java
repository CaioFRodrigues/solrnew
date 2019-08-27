package com.solr.model.dto;

import java.util.Map;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Dynamic;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "DocumentDto")
public class DocumentDto {
	@Id
	@Indexed(name = "id", type = "string")
	private String id;
	
	@Dynamic @Field("metadata_*")
	public Map<String, Object> metadata;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	@Override
	public String toString() {
		return "DocumentDto [id=" + id + ", metadata=" + metadata + "]";
	}  
    
}
