/*
 * An XML document type.
 * Localname: ObliqueCartesianCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ObliqueCartesianCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ObliqueCartesianCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ObliqueCartesianCSDocumentImpl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.ObliqueCartesianCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObliqueCartesianCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBLIQUECARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ObliqueCartesianCS");
    
    
    /**
     * Gets the "ObliqueCartesianCS" element
     */
    public net.opengis.gml.x32.ObliqueCartesianCSType getObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObliqueCartesianCSType target = null;
            target = (net.opengis.gml.x32.ObliqueCartesianCSType)get_store().find_element_user(OBLIQUECARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ObliqueCartesianCS" element
     */
    public void setObliqueCartesianCS(net.opengis.gml.x32.ObliqueCartesianCSType obliqueCartesianCS)
    {
        generatedSetterHelperImpl(obliqueCartesianCS, OBLIQUECARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ObliqueCartesianCS" element
     */
    public net.opengis.gml.x32.ObliqueCartesianCSType addNewObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObliqueCartesianCSType target = null;
            target = (net.opengis.gml.x32.ObliqueCartesianCSType)get_store().add_element_user(OBLIQUECARTESIANCS$0);
            return target;
        }
    }
}
