/*
 * XML Type:  GenericName_PropertyType
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.GenericNamePropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML GenericName_PropertyType(@http://www.isotc211.org/2005/gco).
 *
 * This is a complex type.
 */
public class GenericNamePropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.GenericNamePropertyType
{
    private static final long serialVersionUID = 1L;
    
    public GenericNamePropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGENERICNAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "AbstractGenericName");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGENERICNAME$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "ScopedName"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "AbstractGenericName"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "LocalName"),
    });
    private static final javax.xml.namespace.QName NILREASON$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "nilReason");
    
    
    /**
     * Gets the "AbstractGenericName" element
     */
    public net.opengis.gml.x32.CodeType getAbstractGenericName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(ABSTRACTGENERICNAME$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AbstractGenericName" element
     */
    public boolean isSetAbstractGenericName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTGENERICNAME$1) != 0;
        }
    }
    
    /**
     * Sets the "AbstractGenericName" element
     */
    public void setAbstractGenericName(net.opengis.gml.x32.CodeType abstractGenericName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(ABSTRACTGENERICNAME$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(ABSTRACTGENERICNAME$0);
            }
            target.set(abstractGenericName);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGenericName" element
     */
    public net.opengis.gml.x32.CodeType addNewAbstractGenericName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(ABSTRACTGENERICNAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "AbstractGenericName" element
     */
    public void unsetAbstractGenericName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTGENERICNAME$1, 0);
        }
    }
    
    /**
     * Gets the "nilReason" attribute
     */
    public java.lang.Object getNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "nilReason" attribute
     */
    public net.opengis.gml.x32.NilReasonType xgetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
            return target;
        }
    }
    
    /**
     * True if has "nilReason" attribute
     */
    public boolean isSetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NILREASON$2) != null;
        }
    }
    
    /**
     * Sets the "nilReason" attribute
     */
    public void setNilReason(java.lang.Object nilReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NILREASON$2);
            }
            target.setObjectValue(nilReason);
        }
    }
    
    /**
     * Sets (as xml) the "nilReason" attribute
     */
    public void xsetNilReason(net.opengis.gml.x32.NilReasonType nilReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.NilReasonType)get_store().add_attribute_user(NILREASON$2);
            }
            target.set(nilReason);
        }
    }
    
    /**
     * Unsets the "nilReason" attribute
     */
    public void unsetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NILREASON$2);
        }
    }
}
