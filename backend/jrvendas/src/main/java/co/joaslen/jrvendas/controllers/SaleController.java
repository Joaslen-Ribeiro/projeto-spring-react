package co.joaslen.jrvendas.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.joaslen.jrvendas.dto.SaleDTO;
import co.joaslen.jrvendas.services.SaleService;


@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable page) {
		Page<SaleDTO> list = service.findAll(page);
		return ResponseEntity.ok(list);
	}

}
