/*
 * An XML document type.
 * Localname: AbstractGeneralConversion
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeneralConversionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractGeneralConversion(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGeneralConversionDocumentImpl extends net.opengis.gml.x32.impl.AbstractOperationDocumentImpl implements net.opengis.gml.x32.AbstractGeneralConversionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralConversionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGENERALCONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralConversion");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGENERALCONVERSION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Conversion"),
    });
    
    
    /**
     * Gets the "AbstractGeneralConversion" element
     */
    public net.opengis.gml.x32.AbstractGeneralConversionType getAbstractGeneralConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralConversionType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralConversionType)get_store().find_element_user(ABSTRACTGENERALCONVERSION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGeneralConversion" element
     */
    public void setAbstractGeneralConversion(net.opengis.gml.x32.AbstractGeneralConversionType abstractGeneralConversion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralConversionType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralConversionType)get_store().find_element_user(ABSTRACTGENERALCONVERSION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeneralConversionType)get_store().add_element_user(ABSTRACTGENERALCONVERSION$0);
            }
            target.set(abstractGeneralConversion);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGeneralConversion" element
     */
    public net.opengis.gml.x32.AbstractGeneralConversionType addNewAbstractGeneralConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralConversionType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralConversionType)get_store().add_element_user(ABSTRACTGENERALCONVERSION$0);
            return target;
        }
    }
}
