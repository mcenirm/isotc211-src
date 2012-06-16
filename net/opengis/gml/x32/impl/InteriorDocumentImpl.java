/*
 * An XML document type.
 * Localname: interior
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.InteriorDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one interior(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class InteriorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.InteriorDocument
{
    private static final long serialVersionUID = 1L;
    
    public InteriorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "interior");
    
    
    /**
     * Gets the "interior" element
     */
    public net.opengis.gml.x32.AbstractRingPropertyType getInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "interior" element
     */
    public void setInterior(net.opengis.gml.x32.AbstractRingPropertyType interior)
    {
        generatedSetterHelperImpl(interior, INTERIOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "interior" element
     */
    public net.opengis.gml.x32.AbstractRingPropertyType addNewInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().add_element_user(INTERIOR$0);
            return target;
        }
    }
}
