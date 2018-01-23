/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.jooq.Configuration;
import org.jooq.tools.jdbc.DefaultConnection;

/**
 * @author Lukas Eder
 */
final class DiagnosticsConnection extends DefaultConnection {

    final Configuration       configuration;
    final DiagnosticsListeners listeners;

    DiagnosticsConnection(Configuration configuration) {
        super(configuration.connectionProvider().acquire());

        this.configuration = configuration;
        this.listeners = DiagnosticsListeners.get(configuration);
    }

    @Override
    public final Statement createStatement() throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().createStatement());
    }

    @Override
    public final Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().createStatement(resultSetType, resultSetConcurrency));
    }

    @Override
    public final Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().createStatement(resultSetType, resultSetConcurrency, resultSetHoldability));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(sql));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(sql, resultSetType, resultSetConcurrency));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(sql, autoGeneratedKeys));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(sql, columnIndexes));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(sql, columnNames));
    }

    @Override
    public final CallableStatement prepareCall(String sql) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareCall(sql));
    }

    @Override
    public final CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareCall(sql, resultSetType, resultSetConcurrency));
    }

    @Override
    public final CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability));
    }

    @Override
    public final void close() throws SQLException {
        configuration.connectionProvider().release(getDelegate());
    }
}
