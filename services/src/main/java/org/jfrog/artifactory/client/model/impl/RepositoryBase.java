package org.jfrog.artifactory.client.model.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jfrog.artifactory.client.model.Repository;
import org.jfrog.artifactory.client.model.repository.settings.RepositorySettings;

/**
 * @author jbaruch
 * @since 29/07/12
 */
public abstract class RepositoryBase implements Repository {

    private String key;
    private String description;
    private String notes;
    private String includesPattern;
    private String excludesPattern;
    protected String repoLayoutRef;
    @JsonIgnore
    protected RepositorySettings settings;

    protected RepositoryBase() {
    }

    protected RepositoryBase(String key, RepositorySettings settings,
        String description, String excludesPattern, String includesPattern,
        String notes, String repoLayoutRef) {

        this.key = key;
        this.settings = settings;
        this.description = description;
        this.excludesPattern = excludesPattern;
        this.includesPattern = includesPattern;
        this.notes = notes;
        this.repoLayoutRef = repoLayoutRef;
    }

    @Override
    public String getKey() {
        return key;
    }

    private void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getNotes() {
        return notes;
    }

    private void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String getIncludesPattern() {
        return includesPattern;
    }

    private void setIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
    }

    @Override
    public String getExcludesPattern() {
        return excludesPattern;
    }

    private void setExcludesPattern(String excludesPattern) {
        this.excludesPattern = excludesPattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepositoryBase that = (RepositoryBase) o;

        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (excludesPattern != null ? !excludesPattern.equals(that.excludesPattern) : that.excludesPattern != null)
            return false;
        if (includesPattern != null ? !includesPattern.equals(that.includesPattern) : that.includesPattern != null)
            return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (getRclass() != that.getRclass()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (getRclass() != null ? getRclass().hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (includesPattern != null ? includesPattern.hashCode() : 0);
        result = 31 * result + (excludesPattern != null ? excludesPattern.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "description='" + description + '\'' +
                ", key='" + key + '\'' +
                ", rclass=" + getRclass() +
                ", notes='" + notes + '\'' +
                ", includesPattern='" + includesPattern + '\'' +
                ", excludesPattern='" + excludesPattern + '\'' +
                '}';
    }

    @Override
    public String getRepoLayoutRef() {
        return repoLayoutRef;
    }

    private void setRepoLayoutRef(String repoLayoutRef) {
        this.repoLayoutRef = repoLayoutRef;
    }

    public RepositorySettings getRepositorySettings() {
        return settings;
    }

    public void setRepositorySettings(RepositorySettings settings) {
        this.settings = settings;
    }

}
