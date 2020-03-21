package com.felixlaura.facturacion.dao;

import com.felixlaura.facturacion.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

    // void save(Cliente cliente);
}
