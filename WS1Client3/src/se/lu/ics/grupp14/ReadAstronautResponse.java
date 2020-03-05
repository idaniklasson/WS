/**
 * ReadAstronautResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics.grupp14;

public class ReadAstronautResponse  implements java.io.Serializable {
    private se.lu.ics.grupp14.Astronaut[] readAstronautResult;

    public ReadAstronautResponse() {
    }

    public ReadAstronautResponse(
           se.lu.ics.grupp14.Astronaut[] readAstronautResult) {
           this.readAstronautResult = readAstronautResult;
    }


    /**
     * Gets the readAstronautResult value for this ReadAstronautResponse.
     * 
     * @return readAstronautResult
     */
    public se.lu.ics.grupp14.Astronaut[] getReadAstronautResult() {
        return readAstronautResult;
    }


    /**
     * Sets the readAstronautResult value for this ReadAstronautResponse.
     * 
     * @param readAstronautResult
     */
    public void setReadAstronautResult(se.lu.ics.grupp14.Astronaut[] readAstronautResult) {
        this.readAstronautResult = readAstronautResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadAstronautResponse)) return false;
        ReadAstronautResponse other = (ReadAstronautResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readAstronautResult==null && other.getReadAstronautResult()==null) || 
             (this.readAstronautResult!=null &&
              java.util.Arrays.equals(this.readAstronautResult, other.getReadAstronautResult())));
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
        if (getReadAstronautResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadAstronautResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadAstronautResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadAstronautResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", ">ReadAstronautResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAstronautResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "ReadAstronautResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "Astronaut"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "Astronaut"));
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
