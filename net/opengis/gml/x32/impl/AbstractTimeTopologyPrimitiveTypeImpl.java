/*
 * XML Type:  AbstractTimeTopologyPrimitiveType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractTimeTopologyPrimitiveType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractTimeTopologyPrimitiveTypeImpl extends net.opengis.gml.x32.impl.AbstractTimePrimitiveTypeImpl implements net.opengis.gml.x32.AbstractTimeTopologyPrimitiveType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeTopologyPrimitiveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "complex");
    
    
    /**
     * Gets the "complex" element
     */
    public net.opengis.gml.x32.ReferenceType getComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(COMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "complex" element
     */
    public boolean isSetComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLEX$0) != 0;
        }
    }
    
    /**
     * Sets the "complex" element
     */
    public void setComplex(net.opengis.gml.x32.ReferenceType complex)
    {
        generatedSetterHelperImpl(complex, COMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complex" element
     */
    public net.opengis.gml.x32.ReferenceType addNewComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(COMPLEX$0);
            return target;
        }
    }
    
    /**
     * Unsets the "complex" element
     */
    public void unsetComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLEX$0, 0);
        }
    }
}
