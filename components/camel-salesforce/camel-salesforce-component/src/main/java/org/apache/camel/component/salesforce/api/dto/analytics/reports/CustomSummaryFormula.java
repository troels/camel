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
public class CustomSummaryFormula extends AbstractDTOBase {

    private String label;
    private String description;
    private String formulaType;
    private Integer decimalPlaces;
    private String downGroup;
    private String downGroupType;
    private String acrossGroup;
    private String acrossGroupType;
    private String formula;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormulaType() {
        return formulaType;
    }

    public void setFormulaType(String formulaType) {
        this.formulaType = formulaType;
    }

    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public String getDownGroup() {
        return downGroup;
    }

    public void setDownGroup(String downGroup) {
        this.downGroup = downGroup;
    }

    public String getDownGroupType() {
        return downGroupType;
    }

    public void setDownGroupType(String downGroupType) {
        this.downGroupType = downGroupType;
    }

    public String getAcrossGroup() {
        return acrossGroup;
    }

    public void setAcrossGroup(String acrossGroup) {
        this.acrossGroup = acrossGroup;
    }

    public String getAcrossGroupType() {
        return acrossGroupType;
    }

    public void setAcrossGroupType(String acrossGroupType) {
        this.acrossGroupType = acrossGroupType;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }
}
