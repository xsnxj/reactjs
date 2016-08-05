package com.mrlzy.shiro.filter;


import org.apache.shiro.authc.AuthenticationException;

import javax.servlet.ServletRequest;

public class FormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter {

    public static final String DEFAULT_ERROR_KEY_ATTRIBUTE_MSG = "error";


    private String failureMsgAttribute = DEFAULT_ERROR_KEY_ATTRIBUTE_MSG;



    @Override
    protected void setFailureAttribute(ServletRequest request, AuthenticationException ae) {
        request.setAttribute(getFailureMsgAttribute(), ae.getMessage());
        super.setFailureAttribute(request,ae);
    }


    public String getFailureMsgAttribute() {
        return failureMsgAttribute;
    }

    public void setFailureMsgAttribute(String failureMsgAttribute) {
        this.failureMsgAttribute = failureMsgAttribute;
    }
}
