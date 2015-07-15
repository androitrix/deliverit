package org.ndas.deliverit.web.config;

import javax.servlet.ServletContext;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer extends
		AbstractSecurityWebApplicationInitializer {

	/* (non-Javadoc)
	 * @see org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer#afterSpringSecurityFilterChain(javax.servlet.ServletContext)
	 */
	@Override
	protected void afterSpringSecurityFilterChain(ServletContext servletContext) {
		// TODO Auto-generated method stub
		super.afterSpringSecurityFilterChain(servletContext);
	}

}
