/*
 * An XML document type.
 * Localname: AbstractTopology
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractTopologyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractTopology(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractTopologyDocumentImpl extends net.opengis.gml.x32.impl.AbstractGMLDocumentImpl implements net.opengis.gml.x32.AbstractTopologyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTopologyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTTOPOLOGY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopology");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTTOPOLOGY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopology"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Node"),
    });
    
    
    /**
     * Gets the "AbstractTopology" element
     */
    public net.opengis.gml.x32.AbstractTopologyType getAbstractTopology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTopologyType target = null;
            target = (net.opengis.gml.x32.AbstractTopologyType)get_store().find_element_user(ABSTRACTTOPOLOGY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractTopology" element
     */
    public void setAbstractTopology(net.opengis.gml.x32.AbstractTopologyType abstractTopology)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTopologyType target = null;
            target = (net.opengis.gml.x32.AbstractTopologyType)get_store().find_element_user(ABSTRACTTOPOLOGY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractTopologyType)get_store().add_element_user(ABSTRACTTOPOLOGY$0);
            }
            target.set(abstractTopology);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractTopology" element
     */
    public net.opengis.gml.x32.AbstractTopologyType addNewAbstractTopology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractTopologyType target = null;
            target = (net.opengis.gml.x32.AbstractTopologyType)get_store().add_element_user(ABSTRACTTOPOLOGY$0);
            return target;
        }
    }
}
