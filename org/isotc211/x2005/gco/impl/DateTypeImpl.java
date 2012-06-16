/*
 * XML Type:  Date_Type
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.DateType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML Date_Type(@http://www.isotc211.org/2005/gco).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlGYear
 */
public class DateTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.isotc211.x2005.gco.DateType, org.apache.xmlbeans.XmlDate, org.apache.xmlbeans.XmlGYearMonth, org.apache.xmlbeans.XmlGYear
{
    private static final long serialVersionUID = 1L;
    
    public DateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected DateTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
