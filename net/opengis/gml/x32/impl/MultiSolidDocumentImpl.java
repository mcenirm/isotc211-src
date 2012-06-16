/*
 * An XML document type.
 * Localname: MultiSolid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiSolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one MultiSolid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiSolidDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometricAggregateDocumentImpl implements net.opengis.gml.x32.MultiSolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolid");
    
    
    /**
     * Gets the "MultiSolid" element
     */
    public net.opengis.gml.x32.MultiSolidType getMultiSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiSolidType target = null;
            target = (net.opengis.gml.x32.MultiSolidType)get_store().find_element_user(MULTISOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiSolid" element
     */
    public void setMultiSolid(net.opengis.gml.x32.MultiSolidType multiSolid)
    {
        generatedSetterHelperImpl(multiSolid, MULTISOLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiSolid" element
     */
    public net.opengis.gml.x32.MultiSolidType addNewMultiSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiSolidType target = null;
            target = (net.opengis.gml.x32.MultiSolidType)get_store().add_element_user(MULTISOLID$0);
            return target;
        }
    }
}
