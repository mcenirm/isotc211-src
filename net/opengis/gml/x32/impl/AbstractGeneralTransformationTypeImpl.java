/*
 * XML Type:  AbstractGeneralTransformationType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeneralTransformationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractGeneralTransformationType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractGeneralTransformationTypeImpl extends net.opengis.gml.x32.impl.AbstractCoordinateOperationTypeImpl implements net.opengis.gml.x32.AbstractGeneralTransformationType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralTransformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "operationVersion");
    private static final javax.xml.namespace.QName SOURCECRS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sourceCRS");
    private static final javax.xml.namespace.QName TARGETCRS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "targetCRS");
    
    
    /**
     * Gets the "operationVersion" element
     */
    public java.lang.String getOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONVERSION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "operationVersion" element
     */
    public boolean isSetOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONVERSION$0) != 0;
        }
    }
    
    /**
     * Sets the "operationVersion" element
     */
    public void setOperationVersion(java.lang.String operationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONVERSION$0);
            }
            target.setStringValue(operationVersion);
        }
    }
    
    /**
     * Sets (as xml) the "operationVersion" element
     */
    public void xsetOperationVersion(org.apache.xmlbeans.XmlString operationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATIONVERSION$0);
            }
            target.set(operationVersion);
        }
    }
    
    /**
     * Unsets the "operationVersion" element
     */
    public void unsetOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONVERSION$0, 0);
        }
    }
    
    /**
     * Gets the "sourceCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType getSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().find_element_user(SOURCECRS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sourceCRS" element
     */
    public boolean isSetSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCECRS$2) != 0;
        }
    }
    
    /**
     * Sets the "sourceCRS" element
     */
    public void setSourceCRS(net.opengis.gml.x32.CRSPropertyType sourceCRS)
    {
        generatedSetterHelperImpl(sourceCRS, SOURCECRS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sourceCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType addNewSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().add_element_user(SOURCECRS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sourceCRS" element
     */
    public void unsetSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCECRS$2, 0);
        }
    }
    
    /**
     * Gets the "targetCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType getTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().find_element_user(TARGETCRS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "targetCRS" element
     */
    public boolean isSetTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETCRS$4) != 0;
        }
    }
    
    /**
     * Sets the "targetCRS" element
     */
    public void setTargetCRS(net.opengis.gml.x32.CRSPropertyType targetCRS)
    {
        generatedSetterHelperImpl(targetCRS, TARGETCRS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "targetCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType addNewTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().add_element_user(TARGETCRS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "targetCRS" element
     */
    public void unsetTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETCRS$4, 0);
        }
    }
}
