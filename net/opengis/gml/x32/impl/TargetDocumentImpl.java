/*
 * An XML document type.
 * Localname: target
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TargetDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one target(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TargetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public TargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGET$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "target");
    private static final org.apache.xmlbeans.QNameSet TARGET$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "target"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "subject"),
    });
    
    
    /**
     * Gets the "target" element
     */
    public net.opengis.gml.x32.TargetPropertyType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TargetPropertyType target = null;
            target = (net.opengis.gml.x32.TargetPropertyType)get_store().find_element_user(TARGET$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "target" element
     */
    public void setTarget(net.opengis.gml.x32.TargetPropertyType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TargetPropertyType target = null;
            target = (net.opengis.gml.x32.TargetPropertyType)get_store().find_element_user(TARGET$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.TargetPropertyType)get_store().add_element_user(TARGET$0);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "target" element
     */
    public net.opengis.gml.x32.TargetPropertyType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TargetPropertyType target = null;
            target = (net.opengis.gml.x32.TargetPropertyType)get_store().add_element_user(TARGET$0);
            return target;
        }
    }
}
