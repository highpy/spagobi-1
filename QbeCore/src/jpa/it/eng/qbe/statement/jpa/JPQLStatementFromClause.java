/* SpagoBI, the Open Source Business Intelligence suite

 * Copyright (C) 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0, without the "Incompatible With Secondary Licenses" notice. 
 * If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package it.eng.qbe.statement.jpa;

import it.eng.qbe.query.Query;
import it.eng.qbe.statement.sql.AbstractStatementFromClause;

import java.util.Map;

import org.apache.log4j.Logger;

/**
 * @author Andrea Gioia (andrea.gioia@eng.it)
 *
 */
public class JPQLStatementFromClause extends AbstractStatementFromClause {

	
	public static transient Logger logger = Logger.getLogger(JPQLStatementFromClause.class);
	
	public static String build(JPQLStatement parentStatement, Query query, Map<String, Map<String, String>> entityAliasesMaps){
		JPQLStatementFromClause clause = new JPQLStatementFromClause(parentStatement);
		return clause.buildClause(query, entityAliasesMaps);
	}
	
	protected JPQLStatementFromClause(JPQLStatement statement) {
		parentStatement = statement;
	}



}
