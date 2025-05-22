package com.junit_testing.serviceImpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit_testing.exception.CalculationsException;
import com.junit_testing.service.CalculationsService;

@Service
public class CalculationsServiceImpl implements CalculationsService {
	
	@Override
	public int getAdditionOfTwoNumbers(Integer val1, Integer val2) {
		try {
			Objects.requireNonNull(val1, "First value is required");
			Objects.requireNonNull(val2, "Second value is required");
			return val1 + val2;
		} catch (Exception e) {
			e.printStackTrace();
			throw new CalculationsException(e.getMessage());
		}
	}

}
