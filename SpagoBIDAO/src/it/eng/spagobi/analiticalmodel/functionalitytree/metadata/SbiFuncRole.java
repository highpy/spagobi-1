/* SpagoBI, the Open Source Business Intelligence suite

 * Copyright (C) 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0, without the "Incompatible With Secondary Licenses" notice. 
 * If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package it.eng.spagobi.analiticalmodel.functionalitytree.metadata;

import it.eng.spagobi.commons.metadata.SbiHibernateModel;


/**
 * SbiFuncRole generated by hbm2java
 */
public class SbiFuncRole  extends SbiHibernateModel {

    // Fields    

     private SbiFuncRoleId id;
     private String stateCd;


    // Constructors

    /**
     * default constructor.
     */
    public SbiFuncRole() {
    }
    
    /**
     * constructor with id.
     * 
     * @param id the id
     */
    public SbiFuncRole(SbiFuncRoleId id) {
        this.id = id;
    }
   
    
    

    // Property accessors

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public SbiFuncRoleId getId() {
        return this.id;
    }
    
    /**
     * Sets the id.
     * 
     * @param id the new id
     */
    public void setId(SbiFuncRoleId id) {
        this.id = id;
    }

    /**
     * Gets the state cd.
     * 
     * @return the state cd
     */
    public String getStateCd() {
        return this.stateCd;
    }
    
    /**
     * Sets the state cd.
     * 
     * @param stateCd the new state cd
     */
    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }



}