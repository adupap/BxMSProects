package com.redhat.coolstore.util;

import org.drools.event.knowledgeagent.AfterChangeSetAppliedEvent;
import org.drools.event.knowledgeagent.AfterChangeSetProcessedEvent;
import org.drools.event.knowledgeagent.AfterResourceProcessedEvent;
import org.drools.event.knowledgeagent.BeforeChangeSetAppliedEvent;
import org.drools.event.knowledgeagent.BeforeChangeSetProcessedEvent;
import org.drools.event.knowledgeagent.BeforeResourceProcessedEvent;
import org.drools.event.knowledgeagent.KnowledgeAgentEventListener;
import org.drools.event.knowledgeagent.KnowledgeBaseUpdatedEvent;
import org.drools.event.knowledgeagent.ResourceCompilationFailedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogKnowledgeAgentListener implements KnowledgeAgentEventListener {
    
	Logger log = LoggerFactory.getLogger(KnowledgeAgentEventListener.class);
	
    @Override
    public void beforeChangeSetApplied(BeforeChangeSetAppliedEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterChangeSetApplied(AfterChangeSetAppliedEvent event) {
        log.info(event.toString());
    }

    @Override
    public void beforeChangeSetProcessed(BeforeChangeSetProcessedEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterChangeSetProcessed(AfterChangeSetProcessedEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void beforeResourceProcessed(BeforeResourceProcessedEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterResourceProcessed(AfterResourceProcessedEvent event) {
        log.info(event.toString());
    }

    @Override
    public void knowledgeBaseUpdated(KnowledgeBaseUpdatedEvent event) {
        log.info(event.toString());
    }

    @Override
    public void resourceCompilationFailed(ResourceCompilationFailedEvent event) {
        // TODO Auto-generated method stub

    }

}
