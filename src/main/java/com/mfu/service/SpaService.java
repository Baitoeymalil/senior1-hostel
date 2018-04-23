package com.mfu.service;

import java.util.List;

import com.mfu.entity.Spa;

public interface SpaService {

	public void insert(Spa spa);

	public Spa findSpaId(long spaId);

	public void update(Spa spa);

	public void delete(long spaId);

	public List<Spa> getAllSpa();

	public List<Spa> findSpaNameame(String spaName);
}
