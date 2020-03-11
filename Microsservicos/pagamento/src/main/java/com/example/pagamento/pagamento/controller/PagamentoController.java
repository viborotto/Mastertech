package com.example.pagamento.pagamento.controller;

import com.example.pagamento.pagamento.model.Pagamento;
import com.example.pagamento.pagamento.model.PagamentoMapper;
import com.example.pagamento.pagamento.model.dto.request.CreatePagamentoRequest;
import com.example.pagamento.pagamento.model.dto.response.PagamentoCreatedResponse;
import com.example.pagamento.pagamento.model.dto.response.PagamentoSummaryInListResponse;
import com.example.pagamento.pagamento.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @Autowired
    private PagamentoMapper pagamentoMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoCreatedResponse create(@Valid @RequestBody CreatePagamentoRequest createPagamentoRequest){
        Pagamento pagamento = pagamentoMapper.toPagamento(createPagamentoRequest);

        pagamento = pagamentoService.create(pagamento);

        return pagamentoMapper.toPagamentoCreatedResponse(pagamento);
    }

    @GetMapping("/{id}")
    public List<PagamentoSummaryInListResponse> listByCartaoId(@PathVariable Long id) {
        List<Pagamento> pagamentos = pagamentoService.listPagamentoByCartaoId(id);
        List<PagamentoSummaryInListResponse> pagamentoSummaryInListResponseList = pagamentos.stream()
                .map(pagamento -> pagamentoMapper.toPagamentoSummaryInListResponse(pagamento))
                .collect(Collectors.toList());
        return pagamentoSummaryInListResponseList;
    }

}
