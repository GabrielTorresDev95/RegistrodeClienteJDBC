package io.github;

import io.github.domain.entity.Cliente;
import io.github.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.swing.*;
import javax.transaction.Transactional;
import java.util.List;

@SpringBootApplication
@Transactional
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
        return args -> {
            clientes.salvar(new Cliente("Primeiro Cliente"));
            clientes.salvar(new Cliente("Segundo Cliente"));

           List<Cliente> todososCliente =  clientes.ObtertodososClientes();
            todososCliente.forEach(System.out::println);
        };

    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }
}

    /*
    utilizar a aba application com os comandos para abrir o banco de dados em memoria
     */



