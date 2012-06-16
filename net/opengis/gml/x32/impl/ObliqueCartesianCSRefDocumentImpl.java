/*
 * An XML document type.
 * Localname: obliqueCartesianCSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ObliqueCartesianCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one obliqueCartesianCSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ObliqueCartesianCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ObliqueCartesianCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObliqueCartesianCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBLIQUECARTESIANCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "obliqueCartesianCSRef");
    
    
    /**
     * Gets the "obliqueCartesianCSRef" element
     */
    public net.opengis.gml.x32.ObliqueCartesianCSPropertyType getObliqueCartesianCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObliqueCartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.ObliqueCartesianCSPropertyType)get_store().find_element_user(OBLIQUECARTESIANCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "obliqueCartesianCSRef" element
     */
    public void setObliqueCartesianCSRef(net.opengis.gml.x32.ObliqueCartesianCSPropertyType obliqueCartesianCSRef)
    {
        generatedSetterHelperImpl(obliqueCartesianCSRef, OBLIQUECARTESIANCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "obliqueCartesianCSRef" element
     */
    public net.opengis.gml.x32.ObliqueCartesianCSPropertyType addNewObliqueCartesianCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObliqueCartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.ObliqueCartesianCSPropertyType)get_store().add_element_user(OBLIQUECARTESIANCSREF$0);
            return target;
        }
    }
}
