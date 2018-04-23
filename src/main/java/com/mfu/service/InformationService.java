package com.mfu.service;

import java.util.List;

import com.mfu.entity.Information;

public interface InformationService {
	public void insert(Information information);

	public Information findInformationById(long informationId);

	public void update(Information information);

	public void delete(long informationId);

	public List<Information> getAllinformation();
}
