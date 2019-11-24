package com.kodilla.patterns.strategy.social;

public abstract class User {
    private final String name;
    private SocialPublisher socialPublisher;

    public User(String name, SocialPublisher socialPublisher) {
        this.name = name;
        this.socialPublisher = socialPublisher;
    }

    public String getName() {
        return name;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public String sharingMethod(SocialPublisher preferredSocialPublisher){
        return  preferredSocialPublisher.share();
    }
}
