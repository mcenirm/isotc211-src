/*
 * An XML document type.
 * Localname: Quantity
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.QuantityDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Quantity(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class QuantityDocumentImpl extends net.opengis.gml.x32.impl.AbstractScalarValueDocumentImpl implements net.opengis.gml.x32.QuantityDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuantityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Quantity");
    
    
    /**
     * Gets the "Quantity" element
     */
    public net.opengis.gml.x32.QuantityDocument.Quantity getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.QuantityDocument.Quantity target = null;
            target = (net.opengis.gml.x32.QuantityDocument.Quantity)get_store().find_element_user(QUANTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Quantity" element
     */
    public boolean isNilQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.QuantityDocument.Quantity target = null;
            target = (net.opengis.gml.x32.QuantityDocument.Quantity)get_store().find_element_user(QUANTITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Quantity" element
     */
    public void setQuantity(net.opengis.gml.x32.QuantityDocument.Quantity quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Quantity" element
     */
    public net.opengis.gml.x32.QuantityDocument.Quantity addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.QuantityDocument.Quantity target = null;
            target = (net.opengis.gml.x32.QuantityDocument.Quantity)get_store().add_element_user(QUANTITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "Quantity" element
     */
    public void setNilQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.QuantityDocument.Quantity target = null;
            target = (net.opengis.gml.x32.QuantityDocument.Quantity)get_store().find_element_user(QUANTITY$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.QuantityDocument.Quantity)get_store().add_element_user(QUANTITY$0);
            }
            target.setNil();
        }
    }
    /**
     * An XML Quantity(@http://www.opengis.net/gml/3.2).
     *
     * This is an atomic type that is a restriction of net.opengis.gml.x32.QuantityDocument$Quantity.
     */
    public static class QuantityImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements net.opengis.gml.x32.QuantityDocument.Quantity
    {
        private static final long serialVersionUID = 1L;
        
        public QuantityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected QuantityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName UOM$0 = 
            new javax.xml.namespace.QName("", "uom");
        private static final javax.xml.namespace.QName NILREASON$2 = 
            new javax.xml.namespace.QName("", "nilReason");
        
        
        /**
         * Gets the "uom" attribute
         */
        public java.lang.String getUom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "uom" attribute
         */
        public net.opengis.gml.x32.UomIdentifier xgetUom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.UomIdentifier target = null;
                target = (net.opengis.gml.x32.UomIdentifier)get_store().find_attribute_user(UOM$0);
                return target;
            }
        }
        
        /**
         * Sets the "uom" attribute
         */
        public void setUom(java.lang.String uom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOM$0);
                }
                target.setStringValue(uom);
            }
        }
        
        /**
         * Sets (as xml) the "uom" attribute
         */
        public void xsetUom(net.opengis.gml.x32.UomIdentifier uom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.UomIdentifier target = null;
                target = (net.opengis.gml.x32.UomIdentifier)get_store().find_attribute_user(UOM$0);
                if (target == null)
                {
                    target = (net.opengis.gml.x32.UomIdentifier)get_store().add_attribute_user(UOM$0);
                }
                target.set(uom);
            }
        }
        
        /**
         * Gets the "nilReason" attribute
         */
        public java.lang.Object getNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
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
                target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
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
                return get_store().find_attribute_user(NILREASON$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NILREASON$2);
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
                target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
                if (target == null)
                {
                    target = (net.opengis.gml.x32.NilReasonType)get_store().add_attribute_user(NILREASON$2);
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
                get_store().remove_attribute(NILREASON$2);
            }
        }
    }
}
