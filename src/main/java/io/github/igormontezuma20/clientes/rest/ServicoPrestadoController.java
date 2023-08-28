package io.github.igormontezuma20.clientes.rest;

import io.github.igormontezuma20.clientes.model.entity.Cliente;
import io.github.igormontezuma20.clientes.model.entity.ServicoPrestado;
import io.github.igormontezuma20.clientes.model.repository.ClienteRepository;
import io.github.igormontezuma20.clientes.model.repository.ServicoPrestadoRepository;
import io.github.igormontezuma20.clientes.rest.dto.ServicoPrestadoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@RestController
@RequestMapping("/api/servicos-prestados")
@RequiredArgsConstructor
public class ServicoPrestadoController {

    private final ClienteRepository clienteRepository;
    private final ServicoPrestadoRepository servicoPrestadoRepository;

    @PostMapping
    public ServicoPrestado createService(@RequestBody ServicoPrestadoDTO dto){

        LocalDate serviceDate = LocalDate.parse(dto.getData(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Integer clientId = Integer.parseInt(dto.getIdCliente());

        Cliente cliente = clienteRepository
                .findById(clientId)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cliente Inexistente.")
                );

        ServicoPrestado servicoPrestado = new ServicoPrestado();
        servicoPrestado.setDescricao(dto.getDescricao());
        servicoPrestado.setValor(dto.getPreco());
        servicoPrestado.setData(serviceDate);
        servicoPrestado.setCliente(cliente);

    }
}