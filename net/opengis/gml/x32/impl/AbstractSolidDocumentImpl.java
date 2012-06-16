/*
 * An XML document type.
 * Localname: AbstractSolid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractSolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractSolid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractSolidDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometricPrimitiveDocumentImpl implements net.opengis.gml.x32.AbstractSolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractSolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSolid");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSOLID$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeSolid"),
    });
    
    
    /**
     * Gets the "AbstractSolid" element
     */
    public net.opengis.gml.x32.AbstractSolidType getAbstractSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSolidType target = null;
            target = (net.opengis.gml.x32.AbstractSolidType)get_store().find_element_user(ABSTRACTSOLID$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractSolid" element
     */
    public void setAbstractSolid(net.opengis.gml.x32.AbstractSolidType abstractSolid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSolidType target = null;
            target = (net.opengis.gml.x32.AbstractSolidType)get_store().find_element_user(ABSTRACTSOLID$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractSolidType)get_store().add_element_user(ABSTRACTSOLID$0);
            }
            target.set(abstractSolid);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractSolid" element
     */
    public net.opengis.gml.x32.AbstractSolidType addNewAbstractSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSolidType target = null;
            target = (net.opengis.gml.x32.AbstractSolidType)get_store().add_element_user(ABSTRACTSOLID$0);
            return target;
        }
    }
}
