/*
 * Copyright 2016 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.salesforce.api.dto.analytics.reports;

import org.apache.camel.component.salesforce.api.dto.AbstractDTOBase;

/**
 *
 * @author troels
 */
public class CrossFilter extends AbstractDTOBase {
    private ReportFilter criteria;
    private Boolean includesObject;
    private String primaryEntityField;
    private String relatedEntity;
    private String relatedEntityJoinField;
    
    public ReportFilter getCriteria() {
        return criteria;
    }

    public void setCriteria(ReportFilter criteria) {
        this.criteria = criteria;
    }

    public Boolean getIncludesObject() {
        return includesObject;
    }

    public void setIncludesObject(Boolean includesObject) {
        this.includesObject = includesObject;
    }

    public String getPrimaryEntityField() {
        return primaryEntityField;
    }

    public void setPrimaryEntityField(String primaryEntityField) {
        this.primaryEntityField = primaryEntityField;
    }

    public String getRelatedEntity() {
        return relatedEntity;
    }

    public void setRelatedEntity(String relatedEntity) {
        this.relatedEntity = relatedEntity;
    }

    public String getRelatedEntityJoinField() {
        return relatedEntityJoinField;
    }

    public void setRelatedEntityJoinField(String relatedEntityJoinField) {
        this.relatedEntityJoinField = relatedEntityJoinField;
    }


}
