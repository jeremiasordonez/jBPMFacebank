package com.facebank.clients;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class NameData implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(generator = "NAMEDATA_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(sequenceName = "NAMEDATA_ID_SEQ", name = "NAMEDATA_ID_GENERATOR")
    private java.lang.Long id;

    public NameData() {
    }
    
    public NameData(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}