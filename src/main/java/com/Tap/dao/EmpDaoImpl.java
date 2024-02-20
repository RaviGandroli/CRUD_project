package com.Tap.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Tap.Entity.Emp;

@Repository
@Transactional
public class EmpDaoImpl implements EmpDao{

	@Autowired
	private HibernateTemplate hbernatetemplet;
	
	
	@Override
	@Transactional
	public int saveEmp(Emp emp) {
    
		int i=(Integer)hbernatetemplet.save(emp);
		return i;
	}

	@Override
	public Emp getEmpById(int id) {
		Emp emp=hbernatetemplet.get(Emp.class, id);
		return emp;
	}

	@Override
	public List<Emp> getAllEmp() {

		List<Emp> list=hbernatetemplet.loadAll(Emp.class);
		return list;
	}

	@Override
	@Transactional
	public void update(Emp emp) {
		hbernatetemplet.update(emp);
	}

	@Override
	@Transactional
	public void deleteEmp(int id) {
		Emp emp=hbernatetemplet.get(Emp.class, id);
		hbernatetemplet.delete(emp);
	}

}
