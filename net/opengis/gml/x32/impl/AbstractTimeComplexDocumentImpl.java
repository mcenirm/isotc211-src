/*
 * An XML document type.
 * Localname: AbstractTimeComplex
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractTimeComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractTimeComplex(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractTimeComplexDocumentImpl extends net.opengis.gml.x32.impl.AbstractTimeObjectDocumentImpl implements net.opengis.gml.x32.AbstractTimeComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTTIMECOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeComplex");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTIMECOMPLEX$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeComplex"),
    });
    
    
    /**
     * Gets the "AbstractTimeComplex" element
     */
    public net.opengis.gml.x32.AbstractTimeComplexType getAbstractTimeComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeComplexType target = null;
            target = (net.opengis.gml.x32.AbstractTimeComplexType)get_store().find_element_user(ABSTRACTTIMECOMPLEX$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractTimeComplex" element
     */
    public void setAbstractTimeComplex(net.opengis.gml.x32.AbstractTimeComplexType abstractTimeComplex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeComplexType target = null;
            target = (net.opengis.gml.x32.AbstractTimeComplexType)get_store().find_element_user(ABSTRACTTIMECOMPLEX$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractTimeComplexType)get_store().add_element_user(ABSTRACTTIMECOMPLEX$0);
            }
            target.set(abstractTimeComplex);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractTimeComplex" element
     */
    public net.opengis.gml.x32.AbstractTimeComplexType addNewAbstractTimeComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeComplexType target = null;
            target = (net.opengis.gml.x32.AbstractTimeComplexType)get_store().add_element_user(ABSTRACTTIMECOMPLEX$0);
            return target;
        }
    }
}
