/* SpagoBI, the Open Source Business Intelligence suite

 * Copyright (C) 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0, without the "Incompatible With Secondary Licenses" notice. 
 * If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package it.eng.spagobi.writeback4j.sql.dbdescriptor;

import it.eng.spagobi.tools.datasource.bo.IDataSource;

import java.util.Set;

public interface IDbSchemaDescriptor {

	public Set<String> getColumnNames(String table, IDataSource dataSource);

}
