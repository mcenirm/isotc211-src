/*
 * An XML document type.
 * Localname: AbstractTimeSlice
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractTimeSliceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractTimeSlice(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractTimeSliceDocumentImpl extends net.opengis.gml.x32.impl.AbstractGMLDocumentImpl implements net.opengis.gml.x32.AbstractTimeSliceDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeSliceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTTIMESLICE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeSlice");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTIMESLICE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MovingObjectStatus"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeSlice"),
    });
    
    
    /**
     * Gets the "AbstractTimeSlice" element
     */
    public net.opengis.gml.x32.AbstractTimeSliceType getAbstractTimeSlice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.x32.AbstractTimeSliceType)get_store().find_element_user(ABSTRACTTIMESLICE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractTimeSlice" element
     */
    public void setAbstractTimeSlice(net.opengis.gml.x32.AbstractTimeSliceType abstractTimeSlice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.x32.AbstractTimeSliceType)get_store().find_element_user(ABSTRACTTIMESLICE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractTimeSliceType)get_store().add_element_user(ABSTRACTTIMESLICE$0);
            }
            target.set(abstractTimeSlice);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractTimeSlice" element
     */
    public net.opengis.gml.x32.AbstractTimeSliceType addNewAbstractTimeSlice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.x32.AbstractTimeSliceType)get_store().add_element_user(ABSTRACTTIMESLICE$0);
            return target;
        }
    }
}
