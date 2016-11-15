/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 9, 2016 3:14:13 PM                      ---
 * ----------------------------------------------------------------
 */
package com.ehealth.core.jalo;

import com.ehealth.core.constants.EHealthCoreConstants;
import com.ehealth.core.jalo.ApparelProduct;
import com.ehealth.core.jalo.ApparelSizeVariantProduct;
import com.ehealth.core.jalo.ApparelStyleVariantProduct;
import com.ehealth.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>EHealthCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEHealthCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("comingSoon", AttributeMode.INITIAL);
		tmp.put("accessories", AttributeMode.INITIAL);
		tmp.put("rating", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.accessories</code> attribute.
	 * @return the accessories
	 */
	public List<String> getAccessories(final SessionContext ctx, final Product item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, EHealthCoreConstants.Attributes.Product.ACCESSORIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.accessories</code> attribute.
	 * @return the accessories
	 */
	public List<String> getAccessories(final Product item)
	{
		return getAccessories( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.accessories</code> attribute. 
	 * @param value the accessories
	 */
	public void setAccessories(final SessionContext ctx, final Product item, final List<String> value)
	{
		item.setProperty(ctx, EHealthCoreConstants.Attributes.Product.ACCESSORIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.accessories</code> attribute. 
	 * @param value the accessories
	 */
	public void setAccessories(final Product item, final List<String> value)
	{
		setAccessories( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.comingSoon</code> attribute.
	 * @return the comingSoon - Coming Soon Products
	 */
	public Boolean isComingSoon(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, EHealthCoreConstants.Attributes.Product.COMINGSOON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.comingSoon</code> attribute.
	 * @return the comingSoon - Coming Soon Products
	 */
	public Boolean isComingSoon(final Product item)
	{
		return isComingSoon( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.comingSoon</code> attribute. 
	 * @return the comingSoon - Coming Soon Products
	 */
	public boolean isComingSoonAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isComingSoon( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.comingSoon</code> attribute. 
	 * @return the comingSoon - Coming Soon Products
	 */
	public boolean isComingSoonAsPrimitive(final Product item)
	{
		return isComingSoonAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.comingSoon</code> attribute. 
	 * @param value the comingSoon - Coming Soon Products
	 */
	public void setComingSoon(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, EHealthCoreConstants.Attributes.Product.COMINGSOON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.comingSoon</code> attribute. 
	 * @param value the comingSoon - Coming Soon Products
	 */
	public void setComingSoon(final Product item, final Boolean value)
	{
		setComingSoon( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.comingSoon</code> attribute. 
	 * @param value the comingSoon - Coming Soon Products
	 */
	public void setComingSoon(final SessionContext ctx, final Product item, final boolean value)
	{
		setComingSoon( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.comingSoon</code> attribute. 
	 * @param value the comingSoon - Coming Soon Products
	 */
	public void setComingSoon(final Product item, final boolean value)
	{
		setComingSoon( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( EHealthCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( EHealthCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( EHealthCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( EHealthCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return EHealthCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.rating</code> attribute.
	 * @return the rating
	 */
	public String getRating(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, EHealthCoreConstants.Attributes.Product.RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.rating</code> attribute.
	 * @return the rating
	 */
	public String getRating(final Product item)
	{
		return getRating( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, EHealthCoreConstants.Attributes.Product.RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final Product item, final String value)
	{
		setRating( getSession().getSessionContext(), item, value );
	}
	
}
