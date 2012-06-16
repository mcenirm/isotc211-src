/*
 * An XML document type.
 * Localname: gmlProfileSchema
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GmlProfileSchemaDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one gmlProfileSchema(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GmlProfileSchemaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GmlProfileSchemaDocument
{
    private static final long serialVersionUID = 1L;
    
    public GmlProfileSchemaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GMLPROFILESCHEMA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "gmlProfileSchema");
    
    
    /**
     * Gets the "gmlProfileSchema" element
     */
    public java.lang.String getGmlProfileSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GMLPROFILESCHEMA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gmlProfileSchema" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetGmlProfileSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(GMLPROFILESCHEMA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "gmlProfileSchema" element
     */
    public void setGmlProfileSchema(java.lang.String gmlProfileSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GMLPROFILESCHEMA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GMLPROFILESCHEMA$0);
            }
            target.setStringValue(gmlProfileSchema);
        }
    }
    
    /**
     * Sets (as xml) the "gmlProfileSchema" element
     */
    public void xsetGmlProfileSchema(org.apache.xmlbeans.XmlAnyURI gmlProfileSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(GMLPROFILESCHEMA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(GMLPROFILESCHEMA$0);
            }
            target.set(gmlProfileSchema);
        }
    }
}
