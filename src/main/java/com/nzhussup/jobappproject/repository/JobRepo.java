package com.nzhussup.jobappproject.repository;

import com.nzhussup.jobappproject.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class JobRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void save(Job job) {

        System.out.println("Job details: " + job);
        String sqlSave = "INSERT INTO jobs (name, country, city, requirements) VALUES (?, ?, ?, ?)";

        int rows = jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sqlSave);
            ps.setString(1, job.getName());
            ps.setString(2, job.getCountry());
            ps.setString(3, job.getCity());
            ps.setString(4, job.getRequirements());
            return ps;
        });

        System.out.println(rows + " rows affected");
    }

    public List<Job> findAll() {
        String sqlFindAll = "SELECT * FROM jobs";


        return jdbcTemplate.query(sqlFindAll, (rs, rowNum) -> {
            return new Job(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("country"),
                    rs.getString("city"),
                    rs.getString("requirements")
            );
        });
    }


    public Job findById(int id) {
        String sqlFindById = "SELECT * FROM jobs WHERE id = ?";

        return jdbcTemplate.queryForObject(sqlFindById, new Object[]{id}, (rs, rowNum) -> {
            return new Job(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("country"),
                    rs.getString("city"),
                    rs.getString("requirements")
            );
        });
    }

    public void delete(Job job) {
        String sqlSave = "DELETE FROM jobs WHERE id = ?";

        int rows = jdbcTemplate.update(sqlSave,
                job.getId());
        System.out.println(rows + " rows affected");
    }
}
