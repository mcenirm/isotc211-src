/*
 * An XML document type.
 * Localname: DS_Sensor
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSSensorDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_Sensor(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSSensorDocumentImpl extends org.isotc211.x2005.gmd.impl.DSSeriesDocumentImpl implements org.isotc211.x2005.gmd.DSSensorDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSSensorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSSENSOR$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Sensor");
    
    
    /**
     * Gets the "DS_Sensor" element
     */
    public org.isotc211.x2005.gmd.DSSensorType getDSSensor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSSensorType target = null;
            target = (org.isotc211.x2005.gmd.DSSensorType)get_store().find_element_user(DSSENSOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_Sensor" element
     */
    public void setDSSensor(org.isotc211.x2005.gmd.DSSensorType dsSensor)
    {
        generatedSetterHelperImpl(dsSensor, DSSENSOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DS_Sensor" element
     */
    public org.isotc211.x2005.gmd.DSSensorType addNewDSSensor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSSensorType target = null;
            target = (org.isotc211.x2005.gmd.DSSensorType)get_store().add_element_user(DSSENSOR$0);
            return target;
        }
    }
}
