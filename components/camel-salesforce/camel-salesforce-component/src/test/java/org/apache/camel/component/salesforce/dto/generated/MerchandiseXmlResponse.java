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
package org.apache.camel.component.salesforce.dto.generated;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Response DTO for Salesforce APEX REST calls.
 * See https://www.salesforce.com/us/developer/docs/apexcode/Content/apex_rest_methods.htm.
 */
@XStreamAlias("response")
public class MerchandiseXmlResponse extends Merchandise__c {
    // XML response contains a type string with the SObject type name
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
