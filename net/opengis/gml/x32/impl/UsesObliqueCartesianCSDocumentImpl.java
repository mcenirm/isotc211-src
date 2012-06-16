/*
 * An XML document type.
 * Localname: usesObliqueCartesianCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesObliqueCartesianCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesObliqueCartesianCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesObliqueCartesianCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.UsesObliqueCartesianCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesObliqueCartesianCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESOBLIQUECARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesObliqueCartesianCS");
    
    
    /**
     * Gets the "usesObliqueCartesianCS" element
     */
    public net.opengis.gml.x32.ObliqueCartesianCSPropertyType getUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObliqueCartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.ObliqueCartesianCSPropertyType)get_store().find_element_user(USESOBLIQUECARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesObliqueCartesianCS" element
     */
    public void setUsesObliqueCartesianCS(net.opengis.gml.x32.ObliqueCartesianCSPropertyType usesObliqueCartesianCS)
    {
        generatedSetterHelperImpl(usesObliqueCartesianCS, USESOBLIQUECARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesObliqueCartesianCS" element
     */
    public net.opengis.gml.x32.ObliqueCartesianCSPropertyType addNewUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObliqueCartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.ObliqueCartesianCSPropertyType)get_store().add_element_user(USESOBLIQUECARTESIANCS$0);
            return target;
        }
    }
}
