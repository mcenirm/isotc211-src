/*
 * An XML document type.
 * Localname: compoundCRSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CompoundCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one compoundCRSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CompoundCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CompoundCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompoundCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOUNDCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "compoundCRSRef");
    
    
    /**
     * Gets the "compoundCRSRef" element
     */
    public net.opengis.gml.x32.CompoundCRSPropertyType getCompoundCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompoundCRSPropertyType target = null;
            target = (net.opengis.gml.x32.CompoundCRSPropertyType)get_store().find_element_user(COMPOUNDCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "compoundCRSRef" element
     */
    public void setCompoundCRSRef(net.opengis.gml.x32.CompoundCRSPropertyType compoundCRSRef)
    {
        generatedSetterHelperImpl(compoundCRSRef, COMPOUNDCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "compoundCRSRef" element
     */
    public net.opengis.gml.x32.CompoundCRSPropertyType addNewCompoundCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompoundCRSPropertyType target = null;
            target = (net.opengis.gml.x32.CompoundCRSPropertyType)get_store().add_element_user(COMPOUNDCRSREF$0);
            return target;
        }
    }
}
