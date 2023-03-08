package com.example.asserplus23.daoService;

import com.example.asserplus23.model.Clients;
import com.example.asserplus23.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientsDao {
    @Autowired
    ClientsRepository clientsRepository;

    public List<Clients> getClients(){
        return clientsRepository.findAll();
    }
    public Clients getClient(Long id){
        return clientsRepository.findById(id).get();
    }
    public Clients getClientByLogId(Long logId){return clientsRepository.findClientsByLogid(logId);}
    public Clients getClientByUserNumber(String userNumber){return clientsRepository.findClientsByUsernumber(userNumber);}
    public Clients getClientByPersonId(Long personId){return clientsRepository.findClientsByPersonid(personId);}
    public void addClient(Clients newEntry){
        clientsRepository.save(newEntry);
    }
    public void updateClients( Clients update ,Long id){}
    public void deleteClients(Long id){}
}
