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

public class BucketFieldValue extends AbstractDTOBase {

    private String label;
    private String sourceDimensionValues;
    private Double rangeUpperBound;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSourceDimensionValues() {
        return sourceDimensionValues;
    }

    public void setSourceDimensionValues(String sourceDimensionValues) {
        this.sourceDimensionValues = sourceDimensionValues;
    }

    public Double getRangeUpperBound() {
        return rangeUpperBound;
    }

    public void setRangeUpperBound(Double rangeUpperBound) {
        this.rangeUpperBound = rangeUpperBound;
    }

}
