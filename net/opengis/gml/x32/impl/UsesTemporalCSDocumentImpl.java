/*
 * An XML document type.
 * Localname: usesTemporalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesTemporalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesTemporalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesTemporalCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.UsesTemporalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesTemporalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESTEMPORALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesTemporalCS");
    
    
    /**
     * Gets the "usesTemporalCS" element
     */
    public net.opengis.gml.x32.TemporalCSPropertyType getUsesTemporalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalCSPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalCSPropertyType)get_store().find_element_user(USESTEMPORALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesTemporalCS" element
     */
    public void setUsesTemporalCS(net.opengis.gml.x32.TemporalCSPropertyType usesTemporalCS)
    {
        generatedSetterHelperImpl(usesTemporalCS, USESTEMPORALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesTemporalCS" element
     */
    public net.opengis.gml.x32.TemporalCSPropertyType addNewUsesTemporalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalCSPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalCSPropertyType)get_store().add_element_user(USESTEMPORALCS$0);
            return target;
        }
    }
}
