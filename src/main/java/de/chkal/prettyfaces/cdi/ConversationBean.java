package de.chkal.prettyfaces.cdi;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class ConversationBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Conversation conversation;

    public String start() {

        conversation.begin();

        System.out.println("Conversation started: " + conversation.getId());

        return "/conversation.xhtml?faces-redirect=true";

    }
    
    public String getCurrentConversationId() {
        return conversation.getId();
    }

}
