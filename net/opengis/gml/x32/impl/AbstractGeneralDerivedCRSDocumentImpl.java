/*
 * An XML document type.
 * Localname: AbstractGeneralDerivedCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeneralDerivedCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractGeneralDerivedCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGeneralDerivedCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractSingleCRSDocumentImpl implements net.opengis.gml.x32.AbstractGeneralDerivedCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralDerivedCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGENERALDERIVEDCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralDerivedCRS");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGENERALDERIVEDCRS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ProjectedCRS"),
    });
    
    
    /**
     * Gets the "AbstractGeneralDerivedCRS" element
     */
    public net.opengis.gml.x32.AbstractGeneralDerivedCRSType getAbstractGeneralDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralDerivedCRSType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralDerivedCRSType)get_store().find_element_user(ABSTRACTGENERALDERIVEDCRS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGeneralDerivedCRS" element
     */
    public void setAbstractGeneralDerivedCRS(net.opengis.gml.x32.AbstractGeneralDerivedCRSType abstractGeneralDerivedCRS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralDerivedCRSType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralDerivedCRSType)get_store().find_element_user(ABSTRACTGENERALDERIVEDCRS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeneralDerivedCRSType)get_store().add_element_user(ABSTRACTGENERALDERIVEDCRS$0);
            }
            target.set(abstractGeneralDerivedCRS);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGeneralDerivedCRS" element
     */
    public net.opengis.gml.x32.AbstractGeneralDerivedCRSType addNewAbstractGeneralDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralDerivedCRSType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralDerivedCRSType)get_store().add_element_user(ABSTRACTGENERALDERIVEDCRS$0);
            return target;
        }
    }
}
