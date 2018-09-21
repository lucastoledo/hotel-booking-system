package com.booking.system.hotel.zuulsvr.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import brave.Tracer;

/**
 * add tracer id, correlation Id to the HTTP response for tracking purposes
 * @author lucas
 *
 */
@Component
public class PostResponseFilter extends ZuulFilter {
	private static final int FILTER_ORDER = 1;
	private static final boolean SHOULD_FILTER = true;
	private static final Logger logger = LoggerFactory.getLogger(PostResponseFilter.class);

	@Autowired	
	private Tracer tracer;
	
	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		
		logger.info("lucas: tracer.currentSpan().context().traceIdString(): "+tracer.currentSpan().context().traceIdString());
		ctx.getResponse().addHeader("tmx-correlation-id", tracer.currentSpan().context().traceIdString());

		return null;
	}

	@Override
	public boolean shouldFilter() {
		return SHOULD_FILTER;
	}

	@Override
	public int filterOrder() {
		return FILTER_ORDER;
	}

	@Override
	public String filterType() {
		return "post";
	}

}
