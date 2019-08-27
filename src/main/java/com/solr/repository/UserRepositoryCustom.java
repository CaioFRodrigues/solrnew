package com.solr.repository;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleField;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.stereotype.Repository;

import com.solr.model.User;

@Repository
public class UserRepositoryCustom {
	@Resource
    private SolrTemplate solrTemplate;
	
	@Autowired
	UserRepository solrUserRepository;
	
	/* DO NOT WORK!
	
	public List<User> dynamicSearch(String searchTerm) {
        
		//Criteria conditions = createConditions(searchTerm);
		//System.out.println(conditions);
		//SimpleQuery search = new SimpleQuery(conditions);
         
        //ScoredPage<User> results = solrTemplate.queryForPage("User", search, User.class);
        //return results.getContent();
		
		Query query = new SimpleQuery(Criteria.where("metadata_language").contains("name")); 
        query.addProjectionOnField(new SimpleField("[child  parentFilter=parent:true]"));  
        
       
        System.out.println(query.getCriteria());
        ScoredPage<User> results = solrTemplate.queryForPage("User", query, User.class);
        System.out.println(results);
        return results.getContent();
    }
	
	private Criteria createConditions(String searchTerm) {
        Criteria conditions = null;
        conditions = new Criteria("metadata_title").contains(searchTerm);
        conditions = Criteria.where("parent").is(true).and("[child parentFilter=parent:true]");
        return conditions;
    }
    
    */
}
