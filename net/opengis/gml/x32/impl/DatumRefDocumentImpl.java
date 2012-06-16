/*
 * An XML document type.
 * Localname: datumRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DatumRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one datumRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DatumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DatumRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATUMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "datumRef");
    
    
    /**
     * Gets the "datumRef" element
     */
    public net.opengis.gml.x32.DatumPropertyType getDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DatumPropertyType target = null;
            target = (net.opengis.gml.x32.DatumPropertyType)get_store().find_element_user(DATUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "datumRef" element
     */
    public void setDatumRef(net.opengis.gml.x32.DatumPropertyType datumRef)
    {
        generatedSetterHelperImpl(datumRef, DATUMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "datumRef" element
     */
    public net.opengis.gml.x32.DatumPropertyType addNewDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DatumPropertyType target = null;
            target = (net.opengis.gml.x32.DatumPropertyType)get_store().add_element_user(DATUMREF$0);
            return target;
        }
    }
}
