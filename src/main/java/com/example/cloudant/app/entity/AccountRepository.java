package com.example.cloudant.app.entity;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.GenerateView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountRepository extends CouchDbRepositorySupport<Account>{

	@Autowired
	  public AccountRepository(CouchDbConnector connector) {
	    super(Account.class, connector);
	    initStandardDesignDocument();
	  }
	}
