package example;

import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;

import static org.jooq.impl.DSL.*;
import static org.jooq.Records.mapping;

import java.sql.*;

public class IssueTest {

    @Test
    void dateTimeFormatExceptionTest() throws Exception {
        try (Connection conn = DriverManager.getConnection("jdbc:tc:postgresql:14.1:///")) {
            var dsl = DSL.using(conn, SQLDialect.POSTGRES);
            var query = dsl.select(
                    row(currentLocalDateTime()).mapping(InnerTestObject::new)
            );

            var result = query.fetchOne(mapping(OuterTestObject::new));

        }
    }
}
