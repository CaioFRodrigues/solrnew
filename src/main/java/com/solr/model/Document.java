package com.solr.model;

import java.util.Map;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Dynamic;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "Document")
public class Document  {
	
	@Id
	@Indexed(name = "id", type = "string")
	private String id;
	
	@Dynamic @Field("metadata_*")
	private Map<String, Object> metadata;

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
		return "Document [id=" + id + ", metadata=" + metadata + "]";
	}

}
