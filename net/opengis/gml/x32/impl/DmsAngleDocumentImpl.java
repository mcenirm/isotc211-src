/*
 * An XML document type.
 * Localname: dmsAngle
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DmsAngleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one dmsAngle(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DmsAngleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DmsAngleDocument
{
    private static final long serialVersionUID = 1L;
    
    public DmsAngleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DMSANGLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dmsAngle");
    
    
    /**
     * Gets the "dmsAngle" element
     */
    public net.opengis.gml.x32.DMSAngleType getDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DMSAngleType target = null;
            target = (net.opengis.gml.x32.DMSAngleType)get_store().find_element_user(DMSANGLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dmsAngle" element
     */
    public void setDmsAngle(net.opengis.gml.x32.DMSAngleType dmsAngle)
    {
        generatedSetterHelperImpl(dmsAngle, DMSANGLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dmsAngle" element
     */
    public net.opengis.gml.x32.DMSAngleType addNewDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DMSAngleType target = null;
            target = (net.opengis.gml.x32.DMSAngleType)get_store().add_element_user(DMSANGLE$0);
            return target;
        }
    }
}
