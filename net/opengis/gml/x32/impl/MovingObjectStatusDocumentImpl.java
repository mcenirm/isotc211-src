/*
 * An XML document type.
 * Localname: MovingObjectStatus
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MovingObjectStatusDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one MovingObjectStatus(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MovingObjectStatusDocumentImpl extends net.opengis.gml.x32.impl.AbstractTimeSliceDocumentImpl implements net.opengis.gml.x32.MovingObjectStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public MovingObjectStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVINGOBJECTSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MovingObjectStatus");
    
    
    /**
     * Gets the "MovingObjectStatus" element
     */
    public net.opengis.gml.x32.MovingObjectStatusType getMovingObjectStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MovingObjectStatusType target = null;
            target = (net.opengis.gml.x32.MovingObjectStatusType)get_store().find_element_user(MOVINGOBJECTSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MovingObjectStatus" element
     */
    public void setMovingObjectStatus(net.opengis.gml.x32.MovingObjectStatusType movingObjectStatus)
    {
        generatedSetterHelperImpl(movingObjectStatus, MOVINGOBJECTSTATUS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MovingObjectStatus" element
     */
    public net.opengis.gml.x32.MovingObjectStatusType addNewMovingObjectStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MovingObjectStatusType target = null;
            target = (net.opengis.gml.x32.MovingObjectStatusType)get_store().add_element_user(MOVINGOBJECTSTATUS$0);
            return target;
        }
    }
}
