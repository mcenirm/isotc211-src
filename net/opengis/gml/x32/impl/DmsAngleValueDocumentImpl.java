/*
 * An XML document type.
 * Localname: dmsAngleValue
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DmsAngleValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one dmsAngleValue(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DmsAngleValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DmsAngleValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public DmsAngleValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DMSANGLEVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dmsAngleValue");
    
    
    /**
     * Gets the "dmsAngleValue" element
     */
    public net.opengis.gml.x32.DMSAngleType getDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DMSAngleType target = null;
            target = (net.opengis.gml.x32.DMSAngleType)get_store().find_element_user(DMSANGLEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dmsAngleValue" element
     */
    public void setDmsAngleValue(net.opengis.gml.x32.DMSAngleType dmsAngleValue)
    {
        generatedSetterHelperImpl(dmsAngleValue, DMSANGLEVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dmsAngleValue" element
     */
    public net.opengis.gml.x32.DMSAngleType addNewDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DMSAngleType target = null;
            target = (net.opengis.gml.x32.DMSAngleType)get_store().add_element_user(DMSANGLEVALUE$0);
            return target;
        }
    }
}
