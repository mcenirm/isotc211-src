/*
 * An XML document type.
 * Localname: affineCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AffineCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one affineCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AffineCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AffineCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public AffineCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFINECS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "affineCS");
    private static final org.apache.xmlbeans.QNameSet AFFINECS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "affineCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesAffineCS"),
    });
    
    
    /**
     * Gets the "affineCS" element
     */
    public net.opengis.gml.x32.AffineCSPropertyType getAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().find_element_user(AFFINECS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "affineCS" element
     */
    public void setAffineCS(net.opengis.gml.x32.AffineCSPropertyType affineCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().find_element_user(AFFINECS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().add_element_user(AFFINECS$0);
            }
            target.set(affineCS);
        }
    }
    
    /**
     * Appends and returns a new empty "affineCS" element
     */
    public net.opengis.gml.x32.AffineCSPropertyType addNewAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().add_element_user(AFFINECS$0);
            return target;
        }
    }
}
