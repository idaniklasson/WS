/**
 * Astronaut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics.grupp14;

public class Astronaut  implements java.io.Serializable {
    private java.lang.String name;

    private int astronautID;

    private java.lang.String rank;

    private se.lu.ics.grupp14.Spaceship spaceShip;

    public Astronaut() {
    }

    public Astronaut(
           java.lang.String name,
           int astronautID,
           java.lang.String rank,
           se.lu.ics.grupp14.Spaceship spaceShip) {
           this.name = name;
           this.astronautID = astronautID;
           this.rank = rank;
           this.spaceShip = spaceShip;
    }


    /**
     * Gets the name value for this Astronaut.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Astronaut.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the astronautID value for this Astronaut.
     * 
     * @return astronautID
     */
    public int getAstronautID() {
        return astronautID;
    }


    /**
     * Sets the astronautID value for this Astronaut.
     * 
     * @param astronautID
     */
    public void setAstronautID(int astronautID) {
        this.astronautID = astronautID;
    }


    /**
     * Gets the rank value for this Astronaut.
     * 
     * @return rank
     */
    public java.lang.String getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this Astronaut.
     * 
     * @param rank
     */
    public void setRank(java.lang.String rank) {
        this.rank = rank;
    }


    /**
     * Gets the spaceShip value for this Astronaut.
     * 
     * @return spaceShip
     */
    public se.lu.ics.grupp14.Spaceship getSpaceShip() {
        return spaceShip;
    }


    /**
     * Sets the spaceShip value for this Astronaut.
     * 
     * @param spaceShip
     */
    public void setSpaceShip(se.lu.ics.grupp14.Spaceship spaceShip) {
        this.spaceShip = spaceShip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Astronaut)) return false;
        Astronaut other = (Astronaut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.astronautID == other.getAstronautID() &&
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank()))) &&
            ((this.spaceShip==null && other.getSpaceShip()==null) || 
             (this.spaceShip!=null &&
              this.spaceShip.equals(other.getSpaceShip())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getAstronautID();
        if (getRank() != null) {
            _hashCode += getRank().hashCode();
        }
        if (getSpaceShip() != null) {
            _hashCode += getSpaceShip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Astronaut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "Astronaut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("astronautID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "AstronautID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "Rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceShip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "SpaceShip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "Spaceship"));
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
