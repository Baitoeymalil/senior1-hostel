package com.mfu.service;

import java.util.List;

import com.mfu.entity.Bill;

public interface BillService {
	public void insert(Bill bill);

	public Bill findbillById(long billId);

	public void update(Bill bill);

	public void delete(long billId);

	public List<Bill> getAllbill();
}
