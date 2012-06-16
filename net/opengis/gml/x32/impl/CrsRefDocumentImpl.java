/*
 * An XML document type.
 * Localname: crsRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CrsRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one crsRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CrsRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CrsRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CrsRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "crsRef");
    
    
    /**
     * Gets the "crsRef" element
     */
    public net.opengis.gml.x32.CRSPropertyType getCrsRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().find_element_user(CRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "crsRef" element
     */
    public void setCrsRef(net.opengis.gml.x32.CRSPropertyType crsRef)
    {
        generatedSetterHelperImpl(crsRef, CRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "crsRef" element
     */
    public net.opengis.gml.x32.CRSPropertyType addNewCrsRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().add_element_user(CRSREF$0);
            return target;
        }
    }
}
