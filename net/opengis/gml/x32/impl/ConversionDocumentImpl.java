/*
 * An XML document type.
 * Localname: conversion
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConversionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one conversion(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ConversionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ConversionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "conversion");
    private static final org.apache.xmlbeans.QNameSet CONVERSION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "definedByConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "conversion"),
    });
    
    
    /**
     * Gets the "conversion" element
     */
    public net.opengis.gml.x32.GeneralConversionPropertyType getConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeneralConversionPropertyType target = null;
            target = (net.opengis.gml.x32.GeneralConversionPropertyType)get_store().find_element_user(CONVERSION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversion" element
     */
    public void setConversion(net.opengis.gml.x32.GeneralConversionPropertyType conversion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeneralConversionPropertyType target = null;
            target = (net.opengis.gml.x32.GeneralConversionPropertyType)get_store().find_element_user(CONVERSION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.GeneralConversionPropertyType)get_store().add_element_user(CONVERSION$0);
            }
            target.set(conversion);
        }
    }
    
    /**
     * Appends and returns a new empty "conversion" element
     */
    public net.opengis.gml.x32.GeneralConversionPropertyType addNewConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeneralConversionPropertyType target = null;
            target = (net.opengis.gml.x32.GeneralConversionPropertyType)get_store().add_element_user(CONVERSION$0);
            return target;
        }
    }
}
