/*
 * An XML document type.
 * Localname: rangeSet
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RangeSetDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one rangeSet(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class RangeSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.RangeSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public RangeSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGESET$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rangeSet");
    
    
    /**
     * Gets the "rangeSet" element
     */
    public net.opengis.gml.x32.RangeSetType getRangeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RangeSetType target = null;
            target = (net.opengis.gml.x32.RangeSetType)get_store().find_element_user(RANGESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeSet" element
     */
    public void setRangeSet(net.opengis.gml.x32.RangeSetType rangeSet)
    {
        generatedSetterHelperImpl(rangeSet, RANGESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeSet" element
     */
    public net.opengis.gml.x32.RangeSetType addNewRangeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RangeSetType target = null;
            target = (net.opengis.gml.x32.RangeSetType)get_store().add_element_user(RANGESET$0);
            return target;
        }
    }
}
