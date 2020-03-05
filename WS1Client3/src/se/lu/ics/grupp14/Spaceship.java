/**
 * Spaceship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics.grupp14;

public class Spaceship  implements java.io.Serializable {
    private int regNbr;

    private java.lang.String homeStation;

    public Spaceship() {
    }

    public Spaceship(
           int regNbr,
           java.lang.String homeStation) {
           this.regNbr = regNbr;
           this.homeStation = homeStation;
    }


    /**
     * Gets the regNbr value for this Spaceship.
     * 
     * @return regNbr
     */
    public int getRegNbr() {
        return regNbr;
    }


    /**
     * Sets the regNbr value for this Spaceship.
     * 
     * @param regNbr
     */
    public void setRegNbr(int regNbr) {
        this.regNbr = regNbr;
    }


    /**
     * Gets the homeStation value for this Spaceship.
     * 
     * @return homeStation
     */
    public java.lang.String getHomeStation() {
        return homeStation;
    }


    /**
     * Sets the homeStation value for this Spaceship.
     * 
     * @param homeStation
     */
    public void setHomeStation(java.lang.String homeStation) {
        this.homeStation = homeStation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Spaceship)) return false;
        Spaceship other = (Spaceship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.regNbr == other.getRegNbr() &&
            ((this.homeStation==null && other.getHomeStation()==null) || 
             (this.homeStation!=null &&
              this.homeStation.equals(other.getHomeStation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getRegNbr();
        if (getHomeStation() != null) {
            _hashCode += getHomeStation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Spaceship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "Spaceship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "RegNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeStation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "HomeStation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
