package com.example.demo.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.concretes.jobposition;
import com.example.demo.business.abstracts.JobPositionService;
import com.example.demo.dataAccess.abstracts.jobPositonDao;

@Service
public class jobPositionManager implements JobPositionService{
    private jobPositonDao jobpositiondao;
    @Autowired
	public jobPositionManager(jobPositonDao jobpositiondao) {
		super();
		this.jobpositiondao = jobpositiondao;
	}
	@Override
	public List<jobposition> getAll() {
		return this.jobpositiondao.findAll();
	}
	

}
