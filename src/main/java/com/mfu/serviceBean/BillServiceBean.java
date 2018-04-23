package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Bill;
import com.mfu.service.BillService;

@Stateless
@Remote(BillService.class)
public class BillServiceBean implements BillService{
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(Bill bill) {
		this.em.persist(bill);
	}

	public Bill findbillById(long billId) {
		return this.em.find(Bill.class, billId);
	}

	public void update(Bill bill) {
		this.em.merge(bill);

	}

	public void delete(long billId) {
		Bill bill = findbillById(billId);
		if (bill != null) {
			em.remove(bill);
		}
	}

	public List<Bill> getAllbill() {
		return em.createQuery("SELECT x FROM Bill x").getResultList();
	}

	// public List<Bill> findbillBybillType(String billType) {
	// return em.createQuery("SELECT em FROM bill em WHERE em.billType LIKE :fn
	// ").setParameter("fn", billType + "%")
	// .getResultList();
	// }

}
