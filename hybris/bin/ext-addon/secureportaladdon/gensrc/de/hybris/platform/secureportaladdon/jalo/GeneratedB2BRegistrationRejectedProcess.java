/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 9, 2016 3:14:13 PM                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.platform.secureportaladdon.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.secureportaladdon.constants.SecureportaladdonConstants;
import de.hybris.platform.secureportaladdon.jalo.B2BRegistrationProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess B2BRegistrationRejectedProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedB2BRegistrationRejectedProcess extends B2BRegistrationProcess
{
	/** Qualifier of the <code>B2BRegistrationRejectedProcess.rejectReason</code> attribute **/
	public static final String REJECTREASON = "rejectReason";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(B2BRegistrationProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REJECTREASON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationRejectedProcess.rejectReason</code> attribute.
	 * @return the rejectReason
	 */
	public String getRejectReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REJECTREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationRejectedProcess.rejectReason</code> attribute.
	 * @return the rejectReason
	 */
	public String getRejectReason()
	{
		return getRejectReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationRejectedProcess.rejectReason</code> attribute. 
	 * @param value the rejectReason
	 */
	public void setRejectReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REJECTREASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BRegistrationRejectedProcess.rejectReason</code> attribute. 
	 * @param value the rejectReason
	 */
	public void setRejectReason(final String value)
	{
		setRejectReason( getSession().getSessionContext(), value );
	}
	
}
