/*
 * An XML document type.
 * Localname: Boolean
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BooleanDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Boolean(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class BooleanDocumentImpl extends net.opengis.gml.x32.impl.AbstractScalarValueDocumentImpl implements net.opengis.gml.x32.BooleanDocument
{
    private static final long serialVersionUID = 1L;
    
    public BooleanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Boolean");
    
    
    /**
     * Gets the "Boolean" element
     */
    public net.opengis.gml.x32.BooleanDocument.Boolean getBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BooleanDocument.Boolean target = null;
            target = (net.opengis.gml.x32.BooleanDocument.Boolean)get_store().find_element_user(BOOLEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Boolean" element
     */
    public boolean isNilBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BooleanDocument.Boolean target = null;
            target = (net.opengis.gml.x32.BooleanDocument.Boolean)get_store().find_element_user(BOOLEAN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Boolean" element
     */
    public void setBoolean(net.opengis.gml.x32.BooleanDocument.Boolean xboolean)
    {
        generatedSetterHelperImpl(xboolean, BOOLEAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Boolean" element
     */
    public net.opengis.gml.x32.BooleanDocument.Boolean addNewBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BooleanDocument.Boolean target = null;
            target = (net.opengis.gml.x32.BooleanDocument.Boolean)get_store().add_element_user(BOOLEAN$0);
            return target;
        }
    }
    
    /**
     * Nils the "Boolean" element
     */
    public void setNilBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BooleanDocument.Boolean target = null;
            target = (net.opengis.gml.x32.BooleanDocument.Boolean)get_store().find_element_user(BOOLEAN$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.BooleanDocument.Boolean)get_store().add_element_user(BOOLEAN$0);
            }
            target.setNil();
        }
    }
    /**
     * An XML Boolean(@http://www.opengis.net/gml/3.2).
     *
     * This is an atomic type that is a restriction of net.opengis.gml.x32.BooleanDocument$Boolean.
     */
    public static class BooleanImpl extends org.apache.xmlbeans.impl.values.JavaBooleanHolderEx implements net.opengis.gml.x32.BooleanDocument.Boolean
    {
        private static final long serialVersionUID = 1L;
        
        public BooleanImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected BooleanImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName NILREASON$0 = 
            new javax.xml.namespace.QName("", "nilReason");
        
        
        /**
         * Gets the "nilReason" attribute
         */
        public java.lang.Object getNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$0);
                if (target == null)
                {
                    return null;
                }
                return target.getObjectValue();
            }
        }
        
        /**
         * Gets (as xml) the "nilReason" attribute
         */
        public net.opengis.gml.x32.NilReasonType xgetNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.NilReasonType target = null;
                target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$0);
                return target;
            }
        }
        
        /**
         * True if has "nilReason" attribute
         */
        public boolean isSetNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NILREASON$0) != null;
            }
        }
        
        /**
         * Sets the "nilReason" attribute
         */
        public void setNilReason(java.lang.Object nilReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NILREASON$0);
                }
                target.setObjectValue(nilReason);
            }
        }
        
        /**
         * Sets (as xml) the "nilReason" attribute
         */
        public void xsetNilReason(net.opengis.gml.x32.NilReasonType nilReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.NilReasonType target = null;
                target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$0);
                if (target == null)
                {
                    target = (net.opengis.gml.x32.NilReasonType)get_store().add_attribute_user(NILREASON$0);
                }
                target.set(nilReason);
            }
        }
        
        /**
         * Unsets the "nilReason" attribute
         */
        public void unsetNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NILREASON$0);
            }
        }
    }
}
