/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.salesforce.api.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * DTO for Salesforce Resources.
 */
@XStreamAlias("urls")
public class RestResources extends AbstractDTOBase {

    private String sobjects;
    private String identity;
    private String connect;
    private String search;
    private String query;
    private String chatter;
    private String recent;
    private String tooling;
    private String licensing;
    private String analytics;
    private String limits;
    private String theme;
    private String queryAll;
    private String knowledgeManagement;
    private String process;
    private String flexiPage;
    private String quickActions;
    private String appMenu;
    private String compactLayouts;
    private String actions;
    private String tabs;
    private String wave;
    private String commerce;

    @XStreamAlias("exchange-connect")
    private String exchangeConnect;
    private String composite;
    private String parameterizedSearch;
    private String nouns;
    private String event;

    @XStreamAlias("async-queries")
    private String asyncQueries;
    private String match;
    private String emailConnect;
    private String support;

    public String getEmailConnect() {
        return emailConnect;
    }

    public void setEmailConnect(String emailConnect) {
        this.emailConnect = emailConnect;
    }

    public String getNouns() {
        return nouns;
    }

    public void setNouns(String nouns) {
        this.nouns = nouns;
    }

    public String getCommerce() {
        return commerce;
    }

    public void setCommerce(String commerce) {
        this.commerce = commerce;
    }

    public String getSobjects() {
        return sobjects;
    }

    public void setSobjects(String sobjects) {
        this.sobjects = sobjects;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getChatter() {
        return chatter;
    }

    public void setChatter(String chatter) {
        this.chatter = chatter;
    }

    public String getRecent() {
        return recent;
    }

    public void setRecent(String recent) {
        this.recent = recent;
    }

    public String getTooling() {
        return tooling;
    }

    public void setTooling(String tooling) {
        this.tooling = tooling;
    }

    public String getLicensing() {
        return licensing;
    }

    public void setLicensing(String licensing) {
        this.licensing = licensing;
    }

    public String getAnalytics() {
        return analytics;
    }

    public void setAnalytics(String analytics) {
        this.analytics = analytics;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getQueryAll() {
        return queryAll;
    }

    public void setQueryAll(String queryAll) {
        this.queryAll = queryAll;
    }

    public String getKnowledgeManagement() {
        return knowledgeManagement;
    }

    public void setKnowledgeManagement(String knowledgeManagement) {
        this.knowledgeManagement = knowledgeManagement;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getFlexiPage() {
        return flexiPage;
    }

    public void setFlexiPage(String flexiPage) {
        this.flexiPage = flexiPage;
    }

    public String getQuickActions() {
        return quickActions;
    }

    public void setQuickActions(String quickActions) {
        this.quickActions = quickActions;
    }

    public String getAppMenu() {
        return appMenu;
    }

    public void setAppMenu(String appMenu) {
        this.appMenu = appMenu;
    }

    public String getCompactLayouts() {
        return compactLayouts;
    }

    public void setCompactLayouts(String compactLayouts) {
        this.compactLayouts = compactLayouts;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getTabs() {
        return tabs;
    }

    public void setTabs(String tabs) {
        this.tabs = tabs;
    }

    public String getWave() {
        return wave;
    }

    public void setWave(String wave) {
        this.wave = wave;
    }

    @JsonProperty("exchange-connect")
    public String getExchangeConnect() {
        return exchangeConnect;
    }

    @JsonProperty("exchange-connect")
    public void setExchangeConnect(String exchangeConnect) {
        this.exchangeConnect = exchangeConnect;
    }

    public String getComposite() {
        return composite;
    }

    public void setComposite(String composite) {
        this.composite = composite;
    }

    public String getParameterizedSearch() {
        return parameterizedSearch;
    }

    public void setParameterizedSearch(String parameterizedSearch) {
        this.parameterizedSearch = parameterizedSearch;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @JsonProperty("async-queries")
    public String getAsyncQueries() {
        return asyncQueries;
    }

    @JsonProperty("async-queries")
    public void setAsyncQueries(String asyncQueries) {
        this.asyncQueries = asyncQueries;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }
}
