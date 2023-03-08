package com.example.asserplus23.repository;

import com.example.asserplus23.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clients,Long> {
    public Clients findClientsByLogid(Long logId);
    public Clients findClientsByUsernumber(String userNumber);
    public Clients findClientsByPersonid(Long personsId);
}
