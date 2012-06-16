/*
 * An XML document type.
 * Localname: directedTopoSolid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DirectedTopoSolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one directedTopoSolid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DirectedTopoSolidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DirectedTopoSolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedTopoSolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDTOPOSOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedTopoSolid");
    
    
    /**
     * Gets the "directedTopoSolid" element
     */
    public net.opengis.gml.x32.DirectedTopoSolidPropertyType getDirectedTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.DirectedTopoSolidPropertyType)get_store().find_element_user(DIRECTEDTOPOSOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "directedTopoSolid" element
     */
    public void setDirectedTopoSolid(net.opengis.gml.x32.DirectedTopoSolidPropertyType directedTopoSolid)
    {
        generatedSetterHelperImpl(directedTopoSolid, DIRECTEDTOPOSOLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "directedTopoSolid" element
     */
    public net.opengis.gml.x32.DirectedTopoSolidPropertyType addNewDirectedTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.DirectedTopoSolidPropertyType)get_store().add_element_user(DIRECTEDTOPOSOLID$0);
            return target;
        }
    }
}
