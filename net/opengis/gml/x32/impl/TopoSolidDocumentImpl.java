/*
 * An XML document type.
 * Localname: TopoSolid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoSolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TopoSolid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoSolidDocumentImpl extends net.opengis.gml.x32.impl.AbstractTopoPrimitiveDocumentImpl implements net.opengis.gml.x32.TopoSolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoSolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOSOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoSolid");
    
    
    /**
     * Gets the "TopoSolid" element
     */
    public net.opengis.gml.x32.TopoSolidType getTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoSolidType target = null;
            target = (net.opengis.gml.x32.TopoSolidType)get_store().find_element_user(TOPOSOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoSolid" element
     */
    public void setTopoSolid(net.opengis.gml.x32.TopoSolidType topoSolid)
    {
        generatedSetterHelperImpl(topoSolid, TOPOSOLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoSolid" element
     */
    public net.opengis.gml.x32.TopoSolidType addNewTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoSolidType target = null;
            target = (net.opengis.gml.x32.TopoSolidType)get_store().add_element_user(TOPOSOLID$0);
            return target;
        }
    }
}
