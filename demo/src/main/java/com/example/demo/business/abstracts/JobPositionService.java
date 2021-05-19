package com.example.demo.business.abstracts;
import java.util.List;

import com.example.demo.Entities.concretes.jobposition;

public interface JobPositionService {
  List<jobposition> getAll();
}
