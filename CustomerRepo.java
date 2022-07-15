package com.SpringbootCouchbase.Repository;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.SpringbootCouchbase.Model.Customer;

@SuppressWarnings("deprecation")
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "Customer", viewName = "All")
@Repository
public interface CustomerRepo extends CouchbaseRepository<Customer, Integer> {

}
