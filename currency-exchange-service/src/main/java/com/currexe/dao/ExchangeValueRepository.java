package com.currexe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currexe.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>
{
	ExchangeValue findByFromAndTo(String from, String to);
}