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

public class Chart extends AbstractDTOBase {
    private String chartType;
    private String groupings;
    private Boolean hasLegend;
    private Boolean showChartValues;
    private String[] summaries;
    private String summaryAxisLocations;
    private String title;

    public String getChartType() {
        return chartType;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public String getGroupings() {
        return groupings;
    }

    public void setGroupings(String groupings) {
        this.groupings = groupings;
    }

    public Boolean getHasLegend() {
        return hasLegend;
    }

    public void setHasLegend(Boolean hasLegend) {
        this.hasLegend = hasLegend;
    }

    public Boolean getShowChartValues() {
        return showChartValues;
    }

    public void setShowChartValues(Boolean showChartValues) {
        this.showChartValues = showChartValues;
    }

    public String[] getSummaries() {
        return summaries;
    }

    public void setSummaries(String[] summaries) {
        this.summaries = summaries;
    }

    public String getSummaryAxisLocations() {
        return summaryAxisLocations;
    }

    public void setSummaryAxisLocations(String summaryAxisLocations) {
        this.summaryAxisLocations = summaryAxisLocations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
