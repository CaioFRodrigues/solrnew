package com.solr.model.dto;


import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "ObaaDto")
public class ObaaDto {
	
    //General
	@Id
	@Indexed(name = "id", type = "string")
	private String id;
	
	@Indexed(name = "title", type = "string")
    private String title;
	@Indexed(name = "language", type = "string")
    private String language;
	@Indexed(name = "aggregationLevel", type = "string")
    private String aggregationLevel;
	@Indexed(name = "structure", type = "string")
    private String structure;
	
    //Lifecycle
	@Indexed(name = "author", type = "string")
    private String author;
	@Indexed(name = "data", type = "string")
    private String data;
	
    //Educational
	@Indexed(name = "interactivityType", type = "string")
    private String interactivityType;
	@Indexed(name = "interactivityLevel", type = "string")
    private String interactivityLevel;
	@Indexed(name = "perception", type = "string")
    private String perception;
	@Indexed(name = "copresense", type = "string")
    private String copresense;
	@Indexed(name = "reciprocity", type = "string")
    private String reciprocity;
	@Indexed(name = "tipicalLearningTime", type = "string")
    private String tipicalLearningTime;
	@Indexed(name = "eduLanguage", type = "string")
    private String eduLanguage;
	@Indexed(name = "synchronism", type = "string")
    private String synchronism;
	
    //Accessibility
	@Indexed(name = "visual", type = "string")
	private String visual;
	@Indexed(name = "auditory", type = "string")
    private String auditory;
	@Indexed(name = "textual", type = "string")
    private String textual;
	@Indexed(name = "tactil", type = "string")
    private String tactil;
	
    //Technical
	@Indexed(name = "size", type = "string")
    private String size;
	@Indexed(name = "format", type = "string")
    private String format;
	@Indexed(name = "requirementsType", type = "string")
    private String requirementsType;
	@Indexed(name = "requirementsName", type = "string")
    private String requirementsName;
	@Indexed(name = "requirementsMinimumVersion", type = "string")
    private String requirementsMinimumVersion;
	@Indexed(name = "installationRemarks", type = "string")
    private String installationRemarks;
	@Indexed(name = "duration", type = "string")
    private String duration;
	@Indexed(name = "otherPlatformRequirements", type = "string")
    private String otherPlatformRequirements;
	@Indexed(name = "supportedPlatforms", type = "string")
    private List<String> supportedPlatforms;

    public ObaaDto() {
        //General
        title = "";
        language = "";
        aggregationLevel = "";
        structure = "";

        //Lifecycle
        author = "";
        data = "";

        //Educational
        interactivityType = "";
        interactivityLevel = "";
        perception = "";
        copresense = "";
        reciprocity = "";
        tipicalLearningTime = "";
        eduLanguage = "";
        synchronism = "";

        //Accessibility
        visual = "";
        auditory = "";
        textual = "";
        tactil = "";

        //Technical
        size = "";
        format = "";
        requirementsType = "";
        requirementsName = "";
        requirementsMinimumVersion = "";
        installationRemarks = "";
        duration = "";
        otherPlatformRequirements = "";
        supportedPlatforms = new ArrayList<>();
    }
    
    

    public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public void setSupportedPlatforms(List<String> supportedPlatforms) {
		this.supportedPlatforms = supportedPlatforms;
	}



	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAggregationLevel() {
        return aggregationLevel;
    }

    public void setAggregationLevel(String aggregationLevel) {
        this.aggregationLevel = aggregationLevel;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getInteractivityType() {
        return interactivityType;
    }

    public void setInteractivityType(String interactivityType) {
        this.interactivityType = interactivityType;
    }

    public String getInteractivityLevel() {
        return interactivityLevel;
    }

    public void setInteractivityLevel(String interactivityLevel) {
        this.interactivityLevel = interactivityLevel;
    }

    public String getPerception() {
        return perception;
    }

    public void setPerception(String perception) {
        this.perception = perception;
    }

    public String getCopresense() {
        return copresense;
    }

    public void setCopresense(String copresense) {
        this.copresense = copresense;
    }

    public String getReciprocity() {
        return reciprocity;
    }

    public void setReciprocity(String reciprocity) {
        this.reciprocity = reciprocity;
    }

    public String getTipicalLearningTime() {
        return tipicalLearningTime;
    }

    public void setTipicalLearningTime(String tipicalLearningTime) {
        this.tipicalLearningTime = tipicalLearningTime;
    }

    public String getEduLanguage() {
        return eduLanguage;
    }

    public void setEduLanguage(String eduLanguage) {
        this.eduLanguage = eduLanguage;
    }

    public String getVisual() {
        return visual;
    }

    public void setVisual(String visual) {
        this.visual = visual;
    }

    public String getAuditory() {
        return auditory;
    }

    public void setAuditory(String auditory) {
        this.auditory = auditory;
    }

    public String getTextual() {
        return textual;
    }

    public void setTextual(String textual) {
        this.textual = textual;
    }

    public String getTactil() {
        return tactil;
    }

    public void setTactil(String tactil) {
        this.tactil = tactil;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRequirementsType() {
        return requirementsType;
    }

    public void setRequirementsType(String requirementsType) {
        this.requirementsType = requirementsType;
    }

    public String getRequirementsName() {
        return requirementsName;
    }

    public void setRequirementsName(String requirementsName) {
        this.requirementsName = requirementsName;
    }

    public String getRequirementsMinimumVersion() {
        return requirementsMinimumVersion;
    }

    public void setRequirementsMinimumVersion(String requirementsMinimumVersion) {
        this.requirementsMinimumVersion = requirementsMinimumVersion;
    }

    public String getInstallationRemarks() {
        return installationRemarks;
    }

    public void setInstallationRemarks(String installationRemarks) {
        this.installationRemarks = installationRemarks;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<String> getSupportedPlatforms() {
        return supportedPlatforms;
    }

    public void addSupportedPlatforms(String supportedPlatform) {
        this.supportedPlatforms.add(supportedPlatform);
    }

    public String getSynchronism() {
        return synchronism;
    }

    public void setSynchronism(String synchronism) {
        this.synchronism = synchronism;
    }

    public String getOtherPlatformRequirements() {
        return otherPlatformRequirements;
    }

    public void setOtherPlatformRequirements(String otherPlatformRequirements) {
        this.otherPlatformRequirements = otherPlatformRequirements;
    }
}
