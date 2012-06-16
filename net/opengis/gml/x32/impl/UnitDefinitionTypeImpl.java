/*
 * XML Type:  UnitDefinitionType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UnitDefinitionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML UnitDefinitionType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class UnitDefinitionTypeImpl extends net.opengis.gml.x32.impl.DefinitionTypeImpl implements net.opengis.gml.x32.UnitDefinitionType
{
    private static final long serialVersionUID = 1L;
    
    public UnitDefinitionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITYTYPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "quantityType");
    private static final javax.xml.namespace.QName QUANTITYTYPEREFERENCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "quantityTypeReference");
    private static final javax.xml.namespace.QName CATALOGSYMBOL$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "catalogSymbol");
    
    
    /**
     * Gets the "quantityType" element
     */
    public net.opengis.gml.x32.StringOrRefType getQuantityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().find_element_user(QUANTITYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantityType" element
     */
    public boolean isSetQuantityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "quantityType" element
     */
    public void setQuantityType(net.opengis.gml.x32.StringOrRefType quantityType)
    {
        generatedSetterHelperImpl(quantityType, QUANTITYTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "quantityType" element
     */
    public net.opengis.gml.x32.StringOrRefType addNewQuantityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().add_element_user(QUANTITYTYPE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "quantityType" element
     */
    public void unsetQuantityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "quantityTypeReference" element
     */
    public net.opengis.gml.x32.ReferenceType getQuantityTypeReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(QUANTITYTYPEREFERENCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantityTypeReference" element
     */
    public boolean isSetQuantityTypeReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYTYPEREFERENCE$2) != 0;
        }
    }
    
    /**
     * Sets the "quantityTypeReference" element
     */
    public void setQuantityTypeReference(net.opengis.gml.x32.ReferenceType quantityTypeReference)
    {
        generatedSetterHelperImpl(quantityTypeReference, QUANTITYTYPEREFERENCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "quantityTypeReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewQuantityTypeReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(QUANTITYTYPEREFERENCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "quantityTypeReference" element
     */
    public void unsetQuantityTypeReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYTYPEREFERENCE$2, 0);
        }
    }
    
    /**
     * Gets the "catalogSymbol" element
     */
    public net.opengis.gml.x32.CodeType getCatalogSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(CATALOGSYMBOL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "catalogSymbol" element
     */
    public boolean isSetCatalogSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATALOGSYMBOL$4) != 0;
        }
    }
    
    /**
     * Sets the "catalogSymbol" element
     */
    public void setCatalogSymbol(net.opengis.gml.x32.CodeType catalogSymbol)
    {
        generatedSetterHelperImpl(catalogSymbol, CATALOGSYMBOL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "catalogSymbol" element
     */
    public net.opengis.gml.x32.CodeType addNewCatalogSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(CATALOGSYMBOL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "catalogSymbol" element
     */
    public void unsetCatalogSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATALOGSYMBOL$4, 0);
        }
    }
}
