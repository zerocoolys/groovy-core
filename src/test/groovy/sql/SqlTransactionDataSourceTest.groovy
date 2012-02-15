/*
 * Copyright 2003-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package groovy.sql

import javax.sql.DataSource

import static groovy.sql.SqlTestConstants.DB_DATASOURCE
import static groovy.sql.SqlTestConstants.DB_URL_PREFIX

/**
 * Test Sql transaction features using a Sql built from a DataSource
 *
 * @author Paul King
 */
class SqlTransactionDataSourceTest extends SqlTransactionTestCase {
    protected Sql setUpSql() {
        DataSource ds = DB_DATASOURCE.newInstance(
                database: DB_URL_PREFIX + getMethodName(),
                user: 'sa',
                password: '')
        return new Sql(ds)
    }
}