package com.milano.sondaggio.service;

import java.util.List;
import java.util.Optional;

import com.milano.sondaggio.model.Sondaggio;

public interface SondaggioService {

	void saveSondaggio(Sondaggio sondaggio);

	List<Sondaggio> getAll();

	Optional<Sondaggio> findById(long id);

	void deleteSondaggio(long id);

	long count();

	void updateSondaggio(Sondaggio sondaggio);
	
	List<Sondaggio> ricercaSondaggiByQuery(String query);
}
