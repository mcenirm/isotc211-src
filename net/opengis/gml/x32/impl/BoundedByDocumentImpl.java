/*
 * An XML document type.
 * Localname: boundedBy
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BoundedByDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one boundedBy(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class BoundedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.BoundedByDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoundedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDEDBY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "boundedBy");
    
    
    /**
     * Gets the "boundedBy" element
     */
    public net.opengis.gml.x32.BoundingShapeType getBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BoundingShapeType target = null;
            target = (net.opengis.gml.x32.BoundingShapeType)get_store().find_element_user(BOUNDEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "boundedBy" element
     */
    public boolean isNilBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BoundingShapeType target = null;
            target = (net.opengis.gml.x32.BoundingShapeType)get_store().find_element_user(BOUNDEDBY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "boundedBy" element
     */
    public void setBoundedBy(net.opengis.gml.x32.BoundingShapeType boundedBy)
    {
        generatedSetterHelperImpl(boundedBy, BOUNDEDBY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "boundedBy" element
     */
    public net.opengis.gml.x32.BoundingShapeType addNewBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BoundingShapeType target = null;
            target = (net.opengis.gml.x32.BoundingShapeType)get_store().add_element_user(BOUNDEDBY$0);
            return target;
        }
    }
    
    /**
     * Nils the "boundedBy" element
     */
    public void setNilBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BoundingShapeType target = null;
            target = (net.opengis.gml.x32.BoundingShapeType)get_store().find_element_user(BOUNDEDBY$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.BoundingShapeType)get_store().add_element_user(BOUNDEDBY$0);
            }
            target.setNil();
        }
    }
}
