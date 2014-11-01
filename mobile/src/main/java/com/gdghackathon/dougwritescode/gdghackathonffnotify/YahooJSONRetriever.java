package com.gdghackathon.dougwritescode.gdghackathonffnotify;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import oauth.signpost.OAuth;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;

public class YahooJSONRetriever {
    private OAuthConsumer mConsumer;
    private OAuthProvider mProvider;
    private String mCallbackUrl;

    public OAuthHelper(String scope, String callbackUrl) throws UnsupportedEncodingException {
        mConsumer = new CommonsHttpOAuthConsumer("dj0yJmk9SzV6blIzMmNYb21VJmQ9WVdrOVdUbDZjamRvTTJVbWNHbzlNQS0tJnM9Y29uc3VtZXJzZWNyZXQmeD0zOA--", "f51252649e3590176cfe182a8ed3ece321dd0ba4");
        // blarg, this API is terrible . . .
    }
}
