/*
 * An XML document type.
 * Localname: rangeMeaning
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RangeMeaningDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one rangeMeaning(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class RangeMeaningDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.RangeMeaningDocument
{
    private static final long serialVersionUID = 1L;
    
    public RangeMeaningDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGEMEANING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rangeMeaning");
    
    
    /**
     * Gets the "rangeMeaning" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType getRangeMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().find_element_user(RANGEMEANING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeMeaning" element
     */
    public void setRangeMeaning(net.opengis.gml.x32.CodeWithAuthorityType rangeMeaning)
    {
        generatedSetterHelperImpl(rangeMeaning, RANGEMEANING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeMeaning" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType addNewRangeMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().add_element_user(RANGEMEANING$0);
            return target;
        }
    }
}
