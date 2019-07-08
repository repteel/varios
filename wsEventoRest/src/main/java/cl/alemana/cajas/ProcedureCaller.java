package cl.alemana.cajas;

import java.io.IOException;
import java.io.Writer;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.sql.CLOB;


/**
 * Methods common to all procedure callers.
 *
 * @author Alan Ociel Rodriguez Marianjel (ClÃ­nica Alemana de Santiago)
 */
public abstract class ProcedureCaller
{
    /**
     * Same as {@code oracle.jdbc.OracleTypes.CURSOR}.
     */
    protected static final int ORACLE_CURSOR = -10;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code ProcedureCaller} instance.
     */
    public ProcedureCaller()
    {
    }

    //--------------------------------------------------------------------------
    //-- ProcedureCaller Methods -----------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the JDBC URL of the supplied connection.
     *
     * @param  conn the connection to the database.
     * @return the JDBC URL of the supplied connection.
     * @throws NullPointerException if conn is null.
     * @throws SQLException if an SQL error occurs.
     */
    protected String getJdbcURL(final Connection conn)
        throws SQLException
    {
        final String url = conn.getMetaData().getURL();
        return (url == null || url.length() == 0) ? "jdbc:unknown:" : url;
    }

    /**
     * Constructs a CallableStatement using a connection and statement.
     *
     * @param  conn the connection to the database.
     * @param  sql the statement to send to the database.
     * @return a new CallableStatement instance.
     * @throws NullPointerException if conn or sql are null.
     * @throws SQLException if an SQL error occurs.
     */
    protected CallableStatement prepareCall(final Connection conn, final String sql)
        throws SQLException
    {
        return conn.prepareCall(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
    }

    /**
     * Converts a string to a Clob.
     *
     * @param  str the string to be converted (can be null).
     * @param  conn the connection to the database.
     * @return a new Clob instance or null.
     * @throws SQLException if an SQL error occurs.
     */
    protected Clob stringToClob(final String str, final Connection conn)
        throws SQLException
    {
        if (str == null) return null;
        final Clob clob = CLOB.createTemporary(conn, false, CLOB.DURATION_SESSION);
        try {
            final Writer writer = clob.setCharacterStream(1);
            try {
                writer.write(str);
            } finally {
                writer.close();
            }
        } catch (final IOException ex) {
            throw new SQLException(ex);
        }
        return clob;
    }
    
    protected Clob objToClob(final Object obj, final Connection conn)
            throws SQLException
        {
            if (obj == null) return null;
            final Clob clob = CLOB.createTemporary(conn, false, CLOB.DURATION_SESSION);
            try {
                final Writer writer = clob.setCharacterStream(1);
                try {
                    writer.write(obj.toString());
                } finally {
                    writer.close();
                }
            } catch (final IOException ex) {
                throw new SQLException(ex);
            }
            return clob;
        }
    
}
