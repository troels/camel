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
public class ScopeInfo extends AbstractDTOBase {
    private String defaultValue;
    private ScopeValue[] values;

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public ScopeValue[] getValues() {
        return values;
    }

    public void setValues(ScopeValue[] values) {
        this.values = values;
    }
}
