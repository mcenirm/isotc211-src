/*
 * An XML document type.
 * Localname: AbstractTopoPrimitive
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractTopoPrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractTopoPrimitive(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractTopoPrimitiveDocumentImpl extends net.opengis.gml.x32.impl.AbstractTopologyDocumentImpl implements net.opengis.gml.x32.AbstractTopoPrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTopoPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTTOPOPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopoPrimitive");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTOPOPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Node"),
    });
    
    
    /**
     * Gets the "AbstractTopoPrimitive" element
     */
    public net.opengis.gml.x32.AbstractTopoPrimitiveType getAbstractTopoPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTopoPrimitiveType)get_store().find_element_user(ABSTRACTTOPOPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractTopoPrimitive" element
     */
    public void setAbstractTopoPrimitive(net.opengis.gml.x32.AbstractTopoPrimitiveType abstractTopoPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTopoPrimitiveType)get_store().find_element_user(ABSTRACTTOPOPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractTopoPrimitiveType)get_store().add_element_user(ABSTRACTTOPOPRIMITIVE$0);
            }
            target.set(abstractTopoPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractTopoPrimitive" element
     */
    public net.opengis.gml.x32.AbstractTopoPrimitiveType addNewAbstractTopoPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractTopoPrimitiveType)get_store().add_element_user(ABSTRACTTOPOPRIMITIVE$0);
            return target;
        }
    }
}
