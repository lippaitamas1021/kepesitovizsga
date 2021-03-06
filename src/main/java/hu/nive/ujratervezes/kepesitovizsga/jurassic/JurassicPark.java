package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;

public class JurassicPark {
    
    private JdbcTemplate jdbcTemplate;

    public JurassicPark(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> checkOverpopulation() {
        return jdbcTemplate.query("SELECT breed FROM dinosaur WHERE expected < actual ORDER BY breed", (resultSet, i) -> resultSet.getString("breed"));
    }
}
